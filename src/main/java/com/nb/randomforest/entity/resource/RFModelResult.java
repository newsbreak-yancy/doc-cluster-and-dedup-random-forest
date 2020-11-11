package com.nb.randomforest.entity.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.nb.randomforest.entity.EventFeature;
import org.apache.commons.lang3.StringUtils;

/**
 * @author yuxi
 * @date 2020/10/20
 */
@JsonPropertyOrder({"doc", "label", "score", "feature"})
public class RFModelResult {

	private String doc;
	
	private String label;
	
	private Double score;
	
	private EventFeature feature;
	
	@JsonCreator
	public RFModelResult(
		@JsonProperty("doc") String doc,
		@JsonProperty("label") String label,
		@JsonProperty("score") Double score,
	    @JsonProperty("feature") EventFeature feature
	) {
		this.doc = doc;
		this.label = label;
		this.score = score;
		this.feature = feature;
	}
	
	@JsonProperty("doc")
	public String getDoc() {
		return doc;
	}
	
	public void setDoc(String doc) {
		this.doc = doc;
	}
	
	@JsonProperty("label")
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	@JsonProperty("score")
	public Double getScore() {
		return score;
	}
	
	public void setScore(Double score) {
		this.score = score;
	}
	
	@JsonProperty("feature")
	public EventFeature getFeature() {
		return feature;
	}
	
	public void setFeature(EventFeature feature) {
		this.feature = feature;
	}
	
	
//	@Override
//	public String toString() {
//		StringBuilder jsonMsg = new StringBuilder();
//		jsonMsg.append(String.format("{\"doc\":\"%s\"", getDoc()));
//		jsonMsg.append(String.format(",\"label\":\"%s\"", getLabel()));
//		jsonMsg.append(String.format(",\"score\":%4.3f", getScore()));
//		jsonMsg.append(String.format(",\"feature\":%s}", getFeature()));
//		return jsonMsg.toString();
//	}
	
	public static void main(String[] args) {
		StringBuilder jsonMsg = new StringBuilder();
		jsonMsg.append(String.format("{\"doc\":\"%s\"", "docID"));
		jsonMsg.append(String.format(",\"label\":\"%s\"", "DIFF"));
		jsonMsg.append(String.format(",\"score\":%4.3f", 0.432d));
		jsonMsg.append(String.format(",\"feature\":%s}", "{\"key\":\"val\"}"));
		System.out.println(jsonMsg.toString());
	}
}