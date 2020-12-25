package com.nb.randomforest.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nb.randomforest.entity.EventFeature;

import java.io.*;
import java.util.Date;
import java.util.Enumeration;
import java.util.Stack;

/**
 * @author yuxi
 * @date 2020/12/11
 * @note Generator of Wide & Deep Model Training Data
 */
public class CSVUtils {
	
	/**
	 * Build Wide Feature From Doc Fields
	 */
	public static void buildCSVFromDocFields(String sourcePath, String dumpPath) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		
		File sourceFile = new File(sourcePath);
		File dumpedFile = new File(dumpPath);
		BufferedReader br = new BufferedReader(new FileReader(sourceFile));
		BufferedWriter bw = new BufferedWriter(new FileWriter(dumpedFile));
		
		String line = null;
		while ((line = br.readLine()) != null) {
			String[] datas = line.split("\t");
			if ("SUCCESS".equals(datas[3])) {
				String label = datas[2];
				String mField = datas[4];
				String mEmbed = datas[6];
				String cField = datas[5];
				String cEmbed = datas[7];
				
				try {
					EventFeature feature = new EventFeature(
						mapper.readTree(mField),
						mapper.readTree(cField),
						label
					);
					bw.write(feature.toCSV());
					bw.write(",");
					bw.write("\"");
					bw.write(mEmbed);
					bw.write("\"");
					bw.write(",");
					bw.write("\"");
					bw.write(cEmbed);
					bw.write("\"");
					bw.write("\n");
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println(mField);
					System.out.println(cField);
					System.out.println(label);
					break;
				}
			}
		}
		bw.close();
	}
	
	
	
	/**
	 * Build Decision Logic File From Random Forest Nodes
	 */
	public static void buildDecisionLogicFileFromRFTree(String nodePath, String logicPath) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File(nodePath)));
		BufferedWriter bwSerial = new BufferedWriter(new FileWriter(new File(logicPath)));
		//utils header
		bwSerial.write("package com.nb.randomforest.utils;");
		bwSerial.write("\n\n");
		bwSerial.write("import com.nb.randomforest.entity.EventFeature;");
		bwSerial.write("\n\n");
		bwSerial.write("/**\n" +
			" * @author yuxi\n" +
			" * @date " + new Date().toString() + "\n" +
			" */\n");
		bwSerial.write("public class _LogicUtils {\n\n");
		bwSerial.write("\tpublic static String transformDecisionLogicToWideFeature(EventFeature eventFeature) {\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double TitleDist = eventFeature.getTitleDist() == null ? 0 : eventFeature.getTitleDist();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double TitleRatio = eventFeature.getTitleRatio() == null ? 0 : eventFeature.getTitleRatio();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double TitleLength = eventFeature.getTitleLength() == null ? 0 : eventFeature.getTitleLength();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double SameSRC = eventFeature.getSameSRC() == null ? 0 : eventFeature.getSameSRC();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double CWordSpan = eventFeature.getcWordSpan() == null ? 0 : eventFeature.getcWordSpan();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double ParagraphSpan = eventFeature.getParagraphSpan() == null ? 0 : eventFeature.getParagraphSpan();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double EpochSpan  = eventFeature.getEpochSpan() == null ? 0 : eventFeature.getEpochSpan();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double InsertSpan = eventFeature.getInsertSpan() == null ? 0 : eventFeature.getInsertSpan();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double SimhashDist = eventFeature.getSimhashDist() == null ? 0 : eventFeature.getSimhashDist();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double CKWSRatio = eventFeature.getcKWSRatio() == null ? 0 : eventFeature.getcKWSRatio();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double CKWSLength = eventFeature.getcKWSLength() == null ? 0 : eventFeature.getcKWSLength();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double TKWSRatio = eventFeature.gettKWSRatio() == null ? 0 : eventFeature.gettKWSRatio();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double TKWSLength = eventFeature.gettKWSLength() == null ? 0 : eventFeature.gettKWSLength();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double HKWSRatio = eventFeature.gethKWSRatio() == null ? 0 : eventFeature.gethKWSRatio();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double HKWSLength = eventFeature.gethKWSLength() == null ? 0 : eventFeature.gethKWSLength();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double ChannelRatio = eventFeature.getChannelRatio() == null ? 0 : eventFeature.getChannelRatio();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double ChannelLength = eventFeature.getChannelLength() == null ? 0 : eventFeature.getChannelLength();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double COrgRatioNE = eventFeature.getcOrgRatioNE() == null ? 0 : eventFeature.getcOrgRatioNE();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double COrgRatioSP = eventFeature.getcOrgRatioSP() == null ? 0 : eventFeature.getcOrgRatioSP();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double COrgLengthNE = eventFeature.getcOrgLengthNE() == null ? 0 : eventFeature.getcOrgLengthNE();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double COrgLengthSP = eventFeature.getcOrgLengthSP() == null ? 0 : eventFeature.getcOrgLengthSP();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double CLocRatioNE = eventFeature.getcLocRatioNE() == null ? 0 : eventFeature.getcLocRatioNE();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double CLocRatioSP = eventFeature.getcLocRatioSP() == null ? 0 : eventFeature.getcLocRatioSP();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double CLocLengthNE = eventFeature.getcLocLengthNE() == null ? 0 : eventFeature.getcLocLengthNE();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double CLocLengthSP = eventFeature.getcLocLengthSP() == null ? 0 : eventFeature.getcLocLengthSP();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double CPerRatioNE = eventFeature.getcPerRatioNE() == null ? 0 : eventFeature.getcPerRatioNE();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double CPerRatioSP = eventFeature.getcPerRatioSP() == null ? 0 : eventFeature.getcPerRatioSP();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double CPerLengthNE = eventFeature.getcPerLengthNE() == null ? 0 : eventFeature.getcPerLengthNE();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double CPerLengthSP = eventFeature.getcPerLengthSP() == null ? 0 : eventFeature.getcPerLengthSP();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double CNUMRatioSP = eventFeature.getcNUMRatioSP() == null ? 0 : eventFeature.getcNUMRatioSP();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double CNUMLengthSP = eventFeature.getcNUMLengthSP() == null ? 0 : eventFeature.getcNUMLengthSP();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double CTimRatioSP = eventFeature.getcTimRatioSP() == null ? 0 : eventFeature.getcTimRatioSP();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double CTimLengthSP = eventFeature.getcTimLengthSP() == null ? 0 : eventFeature.getcTimLengthSP();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double TOrgRatioNE = eventFeature.gettOrgRatioNE() == null ? 0 : eventFeature.gettOrgRatioNE();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double TOrgRatioSP = eventFeature.gettOrgRatioSP() == null ? 0 : eventFeature.gettOrgRatioSP();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double TOrgLengthNE = eventFeature.gettOrgLengthNE() == null ? 0 : eventFeature.gettOrgLengthNE();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double TOrgLengthSP = eventFeature.gettOrgLengthSP() == null ? 0 : eventFeature.gettOrgLengthSP();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double TLocRatioNE = eventFeature.gettLocRatioNE() == null ? 0 : eventFeature.gettLocRatioNE();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double TLocRatioSP = eventFeature.gettLocRatioSP() == null ? 0 : eventFeature.gettLocRatioSP();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double TLocLengthNE = eventFeature.gettLocLengthNE() == null ? 0 : eventFeature.gettLocLengthNE();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double TLocLengthSP = eventFeature.gettLocLengthSP() == null ? 0 : eventFeature.gettLocLengthSP();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double TPerRatioNE = eventFeature.gettPerRatioNE() == null ? 0 : eventFeature.gettPerRatioNE();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double TPerRatioSP = eventFeature.gettPerRatioSP() == null ? 0 : eventFeature.gettPerRatioSP();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double TPerLengthNE = eventFeature.gettPerLengthNE() == null ? 0 : eventFeature.gettPerLengthNE();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double TPerLengthSP = eventFeature.gettPerLengthSP() == null ? 0 : eventFeature.gettPerLengthSP();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double TNUMRatioSP = eventFeature.gettNUMRatioSP() == null ? 0 : eventFeature.gettNUMRatioSP();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double TNUMLengthSP = eventFeature.gettNUMLengthSP() == null ? 0 : eventFeature.gettNUMLengthSP();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double TTimRatioSP = eventFeature.gettTimRatioSP() == null ? 0 : eventFeature.gettTimRatioSP();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double TTimLengthSP = eventFeature.gettTimLengthSP() == null ? 0 : eventFeature.gettTimLengthSP();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double CatRatio = eventFeature.getCatRatio() == null ? 0 : eventFeature.getCatRatio();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double CatLength = eventFeature.getCatLength() == null ? 0 : eventFeature.getCatLength();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double GeoRatio = eventFeature.getGeoRatio() == null ? 0 : eventFeature.getGeoRatio();");
		bwSerial.write("\n");
		bwSerial.write("\t\t");
		bwSerial.write("Double GeoLength = eventFeature.getGeoLength() == null ? 0 : eventFeature.getGeoLength();");
		bwSerial.write("\n");
		//
		bwSerial.write("\t\t");
		bwSerial.write("StringBuilder sb = new StringBuilder();");
		bwSerial.write("\n");
		//
		String line = null;
		Stack<String> cache = new Stack<>();
		while ((line = br.readLine()) != null) {
			if (line.contains("<") || line.contains(">")) {
				if (line.startsWith("|")) {
					//校验缓存数量
					int cacheLength = line.split("\\|   ").length - 1;
					while (cacheLength  != cache.size()) {
						cache.pop();
						if (cache.size() == 0) {
							throw new Exception("Cache Size Verify Failed : " + line);
						}
					}
					cache.push(line.substring(line.lastIndexOf("|   ") + 4, line.length()));
					if (line.contains("DIFF") || line.contains("EVENT")) {
						buildLogicAndWideFeatureSerial(cache, bwSerial);
//						buildLogicAndWideFeatureParallel(cache, bwParallel);
					}
				} else {
					cache.clear();
					cache.push(line);
				}
			}
		}
		bwSerial.write("\t\t");
		bwSerial.write("return sb.toString();");
		bwSerial.write("\n");
		bwSerial.write("\t}\n}");
		bwSerial.close();
	}
	
	
	/**
	 * 互斥判断, 判断次数少
	 */
	private static void buildLogicAndWideFeatureParallel(Stack<String> cache, BufferedWriter bw) throws Exception {
	
	}
	
	
	
	/**
	 * 串行判断, 判断次数多
	 */
	private static void buildLogicAndWideFeatureSerial(Stack<String> cache, BufferedWriter bw) throws Exception {
		Enumeration<String> enumeration = cache.elements();
		StringBuilder tmp = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		sb.append("\t\tif (");
		while (enumeration.hasMoreElements()) {
			String element = enumeration.nextElement();
			if (element.contains(":")) {
				element = element.split(" : ")[0];
			}
			sb.append(element);
			sb.append(" && ");
		}
		sb.delete(sb.length() - 4, sb.length());
		sb.append(") {\n\t\t\tsb.append(\"1,\");\n\t\t} else {\n\t\t\tsb.append(\"0,\");\n\t\t}\n");
		String str = sb.toString();
		System.out.println("Dump Logic And Wide Feature : " + str);
		bw.write(str);
		cache.pop();
	}
	
	
	/**
	 * sparse 特征转 连续值特征
	 */
	public static void main(String[] args) throws Exception {
//		buildCSVFromDocFields(
//			"/Users/yuxi/NB/doc-clu-model-widedeep/data/estimate/doc_fields.txt",
//			"/Users/yuxi/NB/doc-clu-model-widedeep/data/estimate/doc_fields.csv"
//		);
		
		
		
		buildDecisionLogicFileFromRFTree(
			"/Users/yuxi/NB/RandomForest/_local/train/20201222/forest.out",
			"/Users/yuxi/NB/RandomForest/src/main/java/com/nb/randomforest/utils/_LogicUtils.java"
		);
	}
}
