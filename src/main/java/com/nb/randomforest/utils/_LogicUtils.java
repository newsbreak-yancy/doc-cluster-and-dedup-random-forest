package com.nb.randomforest.utils;

import com.nb.randomforest.entity.EventFeature;

/**
 * @author yuxi
 * @date Fri Dec 25 17:20:35 CST 2020
 */
public class _LogicUtils {

	public static String transformDecisionLogicToWideFeature(EventFeature eventFeature) {
		Double TitleDist = eventFeature.getTitleDist() == null ? 0 : eventFeature.getTitleDist();
		Double TitleRatio = eventFeature.getTitleRatio() == null ? 0 : eventFeature.getTitleRatio();
		Double TitleLength = eventFeature.getTitleLength() == null ? 0 : eventFeature.getTitleLength();
		Double SameSRC = eventFeature.getSameSRC() == null ? 0 : eventFeature.getSameSRC();
		Double CWordSpan = eventFeature.getcWordSpan() == null ? 0 : eventFeature.getcWordSpan();
		Double ParagraphSpan = eventFeature.getParagraphSpan() == null ? 0 : eventFeature.getParagraphSpan();
		Double EpochSpan  = eventFeature.getEpochSpan() == null ? 0 : eventFeature.getEpochSpan();
		Double InsertSpan = eventFeature.getInsertSpan() == null ? 0 : eventFeature.getInsertSpan();
		Double SimhashDist = eventFeature.getSimhashDist() == null ? 0 : eventFeature.getSimhashDist();
		Double CKWSRatio = eventFeature.getcKWSRatio() == null ? 0 : eventFeature.getcKWSRatio();
		Double CKWSLength = eventFeature.getcKWSLength() == null ? 0 : eventFeature.getcKWSLength();
		Double TKWSRatio = eventFeature.gettKWSRatio() == null ? 0 : eventFeature.gettKWSRatio();
		Double TKWSLength = eventFeature.gettKWSLength() == null ? 0 : eventFeature.gettKWSLength();
		Double HKWSRatio = eventFeature.gethKWSRatio() == null ? 0 : eventFeature.gethKWSRatio();
		Double HKWSLength = eventFeature.gethKWSLength() == null ? 0 : eventFeature.gethKWSLength();
		Double ChannelRatio = eventFeature.getChannelRatio() == null ? 0 : eventFeature.getChannelRatio();
		Double ChannelLength = eventFeature.getChannelLength() == null ? 0 : eventFeature.getChannelLength();
		Double COrgRatioNE = eventFeature.getcOrgRatioNE() == null ? 0 : eventFeature.getcOrgRatioNE();
		Double COrgRatioSP = eventFeature.getcOrgRatioSP() == null ? 0 : eventFeature.getcOrgRatioSP();
		Double COrgLengthNE = eventFeature.getcOrgLengthNE() == null ? 0 : eventFeature.getcOrgLengthNE();
		Double COrgLengthSP = eventFeature.getcOrgLengthSP() == null ? 0 : eventFeature.getcOrgLengthSP();
		Double CLocRatioNE = eventFeature.getcLocRatioNE() == null ? 0 : eventFeature.getcLocRatioNE();
		Double CLocRatioSP = eventFeature.getcLocRatioSP() == null ? 0 : eventFeature.getcLocRatioSP();
		Double CLocLengthNE = eventFeature.getcLocLengthNE() == null ? 0 : eventFeature.getcLocLengthNE();
		Double CLocLengthSP = eventFeature.getcLocLengthSP() == null ? 0 : eventFeature.getcLocLengthSP();
		Double CPerRatioNE = eventFeature.getcPerRatioNE() == null ? 0 : eventFeature.getcPerRatioNE();
		Double CPerRatioSP = eventFeature.getcPerRatioSP() == null ? 0 : eventFeature.getcPerRatioSP();
		Double CPerLengthNE = eventFeature.getcPerLengthNE() == null ? 0 : eventFeature.getcPerLengthNE();
		Double CPerLengthSP = eventFeature.getcPerLengthSP() == null ? 0 : eventFeature.getcPerLengthSP();
		Double CNUMRatioSP = eventFeature.getcNUMRatioSP() == null ? 0 : eventFeature.getcNUMRatioSP();
		Double CNUMLengthSP = eventFeature.getcNUMLengthSP() == null ? 0 : eventFeature.getcNUMLengthSP();
		Double CTimRatioSP = eventFeature.getcTimRatioSP() == null ? 0 : eventFeature.getcTimRatioSP();
		Double CTimLengthSP = eventFeature.getcTimLengthSP() == null ? 0 : eventFeature.getcTimLengthSP();
		Double TOrgRatioNE = eventFeature.gettOrgRatioNE() == null ? 0 : eventFeature.gettOrgRatioNE();
		Double TOrgRatioSP = eventFeature.gettOrgRatioSP() == null ? 0 : eventFeature.gettOrgRatioSP();
		Double TOrgLengthNE = eventFeature.gettOrgLengthNE() == null ? 0 : eventFeature.gettOrgLengthNE();
		Double TOrgLengthSP = eventFeature.gettOrgLengthSP() == null ? 0 : eventFeature.gettOrgLengthSP();
		Double TLocRatioNE = eventFeature.gettLocRatioNE() == null ? 0 : eventFeature.gettLocRatioNE();
		Double TLocRatioSP = eventFeature.gettLocRatioSP() == null ? 0 : eventFeature.gettLocRatioSP();
		Double TLocLengthNE = eventFeature.gettLocLengthNE() == null ? 0 : eventFeature.gettLocLengthNE();
		Double TLocLengthSP = eventFeature.gettLocLengthSP() == null ? 0 : eventFeature.gettLocLengthSP();
		Double TPerRatioNE = eventFeature.gettPerRatioNE() == null ? 0 : eventFeature.gettPerRatioNE();
		Double TPerRatioSP = eventFeature.gettPerRatioSP() == null ? 0 : eventFeature.gettPerRatioSP();
		Double TPerLengthNE = eventFeature.gettPerLengthNE() == null ? 0 : eventFeature.gettPerLengthNE();
		Double TPerLengthSP = eventFeature.gettPerLengthSP() == null ? 0 : eventFeature.gettPerLengthSP();
		Double TNUMRatioSP = eventFeature.gettNUMRatioSP() == null ? 0 : eventFeature.gettNUMRatioSP();
		Double TNUMLengthSP = eventFeature.gettNUMLengthSP() == null ? 0 : eventFeature.gettNUMLengthSP();
		Double TTimRatioSP = eventFeature.gettTimRatioSP() == null ? 0 : eventFeature.gettTimRatioSP();
		Double TTimLengthSP = eventFeature.gettTimLengthSP() == null ? 0 : eventFeature.gettTimLengthSP();
		Double CatRatio = eventFeature.getCatRatio() == null ? 0 : eventFeature.getCatRatio();
		Double CatLength = eventFeature.getCatLength() == null ? 0 : eventFeature.getCatLength();
		Double GeoRatio = eventFeature.getGeoRatio() == null ? 0 : eventFeature.getGeoRatio();
		Double GeoLength = eventFeature.getGeoLength() == null ? 0 : eventFeature.getGeoLength();
		StringBuilder sb = new StringBuilder();
		if (COrgRatioSP < 0.49 && CKWSRatio < 0.24 && CatRatio < 0.53 && CKWSRatio < 0.13 && CLocLengthSP < 14.25 && SimhashDist < 60.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio < 0.24 && CatRatio < 0.53 && CKWSRatio < 0.13 && CLocLengthSP < 14.25 && SimhashDist >= 60.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio < 0.24 && CatRatio < 0.53 && CKWSRatio < 0.13 && CLocLengthSP >= 14.25 && CLocRatioNE < 0.72) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio < 0.24 && CatRatio < 0.53 && CKWSRatio < 0.13 && CLocLengthSP >= 14.25 && CLocRatioNE >= 0.72) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio < 0.24 && CatRatio < 0.53 && CKWSRatio >= 0.13 && TKWSRatio < 0.28 && CLocLengthNE < 32.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio < 0.24 && CatRatio < 0.53 && CKWSRatio >= 0.13 && TKWSRatio < 0.28 && CLocLengthNE >= 32.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio < 0.24 && CatRatio < 0.53 && CKWSRatio >= 0.13 && TKWSRatio >= 0.28 && InsertSpan < 54999.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio < 0.24 && CatRatio < 0.53 && CKWSRatio >= 0.13 && TKWSRatio >= 0.28 && InsertSpan >= 54999.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio < 0.24 && CatRatio >= 0.53 && HKWSRatio < 0.63 && CPerRatioNE < 0.3 && TKWSLength < 3.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio < 0.24 && CatRatio >= 0.53 && HKWSRatio < 0.63 && CPerRatioNE < 0.3 && TKWSLength >= 3.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio < 0.24 && CatRatio >= 0.53 && HKWSRatio < 0.63 && CPerRatioNE >= 0.3 && TitleRatio < 0.12) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio < 0.24 && CatRatio >= 0.53 && HKWSRatio < 0.63 && CPerRatioNE >= 0.3 && TitleRatio >= 0.12) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio < 0.24 && CatRatio >= 0.53 && HKWSRatio >= 0.63 && TitleRatio < 0.42 && SimhashDist < 54.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio < 0.24 && CatRatio >= 0.53 && HKWSRatio >= 0.63 && TitleRatio < 0.42 && SimhashDist >= 54.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio < 0.24 && CatRatio >= 0.53 && HKWSRatio >= 0.63 && TitleRatio >= 0.42 && CWordSpan < 448) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio < 0.24 && CatRatio >= 0.53 && HKWSRatio >= 0.63 && TitleRatio >= 0.42 && CWordSpan >= 448) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio >= 0.24 && SimhashDist < 65.5 && EpochSpan < 283127 && TitleRatio < 0.42 && HKWSRatio < 0.63) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio >= 0.24 && SimhashDist < 65.5 && EpochSpan < 283127 && TitleRatio < 0.42 && HKWSRatio >= 0.63) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio >= 0.24 && SimhashDist < 65.5 && EpochSpan < 283127 && TitleRatio >= 0.42 && CKWSLength < 10.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio >= 0.24 && SimhashDist < 65.5 && EpochSpan < 283127 && TitleRatio >= 0.42 && CKWSLength >= 10.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio >= 0.24 && SimhashDist < 65.5 && EpochSpan >= 283127 && COrgLengthSP < 11.25 && TKWSRatio < 0.91) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio >= 0.24 && SimhashDist < 65.5 && EpochSpan >= 283127 && COrgLengthSP < 11.25 && TKWSRatio >= 0.91) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio >= 0.24 && SimhashDist < 65.5 && EpochSpan >= 283127 && COrgLengthSP >= 11.25 && CPerRatioSP < 0.38) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio >= 0.24 && SimhashDist < 65.5 && EpochSpan >= 283127 && COrgLengthSP >= 11.25 && CPerRatioSP >= 0.38) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio >= 0.24 && SimhashDist >= 65.5 && CPerRatioSP < 0.3 && EpochSpan < 81069 && CLocRatioNE < 0.59) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio >= 0.24 && SimhashDist >= 65.5 && CPerRatioSP < 0.3 && EpochSpan < 81069 && CLocRatioNE >= 0.59) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio >= 0.24 && SimhashDist >= 65.5 && CPerRatioSP < 0.3 && EpochSpan >= 81069 && TLocRatioSP < 0.54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio >= 0.24 && SimhashDist >= 65.5 && CPerRatioSP < 0.3 && EpochSpan >= 81069 && TLocRatioSP >= 0.54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio >= 0.24 && SimhashDist >= 65.5 && CPerRatioSP >= 0.3 && InsertSpan < 149513.5 && TitleRatio < 0.39) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio >= 0.24 && SimhashDist >= 65.5 && CPerRatioSP >= 0.3 && InsertSpan < 149513.5 && TitleRatio >= 0.39) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio >= 0.24 && SimhashDist >= 65.5 && CPerRatioSP >= 0.3 && InsertSpan >= 149513.5 && CKWSRatio < 0.43) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio >= 0.24 && SimhashDist >= 65.5 && CPerRatioSP >= 0.3 && InsertSpan >= 149513.5 && CKWSRatio >= 0.43) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan < 83825.5 && CPerRatioSP < 0.73 && TitleRatio < 0.26 && CKWSLength < 19.25 && EpochSpan < 20368) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan < 83825.5 && CPerRatioSP < 0.73 && TitleRatio < 0.26 && CKWSLength < 19.25 && EpochSpan >= 20368) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan < 83825.5 && CPerRatioSP < 0.73 && TitleRatio < 0.26 && CKWSLength >= 19.25 && TKWSRatio < 0.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan < 83825.5 && CPerRatioSP < 0.73 && TitleRatio < 0.26 && CKWSLength >= 19.25 && TKWSRatio >= 0.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan < 83825.5 && CPerRatioSP < 0.73 && TitleRatio >= 0.26 && CKWSLength < 8.75 && CNUMRatioSP < 0.73) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan < 83825.5 && CPerRatioSP < 0.73 && TitleRatio >= 0.26 && CKWSLength < 8.75 && CNUMRatioSP >= 0.73) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan < 83825.5 && CPerRatioSP < 0.73 && TitleRatio >= 0.26 && CKWSLength >= 8.75 && EpochSpan < 38768.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan < 83825.5 && CPerRatioSP < 0.73 && TitleRatio >= 0.26 && CKWSLength >= 8.75 && EpochSpan >= 38768.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan < 83825.5 && CPerRatioSP >= 0.73 && TitleDist < 0.5 && TOrgLengthSP < 2.5 && TitleLength < 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan < 83825.5 && CPerRatioSP >= 0.73 && TitleDist < 0.5 && TOrgLengthSP < 2.5 && TitleLength >= 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan < 83825.5 && CPerRatioSP >= 0.73 && TitleDist < 0.5 && TOrgLengthSP >= 2.5 && CPerLengthNE < 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan < 83825.5 && CPerRatioSP >= 0.73 && TitleDist < 0.5 && TOrgLengthSP >= 2.5 && CPerLengthNE >= 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan < 83825.5 && CPerRatioSP >= 0.73 && TitleDist >= 0.5 && TitleLength < 4.75 && CPerLengthNE < 1.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan < 83825.5 && CPerRatioSP >= 0.73 && TitleDist >= 0.5 && TitleLength < 4.75 && CPerLengthNE >= 1.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan < 83825.5 && CPerRatioSP >= 0.73 && TitleDist >= 0.5 && TitleLength >= 4.75 && CLocRatioNE < 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan < 83825.5 && CPerRatioSP >= 0.73 && TitleDist >= 0.5 && TitleLength >= 4.75 && CLocRatioNE >= 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan >= 83825.5 && EpochSpan < 255690 && SimhashDist < 71.5 && CPerRatioSP < 0.57 && CNUMLengthSP < 9.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan >= 83825.5 && EpochSpan < 255690 && SimhashDist < 71.5 && CPerRatioSP < 0.57 && CNUMLengthSP >= 9.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan >= 83825.5 && EpochSpan < 255690 && SimhashDist < 71.5 && CPerRatioSP >= 0.57 && CatLength < 0.88) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan >= 83825.5 && EpochSpan < 255690 && SimhashDist < 71.5 && CPerRatioSP >= 0.57 && CatLength >= 0.88) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan >= 83825.5 && EpochSpan < 255690 && SimhashDist >= 71.5 && CPerRatioSP < 0.7 && TitleRatio < 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan >= 83825.5 && EpochSpan < 255690 && SimhashDist >= 71.5 && CPerRatioSP < 0.7 && TitleRatio >= 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan >= 83825.5 && EpochSpan < 255690 && SimhashDist >= 71.5 && CPerRatioSP >= 0.7 && ChannelRatio < 0.95) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan >= 83825.5 && EpochSpan < 255690 && SimhashDist >= 71.5 && CPerRatioSP >= 0.7 && ChannelRatio >= 0.95) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan >= 83825.5 && EpochSpan >= 255690 && TitleRatio < 0.19 && EpochSpan < 264162 && CatRatio < 0.74) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan >= 83825.5 && EpochSpan >= 255690 && TitleRatio < 0.19 && EpochSpan < 264162 && CatRatio >= 0.74) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan >= 83825.5 && EpochSpan >= 255690 && TitleRatio < 0.19 && EpochSpan >= 264162 && ChannelRatio < 0.15) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan >= 83825.5 && EpochSpan >= 255690 && TitleRatio < 0.19 && EpochSpan >= 264162 && ChannelRatio >= 0.15) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan >= 83825.5 && EpochSpan >= 255690 && TitleRatio >= 0.19 && ChannelLength < 4.75 && CPerRatioNE < 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan >= 83825.5 && EpochSpan >= 255690 && TitleRatio >= 0.19 && ChannelLength < 4.75 && CPerRatioNE >= 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan >= 83825.5 && EpochSpan >= 255690 && TitleRatio >= 0.19 && ChannelLength >= 4.75 && SimhashDist < 64.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && InsertSpan >= 83825.5 && EpochSpan >= 255690 && TitleRatio >= 0.19 && ChannelLength >= 4.75 && SimhashDist >= 64.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE < 0.13 && CPerRatioNE < 0.04 && CKWSRatio < 0.23 && CKWSRatio < 0.06 && CPerLengthSP < 24.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE < 0.13 && CPerRatioNE < 0.04 && CKWSRatio < 0.23 && CKWSRatio < 0.06 && CPerLengthSP >= 24.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE < 0.13 && CPerRatioNE < 0.04 && CKWSRatio < 0.23 && CKWSRatio >= 0.06 && TKWSRatio < 0.55) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE < 0.13 && CPerRatioNE < 0.04 && CKWSRatio < 0.23 && CKWSRatio >= 0.06 && TKWSRatio >= 0.55) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE < 0.13 && CPerRatioNE < 0.04 && CKWSRatio >= 0.23 && TitleRatio < 0.2 && EpochSpan < 46700.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE < 0.13 && CPerRatioNE < 0.04 && CKWSRatio >= 0.23 && TitleRatio < 0.2 && EpochSpan >= 46700.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE < 0.13 && CPerRatioNE < 0.04 && CKWSRatio >= 0.23 && TitleRatio >= 0.2 && CLocRatioNE < 0.66) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE < 0.13 && CPerRatioNE < 0.04 && CKWSRatio >= 0.23 && TitleRatio >= 0.2 && CLocRatioNE >= 0.66) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE < 0.13 && CPerRatioNE >= 0.04 && CKWSRatio < 0.28 && TitleDist < 46.5 && CWordSpan < 1057) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE < 0.13 && CPerRatioNE >= 0.04 && CKWSRatio < 0.28 && TitleDist < 46.5 && CWordSpan >= 1057) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE < 0.13 && CPerRatioNE >= 0.04 && CKWSRatio < 0.28 && TitleDist >= 46.5 && TitleRatio < 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE < 0.13 && CPerRatioNE >= 0.04 && CKWSRatio < 0.28 && TitleDist >= 46.5 && TitleRatio >= 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE < 0.13 && CPerRatioNE >= 0.04 && CKWSRatio >= 0.28 && InsertSpan < 251421.5 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE < 0.13 && CPerRatioNE >= 0.04 && CKWSRatio >= 0.28 && InsertSpan < 251421.5 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE < 0.13 && CPerRatioNE >= 0.04 && CKWSRatio >= 0.28 && InsertSpan >= 251421.5 && TitleDist < 48) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE < 0.13 && CPerRatioNE >= 0.04 && CKWSRatio >= 0.28 && InsertSpan >= 251421.5 && TitleDist >= 48) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE >= 0.13 && TitleRatio < 0.23 && ChannelRatio < 0.32 && COrgRatioSP < 0.42 && SimhashDist < 57.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE >= 0.13 && TitleRatio < 0.23 && ChannelRatio < 0.32 && COrgRatioSP < 0.42 && SimhashDist >= 57.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE >= 0.13 && TitleRatio < 0.23 && ChannelRatio < 0.32 && COrgRatioSP >= 0.42 && CKWSRatio < 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE >= 0.13 && TitleRatio < 0.23 && ChannelRatio < 0.32 && COrgRatioSP >= 0.42 && CKWSRatio >= 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE >= 0.13 && TitleRatio < 0.23 && ChannelRatio >= 0.32 && InsertSpan < 107359 && TitleDist < 56.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE >= 0.13 && TitleRatio < 0.23 && ChannelRatio >= 0.32 && InsertSpan < 107359 && TitleDist >= 56.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE >= 0.13 && TitleRatio < 0.23 && ChannelRatio >= 0.32 && InsertSpan >= 107359 && CLocLengthNE < 11.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE >= 0.13 && TitleRatio < 0.23 && ChannelRatio >= 0.32 && InsertSpan >= 107359 && CLocLengthNE >= 11.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE >= 0.13 && TitleRatio >= 0.23 && CNUMLengthSP < 17.25 && TitleRatio < 0.52 && InsertSpan < 145863.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE >= 0.13 && TitleRatio >= 0.23 && CNUMLengthSP < 17.25 && TitleRatio < 0.52 && InsertSpan >= 145863.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE >= 0.13 && TitleRatio >= 0.23 && CNUMLengthSP < 17.25 && TitleRatio >= 0.52 && TitleLength < 6.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE >= 0.13 && TitleRatio >= 0.23 && CNUMLengthSP < 17.25 && TitleRatio >= 0.52 && TitleLength >= 6.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE >= 0.13 && TitleRatio >= 0.23 && CNUMLengthSP >= 17.25 && CLocRatioNE < 0.56 && TitleDist < 47.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE >= 0.13 && TitleRatio >= 0.23 && CNUMLengthSP >= 17.25 && CLocRatioNE < 0.56 && TitleDist >= 47.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE >= 0.13 && TitleRatio >= 0.23 && CNUMLengthSP >= 17.25 && CLocRatioNE >= 0.56 && CTimRatioSP < 0.9) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE >= 0.13 && TitleRatio >= 0.23 && CNUMLengthSP >= 17.25 && CLocRatioNE >= 0.56 && CTimRatioSP >= 0.9) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan < 72816.5 && COrgRatioSP < 0.86 && TitleRatio < 0.32 && COrgRatioSP < 0.6 && CKWSRatio < 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan < 72816.5 && COrgRatioSP < 0.86 && TitleRatio < 0.32 && COrgRatioSP < 0.6 && CKWSRatio >= 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan < 72816.5 && COrgRatioSP < 0.86 && TitleRatio < 0.32 && COrgRatioSP >= 0.6 && TKWSRatio < 0.17) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan < 72816.5 && COrgRatioSP < 0.86 && TitleRatio < 0.32 && COrgRatioSP >= 0.6 && TKWSRatio >= 0.17) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan < 72816.5 && COrgRatioSP < 0.86 && TitleRatio >= 0.32 && CPerLengthNE < 1.25 && CLocRatioSP < 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan < 72816.5 && COrgRatioSP < 0.86 && TitleRatio >= 0.32 && CPerLengthNE < 1.25 && CLocRatioSP >= 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan < 72816.5 && COrgRatioSP < 0.86 && TitleRatio >= 0.32 && CPerLengthNE >= 1.25 && SimhashDist < 46.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan < 72816.5 && COrgRatioSP < 0.86 && TitleRatio >= 0.32 && CPerLengthNE >= 1.25 && SimhashDist >= 46.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan < 72816.5 && COrgRatioSP >= 0.86 && CPerLengthNE < 1.75 && CNUMRatioSP < 0.71 && CLocRatioNE < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan < 72816.5 && COrgRatioSP >= 0.86 && CPerLengthNE < 1.75 && CNUMRatioSP < 0.71 && CLocRatioNE >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan < 72816.5 && COrgRatioSP >= 0.86 && CPerLengthNE < 1.75 && CNUMRatioSP >= 0.71 && TitleRatio < 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan < 72816.5 && COrgRatioSP >= 0.86 && CPerLengthNE < 1.75 && CNUMRatioSP >= 0.71 && TitleRatio >= 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan < 72816.5 && COrgRatioSP >= 0.86 && CPerLengthNE >= 1.75 && CTimRatioSP < 0.98 && TitleRatio < 0.94) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan < 72816.5 && COrgRatioSP >= 0.86 && CPerLengthNE >= 1.75 && CTimRatioSP < 0.98 && TitleRatio >= 0.94) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan < 72816.5 && COrgRatioSP >= 0.86 && CPerLengthNE >= 1.75 && CTimRatioSP >= 0.98 && CLocRatioNE < 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan < 72816.5 && COrgRatioSP >= 0.86 && CPerLengthNE >= 1.75 && CTimRatioSP >= 0.98 && CLocRatioNE >= 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan >= 72816.5 && TitleRatio < 0.37 && TitleRatio < 0.12 && CLocRatioSP < 0.68 && ChannelRatio < 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan >= 72816.5 && TitleRatio < 0.37 && TitleRatio < 0.12 && CLocRatioSP < 0.68 && ChannelRatio >= 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan >= 72816.5 && TitleRatio < 0.37 && TitleRatio < 0.12 && CLocRatioSP >= 0.68 && HKWSRatio < 0.04) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan >= 72816.5 && TitleRatio < 0.37 && TitleRatio < 0.12 && CLocRatioSP >= 0.68 && HKWSRatio >= 0.04) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan >= 72816.5 && TitleRatio < 0.37 && TitleRatio >= 0.12 && CNUMRatioSP < 0.46 && SimhashDist < 69.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan >= 72816.5 && TitleRatio < 0.37 && TitleRatio >= 0.12 && CNUMRatioSP < 0.46 && SimhashDist >= 69.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan >= 72816.5 && TitleRatio < 0.37 && TitleRatio >= 0.12 && CNUMRatioSP >= 0.46 && COrgLengthNE < 24.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan >= 72816.5 && TitleRatio < 0.37 && TitleRatio >= 0.12 && CNUMRatioSP >= 0.46 && COrgLengthNE >= 24.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan >= 72816.5 && TitleRatio >= 0.37 && COrgLengthNE < 2.75 && TKWSRatio < 0.57 && EpochSpan < 105267) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan >= 72816.5 && TitleRatio >= 0.37 && COrgLengthNE < 2.75 && TKWSRatio < 0.57 && EpochSpan >= 105267) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan >= 72816.5 && TitleRatio >= 0.37 && COrgLengthNE < 2.75 && TKWSRatio >= 0.57 && CPerLengthNE < 6.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan >= 72816.5 && TitleRatio >= 0.37 && COrgLengthNE < 2.75 && TKWSRatio >= 0.57 && CPerLengthNE >= 6.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan >= 72816.5 && TitleRatio >= 0.37 && COrgLengthNE >= 2.75 && CNUMLengthSP < 13.25 && CKWSRatio < 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan >= 72816.5 && TitleRatio >= 0.37 && COrgLengthNE >= 2.75 && CNUMLengthSP < 13.25 && CKWSRatio >= 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan >= 72816.5 && TitleRatio >= 0.37 && COrgLengthNE >= 2.75 && CNUMLengthSP >= 13.25 && CNUMRatioSP < 0.97) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan >= 72816.5 && TitleRatio >= 0.37 && COrgLengthNE >= 2.75 && CNUMLengthSP >= 13.25 && CNUMRatioSP >= 0.97) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist < 69.5 && TitleDist < 0.5 && TitleLength < 5.5 && CTimRatioSP < 0.77 && InsertSpan < 171840) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist < 69.5 && TitleDist < 0.5 && TitleLength < 5.5 && CTimRatioSP < 0.77 && InsertSpan >= 171840) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist < 69.5 && TitleDist < 0.5 && TitleLength < 5.5 && CTimRatioSP >= 0.77 && InsertSpan < 1233951) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist < 69.5 && TitleDist < 0.5 && TitleLength < 5.5 && CTimRatioSP >= 0.77 && InsertSpan >= 1233951) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist < 69.5 && TitleDist < 0.5 && TitleLength >= 5.5 && SimhashDist < 22.5 && TOrgLengthSP < 3.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist < 69.5 && TitleDist < 0.5 && TitleLength >= 5.5 && SimhashDist < 22.5 && TOrgLengthSP >= 3.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist < 69.5 && TitleDist < 0.5 && TitleLength >= 5.5 && SimhashDist >= 22.5 && EpochSpan < 58449.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist < 69.5 && TitleDist < 0.5 && TitleLength >= 5.5 && SimhashDist >= 22.5 && EpochSpan >= 58449.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist < 69.5 && TitleDist >= 0.5 && COrgRatioSP < 0.27 && CLocRatioNE < 0.29 && CPerRatioNE < 0.07) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist < 69.5 && TitleDist >= 0.5 && COrgRatioSP < 0.27 && CLocRatioNE < 0.29 && CPerRatioNE >= 0.07) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist < 69.5 && TitleDist >= 0.5 && COrgRatioSP < 0.27 && CLocRatioNE >= 0.29 && TKWSRatio < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist < 69.5 && TitleDist >= 0.5 && COrgRatioSP < 0.27 && CLocRatioNE >= 0.29 && TKWSRatio >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist < 69.5 && TitleDist >= 0.5 && COrgRatioSP >= 0.27 && SameSRC < 0.5 && TKWSRatio < 0.71) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist < 69.5 && TitleDist >= 0.5 && COrgRatioSP >= 0.27 && SameSRC < 0.5 && TKWSRatio >= 0.71) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist < 69.5 && TitleDist >= 0.5 && COrgRatioSP >= 0.27 && SameSRC >= 0.5 && InsertSpan < 84300) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist < 69.5 && TitleDist >= 0.5 && COrgRatioSP >= 0.27 && SameSRC >= 0.5 && InsertSpan >= 84300) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist >= 69.5 && TitleRatio < 0.17 && COrgRatioSP < 0.22 && CKWSRatio < 0.23 && CatLength < 1.85) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist >= 69.5 && TitleRatio < 0.17 && COrgRatioSP < 0.22 && CKWSRatio < 0.23 && CatLength >= 1.85) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist >= 69.5 && TitleRatio < 0.17 && COrgRatioSP < 0.22 && CKWSRatio >= 0.23 && CTimRatioSP < 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist >= 69.5 && TitleRatio < 0.17 && COrgRatioSP < 0.22 && CKWSRatio >= 0.23 && CTimRatioSP >= 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist >= 69.5 && TitleRatio < 0.17 && COrgRatioSP >= 0.22 && CPerRatioNE < 0.36 && EpochSpan < 241888) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist >= 69.5 && TitleRatio < 0.17 && COrgRatioSP >= 0.22 && CPerRatioNE < 0.36 && EpochSpan >= 241888) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist >= 69.5 && TitleRatio < 0.17 && COrgRatioSP >= 0.22 && CPerRatioNE >= 0.36 && EpochSpan < 94320) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist >= 69.5 && TitleRatio < 0.17 && COrgRatioSP >= 0.22 && CPerRatioNE >= 0.36 && EpochSpan >= 94320) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist >= 69.5 && TitleRatio >= 0.17 && COrgRatioSP < 0.45 && CPerRatioNE < 0.28 && COrgLengthNE < 3.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist >= 69.5 && TitleRatio >= 0.17 && COrgRatioSP < 0.45 && CPerRatioNE < 0.28 && COrgLengthNE >= 3.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist >= 69.5 && TitleRatio >= 0.17 && COrgRatioSP < 0.45 && CPerRatioNE >= 0.28 && EpochSpan < 194157) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist >= 69.5 && TitleRatio >= 0.17 && COrgRatioSP < 0.45 && CPerRatioNE >= 0.28 && EpochSpan >= 194157) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist >= 69.5 && TitleRatio >= 0.17 && COrgRatioSP >= 0.45 && CPerRatioNE < 0.39 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist >= 69.5 && TitleRatio >= 0.17 && COrgRatioSP >= 0.45 && CPerRatioNE < 0.39 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist >= 69.5 && TitleRatio >= 0.17 && COrgRatioSP >= 0.45 && CPerRatioNE >= 0.39 && CTimRatioSP < 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist >= 69.5 && TitleRatio >= 0.17 && COrgRatioSP >= 0.45 && CPerRatioNE >= 0.39 && CTimRatioSP >= 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP < 0.61 && CKWSRatio < 0.29 && InsertSpan < 32990 && CPerRatioSP < 0.23 && EpochSpan < 35455.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP < 0.61 && CKWSRatio < 0.29 && InsertSpan < 32990 && CPerRatioSP < 0.23 && EpochSpan >= 35455.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP < 0.61 && CKWSRatio < 0.29 && InsertSpan < 32990 && CPerRatioSP >= 0.23 && CLocRatioNE < 0.07) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP < 0.61 && CKWSRatio < 0.29 && InsertSpan < 32990 && CPerRatioSP >= 0.23 && CLocRatioNE >= 0.07) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP < 0.61 && CKWSRatio < 0.29 && InsertSpan >= 32990 && COrgRatioNE < 0.25 && CPerRatioSP < 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP < 0.61 && CKWSRatio < 0.29 && InsertSpan >= 32990 && COrgRatioNE < 0.25 && CPerRatioSP >= 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP < 0.61 && CKWSRatio < 0.29 && InsertSpan >= 32990 && COrgRatioNE >= 0.25 && SimhashDist < 66.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP < 0.61 && CKWSRatio < 0.29 && InsertSpan >= 32990 && COrgRatioNE >= 0.25 && SimhashDist >= 66.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP < 0.61 && CKWSRatio >= 0.29 && CKWSRatio < 0.45 && CWordSpan < 2109.5 && TitleRatio < 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP < 0.61 && CKWSRatio >= 0.29 && CKWSRatio < 0.45 && CWordSpan < 2109.5 && TitleRatio >= 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP < 0.61 && CKWSRatio >= 0.29 && CKWSRatio < 0.45 && CWordSpan >= 2109.5 && CLocLengthNE < 32) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP < 0.61 && CKWSRatio >= 0.29 && CKWSRatio < 0.45 && CWordSpan >= 2109.5 && CLocLengthNE >= 32) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP < 0.61 && CKWSRatio >= 0.29 && CKWSRatio >= 0.45 && EpochSpan < 86393 && COrgRatioSP < 0.11) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP < 0.61 && CKWSRatio >= 0.29 && CKWSRatio >= 0.45 && EpochSpan < 86393 && COrgRatioSP >= 0.11) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP < 0.61 && CKWSRatio >= 0.29 && CKWSRatio >= 0.45 && EpochSpan >= 86393 && ChannelRatio < 0.87) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP < 0.61 && CKWSRatio >= 0.29 && CKWSRatio >= 0.45 && EpochSpan >= 86393 && ChannelRatio >= 0.87) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP >= 0.61 && TitleRatio < 0.91 && SimhashDist < 65.5 && SameSRC < 0.5 && CNUMRatioSP < 0.41) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP >= 0.61 && TitleRatio < 0.91 && SimhashDist < 65.5 && SameSRC < 0.5 && CNUMRatioSP >= 0.41) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP >= 0.61 && TitleRatio < 0.91 && SimhashDist < 65.5 && SameSRC >= 0.5 && CatLength < 1.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP >= 0.61 && TitleRatio < 0.91 && SimhashDist < 65.5 && SameSRC >= 0.5 && CatLength >= 1.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP >= 0.61 && TitleRatio < 0.91 && SimhashDist >= 65.5 && InsertSpan < 169828.5 && SimhashDist < 79.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP >= 0.61 && TitleRatio < 0.91 && SimhashDist >= 65.5 && InsertSpan < 169828.5 && SimhashDist >= 79.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP >= 0.61 && TitleRatio < 0.91 && SimhashDist >= 65.5 && InsertSpan >= 169828.5 && EpochSpan < 590124) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP >= 0.61 && TitleRatio < 0.91 && SimhashDist >= 65.5 && InsertSpan >= 169828.5 && EpochSpan >= 590124) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP >= 0.61 && TitleRatio >= 0.91 && EpochSpan < 86361.5 && ChannelRatio < 0.9 && CatRatio < 0.77) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP >= 0.61 && TitleRatio >= 0.91 && EpochSpan < 86361.5 && ChannelRatio < 0.9 && CatRatio >= 0.77) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP >= 0.61 && TitleRatio >= 0.91 && EpochSpan < 86361.5 && ChannelRatio >= 0.9 && COrgLengthNE < 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP >= 0.61 && TitleRatio >= 0.91 && EpochSpan < 86361.5 && ChannelRatio >= 0.9 && COrgLengthNE >= 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP >= 0.61 && TitleRatio >= 0.91 && EpochSpan >= 86361.5 && CTimRatioSP < 0.86 && TitleLength < 7.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP >= 0.61 && TitleRatio >= 0.91 && EpochSpan >= 86361.5 && CTimRatioSP < 0.86 && TitleLength >= 7.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP >= 0.61 && TitleRatio >= 0.91 && EpochSpan >= 86361.5 && CTimRatioSP >= 0.86 && CPerLengthNE < 5.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && CPerRatioSP >= 0.61 && TitleRatio >= 0.91 && EpochSpan >= 86361.5 && CTimRatioSP >= 0.86 && CPerLengthNE >= 5.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio < 0.21 && TitleRatio < 0.19 && CatRatio < 0.52 && SimhashDist < 79.5 && CatRatio < 0.27) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio < 0.21 && TitleRatio < 0.19 && CatRatio < 0.52 && SimhashDist < 79.5 && CatRatio >= 0.27) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio < 0.21 && TitleRatio < 0.19 && CatRatio < 0.52 && SimhashDist >= 79.5 && InsertSpan < 82332) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio < 0.21 && TitleRatio < 0.19 && CatRatio < 0.52 && SimhashDist >= 79.5 && InsertSpan >= 82332) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio < 0.21 && TitleRatio < 0.19 && CatRatio >= 0.52 && CPerRatioSP < 0.29 && TitleRatio < 0.08) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio < 0.21 && TitleRatio < 0.19 && CatRatio >= 0.52 && CPerRatioSP < 0.29 && TitleRatio >= 0.08) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio < 0.21 && TitleRatio < 0.19 && CatRatio >= 0.52 && CPerRatioSP >= 0.29 && CPerRatioSP < 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio < 0.21 && TitleRatio < 0.19 && CatRatio >= 0.52 && CPerRatioSP >= 0.29 && CPerRatioSP >= 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio < 0.21 && TitleRatio >= 0.19 && COrgRatioNE < 0.16 && SimhashDist < 68.5 && CKWSRatio < 0.09) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio < 0.21 && TitleRatio >= 0.19 && COrgRatioNE < 0.16 && SimhashDist < 68.5 && CKWSRatio >= 0.09) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio < 0.21 && TitleRatio >= 0.19 && COrgRatioNE < 0.16 && SimhashDist >= 68.5 && CatRatio < 0.88) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio < 0.21 && TitleRatio >= 0.19 && COrgRatioNE < 0.16 && SimhashDist >= 68.5 && CatRatio >= 0.88) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio < 0.21 && TitleRatio >= 0.19 && COrgRatioNE >= 0.16 && HKWSRatio < 0.7 && SimhashDist < 69.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio < 0.21 && TitleRatio >= 0.19 && COrgRatioNE >= 0.16 && HKWSRatio < 0.7 && SimhashDist >= 69.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio < 0.21 && TitleRatio >= 0.19 && COrgRatioNE >= 0.16 && HKWSRatio >= 0.7 && CLocLengthSP < 8.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio < 0.21 && TitleRatio >= 0.19 && COrgRatioNE >= 0.16 && HKWSRatio >= 0.7 && CLocLengthSP >= 8.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio >= 0.21 && COrgRatioSP < 0.45 && EpochSpan < 84528 && TitleRatio < 0.36 && CLocLengthNE < 29.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio >= 0.21 && COrgRatioSP < 0.45 && EpochSpan < 84528 && TitleRatio < 0.36 && CLocLengthNE >= 29.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio >= 0.21 && COrgRatioSP < 0.45 && EpochSpan < 84528 && TitleRatio >= 0.36 && TKWSRatio < 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio >= 0.21 && COrgRatioSP < 0.45 && EpochSpan < 84528 && TitleRatio >= 0.36 && TKWSRatio >= 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio >= 0.21 && COrgRatioSP < 0.45 && EpochSpan >= 84528 && TitleRatio < 0.2 && CPerRatioSP < 0.38) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio >= 0.21 && COrgRatioSP < 0.45 && EpochSpan >= 84528 && TitleRatio < 0.2 && CPerRatioSP >= 0.38) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio >= 0.21 && COrgRatioSP < 0.45 && EpochSpan >= 84528 && TitleRatio >= 0.2 && CKWSRatio < 0.41) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio >= 0.21 && COrgRatioSP < 0.45 && EpochSpan >= 84528 && TitleRatio >= 0.2 && CKWSRatio >= 0.41) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio >= 0.21 && COrgRatioSP >= 0.45 && EpochSpan < 83614.5 && ChannelRatio < 0.54 && CLocRatioNE < 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio >= 0.21 && COrgRatioSP >= 0.45 && EpochSpan < 83614.5 && ChannelRatio < 0.54 && CLocRatioNE >= 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio >= 0.21 && COrgRatioSP >= 0.45 && EpochSpan < 83614.5 && ChannelRatio >= 0.54 && CKWSLength < 7.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio >= 0.21 && COrgRatioSP >= 0.45 && EpochSpan < 83614.5 && ChannelRatio >= 0.54 && CKWSLength >= 7.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio >= 0.21 && COrgRatioSP >= 0.45 && EpochSpan >= 83614.5 && CNUMRatioSP < 0.53 && CWordSpan < 1518) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio >= 0.21 && COrgRatioSP >= 0.45 && EpochSpan >= 83614.5 && CNUMRatioSP < 0.53 && CWordSpan >= 1518) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio >= 0.21 && COrgRatioSP >= 0.45 && EpochSpan >= 83614.5 && CNUMRatioSP >= 0.53 && CNUMLengthSP < 11.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio >= 0.21 && COrgRatioSP >= 0.45 && EpochSpan >= 83614.5 && CNUMRatioSP >= 0.53 && CNUMLengthSP >= 11.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP < 0.74 && CKWSRatio < 0.3 && CNUMRatioSP < 0.28 && CatRatio < 0.78 && SimhashDist < 58.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP < 0.74 && CKWSRatio < 0.3 && CNUMRatioSP < 0.28 && CatRatio < 0.78 && SimhashDist >= 58.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP < 0.74 && CKWSRatio < 0.3 && CNUMRatioSP < 0.28 && CatRatio >= 0.78 && EpochSpan < 60525.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP < 0.74 && CKWSRatio < 0.3 && CNUMRatioSP < 0.28 && CatRatio >= 0.78 && EpochSpan >= 60525.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP < 0.74 && CKWSRatio < 0.3 && CNUMRatioSP >= 0.28 && CKWSRatio < 0.17 && CKWSRatio < 0.08) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP < 0.74 && CKWSRatio < 0.3 && CNUMRatioSP >= 0.28 && CKWSRatio < 0.17 && CKWSRatio >= 0.08) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP < 0.74 && CKWSRatio < 0.3 && CNUMRatioSP >= 0.28 && CKWSRatio >= 0.17 && HKWSRatio < 0.9) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP < 0.74 && CKWSRatio < 0.3 && CNUMRatioSP >= 0.28 && CKWSRatio >= 0.17 && HKWSRatio >= 0.9) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP < 0.74 && CKWSRatio >= 0.3 && SameSRC < 0.5 && TPerRatioNE < 0.79 && COrgRatioSP < 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP < 0.74 && CKWSRatio >= 0.3 && SameSRC < 0.5 && TPerRatioNE < 0.79 && COrgRatioSP >= 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP < 0.74 && CKWSRatio >= 0.3 && SameSRC < 0.5 && TPerRatioNE >= 0.79 && CPerLengthNE < 5.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP < 0.74 && CKWSRatio >= 0.3 && SameSRC < 0.5 && TPerRatioNE >= 0.79 && CPerLengthNE >= 5.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP < 0.74 && CKWSRatio >= 0.3 && SameSRC >= 0.5 && TitleDist < 0.5 && EpochSpan < 86309.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP < 0.74 && CKWSRatio >= 0.3 && SameSRC >= 0.5 && TitleDist < 0.5 && EpochSpan >= 86309.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP < 0.74 && CKWSRatio >= 0.3 && SameSRC >= 0.5 && TitleDist >= 0.5 && CNUMRatioSP < 0.45) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP < 0.74 && CKWSRatio >= 0.3 && SameSRC >= 0.5 && TitleDist >= 0.5 && CNUMRatioSP >= 0.45) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP >= 0.74 && EpochSpan < 830 && TitleDist < 2.5 && CKWSRatio < 0.93 && CTimLengthSP < 1.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP >= 0.74 && EpochSpan < 830 && TitleDist < 2.5 && CKWSRatio < 0.93 && CTimLengthSP >= 1.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP >= 0.74 && EpochSpan < 830 && TitleDist < 2.5 && CKWSRatio >= 0.93 && CPerLengthSP < 9.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP >= 0.74 && EpochSpan < 830 && TitleDist < 2.5 && CKWSRatio >= 0.93 && CPerLengthSP >= 9.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP >= 0.74 && EpochSpan < 830 && TitleDist >= 2.5 && TitleRatio < 0.16) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP >= 0.74 && EpochSpan < 830 && TitleDist >= 2.5 && TitleRatio >= 0.16 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP >= 0.74 && EpochSpan < 830 && TitleDist >= 2.5 && TitleRatio >= 0.16 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP >= 0.74 && EpochSpan >= 830 && EpochSpan < 65850 && TitleRatio < 0.46 && CatLength < 1.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP >= 0.74 && EpochSpan >= 830 && EpochSpan < 65850 && TitleRatio < 0.46 && CatLength >= 1.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP >= 0.74 && EpochSpan >= 830 && EpochSpan < 65850 && TitleRatio >= 0.46 && CatRatio < 0.76) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP >= 0.74 && EpochSpan >= 830 && EpochSpan < 65850 && TitleRatio >= 0.46 && CatRatio >= 0.76) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP >= 0.74 && EpochSpan >= 830 && EpochSpan >= 65850 && InsertSpan < 252492.5 && COrgLengthNE < 2.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP >= 0.74 && EpochSpan >= 830 && EpochSpan >= 65850 && InsertSpan < 252492.5 && COrgLengthNE >= 2.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP >= 0.74 && EpochSpan >= 830 && EpochSpan >= 65850 && InsertSpan >= 252492.5 && CPerLengthSP < 7.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && CNUMRatioSP >= 0.74 && EpochSpan >= 830 && EpochSpan >= 65850 && InsertSpan >= 252492.5 && CPerLengthSP >= 7.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan < 251514.5 && TitleDist < 0.5 && CNUMRatioSP < 0.86 && EpochSpan < 83125 && CTimLengthSP < 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan < 251514.5 && TitleDist < 0.5 && CNUMRatioSP < 0.86 && EpochSpan < 83125 && CTimLengthSP >= 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan < 251514.5 && TitleDist < 0.5 && CNUMRatioSP < 0.86 && EpochSpan >= 83125 && CNUMLengthSP < 23.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan < 251514.5 && TitleDist < 0.5 && CNUMRatioSP < 0.86 && EpochSpan >= 83125 && CNUMLengthSP >= 23.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan < 251514.5 && TitleDist < 0.5 && CNUMRatioSP >= 0.86 && CTimRatioSP < 0.85 && EpochSpan < 83642) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan < 251514.5 && TitleDist < 0.5 && CNUMRatioSP >= 0.86 && CTimRatioSP < 0.85 && EpochSpan >= 83642) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan < 251514.5 && TitleDist < 0.5 && CNUMRatioSP >= 0.86 && CTimRatioSP >= 0.85 && CTimLengthSP < 25.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan < 251514.5 && TitleDist < 0.5 && CNUMRatioSP >= 0.86 && CTimRatioSP >= 0.85 && CTimLengthSP >= 25.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan < 251514.5 && TitleDist >= 0.5 && CPerRatioSP < 0.31 && CKWSRatio < 0.17 && TitleRatio < 0.21) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan < 251514.5 && TitleDist >= 0.5 && CPerRatioSP < 0.31 && CKWSRatio < 0.17 && TitleRatio >= 0.21) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan < 251514.5 && TitleDist >= 0.5 && CPerRatioSP < 0.31 && CKWSRatio >= 0.17 && EpochSpan < 83180) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan < 251514.5 && TitleDist >= 0.5 && CPerRatioSP < 0.31 && CKWSRatio >= 0.17 && EpochSpan >= 83180) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan < 251514.5 && TitleDist >= 0.5 && CPerRatioSP >= 0.31 && CNUMLengthSP < 12.75 && TKWSRatio < 0.61) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan < 251514.5 && TitleDist >= 0.5 && CPerRatioSP >= 0.31 && CNUMLengthSP < 12.75 && TKWSRatio >= 0.61) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan < 251514.5 && TitleDist >= 0.5 && CPerRatioSP >= 0.31 && CNUMLengthSP >= 12.75 && CLocRatioNE < 0.82) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan < 251514.5 && TitleDist >= 0.5 && CPerRatioSP >= 0.31 && CNUMLengthSP >= 12.75 && CLocRatioNE >= 0.82) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan >= 251514.5 && CPerRatioSP < 0.68 && CTimRatioSP < 0.77 && EpochSpan < 265888 && CTimLengthSP < 7.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan >= 251514.5 && CPerRatioSP < 0.68 && CTimRatioSP < 0.77 && EpochSpan < 265888 && CTimLengthSP >= 7.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan >= 251514.5 && CPerRatioSP < 0.68 && CTimRatioSP < 0.77 && EpochSpan >= 265888 && CLocLengthSP < 8.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan >= 251514.5 && CPerRatioSP < 0.68 && CTimRatioSP < 0.77 && EpochSpan >= 265888 && CLocLengthSP >= 8.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan >= 251514.5 && CPerRatioSP < 0.68 && CTimRatioSP >= 0.77 && ChannelRatio < 0.87 && TKWSLength < 4.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan >= 251514.5 && CPerRatioSP < 0.68 && CTimRatioSP >= 0.77 && ChannelRatio < 0.87 && TKWSLength >= 4.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan >= 251514.5 && CPerRatioSP < 0.68 && CTimRatioSP >= 0.77 && ChannelRatio >= 0.87 && SimhashDist < 38.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan >= 251514.5 && CPerRatioSP < 0.68 && CTimRatioSP >= 0.77 && ChannelRatio >= 0.87 && SimhashDist >= 38.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan >= 251514.5 && CPerRatioSP >= 0.68 && EpochSpan < 249649.5 && CNUMRatioSP < 0.52 && CLocLengthNE < 4.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan >= 251514.5 && CPerRatioSP >= 0.68 && EpochSpan < 249649.5 && CNUMRatioSP < 0.52 && CLocLengthNE >= 4.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan >= 251514.5 && CPerRatioSP >= 0.68 && EpochSpan < 249649.5 && CNUMRatioSP >= 0.52 && ChannelRatio < 0.45) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan >= 251514.5 && CPerRatioSP >= 0.68 && EpochSpan < 249649.5 && CNUMRatioSP >= 0.52 && ChannelRatio >= 0.45) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan >= 251514.5 && CPerRatioSP >= 0.68 && EpochSpan >= 249649.5 && SimhashDist < 21.5 && CKWSLength < 9) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan >= 251514.5 && CPerRatioSP >= 0.68 && EpochSpan >= 249649.5 && SimhashDist < 21.5 && CKWSLength >= 9) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan >= 251514.5 && CPerRatioSP >= 0.68 && EpochSpan >= 249649.5 && SimhashDist >= 21.5 && InsertSpan < 602974) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan >= 251514.5 && CPerRatioSP >= 0.68 && EpochSpan >= 249649.5 && SimhashDist >= 21.5 && InsertSpan >= 602974) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio < 0.19 && CTimRatioSP < 0.47 && CatRatio < 0.55 && ChannelRatio < 0.11 && CLocLengthNE < 12.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio < 0.19 && CTimRatioSP < 0.47 && CatRatio < 0.55 && ChannelRatio < 0.11 && CLocLengthNE >= 12.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio < 0.19 && CTimRatioSP < 0.47 && CatRatio < 0.55 && ChannelRatio >= 0.11 && CPerRatioNE < 0.06) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio < 0.19 && CTimRatioSP < 0.47 && CatRatio < 0.55 && ChannelRatio >= 0.11 && CPerRatioNE >= 0.06) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio < 0.19 && CTimRatioSP < 0.47 && CatRatio >= 0.55 && CPerRatioNE < 0.36 && CPerRatioSP < 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio < 0.19 && CTimRatioSP < 0.47 && CatRatio >= 0.55 && CPerRatioNE < 0.36 && CPerRatioSP >= 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio < 0.19 && CTimRatioSP < 0.47 && CatRatio >= 0.55 && CPerRatioNE >= 0.36 && TitleRatio < 0.11) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio < 0.19 && CTimRatioSP < 0.47 && CatRatio >= 0.55 && CPerRatioNE >= 0.36 && TitleRatio >= 0.11) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio < 0.19 && CTimRatioSP >= 0.47 && TKWSRatio < 0.28 && CPerRatioNE < 0.42 && CKWSRatio < 0.21) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio < 0.19 && CTimRatioSP >= 0.47 && TKWSRatio < 0.28 && CPerRatioNE < 0.42 && CKWSRatio >= 0.21) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio < 0.19 && CTimRatioSP >= 0.47 && TKWSRatio < 0.28 && CPerRatioNE >= 0.42 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio < 0.19 && CTimRatioSP >= 0.47 && TKWSRatio < 0.28 && CPerRatioNE >= 0.42 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio < 0.19 && CTimRatioSP >= 0.47 && TKWSRatio >= 0.28 && EpochSpan < 59625 && CLocRatioNE < 0.44) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio < 0.19 && CTimRatioSP >= 0.47 && TKWSRatio >= 0.28 && EpochSpan < 59625 && CLocRatioNE >= 0.44) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio < 0.19 && CTimRatioSP >= 0.47 && TKWSRatio >= 0.28 && EpochSpan >= 59625 && COrgLengthNE < 6.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio < 0.19 && CTimRatioSP >= 0.47 && TKWSRatio >= 0.28 && EpochSpan >= 59625 && COrgLengthNE >= 6.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio >= 0.19 && CKWSRatio < 0.27 && EpochSpan < 45383.5 && CKWSRatio < 0.18 && CatRatio < 0.74) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio >= 0.19 && CKWSRatio < 0.27 && EpochSpan < 45383.5 && CKWSRatio < 0.18 && CatRatio >= 0.74) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio >= 0.19 && CKWSRatio < 0.27 && EpochSpan < 45383.5 && CKWSRatio >= 0.18 && CPerRatioNE < 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio >= 0.19 && CKWSRatio < 0.27 && EpochSpan < 45383.5 && CKWSRatio >= 0.18 && CPerRatioNE >= 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio >= 0.19 && CKWSRatio < 0.27 && EpochSpan >= 45383.5 && TOrgLengthNE < 1.25 && EpochSpan < 340607) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio >= 0.19 && CKWSRatio < 0.27 && EpochSpan >= 45383.5 && TOrgLengthNE < 1.25 && EpochSpan >= 340607) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio >= 0.19 && CKWSRatio < 0.27 && EpochSpan >= 45383.5 && TOrgLengthNE >= 1.25 && CatLength < 0.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio >= 0.19 && CKWSRatio < 0.27 && EpochSpan >= 45383.5 && TOrgLengthNE >= 1.25 && CatLength >= 0.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio >= 0.19 && CKWSRatio >= 0.27 && CPerRatioSP < 0.49 && SimhashDist < 76.5 && CNUMRatioSP < 0.64) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio >= 0.19 && CKWSRatio >= 0.27 && CPerRatioSP < 0.49 && SimhashDist < 76.5 && CNUMRatioSP >= 0.64) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio >= 0.19 && CKWSRatio >= 0.27 && CPerRatioSP < 0.49 && SimhashDist >= 76.5 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio >= 0.19 && CKWSRatio >= 0.27 && CPerRatioSP < 0.49 && SimhashDist >= 76.5 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio >= 0.19 && CKWSRatio >= 0.27 && CPerRatioSP >= 0.49 && TitleDist < 52.5 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio >= 0.19 && CKWSRatio >= 0.27 && CPerRatioSP >= 0.49 && TitleDist < 52.5 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio >= 0.19 && CKWSRatio >= 0.27 && CPerRatioSP >= 0.49 && TitleDist >= 52.5 && InsertSpan < 125979.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && TitleRatio >= 0.19 && CKWSRatio >= 0.27 && CPerRatioSP >= 0.49 && TitleDist >= 52.5 && InsertSpan >= 125979.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio < 0.26 && CKWSRatio < 0.22 && COrgRatioSP < 0.15 && CPerRatioSP < 0.34 && EpochSpan < 14663.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio < 0.26 && CKWSRatio < 0.22 && COrgRatioSP < 0.15 && CPerRatioSP < 0.34 && EpochSpan >= 14663.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio < 0.26 && CKWSRatio < 0.22 && COrgRatioSP < 0.15 && CPerRatioSP >= 0.34 && CWordSpan < 356) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio < 0.26 && CKWSRatio < 0.22 && COrgRatioSP < 0.15 && CPerRatioSP >= 0.34 && CWordSpan >= 356) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio < 0.26 && CKWSRatio < 0.22 && COrgRatioSP >= 0.15 && CLocLengthNE < 27.25 && CatRatio < 0.55) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio < 0.26 && CKWSRatio < 0.22 && COrgRatioSP >= 0.15 && CLocLengthNE < 27.25 && CatRatio >= 0.55) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio < 0.26 && CKWSRatio < 0.22 && COrgRatioSP >= 0.15 && CLocLengthNE >= 27.25 && COrgLengthSP < 13.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio < 0.26 && CKWSRatio < 0.22 && COrgRatioSP >= 0.15 && CLocLengthNE >= 27.25 && COrgLengthSP >= 13.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio < 0.26 && CKWSRatio >= 0.22 && EpochSpan < 59078 && COrgRatioNE < 0.49 && GeoRatio < 0.73) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio < 0.26 && CKWSRatio >= 0.22 && EpochSpan < 59078 && COrgRatioNE < 0.49 && GeoRatio >= 0.73) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio < 0.26 && CKWSRatio >= 0.22 && EpochSpan < 59078 && COrgRatioNE >= 0.49 && COrgLengthNE < 51.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio < 0.26 && CKWSRatio >= 0.22 && EpochSpan < 59078 && COrgRatioNE >= 0.49 && COrgLengthNE >= 51.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio < 0.26 && CKWSRatio >= 0.22 && EpochSpan >= 59078 && CPerRatioNE < 0.44 && CLocLengthSP < 22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio < 0.26 && CKWSRatio >= 0.22 && EpochSpan >= 59078 && CPerRatioNE < 0.44 && CLocLengthSP >= 22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio < 0.26 && CKWSRatio >= 0.22 && EpochSpan >= 59078 && CPerRatioNE >= 0.44 && CNUMRatioSP < 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio < 0.26 && CKWSRatio >= 0.22 && EpochSpan >= 59078 && CPerRatioNE >= 0.44 && CNUMRatioSP >= 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio >= 0.26 && SimhashDist < 69.5 && CNUMRatioSP < 0.73 && HKWSRatio < 0.64 && CKWSRatio < 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio >= 0.26 && SimhashDist < 69.5 && CNUMRatioSP < 0.73 && HKWSRatio < 0.64 && CKWSRatio >= 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio >= 0.26 && SimhashDist < 69.5 && CNUMRatioSP < 0.73 && HKWSRatio >= 0.64 && TitleDist < 23.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio >= 0.26 && SimhashDist < 69.5 && CNUMRatioSP < 0.73 && HKWSRatio >= 0.64 && TitleDist >= 23.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio >= 0.26 && SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && ChannelRatio < 0.85 && EpochSpan < 264888.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio >= 0.26 && SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && ChannelRatio < 0.85 && EpochSpan >= 264888.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio >= 0.26 && SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && ChannelRatio >= 0.85 && COrgLengthSP < 4.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio >= 0.26 && SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && ChannelRatio >= 0.85 && COrgLengthSP >= 4.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio >= 0.26 && SimhashDist >= 69.5 && EpochSpan < 72564 && CLocRatioNE < 0.39 && CKWSRatio < 0.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio >= 0.26 && SimhashDist >= 69.5 && EpochSpan < 72564 && CLocRatioNE < 0.39 && CKWSRatio >= 0.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio >= 0.26 && SimhashDist >= 69.5 && EpochSpan < 72564 && CLocRatioNE >= 0.39 && CNUMRatioSP < 0.61) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio >= 0.26 && SimhashDist >= 69.5 && EpochSpan < 72564 && CLocRatioNE >= 0.39 && CNUMRatioSP >= 0.61) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio >= 0.26 && SimhashDist >= 69.5 && EpochSpan >= 72564 && TitleRatio < 0.2 && CKWSRatio < 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio >= 0.26 && SimhashDist >= 69.5 && EpochSpan >= 72564 && TitleRatio < 0.2 && CKWSRatio >= 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio >= 0.26 && SimhashDist >= 69.5 && EpochSpan >= 72564 && TitleRatio >= 0.2 && CPerRatioSP < 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio >= 0.26 && SimhashDist >= 69.5 && EpochSpan >= 72564 && TitleRatio >= 0.2 && CPerRatioSP >= 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio < 0.91 && COrgRatioSP < 0.46 && SimhashDist < 66.5 && CPerRatioSP < 0.58 && InsertSpan < 108724.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio < 0.91 && COrgRatioSP < 0.46 && SimhashDist < 66.5 && CPerRatioSP < 0.58 && InsertSpan >= 108724.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio < 0.91 && COrgRatioSP < 0.46 && SimhashDist < 66.5 && CPerRatioSP >= 0.58 && InsertSpan < 287912.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio < 0.91 && COrgRatioSP < 0.46 && SimhashDist < 66.5 && CPerRatioSP >= 0.58 && InsertSpan >= 287912.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio < 0.91 && COrgRatioSP < 0.46 && SimhashDist >= 66.5 && EpochSpan < 136684.5 && TitleRatio < 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio < 0.91 && COrgRatioSP < 0.46 && SimhashDist >= 66.5 && EpochSpan < 136684.5 && TitleRatio >= 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio < 0.91 && COrgRatioSP < 0.46 && SimhashDist >= 66.5 && EpochSpan >= 136684.5 && CPerRatioSP < 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio < 0.91 && COrgRatioSP < 0.46 && SimhashDist >= 66.5 && EpochSpan >= 136684.5 && CPerRatioSP >= 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio < 0.91 && COrgRatioSP >= 0.46 && SameSRC < 0.5 && EpochSpan < 251173 && TKWSRatio < 0.65) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio < 0.91 && COrgRatioSP >= 0.46 && SameSRC < 0.5 && EpochSpan < 251173 && TKWSRatio >= 0.65) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio < 0.91 && COrgRatioSP >= 0.46 && SameSRC < 0.5 && EpochSpan >= 251173 && CLocRatioNE < 0.65) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio < 0.91 && COrgRatioSP >= 0.46 && SameSRC < 0.5 && EpochSpan >= 251173 && CLocRatioNE >= 0.65) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio < 0.91 && COrgRatioSP >= 0.46 && SameSRC >= 0.5 && CPerRatioSP < 0.77 && InsertSpan < 185765.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio < 0.91 && COrgRatioSP >= 0.46 && SameSRC >= 0.5 && CPerRatioSP < 0.77 && InsertSpan >= 185765.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio < 0.91 && COrgRatioSP >= 0.46 && SameSRC >= 0.5 && CPerRatioSP >= 0.77 && CNUMRatioSP < 0.45) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio < 0.91 && COrgRatioSP >= 0.46 && SameSRC >= 0.5 && CPerRatioSP >= 0.77 && CNUMRatioSP >= 0.45) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio >= 0.91 && InsertSpan < 69970.5 && CTimRatioSP < 0.36 && CKWSRatio < 0.46 && SimhashDist < 64) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio >= 0.91 && InsertSpan < 69970.5 && CTimRatioSP < 0.36 && CKWSRatio < 0.46 && SimhashDist >= 64) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio >= 0.91 && InsertSpan < 69970.5 && CTimRatioSP < 0.36 && CKWSRatio >= 0.46 && COrgLengthNE < 3.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio >= 0.91 && InsertSpan < 69970.5 && CTimRatioSP < 0.36 && CKWSRatio >= 0.46 && COrgLengthNE >= 3.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio >= 0.91 && InsertSpan < 69970.5 && CTimRatioSP >= 0.36 && SameSRC < 0.5 && TitleLength < 17.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio >= 0.91 && InsertSpan < 69970.5 && CTimRatioSP >= 0.36 && SameSRC < 0.5 && TitleLength >= 17.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio >= 0.91 && InsertSpan < 69970.5 && CTimRatioSP >= 0.36 && SameSRC >= 0.5 && SimhashDist < 12.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio >= 0.91 && InsertSpan < 69970.5 && CTimRatioSP >= 0.36 && SameSRC >= 0.5 && SimhashDist >= 12.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio >= 0.91 && InsertSpan >= 69970.5 && EpochSpan < 151086 && CNUMRatioSP < 0.46 && InsertSpan < 75857.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio >= 0.91 && InsertSpan >= 69970.5 && EpochSpan < 151086 && CNUMRatioSP < 0.46 && InsertSpan >= 75857.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio >= 0.91 && InsertSpan >= 69970.5 && EpochSpan < 151086 && CNUMRatioSP >= 0.46 && SimhashDist < 17.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio >= 0.91 && InsertSpan >= 69970.5 && EpochSpan < 151086 && CNUMRatioSP >= 0.46 && SimhashDist >= 17.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio >= 0.91 && InsertSpan >= 69970.5 && EpochSpan >= 151086 && TitleLength < 7.75 && CPerRatioNE < 0.81) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio >= 0.91 && InsertSpan >= 69970.5 && EpochSpan >= 151086 && TitleLength < 7.75 && CPerRatioNE >= 0.81) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio >= 0.91 && InsertSpan >= 69970.5 && EpochSpan >= 151086 && TitleLength >= 7.75 && SimhashDist < 47.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio >= 0.91 && InsertSpan >= 69970.5 && EpochSpan >= 151086 && TitleLength >= 7.75 && SimhashDist >= 47.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP < 0.73 && InsertSpan < 251085 && CKWSRatio < 0.29 && HKWSRatio < 0.42 && TKWSRatio < 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP < 0.73 && InsertSpan < 251085 && CKWSRatio < 0.29 && HKWSRatio < 0.42 && TKWSRatio >= 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP < 0.73 && InsertSpan < 251085 && CKWSRatio < 0.29 && HKWSRatio >= 0.42 && InsertSpan < 12375.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP < 0.73 && InsertSpan < 251085 && CKWSRatio < 0.29 && HKWSRatio >= 0.42 && InsertSpan >= 12375.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP < 0.73 && InsertSpan < 251085 && CKWSRatio >= 0.29 && CPerLengthNE < 2.25 && CNUMLengthSP < 13.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP < 0.73 && InsertSpan < 251085 && CKWSRatio >= 0.29 && CPerLengthNE < 2.25 && CNUMLengthSP >= 13.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP < 0.73 && InsertSpan < 251085 && CKWSRatio >= 0.29 && CPerLengthNE >= 2.25 && InsertSpan < 83654.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP < 0.73 && InsertSpan < 251085 && CKWSRatio >= 0.29 && CPerLengthNE >= 2.25 && InsertSpan >= 83654.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP < 0.73 && InsertSpan >= 251085 && TitleRatio < 0.16 && TKWSRatio < 0.74 && CPerRatioSP < 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP < 0.73 && InsertSpan >= 251085 && TitleRatio < 0.16 && TKWSRatio < 0.74 && CPerRatioSP >= 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP < 0.73 && InsertSpan >= 251085 && TitleRatio < 0.16 && TKWSRatio >= 0.74 && CLocRatioSP < 0.54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP < 0.73 && InsertSpan >= 251085 && TitleRatio < 0.16 && TKWSRatio >= 0.74 && CLocRatioSP >= 0.54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP < 0.73 && InsertSpan >= 251085 && TitleRatio >= 0.16 && HKWSRatio < 0.42 && COrgLengthSP < 28.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP < 0.73 && InsertSpan >= 251085 && TitleRatio >= 0.16 && HKWSRatio < 0.42 && COrgLengthSP >= 28.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP < 0.73 && InsertSpan >= 251085 && TitleRatio >= 0.16 && HKWSRatio >= 0.42 && CNUMLengthSP < 9.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP < 0.73 && InsertSpan >= 251085 && TitleRatio >= 0.16 && HKWSRatio >= 0.42 && CNUMLengthSP >= 9.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && COrgRatioSP < 0.96 && TitleRatio < 0.39 && EpochSpan < 248793 && CLocLengthSP < 30) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && COrgRatioSP < 0.96 && TitleRatio < 0.39 && EpochSpan < 248793 && CLocLengthSP >= 30) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && COrgRatioSP < 0.96 && TitleRatio < 0.39 && EpochSpan >= 248793 && CPerLengthSP < 5.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && COrgRatioSP < 0.96 && TitleRatio < 0.39 && EpochSpan >= 248793 && CPerLengthSP >= 5.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && COrgRatioSP < 0.96 && TitleRatio >= 0.39 && EpochSpan < 251552.5 && CPerRatioSP < 0.54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && COrgRatioSP < 0.96 && TitleRatio >= 0.39 && EpochSpan < 251552.5 && CPerRatioSP >= 0.54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && COrgRatioSP < 0.96 && TitleRatio >= 0.39 && EpochSpan >= 251552.5 && COrgRatioSP < 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && COrgRatioSP < 0.96 && TitleRatio >= 0.39 && EpochSpan >= 251552.5 && COrgRatioSP >= 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && COrgRatioSP >= 0.96 && CKWSRatio < 0.98 && EpochSpan < 75574 && COrgLengthSP < 7.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && COrgRatioSP >= 0.96 && CKWSRatio < 0.98 && EpochSpan < 75574 && COrgLengthSP >= 7.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && COrgRatioSP >= 0.96 && CKWSRatio < 0.98 && EpochSpan >= 75574 && CLocLengthNE < 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && COrgRatioSP >= 0.96 && CKWSRatio < 0.98 && EpochSpan >= 75574 && CLocLengthNE >= 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && COrgRatioSP >= 0.96 && CKWSRatio >= 0.98 && TOrgLengthNE < 2.75 && TKWSRatio < 0.87) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && COrgRatioSP >= 0.96 && CKWSRatio >= 0.98 && TOrgLengthNE < 2.75 && TKWSRatio >= 0.87) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && COrgRatioSP >= 0.96 && CKWSRatio >= 0.98 && TOrgLengthNE >= 2.75 && TOrgLengthSP < 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && COrgRatioSP >= 0.96 && CKWSRatio >= 0.98 && TOrgLengthNE >= 2.75 && TOrgLengthSP >= 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio < 0.19 && ChannelRatio < 0.11 && CNUMRatioSP < 0.28 && COrgLengthSP < 6.25 && CKWSRatio < 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio < 0.19 && ChannelRatio < 0.11 && CNUMRatioSP < 0.28 && COrgLengthSP < 6.25 && CKWSRatio >= 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio < 0.19 && ChannelRatio < 0.11 && CNUMRatioSP < 0.28 && COrgLengthSP >= 6.25 && ParagraphSpan < 27.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio < 0.19 && ChannelRatio < 0.11 && CNUMRatioSP < 0.28 && COrgLengthSP >= 6.25 && ParagraphSpan >= 27.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio < 0.19 && ChannelRatio < 0.11 && CNUMRatioSP >= 0.28 && CPerRatioNE < 0.32 && CKWSRatio < 0.21) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio < 0.19 && ChannelRatio < 0.11 && CNUMRatioSP >= 0.28 && CPerRatioNE < 0.32 && CKWSRatio >= 0.21) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio < 0.19 && ChannelRatio < 0.11 && CNUMRatioSP >= 0.28 && CPerRatioNE >= 0.32 && CTimRatioSP < 0.27) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio < 0.19 && ChannelRatio < 0.11 && CNUMRatioSP >= 0.28 && CPerRatioNE >= 0.32 && CTimRatioSP >= 0.27) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio < 0.19 && ChannelRatio >= 0.11 && ChannelRatio < 0.34 && COrgRatioSP < 0.49 && SimhashDist < 77.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio < 0.19 && ChannelRatio >= 0.11 && ChannelRatio < 0.34 && COrgRatioSP < 0.49 && SimhashDist >= 77.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio < 0.19 && ChannelRatio >= 0.11 && ChannelRatio < 0.34 && COrgRatioSP >= 0.49 && CTimRatioSP < 0.14) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio < 0.19 && ChannelRatio >= 0.11 && ChannelRatio < 0.34 && COrgRatioSP >= 0.49 && CTimRatioSP >= 0.14) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio < 0.19 && ChannelRatio >= 0.11 && ChannelRatio >= 0.34 && CPerRatioNE < 0.36 && TOrgRatioNE < 0.88) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio < 0.19 && ChannelRatio >= 0.11 && ChannelRatio >= 0.34 && CPerRatioNE < 0.36 && TOrgRatioNE >= 0.88) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio < 0.19 && ChannelRatio >= 0.11 && ChannelRatio >= 0.34 && CPerRatioNE >= 0.36 && CKWSRatio < 0.57) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio < 0.19 && ChannelRatio >= 0.11 && ChannelRatio >= 0.34 && CPerRatioNE >= 0.36 && CKWSRatio >= 0.57) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio >= 0.19 && EpochSpan < 84164 && COrgRatioSP < 0.46 && CLocRatioSP < 0.36 && ChannelRatio < 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio >= 0.19 && EpochSpan < 84164 && COrgRatioSP < 0.46 && CLocRatioSP < 0.36 && ChannelRatio >= 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio >= 0.19 && EpochSpan < 84164 && COrgRatioSP < 0.46 && CLocRatioSP >= 0.36 && TitleRatio < 0.38) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio >= 0.19 && EpochSpan < 84164 && COrgRatioSP < 0.46 && CLocRatioSP >= 0.36 && TitleRatio >= 0.38) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio >= 0.19 && EpochSpan < 84164 && COrgRatioSP >= 0.46 && TKWSRatio < 0.42 && CatLength < 0.91) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio >= 0.19 && EpochSpan < 84164 && COrgRatioSP >= 0.46 && TKWSRatio < 0.42 && CatLength >= 0.91) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio >= 0.19 && EpochSpan < 84164 && COrgRatioSP >= 0.46 && TKWSRatio >= 0.42 && CLocRatioSP < 0.45) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio >= 0.19 && EpochSpan < 84164 && COrgRatioSP >= 0.46 && TKWSRatio >= 0.42 && CLocRatioSP >= 0.45) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio >= 0.19 && EpochSpan >= 84164 && CPerRatioSP < 0.21 && CLocLengthSP < 2.25 && COrgLengthNE < 1.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio >= 0.19 && EpochSpan >= 84164 && CPerRatioSP < 0.21 && CLocLengthSP < 2.25 && COrgLengthNE >= 1.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio >= 0.19 && EpochSpan >= 84164 && CPerRatioSP < 0.21 && CLocLengthSP >= 2.25 && CPerLengthNE < 33.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio >= 0.19 && EpochSpan >= 84164 && CPerRatioSP < 0.21 && CLocLengthSP >= 2.25 && CPerLengthNE >= 33.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio >= 0.19 && EpochSpan >= 84164 && CPerRatioSP >= 0.21 && EpochSpan < 305831.5 && CNUMRatioSP < 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio >= 0.19 && EpochSpan >= 84164 && CPerRatioSP >= 0.21 && EpochSpan < 305831.5 && CNUMRatioSP >= 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio >= 0.19 && EpochSpan >= 84164 && CPerRatioSP >= 0.21 && EpochSpan >= 305831.5 && CWordSpan < 894.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && TitleRatio >= 0.19 && EpochSpan >= 84164 && CPerRatioSP >= 0.21 && EpochSpan >= 305831.5 && CWordSpan >= 894.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio < 0.29 && TitleRatio < 0.13 && SimhashDist < 69.5 && CPerLengthNE < 39.75 && CPerRatioSP < 0.06) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio < 0.29 && TitleRatio < 0.13 && SimhashDist < 69.5 && CPerLengthNE < 39.75 && CPerRatioSP >= 0.06) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio < 0.29 && TitleRatio < 0.13 && SimhashDist < 69.5 && CPerLengthNE >= 39.75 && CLocRatioNE < 0.54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio < 0.29 && TitleRatio < 0.13 && SimhashDist < 69.5 && CPerLengthNE >= 39.75 && CLocRatioNE >= 0.54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio < 0.29 && TitleRatio < 0.13 && SimhashDist >= 69.5 && HKWSRatio < 0.73 && CPerRatioNE < 0.19) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio < 0.29 && TitleRatio < 0.13 && SimhashDist >= 69.5 && HKWSRatio < 0.73 && CPerRatioNE >= 0.19) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio < 0.29 && TitleRatio < 0.13 && SimhashDist >= 69.5 && HKWSRatio >= 0.73 && CatLength < 1.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio < 0.29 && TitleRatio < 0.13 && SimhashDist >= 69.5 && HKWSRatio >= 0.73 && CatLength >= 1.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio < 0.29 && TitleRatio >= 0.13 && TitleRatio < 0.26 && SimhashDist < 74.5 && CKWSRatio < 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio < 0.29 && TitleRatio >= 0.13 && TitleRatio < 0.26 && SimhashDist < 74.5 && CKWSRatio >= 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio < 0.29 && TitleRatio >= 0.13 && TitleRatio < 0.26 && SimhashDist >= 74.5 && CPerRatioSP < 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio < 0.29 && TitleRatio >= 0.13 && TitleRatio < 0.26 && SimhashDist >= 74.5 && CPerRatioSP >= 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio < 0.29 && TitleRatio >= 0.13 && TitleRatio >= 0.26 && CPerRatioNE < 0.23 && ChannelRatio < 0.81) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio < 0.29 && TitleRatio >= 0.13 && TitleRatio >= 0.26 && CPerRatioNE < 0.23 && ChannelRatio >= 0.81) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio < 0.29 && TitleRatio >= 0.13 && TitleRatio >= 0.26 && CPerRatioNE >= 0.23 && CKWSRatio < 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio < 0.29 && TitleRatio >= 0.13 && TitleRatio >= 0.26 && CPerRatioNE >= 0.23 && CKWSRatio >= 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio >= 0.29 && CPerRatioSP < 0.27 && TKWSRatio < 0.55 && EpochSpan < 65308 && TitleLength < 13.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio >= 0.29 && CPerRatioSP < 0.27 && TKWSRatio < 0.55 && EpochSpan < 65308 && TitleLength >= 13.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio >= 0.29 && CPerRatioSP < 0.27 && TKWSRatio < 0.55 && EpochSpan >= 65308 && CLocLengthNE < 24.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio >= 0.29 && CPerRatioSP < 0.27 && TKWSRatio < 0.55 && EpochSpan >= 65308 && CLocLengthNE >= 24.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio >= 0.29 && CPerRatioSP < 0.27 && TKWSRatio >= 0.55 && InsertSpan < 73292.5 && TitleRatio < 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio >= 0.29 && CPerRatioSP < 0.27 && TKWSRatio >= 0.55 && InsertSpan < 73292.5 && TitleRatio >= 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio >= 0.29 && CPerRatioSP < 0.27 && TKWSRatio >= 0.55 && InsertSpan >= 73292.5 && SimhashDist < 69.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio >= 0.29 && CPerRatioSP < 0.27 && TKWSRatio >= 0.55 && InsertSpan >= 73292.5 && SimhashDist >= 69.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio >= 0.29 && CPerRatioSP >= 0.27 && TitleRatio < 0.42 && CNUMRatioSP < 0.41 && EpochSpan < 216515) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio >= 0.29 && CPerRatioSP >= 0.27 && TitleRatio < 0.42 && CNUMRatioSP < 0.41 && EpochSpan >= 216515) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio >= 0.29 && CPerRatioSP >= 0.27 && TitleRatio < 0.42 && CNUMRatioSP >= 0.41 && EpochSpan < 277569.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio >= 0.29 && CPerRatioSP >= 0.27 && TitleRatio < 0.42 && CNUMRatioSP >= 0.41 && EpochSpan >= 277569.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio >= 0.29 && CPerRatioSP >= 0.27 && TitleRatio >= 0.42 && HKWSRatio < 0.44 && TKWSRatio < 0.59) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio >= 0.29 && CPerRatioSP >= 0.27 && TitleRatio >= 0.42 && HKWSRatio < 0.44 && TKWSRatio >= 0.59) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio >= 0.29 && CPerRatioSP >= 0.27 && TitleRatio >= 0.42 && HKWSRatio >= 0.44 && TitleLength < 6.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio >= 0.29 && CPerRatioSP >= 0.27 && TitleRatio >= 0.42 && HKWSRatio >= 0.44 && TitleLength >= 6.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio < 0.69 && InsertSpan < 125648 && TKWSRatio < 0.29 && TitleRatio < 0.21 && CPerRatioNE < 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio < 0.69 && InsertSpan < 125648 && TKWSRatio < 0.29 && TitleRatio < 0.21 && CPerRatioNE >= 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio < 0.69 && InsertSpan < 125648 && TKWSRatio < 0.29 && TitleRatio >= 0.21 && CNUMLengthSP < 39.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio < 0.69 && InsertSpan < 125648 && TKWSRatio < 0.29 && TitleRatio >= 0.21 && CNUMLengthSP >= 39.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio < 0.69 && InsertSpan < 125648 && TKWSRatio >= 0.29 && EpochSpan < 77346.5 && CPerRatioNE < 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio < 0.69 && InsertSpan < 125648 && TKWSRatio >= 0.29 && EpochSpan < 77346.5 && CPerRatioNE >= 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio < 0.69 && InsertSpan < 125648 && TKWSRatio >= 0.29 && EpochSpan >= 77346.5 && COrgRatioNE < 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio < 0.69 && InsertSpan < 125648 && TKWSRatio >= 0.29 && EpochSpan >= 77346.5 && COrgRatioNE >= 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio < 0.69 && InsertSpan >= 125648 && InsertSpan < 259033 && TitleRatio < 0.23 && CPerRatioNE < 0.73) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio < 0.69 && InsertSpan >= 125648 && InsertSpan < 259033 && TitleRatio < 0.23 && CPerRatioNE >= 0.73) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio < 0.69 && InsertSpan >= 125648 && InsertSpan < 259033 && TitleRatio >= 0.23 && CPerRatioNE < 0.55) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio < 0.69 && InsertSpan >= 125648 && InsertSpan < 259033 && TitleRatio >= 0.23 && CPerRatioNE >= 0.55) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio < 0.69 && InsertSpan >= 125648 && InsertSpan >= 259033 && CKWSRatio < 0.34 && EpochSpan < 257756) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio < 0.69 && InsertSpan >= 125648 && InsertSpan >= 259033 && CKWSRatio < 0.34 && EpochSpan >= 257756) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio < 0.69 && InsertSpan >= 125648 && InsertSpan >= 259033 && CKWSRatio >= 0.34 && CNUMLengthSP < 12.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio < 0.69 && InsertSpan >= 125648 && InsertSpan >= 259033 && CKWSRatio >= 0.34 && CNUMLengthSP >= 12.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio >= 0.69 && EpochSpan < 75425 && TitleRatio < 0.89 && COrgLengthSP < 2.25 && CLocRatioSP < 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio >= 0.69 && EpochSpan < 75425 && TitleRatio < 0.89 && COrgLengthSP < 2.25 && CLocRatioSP >= 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio >= 0.69 && EpochSpan < 75425 && TitleRatio < 0.89 && COrgLengthSP >= 2.25 && TitleRatio < 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio >= 0.69 && EpochSpan < 75425 && TitleRatio < 0.89 && COrgLengthSP >= 2.25 && TitleRatio >= 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio >= 0.69 && EpochSpan < 75425 && TitleRatio >= 0.89 && CTimRatioSP < 0.32 && CNUMLengthSP < 19.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio >= 0.69 && EpochSpan < 75425 && TitleRatio >= 0.89 && CTimRatioSP < 0.32 && CNUMLengthSP >= 19.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio >= 0.69 && EpochSpan < 75425 && TitleRatio >= 0.89 && CTimRatioSP >= 0.32 && CTimLengthSP < 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio >= 0.69 && EpochSpan < 75425 && TitleRatio >= 0.89 && CTimRatioSP >= 0.32 && CTimLengthSP >= 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio >= 0.69 && EpochSpan >= 75425 && COrgRatioNE < 0.1 && CNUMRatioSP < 0.33 && TKWSLength < 4.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio >= 0.69 && EpochSpan >= 75425 && COrgRatioNE < 0.1 && CNUMRatioSP < 0.33 && TKWSLength >= 4.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio >= 0.69 && EpochSpan >= 75425 && COrgRatioNE < 0.1 && CNUMRatioSP >= 0.33 && CKWSRatio < 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio >= 0.69 && EpochSpan >= 75425 && COrgRatioNE < 0.1 && CNUMRatioSP >= 0.33 && CKWSRatio >= 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio >= 0.69 && EpochSpan >= 75425 && COrgRatioNE >= 0.1 && EpochSpan < 571438 && CPerRatioNE < 0.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio >= 0.69 && EpochSpan >= 75425 && COrgRatioNE >= 0.1 && EpochSpan < 571438 && CPerRatioNE >= 0.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio >= 0.69 && EpochSpan >= 75425 && COrgRatioNE >= 0.1 && EpochSpan >= 571438 && CLocLengthSP < 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TKWSRatio >= 0.69 && EpochSpan >= 75425 && COrgRatioNE >= 0.1 && EpochSpan >= 571438 && CLocLengthSP >= 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan < 75811 && TitleRatio < 0.9 && CKWSLength < 6.75 && EpochSpan < 34200 && SimhashDist < 41) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan < 75811 && TitleRatio < 0.9 && CKWSLength < 6.75 && EpochSpan < 34200 && SimhashDist >= 41) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan < 75811 && TitleRatio < 0.9 && CKWSLength < 6.75 && EpochSpan >= 34200 && TitleRatio < 0.72) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan < 75811 && TitleRatio < 0.9 && CKWSLength < 6.75 && EpochSpan >= 34200 && TitleRatio >= 0.72) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan < 75811 && TitleRatio < 0.9 && CKWSLength >= 6.75 && TKWSRatio < 0.56 && CTimRatioSP < 0.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan < 75811 && TitleRatio < 0.9 && CKWSLength >= 6.75 && TKWSRatio < 0.56 && CTimRatioSP >= 0.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan < 75811 && TitleRatio < 0.9 && CKWSLength >= 6.75 && TKWSRatio >= 0.56 && CPerRatioSP < 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan < 75811 && TitleRatio < 0.9 && CKWSLength >= 6.75 && TKWSRatio >= 0.56 && CPerRatioSP >= 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan < 75811 && TitleRatio >= 0.9 && COrgLengthSP < 3.25 && CTimLengthSP < 2.25 && COrgRatioSP < 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan < 75811 && TitleRatio >= 0.9 && COrgLengthSP < 3.25 && CTimLengthSP < 2.25 && COrgRatioSP >= 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan < 75811 && TitleRatio >= 0.9 && COrgLengthSP < 3.25 && CTimLengthSP >= 2.25 && TitleLength < 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan < 75811 && TitleRatio >= 0.9 && COrgLengthSP < 3.25 && CTimLengthSP >= 2.25 && TitleLength >= 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan < 75811 && TitleRatio >= 0.9 && COrgLengthSP >= 3.25 && CKWSRatio < 0.85 && TKWSLength < 4.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan < 75811 && TitleRatio >= 0.9 && COrgLengthSP >= 3.25 && CKWSRatio < 0.85 && TKWSLength >= 4.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan < 75811 && TitleRatio >= 0.9 && COrgLengthSP >= 3.25 && CKWSRatio >= 0.85 && TKWSRatio < 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan < 75811 && TitleRatio >= 0.9 && COrgLengthSP >= 3.25 && CKWSRatio >= 0.85 && TKWSRatio >= 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan >= 75811 && TKWSRatio < 0.6 && HKWSRatio < 0.32 && CLocRatioSP < 0.48 && TitleRatio < 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan >= 75811 && TKWSRatio < 0.6 && HKWSRatio < 0.32 && CLocRatioSP < 0.48 && TitleRatio >= 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan >= 75811 && TKWSRatio < 0.6 && HKWSRatio < 0.32 && CLocRatioSP >= 0.48 && CPerRatioSP < 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan >= 75811 && TKWSRatio < 0.6 && HKWSRatio < 0.32 && CLocRatioSP >= 0.48 && CPerRatioSP >= 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan >= 75811 && TKWSRatio < 0.6 && HKWSRatio >= 0.32 && CKWSRatio < 0.31 && CPerRatioNE < 0.18) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan >= 75811 && TKWSRatio < 0.6 && HKWSRatio >= 0.32 && CKWSRatio < 0.31 && CPerRatioNE >= 0.18) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan >= 75811 && TKWSRatio < 0.6 && HKWSRatio >= 0.32 && CKWSRatio >= 0.31 && InsertSpan < 310729) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan >= 75811 && TKWSRatio < 0.6 && HKWSRatio >= 0.32 && CKWSRatio >= 0.31 && InsertSpan >= 310729) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan >= 75811 && TKWSRatio >= 0.6 && InsertSpan < 283159.5 && CPerRatioSP < 0.61 && CatLength < 1.51) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan >= 75811 && TKWSRatio >= 0.6 && InsertSpan < 283159.5 && CPerRatioSP < 0.61 && CatLength >= 1.51) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan >= 75811 && TKWSRatio >= 0.6 && InsertSpan < 283159.5 && CPerRatioSP >= 0.61 && CLocRatioSP < 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan >= 75811 && TKWSRatio >= 0.6 && InsertSpan < 283159.5 && CPerRatioSP >= 0.61 && CLocRatioSP >= 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan >= 75811 && TKWSRatio >= 0.6 && InsertSpan >= 283159.5 && CLocRatioSP < 0.76 && ChannelLength < 3.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan >= 75811 && TKWSRatio >= 0.6 && InsertSpan >= 283159.5 && CLocRatioSP < 0.76 && ChannelLength >= 3.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan >= 75811 && TKWSRatio >= 0.6 && InsertSpan >= 283159.5 && CLocRatioSP >= 0.76 && CNUMRatioSP < 0.64) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan >= 75811 && TKWSRatio >= 0.6 && InsertSpan >= 283159.5 && CLocRatioSP >= 0.76 && CNUMRatioSP >= 0.64) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio < 0.5 && CKWSRatio < 0.21 && TKWSRatio < 0.24 && CPerRatioNE < 0.05 && CLocRatioSP < 0.72) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio < 0.5 && CKWSRatio < 0.21 && TKWSRatio < 0.24 && CPerRatioNE < 0.05 && CLocRatioSP >= 0.72) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio < 0.5 && CKWSRatio < 0.21 && TKWSRatio < 0.24 && CPerRatioNE >= 0.05 && TKWSLength < 3.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio < 0.5 && CKWSRatio < 0.21 && TKWSRatio < 0.24 && CPerRatioNE >= 0.05 && TKWSLength >= 3.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio < 0.5 && CKWSRatio < 0.21 && TKWSRatio >= 0.24 && COrgRatioNE < 0.46 && TKWSRatio < 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio < 0.5 && CKWSRatio < 0.21 && TKWSRatio >= 0.24 && COrgRatioNE < 0.46 && TKWSRatio >= 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio < 0.5 && CKWSRatio < 0.21 && TKWSRatio >= 0.24 && COrgRatioNE >= 0.46 && SimhashDist < 78.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio < 0.5 && CKWSRatio < 0.21 && TKWSRatio >= 0.24 && COrgRatioNE >= 0.46 && SimhashDist >= 78.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio < 0.5 && CKWSRatio >= 0.21 && CPerRatioSP < 0.29 && ChannelRatio < 0.06 && CNUMRatioSP < 0.54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio < 0.5 && CKWSRatio >= 0.21 && CPerRatioSP < 0.29 && ChannelRatio < 0.06 && CNUMRatioSP >= 0.54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio < 0.5 && CKWSRatio >= 0.21 && CPerRatioSP < 0.29 && ChannelRatio >= 0.06 && TitleRatio < 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio < 0.5 && CKWSRatio >= 0.21 && CPerRatioSP < 0.29 && ChannelRatio >= 0.06 && TitleRatio >= 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio < 0.5 && CKWSRatio >= 0.21 && CPerRatioSP >= 0.29 && InsertSpan < 88485.5 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio < 0.5 && CKWSRatio >= 0.21 && CPerRatioSP >= 0.29 && InsertSpan < 88485.5 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio < 0.5 && CKWSRatio >= 0.21 && CPerRatioSP >= 0.29 && InsertSpan >= 88485.5 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio < 0.5 && CKWSRatio >= 0.21 && CPerRatioSP >= 0.29 && InsertSpan >= 88485.5 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio >= 0.5 && CKWSRatio < 0.24 && TOrgRatioSP < 0.52 && CPerRatioSP < 0.44 && CKWSRatio < 0.15) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio >= 0.5 && CKWSRatio < 0.24 && TOrgRatioSP < 0.52 && CPerRatioSP < 0.44 && CKWSRatio >= 0.15) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio >= 0.5 && CKWSRatio < 0.24 && TOrgRatioSP < 0.52 && CPerRatioSP >= 0.44 && CPerLengthSP < 13.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio >= 0.5 && CKWSRatio < 0.24 && TOrgRatioSP < 0.52 && CPerRatioSP >= 0.44 && CPerLengthSP >= 13.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio >= 0.5 && CKWSRatio < 0.24 && TOrgRatioSP >= 0.52 && TitleDist < 39.5 && CLocLengthNE < 4.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio >= 0.5 && CKWSRatio < 0.24 && TOrgRatioSP >= 0.52 && TitleDist < 39.5 && CLocLengthNE >= 4.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio >= 0.5 && CKWSRatio < 0.24 && TOrgRatioSP >= 0.52 && TitleDist >= 39.5 && COrgRatioSP < 0.69) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio >= 0.5 && CKWSRatio < 0.24 && TOrgRatioSP >= 0.52 && TitleDist >= 39.5 && COrgRatioSP >= 0.69) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio >= 0.5 && CKWSRatio >= 0.24 && CKWSRatio < 0.41 && CPerRatioNE < 0.39 && CPerRatioSP < 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio >= 0.5 && CKWSRatio >= 0.24 && CKWSRatio < 0.41 && CPerRatioNE < 0.39 && CPerRatioSP >= 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio >= 0.5 && CKWSRatio >= 0.24 && CKWSRatio < 0.41 && CPerRatioNE >= 0.39 && CPerRatioNE < 0.77) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio >= 0.5 && CKWSRatio >= 0.24 && CKWSRatio < 0.41 && CPerRatioNE >= 0.39 && CPerRatioNE >= 0.77) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio >= 0.5 && CKWSRatio >= 0.24 && CKWSRatio >= 0.41 && EpochSpan < 103189.5 && TKWSRatio < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio >= 0.5 && CKWSRatio >= 0.24 && CKWSRatio >= 0.41 && EpochSpan < 103189.5 && TKWSRatio >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio >= 0.5 && CKWSRatio >= 0.24 && CKWSRatio >= 0.41 && EpochSpan >= 103189.5 && InsertSpan < 175987) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && CatRatio >= 0.5 && CKWSRatio >= 0.24 && CKWSRatio >= 0.41 && EpochSpan >= 103189.5 && InsertSpan >= 175987) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio < 0.21 && ChannelRatio < 0.11 && CPerRatioSP < 0.62 && CatRatio < 0.54 && COrgRatioSP < 0.07) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio < 0.21 && ChannelRatio < 0.11 && CPerRatioSP < 0.62 && CatRatio < 0.54 && COrgRatioSP >= 0.07) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio < 0.21 && ChannelRatio < 0.11 && CPerRatioSP < 0.62 && CatRatio >= 0.54 && TitleRatio < 0.1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio < 0.21 && ChannelRatio < 0.11 && CPerRatioSP < 0.62 && CatRatio >= 0.54 && TitleRatio >= 0.1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio < 0.21 && ChannelRatio < 0.11 && CPerRatioSP >= 0.62 && CLocLengthSP < 4.75 && CPerRatioSP < 0.67) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio < 0.21 && ChannelRatio < 0.11 && CPerRatioSP >= 0.62 && CLocLengthSP < 4.75 && CPerRatioSP >= 0.67) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio < 0.21 && ChannelRatio < 0.11 && CPerRatioSP >= 0.62 && CLocLengthSP >= 4.75 && CNUMRatioSP < 0.66) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio < 0.21 && ChannelRatio < 0.11 && CPerRatioSP >= 0.62 && CLocLengthSP >= 4.75 && CNUMRatioSP >= 0.66) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio < 0.21 && ChannelRatio >= 0.11 && COrgRatioNE < 0.18 && CPerRatioSP < 0.29 && ParagraphSpan < 24.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio < 0.21 && ChannelRatio >= 0.11 && COrgRatioNE < 0.18 && CPerRatioSP < 0.29 && ParagraphSpan >= 24.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio < 0.21 && ChannelRatio >= 0.11 && COrgRatioNE < 0.18 && CPerRatioSP >= 0.29 && COrgRatioSP < 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio < 0.21 && ChannelRatio >= 0.11 && COrgRatioNE < 0.18 && CPerRatioSP >= 0.29 && COrgRatioSP >= 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio < 0.21 && ChannelRatio >= 0.11 && COrgRatioNE >= 0.18 && CPerRatioSP < 0.1 && COrgRatioNE < 0.79) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio < 0.21 && ChannelRatio >= 0.11 && COrgRatioNE >= 0.18 && CPerRatioSP < 0.1 && COrgRatioNE >= 0.79) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio < 0.21 && ChannelRatio >= 0.11 && COrgRatioNE >= 0.18 && CPerRatioSP >= 0.1 && SimhashDist < 74.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio < 0.21 && ChannelRatio >= 0.11 && COrgRatioNE >= 0.18 && CPerRatioSP >= 0.1 && SimhashDist >= 74.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio >= 0.21 && COrgRatioSP < 0.49 && TKWSRatio < 0.49 && CPerRatioSP < 0.57 && CTimLengthSP < 25.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio >= 0.21 && COrgRatioSP < 0.49 && TKWSRatio < 0.49 && CPerRatioSP < 0.57 && CTimLengthSP >= 25.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio >= 0.21 && COrgRatioSP < 0.49 && TKWSRatio < 0.49 && CPerRatioSP >= 0.57 && CPerRatioNE < 0.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio >= 0.21 && COrgRatioSP < 0.49 && TKWSRatio < 0.49 && CPerRatioSP >= 0.57 && CPerRatioNE >= 0.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio >= 0.21 && COrgRatioSP < 0.49 && TKWSRatio >= 0.49 && COrgRatioNE < 0.35 && HKWSRatio < 0.7) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio >= 0.21 && COrgRatioSP < 0.49 && TKWSRatio >= 0.49 && COrgRatioNE < 0.35 && HKWSRatio >= 0.7) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio >= 0.21 && COrgRatioSP < 0.49 && TKWSRatio >= 0.49 && COrgRatioNE >= 0.35 && TKWSRatio < 0.55) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio >= 0.21 && COrgRatioSP < 0.49 && TKWSRatio >= 0.49 && COrgRatioNE >= 0.35 && TKWSRatio >= 0.55) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio >= 0.21 && COrgRatioSP >= 0.49 && TKWSRatio < 0.37 && CPerRatioNE < 0.43 && CLocRatioSP < 0.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio >= 0.21 && COrgRatioSP >= 0.49 && TKWSRatio < 0.37 && CPerRatioNE < 0.43 && CLocRatioSP >= 0.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio >= 0.21 && COrgRatioSP >= 0.49 && TKWSRatio < 0.37 && CPerRatioNE >= 0.43 && CKWSRatio < 0.38) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio >= 0.21 && COrgRatioSP >= 0.49 && TKWSRatio < 0.37 && CPerRatioNE >= 0.43 && CKWSRatio >= 0.38) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio >= 0.21 && COrgRatioSP >= 0.49 && TKWSRatio >= 0.37 && CTimRatioSP < 0.37 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio >= 0.21 && COrgRatioSP >= 0.49 && TKWSRatio >= 0.37 && CTimRatioSP < 0.37 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio >= 0.21 && COrgRatioSP >= 0.49 && TKWSRatio >= 0.37 && CTimRatioSP >= 0.37 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio >= 0.21 && COrgRatioSP >= 0.49 && TKWSRatio >= 0.37 && CTimRatioSP >= 0.37 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist < 0.5 && InsertSpan < 69970.5 && CKWSLength < 7.25 && InsertSpan < 27422 && ChannelLength < 3.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist < 0.5 && InsertSpan < 69970.5 && CKWSLength < 7.25 && InsertSpan < 27422 && ChannelLength >= 3.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist < 0.5 && InsertSpan < 69970.5 && CKWSLength < 7.25 && InsertSpan >= 27422 && CNUMLengthSP < 4) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist < 0.5 && InsertSpan < 69970.5 && CKWSLength < 7.25 && InsertSpan >= 27422 && CNUMLengthSP >= 4) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist < 0.5 && InsertSpan < 69970.5 && CKWSLength >= 7.25 && CPerRatioSP < 0.86 && TitleLength < 4.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist < 0.5 && InsertSpan < 69970.5 && CKWSLength >= 7.25 && CPerRatioSP < 0.86 && TitleLength >= 4.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist < 0.5 && InsertSpan < 69970.5 && CKWSLength >= 7.25 && CPerRatioSP >= 0.86 && TOrgLengthSP < 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist < 0.5 && InsertSpan < 69970.5 && CKWSLength >= 7.25 && CPerRatioSP >= 0.86 && TOrgLengthSP >= 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist < 0.5 && InsertSpan >= 69970.5 && CTimRatioSP < 0.84 && COrgLengthNE < 3.25 && EpochSpan < 76465.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist < 0.5 && InsertSpan >= 69970.5 && CTimRatioSP < 0.84 && COrgLengthNE < 3.25 && EpochSpan >= 76465.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist < 0.5 && InsertSpan >= 69970.5 && CTimRatioSP < 0.84 && COrgLengthNE >= 3.25 && CKWSLength < 18.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist < 0.5 && InsertSpan >= 69970.5 && CTimRatioSP < 0.84 && COrgLengthNE >= 3.25 && CKWSLength >= 18.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist < 0.5 && InsertSpan >= 69970.5 && CTimRatioSP >= 0.84 && CLocRatioNE < 0.86 && ParagraphSpan < 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist < 0.5 && InsertSpan >= 69970.5 && CTimRatioSP >= 0.84 && CLocRatioNE < 0.86 && ParagraphSpan >= 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist < 0.5 && InsertSpan >= 69970.5 && CTimRatioSP >= 0.84 && CLocRatioNE >= 0.86 && CNUMRatioSP < 0.86) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist < 0.5 && InsertSpan >= 69970.5 && CTimRatioSP >= 0.84 && CLocRatioNE >= 0.86 && CNUMRatioSP >= 0.86) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist >= 0.5 && InsertSpan < 251438 && SimhashDist < 65.5 && CNUMRatioSP < 0.5 && EpochSpan < 83419) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist >= 0.5 && InsertSpan < 251438 && SimhashDist < 65.5 && CNUMRatioSP < 0.5 && EpochSpan >= 83419) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist >= 0.5 && InsertSpan < 251438 && SimhashDist < 65.5 && CNUMRatioSP >= 0.5 && CWordSpan < 16.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist >= 0.5 && InsertSpan < 251438 && SimhashDist < 65.5 && CNUMRatioSP >= 0.5 && CWordSpan >= 16.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist >= 0.5 && InsertSpan < 251438 && SimhashDist >= 65.5 && CKWSRatio < 0.31 && CPerRatioSP < 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist >= 0.5 && InsertSpan < 251438 && SimhashDist >= 65.5 && CKWSRatio < 0.31 && CPerRatioSP >= 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist >= 0.5 && InsertSpan < 251438 && SimhashDist >= 65.5 && CKWSRatio >= 0.31 && CPerRatioSP < 0.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist >= 0.5 && InsertSpan < 251438 && SimhashDist >= 65.5 && CKWSRatio >= 0.31 && CPerRatioSP >= 0.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist >= 0.5 && InsertSpan >= 251438 && CPerRatioNE < 0.59 && TKWSRatio < 0.23 && ParagraphSpan < 5.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist >= 0.5 && InsertSpan >= 251438 && CPerRatioNE < 0.59 && TKWSRatio < 0.23 && ParagraphSpan >= 5.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist >= 0.5 && InsertSpan >= 251438 && CPerRatioNE < 0.59 && TKWSRatio >= 0.23 && EpochSpan < 254653.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist >= 0.5 && InsertSpan >= 251438 && CPerRatioNE < 0.59 && TKWSRatio >= 0.23 && EpochSpan >= 254653.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist >= 0.5 && InsertSpan >= 251438 && CPerRatioNE >= 0.59 && TitleRatio < 0.42 && CLocRatioNE < 0.84) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist >= 0.5 && InsertSpan >= 251438 && CPerRatioNE >= 0.59 && TitleRatio < 0.42 && CLocRatioNE >= 0.84) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist >= 0.5 && InsertSpan >= 251438 && CPerRatioNE >= 0.59 && TitleRatio >= 0.42 && CKWSLength < 12.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && TitleDist >= 0.5 && InsertSpan >= 251438 && CPerRatioNE >= 0.59 && TitleRatio >= 0.42 && CKWSLength >= 12.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist < 71.5 && InsertSpan < 110180 && TKWSRatio < 0.54 && CLocRatioSP < 0.57 && CWordSpan < 17.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist < 71.5 && InsertSpan < 110180 && TKWSRatio < 0.54 && CLocRatioSP < 0.57 && CWordSpan >= 17.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist < 71.5 && InsertSpan < 110180 && TKWSRatio < 0.54 && CLocRatioSP >= 0.57 && EpochSpan < 65065) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist < 71.5 && InsertSpan < 110180 && TKWSRatio < 0.54 && CLocRatioSP >= 0.57 && EpochSpan >= 65065) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist < 71.5 && InsertSpan < 110180 && TKWSRatio >= 0.54 && TitleRatio < 0.9 && EpochSpan < 83180) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist < 71.5 && InsertSpan < 110180 && TKWSRatio >= 0.54 && TitleRatio < 0.9 && EpochSpan >= 83180) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist < 71.5 && InsertSpan < 110180 && TKWSRatio >= 0.54 && TitleRatio >= 0.9 && CNUMLengthSP < 21.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist < 71.5 && InsertSpan < 110180 && TKWSRatio >= 0.54 && TitleRatio >= 0.9 && CNUMLengthSP >= 21.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist < 71.5 && InsertSpan >= 110180 && SimhashDist < 27.5 && CNUMRatioSP < 0.82 && TitleRatio < 0.88) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist < 71.5 && InsertSpan >= 110180 && SimhashDist < 27.5 && CNUMRatioSP < 0.82 && TitleRatio >= 0.88) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist < 71.5 && InsertSpan >= 110180 && SimhashDist < 27.5 && CNUMRatioSP >= 0.82 && ChannelLength < 4.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist < 71.5 && InsertSpan >= 110180 && SimhashDist < 27.5 && CNUMRatioSP >= 0.82 && ChannelLength >= 4.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist < 71.5 && InsertSpan >= 110180 && SimhashDist >= 27.5 && TitleRatio < 0.13 && ChannelRatio < 0.15) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist < 71.5 && InsertSpan >= 110180 && SimhashDist >= 27.5 && TitleRatio < 0.13 && ChannelRatio >= 0.15) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist < 71.5 && InsertSpan >= 110180 && SimhashDist >= 27.5 && TitleRatio >= 0.13 && EpochSpan < 85369) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist < 71.5 && InsertSpan >= 110180 && SimhashDist >= 27.5 && TitleRatio >= 0.13 && EpochSpan >= 85369) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist >= 71.5 && TPerRatioNE < 0.71 && CatRatio < 0.5 && CKWSRatio < 0.31 && CKWSRatio < 0.12) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist >= 71.5 && TPerRatioNE < 0.71 && CatRatio < 0.5 && CKWSRatio < 0.31 && CKWSRatio >= 0.12) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist >= 71.5 && TPerRatioNE < 0.71 && CatRatio < 0.5 && CKWSRatio >= 0.31 && InsertSpan < 116493) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist >= 71.5 && TPerRatioNE < 0.71 && CatRatio < 0.5 && CKWSRatio >= 0.31 && InsertSpan >= 116493) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist >= 71.5 && TPerRatioNE < 0.71 && CatRatio >= 0.5 && CLocRatioSP < 0.2 && TitleDist < 53.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist >= 71.5 && TPerRatioNE < 0.71 && CatRatio >= 0.5 && CLocRatioSP < 0.2 && TitleDist >= 53.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist >= 71.5 && TPerRatioNE < 0.71 && CatRatio >= 0.5 && CLocRatioSP >= 0.2 && HKWSRatio < 0.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist >= 71.5 && TPerRatioNE < 0.71 && CatRatio >= 0.5 && CLocRatioSP >= 0.2 && HKWSRatio >= 0.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist >= 71.5 && TPerRatioNE >= 0.71 && CKWSRatio < 0.25 && InsertSpan < 5872.5 && CatRatio < 0.88) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist >= 71.5 && TPerRatioNE >= 0.71 && CKWSRatio < 0.25 && InsertSpan < 5872.5 && CatRatio >= 0.88) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist >= 71.5 && TPerRatioNE >= 0.71 && CKWSRatio < 0.25 && InsertSpan >= 5872.5 && ChannelRatio < 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist >= 71.5 && TPerRatioNE >= 0.71 && CKWSRatio < 0.25 && InsertSpan >= 5872.5 && ChannelRatio >= 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist >= 71.5 && TPerRatioNE >= 0.71 && CKWSRatio >= 0.25 && EpochSpan < 118183 && CLocLengthSP < 17.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist >= 71.5 && TPerRatioNE >= 0.71 && CKWSRatio >= 0.25 && EpochSpan < 118183 && CLocLengthSP >= 17.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist >= 71.5 && TPerRatioNE >= 0.71 && CKWSRatio >= 0.25 && EpochSpan >= 118183 && GeoRatio < 0.54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist >= 71.5 && TPerRatioNE >= 0.71 && CKWSRatio >= 0.25 && EpochSpan >= 118183 && GeoRatio >= 0.54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.74 && CTimRatioSP < 0.29 && CWordSpan < 1359.5 && CPerRatioSP < 0.63 && EpochSpan < 126499.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.74 && CTimRatioSP < 0.29 && CWordSpan < 1359.5 && CPerRatioSP < 0.63 && EpochSpan >= 126499.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.74 && CTimRatioSP < 0.29 && CWordSpan < 1359.5 && CPerRatioSP >= 0.63 && EpochSpan < 255861) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.74 && CTimRatioSP < 0.29 && CWordSpan < 1359.5 && CPerRatioSP >= 0.63 && EpochSpan >= 255861) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.74 && CTimRatioSP < 0.29 && CWordSpan >= 1359.5 && SimhashDist < 77.5 && InsertSpan < 154667.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.74 && CTimRatioSP < 0.29 && CWordSpan >= 1359.5 && SimhashDist < 77.5 && InsertSpan >= 154667.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.74 && CTimRatioSP < 0.29 && CWordSpan >= 1359.5 && SimhashDist >= 77.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.74 && CTimRatioSP >= 0.29 && EpochSpan < 255000 && TitleRatio < 0.37 && SimhashDist < 64.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.74 && CTimRatioSP >= 0.29 && EpochSpan < 255000 && TitleRatio < 0.37 && SimhashDist >= 64.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.74 && CTimRatioSP >= 0.29 && EpochSpan < 255000 && TitleRatio >= 0.37 && TitleLength < 6.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.74 && CTimRatioSP >= 0.29 && EpochSpan < 255000 && TitleRatio >= 0.37 && TitleLength >= 6.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.74 && CTimRatioSP >= 0.29 && EpochSpan >= 255000 && TKWSRatio < 0.5 && CLocLengthNE < 3.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.74 && CTimRatioSP >= 0.29 && EpochSpan >= 255000 && TKWSRatio < 0.5 && CLocLengthNE >= 3.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.74 && CTimRatioSP >= 0.29 && EpochSpan >= 255000 && TKWSRatio >= 0.5 && CNUMRatioSP < 0.66) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.74 && CTimRatioSP >= 0.29 && EpochSpan >= 255000 && TKWSRatio >= 0.5 && CNUMRatioSP >= 0.66) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.74 && SimhashDist < 20.5 && TitleRatio < 0.92 && ParagraphSpan < 0.5 && TitleLength < 5.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.74 && SimhashDist < 20.5 && TitleRatio < 0.92 && ParagraphSpan < 0.5 && TitleLength >= 5.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.74 && SimhashDist < 20.5 && TitleRatio < 0.92 && ParagraphSpan >= 0.5 && TKWSRatio < 0.97) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.74 && SimhashDist < 20.5 && TitleRatio < 0.92 && ParagraphSpan >= 0.5 && TKWSRatio >= 0.97) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.74 && SimhashDist < 20.5 && TitleRatio >= 0.92 && TOrgLengthNE < 2.75 && COrgLengthSP < 6.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.74 && SimhashDist < 20.5 && TitleRatio >= 0.92 && TOrgLengthNE < 2.75 && COrgLengthSP >= 6.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.74 && SimhashDist < 20.5 && TitleRatio >= 0.92 && TOrgLengthNE >= 2.75 && CPerLengthSP < 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.74 && SimhashDist < 20.5 && TitleRatio >= 0.92 && TOrgLengthNE >= 2.75 && CPerLengthSP >= 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.74 && SimhashDist >= 20.5 && EpochSpan < 336036.5 && TitleRatio < 0.38 && CTimRatioSP < 0.48) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.74 && SimhashDist >= 20.5 && EpochSpan < 336036.5 && TitleRatio < 0.38 && CTimRatioSP >= 0.48) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.74 && SimhashDist >= 20.5 && EpochSpan < 336036.5 && TitleRatio >= 0.38 && CPerLengthNE < 2.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.74 && SimhashDist >= 20.5 && EpochSpan < 336036.5 && TitleRatio >= 0.38 && CPerLengthNE >= 2.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.74 && SimhashDist >= 20.5 && EpochSpan >= 336036.5 && SameSRC < 0.5 && COrgLengthSP < 3.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.74 && SimhashDist >= 20.5 && EpochSpan >= 336036.5 && SameSRC < 0.5 && COrgLengthSP >= 3.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.74 && SimhashDist >= 20.5 && EpochSpan >= 336036.5 && SameSRC >= 0.5 && CatLength < 0.86) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.74 && SimhashDist >= 20.5 && EpochSpan >= 336036.5 && SameSRC >= 0.5 && CatLength >= 0.86) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist < 69.5 && EpochSpan < 61063 && CLocRatioSP < 0.72 && TitleRatio < 0.11 && CLocRatioNE < 0.34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist < 69.5 && EpochSpan < 61063 && CLocRatioSP < 0.72 && TitleRatio < 0.11 && CLocRatioNE >= 0.34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist < 69.5 && EpochSpan < 61063 && CLocRatioSP < 0.72 && TitleRatio >= 0.11 && TitleRatio < 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist < 69.5 && EpochSpan < 61063 && CLocRatioSP < 0.72 && TitleRatio >= 0.11 && TitleRatio >= 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist < 69.5 && EpochSpan < 61063 && CLocRatioSP >= 0.72 && ChannelLength < 1.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist < 69.5 && EpochSpan < 61063 && CLocRatioSP >= 0.72 && ChannelLength >= 1.75 && CatRatio < 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist < 69.5 && EpochSpan < 61063 && CLocRatioSP >= 0.72 && ChannelLength >= 1.75 && CatRatio >= 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist < 69.5 && EpochSpan >= 61063 && CPerRatioSP < 0.56 && TOrgRatioSP < 0.72 && TitleDist < 44.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist < 69.5 && EpochSpan >= 61063 && CPerRatioSP < 0.56 && TOrgRatioSP < 0.72 && TitleDist >= 44.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist < 69.5 && EpochSpan >= 61063 && CPerRatioSP < 0.56 && TOrgRatioSP >= 0.72 && CNUMRatioSP < 0.12) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist < 69.5 && EpochSpan >= 61063 && CPerRatioSP < 0.56 && TOrgRatioSP >= 0.72 && CNUMRatioSP >= 0.12) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist < 69.5 && EpochSpan >= 61063 && CPerRatioSP >= 0.56 && CPerRatioNE < 0.58 && CPerLengthSP < 8.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist < 69.5 && EpochSpan >= 61063 && CPerRatioSP >= 0.56 && CPerRatioNE < 0.58 && CPerLengthSP >= 8.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist < 69.5 && EpochSpan >= 61063 && CPerRatioSP >= 0.56 && CPerRatioNE >= 0.58 && CPerRatioSP < 0.9) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist < 69.5 && EpochSpan >= 61063 && CPerRatioSP >= 0.56 && CPerRatioNE >= 0.58 && CPerRatioSP >= 0.9) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist >= 69.5 && CPerRatioSP < 0.28 && TitleRatio < 0.14 && COrgRatioNE < 0.14 && CLocLengthSP < 19.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist >= 69.5 && CPerRatioSP < 0.28 && TitleRatio < 0.14 && COrgRatioNE < 0.14 && CLocLengthSP >= 19.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist >= 69.5 && CPerRatioSP < 0.28 && TitleRatio < 0.14 && COrgRatioNE >= 0.14 && CPerLengthSP < 12.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist >= 69.5 && CPerRatioSP < 0.28 && TitleRatio < 0.14 && COrgRatioNE >= 0.14 && CPerLengthSP >= 12.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist >= 69.5 && CPerRatioSP < 0.28 && TitleRatio >= 0.14 && EpochSpan < 64126.5 && COrgRatioNE < 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist >= 69.5 && CPerRatioSP < 0.28 && TitleRatio >= 0.14 && EpochSpan < 64126.5 && COrgRatioNE >= 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist >= 69.5 && CPerRatioSP < 0.28 && TitleRatio >= 0.14 && EpochSpan >= 64126.5 && CKWSRatio < 0.15) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist >= 69.5 && CPerRatioSP < 0.28 && TitleRatio >= 0.14 && EpochSpan >= 64126.5 && CKWSRatio >= 0.15) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist >= 69.5 && CPerRatioSP >= 0.28 && EpochSpan < 220948.5 && EpochSpan < 1718 && COrgLengthSP < 12) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist >= 69.5 && CPerRatioSP >= 0.28 && EpochSpan < 220948.5 && EpochSpan < 1718 && COrgLengthSP >= 12) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist >= 69.5 && CPerRatioSP >= 0.28 && EpochSpan < 220948.5 && EpochSpan >= 1718 && CNUMRatioSP < 0.27) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist >= 69.5 && CPerRatioSP >= 0.28 && EpochSpan < 220948.5 && EpochSpan >= 1718 && CNUMRatioSP >= 0.27) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist >= 69.5 && CPerRatioSP >= 0.28 && EpochSpan >= 220948.5 && CKWSRatio < 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist >= 69.5 && CPerRatioSP >= 0.28 && EpochSpan >= 220948.5 && CKWSRatio >= 0.2 && CNUMRatioSP < 0.74) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist >= 69.5 && CPerRatioSP >= 0.28 && EpochSpan >= 220948.5 && CKWSRatio >= 0.2 && CNUMRatioSP >= 0.74) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist < 19.5 && InsertSpan < 85875.5 && CLocRatioNE < 0.8 && CNUMRatioSP < 1 && COrgRatioNE < 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist < 19.5 && InsertSpan < 85875.5 && CLocRatioNE < 0.8 && CNUMRatioSP < 1 && COrgRatioNE >= 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist < 19.5 && InsertSpan < 85875.5 && CLocRatioNE < 0.8 && CNUMRatioSP >= 1 && TitleLength < 17.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist < 19.5 && InsertSpan < 85875.5 && CLocRatioNE < 0.8 && CNUMRatioSP >= 1 && TitleLength >= 17.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist < 19.5 && InsertSpan < 85875.5 && CLocRatioNE >= 0.8 && TKWSRatio < 1 && CLocRatioNE < 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist < 19.5 && InsertSpan < 85875.5 && CLocRatioNE >= 0.8 && TKWSRatio < 1 && CLocRatioNE >= 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist < 19.5 && InsertSpan < 85875.5 && CLocRatioNE >= 0.8 && TKWSRatio >= 1 && CNUMRatioSP < 0.4) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist < 19.5 && InsertSpan < 85875.5 && CLocRatioNE >= 0.8 && TKWSRatio >= 1 && CNUMRatioSP >= 0.4) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist < 19.5 && InsertSpan >= 85875.5 && CNUMRatioSP < 0.56 && COrgLengthSP < 2.75 && CWordSpan < 160) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist < 19.5 && InsertSpan >= 85875.5 && CNUMRatioSP < 0.56 && COrgLengthSP < 2.75 && CWordSpan >= 160) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist < 19.5 && InsertSpan >= 85875.5 && CNUMRatioSP < 0.56 && COrgLengthSP >= 2.75 && HKWSRatio < 0.9) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist < 19.5 && InsertSpan >= 85875.5 && CNUMRatioSP < 0.56 && COrgLengthSP >= 2.75 && HKWSRatio >= 0.9) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist < 19.5 && InsertSpan >= 85875.5 && CNUMRatioSP >= 0.56 && CKWSLength < 2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist < 19.5 && InsertSpan >= 85875.5 && CNUMRatioSP >= 0.56 && CKWSLength >= 2 && CLocRatioNE < 0.88) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist < 19.5 && InsertSpan >= 85875.5 && CNUMRatioSP >= 0.56 && CKWSLength >= 2 && CLocRatioNE >= 0.88) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist >= 19.5 && HKWSRatio < 0.55 && InsertSpan < 149617 && CPerRatioNE < 0.3 && TitleDist < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist >= 19.5 && HKWSRatio < 0.55 && InsertSpan < 149617 && CPerRatioNE < 0.3 && TitleDist >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist >= 19.5 && HKWSRatio < 0.55 && InsertSpan < 149617 && CPerRatioNE >= 0.3 && SimhashDist < 63.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist >= 19.5 && HKWSRatio < 0.55 && InsertSpan < 149617 && CPerRatioNE >= 0.3 && SimhashDist >= 63.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist >= 19.5 && HKWSRatio < 0.55 && InsertSpan >= 149617 && InsertSpan < 267291 && CPerRatioNE < 0.56) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist >= 19.5 && HKWSRatio < 0.55 && InsertSpan >= 149617 && InsertSpan < 267291 && CPerRatioNE >= 0.56) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist >= 19.5 && HKWSRatio < 0.55 && InsertSpan >= 149617 && InsertSpan >= 267291 && CTimRatioSP < 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist >= 19.5 && HKWSRatio < 0.55 && InsertSpan >= 149617 && InsertSpan >= 267291 && CTimRatioSP >= 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist >= 19.5 && HKWSRatio >= 0.55 && InsertSpan < 251530.5 && EpochSpan < 72108 && TitleRatio < 0.32) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist >= 19.5 && HKWSRatio >= 0.55 && InsertSpan < 251530.5 && EpochSpan < 72108 && TitleRatio >= 0.32) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist >= 19.5 && HKWSRatio >= 0.55 && InsertSpan < 251530.5 && EpochSpan >= 72108 && CPerRatioNE < 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist >= 19.5 && HKWSRatio >= 0.55 && InsertSpan < 251530.5 && EpochSpan >= 72108 && CPerRatioNE >= 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist >= 19.5 && HKWSRatio >= 0.55 && InsertSpan >= 251530.5 && SameSRC < 0.5 && CNUMLengthSP < 4.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist >= 19.5 && HKWSRatio >= 0.55 && InsertSpan >= 251530.5 && SameSRC < 0.5 && CNUMLengthSP >= 4.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist >= 19.5 && HKWSRatio >= 0.55 && InsertSpan >= 251530.5 && SameSRC >= 0.5 && CLocLengthNE < 10.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist >= 19.5 && HKWSRatio >= 0.55 && InsertSpan >= 251530.5 && SameSRC >= 0.5 && CLocLengthNE >= 10.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio < 0.21 && ChannelRatio < 0.2 && CKWSRatio < 0.25 && CPerRatioNE < 0.43 && CatRatio < 0.54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio < 0.21 && ChannelRatio < 0.2 && CKWSRatio < 0.25 && CPerRatioNE < 0.43 && CatRatio >= 0.54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio < 0.21 && ChannelRatio < 0.2 && CKWSRatio < 0.25 && CPerRatioNE >= 0.43 && COrgRatioNE < 0.41) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio < 0.21 && ChannelRatio < 0.2 && CKWSRatio < 0.25 && CPerRatioNE >= 0.43 && COrgRatioNE >= 0.41) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio < 0.21 && ChannelRatio < 0.2 && CKWSRatio >= 0.25 && TitleLength < 8.25 && CNUMLengthSP < 2.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio < 0.21 && ChannelRatio < 0.2 && CKWSRatio >= 0.25 && TitleLength < 8.25 && CNUMLengthSP >= 2.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio < 0.21 && ChannelRatio < 0.2 && CKWSRatio >= 0.25 && TitleLength >= 8.25 && EpochSpan < 234176) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio < 0.21 && ChannelRatio < 0.2 && CKWSRatio >= 0.25 && TitleLength >= 8.25 && EpochSpan >= 234176) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio < 0.21 && ChannelRatio >= 0.2 && SimhashDist < 71.5 && CLocLengthSP < 20.75 && CKWSRatio < 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio < 0.21 && ChannelRatio >= 0.2 && SimhashDist < 71.5 && CLocLengthSP < 20.75 && CKWSRatio >= 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio < 0.21 && ChannelRatio >= 0.2 && SimhashDist < 71.5 && CLocLengthSP >= 20.75 && CKWSRatio < 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio < 0.21 && ChannelRatio >= 0.2 && SimhashDist < 71.5 && CLocLengthSP >= 20.75 && CKWSRatio >= 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio < 0.21 && ChannelRatio >= 0.2 && SimhashDist >= 71.5 && CLocRatioNE < 0.55 && CWordSpan < 8.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio < 0.21 && ChannelRatio >= 0.2 && SimhashDist >= 71.5 && CLocRatioNE < 0.55 && CWordSpan >= 8.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio < 0.21 && ChannelRatio >= 0.2 && SimhashDist >= 71.5 && CLocRatioNE >= 0.55 && EpochSpan < 55069.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio < 0.21 && ChannelRatio >= 0.2 && SimhashDist >= 71.5 && CLocRatioNE >= 0.55 && EpochSpan >= 55069.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio >= 0.21 && HKWSRatio < 0.52 && CLocRatioNE < 0.57 && ChannelLength < 4.25 && CTimRatioSP < 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio >= 0.21 && HKWSRatio < 0.52 && CLocRatioNE < 0.57 && ChannelLength < 4.25 && CTimRatioSP >= 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio >= 0.21 && HKWSRatio < 0.52 && CLocRatioNE < 0.57 && ChannelLength >= 4.25 && SimhashDist < 79.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio >= 0.21 && HKWSRatio < 0.52 && CLocRatioNE < 0.57 && ChannelLength >= 4.25 && SimhashDist >= 79.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio >= 0.21 && HKWSRatio < 0.52 && CLocRatioNE >= 0.57 && COrgRatioSP < 0.45 && CKWSLength < 12.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio >= 0.21 && HKWSRatio < 0.52 && CLocRatioNE >= 0.57 && COrgRatioSP < 0.45 && CKWSLength >= 12.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio >= 0.21 && HKWSRatio < 0.52 && CLocRatioNE >= 0.57 && COrgRatioSP >= 0.45 && InsertSpan < 83328.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio >= 0.21 && HKWSRatio < 0.52 && CLocRatioNE >= 0.57 && COrgRatioSP >= 0.45 && InsertSpan >= 83328.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio >= 0.21 && HKWSRatio >= 0.52 && InsertSpan < 308548.5 && CLocRatioNE < 0.56 && COrgRatioSP < 0.53) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio >= 0.21 && HKWSRatio >= 0.52 && InsertSpan < 308548.5 && CLocRatioNE < 0.56 && COrgRatioSP >= 0.53) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio >= 0.21 && HKWSRatio >= 0.52 && InsertSpan < 308548.5 && CLocRatioNE >= 0.56 && CKWSRatio < 0.41) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio >= 0.21 && HKWSRatio >= 0.52 && InsertSpan < 308548.5 && CLocRatioNE >= 0.56 && CKWSRatio >= 0.41) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio >= 0.21 && HKWSRatio >= 0.52 && InsertSpan >= 308548.5 && COrgLengthSP < 6.25 && TitleRatio < 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio >= 0.21 && HKWSRatio >= 0.52 && InsertSpan >= 308548.5 && COrgLengthSP < 6.25 && TitleRatio >= 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio >= 0.21 && HKWSRatio >= 0.52 && InsertSpan >= 308548.5 && COrgLengthSP >= 6.25 && CWordSpan < 313) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio >= 0.21 && HKWSRatio >= 0.52 && InsertSpan >= 308548.5 && COrgLengthSP >= 6.25 && CWordSpan >= 313) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan < 75486 && TitleRatio < 0.89 && SimhashDist < 71.5 && SameSRC < 0.5 && CPerRatioSP < 0.16) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan < 75486 && TitleRatio < 0.89 && SimhashDist < 71.5 && SameSRC < 0.5 && CPerRatioSP >= 0.16) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan < 75486 && TitleRatio < 0.89 && SimhashDist < 71.5 && SameSRC >= 0.5 && CLocRatioNE < 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan < 75486 && TitleRatio < 0.89 && SimhashDist < 71.5 && SameSRC >= 0.5 && CLocRatioNE >= 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan < 75486 && TitleRatio < 0.89 && SimhashDist >= 71.5 && TKWSRatio < 0.42 && CLocRatioNE < 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan < 75486 && TitleRatio < 0.89 && SimhashDist >= 71.5 && TKWSRatio < 0.42 && CLocRatioNE >= 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan < 75486 && TitleRatio < 0.89 && SimhashDist >= 71.5 && TKWSRatio >= 0.42 && CPerRatioSP < 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan < 75486 && TitleRatio < 0.89 && SimhashDist >= 71.5 && TKWSRatio >= 0.42 && CPerRatioSP >= 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan < 75486 && TitleRatio >= 0.89 && CKWSRatio < 0.46 && SameSRC < 0.5 && COrgRatioSP < 0.06) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan < 75486 && TitleRatio >= 0.89 && CKWSRatio < 0.46 && SameSRC < 0.5 && COrgRatioSP >= 0.06) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan < 75486 && TitleRatio >= 0.89 && CKWSRatio < 0.46 && SameSRC >= 0.5 && InsertSpan < 6154.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan < 75486 && TitleRatio >= 0.89 && CKWSRatio < 0.46 && SameSRC >= 0.5 && InsertSpan >= 6154.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan < 75486 && TitleRatio >= 0.89 && CKWSRatio >= 0.46 && CKWSLength < 7.25 && TitleLength < 9.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan < 75486 && TitleRatio >= 0.89 && CKWSRatio >= 0.46 && CKWSLength < 7.25 && TitleLength >= 9.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan < 75486 && TitleRatio >= 0.89 && CKWSRatio >= 0.46 && CKWSLength >= 7.25 && CPerLengthNE < 8.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan < 75486 && TitleRatio >= 0.89 && CKWSRatio >= 0.46 && CKWSLength >= 7.25 && CPerLengthNE >= 8.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan >= 75486 && InsertSpan < 271170 && CKWSRatio < 0.3 && HKWSRatio < 0.78 && TitleDist < 59.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan >= 75486 && InsertSpan < 271170 && CKWSRatio < 0.3 && HKWSRatio < 0.78 && TitleDist >= 59.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan >= 75486 && InsertSpan < 271170 && CKWSRatio < 0.3 && HKWSRatio >= 0.78 && COrgLengthSP < 2.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan >= 75486 && InsertSpan < 271170 && CKWSRatio < 0.3 && HKWSRatio >= 0.78 && COrgLengthSP >= 2.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan >= 75486 && InsertSpan < 271170 && CKWSRatio >= 0.3 && CPerLengthSP < 2.75 && CKWSRatio < 0.55) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan >= 75486 && InsertSpan < 271170 && CKWSRatio >= 0.3 && CPerLengthSP < 2.75 && CKWSRatio >= 0.55) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan >= 75486 && InsertSpan < 271170 && CKWSRatio >= 0.3 && CPerLengthSP >= 2.75 && CPerRatioNE < 0.39) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan >= 75486 && InsertSpan < 271170 && CKWSRatio >= 0.3 && CPerLengthSP >= 2.75 && CPerRatioNE >= 0.39) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan >= 75486 && InsertSpan >= 271170 && CPerRatioSP < 0.73 && EpochSpan < 879481.5 && ParagraphSpan < 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan >= 75486 && InsertSpan >= 271170 && CPerRatioSP < 0.73 && EpochSpan < 879481.5 && ParagraphSpan >= 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan >= 75486 && InsertSpan >= 271170 && CPerRatioSP < 0.73 && EpochSpan >= 879481.5 && CNUMLengthSP < 9.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan >= 75486 && InsertSpan >= 271170 && CPerRatioSP < 0.73 && EpochSpan >= 879481.5 && CNUMLengthSP >= 9.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan >= 75486 && InsertSpan >= 271170 && CPerRatioSP >= 0.73 && CLocRatioSP < 0.9 && ChannelLength < 4.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan >= 75486 && InsertSpan >= 271170 && CPerRatioSP >= 0.73 && CLocRatioSP < 0.9 && ChannelLength >= 4.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan >= 75486 && InsertSpan >= 271170 && CPerRatioSP >= 0.73 && CLocRatioSP >= 0.9 && CNUMRatioSP < 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan >= 75486 && InsertSpan >= 271170 && CPerRatioSP >= 0.73 && CLocRatioSP >= 0.9 && CNUMRatioSP >= 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP < 0.23 && CPerRatioSP < 0.24 && SimhashDist < 64.5 && TitleDist < 43.5 && ChannelRatio < 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP < 0.23 && CPerRatioSP < 0.24 && SimhashDist < 64.5 && TitleDist < 43.5 && ChannelRatio >= 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP < 0.23 && CPerRatioSP < 0.24 && SimhashDist < 64.5 && TitleDist >= 43.5 && InsertSpan < 2767756) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP < 0.23 && CPerRatioSP < 0.24 && SimhashDist < 64.5 && TitleDist >= 43.5 && InsertSpan >= 2767756) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP < 0.23 && CPerRatioSP < 0.24 && SimhashDist >= 64.5 && ParagraphSpan < 11.5 && CatRatio < 0.51) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP < 0.23 && CPerRatioSP < 0.24 && SimhashDist >= 64.5 && ParagraphSpan < 11.5 && CatRatio >= 0.51) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP < 0.23 && CPerRatioSP < 0.24 && SimhashDist >= 64.5 && ParagraphSpan >= 11.5 && CatRatio < 0.27) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP < 0.23 && CPerRatioSP < 0.24 && SimhashDist >= 64.5 && ParagraphSpan >= 11.5 && CatRatio >= 0.27) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP < 0.23 && CPerRatioSP >= 0.24 && TitleRatio < 0.11 && CLocLengthSP < 23.25 && CPerLengthSP < 32.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP < 0.23 && CPerRatioSP >= 0.24 && TitleRatio < 0.11 && CLocLengthSP < 23.25 && CPerLengthSP >= 32.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP < 0.23 && CPerRatioSP >= 0.24 && TitleRatio < 0.11 && CLocLengthSP >= 23.25 && CTimLengthSP < 17.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP < 0.23 && CPerRatioSP >= 0.24 && TitleRatio < 0.11 && CLocLengthSP >= 23.25 && CTimLengthSP >= 17.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP < 0.23 && CPerRatioSP >= 0.24 && TitleRatio >= 0.11 && CNUMRatioSP < 0.23 && CKWSRatio < 0.27) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP < 0.23 && CPerRatioSP >= 0.24 && TitleRatio >= 0.11 && CNUMRatioSP < 0.23 && CKWSRatio >= 0.27) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP < 0.23 && CPerRatioSP >= 0.24 && TitleRatio >= 0.11 && CNUMRatioSP >= 0.23 && CatLength < 1.06) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP < 0.23 && CPerRatioSP >= 0.24 && TitleRatio >= 0.11 && CNUMRatioSP >= 0.23 && CatLength >= 1.06) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP >= 0.23 && EpochSpan < 98074.5 && COrgRatioSP < 0.52 && CLocRatioNE < 0.25 && COrgLengthSP < 18.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP >= 0.23 && EpochSpan < 98074.5 && COrgRatioSP < 0.52 && CLocRatioNE < 0.25 && COrgLengthSP >= 18.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP >= 0.23 && EpochSpan < 98074.5 && COrgRatioSP < 0.52 && CLocRatioNE >= 0.25 && CPerRatioNE < 0.57) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP >= 0.23 && EpochSpan < 98074.5 && COrgRatioSP < 0.52 && CLocRatioNE >= 0.25 && CPerRatioNE >= 0.57) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP >= 0.23 && EpochSpan < 98074.5 && COrgRatioSP >= 0.52 && CTimLengthSP < 37.25 && CKWSRatio < 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP >= 0.23 && EpochSpan < 98074.5 && COrgRatioSP >= 0.52 && CTimLengthSP < 37.25 && CKWSRatio >= 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP >= 0.23 && EpochSpan < 98074.5 && COrgRatioSP >= 0.52 && CTimLengthSP >= 37.25 && COrgLengthSP < 17.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP >= 0.23 && EpochSpan < 98074.5 && COrgRatioSP >= 0.52 && CTimLengthSP >= 37.25 && COrgLengthSP >= 17.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP >= 0.23 && EpochSpan >= 98074.5 && CLocRatioSP < 0.6 && SimhashDist < 68.5 && TKWSRatio < 0.38) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP >= 0.23 && EpochSpan >= 98074.5 && CLocRatioSP < 0.6 && SimhashDist < 68.5 && TKWSRatio >= 0.38) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP >= 0.23 && EpochSpan >= 98074.5 && CLocRatioSP < 0.6 && SimhashDist >= 68.5 && TitleRatio < 0.11) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP >= 0.23 && EpochSpan >= 98074.5 && CLocRatioSP < 0.6 && SimhashDist >= 68.5 && TitleRatio >= 0.11) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP >= 0.23 && EpochSpan >= 98074.5 && CLocRatioSP >= 0.6 && COrgRatioSP < 0.24 && CPerRatioSP < 0.44) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP >= 0.23 && EpochSpan >= 98074.5 && CLocRatioSP >= 0.6 && COrgRatioSP < 0.24 && CPerRatioSP >= 0.44) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP >= 0.23 && EpochSpan >= 98074.5 && CLocRatioSP >= 0.6 && COrgRatioSP >= 0.24 && SimhashDist < 81.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP >= 0.23 && EpochSpan >= 98074.5 && CLocRatioSP >= 0.6 && COrgRatioSP >= 0.24 && SimhashDist >= 81.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan < 83699 && TitleRatio < 0.9 && SimhashDist < 71.5 && TitleLength < 5.25 && GeoRatio < 0.58) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan < 83699 && TitleRatio < 0.9 && SimhashDist < 71.5 && TitleLength < 5.25 && GeoRatio >= 0.58) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan < 83699 && TitleRatio < 0.9 && SimhashDist < 71.5 && TitleLength >= 5.25 && CKWSRatio < 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan < 83699 && TitleRatio < 0.9 && SimhashDist < 71.5 && TitleLength >= 5.25 && CKWSRatio >= 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan < 83699 && TitleRatio < 0.9 && SimhashDist >= 71.5 && COrgRatioSP < 0.46 && CPerRatioSP < 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan < 83699 && TitleRatio < 0.9 && SimhashDist >= 71.5 && COrgRatioSP < 0.46 && CPerRatioSP >= 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan < 83699 && TitleRatio < 0.9 && SimhashDist >= 71.5 && COrgRatioSP >= 0.46 && CTimRatioSP < 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan < 83699 && TitleRatio < 0.9 && SimhashDist >= 71.5 && COrgRatioSP >= 0.46 && CTimRatioSP >= 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan < 83699 && TitleRatio >= 0.9 && COrgRatioSP < 0.44 && ChannelRatio < 0.72 && CPerLengthNE < 54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan < 83699 && TitleRatio >= 0.9 && COrgRatioSP < 0.44 && ChannelRatio < 0.72 && CPerLengthNE >= 54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan < 83699 && TitleRatio >= 0.9 && COrgRatioSP < 0.44 && ChannelRatio >= 0.72 && CKWSRatio < 0.18) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan < 83699 && TitleRatio >= 0.9 && COrgRatioSP < 0.44 && ChannelRatio >= 0.72 && CKWSRatio >= 0.18) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan < 83699 && TitleRatio >= 0.9 && COrgRatioSP >= 0.44 && TKWSLength < 5.25 && COrgLengthSP < 5.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan < 83699 && TitleRatio >= 0.9 && COrgRatioSP >= 0.44 && TKWSLength < 5.25 && COrgLengthSP >= 5.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan < 83699 && TitleRatio >= 0.9 && COrgRatioSP >= 0.44 && TKWSLength >= 5.25 && InsertSpan < 2043) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan < 83699 && TitleRatio >= 0.9 && COrgRatioSP >= 0.44 && TKWSLength >= 5.25 && InsertSpan >= 2043) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan >= 83699 && EpochSpan < 255602 && HKWSLength < 1.75 && CKWSRatio < 0.32 && SimhashDist < 61.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan >= 83699 && EpochSpan < 255602 && HKWSLength < 1.75 && CKWSRatio < 0.32 && SimhashDist >= 61.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan >= 83699 && EpochSpan < 255602 && HKWSLength < 1.75 && CKWSRatio >= 0.32 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan >= 83699 && EpochSpan < 255602 && HKWSLength < 1.75 && CKWSRatio >= 0.32 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan >= 83699 && EpochSpan < 255602 && HKWSLength >= 1.75 && CPerRatioNE < 0.39 && COrgRatioSP < 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan >= 83699 && EpochSpan < 255602 && HKWSLength >= 1.75 && CPerRatioNE < 0.39 && COrgRatioSP >= 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan >= 83699 && EpochSpan < 255602 && HKWSLength >= 1.75 && CPerRatioNE >= 0.39 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan >= 83699 && EpochSpan < 255602 && HKWSLength >= 1.75 && CPerRatioNE >= 0.39 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan >= 83699 && EpochSpan >= 255602 && CKWSRatio < 0.4 && COrgRatioNE < 0.45 && COrgLengthNE < 4.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan >= 83699 && EpochSpan >= 255602 && CKWSRatio < 0.4 && COrgRatioNE < 0.45 && COrgLengthNE >= 4.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan >= 83699 && EpochSpan >= 255602 && CKWSRatio < 0.4 && COrgRatioNE >= 0.45 && ChannelRatio < 0.45) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan >= 83699 && EpochSpan >= 255602 && CKWSRatio < 0.4 && COrgRatioNE >= 0.45 && ChannelRatio >= 0.45) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan >= 83699 && EpochSpan >= 255602 && CKWSRatio >= 0.4 && InsertSpan < 655886.5 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan >= 83699 && EpochSpan >= 255602 && CKWSRatio >= 0.4 && InsertSpan < 655886.5 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan >= 83699 && EpochSpan >= 255602 && CKWSRatio >= 0.4 && InsertSpan >= 655886.5 && CLocRatioNE < 0.64) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan >= 83699 && EpochSpan >= 255602 && CKWSRatio >= 0.4 && InsertSpan >= 655886.5 && CLocRatioNE >= 0.64) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE < 0.09 && ChannelRatio < 0.17 && COrgRatioSP < 0.17 && HKWSRatio < 0.38 && ChannelLength < 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE < 0.09 && ChannelRatio < 0.17 && COrgRatioSP < 0.17 && HKWSRatio < 0.38 && ChannelLength >= 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE < 0.09 && ChannelRatio < 0.17 && COrgRatioSP < 0.17 && HKWSRatio >= 0.38 && SimhashDist < 78.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE < 0.09 && ChannelRatio < 0.17 && COrgRatioSP < 0.17 && HKWSRatio >= 0.38 && SimhashDist >= 78.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE < 0.09 && ChannelRatio < 0.17 && COrgRatioSP >= 0.17 && CKWSRatio < 0.22 && TitleRatio < 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE < 0.09 && ChannelRatio < 0.17 && COrgRatioSP >= 0.17 && CKWSRatio < 0.22 && TitleRatio >= 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE < 0.09 && ChannelRatio < 0.17 && COrgRatioSP >= 0.17 && CKWSRatio >= 0.22 && TitleRatio < 0.11) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE < 0.09 && ChannelRatio < 0.17 && COrgRatioSP >= 0.17 && CKWSRatio >= 0.22 && TitleRatio >= 0.11) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE < 0.09 && ChannelRatio >= 0.17 && CPerRatioSP < 0.32 && EpochSpan < 128354.5 && SimhashDist < 75.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE < 0.09 && ChannelRatio >= 0.17 && CPerRatioSP < 0.32 && EpochSpan < 128354.5 && SimhashDist >= 75.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE < 0.09 && ChannelRatio >= 0.17 && CPerRatioSP < 0.32 && EpochSpan >= 128354.5 && TitleRatio < 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE < 0.09 && ChannelRatio >= 0.17 && CPerRatioSP < 0.32 && EpochSpan >= 128354.5 && TitleRatio >= 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE < 0.09 && ChannelRatio >= 0.17 && CPerRatioSP >= 0.32 && EpochSpan < 254597.5 && CKWSRatio < 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE < 0.09 && ChannelRatio >= 0.17 && CPerRatioSP >= 0.32 && EpochSpan < 254597.5 && CKWSRatio >= 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE < 0.09 && ChannelRatio >= 0.17 && CPerRatioSP >= 0.32 && EpochSpan >= 254597.5 && ChannelRatio < 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE < 0.09 && ChannelRatio >= 0.17 && CPerRatioSP >= 0.32 && EpochSpan >= 254597.5 && ChannelRatio >= 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE >= 0.09 && COrgRatioSP < 0.54 && CKWSRatio < 0.22 && TitleRatio < 0.18 && TitleDist < 42.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE >= 0.09 && COrgRatioSP < 0.54 && CKWSRatio < 0.22 && TitleRatio < 0.18 && TitleDist >= 42.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE >= 0.09 && COrgRatioSP < 0.54 && CKWSRatio < 0.22 && TitleRatio >= 0.18 && EpochSpan < 61867) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE >= 0.09 && COrgRatioSP < 0.54 && CKWSRatio < 0.22 && TitleRatio >= 0.18 && EpochSpan >= 61867) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE >= 0.09 && COrgRatioSP < 0.54 && CKWSRatio >= 0.22 && CPerRatioNE < 0.32 && EpochSpan < 115134.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE >= 0.09 && COrgRatioSP < 0.54 && CKWSRatio >= 0.22 && CPerRatioNE < 0.32 && EpochSpan >= 115134.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE >= 0.09 && COrgRatioSP < 0.54 && CKWSRatio >= 0.22 && CPerRatioNE >= 0.32 && InsertSpan < 90704.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE >= 0.09 && COrgRatioSP < 0.54 && CKWSRatio >= 0.22 && CPerRatioNE >= 0.32 && InsertSpan >= 90704.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE >= 0.09 && COrgRatioSP >= 0.54 && COrgRatioNE < 0.87 && ChannelRatio < 0.17 && SimhashDist < 67.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE >= 0.09 && COrgRatioSP >= 0.54 && COrgRatioNE < 0.87 && ChannelRatio < 0.17 && SimhashDist >= 67.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE >= 0.09 && COrgRatioSP >= 0.54 && COrgRatioNE < 0.87 && ChannelRatio >= 0.17 && InsertSpan < 98888) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE >= 0.09 && COrgRatioSP >= 0.54 && COrgRatioNE < 0.87 && ChannelRatio >= 0.17 && InsertSpan >= 98888) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE >= 0.09 && COrgRatioSP >= 0.54 && COrgRatioNE >= 0.87 && CPerRatioSP < 0.87 && TitleRatio < 0.63) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE >= 0.09 && COrgRatioSP >= 0.54 && COrgRatioNE >= 0.87 && CPerRatioSP < 0.87 && TitleRatio >= 0.63) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE >= 0.09 && COrgRatioSP >= 0.54 && COrgRatioNE >= 0.87 && CPerRatioSP >= 0.87) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP < 0.74 && SameSRC < 0.5 && InsertSpan < 251414 && TKWSRatio < 0.58 && CPerRatioSP < 0.54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP < 0.74 && SameSRC < 0.5 && InsertSpan < 251414 && TKWSRatio < 0.58 && CPerRatioSP >= 0.54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP < 0.74 && SameSRC < 0.5 && InsertSpan < 251414 && TKWSRatio >= 0.58 && CPerRatioSP < 0.6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP < 0.74 && SameSRC < 0.5 && InsertSpan < 251414 && TKWSRatio >= 0.58 && CPerRatioSP >= 0.6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP < 0.74 && SameSRC < 0.5 && InsertSpan >= 251414 && CPerRatioNE < 0.32 && TKWSRatio < 0.18) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP < 0.74 && SameSRC < 0.5 && InsertSpan >= 251414 && CPerRatioNE < 0.32 && TKWSRatio >= 0.18) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP < 0.74 && SameSRC < 0.5 && InsertSpan >= 251414 && CPerRatioNE >= 0.32 && CNUMRatioSP < 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP < 0.74 && SameSRC < 0.5 && InsertSpan >= 251414 && CPerRatioNE >= 0.32 && CNUMRatioSP >= 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP < 0.74 && SameSRC >= 0.5 && TitleDist < 0.5 && CPerRatioNE < 0.25 && TitleLength < 7.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP < 0.74 && SameSRC >= 0.5 && TitleDist < 0.5 && CPerRatioNE < 0.25 && TitleLength >= 7.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP < 0.74 && SameSRC >= 0.5 && TitleDist < 0.5 && CPerRatioNE >= 0.25 && CKWSLength < 13.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP < 0.74 && SameSRC >= 0.5 && TitleDist < 0.5 && CPerRatioNE >= 0.25 && CKWSLength >= 13.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP < 0.74 && SameSRC >= 0.5 && TitleDist >= 0.5 && HKWSRatio < 0.59 && CKWSRatio < 0.32) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP < 0.74 && SameSRC >= 0.5 && TitleDist >= 0.5 && HKWSRatio < 0.59 && CKWSRatio >= 0.32) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP < 0.74 && SameSRC >= 0.5 && TitleDist >= 0.5 && HKWSRatio >= 0.59 && TKWSLength < 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP < 0.74 && SameSRC >= 0.5 && TitleDist >= 0.5 && HKWSRatio >= 0.59 && TKWSLength >= 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP >= 0.74 && TitleDist < 1.5 && EpochSpan < 86310 && COrgRatioSP < 0.11 && InsertSpan < 3742.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP >= 0.74 && TitleDist < 1.5 && EpochSpan < 86310 && COrgRatioSP < 0.11 && InsertSpan >= 3742.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP >= 0.74 && TitleDist < 1.5 && EpochSpan < 86310 && COrgRatioSP >= 0.11 && TOrgLengthSP < 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP >= 0.74 && TitleDist < 1.5 && EpochSpan < 86310 && COrgRatioSP >= 0.11 && TOrgLengthSP >= 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP >= 0.74 && TitleDist < 1.5 && EpochSpan >= 86310 && CPerRatioSP < 0.92 && COrgRatioSP < 0.71) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP >= 0.74 && TitleDist < 1.5 && EpochSpan >= 86310 && CPerRatioSP < 0.92 && COrgRatioSP >= 0.71) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP >= 0.74 && TitleDist < 1.5 && EpochSpan >= 86310 && CPerRatioSP >= 0.92 && EpochSpan < 328274.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP >= 0.74 && TitleDist < 1.5 && EpochSpan >= 86310 && CPerRatioSP >= 0.92 && EpochSpan >= 328274.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP >= 0.74 && TitleDist >= 1.5 && SameSRC < 0.5 && TitleRatio < 0.36 && CPerRatioSP < 0.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP >= 0.74 && TitleDist >= 1.5 && SameSRC < 0.5 && TitleRatio < 0.36 && CPerRatioSP >= 0.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP >= 0.74 && TitleDist >= 1.5 && SameSRC < 0.5 && TitleRatio >= 0.36 && InsertSpan < 266629) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP >= 0.74 && TitleDist >= 1.5 && SameSRC < 0.5 && TitleRatio >= 0.36 && InsertSpan >= 266629) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP >= 0.74 && TitleDist >= 1.5 && SameSRC >= 0.5 && CLocLengthSP < 20.25 && COrgLengthSP < 1.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP >= 0.74 && TitleDist >= 1.5 && SameSRC >= 0.5 && CLocLengthSP < 20.25 && COrgLengthSP >= 1.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP >= 0.74 && TitleDist >= 1.5 && SameSRC >= 0.5 && CLocLengthSP >= 20.25 && TKWSRatio < 0.91) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && CNUMRatioSP >= 0.74 && TitleDist >= 1.5 && SameSRC >= 0.5 && CLocLengthSP >= 20.25 && TKWSRatio >= 0.91) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio < 0.25 && COrgRatioNE < 0.17 && TitleRatio < 0.26 && CKWSRatio < 0.13 && TKWSRatio < 0.02) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio < 0.25 && COrgRatioNE < 0.17 && TitleRatio < 0.26 && CKWSRatio < 0.13 && TKWSRatio >= 0.02) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio < 0.25 && COrgRatioNE < 0.17 && TitleRatio < 0.26 && CKWSRatio >= 0.13 && TitleRatio < 0.1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio < 0.25 && COrgRatioNE < 0.17 && TitleRatio < 0.26 && CKWSRatio >= 0.13 && TitleRatio >= 0.1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio < 0.25 && COrgRatioNE < 0.17 && TitleRatio >= 0.26 && CatLength < 0.95 && ChannelRatio < 0.79) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio < 0.25 && COrgRatioNE < 0.17 && TitleRatio >= 0.26 && CatLength < 0.95 && ChannelRatio >= 0.79) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio < 0.25 && COrgRatioNE < 0.17 && TitleRatio >= 0.26 && CatLength >= 0.95 && SimhashDist < 68.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio < 0.25 && COrgRatioNE < 0.17 && TitleRatio >= 0.26 && CatLength >= 0.95 && SimhashDist >= 68.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio < 0.25 && COrgRatioNE >= 0.17 && TitleRatio < 0.15 && CPerRatioSP < 0.32 && CatLength < 1.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio < 0.25 && COrgRatioNE >= 0.17 && TitleRatio < 0.15 && CPerRatioSP < 0.32 && CatLength >= 1.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio < 0.25 && COrgRatioNE >= 0.17 && TitleRatio < 0.15 && CPerRatioSP >= 0.32 && CLocRatioNE < 0.44) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio < 0.25 && COrgRatioNE >= 0.17 && TitleRatio < 0.15 && CPerRatioSP >= 0.32 && CLocRatioNE >= 0.44) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio < 0.25 && COrgRatioNE >= 0.17 && TitleRatio >= 0.15 && COrgRatioSP < 0.5 && SimhashDist < 68.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio < 0.25 && COrgRatioNE >= 0.17 && TitleRatio >= 0.15 && COrgRatioSP < 0.5 && SimhashDist >= 68.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio < 0.25 && COrgRatioNE >= 0.17 && TitleRatio >= 0.15 && COrgRatioSP >= 0.5 && HKWSRatio < 0.7) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio < 0.25 && COrgRatioNE >= 0.17 && TitleRatio >= 0.15 && COrgRatioSP >= 0.5 && HKWSRatio >= 0.7) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio >= 0.25 && CPerRatioNE < 0.4 && EpochSpan < 77768.5 && CLocRatioNE < 0.5 && SimhashDist < 69.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio >= 0.25 && CPerRatioNE < 0.4 && EpochSpan < 77768.5 && CLocRatioNE < 0.5 && SimhashDist >= 69.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio >= 0.25 && CPerRatioNE < 0.4 && EpochSpan < 77768.5 && CLocRatioNE >= 0.5 && CWordSpan < 30.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio >= 0.25 && CPerRatioNE < 0.4 && EpochSpan < 77768.5 && CLocRatioNE >= 0.5 && CWordSpan >= 30.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio >= 0.25 && CPerRatioNE < 0.4 && EpochSpan >= 77768.5 && CLocLengthNE < 13.25 && TitleRatio < 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio >= 0.25 && CPerRatioNE < 0.4 && EpochSpan >= 77768.5 && CLocLengthNE < 13.25 && TitleRatio >= 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio >= 0.25 && CPerRatioNE < 0.4 && EpochSpan >= 77768.5 && CLocLengthNE >= 13.25 && COrgRatioSP < 0.63) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio >= 0.25 && CPerRatioNE < 0.4 && EpochSpan >= 77768.5 && CLocLengthNE >= 13.25 && COrgRatioSP >= 0.63) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio >= 0.25 && CPerRatioNE >= 0.4 && CPerLengthNE < 18.25 && CPerLengthSP < 0.75 && CWordSpan < 121) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio >= 0.25 && CPerRatioNE >= 0.4 && CPerLengthNE < 18.25 && CPerLengthSP < 0.75 && CWordSpan >= 121) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio >= 0.25 && CPerRatioNE >= 0.4 && CPerLengthNE < 18.25 && CPerLengthSP >= 0.75 && EpochSpan < 259109) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio >= 0.25 && CPerRatioNE >= 0.4 && CPerLengthNE < 18.25 && CPerLengthSP >= 0.75 && EpochSpan >= 259109) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio >= 0.25 && CPerRatioNE >= 0.4 && CPerLengthNE >= 18.25 && InsertSpan < 33649.5 && COrgRatioSP < 0.97) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio >= 0.25 && CPerRatioNE >= 0.4 && CPerLengthNE >= 18.25 && InsertSpan < 33649.5 && COrgRatioSP >= 0.97) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio >= 0.25 && CPerRatioNE >= 0.4 && CPerLengthNE >= 18.25 && InsertSpan >= 33649.5 && CKWSRatio < 0.4) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio >= 0.25 && CPerRatioNE >= 0.4 && CPerLengthNE >= 18.25 && InsertSpan >= 33649.5 && CKWSRatio >= 0.4) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan < 81549 && TKWSRatio < 0.91 && CPerRatioSP < 0.48 && TKWSRatio < 0.57 && CKWSRatio < 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan < 81549 && TKWSRatio < 0.91 && CPerRatioSP < 0.48 && TKWSRatio < 0.57 && CKWSRatio >= 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan < 81549 && TKWSRatio < 0.91 && CPerRatioSP < 0.48 && TKWSRatio >= 0.57 && SimhashDist < 69.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan < 81549 && TKWSRatio < 0.91 && CPerRatioSP < 0.48 && TKWSRatio >= 0.57 && SimhashDist >= 69.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan < 81549 && TKWSRatio < 0.91 && CPerRatioSP >= 0.48 && TitleLength < 5.25 && COrgLengthSP < 3.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan < 81549 && TKWSRatio < 0.91 && CPerRatioSP >= 0.48 && TitleLength < 5.25 && COrgLengthSP >= 3.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan < 81549 && TKWSRatio < 0.91 && CPerRatioSP >= 0.48 && TitleLength >= 5.25 && CPerRatioNE < 0.74) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan < 81549 && TKWSRatio < 0.91 && CPerRatioSP >= 0.48 && TitleLength >= 5.25 && CPerRatioNE >= 0.74) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan < 81549 && TKWSRatio >= 0.91 && CLocRatioNE < 0.7 && COrgRatioSP < 1 && CPerRatioSP < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan < 81549 && TKWSRatio >= 0.91 && CLocRatioNE < 0.7 && COrgRatioSP < 1 && CPerRatioSP >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan < 81549 && TKWSRatio >= 0.91 && CLocRatioNE < 0.7 && COrgRatioSP >= 1 && SimhashDist < 8.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan < 81549 && TKWSRatio >= 0.91 && CLocRatioNE < 0.7 && COrgRatioSP >= 1 && SimhashDist >= 8.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan < 81549 && TKWSRatio >= 0.91 && CLocRatioNE >= 0.7 && SimhashDist < 12.5 && ParagraphSpan < 17) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan < 81549 && TKWSRatio >= 0.91 && CLocRatioNE >= 0.7 && SimhashDist < 12.5 && ParagraphSpan >= 17) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan < 81549 && TKWSRatio >= 0.91 && CLocRatioNE >= 0.7 && SimhashDist >= 12.5 && CTimRatioSP < 0.85) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan < 81549 && TKWSRatio >= 0.91 && CLocRatioNE >= 0.7 && SimhashDist >= 12.5 && CTimRatioSP >= 0.85) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan >= 81549 && CPerRatioNE < 0.32 && EpochSpan < 229608.5 && COrgRatioNE < 0.15 && TitleRatio < 0.16) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan >= 81549 && CPerRatioNE < 0.32 && EpochSpan < 229608.5 && COrgRatioNE < 0.15 && TitleRatio >= 0.16) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan >= 81549 && CPerRatioNE < 0.32 && EpochSpan < 229608.5 && COrgRatioNE >= 0.15 && EpochSpan < 81808.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan >= 81549 && CPerRatioNE < 0.32 && EpochSpan < 229608.5 && COrgRatioNE >= 0.15 && EpochSpan >= 81808.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan >= 81549 && CPerRatioNE < 0.32 && EpochSpan >= 229608.5 && TitleRatio < 0.31 && SimhashDist < 81.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan >= 81549 && CPerRatioNE < 0.32 && EpochSpan >= 229608.5 && TitleRatio < 0.31 && SimhashDist >= 81.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan >= 81549 && CPerRatioNE < 0.32 && EpochSpan >= 229608.5 && TitleRatio >= 0.31 && CPerLengthSP < 56.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan >= 81549 && CPerRatioNE < 0.32 && EpochSpan >= 229608.5 && TitleRatio >= 0.31 && CPerLengthSP >= 56.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan >= 81549 && CPerRatioNE >= 0.32 && InsertSpan < 274622.5 && CPerRatioSP < 0.61 && TitleRatio < 0.34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan >= 81549 && CPerRatioNE >= 0.32 && InsertSpan < 274622.5 && CPerRatioSP < 0.61 && TitleRatio >= 0.34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan >= 81549 && CPerRatioNE >= 0.32 && InsertSpan < 274622.5 && CPerRatioSP >= 0.61 && CLocLengthSP < 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan >= 81549 && CPerRatioNE >= 0.32 && InsertSpan < 274622.5 && CPerRatioSP >= 0.61 && CLocLengthSP >= 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan >= 81549 && CPerRatioNE >= 0.32 && InsertSpan >= 274622.5 && EpochSpan < 98822.5 && CatRatio < 0.73) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan >= 81549 && CPerRatioNE >= 0.32 && InsertSpan >= 274622.5 && EpochSpan < 98822.5 && CatRatio >= 0.73) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan >= 81549 && CPerRatioNE >= 0.32 && InsertSpan >= 274622.5 && EpochSpan >= 98822.5 && CKWSRatio < 0.27) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && InsertSpan >= 81549 && CPerRatioNE >= 0.32 && InsertSpan >= 274622.5 && EpochSpan >= 98822.5 && CKWSRatio >= 0.27) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio < 0.23 && CKWSRatio < 0.22 && COrgRatioNE < 0.13 && CPerRatioNE < 0.72 && TKWSRatio < 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio < 0.23 && CKWSRatio < 0.22 && COrgRatioNE < 0.13 && CPerRatioNE < 0.72 && TKWSRatio >= 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio < 0.23 && CKWSRatio < 0.22 && COrgRatioNE < 0.13 && CPerRatioNE >= 0.72 && CKWSLength < 13.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio < 0.23 && CKWSRatio < 0.22 && COrgRatioNE < 0.13 && CPerRatioNE >= 0.72 && CKWSLength >= 13.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio < 0.23 && CKWSRatio < 0.22 && COrgRatioNE >= 0.13 && CKWSLength < 19.25 && TitleDist < 76) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio < 0.23 && CKWSRatio < 0.22 && COrgRatioNE >= 0.13 && CKWSLength < 19.25 && TitleDist >= 76) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio < 0.23 && CKWSRatio < 0.22 && COrgRatioNE >= 0.13 && CKWSLength >= 19.25 && CPerLengthNE < 98.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio < 0.23 && CKWSRatio < 0.22 && COrgRatioNE >= 0.13 && CKWSLength >= 19.25 && CPerLengthNE >= 98.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio < 0.23 && CKWSRatio >= 0.22 && CPerRatioSP < 0.06 && SimhashDist < 76.5 && COrgRatioNE < 0.41) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio < 0.23 && CKWSRatio >= 0.22 && CPerRatioSP < 0.06 && SimhashDist < 76.5 && COrgRatioNE >= 0.41) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio < 0.23 && CKWSRatio >= 0.22 && CPerRatioSP < 0.06 && SimhashDist >= 76.5 && TitleRatio < 0.13) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio < 0.23 && CKWSRatio >= 0.22 && CPerRatioSP < 0.06 && SimhashDist >= 76.5 && TitleRatio >= 0.13) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio < 0.23 && CKWSRatio >= 0.22 && CPerRatioSP >= 0.06 && TKWSRatio < 0.5 && CLocLengthSP < 19.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio < 0.23 && CKWSRatio >= 0.22 && CPerRatioSP >= 0.06 && TKWSRatio < 0.5 && CLocLengthSP >= 19.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio < 0.23 && CKWSRatio >= 0.22 && CPerRatioSP >= 0.06 && TKWSRatio >= 0.5 && COrgRatioSP < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio < 0.23 && CKWSRatio >= 0.22 && CPerRatioSP >= 0.06 && TKWSRatio >= 0.5 && COrgRatioSP >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio >= 0.23 && CLocRatioSP < 0.52 && CPerRatioSP < 0.28 && TitleLength < 8.25 && GeoRatio < 0.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio >= 0.23 && CLocRatioSP < 0.52 && CPerRatioSP < 0.28 && TitleLength < 8.25 && GeoRatio >= 0.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio >= 0.23 && CLocRatioSP < 0.52 && CPerRatioSP < 0.28 && TitleLength >= 8.25 && CKWSRatio < 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio >= 0.23 && CLocRatioSP < 0.52 && CPerRatioSP < 0.28 && TitleLength >= 8.25 && CKWSRatio >= 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio >= 0.23 && CLocRatioSP < 0.52 && CPerRatioSP >= 0.28 && CKWSLength < 9.25 && TitleDist < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio >= 0.23 && CLocRatioSP < 0.52 && CPerRatioSP >= 0.28 && CKWSLength < 9.25 && TitleDist >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio >= 0.23 && CLocRatioSP < 0.52 && CPerRatioSP >= 0.28 && CKWSLength >= 9.25 && SimhashDist < 60.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio >= 0.23 && CLocRatioSP < 0.52 && CPerRatioSP >= 0.28 && CKWSLength >= 9.25 && SimhashDist >= 60.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio >= 0.23 && CLocRatioSP >= 0.52 && SimhashDist < 14.5 && TitleDist < 0.5 && COrgLengthNE < 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio >= 0.23 && CLocRatioSP >= 0.52 && SimhashDist < 14.5 && TitleDist < 0.5 && COrgLengthNE >= 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio >= 0.23 && CLocRatioSP >= 0.52 && SimhashDist < 14.5 && TitleDist >= 0.5 && CTimLengthSP < 21.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio >= 0.23 && CLocRatioSP >= 0.52 && SimhashDist < 14.5 && TitleDist >= 0.5 && CTimLengthSP >= 21.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio >= 0.23 && CLocRatioSP >= 0.52 && SimhashDist >= 14.5 && CKWSRatio < 0.34 && TitleRatio < 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio >= 0.23 && CLocRatioSP >= 0.52 && SimhashDist >= 14.5 && CKWSRatio < 0.34 && TitleRatio >= 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio >= 0.23 && CLocRatioSP >= 0.52 && SimhashDist >= 14.5 && CKWSRatio >= 0.34 && ParagraphSpan < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio >= 0.23 && CLocRatioSP >= 0.52 && SimhashDist >= 14.5 && CKWSRatio >= 0.34 && ParagraphSpan >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist < 68.5 && EpochSpan < 255690 && TKWSRatio < 0.69 && CTimRatioSP < 0.18 && CPerRatioSP < 0.59) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist < 68.5 && EpochSpan < 255690 && TKWSRatio < 0.69 && CTimRatioSP < 0.18 && CPerRatioSP >= 0.59) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist < 68.5 && EpochSpan < 255690 && TKWSRatio < 0.69 && CTimRatioSP >= 0.18 && ChannelRatio < 0.34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist < 68.5 && EpochSpan < 255690 && TKWSRatio < 0.69 && CTimRatioSP >= 0.18 && ChannelRatio >= 0.34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist < 68.5 && EpochSpan < 255690 && TKWSRatio >= 0.69 && CPerRatioSP < 0.56 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist < 68.5 && EpochSpan < 255690 && TKWSRatio >= 0.69 && CPerRatioSP < 0.56 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist < 68.5 && EpochSpan < 255690 && TKWSRatio >= 0.69 && CPerRatioSP >= 0.56 && CNUMRatioSP < 0.44) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist < 68.5 && EpochSpan < 255690 && TKWSRatio >= 0.69 && CPerRatioSP >= 0.56 && CNUMRatioSP >= 0.44) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist < 68.5 && EpochSpan >= 255690 && CPerRatioSP < 0.61 && CPerLengthNE < 29.25 && CKWSRatio < 0.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist < 68.5 && EpochSpan >= 255690 && CPerRatioSP < 0.61 && CPerLengthNE < 29.25 && CKWSRatio >= 0.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist < 68.5 && EpochSpan >= 255690 && CPerRatioSP < 0.61 && CPerLengthNE >= 29.25 && TitleDist < 46.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist < 68.5 && EpochSpan >= 255690 && CPerRatioSP < 0.61 && CPerLengthNE >= 29.25 && TitleDist >= 46.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist < 68.5 && EpochSpan >= 255690 && CPerRatioSP >= 0.61 && CNUMLengthSP < 13.75 && EpochSpan < 698395) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist < 68.5 && EpochSpan >= 255690 && CPerRatioSP >= 0.61 && CNUMLengthSP < 13.75 && EpochSpan >= 698395) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist < 68.5 && EpochSpan >= 255690 && CPerRatioSP >= 0.61 && CNUMLengthSP >= 13.75 && CatLength < 0.86) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist < 68.5 && EpochSpan >= 255690 && CPerRatioSP >= 0.61 && CNUMLengthSP >= 13.75 && CatLength >= 0.86) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist >= 68.5 && CKWSRatio < 0.26 && TKWSRatio < 0.36 && CatRatio < 0.55 && COrgRatioSP < 0.18) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist >= 68.5 && CKWSRatio < 0.26 && TKWSRatio < 0.36 && CatRatio < 0.55 && COrgRatioSP >= 0.18) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist >= 68.5 && CKWSRatio < 0.26 && TKWSRatio < 0.36 && CatRatio >= 0.55 && TitleDist < 30.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist >= 68.5 && CKWSRatio < 0.26 && TKWSRatio < 0.36 && CatRatio >= 0.55 && TitleDist >= 30.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist >= 68.5 && CKWSRatio < 0.26 && TKWSRatio >= 0.36 && CTimRatioSP < 0.26 && CatRatio < 0.6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist >= 68.5 && CKWSRatio < 0.26 && TKWSRatio >= 0.36 && CTimRatioSP < 0.26 && CatRatio >= 0.6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist >= 68.5 && CKWSRatio < 0.26 && TKWSRatio >= 0.36 && CTimRatioSP >= 0.26 && CLocRatioSP < 0.71) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist >= 68.5 && CKWSRatio < 0.26 && TKWSRatio >= 0.36 && CTimRatioSP >= 0.26 && CLocRatioSP >= 0.71) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist >= 68.5 && CKWSRatio >= 0.26 && CPerRatioSP < 0.33 && EpochSpan < 313380.5 && CKWSRatio < 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist >= 68.5 && CKWSRatio >= 0.26 && CPerRatioSP < 0.33 && EpochSpan < 313380.5 && CKWSRatio >= 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist >= 68.5 && CKWSRatio >= 0.26 && CPerRatioSP < 0.33 && EpochSpan >= 313380.5 && CNUMRatioSP < 0.1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist >= 68.5 && CKWSRatio >= 0.26 && CPerRatioSP < 0.33 && EpochSpan >= 313380.5 && CNUMRatioSP >= 0.1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist >= 68.5 && CKWSRatio >= 0.26 && CPerRatioSP >= 0.33 && ChannelRatio < 0.17 && TitleRatio < 0.51) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist >= 68.5 && CKWSRatio >= 0.26 && CPerRatioSP >= 0.33 && ChannelRatio < 0.17 && TitleRatio >= 0.51) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist >= 68.5 && CKWSRatio >= 0.26 && CPerRatioSP >= 0.33 && ChannelRatio >= 0.17 && InsertSpan < 249059.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && SimhashDist >= 68.5 && CKWSRatio >= 0.26 && CPerRatioSP >= 0.33 && ChannelRatio >= 0.17 && InsertSpan >= 249059.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio < 0.5 && ChannelRatio < 0.3 && COrgRatioSP < 0.37 && SimhashDist < 67.5 && SimhashDist < 42.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio < 0.5 && ChannelRatio < 0.3 && COrgRatioSP < 0.37 && SimhashDist < 67.5 && SimhashDist >= 42.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio < 0.5 && ChannelRatio < 0.3 && COrgRatioSP < 0.37 && SimhashDist >= 67.5 && TKWSRatio < 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio < 0.5 && ChannelRatio < 0.3 && COrgRatioSP < 0.37 && SimhashDist >= 67.5 && TKWSRatio >= 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio < 0.5 && ChannelRatio < 0.3 && COrgRatioSP >= 0.37 && TitleRatio < 0.23 && COrgLengthSP < 8.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio < 0.5 && ChannelRatio < 0.3 && COrgRatioSP >= 0.37 && TitleRatio < 0.23 && COrgLengthSP >= 8.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio < 0.5 && ChannelRatio < 0.3 && COrgRatioSP >= 0.37 && TitleRatio >= 0.23 && CPerLengthSP < 9.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio < 0.5 && ChannelRatio < 0.3 && COrgRatioSP >= 0.37 && TitleRatio >= 0.23 && CPerLengthSP >= 9.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio < 0.5 && ChannelRatio >= 0.3 && SimhashDist < 67.5 && InsertSpan < 23473.5 && COrgLengthNE < 2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio < 0.5 && ChannelRatio >= 0.3 && SimhashDist < 67.5 && InsertSpan < 23473.5 && COrgLengthNE >= 2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio < 0.5 && ChannelRatio >= 0.3 && SimhashDist < 67.5 && InsertSpan >= 23473.5 && CLocRatioSP < 0.65) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio < 0.5 && ChannelRatio >= 0.3 && SimhashDist < 67.5 && InsertSpan >= 23473.5 && CLocRatioSP >= 0.65) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio < 0.5 && ChannelRatio >= 0.3 && SimhashDist >= 67.5 && CNUMRatioSP < 0.19 && EpochSpan < 72451) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio < 0.5 && ChannelRatio >= 0.3 && SimhashDist >= 67.5 && CNUMRatioSP < 0.19 && EpochSpan >= 72451) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio < 0.5 && ChannelRatio >= 0.3 && SimhashDist >= 67.5 && CNUMRatioSP >= 0.19 && TitleRatio < 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio < 0.5 && ChannelRatio >= 0.3 && SimhashDist >= 67.5 && CNUMRatioSP >= 0.19 && TitleRatio >= 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio >= 0.5 && COrgRatioSP < 0.43 && TitleRatio < 0.31 && CTimRatioSP < 0.45 && CKWSRatio < 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio >= 0.5 && COrgRatioSP < 0.43 && TitleRatio < 0.31 && CTimRatioSP < 0.45 && CKWSRatio >= 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio >= 0.5 && COrgRatioSP < 0.43 && TitleRatio < 0.31 && CTimRatioSP >= 0.45 && CTimLengthSP < 27.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio >= 0.5 && COrgRatioSP < 0.43 && TitleRatio < 0.31 && CTimRatioSP >= 0.45 && CTimLengthSP >= 27.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio >= 0.5 && COrgRatioSP < 0.43 && TitleRatio >= 0.31 && TKWSRatio < 0.55 && COrgRatioNE < 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio >= 0.5 && COrgRatioSP < 0.43 && TitleRatio >= 0.31 && TKWSRatio < 0.55 && COrgRatioNE >= 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio >= 0.5 && COrgRatioSP < 0.43 && TitleRatio >= 0.31 && TKWSRatio >= 0.55 && COrgLengthNE < 15.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio >= 0.5 && COrgRatioSP < 0.43 && TitleRatio >= 0.31 && TKWSRatio >= 0.55 && COrgLengthNE >= 15.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio >= 0.5 && COrgRatioSP >= 0.43 && EpochSpan < 85866 && TitleDist < 0.5 && COrgRatioNE < 0.08) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio >= 0.5 && COrgRatioSP >= 0.43 && EpochSpan < 85866 && TitleDist < 0.5 && COrgRatioNE >= 0.08) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio >= 0.5 && COrgRatioSP >= 0.43 && EpochSpan < 85866 && TitleDist >= 0.5 && CLocRatioSP < 0.58) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio >= 0.5 && COrgRatioSP >= 0.43 && EpochSpan < 85866 && TitleDist >= 0.5 && CLocRatioSP >= 0.58) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio >= 0.5 && COrgRatioSP >= 0.43 && EpochSpan >= 85866 && CatLength < 0.78 && CTimRatioSP < 0.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio >= 0.5 && COrgRatioSP >= 0.43 && EpochSpan >= 85866 && CatLength < 0.78 && CTimRatioSP >= 0.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio >= 0.5 && COrgRatioSP >= 0.43 && EpochSpan >= 85866 && CatLength >= 0.78 && COrgRatioSP < 0.51) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio >= 0.5 && COrgRatioSP >= 0.43 && EpochSpan >= 85866 && CatLength >= 0.78 && COrgRatioSP >= 0.51) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP < 0.74 && CPerRatioSP < 0.61 && InsertSpan < 93931.5 && TKWSRatio < 0.44 && CPerLengthNE < 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP < 0.74 && CPerRatioSP < 0.61 && InsertSpan < 93931.5 && TKWSRatio < 0.44 && CPerLengthNE >= 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP < 0.74 && CPerRatioSP < 0.61 && InsertSpan < 93931.5 && TKWSRatio >= 0.44 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP < 0.74 && CPerRatioSP < 0.61 && InsertSpan < 93931.5 && TKWSRatio >= 0.44 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP < 0.74 && CPerRatioSP < 0.61 && InsertSpan >= 93931.5 && CLocRatioSP < 0.57 && TitleRatio < 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP < 0.74 && CPerRatioSP < 0.61 && InsertSpan >= 93931.5 && CLocRatioSP < 0.57 && TitleRatio >= 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP < 0.74 && CPerRatioSP < 0.61 && InsertSpan >= 93931.5 && CLocRatioSP >= 0.57 && InsertSpan < 251250.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP < 0.74 && CPerRatioSP < 0.61 && InsertSpan >= 93931.5 && CLocRatioSP >= 0.57 && InsertSpan >= 251250.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP < 0.74 && CPerRatioSP >= 0.61 && SimhashDist < 63.5 && TPerRatioSP < 0.75 && TitleDist < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP < 0.74 && CPerRatioSP >= 0.61 && SimhashDist < 63.5 && TPerRatioSP < 0.75 && TitleDist >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP < 0.74 && CPerRatioSP >= 0.61 && SimhashDist < 63.5 && TPerRatioSP >= 0.75 && CatLength < 0.9) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP < 0.74 && CPerRatioSP >= 0.61 && SimhashDist < 63.5 && TPerRatioSP >= 0.75 && CatLength >= 0.9) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP < 0.74 && CPerRatioSP >= 0.61 && SimhashDist >= 63.5 && EpochSpan < 127910.5 && TitleRatio < 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP < 0.74 && CPerRatioSP >= 0.61 && SimhashDist >= 63.5 && EpochSpan < 127910.5 && TitleRatio >= 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP < 0.74 && CPerRatioSP >= 0.61 && SimhashDist >= 63.5 && EpochSpan >= 127910.5 && CKWSRatio < 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP < 0.74 && CPerRatioSP >= 0.61 && SimhashDist >= 63.5 && EpochSpan >= 127910.5 && CKWSRatio >= 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP >= 0.74 && COrgRatioSP < 0.91 && ChannelRatio < 0.77 && EpochSpan < 340387.5 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP >= 0.74 && COrgRatioSP < 0.91 && ChannelRatio < 0.77 && EpochSpan < 340387.5 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP >= 0.74 && COrgRatioSP < 0.91 && ChannelRatio < 0.77 && EpochSpan >= 340387.5 && CPerRatioSP < 0.53) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP >= 0.74 && COrgRatioSP < 0.91 && ChannelRatio < 0.77 && EpochSpan >= 340387.5 && CPerRatioSP >= 0.53) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP >= 0.74 && COrgRatioSP < 0.91 && ChannelRatio >= 0.77 && COrgLengthSP < 3.25 && CLocRatioNE < 0.95) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP >= 0.74 && COrgRatioSP < 0.91 && ChannelRatio >= 0.77 && COrgLengthSP < 3.25 && CLocRatioNE >= 0.95) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP >= 0.74 && COrgRatioSP < 0.91 && ChannelRatio >= 0.77 && COrgLengthSP >= 3.25 && CatLength < 1.34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP >= 0.74 && COrgRatioSP < 0.91 && ChannelRatio >= 0.77 && COrgLengthSP >= 3.25 && CatLength >= 1.34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP >= 0.74 && COrgRatioSP >= 0.91 && TitleDist < 1.5 && TitleLength < 17.5 && TOrgLengthSP < 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP >= 0.74 && COrgRatioSP >= 0.91 && TitleDist < 1.5 && TitleLength < 17.5 && TOrgLengthSP >= 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP >= 0.74 && COrgRatioSP >= 0.91 && TitleDist < 1.5 && TitleLength >= 17.5 && CPerLengthSP < 2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP >= 0.74 && COrgRatioSP >= 0.91 && TitleDist < 1.5 && TitleLength >= 17.5 && CPerLengthSP >= 2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP >= 0.74 && COrgRatioSP >= 0.91 && TitleDist >= 1.5 && CLocRatioNE < 0.8 && ChannelLength < 4.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP >= 0.74 && COrgRatioSP >= 0.91 && TitleDist >= 1.5 && CLocRatioNE < 0.8 && ChannelLength >= 4.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP >= 0.74 && COrgRatioSP >= 0.91 && TitleDist >= 1.5 && CLocRatioNE >= 0.8 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && CNUMRatioSP >= 0.74 && COrgRatioSP >= 0.91 && TitleDist >= 1.5 && CLocRatioNE >= 0.8 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP < 0.29 && CKWSRatio < 0.22 && CatRatio < 0.55 && CLocLengthSP < 14.25 && CKWSRatio < 0.12) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP < 0.29 && CKWSRatio < 0.22 && CatRatio < 0.55 && CLocLengthSP < 14.25 && CKWSRatio >= 0.12) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP < 0.29 && CKWSRatio < 0.22 && CatRatio < 0.55 && CLocLengthSP >= 14.25 && EpochSpan < 1370) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP < 0.29 && CKWSRatio < 0.22 && CatRatio < 0.55 && CLocLengthSP >= 14.25 && EpochSpan >= 1370) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP < 0.29 && CKWSRatio < 0.22 && CatRatio >= 0.55 && HKWSRatio < 0.9 && TitleDist < 11) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP < 0.29 && CKWSRatio < 0.22 && CatRatio >= 0.55 && HKWSRatio < 0.9 && TitleDist >= 11) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP < 0.29 && CKWSRatio < 0.22 && CatRatio >= 0.55 && HKWSRatio >= 0.9 && EpochSpan < 8672.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP < 0.29 && CKWSRatio < 0.22 && CatRatio >= 0.55 && HKWSRatio >= 0.9 && EpochSpan >= 8672.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP < 0.29 && CKWSRatio >= 0.22 && EpochSpan < 79416 && TKWSRatio < 0.56 && CLocRatioNE < 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP < 0.29 && CKWSRatio >= 0.22 && EpochSpan < 79416 && TKWSRatio < 0.56 && CLocRatioNE >= 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP < 0.29 && CKWSRatio >= 0.22 && EpochSpan < 79416 && TKWSRatio >= 0.56 && COrgRatioNE < 0.15) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP < 0.29 && CKWSRatio >= 0.22 && EpochSpan < 79416 && TKWSRatio >= 0.56 && COrgRatioNE >= 0.15) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP < 0.29 && CKWSRatio >= 0.22 && EpochSpan >= 79416 && COrgRatioSP < 0.43 && CKWSRatio < 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP < 0.29 && CKWSRatio >= 0.22 && EpochSpan >= 79416 && COrgRatioSP < 0.43 && CKWSRatio >= 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP < 0.29 && CKWSRatio >= 0.22 && EpochSpan >= 79416 && COrgRatioSP >= 0.43 && InsertSpan < 188207.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP < 0.29 && CKWSRatio >= 0.22 && EpochSpan >= 79416 && COrgRatioSP >= 0.43 && InsertSpan >= 188207.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP >= 0.29 && TitleRatio < 0.38 && CKWSRatio < 0.29 && COrgRatioSP < 0.16 && CNUMRatioSP < 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP >= 0.29 && TitleRatio < 0.38 && CKWSRatio < 0.29 && COrgRatioSP < 0.16 && CNUMRatioSP >= 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP >= 0.29 && TitleRatio < 0.38 && CKWSRatio < 0.29 && COrgRatioSP >= 0.16 && CTimLengthSP < 21.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP >= 0.29 && TitleRatio < 0.38 && CKWSRatio < 0.29 && COrgRatioSP >= 0.16 && CTimLengthSP >= 21.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP >= 0.29 && TitleRatio < 0.38 && CKWSRatio >= 0.29 && CPerRatioNE < 0.65 && SimhashDist < 63.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP >= 0.29 && TitleRatio < 0.38 && CKWSRatio >= 0.29 && CPerRatioNE < 0.65 && SimhashDist >= 63.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP >= 0.29 && TitleRatio < 0.38 && CKWSRatio >= 0.29 && CPerRatioNE >= 0.65 && TKWSRatio < 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP >= 0.29 && TitleRatio < 0.38 && CKWSRatio >= 0.29 && CPerRatioNE >= 0.65 && TKWSRatio >= 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP >= 0.29 && TitleRatio >= 0.38 && SameSRC < 0.5 && EpochSpan < 251173 && CLocLengthSP < 6.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP >= 0.29 && TitleRatio >= 0.38 && SameSRC < 0.5 && EpochSpan < 251173 && CLocLengthSP >= 6.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP >= 0.29 && TitleRatio >= 0.38 && SameSRC < 0.5 && EpochSpan >= 251173 && SimhashDist < 71.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP >= 0.29 && TitleRatio >= 0.38 && SameSRC < 0.5 && EpochSpan >= 251173 && SimhashDist >= 71.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP >= 0.29 && TitleRatio >= 0.38 && SameSRC >= 0.5 && CNUMRatioSP < 0.44 && CPerRatioSP < 0.43) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP >= 0.29 && TitleRatio >= 0.38 && SameSRC >= 0.5 && CNUMRatioSP < 0.44 && CPerRatioSP >= 0.43) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP >= 0.29 && TitleRatio >= 0.38 && SameSRC >= 0.5 && CNUMRatioSP >= 0.44 && InsertSpan < 261999.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP >= 0.29 && TitleRatio >= 0.38 && SameSRC >= 0.5 && CNUMRatioSP >= 0.44 && InsertSpan >= 261999.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist < 14.5 && EpochSpan < 14.5 && ParagraphSpan < 23.5 && TOrgLengthNE < 2.5 && CKWSLength < 6.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist < 14.5 && EpochSpan < 14.5 && ParagraphSpan < 23.5 && TOrgLengthNE < 2.5 && CKWSLength >= 6.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist < 14.5 && EpochSpan < 14.5 && ParagraphSpan < 23.5 && TOrgLengthNE >= 2.5 && COrgRatioNE < 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist < 14.5 && EpochSpan < 14.5 && ParagraphSpan < 23.5 && TOrgLengthNE >= 2.5 && COrgRatioNE >= 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist < 14.5 && EpochSpan < 14.5 && ParagraphSpan >= 23.5 && CNUMRatioSP < 0.6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist < 14.5 && EpochSpan < 14.5 && ParagraphSpan >= 23.5 && CNUMRatioSP >= 0.6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist < 14.5 && EpochSpan >= 14.5 && CLocRatioNE < 0.97 && TitleLength < 5.25 && CKWSRatio < 0.76) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist < 14.5 && EpochSpan >= 14.5 && CLocRatioNE < 0.97 && TitleLength < 5.25 && CKWSRatio >= 0.76) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist < 14.5 && EpochSpan >= 14.5 && CLocRatioNE < 0.97 && TitleLength >= 5.25 && TitleRatio < 0.73) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist < 14.5 && EpochSpan >= 14.5 && CLocRatioNE < 0.97 && TitleLength >= 5.25 && TitleRatio >= 0.73) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist < 14.5 && EpochSpan >= 14.5 && CLocRatioNE >= 0.97 && TKWSRatio < 0.9 && CNUMLengthSP < 32.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist < 14.5 && EpochSpan >= 14.5 && CLocRatioNE >= 0.97 && TKWSRatio < 0.9 && CNUMLengthSP >= 32.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist < 14.5 && EpochSpan >= 14.5 && CLocRatioNE >= 0.97 && TKWSRatio >= 0.9 && CatRatio < 0.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist < 14.5 && EpochSpan >= 14.5 && CLocRatioNE >= 0.97 && TKWSRatio >= 0.9 && CatRatio >= 0.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist >= 14.5 && SameSRC < 0.5 && CPerRatioNE < 0.28 && InsertSpan < 84120 && SimhashDist < 77.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist >= 14.5 && SameSRC < 0.5 && CPerRatioNE < 0.28 && InsertSpan < 84120 && SimhashDist >= 77.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist >= 14.5 && SameSRC < 0.5 && CPerRatioNE < 0.28 && InsertSpan >= 84120 && CKWSRatio < 0.53) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist >= 14.5 && SameSRC < 0.5 && CPerRatioNE < 0.28 && InsertSpan >= 84120 && CKWSRatio >= 0.53) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist >= 14.5 && SameSRC < 0.5 && CPerRatioNE >= 0.28 && CKWSLength < 8.75 && CTimLengthSP < 8.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist >= 14.5 && SameSRC < 0.5 && CPerRatioNE >= 0.28 && CKWSLength < 8.75 && CTimLengthSP >= 8.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist >= 14.5 && SameSRC < 0.5 && CPerRatioNE >= 0.28 && CKWSLength >= 8.75 && TKWSRatio < 0.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist >= 14.5 && SameSRC < 0.5 && CPerRatioNE >= 0.28 && CKWSLength >= 8.75 && TKWSRatio >= 0.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist >= 14.5 && SameSRC >= 0.5 && COrgRatioSP < 0.82 && EpochSpan < 769583 && CLocLengthSP < 26.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist >= 14.5 && SameSRC >= 0.5 && COrgRatioSP < 0.82 && EpochSpan < 769583 && CLocLengthSP >= 26.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist >= 14.5 && SameSRC >= 0.5 && COrgRatioSP < 0.82 && EpochSpan >= 769583 && InsertSpan < 259553.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist >= 14.5 && SameSRC >= 0.5 && COrgRatioSP < 0.82 && EpochSpan >= 769583 && InsertSpan >= 259553.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist >= 14.5 && SameSRC >= 0.5 && COrgRatioSP >= 0.82 && ChannelLength < 4.75 && EpochSpan < 303386) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist >= 14.5 && SameSRC >= 0.5 && COrgRatioSP >= 0.82 && ChannelLength < 4.75 && EpochSpan >= 303386) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist >= 14.5 && SameSRC >= 0.5 && COrgRatioSP >= 0.82 && ChannelLength >= 4.75 && EpochSpan < 81397) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && SimhashDist >= 14.5 && SameSRC >= 0.5 && COrgRatioSP >= 0.82 && ChannelLength >= 4.75 && EpochSpan >= 81397) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE < 0.92 && CNUMRatioSP < 0.53 && TKWSRatio < 0.58 && TitleRatio < 0.22 && EpochSpan < 95023) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE < 0.92 && CNUMRatioSP < 0.53 && TKWSRatio < 0.58 && TitleRatio < 0.22 && EpochSpan >= 95023) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE < 0.92 && CNUMRatioSP < 0.53 && TKWSRatio < 0.58 && TitleRatio >= 0.22 && CPerRatioNE < 0.19) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE < 0.92 && CNUMRatioSP < 0.53 && TKWSRatio < 0.58 && TitleRatio >= 0.22 && CPerRatioNE >= 0.19) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE < 0.92 && CNUMRatioSP < 0.53 && TKWSRatio >= 0.58 && SameSRC < 0.5 && CNUMLengthSP < 7.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE < 0.92 && CNUMRatioSP < 0.53 && TKWSRatio >= 0.58 && SameSRC < 0.5 && CNUMLengthSP >= 7.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE < 0.92 && CNUMRatioSP < 0.53 && TKWSRatio >= 0.58 && SameSRC >= 0.5 && HKWSRatio < 0.84) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE < 0.92 && CNUMRatioSP < 0.53 && TKWSRatio >= 0.58 && SameSRC >= 0.5 && HKWSRatio >= 0.84) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE < 0.92 && CNUMRatioSP >= 0.53 && EpochSpan < 255419 && TitleLength < 5.75 && CKWSLength < 7.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE < 0.92 && CNUMRatioSP >= 0.53 && EpochSpan < 255419 && TitleLength < 5.75 && CKWSLength >= 7.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE < 0.92 && CNUMRatioSP >= 0.53 && EpochSpan < 255419 && TitleLength >= 5.75 && CPerRatioNE < 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE < 0.92 && CNUMRatioSP >= 0.53 && EpochSpan < 255419 && TitleLength >= 5.75 && CPerRatioNE >= 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE < 0.92 && CNUMRatioSP >= 0.53 && EpochSpan >= 255419 && CTimLengthSP < 4.25 && SimhashDist < 63.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE < 0.92 && CNUMRatioSP >= 0.53 && EpochSpan >= 255419 && CTimLengthSP < 4.25 && SimhashDist >= 63.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE < 0.92 && CNUMRatioSP >= 0.53 && EpochSpan >= 255419 && CTimLengthSP >= 4.25 && CLocRatioNE < 0.71) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE < 0.92 && CNUMRatioSP >= 0.53 && EpochSpan >= 255419 && CTimLengthSP >= 4.25 && CLocRatioNE >= 0.71) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE >= 0.92 && CNUMRatioSP < 0.74 && CKWSLength < 13.25 && CatLength < 1.44 && InsertSpan < 81086.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE >= 0.92 && CNUMRatioSP < 0.74 && CKWSLength < 13.25 && CatLength < 1.44 && InsertSpan >= 81086.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE >= 0.92 && CNUMRatioSP < 0.74 && CKWSLength < 13.25 && CatLength >= 1.44 && InsertSpan < 15613) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE >= 0.92 && CNUMRatioSP < 0.74 && CKWSLength < 13.25 && CatLength >= 1.44 && InsertSpan >= 15613) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE >= 0.92 && CNUMRatioSP < 0.74 && CKWSLength >= 13.25 && SimhashDist < 9.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE >= 0.92 && CNUMRatioSP < 0.74 && CKWSLength >= 13.25 && SimhashDist >= 9.5 && EpochSpan < 86762) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE >= 0.92 && CNUMRatioSP < 0.74 && CKWSLength >= 13.25 && SimhashDist >= 9.5 && EpochSpan >= 86762) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE >= 0.92 && CNUMRatioSP >= 0.74 && CKWSRatio < 0.99 && CatLength < 1.08 && TKWSRatio < 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE >= 0.92 && CNUMRatioSP >= 0.74 && CKWSRatio < 0.99 && CatLength < 1.08 && TKWSRatio >= 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE >= 0.92 && CNUMRatioSP >= 0.74 && CKWSRatio < 0.99 && CatLength >= 1.08 && TitleRatio < 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE >= 0.92 && CNUMRatioSP >= 0.74 && CKWSRatio < 0.99 && CatLength >= 1.08 && TitleRatio >= 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE >= 0.92 && CNUMRatioSP >= 0.74 && CKWSRatio >= 0.99 && SimhashDist < 37.5 && COrgLengthSP < 29.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE >= 0.92 && CNUMRatioSP >= 0.74 && CKWSRatio >= 0.99 && SimhashDist < 37.5 && COrgLengthSP >= 29.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE >= 0.92 && CNUMRatioSP >= 0.74 && CKWSRatio >= 0.99 && SimhashDist >= 37.5 && InsertSpan < 75557) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE >= 0.92 && CNUMRatioSP >= 0.74 && CKWSRatio >= 0.99 && SimhashDist >= 37.5 && InsertSpan >= 75557) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio < 0.39 && TitleRatio < 0.18 && CTimRatioSP < 0.31 && ChannelRatio < 0.11 && COrgRatioSP < 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio < 0.39 && TitleRatio < 0.18 && CTimRatioSP < 0.31 && ChannelRatio < 0.11 && COrgRatioSP >= 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio < 0.39 && TitleRatio < 0.18 && CTimRatioSP < 0.31 && ChannelRatio >= 0.11 && CKWSRatio < 0.19) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio < 0.39 && TitleRatio < 0.18 && CTimRatioSP < 0.31 && ChannelRatio >= 0.11 && CKWSRatio >= 0.19) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio < 0.39 && TitleRatio < 0.18 && CTimRatioSP >= 0.31 && TKWSRatio < 0.16 && CTimRatioSP < 0.68) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio < 0.39 && TitleRatio < 0.18 && CTimRatioSP >= 0.31 && TKWSRatio < 0.16 && CTimRatioSP >= 0.68) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio < 0.39 && TitleRatio < 0.18 && CTimRatioSP >= 0.31 && TKWSRatio >= 0.16 && CPerRatioNE < 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio < 0.39 && TitleRatio < 0.18 && CTimRatioSP >= 0.31 && TKWSRatio >= 0.16 && CPerRatioNE >= 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio < 0.39 && TitleRatio >= 0.18 && SameSRC < 0.5 && CKWSRatio < 0.31 && TKWSRatio < 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio < 0.39 && TitleRatio >= 0.18 && SameSRC < 0.5 && CKWSRatio < 0.31 && TKWSRatio >= 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio < 0.39 && TitleRatio >= 0.18 && SameSRC < 0.5 && CKWSRatio >= 0.31 && InsertSpan < 154124) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio < 0.39 && TitleRatio >= 0.18 && SameSRC < 0.5 && CKWSRatio >= 0.31 && InsertSpan >= 154124) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio < 0.39 && TitleRatio >= 0.18 && SameSRC >= 0.5 && CKWSRatio < 0.29 && SimhashDist < 73.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio < 0.39 && TitleRatio >= 0.18 && SameSRC >= 0.5 && CKWSRatio < 0.29 && SimhashDist >= 73.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio < 0.39 && TitleRatio >= 0.18 && SameSRC >= 0.5 && CKWSRatio >= 0.29 && TKWSRatio < 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio < 0.39 && TitleRatio >= 0.18 && SameSRC >= 0.5 && CKWSRatio >= 0.29 && TKWSRatio >= 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio >= 0.39 && TitleRatio < 0.31 && InsertSpan < 107633.5 && TKWSRatio < 0.29 && CatRatio < 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio >= 0.39 && TitleRatio < 0.31 && InsertSpan < 107633.5 && TKWSRatio < 0.29 && CatRatio >= 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio >= 0.39 && TitleRatio < 0.31 && InsertSpan < 107633.5 && TKWSRatio >= 0.29 && COrgRatioSP < 0.63) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio >= 0.39 && TitleRatio < 0.31 && InsertSpan < 107633.5 && TKWSRatio >= 0.29 && COrgRatioSP >= 0.63) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio >= 0.39 && TitleRatio < 0.31 && InsertSpan >= 107633.5 && CNUMRatioSP < 0.25 && EpochSpan < 585810) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio >= 0.39 && TitleRatio < 0.31 && InsertSpan >= 107633.5 && CNUMRatioSP < 0.25 && EpochSpan >= 585810) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio >= 0.39 && TitleRatio < 0.31 && InsertSpan >= 107633.5 && CNUMRatioSP >= 0.25 && HKWSLength < 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio >= 0.39 && TitleRatio < 0.31 && InsertSpan >= 107633.5 && CNUMRatioSP >= 0.25 && HKWSLength >= 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio >= 0.39 && TitleRatio >= 0.31 && EpochSpan < 60573.5 && TKWSRatio < 0.67 && COrgLengthSP < 15.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio >= 0.39 && TitleRatio >= 0.31 && EpochSpan < 60573.5 && TKWSRatio < 0.67 && COrgLengthSP >= 15.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio >= 0.39 && TitleRatio >= 0.31 && EpochSpan < 60573.5 && TKWSRatio >= 0.67 && CTimRatioSP < 0.44) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio >= 0.39 && TitleRatio >= 0.31 && EpochSpan < 60573.5 && TKWSRatio >= 0.67 && CTimRatioSP >= 0.44) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio >= 0.39 && TitleRatio >= 0.31 && EpochSpan >= 60573.5 && InsertSpan < 277057 && CPerRatioNE < 0.14) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio >= 0.39 && TitleRatio >= 0.31 && EpochSpan >= 60573.5 && InsertSpan < 277057 && CPerRatioNE >= 0.14) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio >= 0.39 && TitleRatio >= 0.31 && EpochSpan >= 60573.5 && InsertSpan >= 277057 && CNUMRatioSP < 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio >= 0.39 && TitleRatio >= 0.31 && EpochSpan >= 60573.5 && InsertSpan >= 277057 && CNUMRatioSP >= 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP < 0.3 && CTimRatioSP < 0.38 && COrgRatioSP < 0.18 && TitleRatio < 0.44 && TitleRatio < 0.12) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP < 0.3 && CTimRatioSP < 0.38 && COrgRatioSP < 0.18 && TitleRatio < 0.44 && TitleRatio >= 0.12) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP < 0.3 && CTimRatioSP < 0.38 && COrgRatioSP < 0.18 && TitleRatio >= 0.44 && TitleLength < 12.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP < 0.3 && CTimRatioSP < 0.38 && COrgRatioSP < 0.18 && TitleRatio >= 0.44 && TitleLength >= 12.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP < 0.3 && CTimRatioSP < 0.38 && COrgRatioSP >= 0.18 && TitleRatio < 0.11 && CLocLengthNE < 15.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP < 0.3 && CTimRatioSP < 0.38 && COrgRatioSP >= 0.18 && TitleRatio < 0.11 && CLocLengthNE >= 15.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP < 0.3 && CTimRatioSP < 0.38 && COrgRatioSP >= 0.18 && TitleRatio >= 0.11 && CKWSRatio < 0.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP < 0.3 && CTimRatioSP < 0.38 && COrgRatioSP >= 0.18 && TitleRatio >= 0.11 && CKWSRatio >= 0.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP < 0.3 && CTimRatioSP >= 0.38 && COrgRatioSP < 0.28 && TitleRatio < 0.21 && CTimLengthSP < 33.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP < 0.3 && CTimRatioSP >= 0.38 && COrgRatioSP < 0.28 && TitleRatio < 0.21 && CTimLengthSP >= 33.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP < 0.3 && CTimRatioSP >= 0.38 && COrgRatioSP < 0.28 && TitleRatio >= 0.21 && CNUMRatioSP < 0.69) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP < 0.3 && CTimRatioSP >= 0.38 && COrgRatioSP < 0.28 && TitleRatio >= 0.21 && CNUMRatioSP >= 0.69) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP < 0.3 && CTimRatioSP >= 0.38 && COrgRatioSP >= 0.28 && TitleRatio < 0.22 && CLocLengthSP < 21) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP < 0.3 && CTimRatioSP >= 0.38 && COrgRatioSP >= 0.28 && TitleRatio < 0.22 && CLocLengthSP >= 21) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP < 0.3 && CTimRatioSP >= 0.38 && COrgRatioSP >= 0.28 && TitleRatio >= 0.22 && CKWSRatio < 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP < 0.3 && CTimRatioSP >= 0.38 && COrgRatioSP >= 0.28 && TitleRatio >= 0.22 && CKWSRatio >= 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP >= 0.3 && CKWSRatio < 0.32 && CPerLengthSP < 15.25 && InsertSpan < 282781.5 && SimhashDist < 59.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP >= 0.3 && CKWSRatio < 0.32 && CPerLengthSP < 15.25 && InsertSpan < 282781.5 && SimhashDist >= 59.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP >= 0.3 && CKWSRatio < 0.32 && CPerLengthSP < 15.25 && InsertSpan >= 282781.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP >= 0.3 && CKWSRatio < 0.32 && CPerLengthSP >= 15.25 && COrgRatioNE < 0.04 && CLocRatioNE < 0.78) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP >= 0.3 && CKWSRatio < 0.32 && CPerLengthSP >= 15.25 && COrgRatioNE < 0.04 && CLocRatioNE >= 0.78) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP >= 0.3 && CKWSRatio < 0.32 && CPerLengthSP >= 15.25 && COrgRatioNE >= 0.04 && ParagraphSpan < 7.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP >= 0.3 && CKWSRatio < 0.32 && CPerLengthSP >= 15.25 && COrgRatioNE >= 0.04 && ParagraphSpan >= 7.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP >= 0.3 && CKWSRatio >= 0.32 && EpochSpan < 78360 && InsertSpan < 7281 && CWordSpan < 48.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP >= 0.3 && CKWSRatio >= 0.32 && EpochSpan < 78360 && InsertSpan < 7281 && CWordSpan >= 48.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP >= 0.3 && CKWSRatio >= 0.32 && EpochSpan < 78360 && InsertSpan >= 7281 && SimhashDist < 60.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP >= 0.3 && CKWSRatio >= 0.32 && EpochSpan < 78360 && InsertSpan >= 7281 && SimhashDist >= 60.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP >= 0.3 && CKWSRatio >= 0.32 && EpochSpan >= 78360 && CNUMRatioSP < 0.15 && TitleDist < 70.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP >= 0.3 && CKWSRatio >= 0.32 && EpochSpan >= 78360 && CNUMRatioSP < 0.15 && TitleDist >= 70.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP >= 0.3 && CKWSRatio >= 0.32 && EpochSpan >= 78360 && CNUMRatioSP >= 0.15 && CWordSpan < 5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP >= 0.3 && CKWSRatio >= 0.32 && EpochSpan >= 78360 && CNUMRatioSP >= 0.15 && CWordSpan >= 5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist < 0.5 && EpochSpan < 82174 && CTimLengthSP < 0.75 && TKWSRatio < 0.79 && CKWSRatio < 0.73) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist < 0.5 && EpochSpan < 82174 && CTimLengthSP < 0.75 && TKWSRatio < 0.79 && CKWSRatio >= 0.73) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist < 0.5 && EpochSpan < 82174 && CTimLengthSP < 0.75 && TKWSRatio >= 0.79 && EpochSpan < 703) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist < 0.5 && EpochSpan < 82174 && CTimLengthSP < 0.75 && TKWSRatio >= 0.79 && EpochSpan >= 703) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist < 0.5 && EpochSpan < 82174 && CTimLengthSP >= 0.75 && InsertSpan < 1013855.5 && CNUMRatioSP < 0.82) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist < 0.5 && EpochSpan < 82174 && CTimLengthSP >= 0.75 && InsertSpan < 1013855.5 && CNUMRatioSP >= 0.82) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist < 0.5 && EpochSpan < 82174 && CTimLengthSP >= 0.75 && InsertSpan >= 1013855.5 && InsertSpan < 1078898) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist < 0.5 && EpochSpan < 82174 && CTimLengthSP >= 0.75 && InsertSpan >= 1013855.5 && InsertSpan >= 1078898) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist < 0.5 && EpochSpan >= 82174 && CPerRatioSP < 0.64 && SameSRC < 0.5 && CatLength < 1.08) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist < 0.5 && EpochSpan >= 82174 && CPerRatioSP < 0.64 && SameSRC < 0.5 && CatLength >= 1.08) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist < 0.5 && EpochSpan >= 82174 && CPerRatioSP < 0.64 && SameSRC >= 0.5 && CPerRatioNE < 0.14) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist < 0.5 && EpochSpan >= 82174 && CPerRatioSP < 0.64 && SameSRC >= 0.5 && CPerRatioNE >= 0.14) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist < 0.5 && EpochSpan >= 82174 && CPerRatioSP >= 0.64 && CKWSLength < 11.75 && SimhashDist < 3.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist < 0.5 && EpochSpan >= 82174 && CPerRatioSP >= 0.64 && CKWSLength < 11.75 && SimhashDist >= 3.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist < 0.5 && EpochSpan >= 82174 && CPerRatioSP >= 0.64 && CKWSLength >= 11.75 && TKWSLength < 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist < 0.5 && EpochSpan >= 82174 && CPerRatioSP >= 0.64 && CKWSLength >= 11.75 && TKWSLength >= 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist >= 0.5 && SimhashDist < 71.5 && CNUMRatioSP < 0.41 && TitleRatio < 0.42 && CKWSRatio < 0.27) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist >= 0.5 && SimhashDist < 71.5 && CNUMRatioSP < 0.41 && TitleRatio < 0.42 && CKWSRatio >= 0.27) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist >= 0.5 && SimhashDist < 71.5 && CNUMRatioSP < 0.41 && TitleRatio >= 0.42 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist >= 0.5 && SimhashDist < 71.5 && CNUMRatioSP < 0.41 && TitleRatio >= 0.42 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist >= 0.5 && SimhashDist < 71.5 && CNUMRatioSP >= 0.41 && HKWSRatio < 0.36 && CLocRatioNE < 0.58) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist >= 0.5 && SimhashDist < 71.5 && CNUMRatioSP >= 0.41 && HKWSRatio < 0.36 && CLocRatioNE >= 0.58) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist >= 0.5 && SimhashDist < 71.5 && CNUMRatioSP >= 0.41 && HKWSRatio >= 0.36 && InsertSpan < 286186) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist >= 0.5 && SimhashDist < 71.5 && CNUMRatioSP >= 0.41 && HKWSRatio >= 0.36 && InsertSpan >= 286186) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist >= 0.5 && SimhashDist >= 71.5 && TitleRatio < 0.26 && CPerRatioNE < 0.33 && TitleRatio < 0.17) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist >= 0.5 && SimhashDist >= 71.5 && TitleRatio < 0.26 && CPerRatioNE < 0.33 && TitleRatio >= 0.17) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist >= 0.5 && SimhashDist >= 71.5 && TitleRatio < 0.26 && CPerRatioNE >= 0.33 && CatLength < 1.34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist >= 0.5 && SimhashDist >= 71.5 && TitleRatio < 0.26 && CPerRatioNE >= 0.33 && CatLength >= 1.34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist >= 0.5 && SimhashDist >= 71.5 && TitleRatio >= 0.26 && EpochSpan < 72662 && CNUMLengthSP < 35.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist >= 0.5 && SimhashDist >= 71.5 && TitleRatio >= 0.26 && EpochSpan < 72662 && CNUMLengthSP >= 35.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist >= 0.5 && SimhashDist >= 71.5 && TitleRatio >= 0.26 && EpochSpan >= 72662 && EpochSpan < 234719.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && TitleDist >= 0.5 && SimhashDist >= 71.5 && TitleRatio >= 0.26 && EpochSpan >= 72662 && EpochSpan >= 234719.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio < 0.22 && CatRatio < 0.52 && TOrgLengthNE < 1.25 && COrgRatioNE < 0.56 && CPerRatioSP < 0.45) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio < 0.22 && CatRatio < 0.52 && TOrgLengthNE < 1.25 && COrgRatioNE < 0.56 && CPerRatioSP >= 0.45) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio < 0.22 && CatRatio < 0.52 && TOrgLengthNE < 1.25 && COrgRatioNE >= 0.56 && CNUMLengthSP < 28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio < 0.22 && CatRatio < 0.52 && TOrgLengthNE < 1.25 && COrgRatioNE >= 0.56 && CNUMLengthSP >= 28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio < 0.22 && CatRatio < 0.52 && TOrgLengthNE >= 1.25 && CTimLengthSP < 8.75 && ParagraphSpan < 6.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio < 0.22 && CatRatio < 0.52 && TOrgLengthNE >= 1.25 && CTimLengthSP < 8.75 && ParagraphSpan >= 6.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio < 0.22 && CatRatio < 0.52 && TOrgLengthNE >= 1.25 && CTimLengthSP >= 8.75 && COrgRatioNE < 0.68) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio < 0.22 && CatRatio < 0.52 && TOrgLengthNE >= 1.25 && CTimLengthSP >= 8.75 && COrgRatioNE >= 0.68) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio < 0.22 && CatRatio >= 0.52 && CPerRatioSP < 0.12 && TKWSLength < 2.75 && InsertSpan < 3259) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio < 0.22 && CatRatio >= 0.52 && CPerRatioSP < 0.12 && TKWSLength < 2.75 && InsertSpan >= 3259) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio < 0.22 && CatRatio >= 0.52 && CPerRatioSP < 0.12 && TKWSLength >= 2.75 && TitleDist < 60.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio < 0.22 && CatRatio >= 0.52 && CPerRatioSP < 0.12 && TKWSLength >= 2.75 && TitleDist >= 60.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio < 0.22 && CatRatio >= 0.52 && CPerRatioSP >= 0.12 && TKWSRatio < 0.72 && COrgLengthSP < 11.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio < 0.22 && CatRatio >= 0.52 && CPerRatioSP >= 0.12 && TKWSRatio < 0.72 && COrgLengthSP >= 11.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio < 0.22 && CatRatio >= 0.52 && CPerRatioSP >= 0.12 && TKWSRatio >= 0.72 && CPerRatioSP < 0.68) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio < 0.22 && CatRatio >= 0.52 && CPerRatioSP >= 0.12 && TKWSRatio >= 0.72 && CPerRatioSP >= 0.68) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio >= 0.22 && CKWSRatio < 0.38 && COrgRatioSP < 0.64 && CLocLengthSP < 14.25 && CPerRatioNE < 0.4) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio >= 0.22 && CKWSRatio < 0.38 && COrgRatioSP < 0.64 && CLocLengthSP < 14.25 && CPerRatioNE >= 0.4) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio >= 0.22 && CKWSRatio < 0.38 && COrgRatioSP < 0.64 && CLocLengthSP >= 14.25 && TKWSLength < 4.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio >= 0.22 && CKWSRatio < 0.38 && COrgRatioSP < 0.64 && CLocLengthSP >= 14.25 && TKWSLength >= 4.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio >= 0.22 && CKWSRatio < 0.38 && COrgRatioSP >= 0.64 && InsertSpan < 81415 && HKWSLength < 1.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio >= 0.22 && CKWSRatio < 0.38 && COrgRatioSP >= 0.64 && InsertSpan < 81415 && HKWSLength >= 1.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio >= 0.22 && CKWSRatio < 0.38 && COrgRatioSP >= 0.64 && InsertSpan >= 81415 && TKWSLength < 3.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio >= 0.22 && CKWSRatio < 0.38 && COrgRatioSP >= 0.64 && InsertSpan >= 81415 && TKWSLength >= 3.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio >= 0.22 && CKWSRatio >= 0.38 && SameSRC < 0.5 && EpochSpan < 96655.5 && TKWSRatio < 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio >= 0.22 && CKWSRatio >= 0.38 && SameSRC < 0.5 && EpochSpan < 96655.5 && TKWSRatio >= 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio >= 0.22 && CKWSRatio >= 0.38 && SameSRC < 0.5 && EpochSpan >= 96655.5 && EpochSpan < 457478) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio >= 0.22 && CKWSRatio >= 0.38 && SameSRC < 0.5 && EpochSpan >= 96655.5 && EpochSpan >= 457478) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio >= 0.22 && CKWSRatio >= 0.38 && SameSRC >= 0.5 && TitleRatio < 0.11 && CLocLengthNE < 8.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio >= 0.22 && CKWSRatio >= 0.38 && SameSRC >= 0.5 && TitleRatio < 0.11 && CLocLengthNE >= 8.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio >= 0.22 && CKWSRatio >= 0.38 && SameSRC >= 0.5 && TitleRatio >= 0.11 && TitleLength < 13.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio >= 0.22 && CKWSRatio >= 0.38 && SameSRC >= 0.5 && TitleRatio >= 0.11 && TitleLength >= 13.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP < 0.72 && COrgRatioSP < 0.41 && CPerRatioSP < 0.3 && TitleDist < 0.5 && ChannelRatio < 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP < 0.72 && COrgRatioSP < 0.41 && CPerRatioSP < 0.3 && TitleDist < 0.5 && ChannelRatio >= 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP < 0.72 && COrgRatioSP < 0.41 && CPerRatioSP < 0.3 && TitleDist >= 0.5 && InsertSpan < 83137.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP < 0.72 && COrgRatioSP < 0.41 && CPerRatioSP < 0.3 && TitleDist >= 0.5 && InsertSpan >= 83137.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP < 0.72 && COrgRatioSP < 0.41 && CPerRatioSP >= 0.3 && CKWSRatio < 0.42 && EpochSpan < 256071) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP < 0.72 && COrgRatioSP < 0.41 && CPerRatioSP >= 0.3 && CKWSRatio < 0.42 && EpochSpan >= 256071) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP < 0.72 && COrgRatioSP < 0.41 && CPerRatioSP >= 0.3 && CKWSRatio >= 0.42 && EpochSpan < 259110) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP < 0.72 && COrgRatioSP < 0.41 && CPerRatioSP >= 0.3 && CKWSRatio >= 0.42 && EpochSpan >= 259110) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP < 0.72 && COrgRatioSP >= 0.41 && TitleRatio < 0.38 && CNUMRatioSP < 0.53 && CKWSRatio < 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP < 0.72 && COrgRatioSP >= 0.41 && TitleRatio < 0.38 && CNUMRatioSP < 0.53 && CKWSRatio >= 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP < 0.72 && COrgRatioSP >= 0.41 && TitleRatio < 0.38 && CNUMRatioSP >= 0.53 && CNUMLengthSP < 13.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP < 0.72 && COrgRatioSP >= 0.41 && TitleRatio < 0.38 && CNUMRatioSP >= 0.53 && CNUMLengthSP >= 13.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP < 0.72 && COrgRatioSP >= 0.41 && TitleRatio >= 0.38 && CPerRatioSP < 0.48 && COrgLengthSP < 3.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP < 0.72 && COrgRatioSP >= 0.41 && TitleRatio >= 0.38 && CPerRatioSP < 0.48 && COrgLengthSP >= 3.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP < 0.72 && COrgRatioSP >= 0.41 && TitleRatio >= 0.38 && CPerRatioSP >= 0.48 && CKWSLength < 9.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP < 0.72 && COrgRatioSP >= 0.41 && TitleRatio >= 0.38 && CPerRatioSP >= 0.48 && CKWSLength >= 9.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP >= 0.72 && TKWSRatio < 0.91 && CPerRatioSP < 0.68 && EpochSpan < 73595.5 && COrgRatioSP < 0.34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP >= 0.72 && TKWSRatio < 0.91 && CPerRatioSP < 0.68 && EpochSpan < 73595.5 && COrgRatioSP >= 0.34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP >= 0.72 && TKWSRatio < 0.91 && CPerRatioSP < 0.68 && EpochSpan >= 73595.5 && TitleRatio < 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP >= 0.72 && TKWSRatio < 0.91 && CPerRatioSP < 0.68 && EpochSpan >= 73595.5 && TitleRatio >= 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP >= 0.72 && TKWSRatio < 0.91 && CPerRatioSP >= 0.68 && EpochSpan < 336036.5 && CPerLengthNE < 9.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP >= 0.72 && TKWSRatio < 0.91 && CPerRatioSP >= 0.68 && EpochSpan < 336036.5 && CPerLengthNE >= 9.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP >= 0.72 && TKWSRatio < 0.91 && CPerRatioSP >= 0.68 && EpochSpan >= 336036.5 && SimhashDist < 21.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP >= 0.72 && TKWSRatio < 0.91 && CPerRatioSP >= 0.68 && EpochSpan >= 336036.5 && SimhashDist >= 21.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP >= 0.72 && TKWSRatio >= 0.91 && EpochSpan < 70445 && TOrgLengthSP < 2.5 && COrgLengthNE < 4.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP >= 0.72 && TKWSRatio >= 0.91 && EpochSpan < 70445 && TOrgLengthSP < 2.5 && COrgLengthNE >= 4.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP >= 0.72 && TKWSRatio >= 0.91 && EpochSpan < 70445 && TOrgLengthSP >= 2.5 && TKWSLength < 10.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP >= 0.72 && TKWSRatio >= 0.91 && EpochSpan < 70445 && TOrgLengthSP >= 2.5 && TKWSLength >= 10.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP >= 0.72 && TKWSRatio >= 0.91 && EpochSpan >= 70445 && TKWSLength < 1.5 && EpochSpan < 81244.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP >= 0.72 && TKWSRatio >= 0.91 && EpochSpan >= 70445 && TKWSLength < 1.5 && EpochSpan >= 81244.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP >= 0.72 && TKWSRatio >= 0.91 && EpochSpan >= 70445 && TKWSLength >= 1.5 && SimhashDist < 20) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && CNUMRatioSP >= 0.72 && TKWSRatio >= 0.91 && EpochSpan >= 70445 && TKWSLength >= 1.5 && SimhashDist >= 20) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio < 0.5 && EpochSpan < 13723.5 && TitleRatio < 0.17 && COrgRatioNE < 0.14 && CKWSRatio < 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio < 0.5 && EpochSpan < 13723.5 && TitleRatio < 0.17 && COrgRatioNE < 0.14 && CKWSRatio >= 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio < 0.5 && EpochSpan < 13723.5 && TitleRatio < 0.17 && COrgRatioNE >= 0.14 && CLocLengthSP < 11.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio < 0.5 && EpochSpan < 13723.5 && TitleRatio < 0.17 && COrgRatioNE >= 0.14 && CLocLengthSP >= 11.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio < 0.5 && EpochSpan < 13723.5 && TitleRatio >= 0.17 && CKWSRatio < 0.17) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio < 0.5 && EpochSpan < 13723.5 && TitleRatio >= 0.17 && CKWSRatio >= 0.17 && ChannelRatio < 0.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio < 0.5 && EpochSpan < 13723.5 && TitleRatio >= 0.17 && CKWSRatio >= 0.17 && ChannelRatio >= 0.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio < 0.5 && EpochSpan >= 13723.5 && CPerRatioNE < 0.21 && CKWSRatio < 0.21 && COrgLengthNE < 5.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio < 0.5 && EpochSpan >= 13723.5 && CPerRatioNE < 0.21 && CKWSRatio < 0.21 && COrgLengthNE >= 5.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio < 0.5 && EpochSpan >= 13723.5 && CPerRatioNE < 0.21 && CKWSRatio >= 0.21 && CTimRatioSP < 0.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio < 0.5 && EpochSpan >= 13723.5 && CPerRatioNE < 0.21 && CKWSRatio >= 0.21 && CTimRatioSP >= 0.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio < 0.5 && EpochSpan >= 13723.5 && CPerRatioNE >= 0.21 && CKWSRatio < 0.32 && CWordSpan < 2035) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio < 0.5 && EpochSpan >= 13723.5 && CPerRatioNE >= 0.21 && CKWSRatio < 0.32 && CWordSpan >= 2035) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio < 0.5 && EpochSpan >= 13723.5 && CPerRatioNE >= 0.21 && CKWSRatio >= 0.32 && ChannelRatio < 0.71) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio < 0.5 && EpochSpan >= 13723.5 && CPerRatioNE >= 0.21 && CKWSRatio >= 0.32 && ChannelRatio >= 0.71) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio >= 0.5 && CPerRatioSP < 0.34 && TitleRatio < 0.1 && CKWSRatio < 0.25 && TPerRatioSP < 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio >= 0.5 && CPerRatioSP < 0.34 && TitleRatio < 0.1 && CKWSRatio < 0.25 && TPerRatioSP >= 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio >= 0.5 && CPerRatioSP < 0.34 && TitleRatio < 0.1 && CKWSRatio >= 0.25 && EpochSpan < 68516) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio >= 0.5 && CPerRatioSP < 0.34 && TitleRatio < 0.1 && CKWSRatio >= 0.25 && EpochSpan >= 68516) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio >= 0.5 && CPerRatioSP < 0.34 && TitleRatio >= 0.1 && EpochSpan < 26131.5 && SimhashDist < 74.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio >= 0.5 && CPerRatioSP < 0.34 && TitleRatio >= 0.1 && EpochSpan < 26131.5 && SimhashDist >= 74.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio >= 0.5 && CPerRatioSP < 0.34 && TitleRatio >= 0.1 && EpochSpan >= 26131.5 && COrgRatioNE < 0.6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio >= 0.5 && CPerRatioSP < 0.34 && TitleRatio >= 0.1 && EpochSpan >= 26131.5 && COrgRatioNE >= 0.6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio >= 0.5 && CPerRatioSP >= 0.34 && SimhashDist < 61.5 && TitleDist < 34.5 && CPerLengthSP < 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio >= 0.5 && CPerRatioSP >= 0.34 && SimhashDist < 61.5 && TitleDist < 34.5 && CPerLengthSP >= 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio >= 0.5 && CPerRatioSP >= 0.34 && SimhashDist < 61.5 && TitleDist >= 34.5 && InsertSpan < 226772) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio >= 0.5 && CPerRatioSP >= 0.34 && SimhashDist < 61.5 && TitleDist >= 34.5 && InsertSpan >= 226772) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio >= 0.5 && CPerRatioSP >= 0.34 && SimhashDist >= 61.5 && TitleRatio < 0.23 && CLocRatioNE < 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio >= 0.5 && CPerRatioSP >= 0.34 && SimhashDist >= 61.5 && TitleRatio < 0.23 && CLocRatioNE >= 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio >= 0.5 && CPerRatioSP >= 0.34 && SimhashDist >= 61.5 && TitleRatio >= 0.23 && EpochSpan < 105073) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio >= 0.5 && CPerRatioSP >= 0.34 && SimhashDist >= 61.5 && TitleRatio >= 0.23 && EpochSpan >= 105073) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio < 0.93 && TitleRatio < 0.38 && InsertSpan < 110708.5 && CLocRatioSP < 0.47 && CPerRatioNE < 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio < 0.93 && TitleRatio < 0.38 && InsertSpan < 110708.5 && CLocRatioSP < 0.47 && CPerRatioNE >= 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio < 0.93 && TitleRatio < 0.38 && InsertSpan < 110708.5 && CLocRatioSP >= 0.47 && CKWSRatio < 0.36) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio < 0.93 && TitleRatio < 0.38 && InsertSpan < 110708.5 && CLocRatioSP >= 0.47 && CKWSRatio >= 0.36) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio < 0.93 && TitleRatio < 0.38 && InsertSpan >= 110708.5 && CNUMRatioSP < 0.42 && CPerRatioNE < 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio < 0.93 && TitleRatio < 0.38 && InsertSpan >= 110708.5 && CNUMRatioSP < 0.42 && CPerRatioNE >= 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio < 0.93 && TitleRatio < 0.38 && InsertSpan >= 110708.5 && CNUMRatioSP >= 0.42 && EpochSpan < 226141) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio < 0.93 && TitleRatio < 0.38 && InsertSpan >= 110708.5 && CNUMRatioSP >= 0.42 && EpochSpan >= 226141) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio < 0.93 && TitleRatio >= 0.38 && EpochSpan < 255212 && CPerRatioSP < 0.31 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio < 0.93 && TitleRatio >= 0.38 && EpochSpan < 255212 && CPerRatioSP < 0.31 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio < 0.93 && TitleRatio >= 0.38 && EpochSpan < 255212 && CPerRatioSP >= 0.31 && CKWSLength < 9.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio < 0.93 && TitleRatio >= 0.38 && EpochSpan < 255212 && CPerRatioSP >= 0.31 && CKWSLength >= 9.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio < 0.93 && TitleRatio >= 0.38 && EpochSpan >= 255212 && CNUMRatioSP < 0.72 && CPerRatioSP < 0.58) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio < 0.93 && TitleRatio >= 0.38 && EpochSpan >= 255212 && CNUMRatioSP < 0.72 && CPerRatioSP >= 0.58) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio < 0.93 && TitleRatio >= 0.38 && EpochSpan >= 255212 && CNUMRatioSP >= 0.72 && CPerRatioSP < 0.43) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio < 0.93 && TitleRatio >= 0.38 && EpochSpan >= 255212 && CNUMRatioSP >= 0.72 && CPerRatioSP >= 0.43) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio >= 0.93 && InsertSpan < 86316.5 && CPerRatioSP < 0.86 && SameSRC < 0.5 && CatRatio < 0.77) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio >= 0.93 && InsertSpan < 86316.5 && CPerRatioSP < 0.86 && SameSRC < 0.5 && CatRatio >= 0.77) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio >= 0.93 && InsertSpan < 86316.5 && CPerRatioSP < 0.86 && SameSRC >= 0.5 && InsertSpan < 25370) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio >= 0.93 && InsertSpan < 86316.5 && CPerRatioSP < 0.86 && SameSRC >= 0.5 && InsertSpan >= 25370) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio >= 0.93 && InsertSpan < 86316.5 && CPerRatioSP >= 0.86 && CWordSpan < 1.5 && CTimRatioSP < 0.91) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio >= 0.93 && InsertSpan < 86316.5 && CPerRatioSP >= 0.86 && CWordSpan < 1.5 && CTimRatioSP >= 0.91) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio >= 0.93 && InsertSpan < 86316.5 && CPerRatioSP >= 0.86 && CWordSpan >= 1.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio >= 0.93 && InsertSpan >= 86316.5 && COrgRatioNE < 0.54 && CWordSpan < 1.5 && EpochSpan < 603005.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio >= 0.93 && InsertSpan >= 86316.5 && COrgRatioNE < 0.54 && CWordSpan < 1.5 && EpochSpan >= 603005.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio >= 0.93 && InsertSpan >= 86316.5 && COrgRatioNE < 0.54 && CWordSpan >= 1.5 && EpochSpan < 85281.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio >= 0.93 && InsertSpan >= 86316.5 && COrgRatioNE < 0.54 && CWordSpan >= 1.5 && EpochSpan >= 85281.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio >= 0.93 && InsertSpan >= 86316.5 && COrgRatioNE >= 0.54 && EpochSpan < 223159.5 && CNUMRatioSP < 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio >= 0.93 && InsertSpan >= 86316.5 && COrgRatioNE >= 0.54 && EpochSpan < 223159.5 && CNUMRatioSP >= 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio >= 0.93 && InsertSpan >= 86316.5 && COrgRatioNE >= 0.54 && EpochSpan >= 223159.5 && CatLength < 0.91) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && TitleRatio >= 0.93 && InsertSpan >= 86316.5 && COrgRatioNE >= 0.54 && EpochSpan >= 223159.5 && CatLength >= 0.91) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio < 0.33 && HKWSRatio < 0.32 && CKWSRatio < 0.2 && SimhashDist < 65.5 && EpochSpan < 10707) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio < 0.33 && HKWSRatio < 0.32 && CKWSRatio < 0.2 && SimhashDist < 65.5 && EpochSpan >= 10707) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio < 0.33 && HKWSRatio < 0.32 && CKWSRatio < 0.2 && SimhashDist >= 65.5 && COrgRatioNE < 0.14) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio < 0.33 && HKWSRatio < 0.32 && CKWSRatio < 0.2 && SimhashDist >= 65.5 && COrgRatioNE >= 0.14) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio < 0.33 && HKWSRatio < 0.32 && CKWSRatio >= 0.2 && SimhashDist < 61.5 && EpochSpan < 161899.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio < 0.33 && HKWSRatio < 0.32 && CKWSRatio >= 0.2 && SimhashDist < 61.5 && EpochSpan >= 161899.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio < 0.33 && HKWSRatio < 0.32 && CKWSRatio >= 0.2 && SimhashDist >= 61.5 && CKWSRatio < 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio < 0.33 && HKWSRatio < 0.32 && CKWSRatio >= 0.2 && SimhashDist >= 61.5 && CKWSRatio >= 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio < 0.33 && HKWSRatio >= 0.32 && CKWSRatio < 0.25 && CTimRatioSP < 0.3 && CPerLengthSP < 30) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio < 0.33 && HKWSRatio >= 0.32 && CKWSRatio < 0.25 && CTimRatioSP < 0.3 && CPerLengthSP >= 30) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio < 0.33 && HKWSRatio >= 0.32 && CKWSRatio < 0.25 && CTimRatioSP >= 0.3 && SimhashDist < 38.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio < 0.33 && HKWSRatio >= 0.32 && CKWSRatio < 0.25 && CTimRatioSP >= 0.3 && SimhashDist >= 38.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio < 0.33 && HKWSRatio >= 0.32 && CKWSRatio >= 0.25 && CKWSRatio < 0.35 && COrgRatioNE < 0.67) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio < 0.33 && HKWSRatio >= 0.32 && CKWSRatio >= 0.25 && CKWSRatio < 0.35 && COrgRatioNE >= 0.67) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio < 0.33 && HKWSRatio >= 0.32 && CKWSRatio >= 0.25 && CKWSRatio >= 0.35 && CPerRatioNE < 0.67) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio < 0.33 && HKWSRatio >= 0.32 && CKWSRatio >= 0.25 && CKWSRatio >= 0.35 && CPerRatioNE >= 0.67) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio >= 0.33 && TitleRatio < 0.31 && TitleRatio < 0.19 && CNUMRatioSP < 0.27 && CTimLengthSP < 7.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio >= 0.33 && TitleRatio < 0.31 && TitleRatio < 0.19 && CNUMRatioSP < 0.27 && CTimLengthSP >= 7.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio >= 0.33 && TitleRatio < 0.31 && TitleRatio < 0.19 && CNUMRatioSP >= 0.27 && CPerRatioNE < 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio >= 0.33 && TitleRatio < 0.31 && TitleRatio < 0.19 && CNUMRatioSP >= 0.27 && CPerRatioNE >= 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio >= 0.33 && TitleRatio < 0.31 && TitleRatio >= 0.19 && COrgRatioSP < 0.49 && CLocRatioSP < 0.7) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio >= 0.33 && TitleRatio < 0.31 && TitleRatio >= 0.19 && COrgRatioSP < 0.49 && CLocRatioSP >= 0.7) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio >= 0.33 && TitleRatio < 0.31 && TitleRatio >= 0.19 && COrgRatioSP >= 0.49 && EpochSpan < 270728) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio >= 0.33 && TitleRatio < 0.31 && TitleRatio >= 0.19 && COrgRatioSP >= 0.49 && EpochSpan >= 270728) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio >= 0.33 && TitleRatio >= 0.31 && SimhashDist < 64.5 && SameSRC < 0.5 && EpochSpan < 85059) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio >= 0.33 && TitleRatio >= 0.31 && SimhashDist < 64.5 && SameSRC < 0.5 && EpochSpan >= 85059) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio >= 0.33 && TitleRatio >= 0.31 && SimhashDist < 64.5 && SameSRC >= 0.5 && COrgRatioNE < 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio >= 0.33 && TitleRatio >= 0.31 && SimhashDist < 64.5 && SameSRC >= 0.5 && COrgRatioNE >= 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio >= 0.33 && TitleRatio >= 0.31 && SimhashDist >= 64.5 && CatRatio < 0.56 && InsertSpan < 109770) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio >= 0.33 && TitleRatio >= 0.31 && SimhashDist >= 64.5 && CatRatio < 0.56 && InsertSpan >= 109770) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio >= 0.33 && TitleRatio >= 0.31 && SimhashDist >= 64.5 && CatRatio >= 0.56 && CLocRatioSP < 0.59) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio >= 0.33 && TitleRatio >= 0.31 && SimhashDist >= 64.5 && CatRatio >= 0.56 && CLocRatioSP >= 0.59) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP < 0.62 && TitleRatio < 0.26 && EpochSpan < 80232 && CPerRatioNE < 0.45 && SimhashDist < 74.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP < 0.62 && TitleRatio < 0.26 && EpochSpan < 80232 && CPerRatioNE < 0.45 && SimhashDist >= 74.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP < 0.62 && TitleRatio < 0.26 && EpochSpan < 80232 && CPerRatioNE >= 0.45 && CLocRatioSP < 0.44) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP < 0.62 && TitleRatio < 0.26 && EpochSpan < 80232 && CPerRatioNE >= 0.45 && CLocRatioSP >= 0.44) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP < 0.62 && TitleRatio < 0.26 && EpochSpan >= 80232 && CLocLengthNE < 14.25 && CKWSRatio < 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP < 0.62 && TitleRatio < 0.26 && EpochSpan >= 80232 && CLocLengthNE < 14.25 && CKWSRatio >= 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP < 0.62 && TitleRatio < 0.26 && EpochSpan >= 80232 && CLocLengthNE >= 14.25 && COrgRatioSP < 0.11) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP < 0.62 && TitleRatio < 0.26 && EpochSpan >= 80232 && CLocLengthNE >= 14.25 && COrgRatioSP >= 0.11) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP < 0.62 && TitleRatio >= 0.26 && InsertSpan < 129420 && CLocRatioSP < 0.54 && TKWSRatio < 0.58) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP < 0.62 && TitleRatio >= 0.26 && InsertSpan < 129420 && CLocRatioSP < 0.54 && TKWSRatio >= 0.58) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP < 0.62 && TitleRatio >= 0.26 && InsertSpan < 129420 && CLocRatioSP >= 0.54 && EpochSpan < 73835.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP < 0.62 && TitleRatio >= 0.26 && InsertSpan < 129420 && CLocRatioSP >= 0.54 && EpochSpan >= 73835.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP < 0.62 && TitleRatio >= 0.26 && InsertSpan >= 129420 && CKWSRatio < 0.46 && COrgRatioSP < 0.6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP < 0.62 && TitleRatio >= 0.26 && InsertSpan >= 129420 && CKWSRatio < 0.46 && COrgRatioSP >= 0.6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP < 0.62 && TitleRatio >= 0.26 && InsertSpan >= 129420 && CKWSRatio >= 0.46 && TitleLength < 13.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP < 0.62 && TitleRatio >= 0.26 && InsertSpan >= 129420 && CKWSRatio >= 0.46 && TitleLength >= 13.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP >= 0.62 && CNUMRatioSP < 0.75 && InsertSpan < 270375.5 && EpochSpan < 250887.5 && SimhashDist < 67.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP >= 0.62 && CNUMRatioSP < 0.75 && InsertSpan < 270375.5 && EpochSpan < 250887.5 && SimhashDist >= 67.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP >= 0.62 && CNUMRatioSP < 0.75 && InsertSpan < 270375.5 && EpochSpan >= 250887.5 && CatRatio < 0.78) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP >= 0.62 && CNUMRatioSP < 0.75 && InsertSpan < 270375.5 && EpochSpan >= 250887.5 && CatRatio >= 0.78) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP >= 0.62 && CNUMRatioSP < 0.75 && InsertSpan >= 270375.5 && SimhashDist < 69.5 && ParagraphSpan < 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP >= 0.62 && CNUMRatioSP < 0.75 && InsertSpan >= 270375.5 && SimhashDist < 69.5 && ParagraphSpan >= 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP >= 0.62 && CNUMRatioSP < 0.75 && InsertSpan >= 270375.5 && SimhashDist >= 69.5 && COrgLengthNE < 2.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP >= 0.62 && CNUMRatioSP < 0.75 && InsertSpan >= 270375.5 && SimhashDist >= 69.5 && COrgLengthNE >= 2.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP >= 0.62 && CNUMRatioSP >= 0.75 && TitleRatio < 0.9 && CLocLengthNE < 1.25 && TitleLength < 7.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP >= 0.62 && CNUMRatioSP >= 0.75 && TitleRatio < 0.9 && CLocLengthNE < 1.25 && TitleLength >= 7.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP >= 0.62 && CNUMRatioSP >= 0.75 && TitleRatio < 0.9 && CLocLengthNE >= 1.25 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP >= 0.62 && CNUMRatioSP >= 0.75 && TitleRatio < 0.9 && CLocLengthNE >= 1.25 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP >= 0.62 && CNUMRatioSP >= 0.75 && TitleRatio >= 0.9 && EpochSpan < 20893.5 && CNUMRatioSP < 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP >= 0.62 && CNUMRatioSP >= 0.75 && TitleRatio >= 0.9 && EpochSpan < 20893.5 && CNUMRatioSP >= 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP >= 0.62 && CNUMRatioSP >= 0.75 && TitleRatio >= 0.9 && EpochSpan >= 20893.5 && CKWSRatio < 0.96) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && CPerRatioSP >= 0.62 && CNUMRatioSP >= 0.75 && TitleRatio >= 0.9 && EpochSpan >= 20893.5 && CKWSRatio >= 0.96) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP < 0.29 && TKWSRatio < 0.33 && CPerRatioSP < 0.35 && COrgRatioNE < 0.09 && CatRatio < 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP < 0.29 && TKWSRatio < 0.33 && CPerRatioSP < 0.35 && COrgRatioNE < 0.09 && CatRatio >= 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP < 0.29 && TKWSRatio < 0.33 && CPerRatioSP < 0.35 && COrgRatioNE >= 0.09 && CTimRatioSP < 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP < 0.29 && TKWSRatio < 0.33 && CPerRatioSP < 0.35 && COrgRatioNE >= 0.09 && CTimRatioSP >= 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP < 0.29 && TKWSRatio < 0.33 && CPerRatioSP >= 0.35 && CKWSRatio < 0.24 && CLocRatioSP < 0.36) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP < 0.29 && TKWSRatio < 0.33 && CPerRatioSP >= 0.35 && CKWSRatio < 0.24 && CLocRatioSP >= 0.36) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP < 0.29 && TKWSRatio < 0.33 && CPerRatioSP >= 0.35 && CKWSRatio >= 0.24 && EpochSpan < 154975.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP < 0.29 && TKWSRatio < 0.33 && CPerRatioSP >= 0.35 && CKWSRatio >= 0.24 && EpochSpan >= 154975.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP < 0.29 && TKWSRatio >= 0.33 && EpochSpan < 87988.5 && CPerRatioSP < 0.43 && HKWSRatio < 0.27) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP < 0.29 && TKWSRatio >= 0.33 && EpochSpan < 87988.5 && CPerRatioSP < 0.43 && HKWSRatio >= 0.27) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP < 0.29 && TKWSRatio >= 0.33 && EpochSpan < 87988.5 && CPerRatioSP >= 0.43 && TitleDist < 47.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP < 0.29 && TKWSRatio >= 0.33 && EpochSpan < 87988.5 && CPerRatioSP >= 0.43 && TitleDist >= 47.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP < 0.29 && TKWSRatio >= 0.33 && EpochSpan >= 87988.5 && CatRatio < 0.2 && CPerLengthNE < 5.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP < 0.29 && TKWSRatio >= 0.33 && EpochSpan >= 87988.5 && CatRatio < 0.2 && CPerLengthNE >= 5.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP < 0.29 && TKWSRatio >= 0.33 && EpochSpan >= 87988.5 && CatRatio >= 0.2 && CPerRatioNE < 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP < 0.29 && TKWSRatio >= 0.33 && EpochSpan >= 87988.5 && CatRatio >= 0.2 && CPerRatioNE >= 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP >= 0.29 && TKWSRatio < 0.38 && SimhashDist < 68.5 && CKWSRatio < 0.22 && CTimLengthSP < 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP >= 0.29 && TKWSRatio < 0.38 && SimhashDist < 68.5 && CKWSRatio < 0.22 && CTimLengthSP >= 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP >= 0.29 && TKWSRatio < 0.38 && SimhashDist < 68.5 && CKWSRatio >= 0.22 && CNUMLengthSP < 9.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP >= 0.29 && TKWSRatio < 0.38 && SimhashDist < 68.5 && CKWSRatio >= 0.22 && CNUMLengthSP >= 9.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP >= 0.29 && TKWSRatio < 0.38 && SimhashDist >= 68.5 && CKWSRatio < 0.25 && CPerRatioNE < 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP >= 0.29 && TKWSRatio < 0.38 && SimhashDist >= 68.5 && CKWSRatio < 0.25 && CPerRatioNE >= 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP >= 0.29 && TKWSRatio < 0.38 && SimhashDist >= 68.5 && CKWSRatio >= 0.25 && InsertSpan < 56725) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP >= 0.29 && TKWSRatio < 0.38 && SimhashDist >= 68.5 && CKWSRatio >= 0.25 && InsertSpan >= 56725) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP >= 0.29 && TKWSRatio >= 0.38 && InsertSpan < 143125.5 && TitleLength < 5.25 && CPerLengthNE < 26.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP >= 0.29 && TKWSRatio >= 0.38 && InsertSpan < 143125.5 && TitleLength < 5.25 && CPerLengthNE >= 26.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP >= 0.29 && TKWSRatio >= 0.38 && InsertSpan < 143125.5 && TitleLength >= 5.25 && TKWSRatio < 0.64) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP >= 0.29 && TKWSRatio >= 0.38 && InsertSpan < 143125.5 && TitleLength >= 5.25 && TKWSRatio >= 0.64) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP >= 0.29 && TKWSRatio >= 0.38 && InsertSpan >= 143125.5 && CNUMLengthSP < 13.75 && CLocRatioNE < 0.6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP >= 0.29 && TKWSRatio >= 0.38 && InsertSpan >= 143125.5 && CNUMLengthSP < 13.75 && CLocRatioNE >= 0.6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP >= 0.29 && TKWSRatio >= 0.38 && InsertSpan >= 143125.5 && CNUMLengthSP >= 13.75 && CTimRatioSP < 0.64) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP >= 0.29 && TKWSRatio >= 0.38 && InsertSpan >= 143125.5 && CNUMLengthSP >= 13.75 && CTimRatioSP >= 0.64) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist < 0.5 && SimhashDist < 29.5 && TitleLength < 6.5 && COrgLengthSP < 4.25 && CNUMRatioSP < 0.59) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist < 0.5 && SimhashDist < 29.5 && TitleLength < 6.5 && COrgLengthSP < 4.25 && CNUMRatioSP >= 0.59) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist < 0.5 && SimhashDist < 29.5 && TitleLength < 6.5 && COrgLengthSP >= 4.25 && COrgRatioSP < 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist < 0.5 && SimhashDist < 29.5 && TitleLength < 6.5 && COrgLengthSP >= 4.25 && COrgRatioSP >= 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist < 0.5 && SimhashDist < 29.5 && TitleLength >= 6.5 && COrgLengthSP < 29.5 && EpochSpan < 19574) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist < 0.5 && SimhashDist < 29.5 && TitleLength >= 6.5 && COrgLengthSP < 29.5 && EpochSpan >= 19574) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist < 0.5 && SimhashDist < 29.5 && TitleLength >= 6.5 && COrgLengthSP >= 29.5 && CPerRatioNE < 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist < 0.5 && SimhashDist < 29.5 && TitleLength >= 6.5 && COrgLengthSP >= 29.5 && CPerRatioNE >= 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist < 0.5 && SimhashDist >= 29.5 && TitleLength < 6.5 && COrgLengthNE < 4.75 && EpochSpan < 48277) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist < 0.5 && SimhashDist >= 29.5 && TitleLength < 6.5 && COrgLengthNE < 4.75 && EpochSpan >= 48277) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist < 0.5 && SimhashDist >= 29.5 && TitleLength < 6.5 && COrgLengthNE >= 4.75 && CKWSRatio < 0.43) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist < 0.5 && SimhashDist >= 29.5 && TitleLength < 6.5 && COrgLengthNE >= 4.75 && CKWSRatio >= 0.43) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist < 0.5 && SimhashDist >= 29.5 && TitleLength >= 6.5 && InsertSpan < 59109.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist < 0.5 && SimhashDist >= 29.5 && TitleLength >= 6.5 && InsertSpan >= 59109.5 && ChannelLength < 4.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist < 0.5 && SimhashDist >= 29.5 && TitleLength >= 6.5 && InsertSpan >= 59109.5 && ChannelLength >= 4.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist >= 0.5 && CPerRatioSP < 0.52 && TitleRatio < 0.19 && CPerLengthSP < 5.75 && CTimRatioSP < 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist >= 0.5 && CPerRatioSP < 0.52 && TitleRatio < 0.19 && CPerLengthSP < 5.75 && CTimRatioSP >= 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist >= 0.5 && CPerRatioSP < 0.52 && TitleRatio < 0.19 && CPerLengthSP >= 5.75 && CLocLengthSP < 15.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist >= 0.5 && CPerRatioSP < 0.52 && TitleRatio < 0.19 && CPerLengthSP >= 5.75 && CLocLengthSP >= 15.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist >= 0.5 && CPerRatioSP < 0.52 && TitleRatio >= 0.19 && CPerRatioSP < 0.22 && COrgRatioSP < 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist >= 0.5 && CPerRatioSP < 0.52 && TitleRatio >= 0.19 && CPerRatioSP < 0.22 && COrgRatioSP >= 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist >= 0.5 && CPerRatioSP < 0.52 && TitleRatio >= 0.19 && CPerRatioSP >= 0.22 && InsertSpan < 139220) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist >= 0.5 && CPerRatioSP < 0.52 && TitleRatio >= 0.19 && CPerRatioSP >= 0.22 && InsertSpan >= 139220) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist >= 0.5 && CPerRatioSP >= 0.52 && InsertSpan < 284335 && SameSRC < 0.5 && TPerRatioNE < 0.79) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist >= 0.5 && CPerRatioSP >= 0.52 && InsertSpan < 284335 && SameSRC < 0.5 && TPerRatioNE >= 0.79) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist >= 0.5 && CPerRatioSP >= 0.52 && InsertSpan < 284335 && SameSRC >= 0.5 && COrgRatioSP < 0.77) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist >= 0.5 && CPerRatioSP >= 0.52 && InsertSpan < 284335 && SameSRC >= 0.5 && COrgRatioSP >= 0.77) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist >= 0.5 && CPerRatioSP >= 0.52 && InsertSpan >= 284335 && TitleRatio < 0.87 && CLocLengthSP < 9.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist >= 0.5 && CPerRatioSP >= 0.52 && InsertSpan >= 284335 && TitleRatio < 0.87 && CLocLengthSP >= 9.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist >= 0.5 && CPerRatioSP >= 0.52 && InsertSpan >= 284335 && TitleRatio >= 0.87 && CLocLengthSP < 28.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist >= 0.5 && CPerRatioSP >= 0.52 && InsertSpan >= 284335 && TitleRatio >= 0.87 && CLocLengthSP >= 28.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio < 0.8 && CKWSRatio < 0.36 && CKWSRatio < 0.16 && COrgLengthNE < 11.25 && CLocRatioNE < 0.65) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio < 0.8 && CKWSRatio < 0.36 && CKWSRatio < 0.16 && COrgLengthNE < 11.25 && CLocRatioNE >= 0.65) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio < 0.8 && CKWSRatio < 0.36 && CKWSRatio < 0.16 && COrgLengthNE >= 11.25 && CLocRatioNE < 0.71) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio < 0.8 && CKWSRatio < 0.36 && CKWSRatio < 0.16 && COrgLengthNE >= 11.25 && CLocRatioNE >= 0.71) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio < 0.8 && CKWSRatio < 0.36 && CKWSRatio >= 0.16 && EpochSpan < 256014 && TitleRatio < 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio < 0.8 && CKWSRatio < 0.36 && CKWSRatio >= 0.16 && EpochSpan < 256014 && TitleRatio >= 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio < 0.8 && CKWSRatio < 0.36 && CKWSRatio >= 0.16 && EpochSpan >= 256014 && CLocLengthNE < 8.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio < 0.8 && CKWSRatio < 0.36 && CKWSRatio >= 0.16 && EpochSpan >= 256014 && CLocLengthNE >= 8.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio < 0.8 && CKWSRatio >= 0.36 && CNUMRatioSP < 0.53 && CPerRatioNE < 0.55 && TitleRatio < 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio < 0.8 && CKWSRatio >= 0.36 && CNUMRatioSP < 0.53 && CPerRatioNE < 0.55 && TitleRatio >= 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio < 0.8 && CKWSRatio >= 0.36 && CNUMRatioSP < 0.53 && CPerRatioNE >= 0.55 && TitleRatio < 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio < 0.8 && CKWSRatio >= 0.36 && CNUMRatioSP < 0.53 && CPerRatioNE >= 0.55 && TitleRatio >= 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio < 0.8 && CKWSRatio >= 0.36 && CNUMRatioSP >= 0.53 && CLocRatioNE < 0.86 && InsertSpan < 436982.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio < 0.8 && CKWSRatio >= 0.36 && CNUMRatioSP >= 0.53 && CLocRatioNE < 0.86 && InsertSpan >= 436982.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio < 0.8 && CKWSRatio >= 0.36 && CNUMRatioSP >= 0.53 && CLocRatioNE >= 0.86 && TitleRatio < 0.55) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio < 0.8 && CKWSRatio >= 0.36 && CNUMRatioSP >= 0.53 && CLocRatioNE >= 0.86 && TitleRatio >= 0.55) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio >= 0.8 && CNUMRatioSP < 0.74 && CPerRatioNE < 0.24 && TOrgRatioSP < 0.55 && TitleRatio < 0.17) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio >= 0.8 && CNUMRatioSP < 0.74 && CPerRatioNE < 0.24 && TOrgRatioSP < 0.55 && TitleRatio >= 0.17) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio >= 0.8 && CNUMRatioSP < 0.74 && CPerRatioNE < 0.24 && TOrgRatioSP >= 0.55 && EpochSpan < 86393) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio >= 0.8 && CNUMRatioSP < 0.74 && CPerRatioNE < 0.24 && TOrgRatioSP >= 0.55 && EpochSpan >= 86393) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio >= 0.8 && CNUMRatioSP < 0.74 && CPerRatioNE >= 0.24 && InsertSpan < 256392.5 && TitleRatio < 0.34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio >= 0.8 && CNUMRatioSP < 0.74 && CPerRatioNE >= 0.24 && InsertSpan < 256392.5 && TitleRatio >= 0.34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio >= 0.8 && CNUMRatioSP < 0.74 && CPerRatioNE >= 0.24 && InsertSpan >= 256392.5 && CNUMLengthSP < 15.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio >= 0.8 && CNUMRatioSP < 0.74 && CPerRatioNE >= 0.24 && InsertSpan >= 256392.5 && CNUMLengthSP >= 15.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio >= 0.8 && CNUMRatioSP >= 0.74 && CKWSRatio < 0.96 && SameSRC < 0.5 && EpochSpan < 256035) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio >= 0.8 && CNUMRatioSP >= 0.74 && CKWSRatio < 0.96 && SameSRC < 0.5 && EpochSpan >= 256035) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio >= 0.8 && CNUMRatioSP >= 0.74 && CKWSRatio < 0.96 && SameSRC >= 0.5 && GeoLength < 3.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio >= 0.8 && CNUMRatioSP >= 0.74 && CKWSRatio < 0.96 && SameSRC >= 0.5 && GeoLength >= 3.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio >= 0.8 && CNUMRatioSP >= 0.74 && CKWSRatio >= 0.96 && TitleRatio < 0.89 && COrgRatioSP < 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio >= 0.8 && CNUMRatioSP >= 0.74 && CKWSRatio >= 0.96 && TitleRatio < 0.89 && COrgRatioSP >= 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio >= 0.8 && CNUMRatioSP >= 0.74 && CKWSRatio >= 0.96 && TitleRatio >= 0.89 && TitleLength < 3.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio >= 0.8 && CNUMRatioSP >= 0.74 && CKWSRatio >= 0.96 && TitleRatio >= 0.89 && TitleLength >= 3.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio < 0.34 && TitleRatio < 0.11 && COrgRatioNE < 0.09 && CatRatio < 0.75 && CLocRatioNE < 0.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio < 0.34 && TitleRatio < 0.11 && COrgRatioNE < 0.09 && CatRatio < 0.75 && CLocRatioNE >= 0.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio < 0.34 && TitleRatio < 0.11 && COrgRatioNE < 0.09 && CatRatio >= 0.75 && CKWSRatio < 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio < 0.34 && TitleRatio < 0.11 && COrgRatioNE < 0.09 && CatRatio >= 0.75 && CKWSRatio >= 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio < 0.34 && TitleRatio < 0.11 && COrgRatioNE >= 0.09 && CPerRatioSP < 0.34 && CPerRatioNE < 0.55) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio < 0.34 && TitleRatio < 0.11 && COrgRatioNE >= 0.09 && CPerRatioSP < 0.34 && CPerRatioNE >= 0.55) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio < 0.34 && TitleRatio < 0.11 && COrgRatioNE >= 0.09 && CPerRatioSP >= 0.34 && CLocLengthSP < 9.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio < 0.34 && TitleRatio < 0.11 && COrgRatioNE >= 0.09 && CPerRatioSP >= 0.34 && CLocLengthSP >= 9.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio < 0.34 && TitleRatio >= 0.11 && CPerRatioSP < 0.42 && COrgRatioSP < 0.41 && InsertSpan < 82012.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio < 0.34 && TitleRatio >= 0.11 && CPerRatioSP < 0.42 && COrgRatioSP < 0.41 && InsertSpan >= 82012.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio < 0.34 && TitleRatio >= 0.11 && CPerRatioSP < 0.42 && COrgRatioSP >= 0.41 && CatLength < 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio < 0.34 && TitleRatio >= 0.11 && CPerRatioSP < 0.42 && COrgRatioSP >= 0.41 && CatLength >= 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio < 0.34 && TitleRatio >= 0.11 && CPerRatioSP >= 0.42 && CKWSRatio < 0.52 && CPerLengthSP < 11.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio < 0.34 && TitleRatio >= 0.11 && CPerRatioSP >= 0.42 && CKWSRatio < 0.52 && CPerLengthSP >= 11.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio < 0.34 && TitleRatio >= 0.11 && CPerRatioSP >= 0.42 && CKWSRatio >= 0.52 && CWordSpan < 16.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio < 0.34 && TitleRatio >= 0.11 && CPerRatioSP >= 0.42 && CKWSRatio >= 0.52 && CWordSpan >= 16.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio >= 0.34 && COrgRatioSP < 0.45 && TKWSRatio < 0.57 && CPerRatioNE < 0.39 && CatRatio < 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio >= 0.34 && COrgRatioSP < 0.45 && TKWSRatio < 0.57 && CPerRatioNE < 0.39 && CatRatio >= 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio >= 0.34 && COrgRatioSP < 0.45 && TKWSRatio < 0.57 && CPerRatioNE >= 0.39 && CKWSRatio < 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio >= 0.34 && COrgRatioSP < 0.45 && TKWSRatio < 0.57 && CPerRatioNE >= 0.39 && CKWSRatio >= 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio >= 0.34 && COrgRatioSP < 0.45 && TKWSRatio >= 0.57 && InsertSpan < 81983 && CKWSRatio < 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio >= 0.34 && COrgRatioSP < 0.45 && TKWSRatio >= 0.57 && InsertSpan < 81983 && CKWSRatio >= 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio >= 0.34 && COrgRatioSP < 0.45 && TKWSRatio >= 0.57 && InsertSpan >= 81983 && EpochSpan < 49087) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio >= 0.34 && COrgRatioSP < 0.45 && TKWSRatio >= 0.57 && InsertSpan >= 81983 && EpochSpan >= 49087) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio >= 0.34 && COrgRatioSP >= 0.45 && EpochSpan < 114206 && TitleRatio < 0.31 && ChannelRatio < 0.53) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio >= 0.34 && COrgRatioSP >= 0.45 && EpochSpan < 114206 && TitleRatio < 0.31 && ChannelRatio >= 0.53) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio >= 0.34 && COrgRatioSP >= 0.45 && EpochSpan < 114206 && TitleRatio >= 0.31 && CWordSpan < 3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio >= 0.34 && COrgRatioSP >= 0.45 && EpochSpan < 114206 && TitleRatio >= 0.31 && CWordSpan >= 3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio >= 0.34 && COrgRatioSP >= 0.45 && EpochSpan >= 114206 && CTimLengthSP < 5.75 && ChannelLength < 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio >= 0.34 && COrgRatioSP >= 0.45 && EpochSpan >= 114206 && CTimLengthSP < 5.75 && ChannelLength >= 2.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio >= 0.34 && COrgRatioSP >= 0.45 && EpochSpan >= 114206 && CTimLengthSP >= 5.75 && HKWSRatio < 0.93) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && TKWSRatio >= 0.34 && COrgRatioSP >= 0.45 && EpochSpan >= 114206 && CTimLengthSP >= 5.75 && HKWSRatio >= 0.93) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.18 && CKWSRatio < 0.24 && SimhashDist < 68.5 && COrgRatioNE < 0.2 && CPerRatioNE < 0.39) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.18 && CKWSRatio < 0.24 && SimhashDist < 68.5 && COrgRatioNE < 0.2 && CPerRatioNE >= 0.39) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.18 && CKWSRatio < 0.24 && SimhashDist < 68.5 && COrgRatioNE >= 0.2 && CPerRatioNE < 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.18 && CKWSRatio < 0.24 && SimhashDist < 68.5 && COrgRatioNE >= 0.2 && CPerRatioNE >= 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.18 && CKWSRatio < 0.24 && SimhashDist >= 68.5 && CKWSRatio < 0.09 && CatRatio < 0.81) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.18 && CKWSRatio < 0.24 && SimhashDist >= 68.5 && CKWSRatio < 0.09 && CatRatio >= 0.81) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.18 && CKWSRatio < 0.24 && SimhashDist >= 68.5 && CKWSRatio >= 0.09 && CPerRatioSP < 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.18 && CKWSRatio < 0.24 && SimhashDist >= 68.5 && CKWSRatio >= 0.09 && CPerRatioSP >= 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.18 && CKWSRatio >= 0.24 && CTimRatioSP < 0.18 && CPerRatioNE < 0.22 && CNUMLengthSP < 10.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.18 && CKWSRatio >= 0.24 && CTimRatioSP < 0.18 && CPerRatioNE < 0.22 && CNUMLengthSP >= 10.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.18 && CKWSRatio >= 0.24 && CTimRatioSP < 0.18 && CPerRatioNE >= 0.22 && TitleDist < 85.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.18 && CKWSRatio >= 0.24 && CTimRatioSP < 0.18 && CPerRatioNE >= 0.22 && TitleDist >= 85.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.18 && CKWSRatio >= 0.24 && CTimRatioSP >= 0.18 && CKWSRatio < 0.38 && EpochSpan < 76579.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.18 && CKWSRatio >= 0.24 && CTimRatioSP >= 0.18 && CKWSRatio < 0.38 && EpochSpan >= 76579.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.18 && CKWSRatio >= 0.24 && CTimRatioSP >= 0.18 && CKWSRatio >= 0.38 && ParagraphSpan < 71.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.18 && CKWSRatio >= 0.24 && CTimRatioSP >= 0.18 && CKWSRatio >= 0.38 && ParagraphSpan >= 71.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.18 && ChannelRatio < 0.27 && InsertSpan < 78375 && COrgLengthSP < 20.25 && CKWSRatio < 0.16) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.18 && ChannelRatio < 0.27 && InsertSpan < 78375 && COrgLengthSP < 20.25 && CKWSRatio >= 0.16) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.18 && ChannelRatio < 0.27 && InsertSpan < 78375 && COrgLengthSP >= 20.25 && TKWSRatio < 0.57) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.18 && ChannelRatio < 0.27 && InsertSpan < 78375 && COrgLengthSP >= 20.25 && TKWSRatio >= 0.57) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.18 && ChannelRatio < 0.27 && InsertSpan >= 78375 && SimhashDist < 71.5 && EpochSpan < 255762.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.18 && ChannelRatio < 0.27 && InsertSpan >= 78375 && SimhashDist < 71.5 && EpochSpan >= 255762.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.18 && ChannelRatio < 0.27 && InsertSpan >= 78375 && SimhashDist >= 71.5 && CKWSRatio < 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.18 && ChannelRatio < 0.27 && InsertSpan >= 78375 && SimhashDist >= 71.5 && CKWSRatio >= 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.18 && ChannelRatio >= 0.27 && InsertSpan < 251136 && EpochSpan < 83315.5 && SimhashDist < 68.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.18 && ChannelRatio >= 0.27 && InsertSpan < 251136 && EpochSpan < 83315.5 && SimhashDist >= 68.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.18 && ChannelRatio >= 0.27 && InsertSpan < 251136 && EpochSpan >= 83315.5 && CPerRatioSP < 0.56) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.18 && ChannelRatio >= 0.27 && InsertSpan < 251136 && EpochSpan >= 83315.5 && CPerRatioSP >= 0.56) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.18 && ChannelRatio >= 0.27 && InsertSpan >= 251136 && HKWSRatio < 0.39 && CPerRatioSP < 0.61) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.18 && ChannelRatio >= 0.27 && InsertSpan >= 251136 && HKWSRatio < 0.39 && CPerRatioSP >= 0.61) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.18 && ChannelRatio >= 0.27 && InsertSpan >= 251136 && HKWSRatio >= 0.39 && CPerRatioSP < 0.68) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.18 && ChannelRatio >= 0.27 && InsertSpan >= 251136 && HKWSRatio >= 0.39 && CPerRatioSP >= 0.68) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio < 0.93 && TitleRatio < 0.23 && CPerRatioNE < 0.28 && COrgRatioSP < 0.48 && COrgRatioSP < 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio < 0.93 && TitleRatio < 0.23 && CPerRatioNE < 0.28 && COrgRatioSP < 0.48 && COrgRatioSP >= 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio < 0.93 && TitleRatio < 0.23 && CPerRatioNE < 0.28 && COrgRatioSP >= 0.48 && ParagraphSpan < 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio < 0.93 && TitleRatio < 0.23 && CPerRatioNE < 0.28 && COrgRatioSP >= 0.48 && ParagraphSpan >= 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio < 0.93 && TitleRatio < 0.23 && CPerRatioNE >= 0.28 && SimhashDist < 80.5 && COrgLengthSP < 2.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio < 0.93 && TitleRatio < 0.23 && CPerRatioNE >= 0.28 && SimhashDist < 80.5 && COrgLengthSP >= 2.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio < 0.93 && TitleRatio < 0.23 && CPerRatioNE >= 0.28 && SimhashDist >= 80.5 && CLocRatioSP < 0.53) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio < 0.93 && TitleRatio < 0.23 && CPerRatioNE >= 0.28 && SimhashDist >= 80.5 && CLocRatioSP >= 0.53) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio < 0.93 && TitleRatio >= 0.23 && CPerRatioNE < 0.52 && CLocRatioSP < 0.69 && HKWSRatio < 0.84) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio < 0.93 && TitleRatio >= 0.23 && CPerRatioNE < 0.52 && CLocRatioSP < 0.69 && HKWSRatio >= 0.84) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio < 0.93 && TitleRatio >= 0.23 && CPerRatioNE < 0.52 && CLocRatioSP >= 0.69 && CKWSLength < 19.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio < 0.93 && TitleRatio >= 0.23 && CPerRatioNE < 0.52 && CLocRatioSP >= 0.69 && CKWSLength >= 19.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio < 0.93 && TitleRatio >= 0.23 && CPerRatioNE >= 0.52 && CPerRatioNE < 1 && TKWSLength < 10.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio < 0.93 && TitleRatio >= 0.23 && CPerRatioNE >= 0.52 && CPerRatioNE < 1 && TKWSLength >= 10.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio < 0.93 && TitleRatio >= 0.23 && CPerRatioNE >= 0.52 && CPerRatioNE >= 1 && CLocRatioNE < 0.72) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio < 0.93 && TitleRatio >= 0.23 && CPerRatioNE >= 0.52 && CPerRatioNE >= 1 && CLocRatioNE >= 0.72) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio >= 0.93 && InsertSpan < 78418.5 && EpochSpan < 27619 && CKWSLength < 5.75 && TitleLength < 10.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio >= 0.93 && InsertSpan < 78418.5 && EpochSpan < 27619 && CKWSLength < 5.75 && TitleLength >= 10.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio >= 0.93 && InsertSpan < 78418.5 && EpochSpan < 27619 && CKWSLength >= 5.75 && TitleRatio < 0.94) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio >= 0.93 && InsertSpan < 78418.5 && EpochSpan < 27619 && CKWSLength >= 5.75 && TitleRatio >= 0.94) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio >= 0.93 && InsertSpan < 78418.5 && EpochSpan >= 27619 && CLocLengthNE < 9.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio >= 0.93 && InsertSpan < 78418.5 && EpochSpan >= 27619 && CLocLengthNE >= 9.25 && GeoLength < 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio >= 0.93 && InsertSpan < 78418.5 && EpochSpan >= 27619 && CLocLengthNE >= 9.25 && GeoLength >= 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio >= 0.93 && InsertSpan >= 78418.5 && CLocRatioSP < 0.72 && CWordSpan < 51 && ParagraphSpan < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio >= 0.93 && InsertSpan >= 78418.5 && CLocRatioSP < 0.72 && CWordSpan < 51 && ParagraphSpan >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio >= 0.93 && InsertSpan >= 78418.5 && CLocRatioSP < 0.72 && CWordSpan >= 51 && CLocLengthNE < 1.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio >= 0.93 && InsertSpan >= 78418.5 && CLocRatioSP < 0.72 && CWordSpan >= 51 && CLocLengthNE >= 1.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio >= 0.93 && InsertSpan >= 78418.5 && CLocRatioSP >= 0.72 && TitleLength < 5.5 && COrgRatioSP < 0.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio >= 0.93 && InsertSpan >= 78418.5 && CLocRatioSP >= 0.72 && TitleLength < 5.5 && COrgRatioSP >= 0.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio >= 0.93 && InsertSpan >= 78418.5 && CLocRatioSP >= 0.72 && TitleLength >= 5.5 && InsertSpan < 103324) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio >= 0.93 && InsertSpan >= 78418.5 && CLocRatioSP >= 0.72 && TitleLength >= 5.5 && InsertSpan >= 103324) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio < 0.1 && CPerRatioSP < 0.27 && COrgRatioNE < 0.3 && CTimRatioSP < 0.36 && CLocLengthNE < 18.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio < 0.1 && CPerRatioSP < 0.27 && COrgRatioNE < 0.3 && CTimRatioSP < 0.36 && CLocLengthNE >= 18.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio < 0.1 && CPerRatioSP < 0.27 && COrgRatioNE < 0.3 && CTimRatioSP >= 0.36 && CKWSRatio < 0.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio < 0.1 && CPerRatioSP < 0.27 && COrgRatioNE < 0.3 && CTimRatioSP >= 0.36 && CKWSRatio >= 0.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio < 0.1 && CPerRatioSP < 0.27 && COrgRatioNE >= 0.3 && CTimLengthSP < 19.75 && HKWSRatio < 0.78) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio < 0.1 && CPerRatioSP < 0.27 && COrgRatioNE >= 0.3 && CTimLengthSP < 19.75 && HKWSRatio >= 0.78) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio < 0.1 && CPerRatioSP < 0.27 && COrgRatioNE >= 0.3 && CTimLengthSP >= 19.75 && CLocLengthNE < 10.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio < 0.1 && CPerRatioSP < 0.27 && COrgRatioNE >= 0.3 && CTimLengthSP >= 19.75 && CLocLengthNE >= 10.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio < 0.1 && CPerRatioSP >= 0.27 && CKWSRatio < 0.24 && EpochSpan < 154065 && TKWSRatio < 0.13) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio < 0.1 && CPerRatioSP >= 0.27 && CKWSRatio < 0.24 && EpochSpan < 154065 && TKWSRatio >= 0.13) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio < 0.1 && CPerRatioSP >= 0.27 && CKWSRatio < 0.24 && EpochSpan >= 154065) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio < 0.1 && CPerRatioSP >= 0.27 && CKWSRatio >= 0.24 && CatLength < 1.61 && EpochSpan < 95350.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio < 0.1 && CPerRatioSP >= 0.27 && CKWSRatio >= 0.24 && CatLength < 1.61 && EpochSpan >= 95350.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio < 0.1 && CPerRatioSP >= 0.27 && CKWSRatio >= 0.24 && CatLength >= 1.61 && CPerRatioSP < 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio < 0.1 && CPerRatioSP >= 0.27 && CKWSRatio >= 0.24 && CatLength >= 1.61 && CPerRatioSP >= 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio >= 0.1 && COrgRatioNE < 0.07 && CPerRatioSP < 0.29 && CatLength < 1.85 && CKWSRatio < 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio >= 0.1 && COrgRatioNE < 0.07 && CPerRatioSP < 0.29 && CatLength < 1.85 && CKWSRatio >= 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio >= 0.1 && COrgRatioNE < 0.07 && CPerRatioSP < 0.29 && CatLength >= 1.85 && EpochSpan < 327978) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio >= 0.1 && COrgRatioNE < 0.07 && CPerRatioSP < 0.29 && CatLength >= 1.85 && EpochSpan >= 327978) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio >= 0.1 && COrgRatioNE < 0.07 && CPerRatioSP >= 0.29 && TKWSRatio < 0.42 && CWordSpan < 333.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio >= 0.1 && COrgRatioNE < 0.07 && CPerRatioSP >= 0.29 && TKWSRatio < 0.42 && CWordSpan >= 333.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio >= 0.1 && COrgRatioNE < 0.07 && CPerRatioSP >= 0.29 && TKWSRatio >= 0.42 && EpochSpan < 255480) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio >= 0.1 && COrgRatioNE < 0.07 && CPerRatioSP >= 0.29 && TKWSRatio >= 0.42 && EpochSpan >= 255480) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio >= 0.1 && COrgRatioNE >= 0.07 && CKWSRatio < 0.37 && CPerRatioNE < 0.36 && COrgRatioSP < 0.18) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio >= 0.1 && COrgRatioNE >= 0.07 && CKWSRatio < 0.37 && CPerRatioNE < 0.36 && COrgRatioSP >= 0.18) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio >= 0.1 && COrgRatioNE >= 0.07 && CKWSRatio < 0.37 && CPerRatioNE >= 0.36 && ChannelRatio < 0.69) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio >= 0.1 && COrgRatioNE >= 0.07 && CKWSRatio < 0.37 && CPerRatioNE >= 0.36 && ChannelRatio >= 0.69) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio >= 0.1 && COrgRatioNE >= 0.07 && CKWSRatio >= 0.37 && CPerRatioNE < 0.48 && CatLength < 1.11) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio >= 0.1 && COrgRatioNE >= 0.07 && CKWSRatio >= 0.37 && CPerRatioNE < 0.48 && CatLength >= 1.11) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio >= 0.1 && COrgRatioNE >= 0.07 && CKWSRatio >= 0.37 && CPerRatioNE >= 0.48 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio >= 0.1 && COrgRatioNE >= 0.07 && CKWSRatio >= 0.37 && CPerRatioNE >= 0.48 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist < 22.5 && TitleRatio < 0.88 && TitleDist < 10.5 && EpochSpan < 321) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist < 22.5 && TitleRatio < 0.88 && TitleDist < 10.5 && EpochSpan >= 321 && TitleLength < 6.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist < 22.5 && TitleRatio < 0.88 && TitleDist < 10.5 && EpochSpan >= 321 && TitleLength >= 6.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist < 22.5 && TitleRatio < 0.88 && TitleDist >= 10.5 && TitleDist < 20.5 && CLocRatioNE < 0.36) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist < 22.5 && TitleRatio < 0.88 && TitleDist >= 10.5 && TitleDist < 20.5 && CLocRatioNE >= 0.36) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist < 22.5 && TitleRatio < 0.88 && TitleDist >= 10.5 && TitleDist >= 20.5 && COrgLengthSP < 7.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist < 22.5 && TitleRatio < 0.88 && TitleDist >= 10.5 && TitleDist >= 20.5 && COrgLengthSP >= 7.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist < 22.5 && TitleRatio >= 0.88 && CNUMRatioSP < 0.58 && CKWSRatio < 1 && TitleLength < 5.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist < 22.5 && TitleRatio >= 0.88 && CNUMRatioSP < 0.58 && CKWSRatio < 1 && TitleLength >= 5.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist < 22.5 && TitleRatio >= 0.88 && CNUMRatioSP < 0.58 && CKWSRatio >= 1 && CNUMRatioSP < 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist < 22.5 && TitleRatio >= 0.88 && CNUMRatioSP < 0.58 && CKWSRatio >= 1 && CNUMRatioSP >= 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist < 22.5 && TitleRatio >= 0.88 && CNUMRatioSP >= 0.58 && TOrgLengthSP < 2.75 && CKWSLength < 6.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist < 22.5 && TitleRatio >= 0.88 && CNUMRatioSP >= 0.58 && TOrgLengthSP < 2.75 && CKWSLength >= 6.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist < 22.5 && TitleRatio >= 0.88 && CNUMRatioSP >= 0.58 && TOrgLengthSP >= 2.75 && CPerLengthSP < 35.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist < 22.5 && TitleRatio >= 0.88 && CNUMRatioSP >= 0.58 && TOrgLengthSP >= 2.75 && CPerLengthSP >= 35.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist >= 22.5 && CPerRatioNE < 0.31 && TitleRatio < 0.42 && CLocLengthSP < 38 && TitleRatio < 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist >= 22.5 && CPerRatioNE < 0.31 && TitleRatio < 0.42 && CLocLengthSP < 38 && TitleRatio >= 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist >= 22.5 && CPerRatioNE < 0.31 && TitleRatio < 0.42 && CLocLengthSP >= 38 && CPerLengthNE < 6.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist >= 22.5 && CPerRatioNE < 0.31 && TitleRatio < 0.42 && CLocLengthSP >= 38 && CPerLengthNE >= 6.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist >= 22.5 && CPerRatioNE < 0.31 && TitleRatio >= 0.42 && CLocRatioSP < 0.54 && COrgRatioSP < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist >= 22.5 && CPerRatioNE < 0.31 && TitleRatio >= 0.42 && CLocRatioSP < 0.54 && COrgRatioSP >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist >= 22.5 && CPerRatioNE < 0.31 && TitleRatio >= 0.42 && CLocRatioSP >= 0.54 && InsertSpan < 85666.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist >= 22.5 && CPerRatioNE < 0.31 && TitleRatio >= 0.42 && CLocRatioSP >= 0.54 && InsertSpan >= 85666.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist >= 22.5 && CPerRatioNE >= 0.31 && CLocRatioSP < 0.73 && SameSRC < 0.5 && CTimRatioSP < 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist >= 22.5 && CPerRatioNE >= 0.31 && CLocRatioSP < 0.73 && SameSRC < 0.5 && CTimRatioSP >= 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist >= 22.5 && CPerRatioNE >= 0.31 && CLocRatioSP < 0.73 && SameSRC >= 0.5 && CKWSRatio < 0.34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist >= 22.5 && CPerRatioNE >= 0.31 && CLocRatioSP < 0.73 && SameSRC >= 0.5 && CKWSRatio >= 0.34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist >= 22.5 && CPerRatioNE >= 0.31 && CLocRatioSP >= 0.73 && TitleDist < 0.5 && TitleLength < 7.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist >= 22.5 && CPerRatioNE >= 0.31 && CLocRatioSP >= 0.73 && TitleDist < 0.5 && TitleLength >= 7.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist >= 22.5 && CPerRatioNE >= 0.31 && CLocRatioSP >= 0.73 && TitleDist >= 0.5 && InsertSpan < 174722) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist >= 22.5 && CPerRatioNE >= 0.31 && CLocRatioSP >= 0.73 && TitleDist >= 0.5 && InsertSpan >= 174722) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.2 && SimhashDist < 73.5 && CKWSRatio < 0.22 && CPerRatioNE < 0.22 && CatRatio < 0.76) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.2 && SimhashDist < 73.5 && CKWSRatio < 0.22 && CPerRatioNE < 0.22 && CatRatio >= 0.76) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.2 && SimhashDist < 73.5 && CKWSRatio < 0.22 && CPerRatioNE >= 0.22 && CatLength < 1.8) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.2 && SimhashDist < 73.5 && CKWSRatio < 0.22 && CPerRatioNE >= 0.22 && CatLength >= 1.8) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.2 && SimhashDist < 73.5 && CKWSRatio >= 0.22 && CPerRatioSP < 0.54 && CLocLengthSP < 9.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.2 && SimhashDist < 73.5 && CKWSRatio >= 0.22 && CPerRatioSP < 0.54 && CLocLengthSP >= 9.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.2 && SimhashDist < 73.5 && CKWSRatio >= 0.22 && CPerRatioSP >= 0.54 && InsertSpan < 112097.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.2 && SimhashDist < 73.5 && CKWSRatio >= 0.22 && CPerRatioSP >= 0.54 && InsertSpan >= 112097.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.2 && SimhashDist >= 73.5 && CKWSRatio < 0.23 && SimhashDist < 83.5 && COrgRatioNE < 0.79) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.2 && SimhashDist >= 73.5 && CKWSRatio < 0.23 && SimhashDist < 83.5 && COrgRatioNE >= 0.79) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.2 && SimhashDist >= 73.5 && CKWSRatio < 0.23 && SimhashDist >= 83.5 && CNUMRatioSP < 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.2 && SimhashDist >= 73.5 && CKWSRatio < 0.23 && SimhashDist >= 83.5 && CNUMRatioSP >= 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.2 && SimhashDist >= 73.5 && CKWSRatio >= 0.23 && EpochSpan < 54882 && CNUMLengthSP < 27.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.2 && SimhashDist >= 73.5 && CKWSRatio >= 0.23 && EpochSpan < 54882 && CNUMLengthSP >= 27.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.2 && SimhashDist >= 73.5 && CKWSRatio >= 0.23 && EpochSpan >= 54882 && CPerRatioNE < 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.2 && SimhashDist >= 73.5 && CKWSRatio >= 0.23 && EpochSpan >= 54882 && CPerRatioNE >= 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.2 && CPerRatioSP < 0.61 && EpochSpan < 83107.5 && SimhashDist < 64.5 && CPerLengthNE < 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.2 && CPerRatioSP < 0.61 && EpochSpan < 83107.5 && SimhashDist < 64.5 && CPerLengthNE >= 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.2 && CPerRatioSP < 0.61 && EpochSpan < 83107.5 && SimhashDist >= 64.5 && COrgRatioSP < 0.13) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.2 && CPerRatioSP < 0.61 && EpochSpan < 83107.5 && SimhashDist >= 64.5 && COrgRatioSP >= 0.13) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.2 && CPerRatioSP < 0.61 && EpochSpan >= 83107.5 && HKWSRatio < 0.47 && CLocRatioNE < 0.53) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.2 && CPerRatioSP < 0.61 && EpochSpan >= 83107.5 && HKWSRatio < 0.47 && CLocRatioNE >= 0.53) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.2 && CPerRatioSP < 0.61 && EpochSpan >= 83107.5 && HKWSRatio >= 0.47 && COrgRatioSP < 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.2 && CPerRatioSP < 0.61 && EpochSpan >= 83107.5 && HKWSRatio >= 0.47 && COrgRatioSP >= 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.2 && CPerRatioSP >= 0.61 && CPerLengthNE < 1.25 && SimhashDist < 13 && CNUMRatioSP < 0.13) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.2 && CPerRatioSP >= 0.61 && CPerLengthNE < 1.25 && SimhashDist < 13 && CNUMRatioSP >= 0.13) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.2 && CPerRatioSP >= 0.61 && CPerLengthNE < 1.25 && SimhashDist >= 13 && SimhashDist < 82.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.2 && CPerRatioSP >= 0.61 && CPerLengthNE < 1.25 && SimhashDist >= 13 && SimhashDist >= 82.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.2 && CPerRatioSP >= 0.61 && CPerLengthNE >= 1.25 && TKWSRatio < 0.65 && CKWSRatio < 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.2 && CPerRatioSP >= 0.61 && CPerLengthNE >= 1.25 && TKWSRatio < 0.65 && CKWSRatio >= 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.2 && CPerRatioSP >= 0.61 && CPerLengthNE >= 1.25 && TKWSRatio >= 0.65 && CNUMRatioSP < 0.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.2 && CPerRatioSP >= 0.61 && CPerLengthNE >= 1.25 && TKWSRatio >= 0.65 && CNUMRatioSP >= 0.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && SimhashDist < 36.5 && CTimLengthSP < 2.25 && EpochSpan < 713459 && CNUMRatioSP < 0.77) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && SimhashDist < 36.5 && CTimLengthSP < 2.25 && EpochSpan < 713459 && CNUMRatioSP >= 0.77) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && SimhashDist < 36.5 && CTimLengthSP < 2.25 && EpochSpan >= 713459) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && SimhashDist < 36.5 && CTimLengthSP >= 2.25 && CNUMLengthSP < 35.25 && ChannelRatio < 0.41) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && SimhashDist < 36.5 && CTimLengthSP >= 2.25 && CNUMLengthSP < 35.25 && ChannelRatio >= 0.41) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && SimhashDist < 36.5 && CTimLengthSP >= 2.25 && CNUMLengthSP >= 35.25 && InsertSpan < 204819.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && SimhashDist < 36.5 && CTimLengthSP >= 2.25 && CNUMLengthSP >= 35.25 && InsertSpan >= 204819.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && SimhashDist >= 36.5 && EpochSpan < 83538.5 && HKWSLength < 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && SimhashDist >= 36.5 && EpochSpan < 83538.5 && HKWSLength >= 1.25 && TitleLength < 7.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && SimhashDist >= 36.5 && EpochSpan < 83538.5 && HKWSLength >= 1.25 && TitleLength >= 7.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && SimhashDist >= 36.5 && EpochSpan >= 83538.5 && TitleLength < 5.5 && COrgLengthSP < 6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && SimhashDist >= 36.5 && EpochSpan >= 83538.5 && TitleLength < 5.5 && COrgLengthSP >= 6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && SimhashDist >= 36.5 && EpochSpan >= 83538.5 && TitleLength >= 5.5 && SimhashDist < 52.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && SimhashDist >= 36.5 && EpochSpan >= 83538.5 && TitleLength >= 5.5 && SimhashDist >= 52.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && EpochSpan < 255578 && EpochSpan < 74161 && SimhashDist < 81.5 && CKWSRatio < 0.21) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && EpochSpan < 255578 && EpochSpan < 74161 && SimhashDist < 81.5 && CKWSRatio >= 0.21) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && EpochSpan < 255578 && EpochSpan < 74161 && SimhashDist >= 81.5 && TKWSRatio < 0.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && EpochSpan < 255578 && EpochSpan < 74161 && SimhashDist >= 81.5 && TKWSRatio >= 0.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && EpochSpan < 255578 && EpochSpan >= 74161 && SimhashDist < 73.5 && TitleDist < 24.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && EpochSpan < 255578 && EpochSpan >= 74161 && SimhashDist < 73.5 && TitleDist >= 24.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && EpochSpan < 255578 && EpochSpan >= 74161 && SimhashDist >= 73.5 && CatRatio < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && EpochSpan < 255578 && EpochSpan >= 74161 && SimhashDist >= 73.5 && CatRatio >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && EpochSpan >= 255578 && CPerRatioSP < 0.34 && CKWSRatio < 0.34 && TKWSLength < 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && EpochSpan >= 255578 && CPerRatioSP < 0.34 && CKWSRatio < 0.34 && TKWSLength >= 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && EpochSpan >= 255578 && CPerRatioSP < 0.34 && CKWSRatio >= 0.34 && CWordSpan < 68.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && EpochSpan >= 255578 && CPerRatioSP < 0.34 && CKWSRatio >= 0.34 && CWordSpan >= 68.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && EpochSpan >= 255578 && CPerRatioSP >= 0.34 && CatLength < 1.34 && TKWSRatio < 0.73) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && EpochSpan >= 255578 && CPerRatioSP >= 0.34 && CatLength < 1.34 && TKWSRatio >= 0.73) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && EpochSpan >= 255578 && CPerRatioSP >= 0.34 && CatLength >= 1.34 && TitleLength < 7.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && EpochSpan >= 255578 && CPerRatioSP >= 0.34 && CatLength >= 1.34 && TitleLength >= 7.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio < 0.51 && COrgRatioNE < 0.12 && TOrgRatioSP < 0.48 && CKWSRatio < 0.29 && CatRatio < 0.39) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio < 0.51 && COrgRatioNE < 0.12 && TOrgRatioSP < 0.48 && CKWSRatio < 0.29 && CatRatio >= 0.39) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio < 0.51 && COrgRatioNE < 0.12 && TOrgRatioSP < 0.48 && CKWSRatio >= 0.29 && CLocLengthNE < 14.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio < 0.51 && COrgRatioNE < 0.12 && TOrgRatioSP < 0.48 && CKWSRatio >= 0.29 && CLocLengthNE >= 14.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio < 0.51 && COrgRatioNE < 0.12 && TOrgRatioSP >= 0.48 && EpochSpan < 339693.5 && TitleRatio < 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio < 0.51 && COrgRatioNE < 0.12 && TOrgRatioSP >= 0.48 && EpochSpan < 339693.5 && TitleRatio >= 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio < 0.51 && COrgRatioNE < 0.12 && TOrgRatioSP >= 0.48 && EpochSpan >= 339693.5 && TitleLength < 8.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio < 0.51 && COrgRatioNE < 0.12 && TOrgRatioSP >= 0.48 && EpochSpan >= 339693.5 && TitleLength >= 8.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio < 0.51 && COrgRatioNE >= 0.12 && SimhashDist < 68.5 && CWordSpan < 58 && TKWSRatio < 0.34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio < 0.51 && COrgRatioNE >= 0.12 && SimhashDist < 68.5 && CWordSpan < 58 && TKWSRatio >= 0.34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio < 0.51 && COrgRatioNE >= 0.12 && SimhashDist < 68.5 && CWordSpan >= 58 && TitleRatio < 0.21) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio < 0.51 && COrgRatioNE >= 0.12 && SimhashDist < 68.5 && CWordSpan >= 58 && TitleRatio >= 0.21) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio < 0.51 && COrgRatioNE >= 0.12 && SimhashDist >= 68.5 && CLocRatioSP < 0.53 && TitleRatio < 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio < 0.51 && COrgRatioNE >= 0.12 && SimhashDist >= 68.5 && CLocRatioSP < 0.53 && TitleRatio >= 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio < 0.51 && COrgRatioNE >= 0.12 && SimhashDist >= 68.5 && CLocRatioSP >= 0.53 && EpochSpan < 78603) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio < 0.51 && COrgRatioNE >= 0.12 && SimhashDist >= 68.5 && CLocRatioSP >= 0.53 && EpochSpan >= 78603) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio >= 0.51 && InsertSpan < 83806.5 && CTimRatioSP < 0.4 && TitleRatio < 0.23 && COrgRatioNE < 0.12) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio >= 0.51 && InsertSpan < 83806.5 && CTimRatioSP < 0.4 && TitleRatio < 0.23 && COrgRatioNE >= 0.12) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio >= 0.51 && InsertSpan < 83806.5 && CTimRatioSP < 0.4 && TitleRatio >= 0.23 && TKWSRatio < 0.68) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio >= 0.51 && InsertSpan < 83806.5 && CTimRatioSP < 0.4 && TitleRatio >= 0.23 && TKWSRatio >= 0.68) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio >= 0.51 && InsertSpan < 83806.5 && CTimRatioSP >= 0.4 && CKWSRatio < 0.26 && CLocRatioNE < 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio >= 0.51 && InsertSpan < 83806.5 && CTimRatioSP >= 0.4 && CKWSRatio < 0.26 && CLocRatioNE >= 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio >= 0.51 && InsertSpan < 83806.5 && CTimRatioSP >= 0.4 && CKWSRatio >= 0.26 && CLocRatioNE < 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio >= 0.51 && InsertSpan < 83806.5 && CTimRatioSP >= 0.4 && CKWSRatio >= 0.26 && CLocRatioNE >= 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio >= 0.51 && InsertSpan >= 83806.5 && EpochSpan < 163149 && CKWSRatio < 0.26 && SimhashDist < 64.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio >= 0.51 && InsertSpan >= 83806.5 && EpochSpan < 163149 && CKWSRatio < 0.26 && SimhashDist >= 64.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio >= 0.51 && InsertSpan >= 83806.5 && EpochSpan < 163149 && CKWSRatio >= 0.26 && SimhashDist < 75.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio >= 0.51 && InsertSpan >= 83806.5 && EpochSpan < 163149 && CKWSRatio >= 0.26 && SimhashDist >= 75.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio >= 0.51 && InsertSpan >= 83806.5 && EpochSpan >= 163149 && CKWSRatio < 0.28 && TKWSRatio < 0.36) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio >= 0.51 && InsertSpan >= 83806.5 && EpochSpan >= 163149 && CKWSRatio < 0.28 && TKWSRatio >= 0.36) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio >= 0.51 && InsertSpan >= 83806.5 && EpochSpan >= 163149 && CKWSRatio >= 0.28 && CPerLengthSP < 0.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio >= 0.51 && InsertSpan >= 83806.5 && EpochSpan >= 163149 && CKWSRatio >= 0.28 && CPerLengthSP >= 0.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.83 && SimhashDist < 65.5 && TitleRatio < 0.37 && TitleRatio < 0.21 && CKWSRatio < 0.38) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.83 && SimhashDist < 65.5 && TitleRatio < 0.37 && TitleRatio < 0.21 && CKWSRatio >= 0.38) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.83 && SimhashDist < 65.5 && TitleRatio < 0.37 && TitleRatio >= 0.21 && CTimRatioSP < 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.83 && SimhashDist < 65.5 && TitleRatio < 0.37 && TitleRatio >= 0.21 && CTimRatioSP >= 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.83 && SimhashDist < 65.5 && TitleRatio >= 0.37 && CPerRatioSP < 0.56 && CLocLengthNE < 18.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.83 && SimhashDist < 65.5 && TitleRatio >= 0.37 && CPerRatioSP < 0.56 && CLocLengthNE >= 18.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.83 && SimhashDist < 65.5 && TitleRatio >= 0.37 && CPerRatioSP >= 0.56 && TKWSRatio < 0.6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.83 && SimhashDist < 65.5 && TitleRatio >= 0.37 && CPerRatioSP >= 0.56 && TKWSRatio >= 0.6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.83 && SimhashDist >= 65.5 && CKWSRatio < 0.28 && InsertSpan < 113838.5 && SimhashDist < 81.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.83 && SimhashDist >= 65.5 && CKWSRatio < 0.28 && InsertSpan < 113838.5 && SimhashDist >= 81.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.83 && SimhashDist >= 65.5 && CKWSRatio < 0.28 && InsertSpan >= 113838.5 && TPerRatioSP < 0.85) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.83 && SimhashDist >= 65.5 && CKWSRatio < 0.28 && InsertSpan >= 113838.5 && TPerRatioSP >= 0.85) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.83 && SimhashDist >= 65.5 && CKWSRatio >= 0.28 && CPerRatioSP < 0.65 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.83 && SimhashDist >= 65.5 && CKWSRatio >= 0.28 && CPerRatioSP < 0.65 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.83 && SimhashDist >= 65.5 && CKWSRatio >= 0.28 && CPerRatioSP >= 0.65 && InsertSpan < 155702.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP < 0.83 && SimhashDist >= 65.5 && CKWSRatio >= 0.28 && CPerRatioSP >= 0.65 && InsertSpan >= 155702.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.83 && CKWSRatio < 0.99 && EpochSpan < 75810.5 && CTimRatioSP < 0.95 && CatLength < 1.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.83 && CKWSRatio < 0.99 && EpochSpan < 75810.5 && CTimRatioSP < 0.95 && CatLength >= 1.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.83 && CKWSRatio < 0.99 && EpochSpan < 75810.5 && CTimRatioSP >= 0.95 && CLocRatioNE < 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.83 && CKWSRatio < 0.99 && EpochSpan < 75810.5 && CTimRatioSP >= 0.95 && CLocRatioNE >= 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.83 && CKWSRatio < 0.99 && EpochSpan >= 75810.5 && CKWSRatio < 0.6 && SimhashDist < 77.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.83 && CKWSRatio < 0.99 && EpochSpan >= 75810.5 && CKWSRatio < 0.6 && SimhashDist >= 77.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.83 && CKWSRatio < 0.99 && EpochSpan >= 75810.5 && CKWSRatio >= 0.6 && CKWSLength < 13.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.83 && CKWSRatio < 0.99 && EpochSpan >= 75810.5 && CKWSRatio >= 0.6 && CKWSLength >= 13.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.83 && CKWSRatio >= 0.99 && TKWSRatio < 1 && CTimLengthSP < 9.5 && COrgLengthSP < 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.83 && CKWSRatio >= 0.99 && TKWSRatio < 1 && CTimLengthSP < 9.5 && COrgLengthSP >= 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.83 && CKWSRatio >= 0.99 && TKWSRatio < 1 && CTimLengthSP >= 9.5 && COrgLengthSP < 29.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.83 && CKWSRatio >= 0.99 && TKWSRatio < 1 && CTimLengthSP >= 9.5 && COrgLengthSP >= 29.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.83 && CKWSRatio >= 0.99 && TKWSRatio >= 1 && CNUMRatioSP < 1 && GeoLength < 2.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.83 && CKWSRatio >= 0.99 && TKWSRatio >= 1 && CNUMRatioSP < 1 && GeoLength >= 2.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.83 && CKWSRatio >= 0.99 && TKWSRatio >= 1 && CNUMRatioSP >= 1 && COrgLengthNE < 29.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && CNUMRatioSP >= 0.83 && CKWSRatio >= 0.99 && TKWSRatio >= 1 && CNUMRatioSP >= 1 && COrgLengthNE >= 29.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio < 0.27 && SimhashDist < 73.5 && COrgRatioNE < 0.18 && CTimRatioSP < 0.33 && COrgRatioSP < 0.15) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio < 0.27 && SimhashDist < 73.5 && COrgRatioNE < 0.18 && CTimRatioSP < 0.33 && COrgRatioSP >= 0.15) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio < 0.27 && SimhashDist < 73.5 && COrgRatioNE < 0.18 && CTimRatioSP >= 0.33 && CLocRatioSP < 0.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio < 0.27 && SimhashDist < 73.5 && COrgRatioNE < 0.18 && CTimRatioSP >= 0.33 && CLocRatioSP >= 0.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio < 0.27 && SimhashDist < 73.5 && COrgRatioNE >= 0.18 && EpochSpan < 74822.5 && CLocRatioSP < 0.63) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio < 0.27 && SimhashDist < 73.5 && COrgRatioNE >= 0.18 && EpochSpan < 74822.5 && CLocRatioSP >= 0.63) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio < 0.27 && SimhashDist < 73.5 && COrgRatioNE >= 0.18 && EpochSpan >= 74822.5 && CLocRatioSP < 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio < 0.27 && SimhashDist < 73.5 && COrgRatioNE >= 0.18 && EpochSpan >= 74822.5 && CLocRatioSP >= 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio < 0.27 && SimhashDist >= 73.5 && TitleRatio < 0.18 && CLocLengthNE < 18.25 && COrgRatioSP < 0.21) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio < 0.27 && SimhashDist >= 73.5 && TitleRatio < 0.18 && CLocLengthNE < 18.25 && COrgRatioSP >= 0.21) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio < 0.27 && SimhashDist >= 73.5 && TitleRatio < 0.18 && CLocLengthNE >= 18.25 && TitleDist < 42.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio < 0.27 && SimhashDist >= 73.5 && TitleRatio < 0.18 && CLocLengthNE >= 18.25 && TitleDist >= 42.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio < 0.27 && SimhashDist >= 73.5 && TitleRatio >= 0.18 && COrgRatioSP < 0.68 && CKWSRatio < 0.17) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio < 0.27 && SimhashDist >= 73.5 && TitleRatio >= 0.18 && COrgRatioSP < 0.68 && CKWSRatio >= 0.17) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio < 0.27 && SimhashDist >= 73.5 && TitleRatio >= 0.18 && COrgRatioSP >= 0.68 && ChannelRatio < 0.17) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio < 0.27 && SimhashDist >= 73.5 && TitleRatio >= 0.18 && COrgRatioSP >= 0.68 && ChannelRatio >= 0.17) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio >= 0.27 && InsertSpan < 140926 && SimhashDist < 71.5 && CNUMRatioSP < 0.36 && COrgRatioSP < 0.45) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio >= 0.27 && InsertSpan < 140926 && SimhashDist < 71.5 && CNUMRatioSP < 0.36 && COrgRatioSP >= 0.45) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio >= 0.27 && InsertSpan < 140926 && SimhashDist < 71.5 && CNUMRatioSP >= 0.36 && CKWSLength < 8.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio >= 0.27 && InsertSpan < 140926 && SimhashDist < 71.5 && CNUMRatioSP >= 0.36 && CKWSLength >= 8.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio >= 0.27 && InsertSpan < 140926 && SimhashDist >= 71.5 && EpochSpan < 42075.5 && COrgRatioNE < 0.11) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio >= 0.27 && InsertSpan < 140926 && SimhashDist >= 71.5 && EpochSpan < 42075.5 && COrgRatioNE >= 0.11) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio >= 0.27 && InsertSpan < 140926 && SimhashDist >= 71.5 && EpochSpan >= 42075.5 && CKWSRatio < 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio >= 0.27 && InsertSpan < 140926 && SimhashDist >= 71.5 && EpochSpan >= 42075.5 && CKWSRatio >= 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio >= 0.27 && InsertSpan >= 140926 && CKWSRatio < 0.31 && SimhashDist < 67.5 && InsertSpan < 884138.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio >= 0.27 && InsertSpan >= 140926 && CKWSRatio < 0.31 && SimhashDist < 67.5 && InsertSpan >= 884138.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio >= 0.27 && InsertSpan >= 140926 && CKWSRatio < 0.31 && SimhashDist >= 67.5 && InsertSpan < 396635.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio >= 0.27 && InsertSpan >= 140926 && CKWSRatio < 0.31 && SimhashDist >= 67.5 && InsertSpan >= 396635.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio >= 0.27 && InsertSpan >= 140926 && CKWSRatio >= 0.31 && SimhashDist < 37.5 && CWordSpan < 224) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio >= 0.27 && InsertSpan >= 140926 && CKWSRatio >= 0.31 && SimhashDist < 37.5 && CWordSpan >= 224) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio >= 0.27 && InsertSpan >= 140926 && CKWSRatio >= 0.31 && SimhashDist >= 37.5 && COrgLengthNE < 27.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio >= 0.27 && InsertSpan >= 140926 && CKWSRatio >= 0.31 && SimhashDist >= 37.5 && COrgLengthNE >= 27.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist < 0.5 && CLocRatioSP < 0.87 && CKWSRatio < 0.21) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist < 0.5 && CLocRatioSP < 0.87 && CKWSRatio >= 0.21 && EpochSpan < 70173.5 && ParagraphSpan < 27.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist < 0.5 && CLocRatioSP < 0.87 && CKWSRatio >= 0.21 && EpochSpan < 70173.5 && ParagraphSpan >= 27.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist < 0.5 && CLocRatioSP < 0.87 && CKWSRatio >= 0.21 && EpochSpan >= 70173.5 && TKWSLength < 1.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist < 0.5 && CLocRatioSP < 0.87 && CKWSRatio >= 0.21 && EpochSpan >= 70173.5 && TKWSLength >= 1.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist < 0.5 && CLocRatioSP >= 0.87 && TitleLength < 6.5 && COrgLengthSP < 4.75 && CWordSpan < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist < 0.5 && CLocRatioSP >= 0.87 && TitleLength < 6.5 && COrgLengthSP < 4.75 && CWordSpan >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist < 0.5 && CLocRatioSP >= 0.87 && TitleLength < 6.5 && COrgLengthSP >= 4.75 && InsertSpan < 133857) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist < 0.5 && CLocRatioSP >= 0.87 && TitleLength < 6.5 && COrgLengthSP >= 4.75 && InsertSpan >= 133857) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist < 0.5 && CLocRatioSP >= 0.87 && TitleLength >= 6.5 && CLocRatioNE < 1 && TKWSLength < 6.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist < 0.5 && CLocRatioSP >= 0.87 && TitleLength >= 6.5 && CLocRatioNE < 1 && TKWSLength >= 6.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist < 0.5 && CLocRatioSP >= 0.87 && TitleLength >= 6.5 && CLocRatioNE >= 1 && COrgRatioSP < 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist < 0.5 && CLocRatioSP >= 0.87 && TitleLength >= 6.5 && CLocRatioNE >= 1 && COrgRatioSP >= 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist >= 0.5 && EpochSpan < 255750 && SimhashDist < 68.5 && SameSRC < 0.5 && HKWSRatio < 0.68) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist >= 0.5 && EpochSpan < 255750 && SimhashDist < 68.5 && SameSRC < 0.5 && HKWSRatio >= 0.68) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist >= 0.5 && EpochSpan < 255750 && SimhashDist < 68.5 && SameSRC >= 0.5 && COrgLengthSP < 3.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist >= 0.5 && EpochSpan < 255750 && SimhashDist < 68.5 && SameSRC >= 0.5 && COrgLengthSP >= 3.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist >= 0.5 && EpochSpan < 255750 && SimhashDist >= 68.5 && TitleRatio < 0.31 && CatRatio < 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist >= 0.5 && EpochSpan < 255750 && SimhashDist >= 68.5 && TitleRatio < 0.31 && CatRatio >= 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist >= 0.5 && EpochSpan < 255750 && SimhashDist >= 68.5 && TitleRatio >= 0.31 && InsertSpan < 87452) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist >= 0.5 && EpochSpan < 255750 && SimhashDist >= 68.5 && TitleRatio >= 0.31 && InsertSpan >= 87452) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist >= 0.5 && EpochSpan >= 255750 && SimhashDist < 63.5 && ChannelRatio < 0.44 && CPerRatioNE < 0.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist >= 0.5 && EpochSpan >= 255750 && SimhashDist < 63.5 && ChannelRatio < 0.44 && CPerRatioNE >= 0.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist >= 0.5 && EpochSpan >= 255750 && SimhashDist < 63.5 && ChannelRatio >= 0.44 && CNUMRatioSP < 0.66) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist >= 0.5 && EpochSpan >= 255750 && SimhashDist < 63.5 && ChannelRatio >= 0.44 && CNUMRatioSP >= 0.66) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist >= 0.5 && EpochSpan >= 255750 && SimhashDist >= 63.5 && CLocRatioSP < 0.58 && TKWSRatio < 0.84) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist >= 0.5 && EpochSpan >= 255750 && SimhashDist >= 63.5 && CLocRatioSP < 0.58 && TKWSRatio >= 0.84) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist >= 0.5 && EpochSpan >= 255750 && SimhashDist >= 63.5 && CLocRatioSP >= 0.58 && CLocRatioSP < 0.59) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && TitleDist >= 0.5 && EpochSpan >= 255750 && SimhashDist >= 63.5 && CLocRatioSP >= 0.58 && CLocRatioSP >= 0.59) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan < 60896.5 && GeoRatio < 0.54 && COrgRatioSP < 0.22 && ChannelRatio < 0.16 && TKWSRatio < 0.27) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan < 60896.5 && GeoRatio < 0.54 && COrgRatioSP < 0.22 && ChannelRatio < 0.16 && TKWSRatio >= 0.27) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan < 60896.5 && GeoRatio < 0.54 && COrgRatioSP < 0.22 && ChannelRatio >= 0.16 && CPerRatioNE < 0.13) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan < 60896.5 && GeoRatio < 0.54 && COrgRatioSP < 0.22 && ChannelRatio >= 0.16 && CPerRatioNE >= 0.13) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan < 60896.5 && GeoRatio < 0.54 && COrgRatioSP >= 0.22 && CLocRatioNE < 0.08 && TitleRatio < 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan < 60896.5 && GeoRatio < 0.54 && COrgRatioSP >= 0.22 && CLocRatioNE < 0.08 && TitleRatio >= 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan < 60896.5 && GeoRatio < 0.54 && COrgRatioSP >= 0.22 && CLocRatioNE >= 0.08 && SimhashDist < 69.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan < 60896.5 && GeoRatio < 0.54 && COrgRatioSP >= 0.22 && CLocRatioNE >= 0.08 && SimhashDist >= 69.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan < 60896.5 && GeoRatio >= 0.54 && TitleRatio < 0.2 && ChannelRatio < 0.12 && CatRatio < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan < 60896.5 && GeoRatio >= 0.54 && TitleRatio < 0.2 && ChannelRatio < 0.12 && CatRatio >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan < 60896.5 && GeoRatio >= 0.54 && TitleRatio < 0.2 && ChannelRatio >= 0.12 && SimhashDist < 73.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan < 60896.5 && GeoRatio >= 0.54 && TitleRatio < 0.2 && ChannelRatio >= 0.12 && SimhashDist >= 73.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan < 60896.5 && GeoRatio >= 0.54 && TitleRatio >= 0.2 && CPerRatioSP < 0.22 && CLocLengthSP < 2.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan < 60896.5 && GeoRatio >= 0.54 && TitleRatio >= 0.2 && CPerRatioSP < 0.22 && CLocLengthSP >= 2.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan < 60896.5 && GeoRatio >= 0.54 && TitleRatio >= 0.2 && CPerRatioSP >= 0.22 && TitleRatio < 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan < 60896.5 && GeoRatio >= 0.54 && TitleRatio >= 0.2 && CPerRatioSP >= 0.22 && TitleRatio >= 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan >= 60896.5 && ChannelRatio < 0.23 && CKWSRatio < 0.28 && TitleRatio < 0.12 && COrgRatioNE < 0.21) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan >= 60896.5 && ChannelRatio < 0.23 && CKWSRatio < 0.28 && TitleRatio < 0.12 && COrgRatioNE >= 0.21) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan >= 60896.5 && ChannelRatio < 0.23 && CKWSRatio < 0.28 && TitleRatio >= 0.12 && CNUMLengthSP < 10.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan >= 60896.5 && ChannelRatio < 0.23 && CKWSRatio < 0.28 && TitleRatio >= 0.12 && CNUMLengthSP >= 10.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan >= 60896.5 && ChannelRatio < 0.23 && CKWSRatio >= 0.28 && CNUMLengthSP < 19.25 && EpochSpan < 180999.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan >= 60896.5 && ChannelRatio < 0.23 && CKWSRatio >= 0.28 && CNUMLengthSP < 19.25 && EpochSpan >= 180999.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan >= 60896.5 && ChannelRatio < 0.23 && CKWSRatio >= 0.28 && CNUMLengthSP >= 19.25 && TitleDist < 34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan >= 60896.5 && ChannelRatio < 0.23 && CKWSRatio >= 0.28 && CNUMLengthSP >= 19.25 && TitleDist >= 34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan >= 60896.5 && ChannelRatio >= 0.23 && TKWSRatio < 0.54 && SimhashDist < 71.5 && CLocRatioNE < 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan >= 60896.5 && ChannelRatio >= 0.23 && TKWSRatio < 0.54 && SimhashDist < 71.5 && CLocRatioNE >= 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan >= 60896.5 && ChannelRatio >= 0.23 && TKWSRatio < 0.54 && SimhashDist >= 71.5 && CKWSRatio < 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan >= 60896.5 && ChannelRatio >= 0.23 && TKWSRatio < 0.54 && SimhashDist >= 71.5 && CKWSRatio >= 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan >= 60896.5 && ChannelRatio >= 0.23 && TKWSRatio >= 0.54 && CNUMRatioSP < 0.42 && InsertSpan < 253757) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan >= 60896.5 && ChannelRatio >= 0.23 && TKWSRatio >= 0.54 && CNUMRatioSP < 0.42 && InsertSpan >= 253757) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan >= 60896.5 && ChannelRatio >= 0.23 && TKWSRatio >= 0.54 && CNUMRatioSP >= 0.42 && CNUMLengthSP < 12.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan >= 60896.5 && ChannelRatio >= 0.23 && TKWSRatio >= 0.54 && CNUMRatioSP >= 0.42 && CNUMLengthSP >= 12.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio < 0.94 && CKWSRatio < 0.27 && TKWSRatio < 0.38 && CatRatio < 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio < 0.94 && CKWSRatio < 0.27 && TKWSRatio < 0.38 && CatRatio >= 0.52 && CWordSpan < 519) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio < 0.94 && CKWSRatio < 0.27 && TKWSRatio < 0.38 && CatRatio >= 0.52 && CWordSpan >= 519) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio < 0.94 && CKWSRatio < 0.27 && TKWSRatio >= 0.38 && CTimRatioSP < 0.26 && TOrgLengthSP < 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio < 0.94 && CKWSRatio < 0.27 && TKWSRatio >= 0.38 && CTimRatioSP < 0.26 && TOrgLengthSP >= 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio < 0.94 && CKWSRatio < 0.27 && TKWSRatio >= 0.38 && CTimRatioSP >= 0.26 && EpochSpan < 2646) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio < 0.94 && CKWSRatio < 0.27 && TKWSRatio >= 0.38 && CTimRatioSP >= 0.26 && EpochSpan >= 2646) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio < 0.94 && CKWSRatio >= 0.27 && InsertSpan < 266215.5 && ChannelRatio < 0.32 && CKWSRatio < 0.36) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio < 0.94 && CKWSRatio >= 0.27 && InsertSpan < 266215.5 && ChannelRatio < 0.32 && CKWSRatio >= 0.36) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio < 0.94 && CKWSRatio >= 0.27 && InsertSpan < 266215.5 && ChannelRatio >= 0.32 && EpochSpan < 74108.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio < 0.94 && CKWSRatio >= 0.27 && InsertSpan < 266215.5 && ChannelRatio >= 0.32 && EpochSpan >= 74108.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio < 0.94 && CKWSRatio >= 0.27 && InsertSpan >= 266215.5 && CPerRatioSP < 0.78 && TitleLength < 5.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio < 0.94 && CKWSRatio >= 0.27 && InsertSpan >= 266215.5 && CPerRatioSP < 0.78 && TitleLength >= 5.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio < 0.94 && CKWSRatio >= 0.27 && InsertSpan >= 266215.5 && CPerRatioSP >= 0.78 && COrgLengthNE < 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio < 0.94 && CKWSRatio >= 0.27 && InsertSpan >= 266215.5 && CPerRatioSP >= 0.78 && COrgLengthNE >= 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio >= 0.94 && CKWSRatio < 0.97 && TKWSRatio < 0.9 && TitleRatio < 0.85 && CKWSLength < 12.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio >= 0.94 && CKWSRatio < 0.97 && TKWSRatio < 0.9 && TitleRatio < 0.85 && CKWSLength >= 12.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio >= 0.94 && CKWSRatio < 0.97 && TKWSRatio < 0.9 && TitleRatio >= 0.85 && CKWSLength < 6.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio >= 0.94 && CKWSRatio < 0.97 && TKWSRatio < 0.9 && TitleRatio >= 0.85 && CKWSLength >= 6.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio >= 0.94 && CKWSRatio < 0.97 && TKWSRatio >= 0.9 && CTimRatioSP < 0.88 && EpochSpan < 86363) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio >= 0.94 && CKWSRatio < 0.97 && TKWSRatio >= 0.9 && CTimRatioSP < 0.88 && EpochSpan >= 86363) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio >= 0.94 && CKWSRatio < 0.97 && TKWSRatio >= 0.9 && CTimRatioSP >= 0.88 && CatRatio < 0.77) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio >= 0.94 && CKWSRatio < 0.97 && TKWSRatio >= 0.9 && CTimRatioSP >= 0.88 && CatRatio >= 0.77) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio >= 0.94 && CKWSRatio >= 0.97 && TitleRatio < 0.93 && SimhashDist < 48.5 && CPerRatioSP < 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio >= 0.94 && CKWSRatio >= 0.97 && TitleRatio < 0.93 && SimhashDist < 48.5 && CPerRatioSP >= 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio >= 0.94 && CKWSRatio >= 0.97 && TitleRatio < 0.93 && SimhashDist >= 48.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio >= 0.94 && CKWSRatio >= 0.97 && TitleRatio >= 0.93 && COrgLengthSP < 3.25 && TitleLength < 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio >= 0.94 && CKWSRatio >= 0.97 && TitleRatio >= 0.93 && COrgLengthSP < 3.25 && TitleLength >= 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio >= 0.94 && CKWSRatio >= 0.97 && TitleRatio >= 0.93 && COrgLengthSP >= 3.25 && CLocLengthNE < 47.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && ChannelRatio >= 0.94 && CKWSRatio >= 0.97 && TitleRatio >= 0.93 && COrgLengthSP >= 3.25 && CLocLengthNE >= 47.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		return sb.toString();
	}
}