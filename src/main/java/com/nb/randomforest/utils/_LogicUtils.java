package com.nb.randomforest.utils;

import com.nb.randomforest.entity.EventFeature;

/**
 * @author yuxi
 * @date Fri Dec 25 14:46:08 CST 2020
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
		if (COrgRatioSP < 0.49 && CKWSRatio < 0.24 && CatRatio < 0.53 && CKWSRatio < 0.13) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio < 0.24 && CatRatio < 0.53 && CKWSRatio >= 0.13) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio < 0.24 && CatRatio >= 0.53 && CNUMRatioSP < 0.21) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio < 0.24 && CatRatio >= 0.53 && CNUMRatioSP >= 0.21) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio >= 0.24 && SimhashDist < 65.5 && InsertSpan < 321515.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio >= 0.24 && SimhashDist < 65.5 && InsertSpan >= 321515.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio >= 0.24 && SimhashDist >= 65.5 && CPerRatioSP < 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.49 && CKWSRatio >= 0.24 && SimhashDist >= 65.5 && CPerRatioSP >= 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && CPerRatioSP < 0.72 && InsertSpan < 102539.5 && ChannelRatio < 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && CPerRatioSP < 0.72 && InsertSpan < 102539.5 && ChannelRatio >= 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && CPerRatioSP < 0.72 && InsertSpan >= 102539.5 && CKWSRatio < 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && CPerRatioSP < 0.72 && InsertSpan >= 102539.5 && CKWSRatio >= 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && CPerRatioSP >= 0.72 && CNUMRatioSP < 0.78 && CKWSLength < 8.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && CPerRatioSP >= 0.72 && CNUMRatioSP < 0.78 && CKWSLength >= 8.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && CPerRatioSP >= 0.72 && CNUMRatioSP >= 0.78 && TitleRatio < 0.88) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.49 && CPerRatioSP >= 0.72 && CNUMRatioSP >= 0.78 && TitleRatio >= 0.88) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE < 0.13 && CPerRatioNE < 0.04 && CKWSRatio < 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE < 0.13 && CPerRatioNE < 0.04 && CKWSRatio >= 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE < 0.13 && CPerRatioNE >= 0.04 && CKWSRatio < 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE < 0.13 && CPerRatioNE >= 0.04 && CKWSRatio >= 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE >= 0.13 && SimhashDist < 67.5 && TKWSRatio < 0.56) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE >= 0.13 && SimhashDist < 67.5 && TKWSRatio >= 0.56) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE >= 0.13 && SimhashDist >= 67.5 && TitleRatio < 0.32) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE < 0.32 && COrgRatioNE >= 0.13 && SimhashDist >= 67.5 && TitleRatio >= 0.32) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan < 72816.5 && CLocRatioNE < 0.89 && CKWSRatio < 0.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan < 72816.5 && CLocRatioNE < 0.89 && CKWSRatio >= 0.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan < 72816.5 && CLocRatioNE >= 0.89 && TitleDist < 4.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan < 72816.5 && CLocRatioNE >= 0.89 && TitleDist >= 4.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan >= 72816.5 && InsertSpan < 271415 && TitleRatio < 0.36) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan >= 72816.5 && InsertSpan < 271415 && TitleRatio >= 0.36) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan >= 72816.5 && InsertSpan >= 271415 && CPerRatioNE < 0.85) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioNE >= 0.32 && EpochSpan >= 72816.5 && InsertSpan >= 271415 && CPerRatioNE >= 0.85) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist < 69.5 && TitleDist < 0.5 && TitleLength < 5.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist < 69.5 && TitleDist < 0.5 && TitleLength >= 5.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist < 69.5 && TitleDist >= 0.5 && TitleRatio < 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist < 69.5 && TitleDist >= 0.5 && TitleRatio >= 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist >= 69.5 && SimhashDist < 81.5 && CPerRatioNE < 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist >= 69.5 && SimhashDist < 81.5 && CPerRatioNE >= 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist >= 69.5 && SimhashDist >= 81.5 && TKWSRatio < 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio < 0.41 && SimhashDist >= 69.5 && SimhashDist >= 81.5 && TKWSRatio >= 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && SimhashDist < 68.5 && EpochSpan < 255750 && COrgRatioSP < 0.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && SimhashDist < 68.5 && EpochSpan < 255750 && COrgRatioSP >= 0.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && SimhashDist < 68.5 && EpochSpan >= 255750 && CNUMRatioSP < 0.74) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && SimhashDist < 68.5 && EpochSpan >= 255750 && CNUMRatioSP >= 0.74) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && SimhashDist >= 68.5 && CPerRatioNE < 0.16 && TKWSRatio < 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && SimhashDist >= 68.5 && CPerRatioNE < 0.16 && TKWSRatio >= 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && SimhashDist >= 68.5 && CPerRatioNE >= 0.16 && ChannelRatio < 0.54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (HKWSRatio >= 0.41 && SimhashDist >= 68.5 && CPerRatioNE >= 0.16 && ChannelRatio >= 0.54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio < 0.21 && TitleRatio < 0.19 && CatRatio < 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio < 0.21 && TitleRatio < 0.19 && CatRatio >= 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio < 0.21 && TitleRatio >= 0.19 && SimhashDist < 68.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio < 0.21 && TitleRatio >= 0.19 && SimhashDist >= 68.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio >= 0.21 && TitleRatio < 0.21 && InsertSpan < 72605.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio >= 0.21 && TitleRatio < 0.21 && InsertSpan >= 72605.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio >= 0.21 && TitleRatio >= 0.21 && InsertSpan < 109623.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.57 && CKWSRatio >= 0.21 && TitleRatio >= 0.21 && InsertSpan >= 109623.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && TitleRatio < 0.9 && EpochSpan < 255750 && CWordSpan < 6.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && TitleRatio < 0.9 && EpochSpan < 255750 && CWordSpan >= 6.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && TitleRatio < 0.9 && EpochSpan >= 255750 && SimhashDist < 76.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && TitleRatio < 0.9 && EpochSpan >= 255750 && SimhashDist >= 76.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && TitleRatio >= 0.9 && CKWSRatio < 0.21 && InsertSpan < 66839.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && TitleRatio >= 0.9 && CKWSRatio < 0.21 && InsertSpan >= 66839.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && TitleRatio >= 0.9 && CKWSRatio >= 0.21 && CNUMRatioSP < 0.87) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.57 && TitleRatio >= 0.9 && CKWSRatio >= 0.21 && CNUMRatioSP >= 0.87) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan < 251514.5 && TitleDist < 0.5 && CNUMRatioSP < 0.86) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan < 251514.5 && TitleDist < 0.5 && CNUMRatioSP >= 0.86) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan < 251514.5 && TitleDist >= 0.5 && TKWSRatio < 0.51) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan < 251514.5 && TitleDist >= 0.5 && TKWSRatio >= 0.51) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan >= 251514.5 && SimhashDist < 19.5 && CNUMRatioSP < 0.71) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan >= 251514.5 && SimhashDist < 19.5 && CNUMRatioSP >= 0.71) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan >= 251514.5 && SimhashDist >= 19.5 && CNUMRatioSP < 0.51) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 67.5 && InsertSpan >= 251514.5 && SimhashDist >= 19.5 && CNUMRatioSP >= 0.51) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && CatRatio < 0.51 && COrgRatioNE < 0.08 && CPerRatioSP < 0.44) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && CatRatio < 0.51 && COrgRatioNE < 0.08 && CPerRatioSP >= 0.44) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && CatRatio < 0.51 && COrgRatioNE >= 0.08 && CKWSRatio < 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && CatRatio < 0.51 && COrgRatioNE >= 0.08 && CKWSRatio >= 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && CatRatio >= 0.51 && TitleRatio < 0.22 && CPerRatioSP < 0.13) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && CatRatio >= 0.51 && TitleRatio < 0.22 && CPerRatioSP >= 0.13) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && CatRatio >= 0.51 && TitleRatio >= 0.22 && CLocRatioSP < 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 67.5 && CatRatio >= 0.51 && TitleRatio >= 0.22 && CLocRatioSP >= 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio < 0.26 && CKWSRatio < 0.22 && COrgRatioSP < 0.15) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio < 0.26 && CKWSRatio < 0.22 && COrgRatioSP >= 0.15) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio < 0.26 && CKWSRatio >= 0.22 && CPerRatioSP < 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio < 0.26 && CKWSRatio >= 0.22 && CPerRatioSP >= 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio >= 0.26 && CPerRatioSP < 0.49 && EpochSpan < 66192) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio >= 0.26 && CPerRatioSP < 0.49 && EpochSpan >= 66192) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio >= 0.26 && CPerRatioSP >= 0.49 && CLocRatioNE < 0.57) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && ChannelRatio >= 0.26 && CPerRatioSP >= 0.49 && CLocRatioNE >= 0.57) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && EpochSpan < 83192.5 && TitleDist < 0.5 && CTimRatioSP < 0.36) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && EpochSpan < 83192.5 && TitleDist < 0.5 && CTimRatioSP >= 0.36) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && EpochSpan < 83192.5 && TitleDist >= 0.5 && CLocRatioSP < 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && EpochSpan < 83192.5 && TitleDist >= 0.5 && CLocRatioSP >= 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && EpochSpan >= 83192.5 && CNUMRatioSP < 0.45 && CPerRatioSP < 0.58) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && EpochSpan >= 83192.5 && CNUMRatioSP < 0.45 && CPerRatioSP >= 0.58) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && EpochSpan >= 83192.5 && CNUMRatioSP >= 0.45 && EpochSpan < 255771) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && EpochSpan >= 83192.5 && CNUMRatioSP >= 0.45 && EpochSpan >= 255771) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP < 0.73 && InsertSpan < 251085 && CKWSRatio < 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP < 0.73 && InsertSpan < 251085 && CKWSRatio >= 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP < 0.73 && InsertSpan >= 251085 && HKWSRatio < 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP < 0.73 && InsertSpan >= 251085 && HKWSRatio >= 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && TKWSRatio < 0.91 && InsertSpan < 257765) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && TKWSRatio < 0.91 && InsertSpan >= 257765) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && TKWSRatio >= 0.91 && InsertSpan < 39548) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && CNUMRatioSP >= 0.73 && TKWSRatio >= 0.91 && InsertSpan >= 39548) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && COrgRatioNE < 0.12 && CTimRatioSP < 0.34 && TitleRatio < 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && COrgRatioNE < 0.12 && CTimRatioSP < 0.34 && TitleRatio >= 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && COrgRatioNE < 0.12 && CTimRatioSP >= 0.34 && TitleRatio < 0.11) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && COrgRatioNE < 0.12 && CTimRatioSP >= 0.34 && TitleRatio >= 0.11) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && COrgRatioNE >= 0.12 && CPerRatioNE < 0.31 && CLocRatioSP < 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && COrgRatioNE >= 0.12 && CPerRatioNE < 0.31 && CLocRatioSP >= 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && COrgRatioNE >= 0.12 && CPerRatioNE >= 0.31 && TitleRatio < 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && COrgRatioNE >= 0.12 && CPerRatioNE >= 0.31 && TitleRatio >= 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio < 0.29 && TitleRatio < 0.13 && SimhashDist < 69.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio < 0.29 && TitleRatio < 0.13 && SimhashDist >= 69.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio < 0.29 && TitleRatio >= 0.13 && TitleRatio < 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio < 0.29 && TitleRatio >= 0.13 && TitleRatio >= 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio >= 0.29 && CPerRatioSP < 0.27 && TitleRatio < 0.32) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio >= 0.29 && CPerRatioSP < 0.27 && TitleRatio >= 0.32) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio >= 0.29 && CPerRatioSP >= 0.27 && TitleRatio < 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP < 0.4 && TKWSRatio >= 0.29 && CPerRatioSP >= 0.27 && TitleRatio >= 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TitleRatio < 0.88 && InsertSpan < 251704.5 && TitleRatio < 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TitleRatio < 0.88 && InsertSpan < 251704.5 && TitleRatio >= 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TitleRatio < 0.88 && InsertSpan >= 251704.5 && EpochSpan < 313260) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TitleRatio < 0.88 && InsertSpan >= 251704.5 && EpochSpan >= 313260) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TitleRatio >= 0.88 && CKWSRatio < 0.85 && TitleLength < 5.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TitleRatio >= 0.88 && CKWSRatio < 0.85 && TitleLength >= 5.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TitleRatio >= 0.88 && CKWSRatio >= 0.85 && COrgRatioSP < 0.94) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (COrgRatioSP >= 0.4 && TitleRatio >= 0.88 && CKWSRatio >= 0.85 && COrgRatioSP >= 0.94) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan < 75811 && TitleRatio < 0.9 && CKWSLength < 6.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan < 75811 && TitleRatio < 0.9 && CKWSLength >= 6.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan < 75811 && TitleRatio >= 0.9 && CKWSLength < 7.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan < 75811 && TitleRatio >= 0.9 && CKWSLength >= 7.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan >= 75811 && CPerRatioSP < 0.61 && TitleRatio < 0.12) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan >= 75811 && CPerRatioSP < 0.61 && TitleRatio >= 0.12) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan >= 75811 && CPerRatioSP >= 0.61 && TKWSRatio < 0.61) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 69.5 && EpochSpan >= 75811 && CPerRatioSP >= 0.61 && TKWSRatio >= 0.61) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && COrgRatioNE < 0.08 && CKWSRatio < 0.21 && TKWSRatio < 0.44) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && COrgRatioNE < 0.08 && CKWSRatio < 0.21 && TKWSRatio >= 0.44) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && COrgRatioNE < 0.08 && CKWSRatio >= 0.21 && CPerRatioNE < 0.19) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && COrgRatioNE < 0.08 && CKWSRatio >= 0.21 && CPerRatioNE >= 0.19) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && COrgRatioNE >= 0.08 && CKWSRatio < 0.25 && CPerRatioSP < 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && COrgRatioNE >= 0.08 && CKWSRatio < 0.25 && CPerRatioSP >= 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && COrgRatioNE >= 0.08 && CKWSRatio >= 0.25 && TitleRatio < 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 69.5 && COrgRatioNE >= 0.08 && CKWSRatio >= 0.25 && TitleRatio >= 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio < 0.21 && ChannelRatio < 0.11 && CPerRatioSP < 0.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio < 0.21 && ChannelRatio < 0.11 && CPerRatioSP >= 0.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio < 0.21 && ChannelRatio >= 0.11 && CatRatio < 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio < 0.21 && ChannelRatio >= 0.11 && CatRatio >= 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio >= 0.21 && COrgRatioSP < 0.49 && TitleRatio < 0.1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio >= 0.21 && COrgRatioSP < 0.49 && TitleRatio >= 0.1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio >= 0.21 && COrgRatioSP >= 0.49 && CLocRatioSP < 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && CKWSRatio >= 0.21 && COrgRatioSP >= 0.49 && CLocRatioSP >= 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan < 75787.5 && CNUMRatioSP < 0.83 && CKWSRatio < 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan < 75787.5 && CNUMRatioSP < 0.83 && CKWSRatio >= 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan < 75787.5 && CNUMRatioSP >= 0.83 && CPerRatioSP < 0.95) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan < 75787.5 && CNUMRatioSP >= 0.83 && CPerRatioSP >= 0.95) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan >= 75787.5 && InsertSpan < 281322 && COrgRatioSP < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan >= 75787.5 && InsertSpan < 281322 && COrgRatioSP >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan >= 75787.5 && InsertSpan >= 281322 && CPerRatioSP < 0.68) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && EpochSpan >= 75787.5 && InsertSpan >= 281322 && CPerRatioSP >= 0.68) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist < 71.5 && InsertSpan < 110180 && TKWSRatio < 0.54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist < 71.5 && InsertSpan < 110180 && TKWSRatio >= 0.54) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist < 71.5 && InsertSpan >= 110180 && EpochSpan < 85369) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist < 71.5 && InsertSpan >= 110180 && EpochSpan >= 85369) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist >= 71.5 && TOrgRatioSP < 0.36 && ChannelRatio < 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist >= 71.5 && TOrgRatioSP < 0.36 && ChannelRatio >= 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist >= 71.5 && TOrgRatioSP >= 0.36 && CKWSRatio < 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && SimhashDist >= 71.5 && TOrgRatioSP >= 0.36 && CKWSRatio >= 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && EpochSpan < 74258.5 && TOrgRatioSP < 0.89 && SimhashDist < 24.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && EpochSpan < 74258.5 && TOrgRatioSP < 0.89 && SimhashDist >= 24.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && EpochSpan < 74258.5 && TOrgRatioSP >= 0.89 && CNUMRatioSP < 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && EpochSpan < 74258.5 && TOrgRatioSP >= 0.89 && CNUMRatioSP >= 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && EpochSpan >= 74258.5 && TitleRatio < 0.38 && SimhashDist < 64.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && EpochSpan >= 74258.5 && TitleRatio < 0.38 && SimhashDist >= 64.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && EpochSpan >= 74258.5 && TitleRatio >= 0.38 && TitleLength < 8.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && EpochSpan >= 74258.5 && TitleRatio >= 0.38 && TitleLength >= 8.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist < 69.5 && EpochSpan < 61063 && CLocRatioSP < 0.72) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist < 69.5 && EpochSpan < 61063 && CLocRatioSP >= 0.72) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist < 69.5 && EpochSpan >= 61063 && TitleRatio < 0.12) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist < 69.5 && EpochSpan >= 61063 && TitleRatio >= 0.12) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist >= 69.5 && CatRatio < 0.39 && TitleRatio < 0.15) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist >= 69.5 && CatRatio < 0.39 && TitleRatio >= 0.15) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist >= 69.5 && CatRatio >= 0.39 && EpochSpan < 43546.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.27 && SimhashDist >= 69.5 && CatRatio >= 0.39 && EpochSpan >= 43546.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist < 19.5 && SimhashDist < 5.5 && CTimRatioSP < 0.53) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist < 19.5 && SimhashDist < 5.5 && CTimRatioSP >= 0.53) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist < 19.5 && SimhashDist >= 5.5 && TitleDist < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist < 19.5 && SimhashDist >= 5.5 && TitleDist >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist >= 19.5 && CNUMRatioSP < 0.5 && CPerRatioNE < 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist >= 19.5 && CNUMRatioSP < 0.5 && CPerRatioNE >= 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist >= 19.5 && CNUMRatioSP >= 0.5 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.27 && SimhashDist >= 19.5 && CNUMRatioSP >= 0.5 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio < 0.21 && ChannelRatio < 0.2 && CKWSRatio < 0.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio < 0.21 && ChannelRatio < 0.2 && CKWSRatio >= 0.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio < 0.21 && ChannelRatio >= 0.2 && CPerRatioNE < 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio < 0.21 && ChannelRatio >= 0.2 && CPerRatioNE >= 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio >= 0.21 && SimhashDist < 72.5 && CTimRatioSP < 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio >= 0.21 && SimhashDist < 72.5 && CTimRatioSP >= 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio >= 0.21 && SimhashDist >= 72.5 && CatRatio < 0.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.24 && TKWSRatio >= 0.21 && SimhashDist >= 72.5 && CatRatio >= 0.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && ParagraphSpan < 0.5 && TitleDist < 0.5 && SimhashDist < 13.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && ParagraphSpan < 0.5 && TitleDist < 0.5 && SimhashDist >= 13.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && ParagraphSpan < 0.5 && TitleDist >= 0.5 && CKWSLength < 10.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && ParagraphSpan < 0.5 && TitleDist >= 0.5 && CKWSLength >= 10.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && ParagraphSpan >= 0.5 && SimhashDist < 65.5 && CPerRatioSP < 0.58) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && ParagraphSpan >= 0.5 && SimhashDist < 65.5 && CPerRatioSP >= 0.58) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && ParagraphSpan >= 0.5 && SimhashDist >= 65.5 && CLocRatioNE < 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.24 && ParagraphSpan >= 0.5 && SimhashDist >= 65.5 && CLocRatioNE >= 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP < 0.23 && CPerRatioSP < 0.24 && SimhashDist < 64.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP < 0.23 && CPerRatioSP < 0.24 && SimhashDist >= 64.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP < 0.23 && CPerRatioSP >= 0.24 && CLocLengthNE < 25.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP < 0.23 && CPerRatioSP >= 0.24 && CLocLengthNE >= 25.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP >= 0.23 && ChannelRatio < 0.37 && CKWSRatio < 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP >= 0.23 && ChannelRatio < 0.37 && CKWSRatio >= 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP >= 0.23 && ChannelRatio >= 0.37 && SimhashDist < 68.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && COrgRatioSP >= 0.23 && ChannelRatio >= 0.37 && SimhashDist >= 68.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan < 83699 && CTimRatioSP < 0.98 && TitleRatio < 0.87) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan < 83699 && CTimRatioSP < 0.98 && TitleRatio >= 0.87) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan < 83699 && CTimRatioSP >= 0.98 && CNUMRatioSP < 0.7) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan < 83699 && CTimRatioSP >= 0.98 && CNUMRatioSP >= 0.7) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan >= 83699 && CPerRatioNE < 0.39 && EpochSpan < 225334.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan >= 83699 && CPerRatioNE < 0.39 && EpochSpan >= 225334.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan >= 83699 && CPerRatioNE >= 0.39 && EpochSpan < 256976.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && EpochSpan >= 83699 && CPerRatioNE >= 0.39 && EpochSpan >= 256976.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE < 0.09 && ChannelRatio < 0.17 && COrgRatioSP < 0.17) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE < 0.09 && ChannelRatio < 0.17 && COrgRatioSP >= 0.17) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE < 0.09 && ChannelRatio >= 0.17 && HKWSRatio < 0.94) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE < 0.09 && ChannelRatio >= 0.17 && HKWSRatio >= 0.94) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE >= 0.09 && InsertSpan < 99353 && TitleRatio < 0.19) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE >= 0.09 && InsertSpan < 99353 && TitleRatio >= 0.19) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE >= 0.09 && InsertSpan >= 99353 && CKWSRatio < 0.16) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio < 0.29 && COrgRatioNE >= 0.09 && InsertSpan >= 99353 && CKWSRatio >= 0.16) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && TitleRatio < 0.91 && TitleRatio < 0.32 && SimhashDist < 73.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && TitleRatio < 0.91 && TitleRatio < 0.32 && SimhashDist >= 73.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && TitleRatio < 0.91 && TitleRatio >= 0.32 && EpochSpan < 255768) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && TitleRatio < 0.91 && TitleRatio >= 0.32 && EpochSpan >= 255768) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && TitleRatio >= 0.91 && InsertSpan < 259198.5 && EpochSpan < 70840.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && TitleRatio >= 0.91 && InsertSpan < 259198.5 && EpochSpan >= 70840.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && TitleRatio >= 0.91 && InsertSpan >= 259198.5 && EpochSpan < 167514) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CKWSRatio >= 0.29 && TitleRatio >= 0.91 && InsertSpan >= 259198.5 && EpochSpan >= 167514) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio < 0.25 && COrgRatioNE < 0.17 && TitleRatio < 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio < 0.25 && COrgRatioNE < 0.17 && TitleRatio >= 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio < 0.25 && COrgRatioNE >= 0.17 && EpochSpan < 31220) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio < 0.25 && COrgRatioNE >= 0.17 && EpochSpan >= 31220) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio >= 0.25 && CNUMRatioSP < 0.65 && SimhashDist < 69.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio >= 0.25 && CNUMRatioSP < 0.65 && SimhashDist >= 69.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio >= 0.25 && CNUMRatioSP >= 0.65 && TitleRatio < 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.43 && CKWSRatio >= 0.25 && CNUMRatioSP >= 0.65 && TitleRatio >= 0.24) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio < 0.94 && EpochSpan < 255531 && TitleRatio < 0.32) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio < 0.94 && EpochSpan < 255531 && TitleRatio >= 0.32) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio < 0.94 && EpochSpan >= 255531 && CPerRatioSP < 0.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio < 0.94 && EpochSpan >= 255531 && CPerRatioSP >= 0.62) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio >= 0.94 && CTimRatioSP < 0.86 && CWordSpan < 170.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio >= 0.94 && CTimRatioSP < 0.86 && CWordSpan >= 170.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio >= 0.94 && CTimRatioSP >= 0.86 && TOrgLengthNE < 2.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.43 && TitleRatio >= 0.94 && CTimRatioSP >= 0.86 && TOrgLengthNE >= 2.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio < 0.23 && CKWSRatio < 0.22 && COrgRatioNE < 0.13) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio < 0.23 && CKWSRatio < 0.22 && COrgRatioNE >= 0.13) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio < 0.23 && CKWSRatio >= 0.22 && CPerRatioNE < 0.21) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio < 0.23 && CKWSRatio >= 0.22 && CPerRatioNE >= 0.21) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio >= 0.23 && TKWSRatio < 0.91 && CPerRatioSP < 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio >= 0.23 && TKWSRatio < 0.91 && CPerRatioSP >= 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio >= 0.23 && TKWSRatio >= 0.91 && CNUMRatioSP < 0.84) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan < 72684 && TitleRatio >= 0.23 && TKWSRatio >= 0.91 && CNUMRatioSP >= 0.84) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && CPerRatioNE < 0.29 && CPerLengthSP < 6.75 && CTimRatioSP < 0.4) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && CPerRatioNE < 0.29 && CPerLengthSP < 6.75 && CTimRatioSP >= 0.4) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && CPerRatioNE < 0.29 && CPerLengthSP >= 6.75 && CKWSRatio < 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && CPerRatioNE < 0.29 && CPerLengthSP >= 6.75 && CKWSRatio >= 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && CPerRatioNE >= 0.29 && InsertSpan < 253057 && TitleRatio < 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && CPerRatioNE >= 0.29 && InsertSpan < 253057 && TitleRatio >= 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && CPerRatioNE >= 0.29 && InsertSpan >= 253057 && EpochSpan < 251259.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (InsertSpan >= 72684 && CPerRatioNE >= 0.29 && InsertSpan >= 253057 && EpochSpan >= 251259.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio < 0.5 && ChannelRatio < 0.3 && COrgRatioSP < 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio < 0.5 && ChannelRatio < 0.3 && COrgRatioSP >= 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio < 0.5 && ChannelRatio >= 0.3 && SimhashDist < 67.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio < 0.5 && ChannelRatio >= 0.3 && SimhashDist >= 67.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio >= 0.5 && CKWSRatio < 0.26 && TKWSRatio < 0.53) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio >= 0.5 && CKWSRatio < 0.26 && TKWSRatio >= 0.53) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio >= 0.5 && CKWSRatio >= 0.26 && TitleRatio < 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.31 && CatRatio >= 0.5 && CKWSRatio >= 0.26 && TitleRatio >= 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && InsertSpan < 251729 && COrgRatioSP < 0.91 && TitleRatio < 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && InsertSpan < 251729 && COrgRatioSP < 0.91 && TitleRatio >= 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && InsertSpan < 251729 && COrgRatioSP >= 0.91 && CNUMRatioSP < 0.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && InsertSpan < 251729 && COrgRatioSP >= 0.91 && CNUMRatioSP >= 0.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && InsertSpan >= 251729 && TitleDist < 0.5 && CTimRatioSP < 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && InsertSpan >= 251729 && TitleDist < 0.5 && CTimRatioSP >= 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && InsertSpan >= 251729 && TitleDist >= 0.5 && CNUMRatioSP < 0.43) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.31 && InsertSpan >= 251729 && TitleDist >= 0.5 && CNUMRatioSP >= 0.43) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP < 0.29 && CKWSRatio < 0.22 && CatRatio < 0.55) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP < 0.29 && CKWSRatio < 0.22 && CatRatio >= 0.55) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP < 0.29 && CKWSRatio >= 0.22 && CNUMRatioSP < 0.4) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP < 0.29 && CKWSRatio >= 0.22 && CNUMRatioSP >= 0.4) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP >= 0.29 && SimhashDist < 65.5 && EpochSpan < 255480) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP >= 0.29 && SimhashDist < 65.5 && EpochSpan >= 255480) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP >= 0.29 && SimhashDist >= 65.5 && HKWSRatio < 0.56) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP < 0.6 && CPerRatioSP >= 0.29 && SimhashDist >= 65.5 && HKWSRatio >= 0.56) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && TitleDist < 0.5 && EpochSpan < 547200 && EpochSpan < 7516) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && TitleDist < 0.5 && EpochSpan < 547200 && EpochSpan >= 7516) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && TitleDist < 0.5 && EpochSpan >= 547200 && ChannelRatio < 0.76) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && TitleDist < 0.5 && EpochSpan >= 547200 && ChannelRatio >= 0.76) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && TitleDist >= 0.5 && InsertSpan < 146090 && CLocRatioSP < 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && TitleDist >= 0.5 && InsertSpan < 146090 && CLocRatioSP >= 0.46) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && TitleDist >= 0.5 && InsertSpan >= 146090 && CPerRatioNE < 0.32) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CTimRatioSP >= 0.6 && TitleDist >= 0.5 && InsertSpan >= 146090 && CPerRatioNE >= 0.32) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE < 0.92 && CNUMRatioSP < 0.53 && TKWSRatio < 0.58) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE < 0.92 && CNUMRatioSP < 0.53 && TKWSRatio >= 0.58) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE < 0.92 && CNUMRatioSP >= 0.53 && TitleRatio < 0.38) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE < 0.92 && CNUMRatioSP >= 0.53 && TitleRatio >= 0.38) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE >= 0.92 && EpochSpan < 84602.5 && CTimRatioSP < 0.97) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE >= 0.92 && EpochSpan < 84602.5 && CTimRatioSP >= 0.97) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE >= 0.92 && EpochSpan >= 84602.5 && CTimRatioSP < 0.9) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 66.5 && CLocRatioNE >= 0.92 && EpochSpan >= 84602.5 && CTimRatioSP >= 0.9) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio < 0.39 && CPerRatioNE < 0.21 && TKWSRatio < 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio < 0.39 && CPerRatioNE < 0.21 && TKWSRatio >= 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio < 0.39 && CPerRatioNE >= 0.21 && CTimRatioSP < 0.32) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio < 0.39 && CPerRatioNE >= 0.21 && CTimRatioSP >= 0.32) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio >= 0.39 && COrgRatioNE < 0.08 && CPerRatioNE < 0.09) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio >= 0.39 && COrgRatioNE < 0.08 && CPerRatioNE >= 0.09) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio >= 0.39 && COrgRatioNE >= 0.08 && COrgLengthNE < 22.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 66.5 && HKWSRatio >= 0.39 && COrgRatioNE >= 0.08 && COrgLengthNE >= 22.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP < 0.3 && CTimRatioSP < 0.38 && COrgRatioSP < 0.18) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP < 0.3 && CTimRatioSP < 0.38 && COrgRatioSP >= 0.18) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP < 0.3 && CTimRatioSP >= 0.38 && TitleRatio < 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP < 0.3 && CTimRatioSP >= 0.38 && TitleRatio >= 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP >= 0.3 && TitleRatio < 0.3 && CatRatio < 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP >= 0.3 && TitleRatio < 0.3 && CatRatio >= 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP >= 0.3 && TitleRatio >= 0.3 && SameSRC < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio < 0.57 && CPerRatioSP >= 0.3 && TitleRatio >= 0.3 && SameSRC >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && CPerRatioSP < 0.62 && TitleRatio < 0.24 && COrgRatioSP < 0.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && CPerRatioSP < 0.62 && TitleRatio < 0.24 && COrgRatioSP >= 0.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && CPerRatioSP < 0.62 && TitleRatio >= 0.24 && CPerRatioNE < 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && CPerRatioSP < 0.62 && TitleRatio >= 0.24 && CPerRatioNE >= 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && CPerRatioSP >= 0.62 && TitleDist < 1.5 && CNUMRatioSP < 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && CPerRatioSP >= 0.62 && TitleDist < 1.5 && CNUMRatioSP >= 0.83) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && CPerRatioSP >= 0.62 && TitleDist >= 1.5 && InsertSpan < 286186) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CatRatio >= 0.57 && CPerRatioSP >= 0.62 && TitleDist >= 1.5 && InsertSpan >= 286186) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio < 0.22 && CatRatio < 0.52 && TOrgLengthNE < 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio < 0.22 && CatRatio < 0.52 && TOrgLengthNE >= 1.25) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio < 0.22 && CatRatio >= 0.52 && SimhashDist < 67.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio < 0.22 && CatRatio >= 0.52 && SimhashDist >= 67.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio >= 0.22 && InsertSpan < 102235.5 && COrgRatioSP < 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio >= 0.22 && InsertSpan < 102235.5 && COrgRatioSP >= 0.52) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio >= 0.22 && InsertSpan >= 102235.5 && CLocRatioSP < 0.6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && CKWSRatio >= 0.22 && InsertSpan >= 102235.5 && CLocRatioSP >= 0.6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist < 20.5 && CLocRatioNE < 0.94 && CPerRatioSP < 0.56) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist < 20.5 && CLocRatioNE < 0.94 && CPerRatioSP >= 0.56) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist < 20.5 && CLocRatioNE >= 0.94 && TOrgLengthSP < 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist < 20.5 && CLocRatioNE >= 0.94 && TOrgLengthSP >= 2.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist >= 20.5 && InsertSpan < 251438 && CPerRatioSP < 0.48) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist >= 20.5 && InsertSpan < 251438 && CPerRatioSP >= 0.48) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist >= 20.5 && InsertSpan >= 251438 && SimhashDist < 63.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && SimhashDist >= 20.5 && InsertSpan >= 251438 && SimhashDist >= 63.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio < 0.5 && EpochSpan < 13723.5 && TitleRatio < 0.17) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio < 0.5 && EpochSpan < 13723.5 && TitleRatio >= 0.17) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio < 0.5 && EpochSpan >= 13723.5 && COrgRatioNE < 0.16) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio < 0.5 && EpochSpan >= 13723.5 && COrgRatioNE >= 0.16) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio >= 0.5 && CKWSRatio < 0.24 && InsertSpan < 30188) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio >= 0.5 && CKWSRatio < 0.24 && InsertSpan >= 30188) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio >= 0.5 && CKWSRatio >= 0.24 && CNUMRatioSP < 0.45) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio < 0.34 && CatRatio >= 0.5 && CKWSRatio >= 0.24 && CNUMRatioSP >= 0.45) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && COrgRatioSP < 0.71 && CPerRatioNE < 0.32 && CKWSRatio < 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && COrgRatioSP < 0.71 && CPerRatioNE < 0.32 && CKWSRatio >= 0.29) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && COrgRatioSP < 0.71 && CPerRatioNE >= 0.32 && SimhashDist < 63.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && COrgRatioSP < 0.71 && CPerRatioNE >= 0.32 && SimhashDist >= 63.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && COrgRatioSP >= 0.71 && TitleDist < 0.5 && SimhashDist < 15.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && COrgRatioSP >= 0.71 && TitleDist < 0.5 && SimhashDist >= 15.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && COrgRatioSP >= 0.71 && TitleDist >= 0.5 && CPerLengthNE < 2.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TKWSRatio >= 0.34 && COrgRatioSP >= 0.71 && TitleDist >= 0.5 && CPerLengthNE >= 2.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio < 0.33 && HKWSRatio < 0.32 && CKWSRatio < 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio < 0.33 && HKWSRatio < 0.32 && CKWSRatio >= 0.2) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio < 0.33 && HKWSRatio >= 0.32 && SimhashDist < 70.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio < 0.33 && HKWSRatio >= 0.32 && SimhashDist >= 70.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio >= 0.33 && EpochSpan < 85449 && CLocRatioSP < 0.64) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio >= 0.33 && EpochSpan < 85449 && CLocRatioSP >= 0.64) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio >= 0.33 && EpochSpan >= 85449 && SimhashDist < 70.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.34 && TKWSRatio >= 0.33 && EpochSpan >= 85449 && SimhashDist >= 70.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && EpochSpan < 72154.5 && TitleRatio < 0.9 && TitleRatio < 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && EpochSpan < 72154.5 && TitleRatio < 0.9 && TitleRatio >= 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && EpochSpan < 72154.5 && TitleRatio >= 0.9 && CKWSRatio < 0.79) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && EpochSpan < 72154.5 && TitleRatio >= 0.9 && CKWSRatio >= 0.79) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && EpochSpan >= 72154.5 && CNUMLengthSP < 5.25 && SimhashDist < 65.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && EpochSpan >= 72154.5 && CNUMLengthSP < 5.25 && SimhashDist >= 65.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && EpochSpan >= 72154.5 && CNUMLengthSP >= 5.25 && CKWSRatio < 0.48) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.34 && EpochSpan >= 72154.5 && CNUMLengthSP >= 5.25 && CKWSRatio >= 0.48) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP < 0.29 && TKWSRatio < 0.33 && CPerRatioSP < 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP < 0.29 && TKWSRatio < 0.33 && CPerRatioSP >= 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP < 0.29 && TKWSRatio >= 0.33 && TKWSRatio < 0.6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP < 0.29 && TKWSRatio >= 0.33 && TKWSRatio >= 0.6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP >= 0.29 && TKWSRatio < 0.38 && CPerRatioNE < 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP >= 0.29 && TKWSRatio < 0.38 && CPerRatioNE >= 0.26) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP >= 0.29 && TKWSRatio >= 0.38 && CKWSRatio < 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio < 0.32 && COrgRatioSP >= 0.29 && TKWSRatio >= 0.38 && CKWSRatio >= 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist < 0.5 && EpochSpan < 82174 && COrgRatioSP < 0.53) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist < 0.5 && EpochSpan < 82174 && COrgRatioSP >= 0.53) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist < 0.5 && EpochSpan >= 82174 && CPerRatioNE < 0.39) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist < 0.5 && EpochSpan >= 82174 && CPerRatioNE >= 0.39) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist >= 0.5 && HKWSRatio < 0.59 && COrgRatioNE < 0.39) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist >= 0.5 && HKWSRatio < 0.59 && COrgRatioNE >= 0.39) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist >= 0.5 && HKWSRatio >= 0.59 && TKWSRatio < 0.56) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (ChannelRatio >= 0.32 && TitleDist >= 0.5 && HKWSRatio >= 0.59 && TKWSRatio >= 0.56) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio < 0.8 && CKWSRatio < 0.36 && CKWSRatio < 0.16) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio < 0.8 && CKWSRatio < 0.36 && CKWSRatio >= 0.16) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio < 0.8 && CKWSRatio >= 0.36 && HKWSRatio < 0.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio < 0.8 && CKWSRatio >= 0.36 && HKWSRatio >= 0.49) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio >= 0.8 && TitleRatio < 0.91 && InsertSpan < 251747) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio >= 0.8 && TitleRatio < 0.91 && InsertSpan >= 251747) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio >= 0.8 && TitleRatio >= 0.91 && EpochSpan < 84486) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist < 68.5 && CatRatio >= 0.8 && TitleRatio >= 0.91 && EpochSpan >= 84486) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && CKWSRatio < 0.24 && TOrgRatioSP < 0.58 && COrgRatioNE < 0.07) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && CKWSRatio < 0.24 && TOrgRatioSP < 0.58 && COrgRatioNE >= 0.07) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && CKWSRatio < 0.24 && TOrgRatioSP >= 0.58 && CKWSRatio < 0.16) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && CKWSRatio < 0.24 && TOrgRatioSP >= 0.58 && CKWSRatio >= 0.16) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && CKWSRatio >= 0.24 && TitleRatio < 0.32 && CTimRatioSP < 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && CKWSRatio >= 0.24 && TitleRatio < 0.32 && CTimRatioSP >= 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && CKWSRatio >= 0.24 && TitleRatio >= 0.32 && CLocRatioNE < 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (SimhashDist >= 68.5 && CKWSRatio >= 0.24 && TitleRatio >= 0.32 && CLocRatioNE >= 0.37) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.18 && CKWSRatio < 0.24 && SimhashDist < 68.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.18 && CKWSRatio < 0.24 && SimhashDist >= 68.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.18 && CKWSRatio >= 0.24 && SimhashDist < 77.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.18 && CKWSRatio >= 0.24 && SimhashDist >= 77.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.18 && CPerRatioNE < 0.31 && TKWSRatio < 0.55) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.18 && CPerRatioNE < 0.31 && TKWSRatio >= 0.55) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.18 && CPerRatioNE >= 0.31 && CPerRatioSP < 0.61) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.18 && CPerRatioNE >= 0.31 && CPerRatioSP >= 0.61) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && CPerRatioSP < 0.88 && ParagraphSpan < 3.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && CPerRatioSP < 0.88 && ParagraphSpan >= 3.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && CPerRatioSP >= 0.88 && CatRatio < 0.77) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && CPerRatioSP >= 0.88 && CatRatio >= 0.77) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && TitleRatio < 0.23 && CPerRatioNE < 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && TitleRatio < 0.23 && CPerRatioNE >= 0.28) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && TitleRatio >= 0.23 && HKWSRatio < 0.59) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && TitleRatio >= 0.23 && HKWSRatio >= 0.59) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio < 0.1 && CPerRatioSP < 0.27 && COrgRatioNE < 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio < 0.1 && CPerRatioSP < 0.27 && COrgRatioNE >= 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio < 0.1 && CPerRatioSP >= 0.27 && CTimRatioSP < 0.17) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio < 0.1 && CPerRatioSP >= 0.27 && CTimRatioSP >= 0.17) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio >= 0.1 && SimhashDist < 73.5 && CKWSRatio < 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio >= 0.1 && SimhashDist < 73.5 && CKWSRatio >= 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio >= 0.1 && SimhashDist >= 73.5 && InsertSpan < 60364.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio < 0.23 && TitleRatio >= 0.1 && SimhashDist >= 73.5 && InsertSpan >= 60364.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && TKWSRatio < 0.9 && CKWSRatio < 0.33 && TitleRatio < 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && TKWSRatio < 0.9 && CKWSRatio < 0.33 && TitleRatio >= 0.42) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && TKWSRatio < 0.9 && CKWSRatio >= 0.33 && EpochSpan < 255690) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && TKWSRatio < 0.9 && CKWSRatio >= 0.33 && EpochSpan >= 255690) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && TKWSRatio >= 0.9 && EpochSpan < 75738.5 && TitleDist < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && TKWSRatio >= 0.9 && EpochSpan < 75738.5 && TitleDist >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && TKWSRatio >= 0.9 && EpochSpan >= 75738.5 && EpochSpan < 316409) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (TitleRatio >= 0.23 && TKWSRatio >= 0.9 && EpochSpan >= 75738.5 && EpochSpan >= 316409) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.2 && SimhashDist < 73.5 && CKWSRatio < 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.2 && SimhashDist < 73.5 && CKWSRatio >= 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.2 && SimhashDist >= 73.5 && CPerRatioNE < 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio < 0.2 && SimhashDist >= 73.5 && CPerRatioNE >= 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.2 && EpochSpan < 250340.5 && COrgRatioSP < 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.2 && EpochSpan < 250340.5 && COrgRatioSP >= 0.31) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.2 && EpochSpan >= 250340.5 && CPerRatioSP < 0.6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && TitleRatio >= 0.2 && EpochSpan >= 250340.5 && CPerRatioSP >= 0.6) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && InsertSpan < 253722 && SimhashDist < 22.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && InsertSpan < 253722 && SimhashDist >= 22.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && InsertSpan >= 253722 && SimhashDist < 18.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist < 0.5 && InsertSpan >= 253722 && SimhashDist >= 18.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && ChannelRatio < 0.26 && CPerRatioSP < 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && ChannelRatio < 0.26 && CPerRatioSP >= 0.35) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && ChannelRatio >= 0.26 && EpochSpan < 252023.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleDist >= 0.5 && ChannelRatio >= 0.26 && EpochSpan >= 252023.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio < 0.51 && COrgRatioNE < 0.12 && TOrgRatioSP < 0.48) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio < 0.51 && COrgRatioNE < 0.12 && TOrgRatioSP >= 0.48) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio < 0.51 && COrgRatioNE >= 0.12 && CKWSRatio < 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio < 0.51 && COrgRatioNE >= 0.12 && CKWSRatio >= 0.3) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio >= 0.51 && CNUMRatioSP < 0.64 && COrgRatioNE < 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio >= 0.51 && CNUMRatioSP < 0.64 && COrgRatioNE >= 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio >= 0.51 && CNUMRatioSP >= 0.64 && EpochSpan < 86369.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.32 && CatRatio >= 0.51 && CNUMRatioSP >= 0.64 && EpochSpan >= 86369.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && TitleRatio < 0.88 && TKWSRatio < 0.56 && SimhashDist < 68.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && TitleRatio < 0.88 && TKWSRatio < 0.56 && SimhashDist >= 68.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && TitleRatio < 0.88 && TKWSRatio >= 0.56 && CKWSRatio < 0.34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && TitleRatio < 0.88 && TKWSRatio >= 0.56 && CKWSRatio >= 0.34) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && TitleRatio >= 0.88 && SimhashDist < 15.5 && COrgLengthSP < 29.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && TitleRatio >= 0.88 && SimhashDist < 15.5 && COrgLengthSP >= 29.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && TitleRatio >= 0.88 && SimhashDist >= 15.5 && ChannelRatio < 0.16) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.32 && TitleRatio >= 0.88 && SimhashDist >= 15.5 && ChannelRatio >= 0.16) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio < 0.27 && SimhashDist < 73.5 && COrgRatioNE < 0.18) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio < 0.27 && SimhashDist < 73.5 && COrgRatioNE >= 0.18) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio < 0.27 && SimhashDist >= 73.5 && CTimRatioSP < 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio < 0.27 && SimhashDist >= 73.5 && CTimRatioSP >= 0.47) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio >= 0.27 && TKWSRatio < 0.57 && CPerRatioNE < 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio >= 0.27 && TKWSRatio < 0.57 && CPerRatioNE >= 0.23) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio >= 0.27 && TKWSRatio >= 0.57 && EpochSpan < 77073) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP < 0.41 && TKWSRatio >= 0.27 && TKWSRatio >= 0.57 && EpochSpan >= 77073) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && CLocRatioSP < 0.94 && EpochSpan < 255231 && TitleRatio < 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && CLocRatioSP < 0.94 && EpochSpan < 255231 && TitleRatio >= 0.33) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && CLocRatioSP < 0.94 && EpochSpan >= 255231 && CPerRatioSP < 0.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && CLocRatioSP < 0.94 && EpochSpan >= 255231 && CPerRatioSP >= 0.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && CLocRatioSP >= 0.94 && COrgRatioSP < 0.93 && InsertSpan < 186700.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && CLocRatioSP >= 0.94 && COrgRatioSP < 0.93 && InsertSpan >= 186700.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && CLocRatioSP >= 0.94 && COrgRatioSP >= 0.93 && TitleLength < 6.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CPerRatioSP >= 0.41 && CLocRatioSP >= 0.94 && COrgRatioSP >= 0.93 && TitleLength >= 6.75) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan < 60896.5 && GeoRatio < 0.54 && COrgRatioSP < 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan < 60896.5 && GeoRatio < 0.54 && COrgRatioSP >= 0.22) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan < 60896.5 && GeoRatio >= 0.54 && CatRatio < 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan < 60896.5 && GeoRatio >= 0.54 && CatRatio >= 0.5) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan >= 60896.5 && TKWSRatio < 0.27 && CPerRatioNE < 0.19) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan >= 60896.5 && TKWSRatio < 0.27 && CPerRatioNE >= 0.19) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan >= 60896.5 && TKWSRatio >= 0.27 && EpochSpan < 254455) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP < 0.62 && EpochSpan >= 60896.5 && TKWSRatio >= 0.27 && EpochSpan >= 254455) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio < 0.9 && SimhashDist < 74.5 && EpochSpan < 255419) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio < 0.9 && SimhashDist < 74.5 && EpochSpan >= 255419) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio < 0.9 && SimhashDist >= 74.5 && HKWSRatio < 0.38) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio < 0.9 && SimhashDist >= 74.5 && HKWSRatio >= 0.38) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio >= 0.9 && SimhashDist < 12.5 && CLocRatioNE < 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio >= 0.9 && SimhashDist < 12.5 && CLocRatioNE >= 1) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio >= 0.9 && SimhashDist >= 12.5 && COrgRatioSP < 0.58) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		if (CNUMRatioSP >= 0.62 && TitleRatio >= 0.9 && SimhashDist >= 12.5 && COrgRatioSP >= 0.58) {
			sb.append("1,");
		} else {
			sb.append("0,");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println("test");
	}
}