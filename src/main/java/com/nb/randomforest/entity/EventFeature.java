package com.nb.randomforest.entity;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import weka.core.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.nb.randomforest.utils.FeatureUtils.*;


/**
 * 模型训练数据特征. 包含对应的 序列化 及 实例化方法.
 */
public class EventFeature {
	
    private String label;
	
	/**
	 * Title
	 *
	 * Levenshtein Distance
	 * Overlap Ratio
	 * Average Length
	 */
	private Double titleDist;
	
	private Double titleRatio;
	
	private Double titleLength;
	
	/**
	 * Is Same Source
	 */
	private Double sameSRC;
    
	/**
	 * Word Count Span
	 */
	private Double cWordSpan;
	
	/**
	 * Paragraph Span
	 */
	private Double paragraphSpan;
	
	/**
	 * Time Span
	 */
	private Double epochSpan;
	
	private Double insertSpan;
	
	/**
	 * Simhash Distance
	 */
	private Double simhashDist;
    
    /**
     * Content Keywords
     *
     * Overlap Ratio
     * Average Length
     */
    private Double cKWSRatio;
	
	private Double cKWSLength;
	
	/**
	 * Title Keywords
	 *
	 * Overlap Ratio
	 * Average Length
	 */
	private Double tKWSRatio;
	
	private Double tKWSLength;
	
	/**
	 * HighLight Keywords
	 *
	 * Overlap Ratio
	 * Average Length
	 */
	private Double hKWSRatio;
	
	private Double hKWSLength;
	
	/**
	 * Channels
	 *
	 * Overlap Ratio
	 * Average Length
	 */
	private Double channelRatio;
	
	private Double channelLength;
	
	/**
	 * Content Organization
	 *
	 * NE : Weighted Overlap Ratio
	 * SP : Weighted Overlap Ratio
	 * NE : Average Length
	 * SP : Average Length
	 */
	private Double cOrgRatioNE;
	
	private Double cOrgRatioSP;
	
	private Double cOrgLengthNE;
	
	private Double cOrgLengthSP;
	
	/**
	 * Content Location
	 *
	 * NE : Weighted Overlap Ratio
	 * SP : Weighted Overlap Ratio
	 * NE : Average Length
	 * SP : Average Length
	 */
	private Double cLocRatioNE;
	
	private Double cLocRatioSP;
	
	private Double cLocLengthNE;
	
	private Double cLocLengthSP;
	
	/**
	 * Content Person
	 *
	 * NE : Weighted Overlap Ratio
	 * SP : Weighted Overlap Ratio
	 * NE : Average Length
	 * SP : Average Length
	 */
	private Double cPerRatioNE;
	
	private Double cPerRatioSP;
	
	private Double cPerLengthNE;
	
	private Double cPerLengthSP;
	
	/**
	 * Content NUM
	 *
	 * SP : Weighted Overlap Ratio
	 * SP : Average Length
	 */
	private Double cNUMRatioSP;
	
	private Double cNUMLengthSP;
	
	/**
	 * Content Time
	 *
	 * SP : Weighted Overlap Ratio
	 * SP : Average Length
	 */
	private Double cTimRatioSP;
	
	private Double cTimLengthSP;
	
	/**
	 * Title Organization
	 *
	 * NE : Weighted Overlap Ratio
	 * SP : Weighted Overlap Ratio
	 * NE : Average Length
	 * SP : Average Length
	 */
	private Double tOrgRatioNE;
	
	private Double tOrgRatioSP;
	
	private Double tOrgLengthNE;
	
	private Double tOrgLengthSP;
	
	/**
	 * Title Location
	 *
	 * NE : Weighted Overlap Ratio
	 * SP : Weighted Overlap Ratio
	 * NE : Average Length
	 * SP : Average Length
	 */
	private Double tLocRatioNE;
	
	private Double tLocRatioSP;
	
	private Double tLocLengthNE;
	
	private Double tLocLengthSP;
	
	/**
	 * Title Person
	 *
	 * NE : Weighted Overlap Ratio
	 * SP : Weighted Overlap Ratio
	 * NE : Average Length
	 * SP : Average Length
	 */
	private Double tPerRatioNE;
	
	private Double tPerRatioSP;
	
	private Double tPerLengthNE;
	
	private Double tPerLengthSP;
	
	/**
	 * Title NUM
	 *
	 * SP : Weighted Overlap Ratio
	 * SP : Average Length
	 */
	private Double tNUMRatioSP;
	
	private Double tNUMLengthSP;
	
	/**
	 * Title Time
	 *
	 * SP : Weighted Overlap Ratio
	 * SP : Average Length
	 */
	private Double tTimRatioSP;
	
	private Double tTimLengthSP;
	
	/**
	 * Category
	 *
	 * Overlap Ratio
	 * Average Length
	 */
	private Double catRatio;
	
	private Double catLength;
	
	/**
	 * Geotag
	 *
	 * Overlap Ratio
	 * Average Length
	 */
	private Double geoRatio;
	
	private Double geoLength;
	

    public EventFeature(JsonNode masterNode, JsonNode canditNode, String label) throws Exception {
    	if (!StringUtils.isEmpty(label) && !label.equals("DIFF") && !label.equals("EVENT") && !label.equals("DUP")) {
    		throw new Exception("Invalid Label! Required DIFF, EVENT , DUP or null.");
	    }
        this.label = label;
    	
	    //Title
	    String mTitle = stringPreprocess(
	    	masterNode.hasNonNull("stitle") ? masterNode.get("stitle").textValue() :
			    masterNode.hasNonNull("seg_title") ? masterNode.get("seg_title").textValue() : ""
	    );
	    List<String> mTitleList = Arrays.asList(mTitle.split(" "));
	    String cTitle = stringPreprocess(
		    canditNode.hasNonNull("stitle") ? canditNode.get("stitle").textValue() :
			    canditNode.hasNonNull("seg_title") ? canditNode.get("seg_title").textValue() : ""
	    );
	    List<String> cTitleList = Arrays.asList(cTitle.split(" "));
        this.titleDist = levenshteinDistance(mTitle, cTitle);
        this.titleRatio = overlapRatio(mTitleList, cTitleList);
        this.titleLength = averageLength(mTitleList, cTitleList);
        
        //Source
        this.sameSRC = isEqual(
        	masterNode.hasNonNull("src") ? masterNode.get("src").textValue() : null,
	        canditNode.hasNonNull("src") ? canditNode.get("src").textValue() : null
        );
        
        //Word Count Span
        this.cWordSpan = numSpan(
        	masterNode.hasNonNull("c_word") ? masterNode.get("c_word").asLong() : null,
	        canditNode.hasNonNull("c_word") ? canditNode.get("c_word").asLong() : null
        );
	
        //Paragraph Count Span
	    this.paragraphSpan = numSpan(
	    	masterNode.hasNonNull("paragraph_count") ? masterNode.get("paragraph_count").asLong() : null,
		    canditNode.hasNonNull("paragraph_count") ? canditNode.get("paragraph_count").asLong() : null
	    );
	    
	    //Time Span
        Long mEpoch;
        Long cEpoch;
	    if (masterNode.hasNonNull("epoch") && masterNode.get("epoch").isNumber()) {
	    	mEpoch = masterNode.get("epoch").asLong();
	    } else if (masterNode.hasNonNull("epoch")) {
		    mEpoch = masterNode.get("epoch").get("$numberLong").asLong();
	    } else {
	    	mEpoch = null;
	    }
	    if (canditNode.hasNonNull("epoch") && canditNode.get("epoch").isNumber()) {
		    cEpoch = canditNode.get("epoch").asLong();
	    } else if (canditNode.hasNonNull("epoch")) {
		    cEpoch = canditNode.get("epoch").get("$numberLong").asLong();
	    } else {
	    	cEpoch = null;
	    }
	    this.epochSpan = numSpan(mEpoch, cEpoch);
	    Long mInsert;
	    Long cInsert;
	    if (masterNode.hasNonNull("insert_time")) {
		    mInsert = Date.valueOf(masterNode.get("insert_time").asText()).getTime();
	    } else {
		    mInsert = null;
	    }
	    if (canditNode.hasNonNull("insert_time")) {
		    cInsert = Date.valueOf(canditNode.get("insert_time").asText()).getTime();
	    } else {
		    cInsert = null;
	    }
	    this.insertSpan = numSpan(mInsert, cInsert);
	    
	    //Simhash Distance
	    this.simhashDist = simhashDist(masterNode.get("simhash"), canditNode.get("simhash"));
	    
	    //Content Keywords
	    List<String> mContentKWSList = new ArrayList<>();
	    List<String> cContentKWSList = new ArrayList<>();
	    if (masterNode.hasNonNull("kws") && masterNode.get("kws").isArray()) {
		    masterNode.get("kws").forEach(kw -> mContentKWSList.add(kw.asText()));
	    }
	    if (canditNode.has("kws") && canditNode.get("kws").isArray()) {
	    	canditNode.get("kws").forEach(kw -> cContentKWSList.add(kw.asText()));
	    }
	    this.cKWSRatio = overlapRatio(mContentKWSList, cContentKWSList);
	    this.cKWSLength = averageLength(mContentKWSList, cContentKWSList);
	    
	    //Title Keywords
	    List<String> mTitleKWSList = new ArrayList<>();
	    List<String> cTitleKWSList = new ArrayList<>();
	    if (masterNode.hasNonNull("kw_title") && masterNode.get("kw_title").isArray()) {
	    	masterNode.get("kw_title").forEach(kw -> mTitleKWSList.add(kw.asText()));
	    }
	    if (canditNode.hasNonNull("kw_title") && canditNode.get("kw_title").isArray()) {
		    canditNode.get("kw_title").forEach(kw -> cTitleKWSList.add(kw.asText()));
	    }
	    this.tKWSRatio = overlapRatio(mTitleKWSList, cTitleList);
	    this.tKWSLength = averageLength(mTitleList, cTitleList);
	    
	    //HigLight Keywords
	    List<String> mHighKWSList = new ArrayList<>();
	    List<String> cHighKWSList = new ArrayList<>();
	    if (masterNode.hasNonNull("highlightkeyword_list") && masterNode.get("highlightkeyword_list").isArray()) {
		    masterNode.get("highlightkeyword_list").forEach(kw_pair -> {
			    if (kw_pair.get(1).asDouble() > 0.6d) {
				    mHighKWSList.add(kw_pair.get(0).asText());
			    }
		    });
	    }
	    if (canditNode.hasNonNull("highlightkeyword_list") && canditNode.get("highlightkeyword_list").isArray()) {
		    canditNode.get("highlightkeyword_list").forEach(kw_pair -> {
		    	if (kw_pair.get(1).asDouble() > 0.6d) {
				    cHighKWSList.add(kw_pair.get(0).asText());
			    }
		    });
	    }
	    this.hKWSRatio = overlapRatio(mHighKWSList, cHighKWSList);
	    this.hKWSLength = averageLength(mHighKWSList, cHighKWSList);
	    
	    
	    //Channel
	    List<String> mChnList = new ArrayList<>();
	    List<String> cChnList = new ArrayList<>();
	    JsonNode mChannel = masterNode.has("channels") ? masterNode.get("channels") : masterNode.get("channels_v2");
	    JsonNode cChannel = canditNode.has("channels") ? canditNode.get("channels") : canditNode.get("channels_v2");
	    if (mChannel != null && mChannel.isArray()) {
	    	mChannel.forEach(chn -> mChnList.add(chn.asText()));
	    }
	    if (cChannel != null && cChannel.isArray()) {
	    	cChannel.forEach(chn -> cChnList.add(chn.asText()));
	    }
	    this.channelRatio = overlapRatio(mChnList, cChnList);
	    this.channelLength = averageLength(mChnList, cChnList);
	    
	    //Content Organization
	    this.cOrgRatioNE = weightedOverlapRatio(masterNode.get("ne_content_organization"), canditNode.get("ne_content_organization"));
	    this.cOrgRatioSP = weightedOverlapRatio(masterNode.get("spacy_content_org"), canditNode.get("spacy_content_org"));
	    this.cOrgLengthNE = weightedAverageLength(masterNode.get("ne_content_organization"), canditNode.get("ne_content_organization"));
	    this.cOrgLengthSP = weightedAverageLength(masterNode.get("spacy_content_org"), canditNode.get("spacy_content_org"));
	    
	    //Content Location
	    this.cLocRatioNE = weightedOverlapRatio(masterNode.get("ne_content_location"), canditNode.get("ne_content_location"));
	    this.cLocRatioSP = weightedOverlapRatio(masterNode.get("spacy_content_loc"), canditNode.get("spacy_content_loc"));
	    this.cLocLengthNE = weightedAverageLength(masterNode.get("ne_content_location"), canditNode.get("ne_content_location"));
	    this.cLocLengthSP = weightedAverageLength(masterNode.get("spacy_content_loc"), canditNode.get("spacy_content_loc"));
	    
	    //Content Person
	    this.cPerRatioNE = weightedOverlapRatio(masterNode.get("ne_content_person"), canditNode.get("ne_content_person"));
	    this.cPerRatioSP = weightedOverlapRatio(masterNode.get("spacy_content_per"), canditNode.get("spacy_content_per"));
	    this.cPerLengthNE = weightedAverageLength(masterNode.get("ne_content_person"), canditNode.get("ne_content_person"));
	    this.cPerLengthSP = weightedAverageLength(masterNode.get("spacy_content_per"), canditNode.get("spacy_content_per"));
	    
	    //Content NUM
	    this.cNUMRatioSP = weightedOverlapRatio(masterNode.get("spacy_content_num"), canditNode.get("spacy_content_num"));
	    this.cNUMLengthSP = weightedAverageLength(masterNode.get("spacy_content_num"), canditNode.get("spacy_content_num"));
	    
	    //Content Time
	    this.cTimRatioSP = weightedOverlapRatio(masterNode.get("spacy_content_tim"), canditNode.get("spacy_content_tim"));
	    this.cTimLengthSP = weightedAverageLength(masterNode.get("spacy_content_tim"), canditNode.get("spacy_content_tim"));
	    
	    //Title Organization
	    this.tOrgRatioNE = weightedOverlapRatio(masterNode.get("ne_title_organization"), canditNode.get("ne_title_organization"));
	    this.tOrgRatioSP = weightedOverlapRatio(masterNode.get("spacy_title_org"), canditNode.get("spacy_title_org"));
	    this.tOrgLengthNE = weightedAverageLength(masterNode.get("ne_title_organization"), canditNode.get("ne_title_organization"));
	    this.tOrgLengthSP = weightedAverageLength(masterNode.get("spacy_title_org"), canditNode.get("spacy_title_org"));
	    
	    //Title Location
	    this.tLocRatioNE = weightedOverlapRatio(masterNode.get("ne_title_location"), canditNode.get("ne_title_location"));
	    this.tLocRatioSP = weightedOverlapRatio(masterNode.get("spacy_title_loc"), canditNode.get("spacy_title_loc"));
	    this.tLocLengthNE = weightedAverageLength(masterNode.get("ne_title_location"), canditNode.get("ne_title_location"));
	    this.tLocLengthSP = weightedAverageLength(masterNode.get("spacy_title_loc"), canditNode.get("spacy_title_loc"));
	    
	    //Title Person
	    this.tPerRatioNE = weightedOverlapRatio(masterNode.get("ne_title_person"), canditNode.get("ne_title_person"));
	    this.tPerRatioSP = weightedOverlapRatio(masterNode.get("spacy_title_per"), canditNode.get("spacy_title_per"));
	    this.tPerLengthNE = weightedAverageLength(masterNode.get("ne_title_person"), canditNode.get("ne_title_person"));
	    this.tPerLengthSP = weightedAverageLength(masterNode.get("spacy_title_per"), canditNode.get("spacy_title_per"));
	    
	    //Title NUM
	    this.tNUMRatioSP = weightedOverlapRatio(masterNode.get("spacy_title_num"), canditNode.get("spacy_title_num"));
	    this.tNUMLengthSP = weightedAverageLength(masterNode.get("spacy_title_num"), canditNode.get("spacy_title_num"));
	    
	    //Title Time
	    this.tTimRatioSP = weightedOverlapRatio(masterNode.get("spacy_title_tim"), canditNode.get("spacy_title_tim"));
	    this.tTimLengthSP = weightedAverageLength(masterNode.get("spacy_title_tim"), canditNode.get("spacy_title_tim"));
	    
	    //Category
	    JsonNode mCategory = masterNode.has("text_category") ? masterNode.get("text_category") : masterNode.get("text_category_v2");
	    JsonNode cCategory = canditNode.has("text_category") ? canditNode.get("text_category") : canditNode.get("text_category_v2");
	    this.catRatio = categoryOverlapRatio(mCategory, cCategory);
	    this.catLength = categoryAverageLength(mCategory, cCategory);
	    
	    //GEO Tag
	    JsonNode mGeo = masterNode.has("geotag") ? masterNode.get("geotag") : masterNode.get("geotag_v2");
	    JsonNode cGeo = canditNode.has("geotag") ? canditNode.get("geotag") : canditNode.get("geotag_v2");
	    this.geoRatio = geotagOverlapRatio(mGeo, cGeo);
	    this.geoLength = geotagAverageLength(mGeo, cGeo);
    }
    
    
	public String getLabel() {
		return label;
	}
	
	public Double getTitleDist() {
		return titleDist;
	}
	
	public Double getTitleRatio() {
		return titleRatio;
	}
	
	public Double getTitleLength() {
		return titleLength;
	}
	
	public Double getSameSRC() {
		return sameSRC;
	}
	
	public Double getcWordSpan() {
		return cWordSpan;
	}
	
	public Double getParagraphSpan() {
		return paragraphSpan;
	}
	
	public Double getEpochSpan() {
		return epochSpan;
	}
	
	public Double getInsertSpan() {
		return insertSpan;
	}
	
	public Double getSimhashDist() {
		return simhashDist;
	}
	
	public Double getcKWSRatio() {
		return cKWSRatio;
	}
	
	public Double getcKWSLength() {
		return cKWSLength;
	}
	
	public Double gettKWSRatio() {
		return tKWSRatio;
	}
	
	public Double gettKWSLength() {
		return tKWSLength;
	}
	
	public Double gethKWSRatio() {
		return hKWSRatio;
	}
	
	public Double gethKWSLength() {
		return hKWSLength;
	}
	
	public Double getChannelRatio() {
		return channelRatio;
	}
	
	public Double getChannelLength() {
		return channelLength;
	}
	
	public Double getcOrgRatioNE() {
		return cOrgRatioNE;
	}
	
	public Double getcOrgRatioSP() {
		return cOrgRatioSP;
	}
	
	public Double getcOrgLengthNE() {
		return cOrgLengthNE;
	}
	
	public Double getcOrgLengthSP() {
		return cOrgLengthSP;
	}
	
	public Double getcLocRatioNE() {
		return cLocRatioNE;
	}
	
	public Double getcLocRatioSP() {
		return cLocRatioSP;
	}
	
	public Double getcLocLengthNE() {
		return cLocLengthNE;
	}
	
	public Double getcLocLengthSP() {
		return cLocLengthSP;
	}
	
	public Double getcPerRatioNE() {
		return cPerRatioNE;
	}
	
	public Double getcPerRatioSP() {
		return cPerRatioSP;
	}
	
	public Double getcPerLengthNE() {
		return cPerLengthNE;
	}
	
	public Double getcPerLengthSP() {
		return cPerLengthSP;
	}
	
	public Double getcNUMRatioSP() {
		return cNUMRatioSP;
	}
	
	public Double getcNUMLengthSP() {
		return cNUMLengthSP;
	}
	
	public Double getcTimRatioSP() {
		return cTimRatioSP;
	}
	
	public Double getcTimLengthSP() {
		return cTimLengthSP;
	}
	
	public Double gettOrgRatioNE() {
		return tOrgRatioNE;
	}
	
	public Double gettOrgRatioSP() {
		return tOrgRatioSP;
	}
	
	public Double gettOrgLengthNE() {
		return tOrgLengthNE;
	}
	
	public Double gettOrgLengthSP() {
		return tOrgLengthSP;
	}
	
	public Double gettLocRatioNE() {
		return tLocRatioNE;
	}
	
	public Double gettLocRatioSP() {
		return tLocRatioSP;
	}
	
	public Double gettLocLengthNE() {
		return tLocLengthNE;
	}
	
	public Double gettLocLengthSP() {
		return tLocLengthSP;
	}
	
	public Double gettPerRatioNE() {
		return tPerRatioNE;
	}
	
	public Double gettPerRatioSP() {
		return tPerRatioSP;
	}
	
	public Double gettPerLengthNE() {
		return tPerLengthNE;
	}
	
	public Double gettPerLengthSP() {
		return tPerLengthSP;
	}
	
	public Double gettNUMRatioSP() {
		return tNUMRatioSP;
	}
	
	public Double gettNUMLengthSP() {
		return tNUMLengthSP;
	}
	
	public Double gettTimRatioSP() {
		return tTimRatioSP;
	}
	
	public Double gettTimLengthSP() {
		return tTimLengthSP;
	}
	
	public Double getCatRatio() {
		return catRatio;
	}
	
	public Double getCatLength() {
		return catLength;
	}
	
	public Double getGeoRatio() {
		return geoRatio;
	}
	
	public Double getGeoLength() {
		return geoLength;
	}
	
	public Instance toInstance() {
		List<Double> doubleList = new ArrayList<>();
		doubleList.add(titleDist);
		doubleList.add(titleRatio);
		doubleList.add(titleLength);
		doubleList.add(sameSRC);
		doubleList.add(cWordSpan);
		doubleList.add(paragraphSpan);
		doubleList.add(epochSpan);
		doubleList.add(insertSpan);
		doubleList.add(simhashDist);
		doubleList.add(cKWSRatio);
		doubleList.add(cKWSLength);
		doubleList.add(tKWSRatio);
		doubleList.add(tKWSLength);
		doubleList.add(hKWSRatio);
		doubleList.add(hKWSLength);
		doubleList.add(channelRatio);
		doubleList.add(channelLength);
		doubleList.add(cOrgRatioNE);
		doubleList.add(cOrgRatioSP);
		doubleList.add(cOrgLengthNE);
		doubleList.add(cOrgLengthSP);
		doubleList.add(cLocRatioNE);
		doubleList.add(cLocRatioSP);
		doubleList.add(cLocLengthNE);
		doubleList.add(cLocLengthSP);
		doubleList.add(cPerRatioNE);
		doubleList.add(cPerRatioSP);
		doubleList.add(cPerLengthNE);
		doubleList.add(cPerLengthSP);
		doubleList.add(cNUMRatioSP);
		doubleList.add(cNUMLengthSP);
		doubleList.add(cTimRatioSP);
		doubleList.add(cTimLengthSP);
		doubleList.add(tOrgRatioNE);
		doubleList.add(tOrgRatioSP);
		doubleList.add(tOrgLengthNE);
		doubleList.add(tOrgLengthSP);
		doubleList.add(tLocRatioNE);
		doubleList.add(tLocRatioSP);
		doubleList.add(tLocLengthNE);
		doubleList.add(tLocLengthSP);
		doubleList.add(tPerRatioNE);
		doubleList.add(tPerRatioSP);
		doubleList.add(tPerLengthNE);
		doubleList.add(tPerLengthSP);
		doubleList.add(tNUMRatioSP);
		doubleList.add(tNUMLengthSP);
		doubleList.add(tTimRatioSP);
		doubleList.add(tTimLengthSP);
		doubleList.add(catRatio);
		doubleList.add(catLength);
		doubleList.add(geoRatio);
		doubleList.add(geoLength);
		doubleList.add((StringUtils.isEmpty(label) || StringUtils.equals(label, "DIFF")) ? 0d : StringUtils.equals(label, "EVENT") ? 1d : 2d);
		double[] doubleArray = doubleList.stream().mapToDouble(d -> d == null ? Utils.missingValue() : d.doubleValue()).toArray();
		return new DenseInstance(1, doubleArray);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titleDist == null ? "?" : titleDist.toString());
		sb.append(",");
		sb.append(titleRatio == null ? "?" : titleRatio.toString());
		sb.append(",");
		sb.append(titleLength == null ? "?" : titleLength.toString());
		sb.append(",");
		sb.append(sameSRC == null ? "?" : sameSRC.toString());
		sb.append(",");
		sb.append(cWordSpan == null ? "?" : cWordSpan.toString());
		sb.append(",");
		sb.append(paragraphSpan == null ? "?" : paragraphSpan.toString());
		sb.append(",");
		sb.append(epochSpan == null ? "?" : epochSpan.toString());
		sb.append(",");
		sb.append(insertSpan == null ? "?" : insertSpan.toString());
		sb.append(",");
		sb.append(simhashDist == null ? "?" : simhashDist.toString());
		sb.append(",");
		sb.append(cKWSRatio == null ? "?" : cKWSRatio.toString());
		sb.append(",");
		sb.append(cKWSLength == null ? "?" : cKWSLength.toString());
		sb.append(",");
		sb.append(tKWSRatio == null ? "?" : tKWSRatio.toString());
		sb.append(",");
		sb.append(tKWSLength == null ? "?" : tKWSLength.toString());
		sb.append(",");
		sb.append(hKWSRatio == null ? "?" : hKWSRatio.toString());
		sb.append(",");
		sb.append(hKWSLength == null ? "?" : hKWSLength.toString());
		sb.append(",");
		sb.append(channelRatio == null ? "?" : channelRatio.toString());
		sb.append(",");
		sb.append(channelLength == null ? "?" : channelLength.toString());
		sb.append(",");
		sb.append(cOrgRatioNE == null ? "?" : cOrgRatioNE.toString());
		sb.append(",");
		sb.append(cOrgRatioSP == null ? "?" : cOrgRatioSP.toString());
		sb.append(",");
		sb.append(cOrgLengthNE == null ? "?" : cOrgLengthNE.toString());
		sb.append(",");
		sb.append(cOrgLengthSP == null ? "?" : cOrgLengthSP.toString());
		sb.append(",");
		sb.append(cLocRatioNE == null ? "?" : cLocRatioNE.toString());
		sb.append(",");
		sb.append(cLocRatioSP == null ? "?" : cLocRatioSP.toString());
		sb.append(",");
		sb.append(cLocLengthNE == null ? "?" : cLocLengthNE.toString());
		sb.append(",");
		sb.append(cLocLengthSP == null ? "?" : cLocLengthSP.toString());
		sb.append(",");
		sb.append(cPerRatioNE == null ? "?" : cPerRatioNE.toString());
		sb.append(",");
		sb.append(cPerRatioSP == null ? "?" : cPerRatioSP.toString());
		sb.append(",");
		sb.append(cPerLengthNE == null ? "?" : cPerLengthNE.toString());
		sb.append(",");
		sb.append(cPerLengthSP == null ? "?" : cPerLengthSP.toString());
		sb.append(",");
		sb.append(cNUMRatioSP == null ? "?" : cNUMRatioSP.toString());
		sb.append(",");
		sb.append(cNUMLengthSP == null ? "?" : cNUMLengthSP.toString());
		sb.append(",");
		sb.append(cTimRatioSP == null ? "?" : cTimRatioSP.toString());
		sb.append(",");
		sb.append(cTimLengthSP == null ? "?" : cTimLengthSP.toString());
		sb.append(",");
		sb.append(tOrgRatioNE == null ? "?" : tOrgRatioNE.toString());
		sb.append(",");
		sb.append(tOrgRatioSP == null ? "?" : tOrgRatioSP.toString());
		sb.append(",");
		sb.append(tOrgLengthNE == null ? "?" : tOrgLengthNE.toString());
		sb.append(",");
		sb.append(tOrgLengthSP == null ? "?" : tOrgLengthSP.toString());
		sb.append(",");
		sb.append(tLocRatioNE == null ? "?" : tLocRatioNE.toString());
		sb.append(",");
		sb.append(tLocRatioSP == null ? "?" : tLocRatioSP.toString());
		sb.append(",");
		sb.append(tLocLengthNE == null ? "?" : tLocLengthNE.toString());
		sb.append(",");
		sb.append(tLocLengthSP == null ? "?" : tLocLengthSP.toString());
		sb.append(",");
		sb.append(tPerRatioNE == null ? "?" : tPerRatioNE.toString());
		sb.append(",");
		sb.append(tPerRatioSP == null ? "?" : tPerRatioSP.toString());
		sb.append(",");
		sb.append(tPerLengthNE == null ? "?" : tPerLengthNE.toString());
		sb.append(",");
		sb.append(tPerLengthSP == null ? "?" : tPerLengthSP.toString());
		sb.append(",");
		sb.append(tNUMRatioSP == null ? "?" : tNUMRatioSP.toString());
		sb.append(",");
		sb.append(tNUMLengthSP == null ? "?" : tNUMLengthSP.toString());
		sb.append(",");
		sb.append(tTimRatioSP == null ? "?" : tTimRatioSP.toString());
		sb.append(",");
		sb.append(tTimLengthSP == null ? "?" : tTimLengthSP.toString());
		sb.append(",");
		sb.append(catRatio == null ? "?" : catRatio.toString());
		sb.append(",");
		sb.append(catLength == null ? "?" : catLength.toString());
		sb.append(",");
		sb.append(geoRatio == null ? "?" : geoRatio.toString());
		sb.append(",");
		sb.append(geoLength == null ? "?" : geoLength.toString());
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
