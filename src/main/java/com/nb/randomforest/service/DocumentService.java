package com.nb.randomforest.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.nb.randomforest.entity.EventFeature;
import com.nb.randomforest.entity.resource.RFModelResult;
import com.nb.randomforest.utils.MyAttributeBuilder;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import weka.classifiers.trees.RandomForest;
import weka.core.Attribute;
import weka.core.Instances;

import java.util.*;

import static com.nb.randomforest.utils.FeatureUtils.stringPreprocess;

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
	 *
	 */
	public List<RFModelResult> calCandidatesClusterInfo(JsonNode masterNode, JsonNode canditNodes, Boolean isDebug) {
		try {
			// 1.预处理
			Instances instances;
			List<EventFeature> features = new ArrayList<>();
			ArrayList<Attribute> attributes = MyAttributeBuilder.buildMyAttributesV1();
			String mTitle = stringPreprocess(
				masterNode.hasNonNull("stitle") ? masterNode.get("stitle").textValue() :
					masterNode.hasNonNull("seg_title") ? masterNode.get("seg_title").textValue() : ""
			);
			boolean isRoyal = false;
			boolean isCelebrities = false;
			boolean isEconomyMarkets = false;
			if (masterNode.hasNonNull("text_category") && masterNode.get("text_category").hasNonNull("second_cat")) {
				JsonNode secondCatNode = masterNode.get("text_category").get("second_cat");
				Iterator<String> itr = secondCatNode.fieldNames();
				while (itr.hasNext()) {
					String key = itr.next();
					if (StringUtils.equals("BusinessEconomy_Markets", key)){
						isEconomyMarkets = true;
					} else if (StringUtils.equals("ArtsEntertainment_Celebrities", key)) {
						isCelebrities = true;
//						if (
//							mTitle.contains("prince") || mTitle.contains("royal") || mTitle.contains("buckingham") ||
//							(mTitle.contains("harry") && mTitle.contains("meghan")) || mTitle.contains("duke") || mTitle.contains("duchess")
//						) {
//							isRoyal = true;
//						}
					}
				}
			}
			
			// 2. prepare instances for RFModel
			instances = new Instances(UUID.randomUUID().toString(), attributes, 1);
			int classIndex = instances.numAttributes() - 1;
			instances.setClassIndex(classIndex);
			for (JsonNode canditNode : canditNodes) {
				EventFeature feature = new EventFeature(masterNode, canditNode, null);
				features.add(feature);
				instances.add(feature.toInstanceV1());
			}
			
			// 3.模型结果后处理 + 卡阈值
			List<RFModelResult> cls = new ArrayList<>();
			double[][] canditResults = randomForest.distributionsForInstances(instances);
			for (int j = 0; j < canditResults.length; j++) {
				double[] canditResult = canditResults[j];
				EventFeature feature = features.get(j);
				String cID = canditNodes.get(j).hasNonNull("_id") ? canditNodes.get(j).get("_id").textValue() : "";
				String label;
				double diffScore = canditResult[0];
				double evtScore = canditResult[1];
				double score;
				//模型结果后处理
				if (
					(isEconomyMarkets && evtScore > 0.98) ||
					(isCelebrities && evtScore > 0.95) ||
					(!isEconomyMarkets && !isCelebrities && evtScore > 0.9) ||
					(feature.getTitleRatio() > 0.5 && feature.getTitleLength() > 4 && evtScore > 0.7)
				) {
					label = "DUP";
					score = evtScore;
				} else if (
					((isEconomyMarkets && evtScore > 0.55) || (!isEconomyMarkets && evtScore > 0.45))
				) {
					label = "EVENT";
					score = evtScore;
				} else {
					label = "DIFF";
					score = diffScore;
				}
				cls.add(new RFModelResult(
					cID, label, score, BooleanUtils.isTrue(isDebug) ? feature : null
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
