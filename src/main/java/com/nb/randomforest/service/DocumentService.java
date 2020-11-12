package com.nb.randomforest.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.nb.randomforest.entity.EventFeature;
import com.nb.randomforest.entity.resource.RFModelResult;
import com.nb.randomforest.utils.MyAttributeBuilder;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.BooleanUtils;
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
@Slf4j
public class DocumentService {
	
	@Autowired
	ObjectMapper mapper;
	
	@Autowired
	RandomForest randomForest;
	
	
	@Autowired
	StorageService storageService;
	
	/**
	 */
	public List<RFModelResult> calCandidatesClusterInfo(JsonNode masterNode, JsonNode canditNodes, Boolean isDebug) {
		try {
			// 1.
			Instances instances;
			List<EventFeature> features = new ArrayList<>();
			ArrayList<Attribute> attributes = MyAttributeBuilder.buildMyAttributes();
			
			// 2. create Instances object
			instances = new Instances(UUID.randomUUID().toString(), attributes, 1);
			int classIndex = instances.numAttributes() - 1;
			instances.setClassIndex(classIndex);
			for (JsonNode canditNode : canditNodes) {
				EventFeature feature = new EventFeature(masterNode, canditNode, null);
				features.add(feature);
				instances.add(feature.toInstance());
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
				cls.add(new RFModelResult(
					cID, attributes.get(classIndex).value(max), canditResult[max],
					BooleanUtils.isTrue(isDebug) ? features.get(j) : null
				));
			}
			return cls;
		} catch (Exception e) {
			log.info("EXCEPTION : CAL_CANDIDATES : " + e.getMessage(), e);
			return Collections.emptyList();
		}
	}
	
	
	public List<RFModelResult> calCandidatesClusterDetails(String mID, List<String> cIDs) {
		try {
			Map<String, JsonNode> docNodes = storageService.findDocInfos(mID, cIDs);
			JsonNode mNode = docNodes.get(mID);
			ArrayNode cNodes = mapper.createArrayNode();
			for (String cID : cIDs) {
				cNodes.add(docNodes.get(cID));
			}
			return this.calCandidatesClusterInfo(mNode, cNodes, true);
		} catch (Exception e) {
			e.printStackTrace();
			log.info("EXCEPTION : CAL_CANDIDATES : " + e.getMessage(), e);
			return Collections.emptyList();
		}
	}
}
