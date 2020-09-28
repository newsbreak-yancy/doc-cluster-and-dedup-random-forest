import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
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
	 *
	 * media_id, src
	 */
	public static Boolean isEqual(Object m, Object c) {
		if (m == null || c == null) {
			return null;
		}
		return m.equals(c);
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
	 * <p>
	 * return : 5
	 * <p>
	 * stitle
	 */
	public static Integer levenshteinDistance(String master, String candit) {
		if (StringUtils.isEmpty(master) || StringUtils.isEmpty(candit)) {
			return null;
		}
		return LevenshteinDistance.getDefaultInstance().apply(master, candit);
	}
	
	
	/**
	 * date_long, cword,
	 */
	public static Long longDiff(Long master, Long candit) {
		if (master == null || candit == null) {
			return null;
		}
		return Math.abs(master - candit);
	}
	
	
	/**
	 * simhash,
	 */
	public static Integer simhashDist(String master, String candit) {
		byte[] a = master.getBytes();
		byte[] b = candit.getBytes();
		if (a == null || b == null || a.length != b.length) {
			return null;
		}
		int ret = 0;
		for (int i = 0; i < a.length; i++) {
			int x = a[i] ^ b[i];
			x = (x << 24) >>> 24;
			ret += DIST_MAP[x];
		}
		return ret;
	}
	
	
	/**
	 * ne_content_organization, ne_content_location, ne_content_person,
	 * input : {key:val_int, key:val_int}
	 *
	 * @return \sum{match_key * weight}
	 */
	public static Float weightedOverlapRatio(JsonNode master, JsonNode candit) {
		if (master == null || candit == null || (master.size() == 0 && candit.size() == 0)) {
			return null;
		} else if (master.size() == 0 || candit.size() == 0) {
			return 0f;
		}
		float masterTotalNum = 0f;
		float canditTotalNum = 0f;
		float weightedOverlapRatio = 0;
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
				weightedOverlapRatio = weightedOverlapRatio + 0.5f * (master.get(key).floatValue() / masterTotalNum) + 0.5f * (candit.get(key).floatValue() / canditTotalNum);
			}
		}
		return weightedOverlapRatio;
	}
	
	
	/**
	 * master.findValuesAsText()
	 * <p>
	 * ﻿channels_v2,
	 */
	public static Float overlapRatio(List<String> master, List<String> candit) {
		if (master == null || candit == null || (master.size() == 0 && candit.size() == 0)) {
			return null;
		} else if (master.size() == 0 || candit.size() == 0) {
			return 0f;
		} else {
			float ratio = 0f;
			HashSet<String> _cs = new HashSet<String>(candit);
			for (String _m : master) {
				if (_cs.contains(_m)) {
					ratio += (1f / master.size() + 1f / candit.size()) * 0.5f;
				}
			}
			return ratio;
		}
	}
	
	
	/**
	 *
	 * ﻿text_category_v2
	 */
	public static Float categoryOverlapRatio(JsonNode master, JsonNode candit) {
		if (master == null || candit == null || (master.size() == 0 && candit.size() == 0)) {
			return null;
		} else if (master.size() == 0 || candit.size() == 0) {
			return 0f;
		}
		JsonNode mCatL1 = master.get("first_cat");
		JsonNode mCatL2 = master.get("second_cat");
		JsonNode cCatL1 = candit.get("first_cat");
		JsonNode cCatL2 = candit.get("second_cat");
		Float L1Ratio = weightedOverlapRatio(mCatL1, cCatL1);
		Float L2Ratio = weightedOverlapRatio(mCatL2, cCatL2);
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
	public static Float geotagOverlapRatio() {
		return null;
	}
	
	public static void main(String[] args) throws Exception {
//		/** 编辑距离 */
		System.out.println(levenshteinDistance("master_sequence", "candit_sequence"));



//		/** SimHash Distance */
		System.out.println(simhashDist("dc3e2107ca5962110cb8f66ad15550c3", "dc3c2127c25923110c90f26ef5d550e7"));



//		/** pre process */
		System.out.println(preprocess("B!@#$%^&*()_-+=E?/><.,;:\"'"));
		System.out.println(preprocess("Fantasy Football : Is Bengals ' Joe Burrow worthy of being a QB1 ?"));



//		/** MediaID, SRC isEqual */
		System.out.println(isEqual(58272, 72863));
		System.out.println(isEqual(58272, 58272));
		System.out.println(isEqual(58272, null));
		System.out.println(isEqual("CNN", "CNN"));
		System.out.println(isEqual("CNN", "MSN"));



//		/** OverlapRatio */
		Assert.checkNull(overlapRatio(Collections.<String>emptyList(), Collections.<String>emptyList()));
		Assert.checkNonNull(overlapRatio(Arrays.asList(new String[]{"TEST"}), Collections.<String>emptyList()));
		String[] mArray = new String[]{"Bengals", "Fantasy^^Football", "Fantasy^^Football^^players", "QB1^^potential", "Chargers", "NFL", "Ravens", "Colts", "Browns", "Steelers", "Fantasy^^Football^^owners", "quarterback", "the^^game", "Titans", "football^^team", "Jaguars", "Cleveland^^Browns", "Eagles", "Aaron^^Rodgers", "lineups"};
		String[] cArray = new String[]{"completions", "Joe^^Burrow", "quarterback", "games", "the^^Eagles", "Bengals", "rookies", "Kyler^^Murray", "Joe", "Arizona"};
		System.out.println(overlapRatio(Arrays.asList(mArray), Arrays.asList(cArray)));
		mArray = new String[]{"Amber^^Alert", "Giselle^^Torres", "Amber^^Alert^^UPDATE", "state^^police", "police", "Montgomery^^County", "eastern^^Pennsylvania", "KDKA", "ELKINS^^PARK"};
		cArray = new String[]{"Amber^^Alert^^UPDATE", "Amber^^Alert", "Police", "Pennsylvania^^State^^Police", "Montgomery^^County", "man", "brown^^hair", "Giselle^^Torres", "supporting^^lehighvalleylive.com", "Juan^^Pablo^^Torres", "Kurt^^Bresswein", "brown^^eyes", "Hispanic^^male", "Elkins^^Park", "kbresswein@lehighvalleylive.com", "STATEWIDE", "purple^^tights", "body^^armor", "glasses", "face"};
		System.out.println(overlapRatio(Arrays.asList(mArray), Arrays.asList(cArray)));
		mArray = new String[]{"UPDATE", "said", "STATEWIDE", "UPDATE", "located", "canceled", "Thank", "Police", "@PAStatePolice", "-RRB-", "September", "ARTICLE", "issued", "seen", "issued", "Department", "-RRB-", "searching", "seen", "Park", "reported", "is", "contact", "go", "ElkinsPark", "go", "Alert", "-RRB-", "Thank", "consider", "reached", "Note", "earn"};
		cArray = new String[]{"PARK", "say", "STATEWIDE", "UPDATE", "located", "canceled", "Thank", "Police", "@PAStatePolice", "-RRB-", "September", "say", "say", "say", "said", "say"};
		System.out.println(overlapRatio(Arrays.asList(mArray), Arrays.asList(cArray)));
		


//		/** Weighted OverlapRatio */
		//field:num
		ObjectMapper mapper = new ObjectMapper();
		String mStr = "{ \"Greece\" : 10, \"Greeces\" : 5}";
		String cStr = "{ \"Greece\" : 4, \"Greecess\" : 2}";
		JsonNode mNode = mapper.readTree(mStr);
		JsonNode cNode = mapper.readTree(cStr);
		Assert.checkNull(weightedOverlapRatio(mNode, null));
		System.out.println(weightedOverlapRatio(mNode, mapper.createObjectNode()));
		System.out.println(weightedOverlapRatio(mNode, cNode));
		//field:ratio
		mStr = "{ \"first_cat\" : { \"PoliticsGovernment\" : 0.652442183536019, \"World\" : 0.659761085388675 }, \"second_cat\" : { \"PoliticsGovernment_Other\" : 0.652442183536019, \"World_Other\" : 0.659761085388675 }, \"third_cat\" : {} }";
		cStr = "{ \"first_cat\" : { \"PoliticsGovernment\" : 0.604648660488682, \"World\" : 0.760145097526163 }, \"second_cat\" : { \"World_Europe\" : 0.686309484917385, \"PoliticsGovernment_Other\" : 0.604648660488682 }, \"third_cat\" : { \"World_Europe_Other\" : 0.686309484917385 }}";
		mNode = mapper.readTree(mStr);
		cNode = mapper.readTree(cStr);
		System.out.println(categoryOverlapRatio(mNode, cNode));
		
		
	}
}
