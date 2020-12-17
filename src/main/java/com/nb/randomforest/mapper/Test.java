package com.nb.randomforest.mapper;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.lang3.StringUtils;

import java.util.Iterator;

/**
 * @author yuxi
 * @date 2020/12/17
 */
public class Test {
	
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		boolean isTrue = true;
		int categoryIndex = 0;
		ObjectNode mCategory = mapper.createObjectNode();
		ObjectNode first = mapper.createObjectNode();
		first.put("Sports", "1");
		ObjectNode second = mapper.createObjectNode();
		second.put("BusinessEconomy_Markets", "2");
		second.put("ArtsEntertainment_Celebrities", "3");
		mCategory.set("first_cat", first);
		mCategory.set("second_cat", second);
		
		if (isTrue) {
			JsonNode firstCatNode = mCategory.get("first_cat");
			Iterator<String> itrFirst = firstCatNode.fieldNames();
			while (itrFirst.hasNext()) {
				String key = itrFirst.next();
				if (StringUtils.equals("Sports", key)){
					categoryIndex += 1;
				}
			}
			
			JsonNode secondCatNode = mCategory.get("second_cat");
			Iterator<String> itrSecond = secondCatNode.fieldNames();
			while (itrSecond.hasNext()) {
				String key = itrSecond.next();
				if (StringUtils.equals("BusinessEconomy_Markets", key)){
					categoryIndex += 2;
				} else if (StringUtils.equals("ArtsEntertainment_Celebrities", key)) {
					categoryIndex += 4;
				} else if (StringUtils.equals("ClimateEnvironment_Weather", key)) {
					categoryIndex += 8;
				}
			}
		}
		System.out.println(categoryIndex);
	}
}
