package com.nb.randomforest.entity.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author yuxi
 * @date 2020/10/20
 */
@JsonPropertyOrder({"doc", "label", "score"})
public class RFModelResult {

	private String doc;
	
	private String label;
	
	private Double score;
	
	@JsonCreator
	public RFModelResult(
		@JsonProperty("doc") String doc,
		@JsonProperty("label") String label,
		@JsonProperty("score") Double score
	) {
		this.doc = doc;
		this.label = label;
		this.score = score;
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
	
	@Override
	public String toString() {
		StringBuilder jsonMsg = new StringBuilder();
		jsonMsg.append(String.format("\"doc\":\"%s\"", getDoc()));
		jsonMsg.append(String.format(",\"label\":%s", getLabel()));
		jsonMsg.append(String.format(",\"score\":\"%4.3f\"", getScore()));
		return jsonMsg.toString();
	}
}