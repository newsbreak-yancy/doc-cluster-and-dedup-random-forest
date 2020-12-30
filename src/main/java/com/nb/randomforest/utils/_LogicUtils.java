package com.nb.randomforest.utils;

import com.nb.randomforest.entity.EventFeature;import java.util.ArrayList;

/**
 * @author yuxi
 * @date Wed Dec 30 14:16:38 CST 2020
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
		int[] ints = new int[4];
if (COrgRatioSP < 0.49) {
	if (CKWSRatio < 0.24) {
		if (CatRatio < 0.53) {
			if (CKWSRatio < 0.13) {
				if (CLocLengthSP < 14.25) {
					if (SimhashDist < 60.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioNE < 0.72) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TKWSRatio < 0.28) {
					if (CLocLengthNE < 32.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 54999.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (HKWSRatio < 0.63) {
				if (CPerRatioNE < 0.3) {
					if (TKWSLength < 3.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.12) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleRatio < 0.42) {
					if (SimhashDist < 54.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CWordSpan < 448) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (SimhashDist < 65.5) {
			if (EpochSpan < 283127) {
				if (TitleRatio < 0.42) {
					if (HKWSRatio < 0.63) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSLength < 10.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (COrgLengthSP < 11.25) {
					if (TKWSRatio < 0.91) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioSP < 0.38) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.3) {
				if (EpochSpan < 81069) {
					if (CLocRatioNE < 0.59) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TLocRatioSP < 0.54) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (InsertSpan < 149513.5) {
					if (TitleRatio < 0.39) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.43) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (InsertSpan < 83825.5) {
		if (CPerRatioSP < 0.73) {
			if (TitleRatio < 0.26) {
				if (CKWSLength < 19.25) {
					if (EpochSpan < 20368) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSRatio < 0.49) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSLength < 8.75) {
					if (CNUMRatioSP < 0.73) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 38768.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (TitleDist < 0.5) {
				if (TOrgLengthSP < 2.5) {
					if (TitleLength < 2.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerLengthNE < 2.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleLength < 4.75) {
					if (CPerLengthNE < 1.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioNE < 0.83) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (EpochSpan < 255690) {
			if (SimhashDist < 71.5) {
				if (CPerRatioSP < 0.57) {
					if (CNUMLengthSP < 9.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CatLength < 0.88) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.7) {
					if (TitleRatio < 0.23) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (ChannelRatio < 0.95) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.19) {
				if (EpochSpan < 264162) {
					if (CatRatio < 0.74) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (ChannelRatio < 0.15) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (ChannelLength < 4.75) {
					if (CPerRatioNE < 0.83) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 64.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (CPerRatioNE < 0.32) {
	if (COrgRatioNE < 0.13) {
		if (CPerRatioNE < 0.04) {
			if (CKWSRatio < 0.23) {
				if (CKWSRatio < 0.06) {
					if (CPerLengthSP < 24.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSRatio < 0.55) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleRatio < 0.2) {
					if (EpochSpan < 46700.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioNE < 0.66) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.28) {
				if (TitleDist < 46.5) {
					if (CWordSpan < 1057) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.2) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (InsertSpan < 251421.5) {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleDist < 48) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (TitleRatio < 0.23) {
			if (ChannelRatio < 0.32) {
				if (COrgRatioSP < 0.42) {
					if (SimhashDist < 57.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.35) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (InsertSpan < 107359) {
					if (TitleDist < 56.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocLengthNE < 11.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CNUMLengthSP < 17.25) {
				if (TitleRatio < 0.52) {
					if (InsertSpan < 145863.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleLength < 6.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CLocRatioNE < 0.56) {
					if (TitleDist < 47.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CTimRatioSP < 0.9) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (EpochSpan < 72816.5) {
		if (COrgRatioSP < 0.86) {
			if (TitleRatio < 0.32) {
				if (COrgRatioSP < 0.6) {
					if (CKWSRatio < 0.24) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSRatio < 0.17) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerLengthNE < 1.25) {
					if (CLocRatioSP < 0.46) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 46.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CPerLengthNE < 1.75) {
				if (CNUMRatioSP < 0.71) {
					if (CLocRatioNE < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.2) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CTimRatioSP < 0.98) {
					if (TitleRatio < 0.94) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioNE < 0.83) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (TitleRatio < 0.37) {
			if (TitleRatio < 0.12) {
				if (CLocRatioSP < 0.68) {
					if (ChannelRatio < 0.23) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (HKWSRatio < 0.04) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.46) {
					if (SimhashDist < 69.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgLengthNE < 24.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (COrgLengthNE < 2.75) {
				if (TKWSRatio < 0.57) {
					if (EpochSpan < 105267) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerLengthNE < 6.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CNUMLengthSP < 13.25) {
					if (CKWSRatio < 0.37) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.97) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (HKWSRatio < 0.41) {
	if (SimhashDist < 69.5) {
		if (TitleDist < 0.5) {
			if (TitleLength < 5.5) {
				if (CTimRatioSP < 0.77) {
					if (InsertSpan < 171840) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 1233951) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (SimhashDist < 22.5) {
					if (TOrgLengthSP < 3.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 58449.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (COrgRatioSP < 0.27) {
				if (CLocRatioNE < 0.29) {
					if (CPerRatioNE < 0.07) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSRatio < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (SameSRC < 0.5) {
					if (TKWSRatio < 0.71) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 84300) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (TitleRatio < 0.17) {
			if (COrgRatioSP < 0.22) {
				if (CKWSRatio < 0.23) {
					if (CatLength < 1.85) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CTimRatioSP < 0.22) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.36) {
					if (EpochSpan < 241888) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 94320) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (COrgRatioSP < 0.45) {
				if (CPerRatioNE < 0.28) {
					if (COrgLengthNE < 3.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 194157) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.39) {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CTimRatioSP < 0.2) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (CPerRatioSP < 0.61) {
		if (CKWSRatio < 0.29) {
			if (InsertSpan < 32990) {
				if (CPerRatioSP < 0.23) {
					if (EpochSpan < 35455.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioNE < 0.07) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (COrgRatioNE < 0.25) {
					if (CPerRatioSP < 0.29) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 66.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.45) {
				if (CWordSpan < 2109.5) {
					if (TitleRatio < 0.26) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocLengthNE < 32) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 86393) {
					if (COrgRatioSP < 0.11) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (ChannelRatio < 0.87) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (TitleRatio < 0.91) {
			if (SimhashDist < 65.5) {
				if (SameSRC < 0.5) {
					if (CNUMRatioSP < 0.41) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CatLength < 1.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (InsertSpan < 169828.5) {
					if (SimhashDist < 79.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 590124) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (EpochSpan < 86361.5) {
				if (ChannelRatio < 0.9) {
					if (CatRatio < 0.77) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgLengthNE < 2.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CTimRatioSP < 0.86) {
					if (TitleLength < 7.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerLengthNE < 5.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (CPerRatioSP < 0.57) {
	if (CKWSRatio < 0.21) {
		if (TitleRatio < 0.19) {
			if (CatRatio < 0.52) {
				if (SimhashDist < 79.5) {
					if (CatRatio < 0.27) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 82332) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.29) {
					if (TitleRatio < 0.08) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioSP < 0.29) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (COrgRatioNE < 0.16) {
				if (SimhashDist < 68.5) {
					if (CKWSRatio < 0.09) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CatRatio < 0.88) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (HKWSRatio < 0.7) {
					if (SimhashDist < 69.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocLengthSP < 8.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (COrgRatioSP < 0.45) {
			if (EpochSpan < 84528) {
				if (TitleRatio < 0.36) {
					if (CLocLengthNE < 29.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSRatio < 0.46) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleRatio < 0.2) {
					if (CPerRatioSP < 0.38) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.41) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (EpochSpan < 83614.5) {
				if (ChannelRatio < 0.54) {
					if (CLocRatioNE < 0.28) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSLength < 7.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.53) {
					if (CWordSpan < 1518) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMLengthSP < 11.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (CNUMRatioSP < 0.74) {
		if (CKWSRatio < 0.3) {
			if (CNUMRatioSP < 0.28) {
				if (CatRatio < 0.78) {
					if (SimhashDist < 58.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 60525.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.17) {
					if (CKWSRatio < 0.08) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (HKWSRatio < 0.9) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (SameSRC < 0.5) {
				if (TPerRatioNE < 0.79) {
					if (COrgRatioSP < 0.47) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerLengthNE < 5.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleDist < 0.5) {
					if (EpochSpan < 86309.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.45) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (EpochSpan < 830) {
			if (TitleDist < 2.5) {
				if (CKWSRatio < 0.93) {
					if (CTimLengthSP < 1.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerLengthSP < 9.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleRatio < 0.16) {ints[1] = 1;}
				if (TitleRatio >= 0.16) {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (EpochSpan < 65850) {
				if (TitleRatio < 0.46) {
					if (CatLength < 1.49) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CatRatio < 0.76) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (InsertSpan < 252492.5) {
					if (COrgLengthNE < 2.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerLengthSP < 7.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (SimhashDist < 67.5) {
	if (InsertSpan < 251514.5) {
		if (TitleDist < 0.5) {
			if (CNUMRatioSP < 0.86) {
				if (EpochSpan < 83125) {
					if (CTimLengthSP < 2.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMLengthSP < 23.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CTimRatioSP < 0.85) {
					if (EpochSpan < 83642) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CTimLengthSP < 25.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.31) {
				if (CKWSRatio < 0.17) {
					if (TitleRatio < 0.21) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 83180) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CNUMLengthSP < 12.75) {
					if (TKWSRatio < 0.61) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioNE < 0.82) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (CPerRatioSP < 0.68) {
			if (CTimRatioSP < 0.77) {
				if (EpochSpan < 265888) {
					if (CTimLengthSP < 7.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocLengthSP < 8.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (ChannelRatio < 0.87) {
					if (TKWSLength < 4.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 38.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (EpochSpan < 249649.5) {
				if (CNUMRatioSP < 0.52) {
					if (CLocLengthNE < 4.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (ChannelRatio < 0.45) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (SimhashDist < 21.5) {
					if (CKWSLength < 9) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 602974) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (TitleRatio < 0.19) {
		if (CTimRatioSP < 0.47) {
			if (CatRatio < 0.55) {
				if (ChannelRatio < 0.11) {
					if (CLocLengthNE < 12.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioNE < 0.06) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.36) {
					if (CPerRatioSP < 0.33) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.11) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (TKWSRatio < 0.28) {
				if (CPerRatioNE < 0.42) {
					if (CKWSRatio < 0.21) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 59625) {
					if (CLocRatioNE < 0.44) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgLengthNE < 6.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (CKWSRatio < 0.27) {
			if (EpochSpan < 45383.5) {
				if (CKWSRatio < 0.18) {
					if (CatRatio < 0.74) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioNE < 0.3) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TOrgLengthNE < 1.25) {
					if (EpochSpan < 340607) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CatLength < 0.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.49) {
				if (SimhashDist < 76.5) {
					if (CNUMRatioSP < 0.64) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleDist < 52.5) {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 125979.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (TKWSRatio < 0.43) {
	if (ChannelRatio < 0.26) {
		if (CKWSRatio < 0.22) {
			if (COrgRatioSP < 0.15) {
				if (CPerRatioSP < 0.34) {
					if (EpochSpan < 14663.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CWordSpan < 356) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CLocLengthNE < 27.25) {
					if (CatRatio < 0.55) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgLengthSP < 13.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (EpochSpan < 59078) {
				if (COrgRatioNE < 0.49) {
					if (GeoRatio < 0.73) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgLengthNE < 51.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.44) {
					if (CLocLengthSP < 22) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.46) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (SimhashDist < 69.5) {
			if (CNUMRatioSP < 0.73) {
				if (HKWSRatio < 0.64) {
					if (CKWSRatio < 0.29) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleDist < 23.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (ChannelRatio < 0.85) {
					if (EpochSpan < 264888.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgLengthSP < 4.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (EpochSpan < 72564) {
				if (CLocRatioNE < 0.39) {
					if (CKWSRatio < 0.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.61) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleRatio < 0.2) {
					if (CKWSRatio < 0.3) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioSP < 0.24) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (TitleRatio < 0.91) {
		if (COrgRatioSP < 0.46) {
			if (SimhashDist < 66.5) {
				if (CPerRatioSP < 0.58) {
					if (InsertSpan < 108724.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 287912.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 136684.5) {
					if (TitleRatio < 0.47) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioSP < 0.3) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (SameSRC < 0.5) {
				if (EpochSpan < 251173) {
					if (TKWSRatio < 0.65) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioNE < 0.65) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.77) {
					if (InsertSpan < 185765.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.45) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (InsertSpan < 69970.5) {
			if (CTimRatioSP < 0.36) {
				if (CKWSRatio < 0.46) {
					if (SimhashDist < 64) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgLengthNE < 3.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (SameSRC < 0.5) {
					if (TitleLength < 17.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 12.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (EpochSpan < 151086) {
				if (CNUMRatioSP < 0.46) {
					if (InsertSpan < 75857.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 17.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleLength < 7.75) {
					if (CPerRatioNE < 0.81) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 47.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (SimhashDist < 69.5) {
	if (CNUMRatioSP < 0.73) {
		if (InsertSpan < 251085) {
			if (CKWSRatio < 0.29) {
				if (HKWSRatio < 0.42) {
					if (TKWSRatio < 0.37) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 12375.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerLengthNE < 2.25) {
					if (CNUMLengthSP < 13.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 83654.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.16) {
				if (TKWSRatio < 0.74) {
					if (CPerRatioSP < 0.47) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioSP < 0.54) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (HKWSRatio < 0.42) {
					if (COrgLengthSP < 28.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMLengthSP < 9.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (COrgRatioSP < 0.96) {
			if (TitleRatio < 0.39) {
				if (EpochSpan < 248793) {
					if (CLocLengthSP < 30) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerLengthSP < 5.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 251552.5) {
					if (CPerRatioSP < 0.54) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgRatioSP < 0.37) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.98) {
				if (EpochSpan < 75574) {
					if (COrgLengthSP < 7.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocLengthNE < 1.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TOrgLengthNE < 2.75) {
					if (TKWSRatio < 0.87) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TOrgLengthSP < 2.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (TitleRatio < 0.19) {
		if (ChannelRatio < 0.11) {
			if (CNUMRatioSP < 0.28) {
				if (COrgLengthSP < 6.25) {
					if (CKWSRatio < 0.37) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (ParagraphSpan < 27.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.32) {
					if (CKWSRatio < 0.21) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CTimRatioSP < 0.27) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (ChannelRatio < 0.34) {
				if (COrgRatioSP < 0.49) {
					if (SimhashDist < 77.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CTimRatioSP < 0.14) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.36) {
					if (TOrgRatioNE < 0.88) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.57) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (EpochSpan < 84164) {
			if (COrgRatioSP < 0.46) {
				if (CLocRatioSP < 0.36) {
					if (ChannelRatio < 0.29) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.38) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TKWSRatio < 0.42) {
					if (CatLength < 0.91) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioSP < 0.45) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.21) {
				if (CLocLengthSP < 2.25) {
					if (COrgLengthNE < 1.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerLengthNE < 33.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 305831.5) {
					if (CNUMRatioSP < 0.46) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CWordSpan < 894.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (COrgRatioSP < 0.4) {
	if (TKWSRatio < 0.29) {
		if (TitleRatio < 0.13) {
			if (SimhashDist < 69.5) {
				if (CPerLengthNE < 39.75) {
					if (CPerRatioSP < 0.06) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioNE < 0.54) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (HKWSRatio < 0.73) {
					if (CPerRatioNE < 0.19) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CatLength < 1.62) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.26) {
				if (SimhashDist < 74.5) {
					if (CKWSRatio < 0.26) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioSP < 0.33) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.23) {
					if (ChannelRatio < 0.81) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.29) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (CPerRatioSP < 0.27) {
			if (TKWSRatio < 0.55) {
				if (EpochSpan < 65308) {
					if (TitleLength < 13.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocLengthNE < 24.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (InsertSpan < 73292.5) {
					if (TitleRatio < 0.37) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 69.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.42) {
				if (CNUMRatioSP < 0.41) {
					if (EpochSpan < 216515) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 277569.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (HKWSRatio < 0.44) {
					if (TKWSRatio < 0.59) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleLength < 6.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (TKWSRatio < 0.69) {
		if (InsertSpan < 125648) {
			if (TKWSRatio < 0.29) {
				if (TitleRatio < 0.21) {
					if (CPerRatioNE < 0.52) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMLengthSP < 39.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 77346.5) {
					if (CPerRatioNE < 0.22) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgRatioNE < 1) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (InsertSpan < 259033) {
				if (TitleRatio < 0.23) {
					if (CPerRatioNE < 0.73) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioNE < 0.55) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.34) {
					if (EpochSpan < 257756) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMLengthSP < 12.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (EpochSpan < 75425) {
			if (TitleRatio < 0.89) {
				if (COrgLengthSP < 2.25) {
					if (CLocRatioSP < 0.47) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.31) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CTimRatioSP < 0.32) {
					if (CNUMLengthSP < 19.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CTimLengthSP < 2.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (COrgRatioNE < 0.1) {
				if (CNUMRatioSP < 0.33) {
					if (TKWSLength < 4.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.47) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 571438) {
					if (CPerRatioNE < 0.62) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocLengthSP < 2.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (SimhashDist < 69.5) {
	if (EpochSpan < 75811) {
		if (TitleRatio < 0.9) {
			if (CKWSLength < 6.75) {
				if (EpochSpan < 34200) {
					if (SimhashDist < 41) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.72) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TKWSRatio < 0.56) {
					if (CTimRatioSP < 0.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioSP < 0.37) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (COrgLengthSP < 3.25) {
				if (CTimLengthSP < 2.25) {
					if (COrgRatioSP < 1) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleLength < 2.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.85) {
					if (TKWSLength < 4.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSRatio < 1) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (TKWSRatio < 0.6) {
			if (HKWSRatio < 0.32) {
				if (CLocRatioSP < 0.48) {
					if (TitleRatio < 0.2) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioSP < 0.37) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.31) {
					if (CPerRatioNE < 0.18) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 310729) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (InsertSpan < 283159.5) {
				if (CPerRatioSP < 0.61) {
					if (CatLength < 1.51) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioSP < 0.3) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CLocRatioSP < 0.76) {
					if (ChannelLength < 3.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.64) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (CatRatio < 0.5) {
		if (CKWSRatio < 0.21) {
			if (TKWSRatio < 0.24) {
				if (CPerRatioNE < 0.05) {
					if (CLocRatioSP < 0.72) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSLength < 3.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (COrgRatioNE < 0.46) {
					if (TKWSRatio < 0.33) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 78.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.29) {
				if (ChannelRatio < 0.06) {
					if (CNUMRatioSP < 0.54) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.23) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (InsertSpan < 88485.5) {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (CKWSRatio < 0.24) {
			if (TOrgRatioSP < 0.52) {
				if (CPerRatioSP < 0.44) {
					if (CKWSRatio < 0.15) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerLengthSP < 13.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleDist < 39.5) {
					if (CLocLengthNE < 4.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgRatioSP < 0.69) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.41) {
				if (CPerRatioNE < 0.39) {
					if (CPerRatioSP < 0.47) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioNE < 0.77) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 103189.5) {
					if (TKWSRatio < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 175987) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (TitleRatio < 0.24) {
	if (CKWSRatio < 0.21) {
		if (ChannelRatio < 0.11) {
			if (CPerRatioSP < 0.62) {
				if (CatRatio < 0.54) {
					if (COrgRatioSP < 0.07) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.1) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CLocLengthSP < 4.75) {
					if (CPerRatioSP < 0.67) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.66) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (COrgRatioNE < 0.18) {
				if (CPerRatioSP < 0.29) {
					if (ParagraphSpan < 24.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgRatioSP < 0.29) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.1) {
					if (COrgRatioNE < 0.79) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 74.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (COrgRatioSP < 0.49) {
			if (TKWSRatio < 0.49) {
				if (CPerRatioSP < 0.57) {
					if (CTimLengthSP < 25.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioNE < 0.62) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (COrgRatioNE < 0.35) {
					if (HKWSRatio < 0.7) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSRatio < 0.55) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (TKWSRatio < 0.37) {
				if (CPerRatioNE < 0.43) {
					if (CLocRatioSP < 0.62) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.38) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CTimRatioSP < 0.37) {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (TitleDist < 0.5) {
		if (InsertSpan < 69970.5) {
			if (CKWSLength < 7.25) {
				if (InsertSpan < 27422) {
					if (ChannelLength < 3.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMLengthSP < 4) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.86) {
					if (TitleLength < 4.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TOrgLengthSP < 2.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CTimRatioSP < 0.84) {
				if (COrgLengthNE < 3.25) {
					if (EpochSpan < 76465.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSLength < 18.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CLocRatioNE < 0.86) {
					if (ParagraphSpan < 2.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.86) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (InsertSpan < 251438) {
			if (SimhashDist < 65.5) {
				if (CNUMRatioSP < 0.5) {
					if (EpochSpan < 83419) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CWordSpan < 16.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.31) {
					if (CPerRatioSP < 0.3) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioSP < 0.49) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CPerRatioNE < 0.59) {
				if (TKWSRatio < 0.23) {
					if (ParagraphSpan < 5.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 254653.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleRatio < 0.42) {
					if (CLocRatioNE < 0.84) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSLength < 12.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (CPerRatioSP < 0.32) {
	if (SimhashDist < 71.5) {
		if (InsertSpan < 110180) {
			if (TKWSRatio < 0.54) {
				if (CLocRatioSP < 0.57) {
					if (CWordSpan < 17.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 65065) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleRatio < 0.9) {
					if (EpochSpan < 83180) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMLengthSP < 21.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (SimhashDist < 27.5) {
				if (CNUMRatioSP < 0.82) {
					if (TitleRatio < 0.88) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (ChannelLength < 4.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleRatio < 0.13) {
					if (ChannelRatio < 0.15) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 85369) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (TPerRatioNE < 0.71) {
			if (CatRatio < 0.5) {
				if (CKWSRatio < 0.31) {
					if (CKWSRatio < 0.12) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 116493) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CLocRatioSP < 0.2) {
					if (TitleDist < 53.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (HKWSRatio < 0.62) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.25) {
				if (InsertSpan < 5872.5) {
					if (CatRatio < 0.88) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (ChannelRatio < 0.28) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 118183) {
					if (CLocLengthSP < 17.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (GeoRatio < 0.54) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (CNUMRatioSP < 0.74) {
		if (CTimRatioSP < 0.29) {
			if (CWordSpan < 1359.5) {
				if (CPerRatioSP < 0.63) {
					if (EpochSpan < 126499.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 255861) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (SimhashDist < 77.5) {
					if (InsertSpan < 154667.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {ints[1] = 1;}
			}
		} else {
			if (EpochSpan < 255000) {
				if (TitleRatio < 0.37) {
					if (SimhashDist < 64.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleLength < 6.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TKWSRatio < 0.5) {
					if (CLocLengthNE < 3.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.66) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (SimhashDist < 20.5) {
			if (TitleRatio < 0.92) {
				if (ParagraphSpan < 0.5) {
					if (TitleLength < 5.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSRatio < 0.97) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TOrgLengthNE < 2.75) {
					if (COrgLengthSP < 6.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerLengthSP < 2.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (EpochSpan < 336036.5) {
				if (TitleRatio < 0.38) {
					if (CTimRatioSP < 0.48) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerLengthNE < 2.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (SameSRC < 0.5) {
					if (COrgLengthSP < 3.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CatLength < 0.86) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (CKWSRatio < 0.27) {
	if (SimhashDist < 69.5) {
		if (EpochSpan < 61063) {
			if (CLocRatioSP < 0.72) {
				if (TitleRatio < 0.11) {
					if (CLocRatioNE < 0.34) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.42) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (ChannelLength < 1.75) {ints[1] = 1;}
				if (ChannelLength >= 1.75) {
					if (CatRatio < 0.28) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.56) {
				if (TOrgRatioSP < 0.72) {
					if (TitleDist < 44.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.12) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.58) {
					if (CPerLengthSP < 8.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioSP < 0.9) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (CPerRatioSP < 0.28) {
			if (TitleRatio < 0.14) {
				if (COrgRatioNE < 0.14) {
					if (CLocLengthSP < 19.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerLengthSP < 12.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 64126.5) {
					if (COrgRatioNE < 0.33) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.15) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (EpochSpan < 220948.5) {
				if (EpochSpan < 1718) {
					if (COrgLengthSP < 12) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.27) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.2) {ints[1] = 1;}
				if (CKWSRatio >= 0.2) {
					if (CNUMRatioSP < 0.74) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (SimhashDist < 19.5) {
		if (InsertSpan < 85875.5) {
			if (CLocRatioNE < 0.8) {
				if (CNUMRatioSP < 1) {
					if (COrgRatioNE < 1) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleLength < 17.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TKWSRatio < 1) {
					if (CLocRatioNE < 1) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.4) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CNUMRatioSP < 0.56) {
				if (COrgLengthSP < 2.75) {
					if (CWordSpan < 160) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (HKWSRatio < 0.9) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSLength < 2) {ints[1] = 1;}
				if (CKWSLength >= 2) {
					if (CLocRatioNE < 0.88) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (HKWSRatio < 0.55) {
			if (InsertSpan < 149617) {
				if (CPerRatioNE < 0.3) {
					if (TitleDist < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 63.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (InsertSpan < 267291) {
					if (CPerRatioNE < 0.56) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CTimRatioSP < 0.47) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (InsertSpan < 251530.5) {
				if (EpochSpan < 72108) {
					if (TitleRatio < 0.32) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioNE < 0.28) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (SameSRC < 0.5) {
					if (CNUMLengthSP < 4.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocLengthNE < 10.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (TitleRatio < 0.24) {
	if (TKWSRatio < 0.21) {
		if (ChannelRatio < 0.2) {
			if (CKWSRatio < 0.25) {
				if (CPerRatioNE < 0.43) {
					if (CatRatio < 0.54) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgRatioNE < 0.41) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleLength < 8.25) {
					if (CNUMLengthSP < 2.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 234176) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (SimhashDist < 71.5) {
				if (CLocLengthSP < 20.75) {
					if (CKWSRatio < 0.28) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.22) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CLocRatioNE < 0.55) {
					if (CWordSpan < 8.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 55069.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (HKWSRatio < 0.52) {
			if (CLocRatioNE < 0.57) {
				if (ChannelLength < 4.25) {
					if (CTimRatioSP < 0.26) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 79.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (COrgRatioSP < 0.45) {
					if (CKWSLength < 12.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 83328.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (InsertSpan < 308548.5) {
				if (CLocRatioNE < 0.56) {
					if (COrgRatioSP < 0.53) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.41) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (COrgLengthSP < 6.25) {
					if (TitleRatio < 0.23) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CWordSpan < 313) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (EpochSpan < 75486) {
		if (TitleRatio < 0.89) {
			if (SimhashDist < 71.5) {
				if (SameSRC < 0.5) {
					if (CPerRatioSP < 0.16) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioNE < 0.35) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TKWSRatio < 0.42) {
					if (CLocRatioNE < 0.31) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioSP < 0.46) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.46) {
				if (SameSRC < 0.5) {
					if (COrgRatioSP < 0.06) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 6154.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSLength < 7.25) {
					if (TitleLength < 9.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerLengthNE < 8.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (InsertSpan < 271170) {
			if (CKWSRatio < 0.3) {
				if (HKWSRatio < 0.78) {
					if (TitleDist < 59.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgLengthSP < 2.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerLengthSP < 2.75) {
					if (CKWSRatio < 0.55) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioNE < 0.39) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.73) {
				if (EpochSpan < 879481.5) {
					if (ParagraphSpan < 2.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMLengthSP < 9.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CLocRatioSP < 0.9) {
					if (ChannelLength < 4.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.42) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (TitleRatio < 0.23) {
	if (COrgRatioSP < 0.23) {
		if (CPerRatioSP < 0.24) {
			if (SimhashDist < 64.5) {
				if (TitleDist < 43.5) {
					if (ChannelRatio < 0.24) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 2767756) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (ParagraphSpan < 11.5) {
					if (CatRatio < 0.51) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CatRatio < 0.27) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.11) {
				if (CLocLengthSP < 23.25) {
					if (CPerLengthSP < 32.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CTimLengthSP < 17.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.23) {
					if (CKWSRatio < 0.27) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CatLength < 1.06) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (EpochSpan < 98074.5) {
			if (COrgRatioSP < 0.52) {
				if (CLocRatioNE < 0.25) {
					if (COrgLengthSP < 18.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioNE < 0.57) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CTimLengthSP < 37.25) {
					if (CKWSRatio < 0.28) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgLengthSP < 17.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CLocRatioSP < 0.6) {
				if (SimhashDist < 68.5) {
					if (TKWSRatio < 0.38) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.11) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (COrgRatioSP < 0.24) {
					if (CPerRatioSP < 0.44) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 81.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (EpochSpan < 83699) {
		if (TitleRatio < 0.9) {
			if (SimhashDist < 71.5) {
				if (TitleLength < 5.25) {
					if (GeoRatio < 0.58) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.29) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (COrgRatioSP < 0.46) {
					if (CPerRatioSP < 0.46) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CTimRatioSP < 0.2) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (COrgRatioSP < 0.44) {
				if (ChannelRatio < 0.72) {
					if (CPerLengthNE < 54) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.18) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TKWSLength < 5.25) {
					if (COrgLengthSP < 5.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 2043) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (EpochSpan < 255602) {
			if (HKWSLength < 1.75) {
				if (CKWSRatio < 0.32) {
					if (SimhashDist < 61.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.39) {
					if (COrgRatioSP < 0.31) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.4) {
				if (COrgRatioNE < 0.45) {
					if (COrgLengthNE < 4.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (ChannelRatio < 0.45) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (InsertSpan < 655886.5) {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioNE < 0.64) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (CKWSRatio < 0.29) {
	if (COrgRatioNE < 0.09) {
		if (ChannelRatio < 0.17) {
			if (COrgRatioSP < 0.17) {
				if (HKWSRatio < 0.38) {
					if (ChannelLength < 2.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 78.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.22) {
					if (TitleRatio < 0.3) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.11) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.32) {
				if (EpochSpan < 128354.5) {
					if (SimhashDist < 75.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.2) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 254597.5) {
					if (CKWSRatio < 0.22) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (ChannelRatio < 0.26) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (COrgRatioSP < 0.54) {
			if (CKWSRatio < 0.22) {
				if (TitleRatio < 0.18) {
					if (TitleDist < 42.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 61867) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.32) {
					if (EpochSpan < 115134.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 90704.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (COrgRatioNE < 0.87) {
				if (ChannelRatio < 0.17) {
					if (SimhashDist < 67.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 98888) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.87) {
					if (TitleRatio < 0.63) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {ints[1] = 1;}
			}
		}
	}
} else {
	if (CNUMRatioSP < 0.74) {
		if (SameSRC < 0.5) {
			if (InsertSpan < 251414) {
				if (TKWSRatio < 0.58) {
					if (CPerRatioSP < 0.54) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioSP < 0.6) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.32) {
					if (TKWSRatio < 0.18) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.46) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (TitleDist < 0.5) {
				if (CPerRatioNE < 0.25) {
					if (TitleLength < 7.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSLength < 13.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (HKWSRatio < 0.59) {
					if (CKWSRatio < 0.32) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSLength < 2.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (TitleDist < 1.5) {
			if (EpochSpan < 86310) {
				if (COrgRatioSP < 0.11) {
					if (InsertSpan < 3742.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TOrgLengthSP < 2.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.92) {
					if (COrgRatioSP < 0.71) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 328274.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (SameSRC < 0.5) {
				if (TitleRatio < 0.36) {
					if (CPerRatioSP < 0.49) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 266629) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CLocLengthSP < 20.25) {
					if (COrgLengthSP < 1.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSRatio < 0.91) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (TKWSRatio < 0.43) {
	if (CKWSRatio < 0.25) {
		if (COrgRatioNE < 0.17) {
			if (TitleRatio < 0.26) {
				if (CKWSRatio < 0.13) {
					if (TKWSRatio < 0.02) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.1) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CatLength < 0.95) {
					if (ChannelRatio < 0.79) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 68.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.15) {
				if (CPerRatioSP < 0.32) {
					if (CatLength < 1.3) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioNE < 0.44) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (COrgRatioSP < 0.5) {
					if (SimhashDist < 68.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (HKWSRatio < 0.7) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (CPerRatioNE < 0.4) {
			if (EpochSpan < 77768.5) {
				if (CLocRatioNE < 0.5) {
					if (SimhashDist < 69.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CWordSpan < 30.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CLocLengthNE < 13.25) {
					if (TitleRatio < 0.2) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgRatioSP < 0.63) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CPerLengthNE < 18.25) {
				if (CPerLengthSP < 0.75) {
					if (CWordSpan < 121) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 259109) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (InsertSpan < 33649.5) {
					if (COrgRatioSP < 0.97) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.4) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (InsertSpan < 81549) {
		if (TKWSRatio < 0.91) {
			if (CPerRatioSP < 0.48) {
				if (TKWSRatio < 0.57) {
					if (CKWSRatio < 0.31) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 69.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleLength < 5.25) {
					if (COrgLengthSP < 3.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioNE < 0.74) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CLocRatioNE < 0.7) {
				if (COrgRatioSP < 1) {
					if (CPerRatioSP < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 8.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (SimhashDist < 12.5) {
					if (ParagraphSpan < 17) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CTimRatioSP < 0.85) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (CPerRatioNE < 0.32) {
			if (EpochSpan < 229608.5) {
				if (COrgRatioNE < 0.15) {
					if (TitleRatio < 0.16) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 81808.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleRatio < 0.31) {
					if (SimhashDist < 81.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerLengthSP < 56.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (InsertSpan < 274622.5) {
				if (CPerRatioSP < 0.61) {
					if (TitleRatio < 0.34) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocLengthSP < 2.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 98822.5) {
					if (CatRatio < 0.73) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.27) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (InsertSpan < 72684) {
	if (TitleRatio < 0.23) {
		if (CKWSRatio < 0.22) {
			if (COrgRatioNE < 0.13) {
				if (CPerRatioNE < 0.72) {
					if (TKWSRatio < 0.35) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSLength < 13.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSLength < 19.25) {
					if (TitleDist < 76) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerLengthNE < 98.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.06) {
				if (SimhashDist < 76.5) {
					if (COrgRatioNE < 0.41) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.13) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TKWSRatio < 0.5) {
					if (CLocLengthSP < 19.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgRatioSP < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (CLocRatioSP < 0.52) {
			if (CPerRatioSP < 0.28) {
				if (TitleLength < 8.25) {
					if (GeoRatio < 0.62) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.33) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSLength < 9.25) {
					if (TitleDist < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 60.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (SimhashDist < 14.5) {
				if (TitleDist < 0.5) {
					if (COrgLengthNE < 2.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CTimLengthSP < 21.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.34) {
					if (TitleRatio < 0.52) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (ParagraphSpan < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (SimhashDist < 68.5) {
		if (EpochSpan < 255690) {
			if (TKWSRatio < 0.69) {
				if (CTimRatioSP < 0.18) {
					if (CPerRatioSP < 0.59) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (ChannelRatio < 0.34) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.56) {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.44) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.61) {
				if (CPerLengthNE < 29.25) {
					if (CKWSRatio < 0.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleDist < 46.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CNUMLengthSP < 13.75) {
					if (EpochSpan < 698395) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CatLength < 0.86) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (CKWSRatio < 0.26) {
			if (TKWSRatio < 0.36) {
				if (CatRatio < 0.55) {
					if (COrgRatioSP < 0.18) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleDist < 30.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CTimRatioSP < 0.26) {
					if (CatRatio < 0.6) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioSP < 0.71) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.33) {
				if (EpochSpan < 313380.5) {
					if (CKWSRatio < 0.31) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.1) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (ChannelRatio < 0.17) {
					if (TitleRatio < 0.51) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 249059.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (CPerRatioSP < 0.31) {
	if (CatRatio < 0.5) {
		if (ChannelRatio < 0.3) {
			if (COrgRatioSP < 0.37) {
				if (SimhashDist < 67.5) {
					if (SimhashDist < 42.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSRatio < 0.33) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleRatio < 0.23) {
					if (COrgLengthSP < 8.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerLengthSP < 9.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (SimhashDist < 67.5) {
				if (InsertSpan < 23473.5) {
					if (COrgLengthNE < 2) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioSP < 0.65) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.19) {
					if (EpochSpan < 72451) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.23) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (COrgRatioSP < 0.43) {
			if (TitleRatio < 0.31) {
				if (CTimRatioSP < 0.45) {
					if (CKWSRatio < 0.24) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CTimLengthSP < 27.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TKWSRatio < 0.55) {
					if (COrgRatioNE < 0.31) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgLengthNE < 15.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (EpochSpan < 85866) {
				if (TitleDist < 0.5) {
					if (COrgRatioNE < 0.08) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioSP < 0.58) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CatLength < 0.78) {
					if (CTimRatioSP < 0.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgRatioSP < 0.51) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (CNUMRatioSP < 0.74) {
		if (CPerRatioSP < 0.61) {
			if (InsertSpan < 93931.5) {
				if (TKWSRatio < 0.44) {
					if (CPerLengthNE < 1.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CLocRatioSP < 0.57) {
					if (TitleRatio < 0.22) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 251250.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (SimhashDist < 63.5) {
				if (TPerRatioSP < 0.75) {
					if (TitleDist < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CatLength < 0.9) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 127910.5) {
					if (TitleRatio < 0.37) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.3) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (COrgRatioSP < 0.91) {
			if (ChannelRatio < 0.77) {
				if (EpochSpan < 340387.5) {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioSP < 0.53) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (COrgLengthSP < 3.25) {
					if (CLocRatioNE < 0.95) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CatLength < 1.34) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (TitleDist < 1.5) {
				if (TitleLength < 17.5) {
					if (TOrgLengthSP < 2.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerLengthSP < 2) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CLocRatioNE < 0.8) {
					if (ChannelLength < 4.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (CTimRatioSP < 0.6) {
	if (CPerRatioSP < 0.29) {
		if (CKWSRatio < 0.22) {
			if (CatRatio < 0.55) {
				if (CLocLengthSP < 14.25) {
					if (CKWSRatio < 0.12) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 1370) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (HKWSRatio < 0.9) {
					if (TitleDist < 11) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 8672.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (EpochSpan < 79416) {
				if (TKWSRatio < 0.56) {
					if (CLocRatioNE < 0.2) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgRatioNE < 0.15) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (COrgRatioSP < 0.43) {
					if (CKWSRatio < 0.31) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 188207.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (TitleRatio < 0.38) {
			if (CKWSRatio < 0.29) {
				if (COrgRatioSP < 0.16) {
					if (CNUMRatioSP < 0.23) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CTimLengthSP < 21.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.65) {
					if (SimhashDist < 63.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSRatio < 0.2) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (SameSRC < 0.5) {
				if (EpochSpan < 251173) {
					if (CLocLengthSP < 6.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 71.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.44) {
					if (CPerRatioSP < 0.43) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 261999.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (SimhashDist < 14.5) {
		if (EpochSpan < 14.5) {
			if (ParagraphSpan < 23.5) {
				if (TOrgLengthNE < 2.5) {
					if (CKWSLength < 6.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgRatioNE < 1) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.6) {ints[1] = 1;}
				else {ints[1] = 1;}
			}
		} else {
			if (CLocRatioNE < 0.97) {
				if (TitleLength < 5.25) {
					if (CKWSRatio < 0.76) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.73) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TKWSRatio < 0.9) {
					if (CNUMLengthSP < 32.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CatRatio < 0.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (SameSRC < 0.5) {
			if (CPerRatioNE < 0.28) {
				if (InsertSpan < 84120) {
					if (SimhashDist < 77.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.53) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSLength < 8.75) {
					if (CTimLengthSP < 8.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSRatio < 0.49) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (COrgRatioSP < 0.82) {
				if (EpochSpan < 769583) {
					if (CLocLengthSP < 26.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 259553.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (ChannelLength < 4.75) {
					if (EpochSpan < 303386) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 81397) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (SimhashDist < 66.5) {
	if (CLocRatioNE < 0.92) {
		if (CNUMRatioSP < 0.53) {
			if (TKWSRatio < 0.58) {
				if (TitleRatio < 0.22) {
					if (EpochSpan < 95023) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioNE < 0.19) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (SameSRC < 0.5) {
					if (CNUMLengthSP < 7.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (HKWSRatio < 0.84) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (EpochSpan < 255419) {
				if (TitleLength < 5.75) {
					if (CKWSLength < 7.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioNE < 0.46) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CTimLengthSP < 4.25) {
					if (SimhashDist < 63.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioNE < 0.71) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (CNUMRatioSP < 0.74) {
			if (CKWSLength < 13.25) {
				if (CatLength < 1.44) {
					if (InsertSpan < 81086.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 15613) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (SimhashDist < 9.5) {ints[1] = 1;}
				if (SimhashDist >= 9.5) {
					if (EpochSpan < 86762) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.99) {
				if (CatLength < 1.08) {
					if (TKWSRatio < 0.29) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.83) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (SimhashDist < 37.5) {
					if (COrgLengthSP < 29.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 75557) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (HKWSRatio < 0.39) {
		if (TitleRatio < 0.18) {
			if (CTimRatioSP < 0.31) {
				if (ChannelRatio < 0.11) {
					if (COrgRatioSP < 0.24) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.19) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TKWSRatio < 0.16) {
					if (CTimRatioSP < 0.68) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioNE < 0.37) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (SameSRC < 0.5) {
				if (CKWSRatio < 0.31) {
					if (TKWSRatio < 0.52) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 154124) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.29) {
					if (SimhashDist < 73.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSRatio < 0.35) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (TitleRatio < 0.31) {
			if (InsertSpan < 107633.5) {
				if (TKWSRatio < 0.29) {
					if (CatRatio < 0.37) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgRatioSP < 0.63) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.25) {
					if (EpochSpan < 585810) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (HKWSLength < 1.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (EpochSpan < 60573.5) {
				if (TKWSRatio < 0.67) {
					if (COrgLengthSP < 15.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CTimRatioSP < 0.44) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (InsertSpan < 277057) {
					if (CPerRatioNE < 0.14) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.42) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (CatRatio < 0.57) {
	if (CPerRatioSP < 0.3) {
		if (CTimRatioSP < 0.38) {
			if (COrgRatioSP < 0.18) {
				if (TitleRatio < 0.44) {
					if (TitleRatio < 0.12) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleLength < 12.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleRatio < 0.11) {
					if (CLocLengthNE < 15.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.49) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (COrgRatioSP < 0.28) {
				if (TitleRatio < 0.21) {
					if (CTimLengthSP < 33.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.69) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleRatio < 0.22) {
					if (CLocLengthSP < 21) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.31) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (CKWSRatio < 0.32) {
			if (CPerLengthSP < 15.25) {
				if (InsertSpan < 282781.5) {
					if (SimhashDist < 59.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {ints[1] = 1;}
			} else {
				if (COrgRatioNE < 0.04) {
					if (CLocRatioNE < 0.78) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (ParagraphSpan < 7.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (EpochSpan < 78360) {
				if (InsertSpan < 7281) {
					if (CWordSpan < 48.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 60.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.15) {
					if (TitleDist < 70.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CWordSpan < 5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (TitleDist < 0.5) {
		if (EpochSpan < 82174) {
			if (CTimLengthSP < 0.75) {
				if (TKWSRatio < 0.79) {
					if (CKWSRatio < 0.73) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 703) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (InsertSpan < 1013855.5) {
					if (CNUMRatioSP < 0.82) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 1078898) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.64) {
				if (SameSRC < 0.5) {
					if (CatLength < 1.08) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioNE < 0.14) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSLength < 11.75) {
					if (SimhashDist < 3.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSLength < 1.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (SimhashDist < 71.5) {
			if (CNUMRatioSP < 0.41) {
				if (TitleRatio < 0.42) {
					if (CKWSRatio < 0.27) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (HKWSRatio < 0.36) {
					if (CLocRatioNE < 0.58) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 286186) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.26) {
				if (CPerRatioNE < 0.33) {
					if (TitleRatio < 0.17) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CatLength < 1.34) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 72662) {
					if (CNUMLengthSP < 35.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 234719.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (TitleRatio < 0.23) {
	if (CKWSRatio < 0.22) {
		if (CatRatio < 0.52) {
			if (TOrgLengthNE < 1.25) {
				if (COrgRatioNE < 0.56) {
					if (CPerRatioSP < 0.45) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMLengthSP < 28) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CTimLengthSP < 8.75) {
					if (ParagraphSpan < 6.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgRatioNE < 0.68) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.12) {
				if (TKWSLength < 2.75) {
					if (InsertSpan < 3259) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleDist < 60.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TKWSRatio < 0.72) {
					if (COrgLengthSP < 11.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioSP < 0.68) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (CKWSRatio < 0.38) {
			if (COrgRatioSP < 0.64) {
				if (CLocLengthSP < 14.25) {
					if (CPerRatioNE < 0.4) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSLength < 4.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (InsertSpan < 81415) {
					if (HKWSLength < 1.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSLength < 3.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (SameSRC < 0.5) {
				if (EpochSpan < 96655.5) {
					if (TKWSRatio < 0.52) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 457478) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleRatio < 0.11) {
					if (CLocLengthNE < 8.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleLength < 13.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (CNUMRatioSP < 0.72) {
		if (COrgRatioSP < 0.41) {
			if (CPerRatioSP < 0.3) {
				if (TitleDist < 0.5) {
					if (ChannelRatio < 0.52) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 83137.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.42) {
					if (EpochSpan < 256071) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 259110) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.38) {
				if (CNUMRatioSP < 0.53) {
					if (CKWSRatio < 0.33) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMLengthSP < 13.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.48) {
					if (COrgLengthSP < 3.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSLength < 9.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (TKWSRatio < 0.91) {
			if (CPerRatioSP < 0.68) {
				if (EpochSpan < 73595.5) {
					if (COrgRatioSP < 0.34) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.83) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 336036.5) {
					if (CPerLengthNE < 9.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 21.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (EpochSpan < 70445) {
				if (TOrgLengthSP < 2.5) {
					if (COrgLengthNE < 4.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSLength < 10.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TKWSLength < 1.5) {
					if (EpochSpan < 81244.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 20) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (TKWSRatio < 0.34) {
	if (CatRatio < 0.5) {
		if (EpochSpan < 13723.5) {
			if (TitleRatio < 0.17) {
				if (COrgRatioNE < 0.14) {
					if (CKWSRatio < 0.42) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocLengthSP < 11.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.17) {ints[1] = 1;}
				if (CKWSRatio >= 0.17) {
					if (ChannelRatio < 0.62) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CPerRatioNE < 0.21) {
				if (CKWSRatio < 0.21) {
					if (COrgLengthNE < 5.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CTimRatioSP < 0.62) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.32) {
					if (CWordSpan < 2035) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (ChannelRatio < 0.71) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (CPerRatioSP < 0.34) {
			if (TitleRatio < 0.1) {
				if (CKWSRatio < 0.25) {
					if (TPerRatioSP < 0.26) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 68516) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 26131.5) {
					if (SimhashDist < 74.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgRatioNE < 0.6) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (SimhashDist < 61.5) {
				if (TitleDist < 34.5) {
					if (CPerLengthSP < 1.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 226772) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleRatio < 0.23) {
					if (CLocRatioNE < 0.42) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 105073) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (TitleRatio < 0.93) {
		if (TitleRatio < 0.38) {
			if (InsertSpan < 110708.5) {
				if (CLocRatioSP < 0.47) {
					if (CPerRatioNE < 0.29) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.36) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.42) {
					if (CPerRatioNE < 0.2) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 226141) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (EpochSpan < 255212) {
				if (CPerRatioSP < 0.31) {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSLength < 9.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.72) {
					if (CPerRatioSP < 0.58) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioSP < 0.43) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (InsertSpan < 86316.5) {
			if (CPerRatioSP < 0.86) {
				if (SameSRC < 0.5) {
					if (CatRatio < 0.77) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 25370) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CWordSpan < 1.5) {
					if (CTimRatioSP < 0.91) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {ints[1] = 1;}
			}
		} else {
			if (COrgRatioNE < 0.54) {
				if (CWordSpan < 1.5) {
					if (EpochSpan < 603005.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 85281.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 223159.5) {
					if (CNUMRatioSP < 0.83) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CatLength < 0.91) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (ChannelRatio < 0.34) {
	if (TKWSRatio < 0.33) {
		if (HKWSRatio < 0.32) {
			if (CKWSRatio < 0.2) {
				if (SimhashDist < 65.5) {
					if (EpochSpan < 10707) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgRatioNE < 0.14) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (SimhashDist < 61.5) {
					if (EpochSpan < 161899.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.35) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.25) {
				if (CTimRatioSP < 0.3) {
					if (CPerLengthSP < 30) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 38.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.35) {
					if (COrgRatioNE < 0.67) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioNE < 0.67) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (TitleRatio < 0.31) {
			if (TitleRatio < 0.19) {
				if (CNUMRatioSP < 0.27) {
					if (CTimLengthSP < 7.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioNE < 0.31) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (COrgRatioSP < 0.49) {
					if (CLocRatioSP < 0.7) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 270728) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (SimhashDist < 64.5) {
				if (SameSRC < 0.5) {
					if (EpochSpan < 85059) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgRatioNE < 0.31) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CatRatio < 0.56) {
					if (InsertSpan < 109770) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioSP < 0.59) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (CPerRatioSP < 0.62) {
		if (TitleRatio < 0.26) {
			if (EpochSpan < 80232) {
				if (CPerRatioNE < 0.45) {
					if (SimhashDist < 74.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioSP < 0.44) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CLocLengthNE < 14.25) {
					if (CKWSRatio < 0.29) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgRatioSP < 0.11) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (InsertSpan < 129420) {
				if (CLocRatioSP < 0.54) {
					if (TKWSRatio < 0.58) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 73835.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.46) {
					if (COrgRatioSP < 0.6) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleLength < 13.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (CNUMRatioSP < 0.75) {
			if (InsertSpan < 270375.5) {
				if (EpochSpan < 250887.5) {
					if (SimhashDist < 67.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CatRatio < 0.78) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (SimhashDist < 69.5) {
					if (ParagraphSpan < 2.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgLengthNE < 2.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.9) {
				if (CLocLengthNE < 1.25) {
					if (TitleLength < 7.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 20893.5) {
					if (CNUMRatioSP < 1) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.96) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (ChannelRatio < 0.32) {
	if (COrgRatioSP < 0.29) {
		if (TKWSRatio < 0.33) {
			if (CPerRatioSP < 0.35) {
				if (COrgRatioNE < 0.09) {
					if (CatRatio < 0.52) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CTimRatioSP < 0.46) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.24) {
					if (CLocRatioSP < 0.36) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 154975.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (EpochSpan < 87988.5) {
				if (CPerRatioSP < 0.43) {
					if (HKWSRatio < 0.27) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleDist < 47.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CatRatio < 0.2) {
					if (CPerLengthNE < 5.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioNE < 0.28) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (TKWSRatio < 0.38) {
			if (SimhashDist < 68.5) {
				if (CKWSRatio < 0.22) {
					if (CTimLengthSP < 1.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMLengthSP < 9.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.25) {
					if (CPerRatioNE < 0.35) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 56725) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (InsertSpan < 143125.5) {
				if (TitleLength < 5.25) {
					if (CPerLengthNE < 26.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSRatio < 0.64) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CNUMLengthSP < 13.75) {
					if (CLocRatioNE < 0.6) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CTimRatioSP < 0.64) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (TitleDist < 0.5) {
		if (SimhashDist < 29.5) {
			if (TitleLength < 6.5) {
				if (COrgLengthSP < 4.25) {
					if (CNUMRatioSP < 0.59) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgRatioSP < 0.83) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (COrgLengthSP < 29.5) {
					if (EpochSpan < 19574) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioNE < 1) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (TitleLength < 6.5) {
				if (COrgLengthNE < 4.75) {
					if (EpochSpan < 48277) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.43) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (InsertSpan < 59109.5) {ints[1] = 1;}
				if (InsertSpan >= 59109.5) {
					if (ChannelLength < 4.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (CPerRatioSP < 0.52) {
			if (TitleRatio < 0.19) {
				if (CPerLengthSP < 5.75) {
					if (CTimRatioSP < 0.24) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocLengthSP < 15.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.22) {
					if (COrgRatioSP < 0.42) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 139220) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (InsertSpan < 284335) {
				if (SameSRC < 0.5) {
					if (TPerRatioNE < 0.79) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgRatioSP < 0.77) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleRatio < 0.87) {
					if (CLocLengthSP < 9.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocLengthSP < 28.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (SimhashDist < 68.5) {
	if (CatRatio < 0.8) {
		if (CKWSRatio < 0.36) {
			if (CKWSRatio < 0.16) {
				if (COrgLengthNE < 11.25) {
					if (CLocRatioNE < 0.65) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioNE < 0.71) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 256014) {
					if (TitleRatio < 0.3) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocLengthNE < 8.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CNUMRatioSP < 0.53) {
				if (CPerRatioNE < 0.55) {
					if (TitleRatio < 0.24) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.31) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CLocRatioNE < 0.86) {
					if (InsertSpan < 436982.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.55) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (CNUMRatioSP < 0.74) {
			if (CPerRatioNE < 0.24) {
				if (TOrgRatioSP < 0.55) {
					if (TitleRatio < 0.17) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 86393) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (InsertSpan < 256392.5) {
					if (TitleRatio < 0.34) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMLengthSP < 15.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.96) {
				if (SameSRC < 0.5) {
					if (EpochSpan < 256035) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (GeoLength < 3.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleRatio < 0.89) {
					if (COrgRatioSP < 1) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleLength < 3.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (TKWSRatio < 0.34) {
		if (TitleRatio < 0.11) {
			if (COrgRatioNE < 0.09) {
				if (CatRatio < 0.75) {
					if (CLocRatioNE < 0.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.2) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.34) {
					if (CPerRatioNE < 0.55) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocLengthSP < 9.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.42) {
				if (COrgRatioSP < 0.41) {
					if (InsertSpan < 82012.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CatLength < 1.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.52) {
					if (CPerLengthSP < 11.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CWordSpan < 16.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (COrgRatioSP < 0.45) {
			if (TKWSRatio < 0.57) {
				if (CPerRatioNE < 0.39) {
					if (CatRatio < 0.47) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.24) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (InsertSpan < 81983) {
					if (CKWSRatio < 0.29) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 49087) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (EpochSpan < 114206) {
				if (TitleRatio < 0.31) {
					if (ChannelRatio < 0.53) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CWordSpan < 3) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CTimLengthSP < 5.75) {
					if (ChannelLength < 2.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (HKWSRatio < 0.93) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (CNUMRatioSP < 0.62) {
	if (TitleRatio < 0.18) {
		if (CKWSRatio < 0.24) {
			if (SimhashDist < 68.5) {
				if (COrgRatioNE < 0.2) {
					if (CPerRatioNE < 0.39) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioNE < 0.2) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.09) {
					if (CatRatio < 0.81) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioSP < 0.33) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CTimRatioSP < 0.18) {
				if (CPerRatioNE < 0.22) {
					if (CNUMLengthSP < 10.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleDist < 85.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.38) {
					if (EpochSpan < 76579.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (ParagraphSpan < 71.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (ChannelRatio < 0.27) {
			if (InsertSpan < 78375) {
				if (COrgLengthSP < 20.25) {
					if (CKWSRatio < 0.16) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSRatio < 0.57) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (SimhashDist < 71.5) {
					if (EpochSpan < 255762.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.28) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (InsertSpan < 251136) {
				if (EpochSpan < 83315.5) {
					if (SimhashDist < 68.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioSP < 0.56) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (HKWSRatio < 0.39) {
					if (CPerRatioSP < 0.61) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioSP < 0.68) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (TitleRatio < 0.93) {
		if (TitleRatio < 0.23) {
			if (CPerRatioNE < 0.28) {
				if (COrgRatioSP < 0.48) {
					if (COrgRatioSP < 0.23) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (ParagraphSpan < 2.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (SimhashDist < 80.5) {
					if (COrgLengthSP < 2.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioSP < 0.53) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CPerRatioNE < 0.52) {
				if (CLocRatioSP < 0.69) {
					if (HKWSRatio < 0.84) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSLength < 19.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioNE < 1) {
					if (TKWSLength < 10.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioNE < 0.72) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (InsertSpan < 78418.5) {
			if (EpochSpan < 27619) {
				if (CKWSLength < 5.75) {
					if (TitleLength < 10.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.94) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CLocLengthNE < 9.25) {ints[1] = 1;}
				if (CLocLengthNE >= 9.25) {
					if (GeoLength < 2.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CLocRatioSP < 0.72) {
				if (CWordSpan < 51) {
					if (ParagraphSpan < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocLengthNE < 1.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleLength < 5.5) {
					if (COrgRatioSP < 0.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 103324) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (TitleRatio < 0.23) {
	if (TitleRatio < 0.1) {
		if (CPerRatioSP < 0.27) {
			if (COrgRatioNE < 0.3) {
				if (CTimRatioSP < 0.36) {
					if (CLocLengthNE < 18.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CTimLengthSP < 19.75) {
					if (HKWSRatio < 0.78) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocLengthNE < 10.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.24) {
				if (EpochSpan < 154065) {
					if (TKWSRatio < 0.13) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {ints[1] = 1;}
			} else {
				if (CatLength < 1.61) {
					if (EpochSpan < 95350.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioSP < 0.31) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (COrgRatioNE < 0.07) {
			if (CPerRatioSP < 0.29) {
				if (CatLength < 1.85) {
					if (CKWSRatio < 0.22) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 327978) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TKWSRatio < 0.42) {
					if (CWordSpan < 333.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 255480) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.37) {
				if (CPerRatioNE < 0.36) {
					if (COrgRatioSP < 0.18) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (ChannelRatio < 0.69) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.48) {
					if (CatLength < 1.11) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (SimhashDist < 22.5) {
		if (TitleRatio < 0.88) {
			if (TitleDist < 10.5) {
				if (EpochSpan < 321) {ints[1] = 1;}
				if (EpochSpan >= 321) {
					if (TitleLength < 6.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleDist < 20.5) {
					if (CLocRatioNE < 0.36) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgLengthSP < 7.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CNUMRatioSP < 0.58) {
				if (CKWSRatio < 1) {
					if (TitleLength < 5.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.47) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TOrgLengthSP < 2.75) {
					if (CKWSLength < 6.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerLengthSP < 35.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (CPerRatioNE < 0.31) {
			if (TitleRatio < 0.42) {
				if (CLocLengthSP < 38) {
					if (TitleRatio < 0.31) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerLengthNE < 6.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CLocRatioSP < 0.54) {
					if (COrgRatioSP < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 85666.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CLocRatioSP < 0.73) {
				if (SameSRC < 0.5) {
					if (CTimRatioSP < 0.24) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.34) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleDist < 0.5) {
					if (TitleLength < 7.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 174722) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (CNUMRatioSP < 0.62) {
	if (TitleRatio < 0.2) {
		if (SimhashDist < 73.5) {
			if (CKWSRatio < 0.22) {
				if (CPerRatioNE < 0.22) {
					if (CatRatio < 0.76) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CatLength < 1.8) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.54) {
					if (CLocLengthSP < 9.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 112097.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.23) {
				if (SimhashDist < 83.5) {
					if (COrgRatioNE < 0.79) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.52) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 54882) {
					if (CNUMLengthSP < 27.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioNE < 0.35) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (CPerRatioSP < 0.61) {
			if (EpochSpan < 83107.5) {
				if (SimhashDist < 64.5) {
					if (CPerLengthNE < 1.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgRatioSP < 0.13) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (HKWSRatio < 0.47) {
					if (CLocRatioNE < 0.53) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgRatioSP < 0.42) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CPerLengthNE < 1.25) {
				if (SimhashDist < 13) {
					if (CNUMRatioSP < 0.13) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 82.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TKWSRatio < 0.65) {
					if (CKWSRatio < 0.3) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.49) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (TitleDist < 0.5) {
		if (SimhashDist < 36.5) {
			if (CTimLengthSP < 2.25) {
				if (EpochSpan < 713459) {
					if (CNUMRatioSP < 0.77) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {ints[1] = 1;}
			} else {
				if (CNUMLengthSP < 35.25) {
					if (ChannelRatio < 0.41) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 204819.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (EpochSpan < 83538.5) {
				if (HKWSLength < 1.25) {ints[1] = 1;}
				if (HKWSLength >= 1.25) {
					if (TitleLength < 7.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleLength < 5.5) {
					if (COrgLengthSP < 6) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 52.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (EpochSpan < 255578) {
			if (EpochSpan < 74161) {
				if (SimhashDist < 81.5) {
					if (CKWSRatio < 0.21) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSRatio < 0.49) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (SimhashDist < 73.5) {
					if (TitleDist < 24.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CatRatio < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.34) {
				if (CKWSRatio < 0.34) {
					if (TKWSLength < 1.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CWordSpan < 68.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CatLength < 1.34) {
					if (TKWSRatio < 0.73) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleLength < 7.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (CPerRatioSP < 0.32) {
	if (CatRatio < 0.51) {
		if (COrgRatioNE < 0.12) {
			if (TOrgRatioSP < 0.48) {
				if (CKWSRatio < 0.29) {
					if (CatRatio < 0.39) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocLengthNE < 14.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 339693.5) {
					if (TitleRatio < 0.24) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleLength < 8.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (SimhashDist < 68.5) {
				if (CWordSpan < 58) {
					if (TKWSRatio < 0.34) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.21) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CLocRatioSP < 0.53) {
					if (TitleRatio < 0.2) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 78603) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (InsertSpan < 83806.5) {
			if (CTimRatioSP < 0.4) {
				if (TitleRatio < 0.23) {
					if (COrgRatioNE < 0.12) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSRatio < 0.68) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.26) {
					if (CLocRatioNE < 0.24) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioNE < 0.2) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (EpochSpan < 163149) {
				if (CKWSRatio < 0.26) {
					if (SimhashDist < 64.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 75.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.28) {
					if (TKWSRatio < 0.36) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerLengthSP < 0.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (CNUMRatioSP < 0.83) {
		if (SimhashDist < 65.5) {
			if (TitleRatio < 0.37) {
				if (TitleRatio < 0.21) {
					if (CKWSRatio < 0.38) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CTimRatioSP < 0.29) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.56) {
					if (CLocLengthNE < 18.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSRatio < 0.6) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.28) {
				if (InsertSpan < 113838.5) {
					if (SimhashDist < 81.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TPerRatioSP < 0.85) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.65) {
					if (SameSRC < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 155702.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (CKWSRatio < 0.99) {
			if (EpochSpan < 75810.5) {
				if (CTimRatioSP < 0.95) {
					if (CatLength < 1.52) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioNE < 0.83) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CKWSRatio < 0.6) {
					if (SimhashDist < 77.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSLength < 13.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (TKWSRatio < 1) {
				if (CTimLengthSP < 9.5) {
					if (COrgLengthSP < 1.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgLengthSP < 29.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CNUMRatioSP < 1) {
					if (GeoLength < 2.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgLengthNE < 29.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (CPerRatioSP < 0.41) {
	if (TKWSRatio < 0.27) {
		if (SimhashDist < 73.5) {
			if (COrgRatioNE < 0.18) {
				if (CTimRatioSP < 0.33) {
					if (COrgRatioSP < 0.15) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioSP < 0.49) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 74822.5) {
					if (CLocRatioSP < 0.63) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioSP < 0.42) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.18) {
				if (CLocLengthNE < 18.25) {
					if (COrgRatioSP < 0.21) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleDist < 42.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (COrgRatioSP < 0.68) {
					if (CKWSRatio < 0.17) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (ChannelRatio < 0.17) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (InsertSpan < 140926) {
			if (SimhashDist < 71.5) {
				if (CNUMRatioSP < 0.36) {
					if (COrgRatioSP < 0.45) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSLength < 8.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (EpochSpan < 42075.5) {
					if (COrgRatioNE < 0.11) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.26) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.31) {
				if (SimhashDist < 67.5) {
					if (InsertSpan < 884138.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 396635.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (SimhashDist < 37.5) {
					if (CWordSpan < 224) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgLengthNE < 27.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (TitleDist < 0.5) {
		if (CLocRatioSP < 0.87) {
			if (CKWSRatio < 0.21) {ints[1] = 1;}
			if (CKWSRatio >= 0.21) {
				if (EpochSpan < 70173.5) {
					if (ParagraphSpan < 27.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TKWSLength < 1.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (TitleLength < 6.5) {
				if (COrgLengthSP < 4.75) {
					if (CWordSpan < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 133857) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CLocRatioNE < 1) {
					if (TKWSLength < 6.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgRatioSP < 1) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (EpochSpan < 255750) {
			if (SimhashDist < 68.5) {
				if (SameSRC < 0.5) {
					if (HKWSRatio < 0.68) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgLengthSP < 3.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (TitleRatio < 0.31) {
					if (CatRatio < 0.2) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (InsertSpan < 87452) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (SimhashDist < 63.5) {
				if (ChannelRatio < 0.44) {
					if (CPerRatioNE < 0.62) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMRatioSP < 0.66) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CLocRatioSP < 0.58) {
					if (TKWSRatio < 0.84) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioSP < 0.59) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
if (CNUMRatioSP < 0.62) {
	if (EpochSpan < 60896.5) {
		if (GeoRatio < 0.54) {
			if (COrgRatioSP < 0.22) {
				if (ChannelRatio < 0.16) {
					if (TKWSRatio < 0.27) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CPerRatioNE < 0.13) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CLocRatioNE < 0.08) {
					if (TitleRatio < 0.2) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 69.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.2) {
				if (ChannelRatio < 0.12) {
					if (CatRatio < 0.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (SimhashDist < 73.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.22) {
					if (CLocLengthSP < 2.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleRatio < 0.33) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (ChannelRatio < 0.23) {
			if (CKWSRatio < 0.28) {
				if (TitleRatio < 0.12) {
					if (COrgRatioNE < 0.21) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMLengthSP < 10.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CNUMLengthSP < 19.25) {
					if (EpochSpan < 180999.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (TitleDist < 34) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (TKWSRatio < 0.54) {
				if (SimhashDist < 71.5) {
					if (CLocRatioNE < 0.52) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSRatio < 0.29) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.42) {
					if (InsertSpan < 253757) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CNUMLengthSP < 12.75) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
} else {
	if (ChannelRatio < 0.94) {
		if (CKWSRatio < 0.27) {
			if (TKWSRatio < 0.38) {
				if (CatRatio < 0.52) {ints[1] = 1;}
				if (CatRatio >= 0.52) {
					if (CWordSpan < 519) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CTimRatioSP < 0.26) {
					if (TOrgLengthSP < 1.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 2646) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (InsertSpan < 266215.5) {
				if (ChannelRatio < 0.32) {
					if (CKWSRatio < 0.36) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (EpochSpan < 74108.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.78) {
					if (TitleLength < 5.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (COrgLengthNE < 1.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	} else {
		if (CKWSRatio < 0.97) {
			if (TKWSRatio < 0.9) {
				if (TitleRatio < 0.85) {
					if (CKWSLength < 12.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CKWSLength < 6.25) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			} else {
				if (CTimRatioSP < 0.88) {
					if (EpochSpan < 86363) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CatRatio < 0.77) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.93) {
				if (SimhashDist < 48.5) {
					if (CPerRatioSP < 1) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {ints[1] = 1;}
			} else {
				if (COrgLengthSP < 3.25) {
					if (TitleLength < 2.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocLengthNE < 47.5) {ints[1] = 1;}
					else {ints[1] = 1;}
				}
			}
		}
	}
}
		return sb.toString();
	}
}