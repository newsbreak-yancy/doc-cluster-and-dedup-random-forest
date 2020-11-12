package com.nb.randomforest.utils;

import weka.core.Attribute;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuxi
 * @date 2020/11/12
 */
public class MyAttributeBuilder {
	
	public static ArrayList<Attribute> buildMyAttributes() {
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
		ArrayList<String> attVals = new ArrayList<>();
		attVals.add("DIFF");
		attVals.add("EVENT");
		attVals.add("DUP");
		attributes.add(new Attribute("Label", attVals));
		return attributes;
	}
}
