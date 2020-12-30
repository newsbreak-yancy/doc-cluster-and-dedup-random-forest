package com.nb.randomforest.utils;

import com.nb.randomforest.entity.EventFeature;

/**
 * @author yuxi
 * @date Wed Dec 30 14:49:23 CST 2020
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
		int[] ints = new int[2048];
if (COrgRatioSP < 0.49) {
	if (CKWSRatio < 0.24) {
		if (CatRatio < 0.53) {
			if (CKWSRatio < 0.13) {
				if (CLocLengthSP < 14.25) {
					if (SimhashDist < 60.5) {ints[0] = 1;}
					else {ints[1] = 1;}
				} else {
					if (CLocRatioNE < 0.72) {ints[2] = 1;}
					else {ints[3] = 1;}
				}
			} else {
				if (TKWSRatio < 0.28) {
					if (CLocLengthNE < 32.25) {ints[4] = 1;}
					else {ints[5] = 1;}
				} else {
					if (InsertSpan < 54999.5) {ints[6] = 1;}
					else {ints[7] = 1;}
				}
			}
		} else {
			if (HKWSRatio < 0.63) {
				if (CPerRatioNE < 0.3) {
					if (TKWSLength < 3.75) {ints[8] = 1;}
					else {ints[9] = 1;}
				} else {
					if (TitleRatio < 0.12) {ints[10] = 1;}
					else {ints[11] = 1;}
				}
			} else {
				if (TitleRatio < 0.42) {
					if (SimhashDist < 54.5) {ints[12] = 1;}
					else {ints[13] = 1;}
				} else {
					if (CWordSpan < 448) {ints[14] = 1;}
					else {ints[15] = 1;}
				}
			}
		}
	} else {
		if (SimhashDist < 65.5) {
			if (EpochSpan < 283127) {
				if (TitleRatio < 0.42) {
					if (HKWSRatio < 0.63) {ints[16] = 1;}
					else {ints[17] = 1;}
				} else {
					if (CKWSLength < 10.75) {ints[18] = 1;}
					else {ints[19] = 1;}
				}
			} else {
				if (COrgLengthSP < 11.25) {
					if (TKWSRatio < 0.91) {ints[20] = 1;}
					else {ints[21] = 1;}
				} else {
					if (CPerRatioSP < 0.38) {ints[22] = 1;}
					else {ints[23] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.3) {
				if (EpochSpan < 81069) {
					if (CLocRatioNE < 0.59) {ints[24] = 1;}
					else {ints[25] = 1;}
				} else {
					if (TLocRatioSP < 0.54) {ints[26] = 1;}
					else {ints[27] = 1;}
				}
			} else {
				if (InsertSpan < 149513.5) {
					if (TitleRatio < 0.39) {ints[28] = 1;}
					else {ints[29] = 1;}
				} else {
					if (CKWSRatio < 0.43) {ints[30] = 1;}
					else {ints[31] = 1;}
				}
			}
		}
	}
} else {
	if (InsertSpan < 83825.5) {
		if (CPerRatioSP < 0.73) {
			if (TitleRatio < 0.26) {
				if (CKWSLength < 19.25) {
					if (EpochSpan < 20368) {ints[32] = 1;}
					else {ints[33] = 1;}
				} else {
					if (TKWSRatio < 0.49) {ints[34] = 1;}
					else {ints[35] = 1;}
				}
			} else {
				if (CKWSLength < 8.75) {
					if (CNUMRatioSP < 0.73) {ints[36] = 1;}
					else {ints[37] = 1;}
				} else {
					if (EpochSpan < 38768.5) {ints[38] = 1;}
					else {ints[39] = 1;}
				}
			}
		} else {
			if (TitleDist < 0.5) {
				if (TOrgLengthSP < 2.5) {
					if (TitleLength < 2.5) {ints[40] = 1;}
					else {ints[41] = 1;}
				} else {
					if (CPerLengthNE < 2.25) {ints[42] = 1;}
					else {ints[43] = 1;}
				}
			} else {
				if (TitleLength < 4.75) {
					if (CPerLengthNE < 1.75) {ints[44] = 1;}
					else {ints[45] = 1;}
				} else {
					if (CLocRatioNE < 0.83) {ints[46] = 1;}
					else {ints[47] = 1;}
				}
			}
		}
	} else {
		if (EpochSpan < 255690) {
			if (SimhashDist < 71.5) {
				if (CPerRatioSP < 0.57) {
					if (CNUMLengthSP < 9.25) {ints[48] = 1;}
					else {ints[49] = 1;}
				} else {
					if (CatLength < 0.88) {ints[50] = 1;}
					else {ints[51] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.7) {
					if (TitleRatio < 0.23) {ints[52] = 1;}
					else {ints[53] = 1;}
				} else {
					if (ChannelRatio < 0.95) {ints[54] = 1;}
					else {ints[55] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.19) {
				if (EpochSpan < 264162) {
					if (CatRatio < 0.74) {ints[56] = 1;}
					else {ints[57] = 1;}
				} else {
					if (ChannelRatio < 0.15) {ints[58] = 1;}
					else {ints[59] = 1;}
				}
			} else {
				if (ChannelLength < 4.75) {
					if (CPerRatioNE < 0.83) {ints[60] = 1;}
					else {ints[61] = 1;}
				} else {
					if (SimhashDist < 64.5) {ints[62] = 1;}
					else {ints[63] = 1;}
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
					if (CPerLengthSP < 24.75) {ints[64] = 1;}
					else {ints[65] = 1;}
				} else {
					if (TKWSRatio < 0.55) {ints[66] = 1;}
					else {ints[67] = 1;}
				}
			} else {
				if (TitleRatio < 0.2) {
					if (EpochSpan < 46700.5) {ints[68] = 1;}
					else {ints[69] = 1;}
				} else {
					if (CLocRatioNE < 0.66) {ints[70] = 1;}
					else {ints[71] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.28) {
				if (TitleDist < 46.5) {
					if (CWordSpan < 1057) {ints[72] = 1;}
					else {ints[73] = 1;}
				} else {
					if (TitleRatio < 0.2) {ints[74] = 1;}
					else {ints[75] = 1;}
				}
			} else {
				if (InsertSpan < 251421.5) {
					if (SameSRC < 0.5) {ints[76] = 1;}
					else {ints[77] = 1;}
				} else {
					if (TitleDist < 48) {ints[78] = 1;}
					else {ints[79] = 1;}
				}
			}
		}
	} else {
		if (TitleRatio < 0.23) {
			if (ChannelRatio < 0.32) {
				if (COrgRatioSP < 0.42) {
					if (SimhashDist < 57.5) {ints[80] = 1;}
					else {ints[81] = 1;}
				} else {
					if (CKWSRatio < 0.35) {ints[82] = 1;}
					else {ints[83] = 1;}
				}
			} else {
				if (InsertSpan < 107359) {
					if (TitleDist < 56.5) {ints[84] = 1;}
					else {ints[85] = 1;}
				} else {
					if (CLocLengthNE < 11.75) {ints[86] = 1;}
					else {ints[87] = 1;}
				}
			}
		} else {
			if (CNUMLengthSP < 17.25) {
				if (TitleRatio < 0.52) {
					if (InsertSpan < 145863.5) {ints[88] = 1;}
					else {ints[89] = 1;}
				} else {
					if (TitleLength < 6.75) {ints[90] = 1;}
					else {ints[91] = 1;}
				}
			} else {
				if (CLocRatioNE < 0.56) {
					if (TitleDist < 47.5) {ints[92] = 1;}
					else {ints[93] = 1;}
				} else {
					if (CTimRatioSP < 0.9) {ints[94] = 1;}
					else {ints[95] = 1;}
				}
			}
		}
	}
} else {
	if (EpochSpan < 72816.5) {
		if (COrgRatioSP < 0.86) {
			if (TitleRatio < 0.32) {
				if (COrgRatioSP < 0.6) {
					if (CKWSRatio < 0.24) {ints[96] = 1;}
					else {ints[97] = 1;}
				} else {
					if (TKWSRatio < 0.17) {ints[98] = 1;}
					else {ints[99] = 1;}
				}
			} else {
				if (CPerLengthNE < 1.25) {
					if (CLocRatioSP < 0.46) {ints[100] = 1;}
					else {ints[101] = 1;}
				} else {
					if (SimhashDist < 46.5) {ints[102] = 1;}
					else {ints[103] = 1;}
				}
			}
		} else {
			if (CPerLengthNE < 1.75) {
				if (CNUMRatioSP < 0.71) {
					if (CLocRatioNE < 0.5) {ints[104] = 1;}
					else {ints[105] = 1;}
				} else {
					if (TitleRatio < 0.2) {ints[106] = 1;}
					else {ints[107] = 1;}
				}
			} else {
				if (CTimRatioSP < 0.98) {
					if (TitleRatio < 0.94) {ints[108] = 1;}
					else {ints[109] = 1;}
				} else {
					if (CLocRatioNE < 0.83) {ints[110] = 1;}
					else {ints[111] = 1;}
				}
			}
		}
	} else {
		if (TitleRatio < 0.37) {
			if (TitleRatio < 0.12) {
				if (CLocRatioSP < 0.68) {
					if (ChannelRatio < 0.23) {ints[112] = 1;}
					else {ints[113] = 1;}
				} else {
					if (HKWSRatio < 0.04) {ints[114] = 1;}
					else {ints[115] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.46) {
					if (SimhashDist < 69.5) {ints[116] = 1;}
					else {ints[117] = 1;}
				} else {
					if (COrgLengthNE < 24.75) {ints[118] = 1;}
					else {ints[119] = 1;}
				}
			}
		} else {
			if (COrgLengthNE < 2.75) {
				if (TKWSRatio < 0.57) {
					if (EpochSpan < 105267) {ints[120] = 1;}
					else {ints[121] = 1;}
				} else {
					if (CPerLengthNE < 6.75) {ints[122] = 1;}
					else {ints[123] = 1;}
				}
			} else {
				if (CNUMLengthSP < 13.25) {
					if (CKWSRatio < 0.37) {ints[124] = 1;}
					else {ints[125] = 1;}
				} else {
					if (CNUMRatioSP < 0.97) {ints[126] = 1;}
					else {ints[127] = 1;}
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
					if (InsertSpan < 171840) {ints[128] = 1;}
					else {ints[129] = 1;}
				} else {
					if (InsertSpan < 1233951) {ints[130] = 1;}
					else {ints[131] = 1;}
				}
			} else {
				if (SimhashDist < 22.5) {
					if (TOrgLengthSP < 3.5) {ints[132] = 1;}
					else {ints[133] = 1;}
				} else {
					if (EpochSpan < 58449.5) {ints[134] = 1;}
					else {ints[135] = 1;}
				}
			}
		} else {
			if (COrgRatioSP < 0.27) {
				if (CLocRatioNE < 0.29) {
					if (CPerRatioNE < 0.07) {ints[136] = 1;}
					else {ints[137] = 1;}
				} else {
					if (TKWSRatio < 0.5) {ints[138] = 1;}
					else {ints[139] = 1;}
				}
			} else {
				if (SameSRC < 0.5) {
					if (TKWSRatio < 0.71) {ints[140] = 1;}
					else {ints[141] = 1;}
				} else {
					if (InsertSpan < 84300) {ints[142] = 1;}
					else {ints[143] = 1;}
				}
			}
		}
	} else {
		if (TitleRatio < 0.17) {
			if (COrgRatioSP < 0.22) {
				if (CKWSRatio < 0.23) {
					if (CatLength < 1.85) {ints[144] = 1;}
					else {ints[145] = 1;}
				} else {
					if (CTimRatioSP < 0.22) {ints[146] = 1;}
					else {ints[147] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.36) {
					if (EpochSpan < 241888) {ints[148] = 1;}
					else {ints[149] = 1;}
				} else {
					if (EpochSpan < 94320) {ints[150] = 1;}
					else {ints[151] = 1;}
				}
			}
		} else {
			if (COrgRatioSP < 0.45) {
				if (CPerRatioNE < 0.28) {
					if (COrgLengthNE < 3.75) {ints[152] = 1;}
					else {ints[153] = 1;}
				} else {
					if (EpochSpan < 194157) {ints[154] = 1;}
					else {ints[155] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.39) {
					if (SameSRC < 0.5) {ints[156] = 1;}
					else {ints[157] = 1;}
				} else {
					if (CTimRatioSP < 0.2) {ints[158] = 1;}
					else {ints[159] = 1;}
				}
			}
		}
	}
} else {
	if (CPerRatioSP < 0.61) {
		if (CKWSRatio < 0.29) {
			if (InsertSpan < 32990) {
				if (CPerRatioSP < 0.23) {
					if (EpochSpan < 35455.5) {ints[160] = 1;}
					else {ints[161] = 1;}
				} else {
					if (CLocRatioNE < 0.07) {ints[162] = 1;}
					else {ints[163] = 1;}
				}
			} else {
				if (COrgRatioNE < 0.25) {
					if (CPerRatioSP < 0.29) {ints[164] = 1;}
					else {ints[165] = 1;}
				} else {
					if (SimhashDist < 66.5) {ints[166] = 1;}
					else {ints[167] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.45) {
				if (CWordSpan < 2109.5) {
					if (TitleRatio < 0.26) {ints[168] = 1;}
					else {ints[169] = 1;}
				} else {
					if (CLocLengthNE < 32) {ints[170] = 1;}
					else {ints[171] = 1;}
				}
			} else {
				if (EpochSpan < 86393) {
					if (COrgRatioSP < 0.11) {ints[172] = 1;}
					else {ints[173] = 1;}
				} else {
					if (ChannelRatio < 0.87) {ints[174] = 1;}
					else {ints[175] = 1;}
				}
			}
		}
	} else {
		if (TitleRatio < 0.91) {
			if (SimhashDist < 65.5) {
				if (SameSRC < 0.5) {
					if (CNUMRatioSP < 0.41) {ints[176] = 1;}
					else {ints[177] = 1;}
				} else {
					if (CatLength < 1.5) {ints[178] = 1;}
					else {ints[179] = 1;}
				}
			} else {
				if (InsertSpan < 169828.5) {
					if (SimhashDist < 79.5) {ints[180] = 1;}
					else {ints[181] = 1;}
				} else {
					if (EpochSpan < 590124) {ints[182] = 1;}
					else {ints[183] = 1;}
				}
			}
		} else {
			if (EpochSpan < 86361.5) {
				if (ChannelRatio < 0.9) {
					if (CatRatio < 0.77) {ints[184] = 1;}
					else {ints[185] = 1;}
				} else {
					if (COrgLengthNE < 2.25) {ints[186] = 1;}
					else {ints[187] = 1;}
				}
			} else {
				if (CTimRatioSP < 0.86) {
					if (TitleLength < 7.75) {ints[188] = 1;}
					else {ints[189] = 1;}
				} else {
					if (CPerLengthNE < 5.75) {ints[190] = 1;}
					else {ints[191] = 1;}
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
					if (CatRatio < 0.27) {ints[192] = 1;}
					else {ints[193] = 1;}
				} else {
					if (InsertSpan < 82332) {ints[194] = 1;}
					else {ints[195] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.29) {
					if (TitleRatio < 0.08) {ints[196] = 1;}
					else {ints[197] = 1;}
				} else {
					if (CPerRatioSP < 0.29) {ints[198] = 1;}
					else {ints[199] = 1;}
				}
			}
		} else {
			if (COrgRatioNE < 0.16) {
				if (SimhashDist < 68.5) {
					if (CKWSRatio < 0.09) {ints[200] = 1;}
					else {ints[201] = 1;}
				} else {
					if (CatRatio < 0.88) {ints[202] = 1;}
					else {ints[203] = 1;}
				}
			} else {
				if (HKWSRatio < 0.7) {
					if (SimhashDist < 69.5) {ints[204] = 1;}
					else {ints[205] = 1;}
				} else {
					if (CLocLengthSP < 8.75) {ints[206] = 1;}
					else {ints[207] = 1;}
				}
			}
		}
	} else {
		if (COrgRatioSP < 0.45) {
			if (EpochSpan < 84528) {
				if (TitleRatio < 0.36) {
					if (CLocLengthNE < 29.5) {ints[208] = 1;}
					else {ints[209] = 1;}
				} else {
					if (TKWSRatio < 0.46) {ints[210] = 1;}
					else {ints[211] = 1;}
				}
			} else {
				if (TitleRatio < 0.2) {
					if (CPerRatioSP < 0.38) {ints[212] = 1;}
					else {ints[213] = 1;}
				} else {
					if (CKWSRatio < 0.41) {ints[214] = 1;}
					else {ints[215] = 1;}
				}
			}
		} else {
			if (EpochSpan < 83614.5) {
				if (ChannelRatio < 0.54) {
					if (CLocRatioNE < 0.28) {ints[216] = 1;}
					else {ints[217] = 1;}
				} else {
					if (CKWSLength < 7.75) {ints[218] = 1;}
					else {ints[219] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.53) {
					if (CWordSpan < 1518) {ints[220] = 1;}
					else {ints[221] = 1;}
				} else {
					if (CNUMLengthSP < 11.75) {ints[222] = 1;}
					else {ints[223] = 1;}
				}
			}
		}
	}
} else {
	if (CNUMRatioSP < 0.74) {
		if (CKWSRatio < 0.3) {
			if (CNUMRatioSP < 0.28) {
				if (CatRatio < 0.78) {
					if (SimhashDist < 58.5) {ints[224] = 1;}
					else {ints[225] = 1;}
				} else {
					if (EpochSpan < 60525.5) {ints[226] = 1;}
					else {ints[227] = 1;}
				}
			} else {
				if (CKWSRatio < 0.17) {
					if (CKWSRatio < 0.08) {ints[228] = 1;}
					else {ints[229] = 1;}
				} else {
					if (HKWSRatio < 0.9) {ints[230] = 1;}
					else {ints[231] = 1;}
				}
			}
		} else {
			if (SameSRC < 0.5) {
				if (TPerRatioNE < 0.79) {
					if (COrgRatioSP < 0.47) {ints[232] = 1;}
					else {ints[233] = 1;}
				} else {
					if (CPerLengthNE < 5.75) {ints[234] = 1;}
					else {ints[235] = 1;}
				}
			} else {
				if (TitleDist < 0.5) {
					if (EpochSpan < 86309.5) {ints[236] = 1;}
					else {ints[237] = 1;}
				} else {
					if (CNUMRatioSP < 0.45) {ints[238] = 1;}
					else {ints[239] = 1;}
				}
			}
		}
	} else {
		if (EpochSpan < 830) {
			if (TitleDist < 2.5) {
				if (CKWSRatio < 0.93) {
					if (CTimLengthSP < 1.75) {ints[240] = 1;}
					else {ints[241] = 1;}
				} else {
					if (CPerLengthSP < 9.25) {ints[242] = 1;}
					else {ints[243] = 1;}
				}
			} else {
				if (TitleRatio < 0.16) {ints[244] = 1;}
				if (TitleRatio >= 0.16) {
					if (SameSRC < 0.5) {ints[245] = 1;}
					else {ints[246] = 1;}
				}
			}
		} else {
			if (EpochSpan < 65850) {
				if (TitleRatio < 0.46) {
					if (CatLength < 1.49) {ints[247] = 1;}
					else {ints[248] = 1;}
				} else {
					if (CatRatio < 0.76) {ints[249] = 1;}
					else {ints[250] = 1;}
				}
			} else {
				if (InsertSpan < 252492.5) {
					if (COrgLengthNE < 2.75) {ints[251] = 1;}
					else {ints[252] = 1;}
				} else {
					if (CPerLengthSP < 7.25) {ints[253] = 1;}
					else {ints[254] = 1;}
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
					if (CTimLengthSP < 2.25) {ints[256] = 1;}
					else {ints[257] = 1;}
				} else {
					if (CNUMLengthSP < 23.25) {ints[258] = 1;}
					else {ints[259] = 1;}
				}
			} else {
				if (CTimRatioSP < 0.85) {
					if (EpochSpan < 83642) {ints[260] = 1;}
					else {ints[261] = 1;}
				} else {
					if (CTimLengthSP < 25.5) {ints[262] = 1;}
					else {ints[263] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.31) {
				if (CKWSRatio < 0.17) {
					if (TitleRatio < 0.21) {ints[264] = 1;}
					else {ints[265] = 1;}
				} else {
					if (EpochSpan < 83180) {ints[266] = 1;}
					else {ints[267] = 1;}
				}
			} else {
				if (CNUMLengthSP < 12.75) {
					if (TKWSRatio < 0.61) {ints[268] = 1;}
					else {ints[269] = 1;}
				} else {
					if (CLocRatioNE < 0.82) {ints[270] = 1;}
					else {ints[271] = 1;}
				}
			}
		}
	} else {
		if (CPerRatioSP < 0.68) {
			if (CTimRatioSP < 0.77) {
				if (EpochSpan < 265888) {
					if (CTimLengthSP < 7.75) {ints[272] = 1;}
					else {ints[273] = 1;}
				} else {
					if (CLocLengthSP < 8.25) {ints[274] = 1;}
					else {ints[275] = 1;}
				}
			} else {
				if (ChannelRatio < 0.87) {
					if (TKWSLength < 4.25) {ints[276] = 1;}
					else {ints[277] = 1;}
				} else {
					if (SimhashDist < 38.5) {ints[278] = 1;}
					else {ints[279] = 1;}
				}
			}
		} else {
			if (EpochSpan < 249649.5) {
				if (CNUMRatioSP < 0.52) {
					if (CLocLengthNE < 4.25) {ints[280] = 1;}
					else {ints[281] = 1;}
				} else {
					if (ChannelRatio < 0.45) {ints[282] = 1;}
					else {ints[283] = 1;}
				}
			} else {
				if (SimhashDist < 21.5) {
					if (CKWSLength < 9) {ints[284] = 1;}
					else {ints[285] = 1;}
				} else {
					if (InsertSpan < 602974) {ints[286] = 1;}
					else {ints[287] = 1;}
				}
			}
		}
	}
} else {
	if (TitleRatio < 0.19) {
		if (CTimRatioSP < 0.47) {
			if (CatRatio < 0.55) {
				if (ChannelRatio < 0.11) {
					if (CLocLengthNE < 12.75) {ints[288] = 1;}
					else {ints[289] = 1;}
				} else {
					if (CPerRatioNE < 0.06) {ints[290] = 1;}
					else {ints[291] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.36) {
					if (CPerRatioSP < 0.33) {ints[292] = 1;}
					else {ints[293] = 1;}
				} else {
					if (TitleRatio < 0.11) {ints[294] = 1;}
					else {ints[295] = 1;}
				}
			}
		} else {
			if (TKWSRatio < 0.28) {
				if (CPerRatioNE < 0.42) {
					if (CKWSRatio < 0.21) {ints[296] = 1;}
					else {ints[297] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[298] = 1;}
					else {ints[299] = 1;}
				}
			} else {
				if (EpochSpan < 59625) {
					if (CLocRatioNE < 0.44) {ints[300] = 1;}
					else {ints[301] = 1;}
				} else {
					if (COrgLengthNE < 6.75) {ints[302] = 1;}
					else {ints[303] = 1;}
				}
			}
		}
	} else {
		if (CKWSRatio < 0.27) {
			if (EpochSpan < 45383.5) {
				if (CKWSRatio < 0.18) {
					if (CatRatio < 0.74) {ints[304] = 1;}
					else {ints[305] = 1;}
				} else {
					if (CPerRatioNE < 0.3) {ints[306] = 1;}
					else {ints[307] = 1;}
				}
			} else {
				if (TOrgLengthNE < 1.25) {
					if (EpochSpan < 340607) {ints[308] = 1;}
					else {ints[309] = 1;}
				} else {
					if (CatLength < 0.75) {ints[310] = 1;}
					else {ints[311] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.49) {
				if (SimhashDist < 76.5) {
					if (CNUMRatioSP < 0.64) {ints[312] = 1;}
					else {ints[313] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[314] = 1;}
					else {ints[315] = 1;}
				}
			} else {
				if (TitleDist < 52.5) {
					if (SameSRC < 0.5) {ints[316] = 1;}
					else {ints[317] = 1;}
				} else {
					if (InsertSpan < 125979.5) {ints[318] = 1;}
					else {ints[319] = 1;}
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
					if (EpochSpan < 14663.5) {ints[320] = 1;}
					else {ints[321] = 1;}
				} else {
					if (CWordSpan < 356) {ints[322] = 1;}
					else {ints[323] = 1;}
				}
			} else {
				if (CLocLengthNE < 27.25) {
					if (CatRatio < 0.55) {ints[324] = 1;}
					else {ints[325] = 1;}
				} else {
					if (COrgLengthSP < 13.25) {ints[326] = 1;}
					else {ints[327] = 1;}
				}
			}
		} else {
			if (EpochSpan < 59078) {
				if (COrgRatioNE < 0.49) {
					if (GeoRatio < 0.73) {ints[328] = 1;}
					else {ints[329] = 1;}
				} else {
					if (COrgLengthNE < 51.25) {ints[330] = 1;}
					else {ints[331] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.44) {
					if (CLocLengthSP < 22) {ints[332] = 1;}
					else {ints[333] = 1;}
				} else {
					if (CNUMRatioSP < 0.46) {ints[334] = 1;}
					else {ints[335] = 1;}
				}
			}
		}
	} else {
		if (SimhashDist < 69.5) {
			if (CNUMRatioSP < 0.73) {
				if (HKWSRatio < 0.64) {
					if (CKWSRatio < 0.29) {ints[336] = 1;}
					else {ints[337] = 1;}
				} else {
					if (TitleDist < 23.5) {ints[338] = 1;}
					else {ints[339] = 1;}
				}
			} else {
				if (ChannelRatio < 0.85) {
					if (EpochSpan < 264888.5) {ints[340] = 1;}
					else {ints[341] = 1;}
				} else {
					if (COrgLengthSP < 4.25) {ints[342] = 1;}
					else {ints[343] = 1;}
				}
			}
		} else {
			if (EpochSpan < 72564) {
				if (CLocRatioNE < 0.39) {
					if (CKWSRatio < 0.25) {ints[344] = 1;}
					else {ints[345] = 1;}
				} else {
					if (CNUMRatioSP < 0.61) {ints[346] = 1;}
					else {ints[347] = 1;}
				}
			} else {
				if (TitleRatio < 0.2) {
					if (CKWSRatio < 0.3) {ints[348] = 1;}
					else {ints[349] = 1;}
				} else {
					if (CPerRatioSP < 0.24) {ints[350] = 1;}
					else {ints[351] = 1;}
				}
			}
		}
	}
} else {
	if (TitleRatio < 0.91) {
		if (COrgRatioSP < 0.46) {
			if (SimhashDist < 66.5) {
				if (CPerRatioSP < 0.58) {
					if (InsertSpan < 108724.5) {ints[352] = 1;}
					else {ints[353] = 1;}
				} else {
					if (InsertSpan < 287912.5) {ints[354] = 1;}
					else {ints[355] = 1;}
				}
			} else {
				if (EpochSpan < 136684.5) {
					if (TitleRatio < 0.47) {ints[356] = 1;}
					else {ints[357] = 1;}
				} else {
					if (CPerRatioSP < 0.3) {ints[358] = 1;}
					else {ints[359] = 1;}
				}
			}
		} else {
			if (SameSRC < 0.5) {
				if (EpochSpan < 251173) {
					if (TKWSRatio < 0.65) {ints[360] = 1;}
					else {ints[361] = 1;}
				} else {
					if (CLocRatioNE < 0.65) {ints[362] = 1;}
					else {ints[363] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.77) {
					if (InsertSpan < 185765.5) {ints[364] = 1;}
					else {ints[365] = 1;}
				} else {
					if (CNUMRatioSP < 0.45) {ints[366] = 1;}
					else {ints[367] = 1;}
				}
			}
		}
	} else {
		if (InsertSpan < 69970.5) {
			if (CTimRatioSP < 0.36) {
				if (CKWSRatio < 0.46) {
					if (SimhashDist < 64) {ints[368] = 1;}
					else {ints[369] = 1;}
				} else {
					if (COrgLengthNE < 3.25) {ints[370] = 1;}
					else {ints[371] = 1;}
				}
			} else {
				if (SameSRC < 0.5) {
					if (TitleLength < 17.75) {ints[372] = 1;}
					else {ints[373] = 1;}
				} else {
					if (SimhashDist < 12.5) {ints[374] = 1;}
					else {ints[375] = 1;}
				}
			}
		} else {
			if (EpochSpan < 151086) {
				if (CNUMRatioSP < 0.46) {
					if (InsertSpan < 75857.5) {ints[376] = 1;}
					else {ints[377] = 1;}
				} else {
					if (SimhashDist < 17.5) {ints[378] = 1;}
					else {ints[379] = 1;}
				}
			} else {
				if (TitleLength < 7.75) {
					if (CPerRatioNE < 0.81) {ints[380] = 1;}
					else {ints[381] = 1;}
				} else {
					if (SimhashDist < 47.5) {ints[382] = 1;}
					else {ints[383] = 1;}
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
					if (TKWSRatio < 0.37) {ints[384] = 1;}
					else {ints[385] = 1;}
				} else {
					if (InsertSpan < 12375.5) {ints[386] = 1;}
					else {ints[387] = 1;}
				}
			} else {
				if (CPerLengthNE < 2.25) {
					if (CNUMLengthSP < 13.25) {ints[388] = 1;}
					else {ints[389] = 1;}
				} else {
					if (InsertSpan < 83654.5) {ints[390] = 1;}
					else {ints[391] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.16) {
				if (TKWSRatio < 0.74) {
					if (CPerRatioSP < 0.47) {ints[392] = 1;}
					else {ints[393] = 1;}
				} else {
					if (CLocRatioSP < 0.54) {ints[394] = 1;}
					else {ints[395] = 1;}
				}
			} else {
				if (HKWSRatio < 0.42) {
					if (COrgLengthSP < 28.75) {ints[396] = 1;}
					else {ints[397] = 1;}
				} else {
					if (CNUMLengthSP < 9.75) {ints[398] = 1;}
					else {ints[399] = 1;}
				}
			}
		}
	} else {
		if (COrgRatioSP < 0.96) {
			if (TitleRatio < 0.39) {
				if (EpochSpan < 248793) {
					if (CLocLengthSP < 30) {ints[400] = 1;}
					else {ints[401] = 1;}
				} else {
					if (CPerLengthSP < 5.75) {ints[402] = 1;}
					else {ints[403] = 1;}
				}
			} else {
				if (EpochSpan < 251552.5) {
					if (CPerRatioSP < 0.54) {ints[404] = 1;}
					else {ints[405] = 1;}
				} else {
					if (COrgRatioSP < 0.37) {ints[406] = 1;}
					else {ints[407] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.98) {
				if (EpochSpan < 75574) {
					if (COrgLengthSP < 7.25) {ints[408] = 1;}
					else {ints[409] = 1;}
				} else {
					if (CLocLengthNE < 1.25) {ints[410] = 1;}
					else {ints[411] = 1;}
				}
			} else {
				if (TOrgLengthNE < 2.75) {
					if (TKWSRatio < 0.87) {ints[412] = 1;}
					else {ints[413] = 1;}
				} else {
					if (TOrgLengthSP < 2.5) {ints[414] = 1;}
					else {ints[415] = 1;}
				}
			}
		}
	}
} else {
	if (TitleRatio < 0.19) {
		if (ChannelRatio < 0.11) {
			if (CNUMRatioSP < 0.28) {
				if (COrgLengthSP < 6.25) {
					if (CKWSRatio < 0.37) {ints[416] = 1;}
					else {ints[417] = 1;}
				} else {
					if (ParagraphSpan < 27.5) {ints[418] = 1;}
					else {ints[419] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.32) {
					if (CKWSRatio < 0.21) {ints[420] = 1;}
					else {ints[421] = 1;}
				} else {
					if (CTimRatioSP < 0.27) {ints[422] = 1;}
					else {ints[423] = 1;}
				}
			}
		} else {
			if (ChannelRatio < 0.34) {
				if (COrgRatioSP < 0.49) {
					if (SimhashDist < 77.5) {ints[424] = 1;}
					else {ints[425] = 1;}
				} else {
					if (CTimRatioSP < 0.14) {ints[426] = 1;}
					else {ints[427] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.36) {
					if (TOrgRatioNE < 0.88) {ints[428] = 1;}
					else {ints[429] = 1;}
				} else {
					if (CKWSRatio < 0.57) {ints[430] = 1;}
					else {ints[431] = 1;}
				}
			}
		}
	} else {
		if (EpochSpan < 84164) {
			if (COrgRatioSP < 0.46) {
				if (CLocRatioSP < 0.36) {
					if (ChannelRatio < 0.29) {ints[432] = 1;}
					else {ints[433] = 1;}
				} else {
					if (TitleRatio < 0.38) {ints[434] = 1;}
					else {ints[435] = 1;}
				}
			} else {
				if (TKWSRatio < 0.42) {
					if (CatLength < 0.91) {ints[436] = 1;}
					else {ints[437] = 1;}
				} else {
					if (CLocRatioSP < 0.45) {ints[438] = 1;}
					else {ints[439] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.21) {
				if (CLocLengthSP < 2.25) {
					if (COrgLengthNE < 1.75) {ints[440] = 1;}
					else {ints[441] = 1;}
				} else {
					if (CPerLengthNE < 33.25) {ints[442] = 1;}
					else {ints[443] = 1;}
				}
			} else {
				if (EpochSpan < 305831.5) {
					if (CNUMRatioSP < 0.46) {ints[444] = 1;}
					else {ints[445] = 1;}
				} else {
					if (CWordSpan < 894.5) {ints[446] = 1;}
					else {ints[447] = 1;}
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
					if (CPerRatioSP < 0.06) {ints[448] = 1;}
					else {ints[449] = 1;}
				} else {
					if (CLocRatioNE < 0.54) {ints[450] = 1;}
					else {ints[451] = 1;}
				}
			} else {
				if (HKWSRatio < 0.73) {
					if (CPerRatioNE < 0.19) {ints[452] = 1;}
					else {ints[453] = 1;}
				} else {
					if (CatLength < 1.62) {ints[454] = 1;}
					else {ints[455] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.26) {
				if (SimhashDist < 74.5) {
					if (CKWSRatio < 0.26) {ints[456] = 1;}
					else {ints[457] = 1;}
				} else {
					if (CPerRatioSP < 0.33) {ints[458] = 1;}
					else {ints[459] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.23) {
					if (ChannelRatio < 0.81) {ints[460] = 1;}
					else {ints[461] = 1;}
				} else {
					if (CKWSRatio < 0.29) {ints[462] = 1;}
					else {ints[463] = 1;}
				}
			}
		}
	} else {
		if (CPerRatioSP < 0.27) {
			if (TKWSRatio < 0.55) {
				if (EpochSpan < 65308) {
					if (TitleLength < 13.25) {ints[464] = 1;}
					else {ints[465] = 1;}
				} else {
					if (CLocLengthNE < 24.75) {ints[466] = 1;}
					else {ints[467] = 1;}
				}
			} else {
				if (InsertSpan < 73292.5) {
					if (TitleRatio < 0.37) {ints[468] = 1;}
					else {ints[469] = 1;}
				} else {
					if (SimhashDist < 69.5) {ints[470] = 1;}
					else {ints[471] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.42) {
				if (CNUMRatioSP < 0.41) {
					if (EpochSpan < 216515) {ints[472] = 1;}
					else {ints[473] = 1;}
				} else {
					if (EpochSpan < 277569.5) {ints[474] = 1;}
					else {ints[475] = 1;}
				}
			} else {
				if (HKWSRatio < 0.44) {
					if (TKWSRatio < 0.59) {ints[476] = 1;}
					else {ints[477] = 1;}
				} else {
					if (TitleLength < 6.25) {ints[478] = 1;}
					else {ints[479] = 1;}
				}
			}
		}
	}
} else {
	if (TKWSRatio < 0.69) {
		if (InsertSpan < 125648) {
			if (TKWSRatio < 0.29) {
				if (TitleRatio < 0.21) {
					if (CPerRatioNE < 0.52) {ints[480] = 1;}
					else {ints[481] = 1;}
				} else {
					if (CNUMLengthSP < 39.5) {ints[482] = 1;}
					else {ints[483] = 1;}
				}
			} else {
				if (EpochSpan < 77346.5) {
					if (CPerRatioNE < 0.22) {ints[484] = 1;}
					else {ints[485] = 1;}
				} else {
					if (COrgRatioNE < 1) {ints[486] = 1;}
					else {ints[487] = 1;}
				}
			}
		} else {
			if (InsertSpan < 259033) {
				if (TitleRatio < 0.23) {
					if (CPerRatioNE < 0.73) {ints[488] = 1;}
					else {ints[489] = 1;}
				} else {
					if (CPerRatioNE < 0.55) {ints[490] = 1;}
					else {ints[491] = 1;}
				}
			} else {
				if (CKWSRatio < 0.34) {
					if (EpochSpan < 257756) {ints[492] = 1;}
					else {ints[493] = 1;}
				} else {
					if (CNUMLengthSP < 12.25) {ints[494] = 1;}
					else {ints[495] = 1;}
				}
			}
		}
	} else {
		if (EpochSpan < 75425) {
			if (TitleRatio < 0.89) {
				if (COrgLengthSP < 2.25) {
					if (CLocRatioSP < 0.47) {ints[496] = 1;}
					else {ints[497] = 1;}
				} else {
					if (TitleRatio < 0.31) {ints[498] = 1;}
					else {ints[499] = 1;}
				}
			} else {
				if (CTimRatioSP < 0.32) {
					if (CNUMLengthSP < 19.25) {ints[500] = 1;}
					else {ints[501] = 1;}
				} else {
					if (CTimLengthSP < 2.25) {ints[502] = 1;}
					else {ints[503] = 1;}
				}
			}
		} else {
			if (COrgRatioNE < 0.1) {
				if (CNUMRatioSP < 0.33) {
					if (TKWSLength < 4.25) {ints[504] = 1;}
					else {ints[505] = 1;}
				} else {
					if (CKWSRatio < 0.47) {ints[506] = 1;}
					else {ints[507] = 1;}
				}
			} else {
				if (EpochSpan < 571438) {
					if (CPerRatioNE < 0.62) {ints[508] = 1;}
					else {ints[509] = 1;}
				} else {
					if (CLocLengthSP < 2.25) {ints[510] = 1;}
					else {ints[511] = 1;}
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
					if (SimhashDist < 41) {ints[512] = 1;}
					else {ints[513] = 1;}
				} else {
					if (TitleRatio < 0.72) {ints[514] = 1;}
					else {ints[515] = 1;}
				}
			} else {
				if (TKWSRatio < 0.56) {
					if (CTimRatioSP < 0.25) {ints[516] = 1;}
					else {ints[517] = 1;}
				} else {
					if (CPerRatioSP < 0.37) {ints[518] = 1;}
					else {ints[519] = 1;}
				}
			}
		} else {
			if (COrgLengthSP < 3.25) {
				if (CTimLengthSP < 2.25) {
					if (COrgRatioSP < 1) {ints[520] = 1;}
					else {ints[521] = 1;}
				} else {
					if (TitleLength < 2.5) {ints[522] = 1;}
					else {ints[523] = 1;}
				}
			} else {
				if (CKWSRatio < 0.85) {
					if (TKWSLength < 4.75) {ints[524] = 1;}
					else {ints[525] = 1;}
				} else {
					if (TKWSRatio < 1) {ints[526] = 1;}
					else {ints[527] = 1;}
				}
			}
		}
	} else {
		if (TKWSRatio < 0.6) {
			if (HKWSRatio < 0.32) {
				if (CLocRatioSP < 0.48) {
					if (TitleRatio < 0.2) {ints[528] = 1;}
					else {ints[529] = 1;}
				} else {
					if (CPerRatioSP < 0.37) {ints[530] = 1;}
					else {ints[531] = 1;}
				}
			} else {
				if (CKWSRatio < 0.31) {
					if (CPerRatioNE < 0.18) {ints[532] = 1;}
					else {ints[533] = 1;}
				} else {
					if (InsertSpan < 310729) {ints[534] = 1;}
					else {ints[535] = 1;}
				}
			}
		} else {
			if (InsertSpan < 283159.5) {
				if (CPerRatioSP < 0.61) {
					if (CatLength < 1.51) {ints[536] = 1;}
					else {ints[537] = 1;}
				} else {
					if (CLocRatioSP < 0.3) {ints[538] = 1;}
					else {ints[539] = 1;}
				}
			} else {
				if (CLocRatioSP < 0.76) {
					if (ChannelLength < 3.75) {ints[540] = 1;}
					else {ints[541] = 1;}
				} else {
					if (CNUMRatioSP < 0.64) {ints[542] = 1;}
					else {ints[543] = 1;}
				}
			}
		}
	}
} else {
	if (CatRatio < 0.5) {
		if (CKWSRatio < 0.21) {
			if (TKWSRatio < 0.24) {
				if (CPerRatioNE < 0.05) {
					if (CLocRatioSP < 0.72) {ints[544] = 1;}
					else {ints[545] = 1;}
				} else {
					if (TKWSLength < 3.75) {ints[546] = 1;}
					else {ints[547] = 1;}
				}
			} else {
				if (COrgRatioNE < 0.46) {
					if (TKWSRatio < 0.33) {ints[548] = 1;}
					else {ints[549] = 1;}
				} else {
					if (SimhashDist < 78.5) {ints[550] = 1;}
					else {ints[551] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.29) {
				if (ChannelRatio < 0.06) {
					if (CNUMRatioSP < 0.54) {ints[552] = 1;}
					else {ints[553] = 1;}
				} else {
					if (TitleRatio < 0.23) {ints[554] = 1;}
					else {ints[555] = 1;}
				}
			} else {
				if (InsertSpan < 88485.5) {
					if (SameSRC < 0.5) {ints[556] = 1;}
					else {ints[557] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[558] = 1;}
					else {ints[559] = 1;}
				}
			}
		}
	} else {
		if (CKWSRatio < 0.24) {
			if (TOrgRatioSP < 0.52) {
				if (CPerRatioSP < 0.44) {
					if (CKWSRatio < 0.15) {ints[560] = 1;}
					else {ints[561] = 1;}
				} else {
					if (CPerLengthSP < 13.75) {ints[562] = 1;}
					else {ints[563] = 1;}
				}
			} else {
				if (TitleDist < 39.5) {
					if (CLocLengthNE < 4.75) {ints[564] = 1;}
					else {ints[565] = 1;}
				} else {
					if (COrgRatioSP < 0.69) {ints[566] = 1;}
					else {ints[567] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.41) {
				if (CPerRatioNE < 0.39) {
					if (CPerRatioSP < 0.47) {ints[568] = 1;}
					else {ints[569] = 1;}
				} else {
					if (CPerRatioNE < 0.77) {ints[570] = 1;}
					else {ints[571] = 1;}
				}
			} else {
				if (EpochSpan < 103189.5) {
					if (TKWSRatio < 0.5) {ints[572] = 1;}
					else {ints[573] = 1;}
				} else {
					if (InsertSpan < 175987) {ints[574] = 1;}
					else {ints[575] = 1;}
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
					if (COrgRatioSP < 0.07) {ints[576] = 1;}
					else {ints[577] = 1;}
				} else {
					if (TitleRatio < 0.1) {ints[578] = 1;}
					else {ints[579] = 1;}
				}
			} else {
				if (CLocLengthSP < 4.75) {
					if (CPerRatioSP < 0.67) {ints[580] = 1;}
					else {ints[581] = 1;}
				} else {
					if (CNUMRatioSP < 0.66) {ints[582] = 1;}
					else {ints[583] = 1;}
				}
			}
		} else {
			if (COrgRatioNE < 0.18) {
				if (CPerRatioSP < 0.29) {
					if (ParagraphSpan < 24.5) {ints[584] = 1;}
					else {ints[585] = 1;}
				} else {
					if (COrgRatioSP < 0.29) {ints[586] = 1;}
					else {ints[587] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.1) {
					if (COrgRatioNE < 0.79) {ints[588] = 1;}
					else {ints[589] = 1;}
				} else {
					if (SimhashDist < 74.5) {ints[590] = 1;}
					else {ints[591] = 1;}
				}
			}
		}
	} else {
		if (COrgRatioSP < 0.49) {
			if (TKWSRatio < 0.49) {
				if (CPerRatioSP < 0.57) {
					if (CTimLengthSP < 25.25) {ints[592] = 1;}
					else {ints[593] = 1;}
				} else {
					if (CPerRatioNE < 0.62) {ints[594] = 1;}
					else {ints[595] = 1;}
				}
			} else {
				if (COrgRatioNE < 0.35) {
					if (HKWSRatio < 0.7) {ints[596] = 1;}
					else {ints[597] = 1;}
				} else {
					if (TKWSRatio < 0.55) {ints[598] = 1;}
					else {ints[599] = 1;}
				}
			}
		} else {
			if (TKWSRatio < 0.37) {
				if (CPerRatioNE < 0.43) {
					if (CLocRatioSP < 0.62) {ints[600] = 1;}
					else {ints[601] = 1;}
				} else {
					if (CKWSRatio < 0.38) {ints[602] = 1;}
					else {ints[603] = 1;}
				}
			} else {
				if (CTimRatioSP < 0.37) {
					if (SameSRC < 0.5) {ints[604] = 1;}
					else {ints[605] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[606] = 1;}
					else {ints[607] = 1;}
				}
			}
		}
	}
} else {
	if (TitleDist < 0.5) {
		if (InsertSpan < 69970.5) {
			if (CKWSLength < 7.25) {
				if (InsertSpan < 27422) {
					if (ChannelLength < 3.25) {ints[608] = 1;}
					else {ints[609] = 1;}
				} else {
					if (CNUMLengthSP < 4) {ints[610] = 1;}
					else {ints[611] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.86) {
					if (TitleLength < 4.5) {ints[612] = 1;}
					else {ints[613] = 1;}
				} else {
					if (TOrgLengthSP < 2.5) {ints[614] = 1;}
					else {ints[615] = 1;}
				}
			}
		} else {
			if (CTimRatioSP < 0.84) {
				if (COrgLengthNE < 3.25) {
					if (EpochSpan < 76465.5) {ints[616] = 1;}
					else {ints[617] = 1;}
				} else {
					if (CKWSLength < 18.75) {ints[618] = 1;}
					else {ints[619] = 1;}
				}
			} else {
				if (CLocRatioNE < 0.86) {
					if (ParagraphSpan < 2.5) {ints[620] = 1;}
					else {ints[621] = 1;}
				} else {
					if (CNUMRatioSP < 0.86) {ints[622] = 1;}
					else {ints[623] = 1;}
				}
			}
		}
	} else {
		if (InsertSpan < 251438) {
			if (SimhashDist < 65.5) {
				if (CNUMRatioSP < 0.5) {
					if (EpochSpan < 83419) {ints[624] = 1;}
					else {ints[625] = 1;}
				} else {
					if (CWordSpan < 16.5) {ints[626] = 1;}
					else {ints[627] = 1;}
				}
			} else {
				if (CKWSRatio < 0.31) {
					if (CPerRatioSP < 0.3) {ints[628] = 1;}
					else {ints[629] = 1;}
				} else {
					if (CPerRatioSP < 0.49) {ints[630] = 1;}
					else {ints[631] = 1;}
				}
			}
		} else {
			if (CPerRatioNE < 0.59) {
				if (TKWSRatio < 0.23) {
					if (ParagraphSpan < 5.5) {ints[632] = 1;}
					else {ints[633] = 1;}
				} else {
					if (EpochSpan < 254653.5) {ints[634] = 1;}
					else {ints[635] = 1;}
				}
			} else {
				if (TitleRatio < 0.42) {
					if (CLocRatioNE < 0.84) {ints[636] = 1;}
					else {ints[637] = 1;}
				} else {
					if (CKWSLength < 12.25) {ints[638] = 1;}
					else {ints[639] = 1;}
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
					if (CWordSpan < 17.5) {ints[640] = 1;}
					else {ints[641] = 1;}
				} else {
					if (EpochSpan < 65065) {ints[642] = 1;}
					else {ints[643] = 1;}
				}
			} else {
				if (TitleRatio < 0.9) {
					if (EpochSpan < 83180) {ints[644] = 1;}
					else {ints[645] = 1;}
				} else {
					if (CNUMLengthSP < 21.5) {ints[646] = 1;}
					else {ints[647] = 1;}
				}
			}
		} else {
			if (SimhashDist < 27.5) {
				if (CNUMRatioSP < 0.82) {
					if (TitleRatio < 0.88) {ints[648] = 1;}
					else {ints[649] = 1;}
				} else {
					if (ChannelLength < 4.5) {ints[650] = 1;}
					else {ints[651] = 1;}
				}
			} else {
				if (TitleRatio < 0.13) {
					if (ChannelRatio < 0.15) {ints[652] = 1;}
					else {ints[653] = 1;}
				} else {
					if (EpochSpan < 85369) {ints[654] = 1;}
					else {ints[655] = 1;}
				}
			}
		}
	} else {
		if (TPerRatioNE < 0.71) {
			if (CatRatio < 0.5) {
				if (CKWSRatio < 0.31) {
					if (CKWSRatio < 0.12) {ints[656] = 1;}
					else {ints[657] = 1;}
				} else {
					if (InsertSpan < 116493) {ints[658] = 1;}
					else {ints[659] = 1;}
				}
			} else {
				if (CLocRatioSP < 0.2) {
					if (TitleDist < 53.5) {ints[660] = 1;}
					else {ints[661] = 1;}
				} else {
					if (HKWSRatio < 0.62) {ints[662] = 1;}
					else {ints[663] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.25) {
				if (InsertSpan < 5872.5) {
					if (CatRatio < 0.88) {ints[664] = 1;}
					else {ints[665] = 1;}
				} else {
					if (ChannelRatio < 0.28) {ints[666] = 1;}
					else {ints[667] = 1;}
				}
			} else {
				if (EpochSpan < 118183) {
					if (CLocLengthSP < 17.25) {ints[668] = 1;}
					else {ints[669] = 1;}
				} else {
					if (GeoRatio < 0.54) {ints[670] = 1;}
					else {ints[671] = 1;}
				}
			}
		}
	}
} else {
	if (CNUMRatioSP < 0.74) {
		if (CTimRatioSP < 0.29) {
			if (CWordSpan < 1359.5) {
				if (CPerRatioSP < 0.63) {
					if (EpochSpan < 126499.5) {ints[672] = 1;}
					else {ints[673] = 1;}
				} else {
					if (EpochSpan < 255861) {ints[674] = 1;}
					else {ints[675] = 1;}
				}
			} else {
				if (SimhashDist < 77.5) {
					if (InsertSpan < 154667.5) {ints[676] = 1;}
					else {ints[677] = 1;}
				} else {ints[678] = 1;}
			}
		} else {
			if (EpochSpan < 255000) {
				if (TitleRatio < 0.37) {
					if (SimhashDist < 64.5) {ints[679] = 1;}
					else {ints[680] = 1;}
				} else {
					if (TitleLength < 6.25) {ints[681] = 1;}
					else {ints[682] = 1;}
				}
			} else {
				if (TKWSRatio < 0.5) {
					if (CLocLengthNE < 3.75) {ints[683] = 1;}
					else {ints[684] = 1;}
				} else {
					if (CNUMRatioSP < 0.66) {ints[685] = 1;}
					else {ints[686] = 1;}
				}
			}
		}
	} else {
		if (SimhashDist < 20.5) {
			if (TitleRatio < 0.92) {
				if (ParagraphSpan < 0.5) {
					if (TitleLength < 5.75) {ints[687] = 1;}
					else {ints[688] = 1;}
				} else {
					if (TKWSRatio < 0.97) {ints[689] = 1;}
					else {ints[690] = 1;}
				}
			} else {
				if (TOrgLengthNE < 2.75) {
					if (COrgLengthSP < 6.25) {ints[691] = 1;}
					else {ints[692] = 1;}
				} else {
					if (CPerLengthSP < 2.25) {ints[693] = 1;}
					else {ints[694] = 1;}
				}
			}
		} else {
			if (EpochSpan < 336036.5) {
				if (TitleRatio < 0.38) {
					if (CTimRatioSP < 0.48) {ints[695] = 1;}
					else {ints[696] = 1;}
				} else {
					if (CPerLengthNE < 2.75) {ints[697] = 1;}
					else {ints[698] = 1;}
				}
			} else {
				if (SameSRC < 0.5) {
					if (COrgLengthSP < 3.75) {ints[699] = 1;}
					else {ints[700] = 1;}
				} else {
					if (CatLength < 0.86) {ints[701] = 1;}
					else {ints[702] = 1;}
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
					if (CLocRatioNE < 0.34) {ints[704] = 1;}
					else {ints[705] = 1;}
				} else {
					if (TitleRatio < 0.42) {ints[706] = 1;}
					else {ints[707] = 1;}
				}
			} else {
				if (ChannelLength < 1.75) {ints[708] = 1;}
				if (ChannelLength >= 1.75) {
					if (CatRatio < 0.28) {ints[709] = 1;}
					else {ints[710] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.56) {
				if (TOrgRatioSP < 0.72) {
					if (TitleDist < 44.5) {ints[711] = 1;}
					else {ints[712] = 1;}
				} else {
					if (CNUMRatioSP < 0.12) {ints[713] = 1;}
					else {ints[714] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.58) {
					if (CPerLengthSP < 8.75) {ints[715] = 1;}
					else {ints[716] = 1;}
				} else {
					if (CPerRatioSP < 0.9) {ints[717] = 1;}
					else {ints[718] = 1;}
				}
			}
		}
	} else {
		if (CPerRatioSP < 0.28) {
			if (TitleRatio < 0.14) {
				if (COrgRatioNE < 0.14) {
					if (CLocLengthSP < 19.25) {ints[719] = 1;}
					else {ints[720] = 1;}
				} else {
					if (CPerLengthSP < 12.25) {ints[721] = 1;}
					else {ints[722] = 1;}
				}
			} else {
				if (EpochSpan < 64126.5) {
					if (COrgRatioNE < 0.33) {ints[723] = 1;}
					else {ints[724] = 1;}
				} else {
					if (CKWSRatio < 0.15) {ints[725] = 1;}
					else {ints[726] = 1;}
				}
			}
		} else {
			if (EpochSpan < 220948.5) {
				if (EpochSpan < 1718) {
					if (COrgLengthSP < 12) {ints[727] = 1;}
					else {ints[728] = 1;}
				} else {
					if (CNUMRatioSP < 0.27) {ints[729] = 1;}
					else {ints[730] = 1;}
				}
			} else {
				if (CKWSRatio < 0.2) {ints[731] = 1;}
				if (CKWSRatio >= 0.2) {
					if (CNUMRatioSP < 0.74) {ints[732] = 1;}
					else {ints[733] = 1;}
				}
			}
		}
	}
} else {
	if (SimhashDist < 19.5) {
		if (InsertSpan < 85875.5) {
			if (CLocRatioNE < 0.8) {
				if (CNUMRatioSP < 1) {
					if (COrgRatioNE < 1) {ints[734] = 1;}
					else {ints[735] = 1;}
				} else {
					if (TitleLength < 17.5) {ints[736] = 1;}
					else {ints[737] = 1;}
				}
			} else {
				if (TKWSRatio < 1) {
					if (CLocRatioNE < 1) {ints[738] = 1;}
					else {ints[739] = 1;}
				} else {
					if (CNUMRatioSP < 0.4) {ints[740] = 1;}
					else {ints[741] = 1;}
				}
			}
		} else {
			if (CNUMRatioSP < 0.56) {
				if (COrgLengthSP < 2.75) {
					if (CWordSpan < 160) {ints[742] = 1;}
					else {ints[743] = 1;}
				} else {
					if (HKWSRatio < 0.9) {ints[744] = 1;}
					else {ints[745] = 1;}
				}
			} else {
				if (CKWSLength < 2) {ints[746] = 1;}
				if (CKWSLength >= 2) {
					if (CLocRatioNE < 0.88) {ints[747] = 1;}
					else {ints[748] = 1;}
				}
			}
		}
	} else {
		if (HKWSRatio < 0.55) {
			if (InsertSpan < 149617) {
				if (CPerRatioNE < 0.3) {
					if (TitleDist < 0.5) {ints[749] = 1;}
					else {ints[750] = 1;}
				} else {
					if (SimhashDist < 63.5) {ints[751] = 1;}
					else {ints[752] = 1;}
				}
			} else {
				if (InsertSpan < 267291) {
					if (CPerRatioNE < 0.56) {ints[753] = 1;}
					else {ints[754] = 1;}
				} else {
					if (CTimRatioSP < 0.47) {ints[755] = 1;}
					else {ints[756] = 1;}
				}
			}
		} else {
			if (InsertSpan < 251530.5) {
				if (EpochSpan < 72108) {
					if (TitleRatio < 0.32) {ints[757] = 1;}
					else {ints[758] = 1;}
				} else {
					if (CPerRatioNE < 0.28) {ints[759] = 1;}
					else {ints[760] = 1;}
				}
			} else {
				if (SameSRC < 0.5) {
					if (CNUMLengthSP < 4.75) {ints[761] = 1;}
					else {ints[762] = 1;}
				} else {
					if (CLocLengthNE < 10.25) {ints[763] = 1;}
					else {ints[764] = 1;}
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
					if (CatRatio < 0.54) {ints[768] = 1;}
					else {ints[769] = 1;}
				} else {
					if (COrgRatioNE < 0.41) {ints[770] = 1;}
					else {ints[771] = 1;}
				}
			} else {
				if (TitleLength < 8.25) {
					if (CNUMLengthSP < 2.75) {ints[772] = 1;}
					else {ints[773] = 1;}
				} else {
					if (EpochSpan < 234176) {ints[774] = 1;}
					else {ints[775] = 1;}
				}
			}
		} else {
			if (SimhashDist < 71.5) {
				if (CLocLengthSP < 20.75) {
					if (CKWSRatio < 0.28) {ints[776] = 1;}
					else {ints[777] = 1;}
				} else {
					if (CKWSRatio < 0.22) {ints[778] = 1;}
					else {ints[779] = 1;}
				}
			} else {
				if (CLocRatioNE < 0.55) {
					if (CWordSpan < 8.5) {ints[780] = 1;}
					else {ints[781] = 1;}
				} else {
					if (EpochSpan < 55069.5) {ints[782] = 1;}
					else {ints[783] = 1;}
				}
			}
		}
	} else {
		if (HKWSRatio < 0.52) {
			if (CLocRatioNE < 0.57) {
				if (ChannelLength < 4.25) {
					if (CTimRatioSP < 0.26) {ints[784] = 1;}
					else {ints[785] = 1;}
				} else {
					if (SimhashDist < 79.5) {ints[786] = 1;}
					else {ints[787] = 1;}
				}
			} else {
				if (COrgRatioSP < 0.45) {
					if (CKWSLength < 12.75) {ints[788] = 1;}
					else {ints[789] = 1;}
				} else {
					if (InsertSpan < 83328.5) {ints[790] = 1;}
					else {ints[791] = 1;}
				}
			}
		} else {
			if (InsertSpan < 308548.5) {
				if (CLocRatioNE < 0.56) {
					if (COrgRatioSP < 0.53) {ints[792] = 1;}
					else {ints[793] = 1;}
				} else {
					if (CKWSRatio < 0.41) {ints[794] = 1;}
					else {ints[795] = 1;}
				}
			} else {
				if (COrgLengthSP < 6.25) {
					if (TitleRatio < 0.23) {ints[796] = 1;}
					else {ints[797] = 1;}
				} else {
					if (CWordSpan < 313) {ints[798] = 1;}
					else {ints[799] = 1;}
				}
			}
		}
	}
} else {
	if (EpochSpan < 75486) {
		if (TitleRatio < 0.89) {
			if (SimhashDist < 71.5) {
				if (SameSRC < 0.5) {
					if (CPerRatioSP < 0.16) {ints[800] = 1;}
					else {ints[801] = 1;}
				} else {
					if (CLocRatioNE < 0.35) {ints[802] = 1;}
					else {ints[803] = 1;}
				}
			} else {
				if (TKWSRatio < 0.42) {
					if (CLocRatioNE < 0.31) {ints[804] = 1;}
					else {ints[805] = 1;}
				} else {
					if (CPerRatioSP < 0.46) {ints[806] = 1;}
					else {ints[807] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.46) {
				if (SameSRC < 0.5) {
					if (COrgRatioSP < 0.06) {ints[808] = 1;}
					else {ints[809] = 1;}
				} else {
					if (InsertSpan < 6154.5) {ints[810] = 1;}
					else {ints[811] = 1;}
				}
			} else {
				if (CKWSLength < 7.25) {
					if (TitleLength < 9.5) {ints[812] = 1;}
					else {ints[813] = 1;}
				} else {
					if (CPerLengthNE < 8.25) {ints[814] = 1;}
					else {ints[815] = 1;}
				}
			}
		}
	} else {
		if (InsertSpan < 271170) {
			if (CKWSRatio < 0.3) {
				if (HKWSRatio < 0.78) {
					if (TitleDist < 59.5) {ints[816] = 1;}
					else {ints[817] = 1;}
				} else {
					if (COrgLengthSP < 2.75) {ints[818] = 1;}
					else {ints[819] = 1;}
				}
			} else {
				if (CPerLengthSP < 2.75) {
					if (CKWSRatio < 0.55) {ints[820] = 1;}
					else {ints[821] = 1;}
				} else {
					if (CPerRatioNE < 0.39) {ints[822] = 1;}
					else {ints[823] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.73) {
				if (EpochSpan < 879481.5) {
					if (ParagraphSpan < 2.5) {ints[824] = 1;}
					else {ints[825] = 1;}
				} else {
					if (CNUMLengthSP < 9.75) {ints[826] = 1;}
					else {ints[827] = 1;}
				}
			} else {
				if (CLocRatioSP < 0.9) {
					if (ChannelLength < 4.75) {ints[828] = 1;}
					else {ints[829] = 1;}
				} else {
					if (CNUMRatioSP < 0.42) {ints[830] = 1;}
					else {ints[831] = 1;}
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
					if (ChannelRatio < 0.24) {ints[832] = 1;}
					else {ints[833] = 1;}
				} else {
					if (InsertSpan < 2767756) {ints[834] = 1;}
					else {ints[835] = 1;}
				}
			} else {
				if (ParagraphSpan < 11.5) {
					if (CatRatio < 0.51) {ints[836] = 1;}
					else {ints[837] = 1;}
				} else {
					if (CatRatio < 0.27) {ints[838] = 1;}
					else {ints[839] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.11) {
				if (CLocLengthSP < 23.25) {
					if (CPerLengthSP < 32.75) {ints[840] = 1;}
					else {ints[841] = 1;}
				} else {
					if (CTimLengthSP < 17.75) {ints[842] = 1;}
					else {ints[843] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.23) {
					if (CKWSRatio < 0.27) {ints[844] = 1;}
					else {ints[845] = 1;}
				} else {
					if (CatLength < 1.06) {ints[846] = 1;}
					else {ints[847] = 1;}
				}
			}
		}
	} else {
		if (EpochSpan < 98074.5) {
			if (COrgRatioSP < 0.52) {
				if (CLocRatioNE < 0.25) {
					if (COrgLengthSP < 18.75) {ints[848] = 1;}
					else {ints[849] = 1;}
				} else {
					if (CPerRatioNE < 0.57) {ints[850] = 1;}
					else {ints[851] = 1;}
				}
			} else {
				if (CTimLengthSP < 37.25) {
					if (CKWSRatio < 0.28) {ints[852] = 1;}
					else {ints[853] = 1;}
				} else {
					if (COrgLengthSP < 17.25) {ints[854] = 1;}
					else {ints[855] = 1;}
				}
			}
		} else {
			if (CLocRatioSP < 0.6) {
				if (SimhashDist < 68.5) {
					if (TKWSRatio < 0.38) {ints[856] = 1;}
					else {ints[857] = 1;}
				} else {
					if (TitleRatio < 0.11) {ints[858] = 1;}
					else {ints[859] = 1;}
				}
			} else {
				if (COrgRatioSP < 0.24) {
					if (CPerRatioSP < 0.44) {ints[860] = 1;}
					else {ints[861] = 1;}
				} else {
					if (SimhashDist < 81.5) {ints[862] = 1;}
					else {ints[863] = 1;}
				}
			}
		}
	}
} else {
	if (EpochSpan < 83699) {
		if (TitleRatio < 0.9) {
			if (SimhashDist < 71.5) {
				if (TitleLength < 5.25) {
					if (GeoRatio < 0.58) {ints[864] = 1;}
					else {ints[865] = 1;}
				} else {
					if (CKWSRatio < 0.29) {ints[866] = 1;}
					else {ints[867] = 1;}
				}
			} else {
				if (COrgRatioSP < 0.46) {
					if (CPerRatioSP < 0.46) {ints[868] = 1;}
					else {ints[869] = 1;}
				} else {
					if (CTimRatioSP < 0.2) {ints[870] = 1;}
					else {ints[871] = 1;}
				}
			}
		} else {
			if (COrgRatioSP < 0.44) {
				if (ChannelRatio < 0.72) {
					if (CPerLengthNE < 54) {ints[872] = 1;}
					else {ints[873] = 1;}
				} else {
					if (CKWSRatio < 0.18) {ints[874] = 1;}
					else {ints[875] = 1;}
				}
			} else {
				if (TKWSLength < 5.25) {
					if (COrgLengthSP < 5.25) {ints[876] = 1;}
					else {ints[877] = 1;}
				} else {
					if (InsertSpan < 2043) {ints[878] = 1;}
					else {ints[879] = 1;}
				}
			}
		}
	} else {
		if (EpochSpan < 255602) {
			if (HKWSLength < 1.75) {
				if (CKWSRatio < 0.32) {
					if (SimhashDist < 61.5) {ints[880] = 1;}
					else {ints[881] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[882] = 1;}
					else {ints[883] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.39) {
					if (COrgRatioSP < 0.31) {ints[884] = 1;}
					else {ints[885] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[886] = 1;}
					else {ints[887] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.4) {
				if (COrgRatioNE < 0.45) {
					if (COrgLengthNE < 4.75) {ints[888] = 1;}
					else {ints[889] = 1;}
				} else {
					if (ChannelRatio < 0.45) {ints[890] = 1;}
					else {ints[891] = 1;}
				}
			} else {
				if (InsertSpan < 655886.5) {
					if (SameSRC < 0.5) {ints[892] = 1;}
					else {ints[893] = 1;}
				} else {
					if (CLocRatioNE < 0.64) {ints[894] = 1;}
					else {ints[895] = 1;}
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
					if (ChannelLength < 2.25) {ints[896] = 1;}
					else {ints[897] = 1;}
				} else {
					if (SimhashDist < 78.5) {ints[898] = 1;}
					else {ints[899] = 1;}
				}
			} else {
				if (CKWSRatio < 0.22) {
					if (TitleRatio < 0.3) {ints[900] = 1;}
					else {ints[901] = 1;}
				} else {
					if (TitleRatio < 0.11) {ints[902] = 1;}
					else {ints[903] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.32) {
				if (EpochSpan < 128354.5) {
					if (SimhashDist < 75.5) {ints[904] = 1;}
					else {ints[905] = 1;}
				} else {
					if (TitleRatio < 0.2) {ints[906] = 1;}
					else {ints[907] = 1;}
				}
			} else {
				if (EpochSpan < 254597.5) {
					if (CKWSRatio < 0.22) {ints[908] = 1;}
					else {ints[909] = 1;}
				} else {
					if (ChannelRatio < 0.26) {ints[910] = 1;}
					else {ints[911] = 1;}
				}
			}
		}
	} else {
		if (COrgRatioSP < 0.54) {
			if (CKWSRatio < 0.22) {
				if (TitleRatio < 0.18) {
					if (TitleDist < 42.5) {ints[912] = 1;}
					else {ints[913] = 1;}
				} else {
					if (EpochSpan < 61867) {ints[914] = 1;}
					else {ints[915] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.32) {
					if (EpochSpan < 115134.5) {ints[916] = 1;}
					else {ints[917] = 1;}
				} else {
					if (InsertSpan < 90704.5) {ints[918] = 1;}
					else {ints[919] = 1;}
				}
			}
		} else {
			if (COrgRatioNE < 0.87) {
				if (ChannelRatio < 0.17) {
					if (SimhashDist < 67.5) {ints[920] = 1;}
					else {ints[921] = 1;}
				} else {
					if (InsertSpan < 98888) {ints[922] = 1;}
					else {ints[923] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.87) {
					if (TitleRatio < 0.63) {ints[924] = 1;}
					else {ints[925] = 1;}
				} else {ints[926] = 1;}
			}
		}
	}
} else {
	if (CNUMRatioSP < 0.74) {
		if (SameSRC < 0.5) {
			if (InsertSpan < 251414) {
				if (TKWSRatio < 0.58) {
					if (CPerRatioSP < 0.54) {ints[927] = 1;}
					else {ints[928] = 1;}
				} else {
					if (CPerRatioSP < 0.6) {ints[929] = 1;}
					else {ints[930] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.32) {
					if (TKWSRatio < 0.18) {ints[931] = 1;}
					else {ints[932] = 1;}
				} else {
					if (CNUMRatioSP < 0.46) {ints[933] = 1;}
					else {ints[934] = 1;}
				}
			}
		} else {
			if (TitleDist < 0.5) {
				if (CPerRatioNE < 0.25) {
					if (TitleLength < 7.5) {ints[935] = 1;}
					else {ints[936] = 1;}
				} else {
					if (CKWSLength < 13.75) {ints[937] = 1;}
					else {ints[938] = 1;}
				}
			} else {
				if (HKWSRatio < 0.59) {
					if (CKWSRatio < 0.32) {ints[939] = 1;}
					else {ints[940] = 1;}
				} else {
					if (TKWSLength < 2.25) {ints[941] = 1;}
					else {ints[942] = 1;}
				}
			}
		}
	} else {
		if (TitleDist < 1.5) {
			if (EpochSpan < 86310) {
				if (COrgRatioSP < 0.11) {
					if (InsertSpan < 3742.5) {ints[943] = 1;}
					else {ints[944] = 1;}
				} else {
					if (TOrgLengthSP < 2.5) {ints[945] = 1;}
					else {ints[946] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.92) {
					if (COrgRatioSP < 0.71) {ints[947] = 1;}
					else {ints[948] = 1;}
				} else {
					if (EpochSpan < 328274.5) {ints[949] = 1;}
					else {ints[950] = 1;}
				}
			}
		} else {
			if (SameSRC < 0.5) {
				if (TitleRatio < 0.36) {
					if (CPerRatioSP < 0.49) {ints[951] = 1;}
					else {ints[952] = 1;}
				} else {
					if (InsertSpan < 266629) {ints[953] = 1;}
					else {ints[954] = 1;}
				}
			} else {
				if (CLocLengthSP < 20.25) {
					if (COrgLengthSP < 1.75) {ints[955] = 1;}
					else {ints[956] = 1;}
				} else {
					if (TKWSRatio < 0.91) {ints[957] = 1;}
					else {ints[958] = 1;}
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
					if (TKWSRatio < 0.02) {ints[960] = 1;}
					else {ints[961] = 1;}
				} else {
					if (TitleRatio < 0.1) {ints[962] = 1;}
					else {ints[963] = 1;}
				}
			} else {
				if (CatLength < 0.95) {
					if (ChannelRatio < 0.79) {ints[964] = 1;}
					else {ints[965] = 1;}
				} else {
					if (SimhashDist < 68.5) {ints[966] = 1;}
					else {ints[967] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.15) {
				if (CPerRatioSP < 0.32) {
					if (CatLength < 1.3) {ints[968] = 1;}
					else {ints[969] = 1;}
				} else {
					if (CLocRatioNE < 0.44) {ints[970] = 1;}
					else {ints[971] = 1;}
				}
			} else {
				if (COrgRatioSP < 0.5) {
					if (SimhashDist < 68.5) {ints[972] = 1;}
					else {ints[973] = 1;}
				} else {
					if (HKWSRatio < 0.7) {ints[974] = 1;}
					else {ints[975] = 1;}
				}
			}
		}
	} else {
		if (CPerRatioNE < 0.4) {
			if (EpochSpan < 77768.5) {
				if (CLocRatioNE < 0.5) {
					if (SimhashDist < 69.5) {ints[976] = 1;}
					else {ints[977] = 1;}
				} else {
					if (CWordSpan < 30.5) {ints[978] = 1;}
					else {ints[979] = 1;}
				}
			} else {
				if (CLocLengthNE < 13.25) {
					if (TitleRatio < 0.2) {ints[980] = 1;}
					else {ints[981] = 1;}
				} else {
					if (COrgRatioSP < 0.63) {ints[982] = 1;}
					else {ints[983] = 1;}
				}
			}
		} else {
			if (CPerLengthNE < 18.25) {
				if (CPerLengthSP < 0.75) {
					if (CWordSpan < 121) {ints[984] = 1;}
					else {ints[985] = 1;}
				} else {
					if (EpochSpan < 259109) {ints[986] = 1;}
					else {ints[987] = 1;}
				}
			} else {
				if (InsertSpan < 33649.5) {
					if (COrgRatioSP < 0.97) {ints[988] = 1;}
					else {ints[989] = 1;}
				} else {
					if (CKWSRatio < 0.4) {ints[990] = 1;}
					else {ints[991] = 1;}
				}
			}
		}
	}
} else {
	if (InsertSpan < 81549) {
		if (TKWSRatio < 0.91) {
			if (CPerRatioSP < 0.48) {
				if (TKWSRatio < 0.57) {
					if (CKWSRatio < 0.31) {ints[992] = 1;}
					else {ints[993] = 1;}
				} else {
					if (SimhashDist < 69.5) {ints[994] = 1;}
					else {ints[995] = 1;}
				}
			} else {
				if (TitleLength < 5.25) {
					if (COrgLengthSP < 3.75) {ints[996] = 1;}
					else {ints[997] = 1;}
				} else {
					if (CPerRatioNE < 0.74) {ints[998] = 1;}
					else {ints[999] = 1;}
				}
			}
		} else {
			if (CLocRatioNE < 0.7) {
				if (COrgRatioSP < 1) {
					if (CPerRatioSP < 0.5) {ints[1000] = 1;}
					else {ints[1001] = 1;}
				} else {
					if (SimhashDist < 8.5) {ints[1002] = 1;}
					else {ints[1003] = 1;}
				}
			} else {
				if (SimhashDist < 12.5) {
					if (ParagraphSpan < 17) {ints[1004] = 1;}
					else {ints[1005] = 1;}
				} else {
					if (CTimRatioSP < 0.85) {ints[1006] = 1;}
					else {ints[1007] = 1;}
				}
			}
		}
	} else {
		if (CPerRatioNE < 0.32) {
			if (EpochSpan < 229608.5) {
				if (COrgRatioNE < 0.15) {
					if (TitleRatio < 0.16) {ints[1008] = 1;}
					else {ints[1009] = 1;}
				} else {
					if (EpochSpan < 81808.5) {ints[1010] = 1;}
					else {ints[1011] = 1;}
				}
			} else {
				if (TitleRatio < 0.31) {
					if (SimhashDist < 81.5) {ints[1012] = 1;}
					else {ints[1013] = 1;}
				} else {
					if (CPerLengthSP < 56.75) {ints[1014] = 1;}
					else {ints[1015] = 1;}
				}
			}
		} else {
			if (InsertSpan < 274622.5) {
				if (CPerRatioSP < 0.61) {
					if (TitleRatio < 0.34) {ints[1016] = 1;}
					else {ints[1017] = 1;}
				} else {
					if (CLocLengthSP < 2.25) {ints[1018] = 1;}
					else {ints[1019] = 1;}
				}
			} else {
				if (EpochSpan < 98822.5) {
					if (CatRatio < 0.73) {ints[1020] = 1;}
					else {ints[1021] = 1;}
				} else {
					if (CKWSRatio < 0.27) {ints[1022] = 1;}
					else {ints[1023] = 1;}
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
					if (TKWSRatio < 0.35) {ints[1024] = 1;}
					else {ints[1025] = 1;}
				} else {
					if (CKWSLength < 13.25) {ints[1026] = 1;}
					else {ints[1027] = 1;}
				}
			} else {
				if (CKWSLength < 19.25) {
					if (TitleDist < 76) {ints[1028] = 1;}
					else {ints[1029] = 1;}
				} else {
					if (CPerLengthNE < 98.5) {ints[1030] = 1;}
					else {ints[1031] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.06) {
				if (SimhashDist < 76.5) {
					if (COrgRatioNE < 0.41) {ints[1032] = 1;}
					else {ints[1033] = 1;}
				} else {
					if (TitleRatio < 0.13) {ints[1034] = 1;}
					else {ints[1035] = 1;}
				}
			} else {
				if (TKWSRatio < 0.5) {
					if (CLocLengthSP < 19.75) {ints[1036] = 1;}
					else {ints[1037] = 1;}
				} else {
					if (COrgRatioSP < 0.5) {ints[1038] = 1;}
					else {ints[1039] = 1;}
				}
			}
		}
	} else {
		if (CLocRatioSP < 0.52) {
			if (CPerRatioSP < 0.28) {
				if (TitleLength < 8.25) {
					if (GeoRatio < 0.62) {ints[1040] = 1;}
					else {ints[1041] = 1;}
				} else {
					if (CKWSRatio < 0.33) {ints[1042] = 1;}
					else {ints[1043] = 1;}
				}
			} else {
				if (CKWSLength < 9.25) {
					if (TitleDist < 0.5) {ints[1044] = 1;}
					else {ints[1045] = 1;}
				} else {
					if (SimhashDist < 60.5) {ints[1046] = 1;}
					else {ints[1047] = 1;}
				}
			}
		} else {
			if (SimhashDist < 14.5) {
				if (TitleDist < 0.5) {
					if (COrgLengthNE < 2.25) {ints[1048] = 1;}
					else {ints[1049] = 1;}
				} else {
					if (CTimLengthSP < 21.5) {ints[1050] = 1;}
					else {ints[1051] = 1;}
				}
			} else {
				if (CKWSRatio < 0.34) {
					if (TitleRatio < 0.52) {ints[1052] = 1;}
					else {ints[1053] = 1;}
				} else {
					if (ParagraphSpan < 0.5) {ints[1054] = 1;}
					else {ints[1055] = 1;}
				}
			}
		}
	}
} else {
	if (SimhashDist < 68.5) {
		if (EpochSpan < 255690) {
			if (TKWSRatio < 0.69) {
				if (CTimRatioSP < 0.18) {
					if (CPerRatioSP < 0.59) {ints[1056] = 1;}
					else {ints[1057] = 1;}
				} else {
					if (ChannelRatio < 0.34) {ints[1058] = 1;}
					else {ints[1059] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.56) {
					if (SameSRC < 0.5) {ints[1060] = 1;}
					else {ints[1061] = 1;}
				} else {
					if (CNUMRatioSP < 0.44) {ints[1062] = 1;}
					else {ints[1063] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.61) {
				if (CPerLengthNE < 29.25) {
					if (CKWSRatio < 0.25) {ints[1064] = 1;}
					else {ints[1065] = 1;}
				} else {
					if (TitleDist < 46.5) {ints[1066] = 1;}
					else {ints[1067] = 1;}
				}
			} else {
				if (CNUMLengthSP < 13.75) {
					if (EpochSpan < 698395) {ints[1068] = 1;}
					else {ints[1069] = 1;}
				} else {
					if (CatLength < 0.86) {ints[1070] = 1;}
					else {ints[1071] = 1;}
				}
			}
		}
	} else {
		if (CKWSRatio < 0.26) {
			if (TKWSRatio < 0.36) {
				if (CatRatio < 0.55) {
					if (COrgRatioSP < 0.18) {ints[1072] = 1;}
					else {ints[1073] = 1;}
				} else {
					if (TitleDist < 30.5) {ints[1074] = 1;}
					else {ints[1075] = 1;}
				}
			} else {
				if (CTimRatioSP < 0.26) {
					if (CatRatio < 0.6) {ints[1076] = 1;}
					else {ints[1077] = 1;}
				} else {
					if (CLocRatioSP < 0.71) {ints[1078] = 1;}
					else {ints[1079] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.33) {
				if (EpochSpan < 313380.5) {
					if (CKWSRatio < 0.31) {ints[1080] = 1;}
					else {ints[1081] = 1;}
				} else {
					if (CNUMRatioSP < 0.1) {ints[1082] = 1;}
					else {ints[1083] = 1;}
				}
			} else {
				if (ChannelRatio < 0.17) {
					if (TitleRatio < 0.51) {ints[1084] = 1;}
					else {ints[1085] = 1;}
				} else {
					if (InsertSpan < 249059.5) {ints[1086] = 1;}
					else {ints[1087] = 1;}
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
					if (SimhashDist < 42.5) {ints[1088] = 1;}
					else {ints[1089] = 1;}
				} else {
					if (TKWSRatio < 0.33) {ints[1090] = 1;}
					else {ints[1091] = 1;}
				}
			} else {
				if (TitleRatio < 0.23) {
					if (COrgLengthSP < 8.25) {ints[1092] = 1;}
					else {ints[1093] = 1;}
				} else {
					if (CPerLengthSP < 9.75) {ints[1094] = 1;}
					else {ints[1095] = 1;}
				}
			}
		} else {
			if (SimhashDist < 67.5) {
				if (InsertSpan < 23473.5) {
					if (COrgLengthNE < 2) {ints[1096] = 1;}
					else {ints[1097] = 1;}
				} else {
					if (CLocRatioSP < 0.65) {ints[1098] = 1;}
					else {ints[1099] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.19) {
					if (EpochSpan < 72451) {ints[1100] = 1;}
					else {ints[1101] = 1;}
				} else {
					if (TitleRatio < 0.23) {ints[1102] = 1;}
					else {ints[1103] = 1;}
				}
			}
		}
	} else {
		if (COrgRatioSP < 0.43) {
			if (TitleRatio < 0.31) {
				if (CTimRatioSP < 0.45) {
					if (CKWSRatio < 0.24) {ints[1104] = 1;}
					else {ints[1105] = 1;}
				} else {
					if (CTimLengthSP < 27.25) {ints[1106] = 1;}
					else {ints[1107] = 1;}
				}
			} else {
				if (TKWSRatio < 0.55) {
					if (COrgRatioNE < 0.31) {ints[1108] = 1;}
					else {ints[1109] = 1;}
				} else {
					if (COrgLengthNE < 15.75) {ints[1110] = 1;}
					else {ints[1111] = 1;}
				}
			}
		} else {
			if (EpochSpan < 85866) {
				if (TitleDist < 0.5) {
					if (COrgRatioNE < 0.08) {ints[1112] = 1;}
					else {ints[1113] = 1;}
				} else {
					if (CLocRatioSP < 0.58) {ints[1114] = 1;}
					else {ints[1115] = 1;}
				}
			} else {
				if (CatLength < 0.78) {
					if (CTimRatioSP < 0.25) {ints[1116] = 1;}
					else {ints[1117] = 1;}
				} else {
					if (COrgRatioSP < 0.51) {ints[1118] = 1;}
					else {ints[1119] = 1;}
				}
			}
		}
	}
} else {
	if (CNUMRatioSP < 0.74) {
		if (CPerRatioSP < 0.61) {
			if (InsertSpan < 93931.5) {
				if (TKWSRatio < 0.44) {
					if (CPerLengthNE < 1.25) {ints[1120] = 1;}
					else {ints[1121] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[1122] = 1;}
					else {ints[1123] = 1;}
				}
			} else {
				if (CLocRatioSP < 0.57) {
					if (TitleRatio < 0.22) {ints[1124] = 1;}
					else {ints[1125] = 1;}
				} else {
					if (InsertSpan < 251250.5) {ints[1126] = 1;}
					else {ints[1127] = 1;}
				}
			}
		} else {
			if (SimhashDist < 63.5) {
				if (TPerRatioSP < 0.75) {
					if (TitleDist < 0.5) {ints[1128] = 1;}
					else {ints[1129] = 1;}
				} else {
					if (CatLength < 0.9) {ints[1130] = 1;}
					else {ints[1131] = 1;}
				}
			} else {
				if (EpochSpan < 127910.5) {
					if (TitleRatio < 0.37) {ints[1132] = 1;}
					else {ints[1133] = 1;}
				} else {
					if (CKWSRatio < 0.3) {ints[1134] = 1;}
					else {ints[1135] = 1;}
				}
			}
		}
	} else {
		if (COrgRatioSP < 0.91) {
			if (ChannelRatio < 0.77) {
				if (EpochSpan < 340387.5) {
					if (SameSRC < 0.5) {ints[1136] = 1;}
					else {ints[1137] = 1;}
				} else {
					if (CPerRatioSP < 0.53) {ints[1138] = 1;}
					else {ints[1139] = 1;}
				}
			} else {
				if (COrgLengthSP < 3.25) {
					if (CLocRatioNE < 0.95) {ints[1140] = 1;}
					else {ints[1141] = 1;}
				} else {
					if (CatLength < 1.34) {ints[1142] = 1;}
					else {ints[1143] = 1;}
				}
			}
		} else {
			if (TitleDist < 1.5) {
				if (TitleLength < 17.5) {
					if (TOrgLengthSP < 2.5) {ints[1144] = 1;}
					else {ints[1145] = 1;}
				} else {
					if (CPerLengthSP < 2) {ints[1146] = 1;}
					else {ints[1147] = 1;}
				}
			} else {
				if (CLocRatioNE < 0.8) {
					if (ChannelLength < 4.75) {ints[1148] = 1;}
					else {ints[1149] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[1150] = 1;}
					else {ints[1151] = 1;}
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
					if (CKWSRatio < 0.12) {ints[1152] = 1;}
					else {ints[1153] = 1;}
				} else {
					if (EpochSpan < 1370) {ints[1154] = 1;}
					else {ints[1155] = 1;}
				}
			} else {
				if (HKWSRatio < 0.9) {
					if (TitleDist < 11) {ints[1156] = 1;}
					else {ints[1157] = 1;}
				} else {
					if (EpochSpan < 8672.5) {ints[1158] = 1;}
					else {ints[1159] = 1;}
				}
			}
		} else {
			if (EpochSpan < 79416) {
				if (TKWSRatio < 0.56) {
					if (CLocRatioNE < 0.2) {ints[1160] = 1;}
					else {ints[1161] = 1;}
				} else {
					if (COrgRatioNE < 0.15) {ints[1162] = 1;}
					else {ints[1163] = 1;}
				}
			} else {
				if (COrgRatioSP < 0.43) {
					if (CKWSRatio < 0.31) {ints[1164] = 1;}
					else {ints[1165] = 1;}
				} else {
					if (InsertSpan < 188207.5) {ints[1166] = 1;}
					else {ints[1167] = 1;}
				}
			}
		}
	} else {
		if (TitleRatio < 0.38) {
			if (CKWSRatio < 0.29) {
				if (COrgRatioSP < 0.16) {
					if (CNUMRatioSP < 0.23) {ints[1168] = 1;}
					else {ints[1169] = 1;}
				} else {
					if (CTimLengthSP < 21.25) {ints[1170] = 1;}
					else {ints[1171] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.65) {
					if (SimhashDist < 63.5) {ints[1172] = 1;}
					else {ints[1173] = 1;}
				} else {
					if (TKWSRatio < 0.2) {ints[1174] = 1;}
					else {ints[1175] = 1;}
				}
			}
		} else {
			if (SameSRC < 0.5) {
				if (EpochSpan < 251173) {
					if (CLocLengthSP < 6.25) {ints[1176] = 1;}
					else {ints[1177] = 1;}
				} else {
					if (SimhashDist < 71.5) {ints[1178] = 1;}
					else {ints[1179] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.44) {
					if (CPerRatioSP < 0.43) {ints[1180] = 1;}
					else {ints[1181] = 1;}
				} else {
					if (InsertSpan < 261999.5) {ints[1182] = 1;}
					else {ints[1183] = 1;}
				}
			}
		}
	}
} else {
	if (SimhashDist < 14.5) {
		if (EpochSpan < 14.5) {
			if (ParagraphSpan < 23.5) {
				if (TOrgLengthNE < 2.5) {
					if (CKWSLength < 6.25) {ints[1184] = 1;}
					else {ints[1185] = 1;}
				} else {
					if (COrgRatioNE < 1) {ints[1186] = 1;}
					else {ints[1187] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.6) {ints[1188] = 1;}
				else {ints[1189] = 1;}
			}
		} else {
			if (CLocRatioNE < 0.97) {
				if (TitleLength < 5.25) {
					if (CKWSRatio < 0.76) {ints[1190] = 1;}
					else {ints[1191] = 1;}
				} else {
					if (TitleRatio < 0.73) {ints[1192] = 1;}
					else {ints[1193] = 1;}
				}
			} else {
				if (TKWSRatio < 0.9) {
					if (CNUMLengthSP < 32.5) {ints[1194] = 1;}
					else {ints[1195] = 1;}
				} else {
					if (CatRatio < 0.25) {ints[1196] = 1;}
					else {ints[1197] = 1;}
				}
			}
		}
	} else {
		if (SameSRC < 0.5) {
			if (CPerRatioNE < 0.28) {
				if (InsertSpan < 84120) {
					if (SimhashDist < 77.5) {ints[1198] = 1;}
					else {ints[1199] = 1;}
				} else {
					if (CKWSRatio < 0.53) {ints[1200] = 1;}
					else {ints[1201] = 1;}
				}
			} else {
				if (CKWSLength < 8.75) {
					if (CTimLengthSP < 8.25) {ints[1202] = 1;}
					else {ints[1203] = 1;}
				} else {
					if (TKWSRatio < 0.49) {ints[1204] = 1;}
					else {ints[1205] = 1;}
				}
			}
		} else {
			if (COrgRatioSP < 0.82) {
				if (EpochSpan < 769583) {
					if (CLocLengthSP < 26.25) {ints[1206] = 1;}
					else {ints[1207] = 1;}
				} else {
					if (InsertSpan < 259553.5) {ints[1208] = 1;}
					else {ints[1209] = 1;}
				}
			} else {
				if (ChannelLength < 4.75) {
					if (EpochSpan < 303386) {ints[1210] = 1;}
					else {ints[1211] = 1;}
				} else {
					if (EpochSpan < 81397) {ints[1212] = 1;}
					else {ints[1213] = 1;}
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
					if (EpochSpan < 95023) {ints[1216] = 1;}
					else {ints[1217] = 1;}
				} else {
					if (CPerRatioNE < 0.19) {ints[1218] = 1;}
					else {ints[1219] = 1;}
				}
			} else {
				if (SameSRC < 0.5) {
					if (CNUMLengthSP < 7.25) {ints[1220] = 1;}
					else {ints[1221] = 1;}
				} else {
					if (HKWSRatio < 0.84) {ints[1222] = 1;}
					else {ints[1223] = 1;}
				}
			}
		} else {
			if (EpochSpan < 255419) {
				if (TitleLength < 5.75) {
					if (CKWSLength < 7.75) {ints[1224] = 1;}
					else {ints[1225] = 1;}
				} else {
					if (CPerRatioNE < 0.46) {ints[1226] = 1;}
					else {ints[1227] = 1;}
				}
			} else {
				if (CTimLengthSP < 4.25) {
					if (SimhashDist < 63.5) {ints[1228] = 1;}
					else {ints[1229] = 1;}
				} else {
					if (CLocRatioNE < 0.71) {ints[1230] = 1;}
					else {ints[1231] = 1;}
				}
			}
		}
	} else {
		if (CNUMRatioSP < 0.74) {
			if (CKWSLength < 13.25) {
				if (CatLength < 1.44) {
					if (InsertSpan < 81086.5) {ints[1232] = 1;}
					else {ints[1233] = 1;}
				} else {
					if (InsertSpan < 15613) {ints[1234] = 1;}
					else {ints[1235] = 1;}
				}
			} else {
				if (SimhashDist < 9.5) {ints[1236] = 1;}
				if (SimhashDist >= 9.5) {
					if (EpochSpan < 86762) {ints[1237] = 1;}
					else {ints[1238] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.99) {
				if (CatLength < 1.08) {
					if (TKWSRatio < 0.29) {ints[1239] = 1;}
					else {ints[1240] = 1;}
				} else {
					if (TitleRatio < 0.83) {ints[1241] = 1;}
					else {ints[1242] = 1;}
				}
			} else {
				if (SimhashDist < 37.5) {
					if (COrgLengthSP < 29.5) {ints[1243] = 1;}
					else {ints[1244] = 1;}
				} else {
					if (InsertSpan < 75557) {ints[1245] = 1;}
					else {ints[1246] = 1;}
				}
			}
		}
	}
} else {
	if (HKWSRatio < 0.39) {
		if (TitleRatio < 0.18) {
			if (CTimRatioSP < 0.31) {
				if (ChannelRatio < 0.11) {
					if (COrgRatioSP < 0.24) {ints[1247] = 1;}
					else {ints[1248] = 1;}
				} else {
					if (CKWSRatio < 0.19) {ints[1249] = 1;}
					else {ints[1250] = 1;}
				}
			} else {
				if (TKWSRatio < 0.16) {
					if (CTimRatioSP < 0.68) {ints[1251] = 1;}
					else {ints[1252] = 1;}
				} else {
					if (CPerRatioNE < 0.37) {ints[1253] = 1;}
					else {ints[1254] = 1;}
				}
			}
		} else {
			if (SameSRC < 0.5) {
				if (CKWSRatio < 0.31) {
					if (TKWSRatio < 0.52) {ints[1255] = 1;}
					else {ints[1256] = 1;}
				} else {
					if (InsertSpan < 154124) {ints[1257] = 1;}
					else {ints[1258] = 1;}
				}
			} else {
				if (CKWSRatio < 0.29) {
					if (SimhashDist < 73.5) {ints[1259] = 1;}
					else {ints[1260] = 1;}
				} else {
					if (TKWSRatio < 0.35) {ints[1261] = 1;}
					else {ints[1262] = 1;}
				}
			}
		}
	} else {
		if (TitleRatio < 0.31) {
			if (InsertSpan < 107633.5) {
				if (TKWSRatio < 0.29) {
					if (CatRatio < 0.37) {ints[1263] = 1;}
					else {ints[1264] = 1;}
				} else {
					if (COrgRatioSP < 0.63) {ints[1265] = 1;}
					else {ints[1266] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.25) {
					if (EpochSpan < 585810) {ints[1267] = 1;}
					else {ints[1268] = 1;}
				} else {
					if (HKWSLength < 1.25) {ints[1269] = 1;}
					else {ints[1270] = 1;}
				}
			}
		} else {
			if (EpochSpan < 60573.5) {
				if (TKWSRatio < 0.67) {
					if (COrgLengthSP < 15.25) {ints[1271] = 1;}
					else {ints[1272] = 1;}
				} else {
					if (CTimRatioSP < 0.44) {ints[1273] = 1;}
					else {ints[1274] = 1;}
				}
			} else {
				if (InsertSpan < 277057) {
					if (CPerRatioNE < 0.14) {ints[1275] = 1;}
					else {ints[1276] = 1;}
				} else {
					if (CNUMRatioSP < 0.42) {ints[1277] = 1;}
					else {ints[1278] = 1;}
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
					if (TitleRatio < 0.12) {ints[1280] = 1;}
					else {ints[1281] = 1;}
				} else {
					if (TitleLength < 12.25) {ints[1282] = 1;}
					else {ints[1283] = 1;}
				}
			} else {
				if (TitleRatio < 0.11) {
					if (CLocLengthNE < 15.25) {ints[1284] = 1;}
					else {ints[1285] = 1;}
				} else {
					if (CKWSRatio < 0.49) {ints[1286] = 1;}
					else {ints[1287] = 1;}
				}
			}
		} else {
			if (COrgRatioSP < 0.28) {
				if (TitleRatio < 0.21) {
					if (CTimLengthSP < 33.25) {ints[1288] = 1;}
					else {ints[1289] = 1;}
				} else {
					if (CNUMRatioSP < 0.69) {ints[1290] = 1;}
					else {ints[1291] = 1;}
				}
			} else {
				if (TitleRatio < 0.22) {
					if (CLocLengthSP < 21) {ints[1292] = 1;}
					else {ints[1293] = 1;}
				} else {
					if (CKWSRatio < 0.31) {ints[1294] = 1;}
					else {ints[1295] = 1;}
				}
			}
		}
	} else {
		if (CKWSRatio < 0.32) {
			if (CPerLengthSP < 15.25) {
				if (InsertSpan < 282781.5) {
					if (SimhashDist < 59.5) {ints[1296] = 1;}
					else {ints[1297] = 1;}
				} else {ints[1298] = 1;}
			} else {
				if (COrgRatioNE < 0.04) {
					if (CLocRatioNE < 0.78) {ints[1299] = 1;}
					else {ints[1300] = 1;}
				} else {
					if (ParagraphSpan < 7.5) {ints[1301] = 1;}
					else {ints[1302] = 1;}
				}
			}
		} else {
			if (EpochSpan < 78360) {
				if (InsertSpan < 7281) {
					if (CWordSpan < 48.5) {ints[1303] = 1;}
					else {ints[1304] = 1;}
				} else {
					if (SimhashDist < 60.5) {ints[1305] = 1;}
					else {ints[1306] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.15) {
					if (TitleDist < 70.5) {ints[1307] = 1;}
					else {ints[1308] = 1;}
				} else {
					if (CWordSpan < 5) {ints[1309] = 1;}
					else {ints[1310] = 1;}
				}
			}
		}
	}
} else {
	if (TitleDist < 0.5) {
		if (EpochSpan < 82174) {
			if (CTimLengthSP < 0.75) {
				if (TKWSRatio < 0.79) {
					if (CKWSRatio < 0.73) {ints[1311] = 1;}
					else {ints[1312] = 1;}
				} else {
					if (EpochSpan < 703) {ints[1313] = 1;}
					else {ints[1314] = 1;}
				}
			} else {
				if (InsertSpan < 1013855.5) {
					if (CNUMRatioSP < 0.82) {ints[1315] = 1;}
					else {ints[1316] = 1;}
				} else {
					if (InsertSpan < 1078898) {ints[1317] = 1;}
					else {ints[1318] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.64) {
				if (SameSRC < 0.5) {
					if (CatLength < 1.08) {ints[1319] = 1;}
					else {ints[1320] = 1;}
				} else {
					if (CPerRatioNE < 0.14) {ints[1321] = 1;}
					else {ints[1322] = 1;}
				}
			} else {
				if (CKWSLength < 11.75) {
					if (SimhashDist < 3.5) {ints[1323] = 1;}
					else {ints[1324] = 1;}
				} else {
					if (TKWSLength < 1.25) {ints[1325] = 1;}
					else {ints[1326] = 1;}
				}
			}
		}
	} else {
		if (SimhashDist < 71.5) {
			if (CNUMRatioSP < 0.41) {
				if (TitleRatio < 0.42) {
					if (CKWSRatio < 0.27) {ints[1327] = 1;}
					else {ints[1328] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[1329] = 1;}
					else {ints[1330] = 1;}
				}
			} else {
				if (HKWSRatio < 0.36) {
					if (CLocRatioNE < 0.58) {ints[1331] = 1;}
					else {ints[1332] = 1;}
				} else {
					if (InsertSpan < 286186) {ints[1333] = 1;}
					else {ints[1334] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.26) {
				if (CPerRatioNE < 0.33) {
					if (TitleRatio < 0.17) {ints[1335] = 1;}
					else {ints[1336] = 1;}
				} else {
					if (CatLength < 1.34) {ints[1337] = 1;}
					else {ints[1338] = 1;}
				}
			} else {
				if (EpochSpan < 72662) {
					if (CNUMLengthSP < 35.25) {ints[1339] = 1;}
					else {ints[1340] = 1;}
				} else {
					if (EpochSpan < 234719.5) {ints[1341] = 1;}
					else {ints[1342] = 1;}
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
					if (CPerRatioSP < 0.45) {ints[1344] = 1;}
					else {ints[1345] = 1;}
				} else {
					if (CNUMLengthSP < 28) {ints[1346] = 1;}
					else {ints[1347] = 1;}
				}
			} else {
				if (CTimLengthSP < 8.75) {
					if (ParagraphSpan < 6.5) {ints[1348] = 1;}
					else {ints[1349] = 1;}
				} else {
					if (COrgRatioNE < 0.68) {ints[1350] = 1;}
					else {ints[1351] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.12) {
				if (TKWSLength < 2.75) {
					if (InsertSpan < 3259) {ints[1352] = 1;}
					else {ints[1353] = 1;}
				} else {
					if (TitleDist < 60.5) {ints[1354] = 1;}
					else {ints[1355] = 1;}
				}
			} else {
				if (TKWSRatio < 0.72) {
					if (COrgLengthSP < 11.25) {ints[1356] = 1;}
					else {ints[1357] = 1;}
				} else {
					if (CPerRatioSP < 0.68) {ints[1358] = 1;}
					else {ints[1359] = 1;}
				}
			}
		}
	} else {
		if (CKWSRatio < 0.38) {
			if (COrgRatioSP < 0.64) {
				if (CLocLengthSP < 14.25) {
					if (CPerRatioNE < 0.4) {ints[1360] = 1;}
					else {ints[1361] = 1;}
				} else {
					if (TKWSLength < 4.25) {ints[1362] = 1;}
					else {ints[1363] = 1;}
				}
			} else {
				if (InsertSpan < 81415) {
					if (HKWSLength < 1.75) {ints[1364] = 1;}
					else {ints[1365] = 1;}
				} else {
					if (TKWSLength < 3.25) {ints[1366] = 1;}
					else {ints[1367] = 1;}
				}
			}
		} else {
			if (SameSRC < 0.5) {
				if (EpochSpan < 96655.5) {
					if (TKWSRatio < 0.52) {ints[1368] = 1;}
					else {ints[1369] = 1;}
				} else {
					if (EpochSpan < 457478) {ints[1370] = 1;}
					else {ints[1371] = 1;}
				}
			} else {
				if (TitleRatio < 0.11) {
					if (CLocLengthNE < 8.5) {ints[1372] = 1;}
					else {ints[1373] = 1;}
				} else {
					if (TitleLength < 13.25) {ints[1374] = 1;}
					else {ints[1375] = 1;}
				}
			}
		}
	}
} else {
	if (CNUMRatioSP < 0.72) {
		if (COrgRatioSP < 0.41) {
			if (CPerRatioSP < 0.3) {
				if (TitleDist < 0.5) {
					if (ChannelRatio < 0.52) {ints[1376] = 1;}
					else {ints[1377] = 1;}
				} else {
					if (InsertSpan < 83137.5) {ints[1378] = 1;}
					else {ints[1379] = 1;}
				}
			} else {
				if (CKWSRatio < 0.42) {
					if (EpochSpan < 256071) {ints[1380] = 1;}
					else {ints[1381] = 1;}
				} else {
					if (EpochSpan < 259110) {ints[1382] = 1;}
					else {ints[1383] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.38) {
				if (CNUMRatioSP < 0.53) {
					if (CKWSRatio < 0.33) {ints[1384] = 1;}
					else {ints[1385] = 1;}
				} else {
					if (CNUMLengthSP < 13.75) {ints[1386] = 1;}
					else {ints[1387] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.48) {
					if (COrgLengthSP < 3.25) {ints[1388] = 1;}
					else {ints[1389] = 1;}
				} else {
					if (CKWSLength < 9.75) {ints[1390] = 1;}
					else {ints[1391] = 1;}
				}
			}
		}
	} else {
		if (TKWSRatio < 0.91) {
			if (CPerRatioSP < 0.68) {
				if (EpochSpan < 73595.5) {
					if (COrgRatioSP < 0.34) {ints[1392] = 1;}
					else {ints[1393] = 1;}
				} else {
					if (TitleRatio < 0.83) {ints[1394] = 1;}
					else {ints[1395] = 1;}
				}
			} else {
				if (EpochSpan < 336036.5) {
					if (CPerLengthNE < 9.75) {ints[1396] = 1;}
					else {ints[1397] = 1;}
				} else {
					if (SimhashDist < 21.5) {ints[1398] = 1;}
					else {ints[1399] = 1;}
				}
			}
		} else {
			if (EpochSpan < 70445) {
				if (TOrgLengthSP < 2.5) {
					if (COrgLengthNE < 4.75) {ints[1400] = 1;}
					else {ints[1401] = 1;}
				} else {
					if (TKWSLength < 10.75) {ints[1402] = 1;}
					else {ints[1403] = 1;}
				}
			} else {
				if (TKWSLength < 1.5) {
					if (EpochSpan < 81244.5) {ints[1404] = 1;}
					else {ints[1405] = 1;}
				} else {
					if (SimhashDist < 20) {ints[1406] = 1;}
					else {ints[1407] = 1;}
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
					if (CKWSRatio < 0.42) {ints[1408] = 1;}
					else {ints[1409] = 1;}
				} else {
					if (CLocLengthSP < 11.25) {ints[1410] = 1;}
					else {ints[1411] = 1;}
				}
			} else {
				if (CKWSRatio < 0.17) {ints[1412] = 1;}
				if (CKWSRatio >= 0.17) {
					if (ChannelRatio < 0.62) {ints[1413] = 1;}
					else {ints[1414] = 1;}
				}
			}
		} else {
			if (CPerRatioNE < 0.21) {
				if (CKWSRatio < 0.21) {
					if (COrgLengthNE < 5.25) {ints[1415] = 1;}
					else {ints[1416] = 1;}
				} else {
					if (CTimRatioSP < 0.62) {ints[1417] = 1;}
					else {ints[1418] = 1;}
				}
			} else {
				if (CKWSRatio < 0.32) {
					if (CWordSpan < 2035) {ints[1419] = 1;}
					else {ints[1420] = 1;}
				} else {
					if (ChannelRatio < 0.71) {ints[1421] = 1;}
					else {ints[1422] = 1;}
				}
			}
		}
	} else {
		if (CPerRatioSP < 0.34) {
			if (TitleRatio < 0.1) {
				if (CKWSRatio < 0.25) {
					if (TPerRatioSP < 0.26) {ints[1423] = 1;}
					else {ints[1424] = 1;}
				} else {
					if (EpochSpan < 68516) {ints[1425] = 1;}
					else {ints[1426] = 1;}
				}
			} else {
				if (EpochSpan < 26131.5) {
					if (SimhashDist < 74.5) {ints[1427] = 1;}
					else {ints[1428] = 1;}
				} else {
					if (COrgRatioNE < 0.6) {ints[1429] = 1;}
					else {ints[1430] = 1;}
				}
			}
		} else {
			if (SimhashDist < 61.5) {
				if (TitleDist < 34.5) {
					if (CPerLengthSP < 1.25) {ints[1431] = 1;}
					else {ints[1432] = 1;}
				} else {
					if (InsertSpan < 226772) {ints[1433] = 1;}
					else {ints[1434] = 1;}
				}
			} else {
				if (TitleRatio < 0.23) {
					if (CLocRatioNE < 0.42) {ints[1435] = 1;}
					else {ints[1436] = 1;}
				} else {
					if (EpochSpan < 105073) {ints[1437] = 1;}
					else {ints[1438] = 1;}
				}
			}
		}
	}
} else {
	if (TitleRatio < 0.93) {
		if (TitleRatio < 0.38) {
			if (InsertSpan < 110708.5) {
				if (CLocRatioSP < 0.47) {
					if (CPerRatioNE < 0.29) {ints[1439] = 1;}
					else {ints[1440] = 1;}
				} else {
					if (CKWSRatio < 0.36) {ints[1441] = 1;}
					else {ints[1442] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.42) {
					if (CPerRatioNE < 0.2) {ints[1443] = 1;}
					else {ints[1444] = 1;}
				} else {
					if (EpochSpan < 226141) {ints[1445] = 1;}
					else {ints[1446] = 1;}
				}
			}
		} else {
			if (EpochSpan < 255212) {
				if (CPerRatioSP < 0.31) {
					if (SameSRC < 0.5) {ints[1447] = 1;}
					else {ints[1448] = 1;}
				} else {
					if (CKWSLength < 9.25) {ints[1449] = 1;}
					else {ints[1450] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.72) {
					if (CPerRatioSP < 0.58) {ints[1451] = 1;}
					else {ints[1452] = 1;}
				} else {
					if (CPerRatioSP < 0.43) {ints[1453] = 1;}
					else {ints[1454] = 1;}
				}
			}
		}
	} else {
		if (InsertSpan < 86316.5) {
			if (CPerRatioSP < 0.86) {
				if (SameSRC < 0.5) {
					if (CatRatio < 0.77) {ints[1455] = 1;}
					else {ints[1456] = 1;}
				} else {
					if (InsertSpan < 25370) {ints[1457] = 1;}
					else {ints[1458] = 1;}
				}
			} else {
				if (CWordSpan < 1.5) {
					if (CTimRatioSP < 0.91) {ints[1459] = 1;}
					else {ints[1460] = 1;}
				} else {ints[1461] = 1;}
			}
		} else {
			if (COrgRatioNE < 0.54) {
				if (CWordSpan < 1.5) {
					if (EpochSpan < 603005.5) {ints[1462] = 1;}
					else {ints[1463] = 1;}
				} else {
					if (EpochSpan < 85281.5) {ints[1464] = 1;}
					else {ints[1465] = 1;}
				}
			} else {
				if (EpochSpan < 223159.5) {
					if (CNUMRatioSP < 0.83) {ints[1466] = 1;}
					else {ints[1467] = 1;}
				} else {
					if (CatLength < 0.91) {ints[1468] = 1;}
					else {ints[1469] = 1;}
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
					if (EpochSpan < 10707) {ints[1472] = 1;}
					else {ints[1473] = 1;}
				} else {
					if (COrgRatioNE < 0.14) {ints[1474] = 1;}
					else {ints[1475] = 1;}
				}
			} else {
				if (SimhashDist < 61.5) {
					if (EpochSpan < 161899.5) {ints[1476] = 1;}
					else {ints[1477] = 1;}
				} else {
					if (CKWSRatio < 0.35) {ints[1478] = 1;}
					else {ints[1479] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.25) {
				if (CTimRatioSP < 0.3) {
					if (CPerLengthSP < 30) {ints[1480] = 1;}
					else {ints[1481] = 1;}
				} else {
					if (SimhashDist < 38.5) {ints[1482] = 1;}
					else {ints[1483] = 1;}
				}
			} else {
				if (CKWSRatio < 0.35) {
					if (COrgRatioNE < 0.67) {ints[1484] = 1;}
					else {ints[1485] = 1;}
				} else {
					if (CPerRatioNE < 0.67) {ints[1486] = 1;}
					else {ints[1487] = 1;}
				}
			}
		}
	} else {
		if (TitleRatio < 0.31) {
			if (TitleRatio < 0.19) {
				if (CNUMRatioSP < 0.27) {
					if (CTimLengthSP < 7.25) {ints[1488] = 1;}
					else {ints[1489] = 1;}
				} else {
					if (CPerRatioNE < 0.31) {ints[1490] = 1;}
					else {ints[1491] = 1;}
				}
			} else {
				if (COrgRatioSP < 0.49) {
					if (CLocRatioSP < 0.7) {ints[1492] = 1;}
					else {ints[1493] = 1;}
				} else {
					if (EpochSpan < 270728) {ints[1494] = 1;}
					else {ints[1495] = 1;}
				}
			}
		} else {
			if (SimhashDist < 64.5) {
				if (SameSRC < 0.5) {
					if (EpochSpan < 85059) {ints[1496] = 1;}
					else {ints[1497] = 1;}
				} else {
					if (COrgRatioNE < 0.31) {ints[1498] = 1;}
					else {ints[1499] = 1;}
				}
			} else {
				if (CatRatio < 0.56) {
					if (InsertSpan < 109770) {ints[1500] = 1;}
					else {ints[1501] = 1;}
				} else {
					if (CLocRatioSP < 0.59) {ints[1502] = 1;}
					else {ints[1503] = 1;}
				}
			}
		}
	}
} else {
	if (CPerRatioSP < 0.62) {
		if (TitleRatio < 0.26) {
			if (EpochSpan < 80232) {
				if (CPerRatioNE < 0.45) {
					if (SimhashDist < 74.5) {ints[1504] = 1;}
					else {ints[1505] = 1;}
				} else {
					if (CLocRatioSP < 0.44) {ints[1506] = 1;}
					else {ints[1507] = 1;}
				}
			} else {
				if (CLocLengthNE < 14.25) {
					if (CKWSRatio < 0.29) {ints[1508] = 1;}
					else {ints[1509] = 1;}
				} else {
					if (COrgRatioSP < 0.11) {ints[1510] = 1;}
					else {ints[1511] = 1;}
				}
			}
		} else {
			if (InsertSpan < 129420) {
				if (CLocRatioSP < 0.54) {
					if (TKWSRatio < 0.58) {ints[1512] = 1;}
					else {ints[1513] = 1;}
				} else {
					if (EpochSpan < 73835.5) {ints[1514] = 1;}
					else {ints[1515] = 1;}
				}
			} else {
				if (CKWSRatio < 0.46) {
					if (COrgRatioSP < 0.6) {ints[1516] = 1;}
					else {ints[1517] = 1;}
				} else {
					if (TitleLength < 13.25) {ints[1518] = 1;}
					else {ints[1519] = 1;}
				}
			}
		}
	} else {
		if (CNUMRatioSP < 0.75) {
			if (InsertSpan < 270375.5) {
				if (EpochSpan < 250887.5) {
					if (SimhashDist < 67.5) {ints[1520] = 1;}
					else {ints[1521] = 1;}
				} else {
					if (CatRatio < 0.78) {ints[1522] = 1;}
					else {ints[1523] = 1;}
				}
			} else {
				if (SimhashDist < 69.5) {
					if (ParagraphSpan < 2.5) {ints[1524] = 1;}
					else {ints[1525] = 1;}
				} else {
					if (COrgLengthNE < 2.75) {ints[1526] = 1;}
					else {ints[1527] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.9) {
				if (CLocLengthNE < 1.25) {
					if (TitleLength < 7.75) {ints[1528] = 1;}
					else {ints[1529] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[1530] = 1;}
					else {ints[1531] = 1;}
				}
			} else {
				if (EpochSpan < 20893.5) {
					if (CNUMRatioSP < 1) {ints[1532] = 1;}
					else {ints[1533] = 1;}
				} else {
					if (CKWSRatio < 0.96) {ints[1534] = 1;}
					else {ints[1535] = 1;}
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
					if (CatRatio < 0.52) {ints[1536] = 1;}
					else {ints[1537] = 1;}
				} else {
					if (CTimRatioSP < 0.46) {ints[1538] = 1;}
					else {ints[1539] = 1;}
				}
			} else {
				if (CKWSRatio < 0.24) {
					if (CLocRatioSP < 0.36) {ints[1540] = 1;}
					else {ints[1541] = 1;}
				} else {
					if (EpochSpan < 154975.5) {ints[1542] = 1;}
					else {ints[1543] = 1;}
				}
			}
		} else {
			if (EpochSpan < 87988.5) {
				if (CPerRatioSP < 0.43) {
					if (HKWSRatio < 0.27) {ints[1544] = 1;}
					else {ints[1545] = 1;}
				} else {
					if (TitleDist < 47.5) {ints[1546] = 1;}
					else {ints[1547] = 1;}
				}
			} else {
				if (CatRatio < 0.2) {
					if (CPerLengthNE < 5.25) {ints[1548] = 1;}
					else {ints[1549] = 1;}
				} else {
					if (CPerRatioNE < 0.28) {ints[1550] = 1;}
					else {ints[1551] = 1;}
				}
			}
		}
	} else {
		if (TKWSRatio < 0.38) {
			if (SimhashDist < 68.5) {
				if (CKWSRatio < 0.22) {
					if (CTimLengthSP < 1.25) {ints[1552] = 1;}
					else {ints[1553] = 1;}
				} else {
					if (CNUMLengthSP < 9.25) {ints[1554] = 1;}
					else {ints[1555] = 1;}
				}
			} else {
				if (CKWSRatio < 0.25) {
					if (CPerRatioNE < 0.35) {ints[1556] = 1;}
					else {ints[1557] = 1;}
				} else {
					if (InsertSpan < 56725) {ints[1558] = 1;}
					else {ints[1559] = 1;}
				}
			}
		} else {
			if (InsertSpan < 143125.5) {
				if (TitleLength < 5.25) {
					if (CPerLengthNE < 26.5) {ints[1560] = 1;}
					else {ints[1561] = 1;}
				} else {
					if (TKWSRatio < 0.64) {ints[1562] = 1;}
					else {ints[1563] = 1;}
				}
			} else {
				if (CNUMLengthSP < 13.75) {
					if (CLocRatioNE < 0.6) {ints[1564] = 1;}
					else {ints[1565] = 1;}
				} else {
					if (CTimRatioSP < 0.64) {ints[1566] = 1;}
					else {ints[1567] = 1;}
				}
			}
		}
	}
} else {
	if (TitleDist < 0.5) {
		if (SimhashDist < 29.5) {
			if (TitleLength < 6.5) {
				if (COrgLengthSP < 4.25) {
					if (CNUMRatioSP < 0.59) {ints[1568] = 1;}
					else {ints[1569] = 1;}
				} else {
					if (COrgRatioSP < 0.83) {ints[1570] = 1;}
					else {ints[1571] = 1;}
				}
			} else {
				if (COrgLengthSP < 29.5) {
					if (EpochSpan < 19574) {ints[1572] = 1;}
					else {ints[1573] = 1;}
				} else {
					if (CPerRatioNE < 1) {ints[1574] = 1;}
					else {ints[1575] = 1;}
				}
			}
		} else {
			if (TitleLength < 6.5) {
				if (COrgLengthNE < 4.75) {
					if (EpochSpan < 48277) {ints[1576] = 1;}
					else {ints[1577] = 1;}
				} else {
					if (CKWSRatio < 0.43) {ints[1578] = 1;}
					else {ints[1579] = 1;}
				}
			} else {
				if (InsertSpan < 59109.5) {ints[1580] = 1;}
				if (InsertSpan >= 59109.5) {
					if (ChannelLength < 4.25) {ints[1581] = 1;}
					else {ints[1582] = 1;}
				}
			}
		}
	} else {
		if (CPerRatioSP < 0.52) {
			if (TitleRatio < 0.19) {
				if (CPerLengthSP < 5.75) {
					if (CTimRatioSP < 0.24) {ints[1583] = 1;}
					else {ints[1584] = 1;}
				} else {
					if (CLocLengthSP < 15.25) {ints[1585] = 1;}
					else {ints[1586] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.22) {
					if (COrgRatioSP < 0.42) {ints[1587] = 1;}
					else {ints[1588] = 1;}
				} else {
					if (InsertSpan < 139220) {ints[1589] = 1;}
					else {ints[1590] = 1;}
				}
			}
		} else {
			if (InsertSpan < 284335) {
				if (SameSRC < 0.5) {
					if (TPerRatioNE < 0.79) {ints[1591] = 1;}
					else {ints[1592] = 1;}
				} else {
					if (COrgRatioSP < 0.77) {ints[1593] = 1;}
					else {ints[1594] = 1;}
				}
			} else {
				if (TitleRatio < 0.87) {
					if (CLocLengthSP < 9.25) {ints[1595] = 1;}
					else {ints[1596] = 1;}
				} else {
					if (CLocLengthSP < 28.75) {ints[1597] = 1;}
					else {ints[1598] = 1;}
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
					if (CLocRatioNE < 0.65) {ints[1600] = 1;}
					else {ints[1601] = 1;}
				} else {
					if (CLocRatioNE < 0.71) {ints[1602] = 1;}
					else {ints[1603] = 1;}
				}
			} else {
				if (EpochSpan < 256014) {
					if (TitleRatio < 0.3) {ints[1604] = 1;}
					else {ints[1605] = 1;}
				} else {
					if (CLocLengthNE < 8.25) {ints[1606] = 1;}
					else {ints[1607] = 1;}
				}
			}
		} else {
			if (CNUMRatioSP < 0.53) {
				if (CPerRatioNE < 0.55) {
					if (TitleRatio < 0.24) {ints[1608] = 1;}
					else {ints[1609] = 1;}
				} else {
					if (TitleRatio < 0.31) {ints[1610] = 1;}
					else {ints[1611] = 1;}
				}
			} else {
				if (CLocRatioNE < 0.86) {
					if (InsertSpan < 436982.5) {ints[1612] = 1;}
					else {ints[1613] = 1;}
				} else {
					if (TitleRatio < 0.55) {ints[1614] = 1;}
					else {ints[1615] = 1;}
				}
			}
		}
	} else {
		if (CNUMRatioSP < 0.74) {
			if (CPerRatioNE < 0.24) {
				if (TOrgRatioSP < 0.55) {
					if (TitleRatio < 0.17) {ints[1616] = 1;}
					else {ints[1617] = 1;}
				} else {
					if (EpochSpan < 86393) {ints[1618] = 1;}
					else {ints[1619] = 1;}
				}
			} else {
				if (InsertSpan < 256392.5) {
					if (TitleRatio < 0.34) {ints[1620] = 1;}
					else {ints[1621] = 1;}
				} else {
					if (CNUMLengthSP < 15.75) {ints[1622] = 1;}
					else {ints[1623] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.96) {
				if (SameSRC < 0.5) {
					if (EpochSpan < 256035) {ints[1624] = 1;}
					else {ints[1625] = 1;}
				} else {
					if (GeoLength < 3.75) {ints[1626] = 1;}
					else {ints[1627] = 1;}
				}
			} else {
				if (TitleRatio < 0.89) {
					if (COrgRatioSP < 1) {ints[1628] = 1;}
					else {ints[1629] = 1;}
				} else {
					if (TitleLength < 3.5) {ints[1630] = 1;}
					else {ints[1631] = 1;}
				}
			}
		}
	}
} else {
	if (TKWSRatio < 0.34) {
		if (TitleRatio < 0.11) {
			if (COrgRatioNE < 0.09) {
				if (CatRatio < 0.75) {
					if (CLocRatioNE < 0.75) {ints[1632] = 1;}
					else {ints[1633] = 1;}
				} else {
					if (CKWSRatio < 0.2) {ints[1634] = 1;}
					else {ints[1635] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.34) {
					if (CPerRatioNE < 0.55) {ints[1636] = 1;}
					else {ints[1637] = 1;}
				} else {
					if (CLocLengthSP < 9.75) {ints[1638] = 1;}
					else {ints[1639] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.42) {
				if (COrgRatioSP < 0.41) {
					if (InsertSpan < 82012.5) {ints[1640] = 1;}
					else {ints[1641] = 1;}
				} else {
					if (CatLength < 1.25) {ints[1642] = 1;}
					else {ints[1643] = 1;}
				}
			} else {
				if (CKWSRatio < 0.52) {
					if (CPerLengthSP < 11.25) {ints[1644] = 1;}
					else {ints[1645] = 1;}
				} else {
					if (CWordSpan < 16.5) {ints[1646] = 1;}
					else {ints[1647] = 1;}
				}
			}
		}
	} else {
		if (COrgRatioSP < 0.45) {
			if (TKWSRatio < 0.57) {
				if (CPerRatioNE < 0.39) {
					if (CatRatio < 0.47) {ints[1648] = 1;}
					else {ints[1649] = 1;}
				} else {
					if (CKWSRatio < 0.24) {ints[1650] = 1;}
					else {ints[1651] = 1;}
				}
			} else {
				if (InsertSpan < 81983) {
					if (CKWSRatio < 0.29) {ints[1652] = 1;}
					else {ints[1653] = 1;}
				} else {
					if (EpochSpan < 49087) {ints[1654] = 1;}
					else {ints[1655] = 1;}
				}
			}
		} else {
			if (EpochSpan < 114206) {
				if (TitleRatio < 0.31) {
					if (ChannelRatio < 0.53) {ints[1656] = 1;}
					else {ints[1657] = 1;}
				} else {
					if (CWordSpan < 3) {ints[1658] = 1;}
					else {ints[1659] = 1;}
				}
			} else {
				if (CTimLengthSP < 5.75) {
					if (ChannelLength < 2.25) {ints[1660] = 1;}
					else {ints[1661] = 1;}
				} else {
					if (HKWSRatio < 0.93) {ints[1662] = 1;}
					else {ints[1663] = 1;}
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
					if (CPerRatioNE < 0.39) {ints[1664] = 1;}
					else {ints[1665] = 1;}
				} else {
					if (CPerRatioNE < 0.2) {ints[1666] = 1;}
					else {ints[1667] = 1;}
				}
			} else {
				if (CKWSRatio < 0.09) {
					if (CatRatio < 0.81) {ints[1668] = 1;}
					else {ints[1669] = 1;}
				} else {
					if (CPerRatioSP < 0.33) {ints[1670] = 1;}
					else {ints[1671] = 1;}
				}
			}
		} else {
			if (CTimRatioSP < 0.18) {
				if (CPerRatioNE < 0.22) {
					if (CNUMLengthSP < 10.25) {ints[1672] = 1;}
					else {ints[1673] = 1;}
				} else {
					if (TitleDist < 85.5) {ints[1674] = 1;}
					else {ints[1675] = 1;}
				}
			} else {
				if (CKWSRatio < 0.38) {
					if (EpochSpan < 76579.5) {ints[1676] = 1;}
					else {ints[1677] = 1;}
				} else {
					if (ParagraphSpan < 71.5) {ints[1678] = 1;}
					else {ints[1679] = 1;}
				}
			}
		}
	} else {
		if (ChannelRatio < 0.27) {
			if (InsertSpan < 78375) {
				if (COrgLengthSP < 20.25) {
					if (CKWSRatio < 0.16) {ints[1680] = 1;}
					else {ints[1681] = 1;}
				} else {
					if (TKWSRatio < 0.57) {ints[1682] = 1;}
					else {ints[1683] = 1;}
				}
			} else {
				if (SimhashDist < 71.5) {
					if (EpochSpan < 255762.5) {ints[1684] = 1;}
					else {ints[1685] = 1;}
				} else {
					if (CKWSRatio < 0.28) {ints[1686] = 1;}
					else {ints[1687] = 1;}
				}
			}
		} else {
			if (InsertSpan < 251136) {
				if (EpochSpan < 83315.5) {
					if (SimhashDist < 68.5) {ints[1688] = 1;}
					else {ints[1689] = 1;}
				} else {
					if (CPerRatioSP < 0.56) {ints[1690] = 1;}
					else {ints[1691] = 1;}
				}
			} else {
				if (HKWSRatio < 0.39) {
					if (CPerRatioSP < 0.61) {ints[1692] = 1;}
					else {ints[1693] = 1;}
				} else {
					if (CPerRatioSP < 0.68) {ints[1694] = 1;}
					else {ints[1695] = 1;}
				}
			}
		}
	}
} else {
	if (TitleRatio < 0.93) {
		if (TitleRatio < 0.23) {
			if (CPerRatioNE < 0.28) {
				if (COrgRatioSP < 0.48) {
					if (COrgRatioSP < 0.23) {ints[1696] = 1;}
					else {ints[1697] = 1;}
				} else {
					if (ParagraphSpan < 2.5) {ints[1698] = 1;}
					else {ints[1699] = 1;}
				}
			} else {
				if (SimhashDist < 80.5) {
					if (COrgLengthSP < 2.75) {ints[1700] = 1;}
					else {ints[1701] = 1;}
				} else {
					if (CLocRatioSP < 0.53) {ints[1702] = 1;}
					else {ints[1703] = 1;}
				}
			}
		} else {
			if (CPerRatioNE < 0.52) {
				if (CLocRatioSP < 0.69) {
					if (HKWSRatio < 0.84) {ints[1704] = 1;}
					else {ints[1705] = 1;}
				} else {
					if (CKWSLength < 19.75) {ints[1706] = 1;}
					else {ints[1707] = 1;}
				}
			} else {
				if (CPerRatioNE < 1) {
					if (TKWSLength < 10.25) {ints[1708] = 1;}
					else {ints[1709] = 1;}
				} else {
					if (CLocRatioNE < 0.72) {ints[1710] = 1;}
					else {ints[1711] = 1;}
				}
			}
		}
	} else {
		if (InsertSpan < 78418.5) {
			if (EpochSpan < 27619) {
				if (CKWSLength < 5.75) {
					if (TitleLength < 10.5) {ints[1712] = 1;}
					else {ints[1713] = 1;}
				} else {
					if (TitleRatio < 0.94) {ints[1714] = 1;}
					else {ints[1715] = 1;}
				}
			} else {
				if (CLocLengthNE < 9.25) {ints[1716] = 1;}
				if (CLocLengthNE >= 9.25) {
					if (GeoLength < 2.5) {ints[1717] = 1;}
					else {ints[1718] = 1;}
				}
			}
		} else {
			if (CLocRatioSP < 0.72) {
				if (CWordSpan < 51) {
					if (ParagraphSpan < 0.5) {ints[1719] = 1;}
					else {ints[1720] = 1;}
				} else {
					if (CLocLengthNE < 1.75) {ints[1721] = 1;}
					else {ints[1722] = 1;}
				}
			} else {
				if (TitleLength < 5.5) {
					if (COrgRatioSP < 0.75) {ints[1723] = 1;}
					else {ints[1724] = 1;}
				} else {
					if (InsertSpan < 103324) {ints[1725] = 1;}
					else {ints[1726] = 1;}
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
					if (CLocLengthNE < 18.25) {ints[1728] = 1;}
					else {ints[1729] = 1;}
				} else {
					if (CKWSRatio < 0.25) {ints[1730] = 1;}
					else {ints[1731] = 1;}
				}
			} else {
				if (CTimLengthSP < 19.75) {
					if (HKWSRatio < 0.78) {ints[1732] = 1;}
					else {ints[1733] = 1;}
				} else {
					if (CLocLengthNE < 10.5) {ints[1734] = 1;}
					else {ints[1735] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.24) {
				if (EpochSpan < 154065) {
					if (TKWSRatio < 0.13) {ints[1736] = 1;}
					else {ints[1737] = 1;}
				} else {ints[1738] = 1;}
			} else {
				if (CatLength < 1.61) {
					if (EpochSpan < 95350.5) {ints[1739] = 1;}
					else {ints[1740] = 1;}
				} else {
					if (CPerRatioSP < 0.31) {ints[1741] = 1;}
					else {ints[1742] = 1;}
				}
			}
		}
	} else {
		if (COrgRatioNE < 0.07) {
			if (CPerRatioSP < 0.29) {
				if (CatLength < 1.85) {
					if (CKWSRatio < 0.22) {ints[1743] = 1;}
					else {ints[1744] = 1;}
				} else {
					if (EpochSpan < 327978) {ints[1745] = 1;}
					else {ints[1746] = 1;}
				}
			} else {
				if (TKWSRatio < 0.42) {
					if (CWordSpan < 333.5) {ints[1747] = 1;}
					else {ints[1748] = 1;}
				} else {
					if (EpochSpan < 255480) {ints[1749] = 1;}
					else {ints[1750] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.37) {
				if (CPerRatioNE < 0.36) {
					if (COrgRatioSP < 0.18) {ints[1751] = 1;}
					else {ints[1752] = 1;}
				} else {
					if (ChannelRatio < 0.69) {ints[1753] = 1;}
					else {ints[1754] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.48) {
					if (CatLength < 1.11) {ints[1755] = 1;}
					else {ints[1756] = 1;}
				} else {
					if (SameSRC < 0.5) {ints[1757] = 1;}
					else {ints[1758] = 1;}
				}
			}
		}
	}
} else {
	if (SimhashDist < 22.5) {
		if (TitleRatio < 0.88) {
			if (TitleDist < 10.5) {
				if (EpochSpan < 321) {ints[1759] = 1;}
				if (EpochSpan >= 321) {
					if (TitleLength < 6.25) {ints[1760] = 1;}
					else {ints[1761] = 1;}
				}
			} else {
				if (TitleDist < 20.5) {
					if (CLocRatioNE < 0.36) {ints[1762] = 1;}
					else {ints[1763] = 1;}
				} else {
					if (COrgLengthSP < 7.75) {ints[1764] = 1;}
					else {ints[1765] = 1;}
				}
			}
		} else {
			if (CNUMRatioSP < 0.58) {
				if (CKWSRatio < 1) {
					if (TitleLength < 5.5) {ints[1766] = 1;}
					else {ints[1767] = 1;}
				} else {
					if (CNUMRatioSP < 0.47) {ints[1768] = 1;}
					else {ints[1769] = 1;}
				}
			} else {
				if (TOrgLengthSP < 2.75) {
					if (CKWSLength < 6.25) {ints[1770] = 1;}
					else {ints[1771] = 1;}
				} else {
					if (CPerLengthSP < 35.75) {ints[1772] = 1;}
					else {ints[1773] = 1;}
				}
			}
		}
	} else {
		if (CPerRatioNE < 0.31) {
			if (TitleRatio < 0.42) {
				if (CLocLengthSP < 38) {
					if (TitleRatio < 0.31) {ints[1774] = 1;}
					else {ints[1775] = 1;}
				} else {
					if (CPerLengthNE < 6.75) {ints[1776] = 1;}
					else {ints[1777] = 1;}
				}
			} else {
				if (CLocRatioSP < 0.54) {
					if (COrgRatioSP < 0.5) {ints[1778] = 1;}
					else {ints[1779] = 1;}
				} else {
					if (InsertSpan < 85666.5) {ints[1780] = 1;}
					else {ints[1781] = 1;}
				}
			}
		} else {
			if (CLocRatioSP < 0.73) {
				if (SameSRC < 0.5) {
					if (CTimRatioSP < 0.24) {ints[1782] = 1;}
					else {ints[1783] = 1;}
				} else {
					if (CKWSRatio < 0.34) {ints[1784] = 1;}
					else {ints[1785] = 1;}
				}
			} else {
				if (TitleDist < 0.5) {
					if (TitleLength < 7.5) {ints[1786] = 1;}
					else {ints[1787] = 1;}
				} else {
					if (InsertSpan < 174722) {ints[1788] = 1;}
					else {ints[1789] = 1;}
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
					if (CatRatio < 0.76) {ints[1792] = 1;}
					else {ints[1793] = 1;}
				} else {
					if (CatLength < 1.8) {ints[1794] = 1;}
					else {ints[1795] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.54) {
					if (CLocLengthSP < 9.25) {ints[1796] = 1;}
					else {ints[1797] = 1;}
				} else {
					if (InsertSpan < 112097.5) {ints[1798] = 1;}
					else {ints[1799] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.23) {
				if (SimhashDist < 83.5) {
					if (COrgRatioNE < 0.79) {ints[1800] = 1;}
					else {ints[1801] = 1;}
				} else {
					if (CNUMRatioSP < 0.52) {ints[1802] = 1;}
					else {ints[1803] = 1;}
				}
			} else {
				if (EpochSpan < 54882) {
					if (CNUMLengthSP < 27.5) {ints[1804] = 1;}
					else {ints[1805] = 1;}
				} else {
					if (CPerRatioNE < 0.35) {ints[1806] = 1;}
					else {ints[1807] = 1;}
				}
			}
		}
	} else {
		if (CPerRatioSP < 0.61) {
			if (EpochSpan < 83107.5) {
				if (SimhashDist < 64.5) {
					if (CPerLengthNE < 1.25) {ints[1808] = 1;}
					else {ints[1809] = 1;}
				} else {
					if (COrgRatioSP < 0.13) {ints[1810] = 1;}
					else {ints[1811] = 1;}
				}
			} else {
				if (HKWSRatio < 0.47) {
					if (CLocRatioNE < 0.53) {ints[1812] = 1;}
					else {ints[1813] = 1;}
				} else {
					if (COrgRatioSP < 0.42) {ints[1814] = 1;}
					else {ints[1815] = 1;}
				}
			}
		} else {
			if (CPerLengthNE < 1.25) {
				if (SimhashDist < 13) {
					if (CNUMRatioSP < 0.13) {ints[1816] = 1;}
					else {ints[1817] = 1;}
				} else {
					if (SimhashDist < 82.5) {ints[1818] = 1;}
					else {ints[1819] = 1;}
				}
			} else {
				if (TKWSRatio < 0.65) {
					if (CKWSRatio < 0.3) {ints[1820] = 1;}
					else {ints[1821] = 1;}
				} else {
					if (CNUMRatioSP < 0.49) {ints[1822] = 1;}
					else {ints[1823] = 1;}
				}
			}
		}
	}
} else {
	if (TitleDist < 0.5) {
		if (SimhashDist < 36.5) {
			if (CTimLengthSP < 2.25) {
				if (EpochSpan < 713459) {
					if (CNUMRatioSP < 0.77) {ints[1824] = 1;}
					else {ints[1825] = 1;}
				} else {ints[1826] = 1;}
			} else {
				if (CNUMLengthSP < 35.25) {
					if (ChannelRatio < 0.41) {ints[1827] = 1;}
					else {ints[1828] = 1;}
				} else {
					if (InsertSpan < 204819.5) {ints[1829] = 1;}
					else {ints[1830] = 1;}
				}
			}
		} else {
			if (EpochSpan < 83538.5) {
				if (HKWSLength < 1.25) {ints[1831] = 1;}
				if (HKWSLength >= 1.25) {
					if (TitleLength < 7.5) {ints[1832] = 1;}
					else {ints[1833] = 1;}
				}
			} else {
				if (TitleLength < 5.5) {
					if (COrgLengthSP < 6) {ints[1834] = 1;}
					else {ints[1835] = 1;}
				} else {
					if (SimhashDist < 52.5) {ints[1836] = 1;}
					else {ints[1837] = 1;}
				}
			}
		}
	} else {
		if (EpochSpan < 255578) {
			if (EpochSpan < 74161) {
				if (SimhashDist < 81.5) {
					if (CKWSRatio < 0.21) {ints[1838] = 1;}
					else {ints[1839] = 1;}
				} else {
					if (TKWSRatio < 0.49) {ints[1840] = 1;}
					else {ints[1841] = 1;}
				}
			} else {
				if (SimhashDist < 73.5) {
					if (TitleDist < 24.5) {ints[1842] = 1;}
					else {ints[1843] = 1;}
				} else {
					if (CatRatio < 0.5) {ints[1844] = 1;}
					else {ints[1845] = 1;}
				}
			}
		} else {
			if (CPerRatioSP < 0.34) {
				if (CKWSRatio < 0.34) {
					if (TKWSLength < 1.25) {ints[1846] = 1;}
					else {ints[1847] = 1;}
				} else {
					if (CWordSpan < 68.5) {ints[1848] = 1;}
					else {ints[1849] = 1;}
				}
			} else {
				if (CatLength < 1.34) {
					if (TKWSRatio < 0.73) {ints[1850] = 1;}
					else {ints[1851] = 1;}
				} else {
					if (TitleLength < 7.75) {ints[1852] = 1;}
					else {ints[1853] = 1;}
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
					if (CatRatio < 0.39) {ints[1856] = 1;}
					else {ints[1857] = 1;}
				} else {
					if (CLocLengthNE < 14.75) {ints[1858] = 1;}
					else {ints[1859] = 1;}
				}
			} else {
				if (EpochSpan < 339693.5) {
					if (TitleRatio < 0.24) {ints[1860] = 1;}
					else {ints[1861] = 1;}
				} else {
					if (TitleLength < 8.25) {ints[1862] = 1;}
					else {ints[1863] = 1;}
				}
			}
		} else {
			if (SimhashDist < 68.5) {
				if (CWordSpan < 58) {
					if (TKWSRatio < 0.34) {ints[1864] = 1;}
					else {ints[1865] = 1;}
				} else {
					if (TitleRatio < 0.21) {ints[1866] = 1;}
					else {ints[1867] = 1;}
				}
			} else {
				if (CLocRatioSP < 0.53) {
					if (TitleRatio < 0.2) {ints[1868] = 1;}
					else {ints[1869] = 1;}
				} else {
					if (EpochSpan < 78603) {ints[1870] = 1;}
					else {ints[1871] = 1;}
				}
			}
		}
	} else {
		if (InsertSpan < 83806.5) {
			if (CTimRatioSP < 0.4) {
				if (TitleRatio < 0.23) {
					if (COrgRatioNE < 0.12) {ints[1872] = 1;}
					else {ints[1873] = 1;}
				} else {
					if (TKWSRatio < 0.68) {ints[1874] = 1;}
					else {ints[1875] = 1;}
				}
			} else {
				if (CKWSRatio < 0.26) {
					if (CLocRatioNE < 0.24) {ints[1876] = 1;}
					else {ints[1877] = 1;}
				} else {
					if (CLocRatioNE < 0.2) {ints[1878] = 1;}
					else {ints[1879] = 1;}
				}
			}
		} else {
			if (EpochSpan < 163149) {
				if (CKWSRatio < 0.26) {
					if (SimhashDist < 64.5) {ints[1880] = 1;}
					else {ints[1881] = 1;}
				} else {
					if (SimhashDist < 75.5) {ints[1882] = 1;}
					else {ints[1883] = 1;}
				}
			} else {
				if (CKWSRatio < 0.28) {
					if (TKWSRatio < 0.36) {ints[1884] = 1;}
					else {ints[1885] = 1;}
				} else {
					if (CPerLengthSP < 0.75) {ints[1886] = 1;}
					else {ints[1887] = 1;}
				}
			}
		}
	}
} else {
	if (CNUMRatioSP < 0.83) {
		if (SimhashDist < 65.5) {
			if (TitleRatio < 0.37) {
				if (TitleRatio < 0.21) {
					if (CKWSRatio < 0.38) {ints[1888] = 1;}
					else {ints[1889] = 1;}
				} else {
					if (CTimRatioSP < 0.29) {ints[1890] = 1;}
					else {ints[1891] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.56) {
					if (CLocLengthNE < 18.25) {ints[1892] = 1;}
					else {ints[1893] = 1;}
				} else {
					if (TKWSRatio < 0.6) {ints[1894] = 1;}
					else {ints[1895] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.28) {
				if (InsertSpan < 113838.5) {
					if (SimhashDist < 81.5) {ints[1896] = 1;}
					else {ints[1897] = 1;}
				} else {
					if (TPerRatioSP < 0.85) {ints[1898] = 1;}
					else {ints[1899] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.65) {
					if (SameSRC < 0.5) {ints[1900] = 1;}
					else {ints[1901] = 1;}
				} else {
					if (InsertSpan < 155702.5) {ints[1902] = 1;}
					else {ints[1903] = 1;}
				}
			}
		}
	} else {
		if (CKWSRatio < 0.99) {
			if (EpochSpan < 75810.5) {
				if (CTimRatioSP < 0.95) {
					if (CatLength < 1.52) {ints[1904] = 1;}
					else {ints[1905] = 1;}
				} else {
					if (CLocRatioNE < 0.83) {ints[1906] = 1;}
					else {ints[1907] = 1;}
				}
			} else {
				if (CKWSRatio < 0.6) {
					if (SimhashDist < 77.5) {ints[1908] = 1;}
					else {ints[1909] = 1;}
				} else {
					if (CKWSLength < 13.25) {ints[1910] = 1;}
					else {ints[1911] = 1;}
				}
			}
		} else {
			if (TKWSRatio < 1) {
				if (CTimLengthSP < 9.5) {
					if (COrgLengthSP < 1.25) {ints[1912] = 1;}
					else {ints[1913] = 1;}
				} else {
					if (COrgLengthSP < 29.5) {ints[1914] = 1;}
					else {ints[1915] = 1;}
				}
			} else {
				if (CNUMRatioSP < 1) {
					if (GeoLength < 2.75) {ints[1916] = 1;}
					else {ints[1917] = 1;}
				} else {
					if (COrgLengthNE < 29.5) {ints[1918] = 1;}
					else {ints[1919] = 1;}
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
					if (COrgRatioSP < 0.15) {ints[1920] = 1;}
					else {ints[1921] = 1;}
				} else {
					if (CLocRatioSP < 0.49) {ints[1922] = 1;}
					else {ints[1923] = 1;}
				}
			} else {
				if (EpochSpan < 74822.5) {
					if (CLocRatioSP < 0.63) {ints[1924] = 1;}
					else {ints[1925] = 1;}
				} else {
					if (CLocRatioSP < 0.42) {ints[1926] = 1;}
					else {ints[1927] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.18) {
				if (CLocLengthNE < 18.25) {
					if (COrgRatioSP < 0.21) {ints[1928] = 1;}
					else {ints[1929] = 1;}
				} else {
					if (TitleDist < 42.5) {ints[1930] = 1;}
					else {ints[1931] = 1;}
				}
			} else {
				if (COrgRatioSP < 0.68) {
					if (CKWSRatio < 0.17) {ints[1932] = 1;}
					else {ints[1933] = 1;}
				} else {
					if (ChannelRatio < 0.17) {ints[1934] = 1;}
					else {ints[1935] = 1;}
				}
			}
		}
	} else {
		if (InsertSpan < 140926) {
			if (SimhashDist < 71.5) {
				if (CNUMRatioSP < 0.36) {
					if (COrgRatioSP < 0.45) {ints[1936] = 1;}
					else {ints[1937] = 1;}
				} else {
					if (CKWSLength < 8.25) {ints[1938] = 1;}
					else {ints[1939] = 1;}
				}
			} else {
				if (EpochSpan < 42075.5) {
					if (COrgRatioNE < 0.11) {ints[1940] = 1;}
					else {ints[1941] = 1;}
				} else {
					if (CKWSRatio < 0.26) {ints[1942] = 1;}
					else {ints[1943] = 1;}
				}
			}
		} else {
			if (CKWSRatio < 0.31) {
				if (SimhashDist < 67.5) {
					if (InsertSpan < 884138.5) {ints[1944] = 1;}
					else {ints[1945] = 1;}
				} else {
					if (InsertSpan < 396635.5) {ints[1946] = 1;}
					else {ints[1947] = 1;}
				}
			} else {
				if (SimhashDist < 37.5) {
					if (CWordSpan < 224) {ints[1948] = 1;}
					else {ints[1949] = 1;}
				} else {
					if (COrgLengthNE < 27.25) {ints[1950] = 1;}
					else {ints[1951] = 1;}
				}
			}
		}
	}
} else {
	if (TitleDist < 0.5) {
		if (CLocRatioSP < 0.87) {
			if (CKWSRatio < 0.21) {ints[1952] = 1;}
			if (CKWSRatio >= 0.21) {
				if (EpochSpan < 70173.5) {
					if (ParagraphSpan < 27.5) {ints[1953] = 1;}
					else {ints[1954] = 1;}
				} else {
					if (TKWSLength < 1.5) {ints[1955] = 1;}
					else {ints[1956] = 1;}
				}
			}
		} else {
			if (TitleLength < 6.5) {
				if (COrgLengthSP < 4.75) {
					if (CWordSpan < 0.5) {ints[1957] = 1;}
					else {ints[1958] = 1;}
				} else {
					if (InsertSpan < 133857) {ints[1959] = 1;}
					else {ints[1960] = 1;}
				}
			} else {
				if (CLocRatioNE < 1) {
					if (TKWSLength < 6.75) {ints[1961] = 1;}
					else {ints[1962] = 1;}
				} else {
					if (COrgRatioSP < 1) {ints[1963] = 1;}
					else {ints[1964] = 1;}
				}
			}
		}
	} else {
		if (EpochSpan < 255750) {
			if (SimhashDist < 68.5) {
				if (SameSRC < 0.5) {
					if (HKWSRatio < 0.68) {ints[1965] = 1;}
					else {ints[1966] = 1;}
				} else {
					if (COrgLengthSP < 3.25) {ints[1967] = 1;}
					else {ints[1968] = 1;}
				}
			} else {
				if (TitleRatio < 0.31) {
					if (CatRatio < 0.2) {ints[1969] = 1;}
					else {ints[1970] = 1;}
				} else {
					if (InsertSpan < 87452) {ints[1971] = 1;}
					else {ints[1972] = 1;}
				}
			}
		} else {
			if (SimhashDist < 63.5) {
				if (ChannelRatio < 0.44) {
					if (CPerRatioNE < 0.62) {ints[1973] = 1;}
					else {ints[1974] = 1;}
				} else {
					if (CNUMRatioSP < 0.66) {ints[1975] = 1;}
					else {ints[1976] = 1;}
				}
			} else {
				if (CLocRatioSP < 0.58) {
					if (TKWSRatio < 0.84) {ints[1977] = 1;}
					else {ints[1978] = 1;}
				} else {
					if (CLocRatioSP < 0.59) {ints[1979] = 1;}
					else {ints[1980] = 1;}
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
					if (TKWSRatio < 0.27) {ints[1984] = 1;}
					else {ints[1985] = 1;}
				} else {
					if (CPerRatioNE < 0.13) {ints[1986] = 1;}
					else {ints[1987] = 1;}
				}
			} else {
				if (CLocRatioNE < 0.08) {
					if (TitleRatio < 0.2) {ints[1988] = 1;}
					else {ints[1989] = 1;}
				} else {
					if (SimhashDist < 69.5) {ints[1990] = 1;}
					else {ints[1991] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.2) {
				if (ChannelRatio < 0.12) {
					if (CatRatio < 0.5) {ints[1992] = 1;}
					else {ints[1993] = 1;}
				} else {
					if (SimhashDist < 73.5) {ints[1994] = 1;}
					else {ints[1995] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.22) {
					if (CLocLengthSP < 2.75) {ints[1996] = 1;}
					else {ints[1997] = 1;}
				} else {
					if (TitleRatio < 0.33) {ints[1998] = 1;}
					else {ints[1999] = 1;}
				}
			}
		}
	} else {
		if (ChannelRatio < 0.23) {
			if (CKWSRatio < 0.28) {
				if (TitleRatio < 0.12) {
					if (COrgRatioNE < 0.21) {ints[2000] = 1;}
					else {ints[2001] = 1;}
				} else {
					if (CNUMLengthSP < 10.25) {ints[2002] = 1;}
					else {ints[2003] = 1;}
				}
			} else {
				if (CNUMLengthSP < 19.25) {
					if (EpochSpan < 180999.5) {ints[2004] = 1;}
					else {ints[2005] = 1;}
				} else {
					if (TitleDist < 34) {ints[2006] = 1;}
					else {ints[2007] = 1;}
				}
			}
		} else {
			if (TKWSRatio < 0.54) {
				if (SimhashDist < 71.5) {
					if (CLocRatioNE < 0.52) {ints[2008] = 1;}
					else {ints[2009] = 1;}
				} else {
					if (CKWSRatio < 0.29) {ints[2010] = 1;}
					else {ints[2011] = 1;}
				}
			} else {
				if (CNUMRatioSP < 0.42) {
					if (InsertSpan < 253757) {ints[2012] = 1;}
					else {ints[2013] = 1;}
				} else {
					if (CNUMLengthSP < 12.75) {ints[2014] = 1;}
					else {ints[2015] = 1;}
				}
			}
		}
	}
} else {
	if (ChannelRatio < 0.94) {
		if (CKWSRatio < 0.27) {
			if (TKWSRatio < 0.38) {
				if (CatRatio < 0.52) {ints[2016] = 1;}
				if (CatRatio >= 0.52) {
					if (CWordSpan < 519) {ints[2017] = 1;}
					else {ints[2018] = 1;}
				}
			} else {
				if (CTimRatioSP < 0.26) {
					if (TOrgLengthSP < 1.25) {ints[2019] = 1;}
					else {ints[2020] = 1;}
				} else {
					if (EpochSpan < 2646) {ints[2021] = 1;}
					else {ints[2022] = 1;}
				}
			}
		} else {
			if (InsertSpan < 266215.5) {
				if (ChannelRatio < 0.32) {
					if (CKWSRatio < 0.36) {ints[2023] = 1;}
					else {ints[2024] = 1;}
				} else {
					if (EpochSpan < 74108.5) {ints[2025] = 1;}
					else {ints[2026] = 1;}
				}
			} else {
				if (CPerRatioSP < 0.78) {
					if (TitleLength < 5.25) {ints[2027] = 1;}
					else {ints[2028] = 1;}
				} else {
					if (COrgLengthNE < 1.25) {ints[2029] = 1;}
					else {ints[2030] = 1;}
				}
			}
		}
	} else {
		if (CKWSRatio < 0.97) {
			if (TKWSRatio < 0.9) {
				if (TitleRatio < 0.85) {
					if (CKWSLength < 12.25) {ints[2031] = 1;}
					else {ints[2032] = 1;}
				} else {
					if (CKWSLength < 6.25) {ints[2033] = 1;}
					else {ints[2034] = 1;}
				}
			} else {
				if (CTimRatioSP < 0.88) {
					if (EpochSpan < 86363) {ints[2035] = 1;}
					else {ints[2036] = 1;}
				} else {
					if (CatRatio < 0.77) {ints[2037] = 1;}
					else {ints[2038] = 1;}
				}
			}
		} else {
			if (TitleRatio < 0.93) {
				if (SimhashDist < 48.5) {
					if (CPerRatioSP < 1) {ints[2039] = 1;}
					else {ints[2040] = 1;}
				} else {ints[2041] = 1;}
			} else {
				if (COrgLengthSP < 3.25) {
					if (TitleLength < 2.5) {ints[2042] = 1;}
					else {ints[2043] = 1;}
				} else {
					if (CLocLengthNE < 47.5) {ints[2044] = 1;}
					else {ints[2045] = 1;}
				}
			}
		}
	}
}
		for (int i = 0; i < ints.length; i++) {
			sb.append(ints[i]);
			sb.append(",");
		}
		return sb.toString();
	}
}