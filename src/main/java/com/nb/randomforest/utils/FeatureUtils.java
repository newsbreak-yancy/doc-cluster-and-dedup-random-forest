package com.nb.randomforest.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.similarity.LevenshteinDistance;

import java.util.*;

/**
 * @author yuxi
 * @date 2020/9/27
 */
public abstract class FeatureUtils {
	
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
	public Double isEqual(Object m, Object c) {
		if (m == null || c == null) {
			return null;
		}
		return m.equals(c) ? 1d : 0d;
	}
	
	
	/**
	 * 编辑距离前的预处理 or overlap 前的预处理
	 * stitle,
	 */
	public String preprocess(String pre) {
		return pre.toLowerCase().replaceAll("[!-`]", ""); // ASC ii Table  :8)
	}
	
	
	/**
	 * input : "master_sequence" , "candit_sequence"
	 * return : 5
	 * stitle
	 */
	public Double levenshteinDistance(String master, String candit) {
		if (StringUtils.isEmpty(master) || StringUtils.isEmpty(candit)) {
			return null;
		}
		return new Double(LevenshteinDistance.getDefaultInstance().apply(master, candit));
	}
	
	
	/**
	 * epoch, cword, paragraph_num
	 */
	public Double numSpan(JsonNode master, JsonNode candit) {
		if (master == null || candit == null) {
			return null;
		}
		return new Double(Math.abs(master.asLong() - candit.asLong()));
	}
	
	
	/**
	 * simhash,
	 */
	public Double simhashDist(JsonNode master, JsonNode candit) {
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
	
	public abstract Double weightedOverlapRatio(JsonNode master, JsonNode candit);
	
	/**
	 * master.findValuesAsText()
	 * <p>
	 * ﻿channels_v2,
	 */
	public Double overlapRatio(JsonNode master, JsonNode candit) {
		if (master == null || candit == null || (master.size() == 0 && candit.size() == 0)) {
			return null;
		} else if (master.size() == 0 || candit.size() == 0) {
			return 0d;
		} else {
			double ratio = 0d;
			HashSet<String> _ms = new HashSet<>();
			for (JsonNode _m : master) {
				_ms.add(_m.asText());
			}
			HashSet<String> _cs = new HashSet<>();
			for (JsonNode _c : candit) {
				_cs.add(_c.asText());
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
	public Double categoryOverlapRatio(JsonNode master, JsonNode candit) {
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
	public Double geotagOverlapRatio(JsonNode master, JsonNode candit) {
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
}