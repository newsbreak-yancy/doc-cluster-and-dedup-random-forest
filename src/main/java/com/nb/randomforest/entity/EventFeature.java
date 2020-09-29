package com.nb.randomforest.entity;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import weka.core.DenseInstance;
import weka.core.Instance;

import java.util.ArrayList;
import java.util.List;

import static com.nb.randomforest.utils.FeatureUtils.*;


/**
 *
 */
public class EventFeature {
	
    private String label;
	
	/**
	 * Levenshtein Distance
	 */
	private Double titleDist;
	
	/**
	 * Is Same
	 */
	private Double sameSRC;
    
	/**
	 * Number Span
	 */
	private Double cWordSpan;
    
    private Double epochSpan;
    
    private Double parghSpan;
	
	/**
	 * Simhash Distance
	 */
	private Double simhashDist;
    
    /**
     * OverlapRatio
     */
    private Double kwsRatio;
    
	private Double channelRatio;
	
	/**
	 * Weighted Overlap Ratio
	 */
	private Double cOrgOverlapRatio;
	
	private Double cLocOverlapRatio;
	
	private Double cPrsOverlapRatio;
	
	private Double tOrgOverlapRatio;
	
	private Double tLocOverlapRatio;
	
	private Double tPrsOverlapRatio;
	
	/**
	 * Category Overlap Ratio
	 */
	private Double catOverlapRatio;
	
	/**
	 * Geotag_v2 Overlap Ratio
	 */
	private Double geoOverlapRatio;
	

    public EventFeature(JsonNode masterNode, JsonNode canditNode, String label) throws Exception {
    	if (!label.equals("DIFF") && !label.equals("EVENT") && !label.equals("DUP")) {
    		throw new Exception("Invalid Label! Required DIFF, EVENT or DUP.");
	    }
        this.label = StringUtils.isEmpty(label) ? "DIFF" : label;
        
	    String mTitle = preprocess(masterNode.get("stitle").textValue());
	    String cTitle = preprocess(canditNode.get("stitle").textValue());
        this.titleDist = levenshteinDistance(mTitle, cTitle);
        
        this.sameSRC = isEqual(masterNode.get("src").textValue(), canditNode.get("src").textValue());
        
        this.cWordSpan = numSpan(masterNode.get("c_word"), canditNode.get("c_word"));
	
        JsonNode mEpoch;
        JsonNode cEpoch;
	    if (masterNode.get("epoch").isNumber()) {
	    	mEpoch = masterNode.get("epoch");
	    } else {
		    mEpoch = masterNode.get("epoch").get("$numberLong");
	    }
	    if (canditNode.get("epoch").isNumber()) {
		    cEpoch = canditNode.get("epoch");
	    } else {
		    cEpoch = canditNode.get("epoch").get("$numberLong");
	    }
	    this.epochSpan = numSpan(mEpoch, cEpoch);
	    
	    this.parghSpan = numSpan(masterNode.get("paragraph_count"), canditNode.get("paragraph_count"));
	    
	    this.simhashDist = simhashDist(masterNode.get("simhash"), canditNode.get("simhash"));
	    
	    this.kwsRatio = overlapRatio(masterNode.get("kws"), canditNode.get("kws"));

	    JsonNode mChannel = masterNode.has("channels_v2") ? masterNode.get("channels_v2") : masterNode.get("channels");
	    JsonNode cChannel = canditNode.has("channels_v2") ? canditNode.get("channels_v2") : canditNode.get("channels");
	    this.channelRatio = overlapRatio(mChannel, cChannel);
	    
	    this.cOrgOverlapRatio = weightedOverlapRatio(masterNode.get("ne_content_organization"), canditNode.get("ne_content_organization"));
	    this.cLocOverlapRatio = weightedOverlapRatio(masterNode.get("ne_content_location"), canditNode.get("ne_content_location"));
	    this.cPrsOverlapRatio = weightedOverlapRatio(masterNode.get("ne_content_person"), canditNode.get("ne_content_person"));
	    this.tOrgOverlapRatio = weightedOverlapRatio(masterNode.get("ne_title_organization"), canditNode.get("ne_title_organization"));
	    this.tLocOverlapRatio = weightedOverlapRatio(masterNode.get("ne_title_location"), canditNode.get("ne_title_location"));
	    this.tPrsOverlapRatio = weightedOverlapRatio(masterNode.get("ne_title_person"), canditNode.get("ne_title_person"));
	    
	    JsonNode mCategory = masterNode.has("text_category_v2") ? masterNode.get("text_category_v2") : masterNode.get("text_category");
	    JsonNode cCategory = canditNode.has("text_category_v2") ? canditNode.get("text_category_v2") : canditNode.get("text_category");
	    this.catOverlapRatio = categoryOverlapRatio(mCategory, cCategory);
	    
	    JsonNode mGeo = masterNode.has("geotag_v2") ? masterNode.get("geotag_v2") : masterNode.get("geotag");
	    JsonNode cGeo = canditNode.has("geotag_v2") ? canditNode.get("geotag_v2") : canditNode.get("geotag");
	    this.geoOverlapRatio = geotagOverlapRatio(mGeo, cGeo);
    }
	
	public String getLabel() {
		return label;
	}
	
	public Double getTitleDist() {
		return titleDist;
	}
	
	public Double getSameSRC() {
		return sameSRC;
	}
	
	public Double getcWordSpan() {
		return cWordSpan;
	}
	
	public Double getEpochSpan() {
		return epochSpan;
	}
	
	public Double getParghSpan() {
		return parghSpan;
	}
	
	public Double getSimhashDist() {
		return simhashDist;
	}
	
	public Double getKwsRatio() {
		return kwsRatio;
	}
	
	public Double getChannelRatio() {
		return channelRatio;
	}
	
	public Double getcOrgOverlapRatio() {
		return cOrgOverlapRatio;
	}
	
	public Double getcLocOverlapRatio() {
		return cLocOverlapRatio;
	}
	
	public Double getcPrsOverlapRatio() {
		return cPrsOverlapRatio;
	}
	
	public Double gettOrgOverlapRatio() {
		return tOrgOverlapRatio;
	}
	
	public Double gettLocOverlapRatio() {
		return tLocOverlapRatio;
	}
	
	public Double gettPrsOverlapRatio() {
		return tPrsOverlapRatio;
	}
	
	public Double getCatOverlapRatio() {
		return catOverlapRatio;
	}
	
	public Double getGeoOverlapRatio() {
		return geoOverlapRatio;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titleDist == null ? "?" : this.titleDist.toString());
		sb.append(",");
		sb.append(sameSRC == null ? "?" : sameSRC.toString());
		sb.append(",");
		sb.append(cWordSpan == null ? "?" : cWordSpan.toString());
		sb.append(",");
		sb.append(epochSpan == null ? "?" : epochSpan.toString());
		sb.append(",");
		sb.append(parghSpan == null ? "?" : parghSpan.toString());
		sb.append(",");
		sb.append(simhashDist == null ? "?" : simhashDist.toString());
		sb.append(",");
		sb.append(kwsRatio == null ? "?" : kwsRatio.toString());
		sb.append(",");
		sb.append(channelRatio == null ? "?" : channelRatio.toString());
		sb.append(",");
		sb.append(cOrgOverlapRatio == null ? "?" : cOrgOverlapRatio.toString());
		sb.append(",");
		sb.append(cLocOverlapRatio == null ? "?" : cLocOverlapRatio.toString());
		sb.append(",");
		sb.append(cPrsOverlapRatio == null ? "?" : cPrsOverlapRatio.toString());
		sb.append(",");
		sb.append(tOrgOverlapRatio == null ? "?" : tOrgOverlapRatio.toString());
		sb.append(",");
		sb.append(tLocOverlapRatio == null ? "?" : tLocOverlapRatio.toString());
		sb.append(",");
		sb.append(tPrsOverlapRatio == null ? "?" : tPrsOverlapRatio.toString());
		sb.append(",");
		sb.append(catOverlapRatio == null ? "?" : catOverlapRatio.toString());
		sb.append(",");
		sb.append(geoOverlapRatio == null ? "?" : geoOverlapRatio.toString());
		sb.append(",");
		sb.append(this.label);
    	return sb.toString();
	}
	
	
	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		String mStr = "{ \"_id\" : \"0X85M4HW\", \"c_word\" : 2105, \"channels\" : [ \"Rob^^Manfred\", \"Major^^League^^Baseball\", \"Houston^^Astros\", \"Marlins^^Park\", \"Sports^^Fans\" ], \"channels_v2\" : [ \"Rob^^Manfred\", \"Washington^^Nationals\", \"MLB\", \"World^^Series\", \"Anthony^^Fauci\", \"Nationals^^Park\", \"Mets\", \"Houston^^Astros\", \"Coronavirus\", \"NIAID\", \"MLBPA\" ], \"dup_id\" : \"0X85M4HW\", \"epoch\" : 1601285400, \"evt_id\" : \"0X85M4HW\", \"geotag\" : [], \"geotag_v2\" : [], \"insert_time\" : \"2020-09-28 23:59:56\", \"kws\" : [ \"Rob^^Manfred\", \"everywhere^^Manfred\", \"AD^^Manfred\", \"baseball^^sound\", \"MLB^^facilities\", \"MLB^^staffers\", \"Houston^^Astros\", \"NBA^^Commissioner\", \"St.^^Louis^^Cardinals\", \"Nationals^^fans\", \"Miami^^Marlins\", \"ESPN\", \"World^^Series\", \"ballparks\", \"Turner^^Sports\", \"Nationals^^Park\", \"field\", \"division^^champions\", \"Washington^^Nationals\", \"seven-inning^^doubleheaders\" ], \"nbr_id\" : \"0X8VzrUo\", \"ne_content_location\" : { \"Manhattan\" : 1, \"Florida\" : 1, \"United States\" : 1, \"Washington\" : 1, \"Arizona\" : 1 }, \"ne_content_organization\" : { \"MLB\" : 12, \"Miami Marlins\" : 1, \"Houston Astros\" : 1, \"ESPN\" : 1, \"St. Louis Cardinals\" : 1, \"MLB Players Association\" : 1, \"Washington Post\" : 1, \"New York Yankees\" : 1, \"Mets\" : 1, \"Washington Nationals\" : 1, \"National Institute of Allergy\" : 1, \"Turner Sports\" : 1, \"Turner\" : 1, \"New York Mets\" : 1 }, \"ne_content_person\" : { \"Bud Selig\" : 1, \"Manfred\" : 27, \"Tony Clark\" : 1, \"Juan Soto\" : 1, \"Clark\" : 1, \"Steve Cohen\" : 2, \"Boswell\" : 1, \"Anthony S. Fauci\" : 1, \"Adam Silver\" : 1, \"Rob Manfred\" : 1 }, \"ne_title_location\" : {}, \"ne_title_organization\" : { \"MLB\" : 1 }, \"ne_title_person\" : { \"Rob Manfred\" : 1 }, \"paragraph_count\" : 49.0, \"simhash\" : \"a9f18b3a56aa283e49e34ed342d78cef\", \"src\" : \"Washington Post\", \"stitle\" : \"MLB 's Rob Manfred made it through an impossible season , but more challenges are on the horizon\", \"text_category\" : { \"first_cat\" : { \"Sports\" : 1.0 }, \"second_cat\" : { \"Sports_Baseball\" : 1.0 }, \"third_cat\" : { \"Sports_Baseball_MLB\" : 1.0 } }, \"text_category_v2\" : { \"first_cat\" : { \"Sports\" : 0.941075914832352 }, \"second_cat\" : { \"Sports_Baseball\" : 0.790484123043825 }, \"third_cat\" : { \"Sports_Baseball_MLB\" : 0.652476554009993 } }, \"url\" : \"https://www.washingtonpost.com/sports/2020/09/28/rob-manfred-mlb-season/\"}";
		String cStr = "{ \"_id\" : \"0X8VzrUo\", \"c_word\" : 705, \"channels\" : [ \"Rob^^Manfred\", \"Go^^Game\", \"End^^Game\", \"Heyman\", \"Time^^Inc.\" ], \"channels_v2\" : [ \"Rob^^Manfred\", \"MLB\", \"Jon^^Heyman\", \"Inning\", \"Baseball\" ], \"dup_id\" : \"0X85M4HW\", \"epoch\" : 1601326562, \"evt_id\" : \"0X85M4HW\", \"geotag\" : [], \"geotag_v2\" : [], \"insert_time\" : \"2020-09-28 23:23:36\", \"kws\" : [ \"Rob^^Manfred\", \"MLB\", \"Manfred^^envisions^^baseball\", \"the^^game\", \"host^^Jon^^Heyman\", \"umpires\", \"Heyman\", \"field\", \"Time\", \"long^^haul\", \"podcast\", \"instant^^replay\", \"RADIO.COM\", \"correct^^egregious^^calls\", \"strategy\", \"base\" ], \"nbr_id\" : \"0X85M4HW\", \"ne_content_location\" : {}, \"ne_content_organization\" : { \"National League\" : 1, \"MLB\" : 2 }, \"ne_content_person\" : { \"Jon Heyman\" : 1, \"Manfred\" : 5, \"Heyman\" : 1, \"Rob Manfred\" : 1 }, \"ne_title_location\" : {}, \"ne_title_organization\" : { \"MLB\" : 1 }, \"ne_title_person\" : { \"Rob Manfred\" : 1 }, \"paragraph_count\" : 15.0, \"simhash\" : \"a8f98b32f6a8993b43454ed3c297898f\", \"src\" : \"106.7 The Fan\", \"stitle\" : \"Rob Manfred thinks MLB 's extra inning rule has ` best chance of surviving '\", \"text_category\" : { \"first_cat\" : { \"Sports\" : 1.00000250339508 }, \"second_cat\" : { \"Sports_Baseball\" : 1.00000250339508 }, \"third_cat\" : { \"Sports_Baseball_MLB\" : 1.0 } }, \"text_category_v2\" : { \"first_cat\" : { \"Sports\" : 0.91839396223298 }, \"second_cat\" : { \"Sports_Baseball\" : 0.860505186415285 }, \"third_cat\" : { \"Sports_Baseball_MLB\" : 0.693972168339976 } }, \"url\" : \"https://www.radio.com/sports/mlb/rob-manfred-extra-inning-rule-has-best-chance-of-surviving\"}";
		JsonNode mNode = mapper.readTree(mStr);
		JsonNode cNode = mapper.readTree(cStr);
		System.out.println(new EventFeature(mNode, cNode, "DUP"));
	}
}
