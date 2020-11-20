package com.nb.randomforest.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.stanford.nlp.process.Morphology;
import edu.stanford.nlp.trees.WordStemmer;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.similarity.LevenshteinDistance;
import org.apache.lucene.analysis.en.EnglishMinimalStemFilterFactory;
import org.apache.lucene.analysis.en.EnglishMinimalStemmer;
import org.apache.lucene.analysis.synonym.SynonymGraphFilter;

import java.util.*;

/**
 * @author yuxi
 * @date 2020/9/27
 */
public class FeatureUtils {
	
	private final static ObjectMapper mapper = new ObjectMapper();
	
	public static int NBITS_BYTE = 8;
	
	public static int[] DIST_MAP = new int[1 << NBITS_BYTE];
	
	static {
		for (int i = 0; i < DIST_MAP.length; i++) {
			int j = i;
			int nbit1 = 0;
			while (j != 0) {
				nbit1++;
				j = j & (j - 1);
			}
			DIST_MAP[i] = nbit1;
		}
	}
	
	
	/**
	 * media_id, src,
	 */
	public static Double isEqual(Object m, Object c) {
		if (m == null || c == null) {
			return null;
		}
		return m.equals(c) ? 1d : 0d;
	}
	
	
	/**
	 * 字符串预处理
	 * 1.lower case 2.remove punctuation 3.remove stop word
	 * stitle,
	 */
	public static String stringPreprocess(String pre) {
		String post = pre.toLowerCase()
			.replaceAll("[!-`]", "")
			.replaceAll(" (after|before|on|in|as|at|of|is|am|are|be|being|the|s|a) ", " ")
			.replaceAll(" {2,5}", " ");
		return post;
	}
	
	
	/**
	 * input : "master_sequence" , "candit_sequence"
	 * return : 5
	 * stitle
	 */
	public static Double levenshteinDistance(String master, String candit) {
		if (StringUtils.isEmpty(master) || StringUtils.isEmpty(candit)) {
			return null;
		}
		return new Double(LevenshteinDistance.getDefaultInstance().apply(master, candit));
	}
	
	
	/**
	 * epoch, cword, paragraph_num
	 */
	public static Double numSpan(Long master, Long candit) {
		if (master == null || candit == null) {
			return null;
		}
		return new Double(Math.abs(master - candit));
	}
	
	
	/**
	 * simhash,
	 */
	public static Double simhashDist(JsonNode master, JsonNode candit) {
		if (master == null || candit == null) {
			return null;
		}
		byte[] a = master.asText().getBytes();
		byte[] b = candit.asText().getBytes();
		if (a.length != b.length) {
			return null;
		}
		int ret = 0;
		for (int i = 0; i < a.length; i++) {
			int x = a[i] ^ b[i];
			x = (x << 24) >>> 24;
			ret += DIST_MAP[x];
		}
		return new Double(ret);
	}
	
	
	/**
	 * data :
	 *     ne + content / title + org / loc / per
	 *     sp + content / title + org / loc / per / num / time
	 *     category L1 / L2
	 *
	 * input :
	 *     {key: double, key: double}
	 *     or
	 *     ['key', 'key', ...]
	 */
	public static Double weightedOverlapRatio(JsonNode master, JsonNode candit) {
		if (master == null || candit == null || (master.size() == 0 && candit.size() == 0)) {
			return null;
		} else if (master.size() == 0 || candit.size() == 0) {
			return 0d;
		}
		//这里的 NUM 与 weightedAverageLength 特征不一样.
		double masterTotalNum = 0;
		double canditTotalNum = 0;
		double weightedOverlapRatio = 0d;
		Map<String, Double> mCache = new HashMap<>();
		Map<String, Double> cCache = new HashMap<>();
		if (master.isArray()) {
			master.forEach(node -> {
				String entity = node.asText().toLowerCase();
				if (entity.contains("^^") || entity.contains(" ")) {
					String[] words = entity.split("(\\^\\^| )");
					for (String word : words) {
						mCache.put(word, mCache.getOrDefault(word, 0d) + 1);
					}
				} else {
					mCache.put(entity, mCache.getOrDefault(entity, 0d) + 1);
				}
			});
			Collection<Double> mValues = mCache.values();
			for (Double mValue : mValues) {
				masterTotalNum += mValue;
			}
			candit.forEach(node -> {
				String entity = node.asText().toLowerCase();
				if (entity.contains("^^") || entity.contains(" ")) {
					String[] words = entity.split("(\\^\\^| )");
					for (String word : words) {
						cCache.put(word, cCache.getOrDefault(word, 0d) + 1);
					}
				} else {
					cCache.put(entity, cCache.getOrDefault(entity, 0d) + 1);
				}
			});
			Collection<Double> cValues = cCache.values();
			for (Double cValue : cValues) {
				canditTotalNum += cValue;
			}
		} else {
			Iterator<String> itrM = master.fieldNames();
			while (itrM.hasNext()) {
				String key = itrM.next();
				Double val = master.get(key).asDouble();
				mCache.put(key, val);
				masterTotalNum += val;
			}
			Iterator<String> itrC = candit.fieldNames();
			while (itrC.hasNext()) {
				String key = itrC.next();
				Double val = candit.get(key).asDouble();
				cCache.put(key, val);
				canditTotalNum += val;
			}
		}
		Iterator<String> itr = mCache.keySet().iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			Double mNum = mCache.get(key);
			Double cNum = cCache.get(key);
			if (cCache.containsKey(key)) {
				weightedOverlapRatio = weightedOverlapRatio + 0.5d * ((mNum / masterTotalNum) + (cNum / canditTotalNum));
			}
		}
		return weightedOverlapRatio;
	}
	
	
	/**
	 *
	 */
	public static Double weightedAverageLength(JsonNode master, JsonNode candit) {
		if (master == null || candit == null || (master.size() == 0 && candit.size() == 0)) {
			return null;
		}
		double masterTotalNum = 0;
		double canditTotalNum = 0;
		if (master.isArray()) {
			masterTotalNum = master.size();
			canditTotalNum = candit.size();
		} else {
			Iterator<String> itrM = master.fieldNames();
			while (itrM.hasNext()) {
				String key = itrM.next();
				Double val = master.get(key).asDouble();
				masterTotalNum += val;
			}
			Iterator<String> itrC = candit.fieldNames();
			while (itrC.hasNext()) {
				String key = itrC.next();
				Double val = candit.get(key).asDouble();
				canditTotalNum += val;
			}
		}
		return (masterTotalNum + canditTotalNum) / 2;
	}
	
	
	/**
	 * input : ['', '', ...] 字符串切割 or JsonNode.forEach() => List<String>
	 *
	 * proc : 针对 'A^^B'~'A' or 'A B'~'A'情况的特殊处理
	 *
	 * data : title words, ﻿channels...
	 */
	public static Double overlapRatio(List<String> master, List<String> candit) {
		if (master == null || candit == null || (master.size() == 0 && candit.size() == 0)) {
			return null;
		} else if (master.size() == 0 || candit.size() == 0) {
			return 0d;
		} else {
			int sum = 0;
			HashSet<String> _ms = new HashSet<>();
			for (String m : master) {
				m = m.toLowerCase();
				if (m.contains("^^") || m.contains(" ")) {
					String[] ms = m.split("(\\^\\^| )");
					for (String _m : ms) {
						_ms.add(_m);
					}
				} else {
					_ms.add(m);
				}
			}
			HashSet<String> _cs = new HashSet<>();
			for (String c : candit) {
				c = c.toLowerCase();
				if (c.contains("^^") || c.contains(" ")) {
					String[] cs = c.split("(\\^\\^| )");
					for (String _c : cs) {
						_cs.add(_c);
					}
				} else {
					_cs.add(c);
				}
			}
			for (String _m : _ms) {
				if (_cs.contains(_m)) {
					sum++;
				}
			}
			return sum / ((_ms.size() + _cs.size()) * 0.5d);
		}
	}
	
	
	/**
	 *
	 */
	public static Double averageLength(List<String> mList, List<String> cList) {
		if (mList == null || cList == null || (mList.size() == 0 && cList.size() == 0)) {
			return null;
		}
		return (mList.size() + cList.size()) / 2d;
	}
	
	
	/**
	 * ﻿text_category
	 */
	public static Double categoryOverlapRatio(JsonNode master, JsonNode candit) {
		if (master == null || candit == null || (master.size() == 0 && candit.size() == 0)) {
			return null;
		} else if (master.size() == 0 || candit.size() == 0) {
			return 0d;
		}
		JsonNode mCatL1 = master.get("first_cat");
		JsonNode mCatL2 = master.get("second_cat");
		JsonNode cCatL1 = candit.get("first_cat");
		JsonNode cCatL2 = candit.get("second_cat");
		Double L1Ratio = weightedOverlapRatio(mCatL1, cCatL1);
		Double L2Ratio = weightedOverlapRatio(mCatL2, cCatL2);
		if (L1Ratio == null && L2Ratio == null) {
			return null;
		} else if (L2Ratio == null) {
			return L1Ratio;
		} else {
			return (L1Ratio + L2Ratio) / 2;
		}
	}
	
	
	/**
	 *
	 */
	public static Double categoryAverageLength(JsonNode master, JsonNode candit) {
		if (master == null || candit == null || (master.size() == 0 && candit.size() == 0)) {
			return null;
		}
		JsonNode mCatL1 = master.get("first_cat");
		JsonNode mCatL2 = master.get("second_cat");
		JsonNode cCatL1 = candit.get("first_cat");
		JsonNode cCatL2 = candit.get("second_cat");
		Double L1Length = weightedAverageLength(mCatL1, cCatL1);
		Double L2Length = weightedAverageLength(mCatL2, cCatL2);
		if (L1Length == null && L2Length == null) {
			return null;
		} else if (L2Length == null) {
			return L1Length;
		} else {
			return (L1Length + L2Length) / 2;
		}
	}
	
	
	/**
	 * geotag
	 *
	 * ﻿[{"name" : "mclean", "score" : 0.783655166625977, "coord" : "38,-77", "pid" : "mclean,virginia", "type" : "city"}]
	 */
	public static Double geotagOverlapRatio(JsonNode master, JsonNode candit) {
		if (master == null || candit == null || (master.size() == 0 && candit.size() == 0)) {
			return null;
		} else if (master.size() == 0 || candit.size() == 0) {
			return 0d;
		}
		List<String> mList = new ArrayList<>();
		for(JsonNode _m : master) {
			mList.add(_m.get("name").asText().toLowerCase());
		}
		List<String> cList = new ArrayList<>();
		for(JsonNode _c : candit) {
			cList.add(_c.get("name").asText().toLowerCase());
		}
		return overlapRatio(mList, cList);
	}
	
	
	/**
	 *
	 */
	public static Double geotagAverageLength(JsonNode master, JsonNode candit) {
		if (master == null || candit == null || (master.size() == 0 && candit.size() == 0)) {
			return null;
		}
		List<String> mList = new ArrayList<>();
		for(JsonNode _m : master) {
			mList.add(_m.get("name").asText().toLowerCase());
		}
		List<String> cList = new ArrayList<>();
		for(JsonNode _c : candit) {
			cList.add(_c.get("name").asText().toLowerCase());
		}
		return averageLength(mList, cList);
	}
	
	
	public static void main2(String[] args) throws Exception {
		System.out.println("================================================================================");
		/** 编辑距离 */
		System.out.println("LevenDist: 5 ~ " + String.valueOf(levenshteinDistance("master_sequence", "candit_sequence")));
		System.out.println("================================================================================");

		
		/** SimHash Distance */
		System.out.println(
			"SimHashDist: 25 ~ " +
			String.valueOf(simhashDist(
				mapper.createObjectNode().put("1", "dc3e2107ca5962110cb8f66ad15550c3").get("1"),
				mapper.createObjectNode().put("1", "dc3c2127c25923110c90f26ef5d550e7").get("1")
			))
		);
		System.out.println("================================================================================");
		

		/** pre process */
		//be
		System.out.println("Preprocess : be result ~ " + stringPreprocess("B!@#$%^&*()_-+=E?/><.,;:\"`' is result"));
		System.out.println("Preprocess : " + stringPreprocess("Fantasy Football : Is Bengals ' Joe Burrow worthy of being a QB1 ?"));
		System.out.println("================================================================================");
		
		
		/** MediaID, SRC isEqual */
		//false 0.0
		System.out.println("IsEqual: 0.0 ~ " + isEqual(58272, 72863));
		//true  1.0
		System.out.println("IsEqual: 1.0 ~ " + isEqual(58272, 58272));
		//null  null
		System.out.println("IsEqual: null ~ " + isEqual(58272, null));
		//true  1.0
		System.out.println("IsEqual: 1.0 ~ " + isEqual("CNN", "CNN"));
		//false 0.0
		System.out.println("IsEqual: 0.0 ~ " + isEqual("CNN", "MSN"));
		System.out.println("================================================================================");

		
		/** Overlap Ratio && Average Length */
		System.out.println("Overlap Ratio: null ~ " + overlapRatio(Collections.EMPTY_LIST, Collections.EMPTY_LIST));
		System.out.println("Average Length: null ~ " + averageLength(Collections.EMPTY_LIST, Collections.EMPTY_LIST));
		System.out.println("Overlap Ratio: 0.0 ~ " + overlapRatio(Arrays.asList("TEST"), Collections.EMPTY_LIST));
		System.out.println("Average Length: 0.5 ~ " + averageLength(Arrays.asList("TEST"), Collections.EMPTY_LIST));
		List<String> mList = Arrays.asList(new String[] {"A", "B"});
		List<String> cList = Arrays.asList(new String[] {"A", "C"});
		System.out.println("Overlap Ratio: 0.5 ~ " + overlapRatio(mList, cList));
		System.out.println("Average Length: 2.0 ~ " + averageLength(mList, cList));
		mList = Arrays.asList(new String[] {"A^^B", "C"});
		cList = Arrays.asList(new String[] {"A", "C"});
		System.out.println("Overlap Ratio: 0.8 ~ " + overlapRatio(mList, cList));
		System.out.println("Average Length: 2.0 ~ " + averageLength(mList, cList));
		System.out.println("================================================================================");
		
		
		/** Normal Weighted OverlapRatio */
		//field:num
		System.out.println("Weighted Ratio: null ~ " + String.valueOf(weightedOverlapRatio(mapper.createObjectNode(), mapper.createObjectNode())));
		System.out.println("Weighted Length: null ~ " + String.valueOf(weightedAverageLength(mapper.createObjectNode(), mapper.createObjectNode())));
		
		String mStr = "{ \"Greece\" : 10}";
		String cStr = "{ \"Greece\" : 8, \"FFID\" : 2}";
		JsonNode mNode = mapper.readTree(mStr);
		JsonNode cNode = mapper.readTree(cStr);
		System.out.println("Weighted Ratio: null ~ " + String.valueOf(weightedOverlapRatio(mNode, null)));
		System.out.println("Weighted Length: null ~ " + String.valueOf(weightedAverageLength(mNode, null)));
		
		System.out.println("Weighted Length: 0.0 ~ " + weightedOverlapRatio(mNode, mapper.createObjectNode()));
		
		System.out.println("Weighted Length: 0.9 ~ " + weightedOverlapRatio(mNode, cNode));
		
		mNode = mapper.readTree("[\"a\", \"a\", \"b\", \"b\"]");
		cNode = mapper.readTree("[\"a\", \"b\", \"c\", \"c\"]");
		System.out.println("Weighted Length: 0.75 ~ " + String.valueOf(weightedOverlapRatio(mNode, cNode)));
		System.out.println("================================================================================");
		
		
		/** Category Weighted Overlap Ratio */
		//field:ratio 0.79
		mStr = "{\"first_cat\": {\"CrimePublicsafety\": 0.7167493775333941, \"PoliticsGovernment\": 0.5099245963202348}, \"second_cat\": {\"CrimePublicsafety_Other\": 0.7167493775333941, \"PoliticsGovernment_Other\": 0.5099245963202348}, \"third_cat\": {}}";
		cStr = "{\"first_cat\": {\"CrimePublicsafety\": 0.7874334454536438}, \"second_cat\": {\"CrimePublicsafety_Other\": 0.7874334454536438}, \"third_cat\": {}}";
		mNode = mapper.readTree(mStr);
		cNode = mapper.readTree(cStr);
		System.out.println("Category Ratio : " + categoryOverlapRatio(mNode, cNode));
		System.out.println("Category Length : " + categoryAverageLength(mNode, cNode));
		System.out.println("================================================================================");
		
		
		/** Geotag Overlap Ratio */
		mStr = "[{\"name\": \"california\", \"score\": 1.0, \"pid\": \"california\", \"type\": \"state\"}, {\"name\": \"norfolk\", \"score\": 0.9934280514717102, \"coord\": \"42.032723,-97.413755\", \"pid\": \"norfolk,nebraska\", \"type\": \"city\"}]";
		cStr = "[{\"name\": \"california\", \"score\": 0.9930974841117859, \"coord\": \"43.181211,-95.856954\", \"pid\": \"sheldon,iowa\", \"type\": \"city\"}, {\"name\": \"o'brien county\", \"score\": 0.9583118557929993, \"coord\": \"43.113124,-95.645795\", \"pid\": \"o'brien_county,iowa\", \"type\": \"county\"}]";
		mNode = mapper.readTree(mStr);
		cNode = mapper.readTree(cStr);
		System.out.println("GEOTag Ratio : " + geotagOverlapRatio(mNode, cNode));
		System.out.println("GEOTag Length : " + geotagAverageLength(mNode, cNode));
		System.out.println("================================================================================");
	}
	
	//TODO : 1.STEM 2.SYNONYM
	public static void main(String[] args) {
		
		Morphology morphology = new Morphology();
		EnglishMinimalStemmer miniStemmer = new EnglishMinimalStemmer();
		String sequence = "In court , going to argues with block Biden win in Pennsylvania";
		sequence = "Amazon opens online pharmacy , shaking up another industry";
		sequence = "South Korea begins stronger limits in some areas";
		
//		sequence = stringPreprocess(sequence);
//		SynonymGraphFilter
		String[] words = sequence.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			sb.append(morphology.stem(word));
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
}
