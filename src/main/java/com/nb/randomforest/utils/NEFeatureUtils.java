package com.nb.randomforest.utils;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.*;

public final class NEFeatureUtils extends FeatureUtils{

	/**
	 * ne_content_organization, ne_content_location, ne_content_person,
	 * input : {key:val_int, key:val_int}
	 *
	 * @return \sum{match_key * weight}
	 */
	@Override
	public Double weightedOverlapRatio(JsonNode master, JsonNode candit) {
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
			masterTotalNum += master.get(key).asDouble();
		}
		Iterator<String> itrC = candit.fieldNames();
		while (itrC.hasNext()) {
			String key = itrC.next();
			canditTotalNum += candit.get(key).asDouble();
		}
		Iterator<String> itr = master.fieldNames();
		while (itr.hasNext()) {
			String key = itr.next();
			if (candit.has(key) && masterTotalNum != 0 && canditTotalNum != 0) {
				weightedOverlapRatio = weightedOverlapRatio + 0.5d * (master.get(key).asDouble() / masterTotalNum) + 0.5d * (candit.get(key).asDouble() / canditTotalNum);
			}
		}
		return weightedOverlapRatio;
	}

}