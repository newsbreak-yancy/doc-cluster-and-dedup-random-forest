package com.nb.randomforest.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.BasicDBObject;
import com.mongodb.client.*;
import org.apache.commons.lang3.StringUtils;
import org.bson.Document;

import java.io.*;
import java.nio.file.Paths;
import java.util.*;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.in;

/**
 * @author yuxi
 * @date 2020/9/28
 */
public class FileUtils {
	
	public static MongoCollection<Document> collectionStatic;
	
	public static MongoCollection<Document> collectionCenter;
	
	public static BasicDBObject fields = new BasicDBObject();
	
	private static String rootDir = "/Users/yuxi/NB/RandomForest/_local";
	
	private static List<String> filePaths = new ArrayList<>();
	
	static {
		String uriStatic = "mongodb://172.24.25.74/staticFeature";
		MongoClient clientStatic = MongoClients.create(uriStatic);
		MongoDatabase dbStatic = clientStatic.getDatabase("staticFeature");
		collectionStatic = dbStatic.getCollection("document");
		
		String uriCenter = "mongodb://172.31.16.143/docenter";
		MongoClient clientCenter = MongoClients.create(uriCenter);
		MongoDatabase dbCenter = clientCenter.getDatabase("docenter");
		collectionCenter = dbCenter.getCollection("document");
		
		fields.append("_id", 1).append("stitle", 1).append("seg_title", 1).append("src", 1)
			.append("c_word", 1).append("epoch", 1).append("paragraph_count", 1)
			.append("simhash", 1).append("kws", 1).append("channels_v2", 1)
			.append("ne_content_organization", 1).append("ne_content_person", 1).append("ne_content_location", 1)
			.append("ne_title_location", 1).append("ne_title_organization", 1).append("ne_title_person", 1)
			.append("text_category", 1).append("geotag", 1)
			.append("text_category_v2", 1).append("geotag_v2", 1).append("url", 1);
		
		filePaths.add(Paths.get(rootDir, "estimate/tmp2").toAbsolutePath().toString());
	}
	
	
	/**
	 * 基于 doc pair 从 static_feature 或 doc_center 中抽取目标属性
	 * 已标注数据 : doc_id \t doc_id |t label => doc_id \t doc_id |t label \t isSuccess \t jstr \t jstr
	 * 未标注数据 : doc_id \t doc_id          => doc_id \t doc_id          |t isSuccess \t jstr \t jstr
	 */
	public static void extractDocFields(File docPair) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(docPair));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(docPair.getAbsolutePath() + "_fields")));
		String line = null;
		while ((line = br.readLine()) != null) {
			String[] datas = line.split("\t");
			String docIDm = datas[0];
			String docIDc = datas[1];
			Document docMaster;
			Document docCandit;
			docMaster = collectionStatic.find(eq("_id", docIDm)).projection(fields).first();
			docCandit = collectionStatic.find(eq("_id", docIDc)).projection(fields).first();
			
			if (docMaster == null || docCandit == null) {
				docMaster = collectionCenter.find(eq("_id", docIDm)).projection(fields).first();
				docCandit = collectionCenter.find(eq("_id", docIDc)).projection(fields).first();
			}
			
			bw.write(line);
			System.out.println(line);
			if (docMaster != null && docCandit != null) {
				bw.write("\t");
				bw.write("SUCCESS");
				bw.write("\t");
				bw.write(docMaster.toJson());
				bw.write("\t");
				bw.write(docCandit.toJson());
				bw.write("\n");
			} else {
				bw.write("\t");
				bw.write("FAILED");
				bw.write("\n");
			}
		}
		bw.close();
	}
	
	
	/**
	 * 基于 doc pair + mongo db 构建标注用例
	 * doc + doc + title + title + url + url
	 */
	public static void buildLabelDataFromDBByDocPair() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File("/Users/yuxi/NB/RandomForest/_local/preprocessor/same_title_shuf_500.txt")));
		String line = null;
		Set<String> ids = new HashSet<>();
		Map<String, Document> idMap = new HashMap<>();
		List<String[]> lines = new ArrayList<>();
		while ((line = br.readLine()) != null) {
			String[] datas = line.split("\t");
			ids.add(datas[0]);
			ids.add(datas[1]);
			lines.add(datas);
		}
		MongoCursor<Document> cursor = collectionStatic.find(in("_id", ids.toArray())).projection(new BasicDBObject().append("url", 1).append("stitle", 1)).cursor();
		while (cursor.hasNext()) {
			Document d = cursor.next();
			String id = d.getString("_id");
			idMap.put(id, d);
		}
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("/Users/yuxi/NB/RandomForest/_local/preprocessor/same_title_shuf_500_label_data.txt")));
		for (String[] strs : lines) {
			String docM = strs[0];
			String docC = strs[1];
			bw.write(docM + "\t" + docC + "\t" +
				idMap.get(docM).getString("stitle") + "\t" + idMap.get(docC).getString("stitle") + "\t" +
				idMap.get(docM).getString("url") + "\t" + idMap.get(docC).getString("url") + "\n"
			);
		}
		bw.close();
	}
	
	
	/**
	 * 基于 #未标注数据# 的属性构造待标注文档对
	 * 未标注数据 doc_id \t doc_id \t isSuccess \t jstr |t jstr
	 */
	public static void extractDocUrlFromUnlabeledDocPair(File docPair) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		BufferedReader br = new BufferedReader(new FileReader(docPair));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(docPair.getAbsolutePath() + "_urls")));
		String line = null;
		while ((line = br.readLine()) != null) {
			String[] datas = line.split("\t");
			String mID = datas[0];
			String cID = datas[1];
			String isFailed = datas[2];
			String mFeature = datas[3];
			String cFeature = datas[4];
			JsonNode mNode = mapper.readTree(mFeature);
			JsonNode cNode = mapper.readTree(cFeature);
			if ("SUCCESS".equals(isFailed)) {
				bw.write(mID);
				bw.write("\t");
				bw.write(cID);
				bw.write("\t");
				bw.write(mNode.get("url").asText());
				bw.write("\t");
				bw.write(cNode.get("url").asText());
				bw.write("\n");
			}
		}
		bw.close();
	}
	
	
	/**
	 * 无标签 Field + Label Pair => 标准 Field 文档
	 * unlabeled_doc_pair_fields + labeled_doc_pair => std_doc_pair_fields
	 */
	public static void concatFieldsWithLabel(String sourcePath) {
		try {
			File sourceFile = new File(sourcePath);
			BufferedReader unlabelFieldReader = new BufferedReader(new FileReader(sourceFile));
			BufferedReader labelPairReader = new BufferedReader(new FileReader(new File(sourceFile.getAbsolutePath() + "_label")));
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(sourceFile.getAbsolutePath() + "_fields")));
			String line = null;
			Map<String, String> docPair2Field = new HashMap<>();
			while ((line = unlabelFieldReader.readLine()) != null) {
				String[] datas = line.split("\t");
				String docM = datas[0];
				String fieldM = datas[3];
				String docC = datas[1];
				String fieldC = datas[4];
				String key = docM + "\t" + docC;
				String value = fieldM + "\t" + fieldC;
				if (docPair2Field.containsKey(key)) {
					System.out.println(key);
				}
				docPair2Field.put(key, value);
			}
			
			while ((line = labelPairReader.readLine()) != null) {
				String[] datas = line.split("\t");
				String docM = datas[0];
				String docC = datas[1];
				String label = datas[2];
				String key = docM + "\t" + docC;
				if (docPair2Field.containsKey(key)) {
					bw.write(key);
					bw.write("\t");
					bw.write(label);
					bw.write("\t");
					bw.write("SUCCESS");
					bw.write("\t");
					bw.write(docPair2Field.get(key));
					bw.write("\n");
				} else {
					System.out.println("NotIn : " + key);
				}
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * 基于标注数据结果 生成 shuffled train_fields, test_fields
	 */
	public static void buildModelData(List<String> paths, String targetDir) throws Exception {
		String trainFieldsPath = Paths.get(targetDir, "train_fields").toString();
		String testFieldsPath = Paths.get(targetDir, "test_fields").toString();
		BufferedWriter trainFieldsWriter = new BufferedWriter(new FileWriter(new File(trainFieldsPath)));
		BufferedWriter testFieldsWriter = new BufferedWriter(new FileWriter(new File(testFieldsPath)));
		Random rnd = new Random();
		
		for (String path : paths) {
			BufferedReader br = new BufferedReader(new FileReader(new File(path)));
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] datas = line.split("\t");
				String label = datas[2];
				String isSuccess = datas[3];
				if (!label.equals("DIFF") && !label.equals("EVENT") && !label.equals("DUP") || !isSuccess.equals("SUCCESS")) {
					System.out.println(line);
					continue;
				}
				if (rnd.nextInt(10) < 1) {
					testFieldsWriter.write(line);
					testFieldsWriter.write("\n");
				} else {
					trainFieldsWriter.write(line);
					trainFieldsWriter.write("\n");
				}
			}
		}
		
		testFieldsWriter.close();
		trainFieldsWriter.close();
	}
	
	
	public static void calDocPairIsLocal() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		BufferedReader br = new BufferedReader(new FileReader(new File("/Users/yuxi/NB/RandomForest/_local/train/20201014/badcase")));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("/Users/yuxi/NB/RandomForest/_local/train/20201014/doc_pair_islocal")));
		String line = null;
		while ((line = br.readLine()) != null) {
			String[] datas = line.split("\t");
			String docM = datas[0];
			String docC = datas[1];
			Document docMaster;
			Document docCandit;
			BasicDBObject fields = new BasicDBObject();
			fields.append("is_local_news", 1).append("geotag_v2", 1).append("geotag", 1);
			docMaster = collectionStatic.find(eq("_id", docM)).projection(fields).first();
			docCandit = collectionStatic.find(eq("_id", docC)).projection(fields).first();
			if (docMaster == null || docCandit == null) {
				docMaster = collectionCenter.find(eq("_id", docM)).projection(fields).first();
				docCandit = collectionCenter.find(eq("_id", docC)).projection(fields).first();
			}
			if (docMaster == null || docCandit == null) {
				System.out.println(line);
				continue;
			}
			String jsM = docMaster.toJson();
			String jsC = docCandit.toJson();
			JsonNode nodeM = mapper.readTree(jsM);
			JsonNode nodeC = mapper.readTree(jsC);
			bw.write(line);
			bw.write("\t");
			if (StringUtils.equals(nodeM.hasNonNull("is_local_news") ? nodeM.get("is_local_news").textValue() : "false", "true") || nodeM.get("geotag").size() != 0 || nodeM.get("geotag_v2").size() != 0) {
				bw.write("1");
			} else {
				bw.write("0");
			}
			bw.write("\t");
			if (StringUtils.equals(nodeC.hasNonNull("is_local_news") ? nodeC.get("is_local_news").textValue() : "false", "true") || nodeC.get("geotag").size() != 0 || nodeC.get("geotag_v2").size() != 0) {
				bw.write("1");
			} else {
				bw.write("0");
			}
			bw.write("\n");
		}
		bw.close();
	}
	
	
	private static void buildABResultDataFromInfoLog() throws Exception {
		BufferedReader respReader = new BufferedReader(new FileReader(new File("/Users/yuxi/NB/RandomForest/_local/estimate/20201023/response.txt")));
		BufferedReader modelReader = new BufferedReader(new FileReader(new File("/Users/yuxi/NB/RandomForest/_local/estimate/20201023/model_result.txt")));
		String line = null;
		ObjectMapper mapper = new ObjectMapper();
		// master_candit : lr_label, rf_label
		Map<String, String[]> modelResult = new HashMap<>();
		while ((line = respReader.readLine()) != null) {
			JsonNode result = mapper.readTree(line.split("  ")[1]);
			JsonNode resp = result.get("RESPONSE");
			String docID = resp.get("_id").textValue();
			String nbrID = resp.get("nbr_id").textValue();
			String[] strs = new String[2];
			if (resp.get("dup_dist").doubleValue() > -1) {
				strs[0] = "DUP";
			} else if (resp.get("evt_dist").doubleValue() > -1) {
				strs[0] = "EVENT";
			} else {
				strs[0] = "DIFF";
			}
			modelResult.put(docID + "\t" + nbrID, strs);
		}
		String lastID = "";
		String lastNB = "";
		String lastLabel = "DIFF";
		double lastScore = -1;
		int count = 0;
		while ((line = modelReader.readLine()) != null) {
			String[] datas = line.split("\t");
			String docID = datas[1];
			String nbrID = datas[2];
			String label = datas[3];
			Double score = Double.valueOf(datas[4]);
			if (!docID.equals(lastID)) {
				count++;
				//dump上一步结果
				if (!lastID.equals(lastNB) || !lastLabel.equals("DIFF")) {
					String key = lastID + "\t" + lastNB;
					if (modelResult.containsKey(key)) {
						modelResult.get(key)[1] = lastLabel;
					} else {
						String[] strs = new String[2];
						strs[1] = lastLabel;
						modelResult.put(key, strs);
					}
				}
				//刷新上一步缓存
				lastID = docID;
				lastNB = docID;
				lastLabel = "DIFF";
				lastScore = -1;
			}
			//与上一步结果比较
			if (label.equals("EVENT") && score > lastScore) {
				if (score > 0.9) {
					lastNB = nbrID;
					lastLabel = "DUP";
					lastScore = score;
				} else if (score > 0.58) {
					lastNB = nbrID;
					lastLabel = "EVENT";
					lastScore = score;
				}
			}
		}
		
		for (Map.Entry<String, String[]> entry : modelResult.entrySet()) {
			System.out.println(entry.getKey() + "\t" + String.valueOf(entry.getValue()[0]) + "\t" + String.valueOf(entry.getValue()[1]));
		}
		System.out.println(count);
	}
	
	
	public static void main(String[] args) throws Exception {
		extractDocFields(new File("/Users/yuxi/NB/RandomForest/_local/estimate/20201023/label_result"));
	}
}
