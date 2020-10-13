package com.nb.randomforest.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.mongodb.client.model.Filters.eq;

/**
 * @author yuxi
 * @date 2020/9/28
 */
public class MongoUtils {
	
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
		
		fields.append("_id", 1).append("stitle",1).append("src",1)
			.append("c_word", 1).append("epoch", 1).append("paragraph_count",1)
			.append("simhash", 1).append("kws", 1).append("channels_v2",1)
			.append("ne_content_organization",1).append("ne_content_person",1).append("ne_content_location",1)
			.append("ne_title_location",1).append("ne_title_organization",1).append("ne_title_person",1)
			.append("text_category_v2",1).append("geotag_v2",1).append("url", 1);
		
		filePaths.add(Paths.get(rootDir, "append_0926_0930/dp_0926_0930_celebrities").toAbsolutePath().toString());
		filePaths.add(Paths.get(rootDir, "append_0926_0930/dp_0926_0930_economic").toAbsolutePath().toString());
		filePaths.add(Paths.get(rootDir, "append_0926_0930/dp_0926_0930_event").toAbsolutePath().toString());
		filePaths.add(Paths.get(rootDir, "append_0926_0930/dp_0926_0930_royal").toAbsolutePath().toString());
		filePaths.add(Paths.get(rootDir, "append_0926_0930/dp_0926_0930_tech").toAbsolutePath().toString());
		
//		filePaths.add(Paths.get(rootDir, "append_history/bash_1").toAbsolutePath().toString());
//		filePaths.add(Paths.get(rootDir, "append_history/bash_2").toAbsolutePath().toString());
//		filePaths.add(Paths.get(rootDir, "append_history/bash_3").toAbsolutePath().toString());
//		filePaths.add(Paths.get(rootDir, "append_history/bash_4_cluster_yes").toAbsolutePath().toString());
//		filePaths.add(Paths.get(rootDir, "append_history/bash_5_cluster_no").toAbsolutePath().toString());
//		filePaths.add(Paths.get(rootDir, "append_history/bash_6_cluster_unsure").toAbsolutePath().toString());
//		filePaths.add(Paths.get(rootDir, "append_history/bash_7").toAbsolutePath().toString());
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
	
	
	
	public static void main(String[] args) throws Exception {
		for (String filePath : filePaths) {
			
			concatFieldsWithLabel(filePath);
			
//			extractDocFields(new File(filePath));
//			extractDocUrlFromUnlabeledDocPair(new File(filePath));
		}
	}
}
