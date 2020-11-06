package com.nb.randomforest.entity;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import weka.core.*;

import java.util.ArrayList;
import java.util.List;

import static com.nb.randomforest.utils.FeatureUtils.*;


/**
 * 模型训练数据特征. 包含对应的 序列化 及 实例化方法.
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
    	if (!StringUtils.isEmpty(label) && !label.equals("DIFF") && !label.equals("EVENT") && !label.equals("DUP")) {
    		throw new Exception("Invalid Label! Required DIFF, EVENT , DUP or null.");
	    }
        this.label = label;
	    
	    String mTitle = preprocess(
	    	masterNode.hasNonNull("stitle") ? masterNode.get("stitle").textValue() : masterNode.hasNonNull("seg_title") ? masterNode.get("seg_title").textValue() : ""
	    );
	    String cTitle = preprocess(
		    canditNode.hasNonNull("stitle") ? canditNode.get("stitle").textValue() : canditNode.hasNonNull("seg_title") ? canditNode.get("seg_title").textValue() : ""
	    );
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
	
	public Instance toInstance() {
		List<Double> doubleList = new ArrayList<>();
		doubleList.add(titleDist);
		doubleList.add(sameSRC);
		doubleList.add(cWordSpan);
		doubleList.add(epochSpan);
		doubleList.add(parghSpan);
		doubleList.add(simhashDist);
		doubleList.add(kwsRatio);
		doubleList.add(channelRatio);
		doubleList.add(cOrgOverlapRatio);
		doubleList.add(cLocOverlapRatio);
		doubleList.add(cPrsOverlapRatio);
		doubleList.add(tOrgOverlapRatio);
		doubleList.add(tLocOverlapRatio);
		doubleList.add(tPrsOverlapRatio);
		doubleList.add(catOverlapRatio);
		doubleList.add(geoOverlapRatio);
		doubleList.add((StringUtils.isEmpty(label) || StringUtils.equals(label, "DIFF")) ? 0d : StringUtils.equals(label, "DIFF") ? 1d : 2d);
		double[] doubleArray = doubleList.stream().mapToDouble(d -> d == null ? Utils.missingValue() : d.doubleValue()).toArray();
		return new DenseInstance(1, doubleArray);
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
		sb.append(StringUtils.isEmpty(label) ? "?" : label);
    	return sb.toString();
	}
	
	
	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		String mStr = "{\"_id\": \"0WxXFOiG\", \"c_word\": 184, \"channels_v2\": [\"Ohio^^Stadium\", \"Ohio^^State\", \"Home^^Game\", \"Buckeye\", \"Football^^Season\", \"Football\", \"Ohio\"], \"epoch\": {\"$numberLong\": \"1599975420\"}, \"geotag_v2\": [{\"name\": \"columbus\", \"score\": 1.0, \"coord\": \"39.961176,-82.998794\", \"pid\": \"columbus,ohio\", \"type\": \"city\"}], \"kws\": [\"Buckeye^^football^^fans\", \"football^^fans\", \"football^^season\", \"Ohio^^Stadium\", \"home^^game\", \"Ohio^^State^^University\", \"COLUMBUS\", \"happy\", \"fall\", \"Competition^^Task^^Force\", \"petitions\"], \"ne_content_location\": {\"Buckeye\": 1, \"Ohio\": 2, \"COLUMBUS\": 1, \"Ohio Stadium\": 1}, \"ne_content_organization\": {\"Competition Task Force\": 1, \"Ohio State\": 1, \"Ohio State University\": 1, \"Associated Press\": 1}, \"ne_content_person\": {}, \"ne_title_location\": {\"Buckeye\": 1}, \"ne_title_organization\": {}, \"ne_title_person\": {}, \"paragraph_count\": 7.0, \"simhash\": \"9a9543b818dcd5c37b9ee3b2e2e4778b\", \"src\": \"WTOL-TV\", \"stitle\": \"Buckeye fans disappointed to not have football for what would have been first home game\", \"text_category_v2\": {\"first_cat\": {\"Sports\": 0.9428178147314257}, \"second_cat\": {\"Sports_AmericanFootball\": 0.7154466756639957, \"Sports_College\": 0.6156932023454093}, \"third_cat\": {\"Sports_AmericanFootball_Other\": 0.7154466756639957, \"Sports_College_Other\": 0.6156932023454093}}}";
		String cStr = "{\"_id\": \"0WoFOOxs\", \"c_word\": 193, \"channels_v2\": [\"Ohio^^State^^football\", \"Ohio^^State\", \"Shooting\", \"Defensive^^Tackle\", \"Chittenden\", \"Vermont\", \"Shell^^Casings\", \"Garrett\"], \"epoch\": {\"$numberLong\": \"1598791224\"}, \"geotag_v2\": [{\"name\": \"ohio\", \"score\": 1.0, \"pid\": \"ohio\", \"type\": \"state\"}, {\"name\": \"columbus\", \"score\": 0.989151120185852, \"coord\": \"39.961176,-82.998794\", \"pid\": \"columbus,ohio\", \"type\": \"city\"}], \"kws\": [\"Ohio^^State^^football\", \"Ohio^^State^^University\", \"Columbus^^Police\", \"shooting\", \"Columbus^^Fire\", \"Police\", \"COLUMBUS\", \"22-year-old^^Garrett^^suffering\", \"suspect\", \"East^^11th^^Avenue\", \"Chittenden^^Ave.^^Officers\", \"Fire\", \"Haskell^^Garrett\", \"Vermont\", \"ABC\", \"Stubblefield\", \"Haskell\", \"614-461-TIPS\"], \"ne_content_location\": {\"Vermont\": 1, \"Chittenden\": 1, \"Ohio\": 2, \"East 11th Avenue\": 1, \"COLUMBUS\": 1, \"Ohio State Football\": 1}, \"ne_content_organization\": {\"Columbus Fire\": 1, \"Ohio State University Hospital\": 1, \"ABC\": 1, \"Columbus Police\": 2, \"Columbus Police Felony Assault Detective Stubblefield\": 1, \"Ohio State\": 1, \"Central Ohio Crime Stoppers\": 1}, \"ne_content_person\": {\"Haskell Garrett\": 1, \"Garrett\": 3}, \"ne_title_location\": {}, \"ne_title_organization\": {\"Ohio State\": 1}, \"ne_title_person\": {}, \"paragraph_count\": 8.0, \"simhash\": \"4fe1f8bba9e9102229d9a2912860771e\", \"src\": \"myfox28columbus.com\", \"stitle\": \"Ohio State football player injured in overnight shooting near campus\", \"text_category_v2\": {\"first_cat\": {\"CrimePublicsafety\": 0.6951286280185068, \"Sports\": 0.8214851472643709}, \"second_cat\": {\"CrimePublicsafety_ViolentCrime\": 0.6015757232239475, \"Sports_Other\": 0.8214851472643709}, \"third_cat\": {\"CrimePublicsafety_ViolentCrime_Other\": 0.6015757232239475}}}";
		JsonNode mNode = mapper.readTree(mStr);
		JsonNode cNode = mapper.readTree(cStr);
		EventFeature feature = new EventFeature(mNode, cNode, "");
		System.out.println(feature);
		System.out.println(feature.toInstance());
		//69.0,0.0,9.0,0.0,1.0,81.0,0.14646464646464646,0.13392857142857142,0.1875,0.5142857142857142,0.0,0.0,0.0,?,0.3854143638657179,0.75,DIFF
	}
}
