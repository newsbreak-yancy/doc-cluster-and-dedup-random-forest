package com.nb.randomforest.utils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yuxi
 * @date 2020/10/26
 */
public class EstimateUtils {
	
	public static void concatModelResultWithLabelData() throws Exception {
		String resultFile = "/Users/yuxi/NB/RandomForest/_local/estimate/20201023/abtest_pair.txt";
		BufferedReader resultReader = new BufferedReader(new FileReader(new File(resultFile)));
		String labelFile = "/Users/yuxi/NB/RandomForest/_local/estimate/20201023/label_result.txt";
		BufferedReader labelReader = new BufferedReader(new FileReader(new File(labelFile)));
		String line = null;
		Map<String, String> labelCache = new HashMap<>();
		while ((line = labelReader.readLine()) != null) {
			String[] strs = line.split("\t");
			String key = strs[0] + "\t" + strs[1];
			String label = strs[2];
			labelCache.put(key, label);
		}
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("abtest_result.txt")));
		while ((line = resultReader.readLine()) != null) {
			String[] strs = line.split("\t");
			String key = strs[0] + "\t" + strs[1];
			if (labelCache.containsKey(key)) {
				bw.write(line + "\t" + labelCache.get(key) + "\n");
			} else {
				bw.write(line + "\tNULL\n");
			}
		}
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		concatModelResultWithLabelData();
	}
}
