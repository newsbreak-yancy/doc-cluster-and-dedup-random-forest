package com.nb.randomforest.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.nb.randomforest.entity.EventFeature;
import com.nb.randomforest.entity.resource.RFModelResult;
import com.nb.randomforest.utils.ModelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import weka.classifiers.trees.RandomForest;
import weka.core.Attribute;
import weka.core.Instances;

import java.util.*;

/**
 * @author yuxi
 * @date 2020/10/9
 */
@Service
public class DocumentService {
	
	@Autowired
	RandomForest randomForest;
	
	
	/**
	 */
	public List<RFModelResult> calCandidatesClusterInfo(JsonNode masterNode, JsonNode canditNodes) {
		try {
			Instances instances;
			ArrayList<String> attVals = new ArrayList<>();
			ArrayList<Attribute> attributes = new ArrayList<>();
			// - numeric
			attributes.add(new Attribute("TitleDist"));
			attributes.add(new Attribute("SameSRC"));
			attributes.add(new Attribute("CWordSpan"));
			attributes.add(new Attribute("EpochSpan"));
			attributes.add(new Attribute("ParghSpan"));
			attributes.add(new Attribute("SimhashDist"));
			attributes.add(new Attribute("KWSRatio"));
			attributes.add(new Attribute("ChannelRatio"));
			attributes.add(new Attribute("COrgOverlapRatio"));
			attributes.add(new Attribute("CLocOverlapRatio"));
			attributes.add(new Attribute("CPrsOverlapRatio"));
			attributes.add(new Attribute("TOrgOverlapRatio"));
			attributes.add(new Attribute("TLocOverlapRatio"));
			attributes.add(new Attribute("TPrsOverlapRatio"));
			attributes.add(new Attribute("CatOverlapRatio"));
			attributes.add(new Attribute("GEOOverlapRatio"));
			// - nominal
			attVals.add("DIFF");
			attVals.add("EVENT");
			attVals.add("DUP");
			attributes.add(new Attribute("Label", attVals));
			// 2. create Instances object
			instances = new Instances(UUID.randomUUID().toString(), attributes, 1);
			instances.setClassIndex(instances.numAttributes() - 1);
			for (JsonNode canditNode : canditNodes) {
				instances.add(new EventFeature(masterNode, canditNode, null).toInstance());
			}
			// 3.
			List<RFModelResult> cls = new ArrayList<>();
			double[][] canditResults = randomForest.distributionsForInstances(instances);
			for (int j = 0; j < canditResults.length; j++) {
				double[] canditResult = canditResults[j];
				int max = 0;
				for (int i = 1; i < canditResult.length; i++) {
					if (canditResult[i] > canditResult[max]) {
						max = i;
					}
				}
				String cID = canditNodes.get(j).hasNonNull("_id") ? canditNodes.get(j).get("_id").textValue() : "";
				cls.add(new RFModelResult(cID, attVals.get(max), canditResult[max]));
			}
			return cls;
		} catch (Exception e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
	}
}
