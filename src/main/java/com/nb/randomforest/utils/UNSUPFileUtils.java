package com.nb.randomforest.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.*;

/**
 * @author yuxi
 * @date 2020/11/2
 */
public class UNSUPFileUtils {
	
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
	
	
	public static void buildEventUNSupervisedFile(File sourceFile, File targetFile) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			BufferedReader br = new BufferedReader(new FileReader(sourceFile));
			List<String> srcNodes = new ArrayList<>();
			Map<String, List<Integer>> featureMap = new HashMap<>();
			//read
			String line = null;
			while ((line = br.readLine()) != null) {
				srcNodes.add(line);
				if (srcNodes.size() % 10000 == 0) {
					System.out.println("Processed : " + srcNodes.size());
					break;
				}
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
			for (String str : srcNodes) {
				ObjectNode node = (ObjectNode) mapper.readTree(str);
				String id = node.get("_id").textValue();
				
				Set<Integer> canditIndexes = new HashSet<>();
				if (node.has("kws") && node.get("kws").size() > 0) {
					JsonNode kws = node.get("kws");
					for (JsonNode keyword : kws) {
						List<Integer> list = featureMap.get(keyword.textValue());
						if (list.size() < 5) {
							canditIndexes.addAll(list);
						}
					}
				}
				if (canditIndexes.size() > 1) {
					for (Integer index : canditIndexes) {
						String canditStr = srcNodes.get(index);
						ObjectNode canditNode = (ObjectNode) mapper.readTree(canditStr);
						String canditID = canditNode.get("_id").textValue();
						if (!canditID.equals(id)) {
							System.out.println(str);
							System.out.println(canditStr);
						}
					}
				}
				break;
			}
			
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
		File sourceFile = new File("/Users/yuxi/NB/RandomForest/_local/append_1101~1102_unsup/1101_json");
		File targetFile = new File("/Users/yuxi/NB/RandomForest/_local/append_1101~1102_unsup/event_fields");
		buildEventUNSupervisedFile(sourceFile, targetFile);
	}
}
