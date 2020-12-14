package com.nb.randomforest.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nb.randomforest.entity.EventFeature;
import org.apache.commons.lang3.StringUtils;
import weka.core.Attribute;
import weka.core.Instances;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * @author yuxi
 * @date 2020/12/11
 */
public class CSVUtils {
	
	/**
	 * 生成 wide&deep model 必要特征, 文件格式 csv
	 */
	public static void buildCSV(String sourcePath, String dumpPath) throws Exception {
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
	 * sparse 特征转 连续值特征
	 */
	
	
	public static void main(String[] args) throws Exception {
		buildCSV(
			"/Users/yuxi/NB/doc-clu-model-widedeep/data/train/doc_pair_rf_1k_fields",
			"/Users/yuxi/NB/doc-clu-model-widedeep/data/train/doc_pair_rf_1k_fields.csv"
		);
	}
}
