package com.nb.randomforest.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.sun.tools.javac.util.Assert;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.similarity.LevenshteinDistance;

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
	 * 编辑距离前的预处理 or overlap 前的预处理
	 * stitle,
	 */
	public static String preprocess(String pre) {
		String post = pre.toLowerCase().replaceAll("[!-`]", ""); // ASC ii Table  :8)
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
	public static Double numSpan(JsonNode master, JsonNode candit) {
		if (master == null || candit == null) {
			return null;
		}
		return new Double(Math.abs(master.longValue() - candit.longValue()));
	}
	
	
	/**
	 * simhash,
	 */
	public static Double simhashDist(JsonNode master, JsonNode candit) {
		if (master == null || candit == null) {
			return null;
		}
		byte[] a = master.textValue().getBytes();
		byte[] b = candit.textValue().getBytes();
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
	 * ne_content_organization, ne_content_location, ne_content_person,
	 * input : {key:val_int, key:val_int}
	 *
	 * @return \sum{match_key * weight}
	 */
	public static Double weightedOverlapRatio(JsonNode master, JsonNode candit) {
		if (master == null || candit == null || (master.size() == 0 && candit.size() == 0)) {
			return null;
		} else if (master.size() == 0 || candit.size() == 0) {
			return 0d;
		}
		double masterTotalNum = 0d;
		double canditTotalNum = 0d;
		double weightedOverlapRatio = 0d;
		Iterator<String> itrM = master.fieldNames();
		while (itrM.hasNext()) {
			String key = itrM.next();
			masterTotalNum += master.get(key).floatValue();
		}
		Iterator<String> itrC = candit.fieldNames();
		while (itrC.hasNext()) {
			String key = itrC.next();
			canditTotalNum += candit.get(key).floatValue();
		}
		Iterator<String> itr = master.fieldNames();
		while (itr.hasNext()) {
			String key = itr.next();
			if (candit.has(key)) {
				weightedOverlapRatio = weightedOverlapRatio + 0.5d * (master.get(key).floatValue() / masterTotalNum) + 0.5d * (candit.get(key).floatValue() / canditTotalNum);
			}
		}
		return weightedOverlapRatio;
	}
	
	
	/**
	 * master.findValuesAsText()
	 * <p>
	 * ﻿channels_v2,
	 */
	public static Double overlapRatio(JsonNode master, JsonNode candit) {
		if (master == null || candit == null || (master.size() == 0 && candit.size() == 0)) {
			return null;
		} else if (master.size() == 0 || candit.size() == 0) {
			return 0d;
		} else {
			double ratio = 0d;
			HashSet<String> _ms = new HashSet<>();
			for (JsonNode _m : master) {
				_ms.add(_m.textValue());
			}
			HashSet<String> _cs = new HashSet<>();
			for (JsonNode _c : candit) {
				_cs.add(_c.textValue());
			}
			for (String _m : _ms) {
				if (_cs.contains(_m)) {
					ratio += (1d / _ms.size() + 1d / _cs.size()) * 0.5d;
				}
			}
			return ratio;
		}
	}
	
	
	/**
	 *
	 * ﻿text_category_v2
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
	 * geotag_v2
	 */
	public static Double geotagOverlapRatio(JsonNode master, JsonNode candit) {
		if (master == null || candit == null || (master.size() == 0 && candit.size() == 0)) {
			return null;
		} else if (master.size() == 0 || candit.size() == 0) {
			return 0d;
		}
		ArrayNode mList = mapper.createArrayNode();
		for(JsonNode _m : master) {
			mList.add(_m.get("name"));
		}
		ArrayNode cList = mapper.createArrayNode();
		for(JsonNode _c : candit) {
			cList.add(_c.get("name"));
		}
		return overlapRatio(mList, cList);
	}
	
	
	public static void main(String[] args) throws Exception {
		/** 编辑距离 */
		//5
		System.out.println(levenshteinDistance("master_sequence", "candit_sequence"));



		/** SimHash Distance */
		//25
		System.out.println(simhashDist(mapper.createObjectNode().put("1", "dc3e2107ca5962110cb8f66ad15550c3").get("1"), mapper.createObjectNode().put("1", "dc3c2127c25923110c90f26ef5d550e7").get("1")));



		/** pre process */
		//be
		System.out.println(preprocess("B!@#$%^&*()_-+=E?/><.,;:\"'"));
		//fantasy football  is bengals  joe burrow worthy of being a qb
		System.out.println(preprocess("Fantasy Football : Is Bengals ' Joe Burrow worthy of being a QB1 ?"));



		/** MediaID, SRC isEqual */
		//false 0.0
		System.out.println(isEqual(58272, 72863));
		//true  1.0
		System.out.println(isEqual(58272, 58272));
		//null  null
		System.out.println(isEqual(58272, null));
		//true  1.0
		System.out.println(isEqual("CNN", "CNN"));
		//false 0.0
		System.out.println(isEqual("CNN", "MSN"));



		/** OverlapRatio */
		Assert.checkNull(overlapRatio(mapper.createArrayNode(), mapper.createArrayNode()));
		Assert.checkNonNull(overlapRatio(mapper.createArrayNode().add("TEST"), mapper.createArrayNode()));
		//0.15
		String mStr = "[\"Bengals\", \"Fantasy^^Football\", \"Fantasy^^Football^^players\", \"QB1^^potential\", \"Chargers\", \"NFL\", \"Ravens\", \"Colts\", \"Browns\", \"Steelers\", \"Fantasy^^Football^^owners\", \"quarterback\", \"the^^game\", \"Titans\", \"football^^team\", \"Jaguars\", \"Cleveland^^Browns\", \"Eagles\", \"Aaron^^Rodgers\", \"lineups\"]";
		String cStr = "[\"completions\", \"Joe^^Burrow\", \"quarterback\", \"games\", \"the^^Eagles\", \"Bengals\", \"rookies\", \"Kyler^^Murray\", \"Joe\", \"Arizona\"]";
		System.out.println(overlapRatio(mapper.readTree(mStr), mapper.readTree(cStr)));
		//0.32
		mStr = "[\"Amber^^Alert\", \"Giselle^^Torres\", \"Amber^^Alert^^UPDATE\", \"state^^police\", \"police\", \"Montgomery^^County\", \"eastern^^Pennsylvania\", \"KDKA\", \"ELKINS^^PARK\"]";
		cStr = "[\"Amber^^Alert^^UPDATE\", \"Amber^^Alert\", \"Police\", \"Pennsylvania^^State^^Police\", \"Montgomery^^County\", \"man\", \"brown^^hair\", \"Giselle^^Torres\", \"supporting^^lehighvalleylive.com\", \"Juan^^Pablo^^Torres\", \"Kurt^^Bresswein\", \"brown^^eyes\", \"Hispanic^^male\", \"Elkins^^Park\", \"kbresswein@lehighvalleylive.com\", \"STATEWIDE\", \"purple^^tights\", \"body^^armor\", \"glasses\", \"face\"]";
		System.out.println(overlapRatio(mapper.readTree(mStr), mapper.readTree(cStr)));
		//0.608
		mStr = "[\"UPDATE\", \"said\", \"STATEWIDE\", \"UPDATE\", \"located\", \"canceled\", \"Thank\", \"Police\", \"@PAStatePolice\", \"-RRB-\", \"September\", \"ARTICLE\", \"issued\", \"seen\", \"issued\", \"Department\", \"-RRB-\", \"searching\", \"seen\", \"Park\", \"reported\", \"is\", \"contact\", \"go\", \"ElkinsPark\", \"go\", \"Alert\", \"-RRB-\", \"Thank\", \"consider\", \"reached\", \"Note\", \"earn\"]";
		cStr = "[\"PARK\", \"say\", \"STATEWIDE\", \"UPDATE\", \"located\", \"canceled\", \"Thank\", \"Police\", \"@PAStatePolice\", \"-RRB-\", \"September\", \"say\", \"say\", \"say\", \"said\", \"say\"]";
		System.out.println(overlapRatio(mapper.readTree(mStr), mapper.readTree(cStr)));
		


		/** Weighted OverlapRatio */
		//field:num
		ObjectMapper mapper = new ObjectMapper();
		mStr = "{ \"Greece\" : 10, \"Greeces\" : 5}";
		cStr = "{ \"Greece\" : 4, \"Greecess\" : 2}";
		JsonNode mNode = mapper.readTree(mStr);
		JsonNode cNode = mapper.readTree(cStr);
		Assert.checkNull(weightedOverlapRatio(mNode, null));
		//0.0
		System.out.println(weightedOverlapRatio(mNode, mapper.createObjectNode()));
		//0.66
		System.out.println(weightedOverlapRatio(mNode, cNode));
		//field:ratio 0.79
		mStr = "{\"first_cat\": {\"CrimePublicsafety\": 0.7167493775333941, \"PoliticsGovernment\": 0.5099245963202348}, \"second_cat\": {\"CrimePublicsafety_Other\": 0.7167493775333941, \"PoliticsGovernment_Other\": 0.5099245963202348}, \"third_cat\": {}}";
		cStr = "{\"first_cat\": {\"CrimePublicsafety\": 0.7874334454536438}, \"second_cat\": {\"CrimePublicsafety_Other\": 0.7874334454536438}, \"third_cat\": {}}";
		mNode = mapper.readTree(mStr);
		cNode = mapper.readTree(cStr);
		System.out.println("CategoryRatio : " + categoryOverlapRatio(mNode, cNode));
		
		
		/** Geotag Overlap Ratio */
		//1.0
		mStr = "[{\"name\": \"california\", \"score\": 1.0, \"pid\": \"california\", \"type\": \"state\"}, {\"name\": \"norfolk\", \"score\": 0.9934280514717102, \"coord\": \"42.032723,-97.413755\", \"pid\": \"norfolk,nebraska\", \"type\": \"city\"}]";
		cStr = "[{\"name\": \"sheldon\", \"score\": 0.9930974841117859, \"coord\": \"43.181211,-95.856954\", \"pid\": \"sheldon,iowa\", \"type\": \"city\"}, {\"name\": \"o'brien county\", \"score\": 0.9583118557929993, \"coord\": \"43.113124,-95.645795\", \"pid\": \"o'brien_county,iowa\", \"type\": \"county\"}]";
		mNode = mapper.readTree(mStr);
		cNode = mapper.readTree(cStr);
		System.out.println("GEOTag Ratio : " + geotagOverlapRatio(mNode, cNode));
	}
}
