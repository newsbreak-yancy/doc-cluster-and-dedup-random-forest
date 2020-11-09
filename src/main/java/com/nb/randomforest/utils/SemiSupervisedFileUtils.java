package com.nb.randomforest.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

/**
 * @author yuxi
 * @date 2020/11/2
 */
public class SemiSupervisedFileUtils {
	
	/**
	 * 无监督数据(日志)预处理 => JsonString
	 *
	 * @param sourceFile
	 */
	public static void logPreprocess(File sourceFile, File targetFile) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(sourceFile));
			BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile));
			String line = null;
			while ((line = br.readLine()) != null) {
				String rs = line.substring(line.indexOf(" BODY: ") + 7, line.length());
				bw.write(rs);
				bw.write("\n");
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void buildEventSemiSupervisedFile(File sourceFile, File targetFile) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			BufferedReader br = new BufferedReader(new FileReader(sourceFile));
			BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile, true));
			
			List<String> srcNodes = new ArrayList<>();
			Map<String, List<Integer>> featureMap = new HashMap<>();
			//read
			String line = null;
			while ((line = br.readLine()) != null) {
				srcNodes.add(line);
			}
			//cache feature
			for (int i = 0; i < srcNodes.size(); i++) {
				//kws
				ObjectNode node = (ObjectNode) mapper.readTree(srcNodes.get(i));
				if (node.has("kws") && node.get("kws").size() > 0) {
					JsonNode kws = node.get("kws");
					for (JsonNode keyword : kws) {
						String key = keyword.textValue();
						if (featureMap.containsKey(key)) {
							featureMap.get(key).add(i);
						} else {
							List<Integer> list = new ArrayList<>();
							list.add(i);
							featureMap.put(key, list);
						}
					}
				}
			}
			//build event doc pair fields
			//判断 :
			for (String masterStr : srcNodes) {
				List<Entry<Integer, Integer>> candits = new ArrayList<>();
				ObjectNode masterNode = (ObjectNode) mapper.readTree(masterStr);
				String masterID = masterNode.get("_id").textValue();
				Integer masterWordCount = masterNode.get("c_word").intValue();
				if (!masterNode.has("kws") || masterNode.get("kws").size() == 0) {
					continue;
				}
				//召回 : 候选集
				JsonNode kws = masterNode.get("kws");
				Map<Integer, Integer> reverseScore = new HashMap<>();
				for (JsonNode keyword : kws) {
					List<Integer> list = featureMap.get(keyword.textValue());
					for (Integer docIndex : list) {
						if (reverseScore.containsKey(docIndex)) {
							reverseScore.put(docIndex, reverseScore.get(docIndex) + 1);
						} else {
							reverseScore.put(docIndex, 1);
						}
					}
				}
				candits.addAll(reverseScore.entrySet());
				
				//筛选 : 候选集
				if (candits.size() > 1) {
					for (Entry<Integer, Integer> entry : candits) {
						Integer index = entry.getKey();
						Integer score = entry.getValue();
						String canditStr = srcNodes.get(index);
						ObjectNode canditNode = (ObjectNode) mapper.readTree(canditStr);
						String canditID = canditNode.get("_id").textValue();
						Integer canditWordCount = canditNode.get("c_word").intValue();
						Float overlapRatio = Float.valueOf(score) / kws.size();
						if (!canditID.equals(masterID) && overlapRatio > 0.5 && overlapRatio < 0.8) {
							bw.write(masterID + "\t" + canditID + "\t" + "EVENT\tSUCCESS\t" + masterStr + "\t" + canditStr);
							bw.write("\n");
							System.out.println(String.format("PROCESSED : %s\t%s", masterID, canditID));
						}
					}
				}
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void buildDiffUNSunpervisedFile(File sourceFileM, File sourceFileC, File targetFile) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			BufferedReader mreader = new BufferedReader(new FileReader(sourceFileM));
			BufferedReader creader = new BufferedReader(new FileReader(sourceFileC));
			BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile));
			String lineM = null;
			String lineC = null;
			while ((lineM = mreader.readLine()) != null && (lineC = creader.readLine()) != null) {
				try {
					ObjectNode nodeM = (ObjectNode) mapper.readTree(lineM);
					ObjectNode nodeC = (ObjectNode) mapper.readTree(lineC);
					//
					if (nodeM.has("doc_bert_em")) {
						nodeM.remove("doc_bert_em");
					}
					if (nodeC.has("doc_bert_em")) {
						nodeC.remove("doc_bert_em");
					}
					if (nodeM.has("seg_title")) {
						nodeM.put("stitle", nodeM.get("seg_title").textValue());
						nodeM.remove("seg_title");
					}
					if (nodeC.has("seg_title")) {
						nodeC.put("stitle", nodeC.get("seg_title").textValue());
						nodeC.remove("seg_title");
					}
					if (nodeM.has("source")) {
						nodeM.put("src", nodeM.get("source").textValue());
						nodeM.remove("source");
					}
					if (nodeC.has("source")) {
						nodeC.put("src", nodeC.get("source").textValue());
						nodeC.remove("source");
					}
					//
					lineM = mapper.writeValueAsString(nodeM);
					lineC = mapper.writeValueAsString(nodeC);
					String idM = nodeM.get("_id").textValue();
					String titleM = nodeM.get("stitle").textValue();
					String idC = nodeC.get("_id").textValue();
					String titleC = nodeC.get("stitle").textValue();
					if (!StringUtils.equals(idM, idC) && !StringUtils.equals(titleM, titleC)) {
						bw.write(idM + "\t" + idC + "\tDIFF\tSUCCESS\t" + lineM + "\t" + lineC);
						bw.write("\n");
					} else {
						System.out.println("Same DOC : ");
						System.out.println(lineM);
						System.out.println(lineC);
					}
				} catch (Exception e) {
					System.out.println(lineM);
					System.out.println(lineC);
					continue;
				}
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
////		server log => request doc json str
//		File sourceFile = new File("/Users/yuxi/NB/RandomForest/_local/append_1101~1102_unsup/1101.log");
//		File targetFile = new File("/Users/yuxi/NB/RandomForest/_local/append_1101~1102_unsup/1101_json");
//		logPreprocess(sourceFile, targetFile);

////		build diff doc pair fields
//		File sourceFileM = new File("/Users/yuxi/NB/RandomForest/_local/append_1101~1102_unsup/1030_json");
//		File sourceFileC = new File("/Users/yuxi/NB/RandomForest/_local/append_1101~1102_unsup/1101_json");
//		File targetFile = new File("/Users/yuxi/NB/RandomForest/_local/append_1101~1102_unsup/diff_fields");
//		buildDiffUNSunpervisedFile(sourceFileM, sourceFileC, targetFile);
		
		//build event doc pair fields
		List<File> sourceFiles = new ArrayList<>();
		sourceFiles.add(new File("/Users/yuxi/NB/RandomForest/_local/append_1101~1102_semisup/1101_json_1"));
		sourceFiles.add(new File("/Users/yuxi/NB/RandomForest/_local/append_1101~1102_semisup/1101_json_2"));
		sourceFiles.add(new File("/Users/yuxi/NB/RandomForest/_local/append_1101~1102_semisup/1101_json_3"));
		sourceFiles.add(new File("/Users/yuxi/NB/RandomForest/_local/append_1101~1102_semisup/1101_json_4"));
		sourceFiles.add(new File("/Users/yuxi/NB/RandomForest/_local/append_1101~1102_semisup/1101_json_5"));
		File targetFile = new File("/Users/yuxi/NB/RandomForest/_local/append_1101~1102_semisup/semi_event_fields");
		for (int i = 0; i < 5; i++) {
			buildEventSemiSupervisedFile(sourceFiles.get(i), targetFile);
		}
		
	}
}
