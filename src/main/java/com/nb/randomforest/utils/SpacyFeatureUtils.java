package com.nb.randomforest.utils;
import org.apache.commons.lang3.StringUtils;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.*;

public final class SpacyFeatureUtils extends FeatureUtils{

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
	@Override
	public Double weightedOverlapRatio(JsonNode master, JsonNode candit) {
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
				entity = entity.replace("@", "")
					.replace("\\$", "")
					.replace("%", "")
					.replace("the", "")
					.replace("cents", "")
					.replace("million", "");
				if (entity.contains("^^") || entity.contains(" ") || entity.contains("-") || entity.contains("_")) {
					String[] words = entity.split("(\\^\\^| |-|_)");
					for (String word : words) {
						if (StringUtils.isEmpty(word)) {
							continue;
						}
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
				entity = entity.replace("@", "")
					.replace("\\$", "")
					.replace("%", "")
					.replace("the", "")
					.replace("cents", "")
					.replace("million", "");
				if (entity.contains("^^") || entity.contains(" ") || entity.contains("-") || entity.contains("_")) {
					String[] words = entity.split("(\\^\\^| |-|_)");
					for (String word : words) {
						if (StringUtils.isEmpty(word)) {
							continue;
						}
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
			if (cCache.containsKey(key) && masterTotalNum != 0 && canditTotalNum != 0) {
				weightedOverlapRatio = weightedOverlapRatio + 0.5d * ((mNum / masterTotalNum) + (cNum / canditTotalNum));
			}
		}
		return weightedOverlapRatio;
	}

}