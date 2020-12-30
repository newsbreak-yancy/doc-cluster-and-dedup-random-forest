package com.nb.randomforest.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nb.randomforest.entity.EventFeature;
import org.apache.commons.lang3.StringUtils;

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
	 * Build Wide&Deep Model Input Feature From Doc Fields
	 */
	public static void buildCSVFromDocFields(String sourcePath, String dumpPath, Boolean forTrain, Boolean useDecisionTree) throws Exception {
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
					//label
					bw.write(StringUtils.equals("DIFF", label) ? "0" : StringUtils.equals("EVENT", label) ? "1" : forTrain ? "1" : "1.0001");
					bw.write(",");
					//wide & cross & cont feature
					EventFeature feature = new EventFeature(
						mapper.readTree(mField),
						mapper.readTree(cField),
						label
					);
					if (useDecisionTree) {
						bw.write(_LogicUtils.transformDecisionLogicToWideFeature(feature));
					} else {
						bw.write(feature.toCSV());
						bw.write(",");
					}
					//embed
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
	 * Build Decision Logic File From Random Forest Nodes * Serialize
	 */
	public static void buildDecisionLogicFileFromTreeNodeSequenceSerialize(String nodePath, String logicPath) throws Exception {
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
					//退火校验
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
	 * Build Decision Logic File From Random Forest Nodes * Discriminate
	 */
	public static void buildDecisionLogicFileFromTreeNodeSequenceDiscriminate(String nodePath, String logicPath, int treeNum, int treeDepth) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File(nodePath)));
		BufferedWriter bwDiscrim = new BufferedWriter(new FileWriter(new File(logicPath)));
		//utils header
		bwDiscrim.write("package com.nb.randomforest.utils;");
		bwDiscrim.write("\n\n");
		bwDiscrim.write("import com.nb.randomforest.entity.EventFeature;");
		bwDiscrim.write("\n\n");
		bwDiscrim.write("/**\n" +
			" * @author yuxi\n" +
			" * @date " + new Date().toString() + "\n" +
			" */\n");
		bwDiscrim.write("public class _LogicUtils {\n\n");
		bwDiscrim.write("\tpublic static String transformDecisionLogicToWideFeature(EventFeature eventFeature) {\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double TitleDist = eventFeature.getTitleDist() == null ? 0 : eventFeature.getTitleDist();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double TitleRatio = eventFeature.getTitleRatio() == null ? 0 : eventFeature.getTitleRatio();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double TitleLength = eventFeature.getTitleLength() == null ? 0 : eventFeature.getTitleLength();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double SameSRC = eventFeature.getSameSRC() == null ? 0 : eventFeature.getSameSRC();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double CWordSpan = eventFeature.getcWordSpan() == null ? 0 : eventFeature.getcWordSpan();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double ParagraphSpan = eventFeature.getParagraphSpan() == null ? 0 : eventFeature.getParagraphSpan();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double EpochSpan  = eventFeature.getEpochSpan() == null ? 0 : eventFeature.getEpochSpan();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double InsertSpan = eventFeature.getInsertSpan() == null ? 0 : eventFeature.getInsertSpan();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double SimhashDist = eventFeature.getSimhashDist() == null ? 0 : eventFeature.getSimhashDist();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double CKWSRatio = eventFeature.getcKWSRatio() == null ? 0 : eventFeature.getcKWSRatio();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double CKWSLength = eventFeature.getcKWSLength() == null ? 0 : eventFeature.getcKWSLength();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double TKWSRatio = eventFeature.gettKWSRatio() == null ? 0 : eventFeature.gettKWSRatio();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double TKWSLength = eventFeature.gettKWSLength() == null ? 0 : eventFeature.gettKWSLength();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double HKWSRatio = eventFeature.gethKWSRatio() == null ? 0 : eventFeature.gethKWSRatio();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double HKWSLength = eventFeature.gethKWSLength() == null ? 0 : eventFeature.gethKWSLength();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double ChannelRatio = eventFeature.getChannelRatio() == null ? 0 : eventFeature.getChannelRatio();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double ChannelLength = eventFeature.getChannelLength() == null ? 0 : eventFeature.getChannelLength();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double COrgRatioNE = eventFeature.getcOrgRatioNE() == null ? 0 : eventFeature.getcOrgRatioNE();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double COrgRatioSP = eventFeature.getcOrgRatioSP() == null ? 0 : eventFeature.getcOrgRatioSP();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double COrgLengthNE = eventFeature.getcOrgLengthNE() == null ? 0 : eventFeature.getcOrgLengthNE();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double COrgLengthSP = eventFeature.getcOrgLengthSP() == null ? 0 : eventFeature.getcOrgLengthSP();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double CLocRatioNE = eventFeature.getcLocRatioNE() == null ? 0 : eventFeature.getcLocRatioNE();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double CLocRatioSP = eventFeature.getcLocRatioSP() == null ? 0 : eventFeature.getcLocRatioSP();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double CLocLengthNE = eventFeature.getcLocLengthNE() == null ? 0 : eventFeature.getcLocLengthNE();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double CLocLengthSP = eventFeature.getcLocLengthSP() == null ? 0 : eventFeature.getcLocLengthSP();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double CPerRatioNE = eventFeature.getcPerRatioNE() == null ? 0 : eventFeature.getcPerRatioNE();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double CPerRatioSP = eventFeature.getcPerRatioSP() == null ? 0 : eventFeature.getcPerRatioSP();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double CPerLengthNE = eventFeature.getcPerLengthNE() == null ? 0 : eventFeature.getcPerLengthNE();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double CPerLengthSP = eventFeature.getcPerLengthSP() == null ? 0 : eventFeature.getcPerLengthSP();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double CNUMRatioSP = eventFeature.getcNUMRatioSP() == null ? 0 : eventFeature.getcNUMRatioSP();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double CNUMLengthSP = eventFeature.getcNUMLengthSP() == null ? 0 : eventFeature.getcNUMLengthSP();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double CTimRatioSP = eventFeature.getcTimRatioSP() == null ? 0 : eventFeature.getcTimRatioSP();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double CTimLengthSP = eventFeature.getcTimLengthSP() == null ? 0 : eventFeature.getcTimLengthSP();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double TOrgRatioNE = eventFeature.gettOrgRatioNE() == null ? 0 : eventFeature.gettOrgRatioNE();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double TOrgRatioSP = eventFeature.gettOrgRatioSP() == null ? 0 : eventFeature.gettOrgRatioSP();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double TOrgLengthNE = eventFeature.gettOrgLengthNE() == null ? 0 : eventFeature.gettOrgLengthNE();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double TOrgLengthSP = eventFeature.gettOrgLengthSP() == null ? 0 : eventFeature.gettOrgLengthSP();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double TLocRatioNE = eventFeature.gettLocRatioNE() == null ? 0 : eventFeature.gettLocRatioNE();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double TLocRatioSP = eventFeature.gettLocRatioSP() == null ? 0 : eventFeature.gettLocRatioSP();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double TLocLengthNE = eventFeature.gettLocLengthNE() == null ? 0 : eventFeature.gettLocLengthNE();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double TLocLengthSP = eventFeature.gettLocLengthSP() == null ? 0 : eventFeature.gettLocLengthSP();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double TPerRatioNE = eventFeature.gettPerRatioNE() == null ? 0 : eventFeature.gettPerRatioNE();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double TPerRatioSP = eventFeature.gettPerRatioSP() == null ? 0 : eventFeature.gettPerRatioSP();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double TPerLengthNE = eventFeature.gettPerLengthNE() == null ? 0 : eventFeature.gettPerLengthNE();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double TPerLengthSP = eventFeature.gettPerLengthSP() == null ? 0 : eventFeature.gettPerLengthSP();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double TNUMRatioSP = eventFeature.gettNUMRatioSP() == null ? 0 : eventFeature.gettNUMRatioSP();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double TNUMLengthSP = eventFeature.gettNUMLengthSP() == null ? 0 : eventFeature.gettNUMLengthSP();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double TTimRatioSP = eventFeature.gettTimRatioSP() == null ? 0 : eventFeature.gettTimRatioSP();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double TTimLengthSP = eventFeature.gettTimLengthSP() == null ? 0 : eventFeature.gettTimLengthSP();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double CatRatio = eventFeature.getCatRatio() == null ? 0 : eventFeature.getCatRatio();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double CatLength = eventFeature.getCatLength() == null ? 0 : eventFeature.getCatLength();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double GeoRatio = eventFeature.getGeoRatio() == null ? 0 : eventFeature.getGeoRatio();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("Double GeoLength = eventFeature.getGeoLength() == null ? 0 : eventFeature.getGeoLength();");
		bwDiscrim.write("\n");
		//
		bwDiscrim.write("\t\t");
		bwDiscrim.write("StringBuilder sb = new StringBuilder();");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t\t");
		bwDiscrim.write("int[] ints = new int[" + (treeNum * (1<<treeDepth)) + "];");
		bwDiscrim.write("\n");
		//
		String line = null;
		int lastDepth = 0;
		int curtDepth = 0;
		int lastTree = 1;//第一颗树初始化
		int curtTree = 0;
		int index = 0;//特征赋值索引计数
		while ((line = br.readLine()) != null) {
			if (line.contains("<") || line.contains(">")) {
				lastDepth = curtDepth;
				String[] strs = line.split("\\|   ");
				curtDepth = strs.length;
				line = strs[curtDepth - 1];
				boolean isOut = false;
				if (line.contains(" : ")) {
					isOut = true;
					line = line.split(" : ")[0];
				}
				//
				if (curtDepth > lastDepth && !isOut) {
					for (int i = 1; i < curtDepth; i++) {
						bwDiscrim.write("\t");
					}
					bwDiscrim.write("if (");
					bwDiscrim.write(line);
					bwDiscrim.write(") {\n");
				} else if (curtDepth > lastDepth && isOut) {
					for (int i = 1; i < curtDepth; i++) {
						bwDiscrim.write("\t");
					}
					bwDiscrim.write("if (");
					bwDiscrim.write(line);
					bwDiscrim.write(") {");
					bwDiscrim.write("ints[" + ((curtTree - 1) * (1<<treeDepth) + index) + "] = 1;}\n");
					index += 1;
				} else if (curtDepth == lastDepth && !isOut) {
					for (int i = 1; i < curtDepth; i++) {
						bwDiscrim.write("\t");
					}
					bwDiscrim.write("if (");
					bwDiscrim.write(line);
					bwDiscrim.write(") {\n");
				} else if (curtDepth == lastDepth && isOut) {
					for (int i = 1; i < curtDepth; i++) {
						bwDiscrim.write("\t");
					}
					bwDiscrim.write("else {");
					bwDiscrim.write("ints[" + ((curtTree - 1) * (1<<treeDepth) + index) + "] = 1;}\n");
					index += 1;
				} else if (curtDepth < lastDepth && !isOut) {//curtDepth < lastDepth 收尾 + 是否为新树?
					if (curtTree != lastTree) {
						lastTree = curtTree;
						for (int j = 0; j < (lastDepth - curtDepth); j++) {
							for (int i = 0; i < (lastDepth - 2 - j); i++) {
								bwDiscrim.write("\t");
							}
							bwDiscrim.write("}\n");
						}
						bwDiscrim.write("if (");
						bwDiscrim.write(line);
						bwDiscrim.write(") {\n");
					} else {
						for (int j = 0; j < (lastDepth - curtDepth); j++) {
							for (int i = 0; i < (lastDepth - j - 2); i++) {
								bwDiscrim.write("\t");
							}
							if (lastDepth - j - curtDepth == 1) {
								bwDiscrim.write("} else {\n");
							} else {
								bwDiscrim.write("}\n");
							}
						}
					}
				} else if (curtDepth < lastDepth && isOut) {
					if (curtTree != lastTree) {
						lastTree = curtTree;
						for (int j = 0; j < (lastDepth - curtDepth); j++) {
							for (int i = 0; i < (lastDepth - 2 - j); i++) {
								bwDiscrim.write("\t");
							}
							bwDiscrim.write("}\n");
						}
						bwDiscrim.write("if (");
						bwDiscrim.write(line);
						bwDiscrim.write(") {\n");
					} else {
						for (int j = 0; j < (lastDepth - curtDepth); j++) {
							for (int i = 0; i < (lastDepth - j - 2); i++) {
								bwDiscrim.write("\t");
							}
							if (lastDepth - j - curtDepth == 1) {
								bwDiscrim.write("} else {ints[" + ((curtTree - 1) * (1<<treeDepth) + index) + "] = 1;}\n");
								index += 1;
							} else {
								bwDiscrim.write("}\n");
							}
						}
					}
				}
			} else if ("RandomTree".equals(line)) {
				//决策树索引及位置索引初始化
				curtTree += 1;
				index = 0;
			}
		}
		lastDepth = curtDepth;
		curtDepth = 1;
		for (int j = 0; j < (lastDepth - curtDepth); j++) {
			for (int i = 0; i < (lastDepth - 2 - j); i++) {
				bwDiscrim.write("\t");
			}
			bwDiscrim.write("}\n");
		}
		
		
		bwDiscrim.write("\t\tfor (int i = 0; i < ints.length; i++) {\n");
		bwDiscrim.write("\t\t\tsb.append(ints[i]);\n");
		bwDiscrim.write("\t\t\tsb.append(\",\");\n");
		bwDiscrim.write("\t\t}\n");
		bwDiscrim.write("\t\treturn sb.toString();\n");
		bwDiscrim.write("\n");
		bwDiscrim.write("\t}\n}");
		bwDiscrim.close();
	}
	
	
	/**
	 * sparse 特征转 连续值特征
	 */
	public static void main(String[] args) throws Exception {
		//基于 forest decision path 生成 decision logic
		String nodePath = "/Users/yuxi/NB/RandomForest/_local/train/20201222/forest.out";
		String dlPath = "/Users/yuxi/NB/RandomForest/src/main/java/com/nb/randomforest/utils/_LogicUtils.java";
//		buildDecisionLogicFileFromTreeNodeSequenceSerialize (nodePath, dlPath);
		buildDecisionLogicFileFromTreeNodeSequenceDiscriminate(nodePath, dlPath, 32, 6);
		
		//基于 doc fields 生成 wide & deep model input data
//		buildCSVFromDocFields(
//			"/Users/yuxi/NB/doc-clu-model-widedeep/data/estimate/doc_fields.txt",
//			"/Users/yuxi/NB/doc-clu-model-widedeep/data/estimate/doc_fields.csv",
//			false,
//			true
//		);
//		buildCSVFromDocFields(
//			"/Users/yuxi/NB/doc-clu-model-widedeep/data/train/doc_fields_shuf.txt",
//			"/Users/yuxi/NB/doc-clu-model-widedeep/data/train/doc_fields_shuf.csv",
//			true,
//		    true
//		);
	}
}
