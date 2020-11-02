package com.nb.randomforest.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.lang3.StringUtils;

import java.io.*;

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
					if (nodeM.has("doc_bert_em")) {
						nodeM.remove("doc_bert_em");
					}
					if (nodeC.has("doc_bert_em")) {
						nodeC.remove("doc_bert_em");
					}
					lineM = mapper.writeValueAsString(nodeM);
					lineC = mapper.writeValueAsString(nodeC);
					String idM = nodeM.get("_id").textValue();
					String titleM = nodeM.get("seg_title").textValue();
					String idC = nodeC.get("_id").textValue();
					String titleC = nodeC.get("seg_title").textValue();
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
		//server log => request doc json str
//		File sourceFile = new File("/Users/yuxi/NB/RandomForest/_local/append_1101~1102_unsup/1101.log");
//		File targetFile = new File("/Users/yuxi/NB/RandomForest/_local/append_1101~1102_unsup/1101_json");
//		logPreprocess(sourceFile, targetFile);
		
		//build diff doc pair fields
		File sourceFileM = new File("/Users/yuxi/NB/RandomForest/_local/append_1101~1102_unsup/1030_json");
		File sourceFileC = new File("/Users/yuxi/NB/RandomForest/_local/append_1101~1102_unsup/1101_json");
		File targetFile = new File("/Users/yuxi/NB/RandomForest/_local/append_1101~1102_unsup/diff_fields");
		buildDiffUNSunpervisedFile(sourceFileM, sourceFileC, targetFile);
		
		
		
		//build event doc pair fields
		
	}
}
