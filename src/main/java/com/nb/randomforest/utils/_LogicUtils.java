package com.nb.randomforest.utils;

import com.nb.randomforest.entity.EventFeature;

/**
 * @author yuxi
 * @date Wed Dec 30 16:35:34 CST 2020
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
		int[] ints = new int[4096];
if (CPerRatioNE < 0.31) {
	if (CTimRatioSP < 0.43) {
		if (CatRatio < 0.5) {
			if (TitleRatio < 0.21) {
				if (TKWSRatio < 0.21) {
					if (CKWSRatio < 0.24) {
						if (CPerRatioSP < 0.34) {
							if (COrgRatioSP < 0.07) {
								if (TitleDist < 65.5) {ints[0] = 1;}
								if (TitleDist >= 65.5) {
									if (CPerLengthSP < 0.75) {ints[1] = 1;}
									else {ints[2] = 1;}
								}
							} else {
								if (HKWSLength < 0.75) {
									if (CPerLengthSP < 8.25) {ints[3] = 1;}
									else {ints[4] = 1;}
								} else {
									if (CatLength < 1.46) {ints[5] = 1;}
									else {ints[6] = 1;}
								}
							}
						} else {
							if (CTimRatioSP < 0.18) {ints[7] = 1;}
							if (CTimRatioSP >= 0.18) {
								if (CPerLengthSP < 13) {ints[8] = 1;}
								if (CPerLengthSP >= 13) {
									if (CLocRatioSP < 0.37) {ints[9] = 1;}
									else {ints[10] = 1;}
								}
							}
						}
					} else {
						if (CKWSRatio < 0.24) {ints[11] = 1;}
						if (CKWSRatio >= 0.24) {
							if (COrgRatioNE < 0.58) {
								if (CKWSRatio < 0.34) {ints[12] = 1;}
								if (CKWSRatio >= 0.34) {
									if (CWordSpan < 1588) {ints[13] = 1;}
									else {ints[14] = 1;}
								}
							} else {
								if (CNUMLengthSP < 15.75) {
									if (TKWSRatio < 0.16) {ints[15] = 1;}
									else {ints[16] = 1;}
								} else {ints[17] = 1;}
							}
						}
					}
				} else {
					if (CTimRatioSP < 0.1) {
						if (COrgRatioNE < 0.74) {ints[18] = 1;}
						if (COrgRatioNE >= 0.74) {
							if (CatLength < 1.12) {
								if (TitleLength < 11) {ints[19] = 1;}
								else {ints[20] = 1;}
							} else {
								if (EpochSpan < 304583) {ints[21] = 1;}
								else {ints[22] = 1;}
							}
						}
					} else {
						if (TKWSRatio < 0.63) {
							if (InsertSpan < 43391) {
								if (TKWSLength < 2.25) {ints[23] = 1;}
								if (TKWSLength >= 2.25) {
									if (CKWSRatio < 0.21) {ints[24] = 1;}
									else {ints[25] = 1;}
								}
							} else {
								if (CKWSRatio < 0.49) {
									if (CLocRatioSP < 0.85) {ints[26] = 1;}
									else {ints[27] = 1;}
								} else {
									if (ParagraphSpan < 2) {ints[28] = 1;}
									else {ints[29] = 1;}
								}
							}
						} else {
							if (CPerLengthNE < 13.5) {
								if (ChannelRatio < 0.13) {ints[30] = 1;}
								else {ints[31] = 1;}
							} else {
								if (CKWSLength < 15) {ints[32] = 1;}
								else {ints[33] = 1;}
							}
						}
					}
				}
			} else {
				if (EpochSpan < 31191.5) {
					if (CKWSRatio < 0.4) {
						if (EpochSpan < 906.5) {
							if (TitleDist < 7) {ints[34] = 1;}
							if (TitleDist >= 7) {
								if (TitleRatio < 0.32) {ints[35] = 1;}
								else {ints[36] = 1;}
							}
						} else {
							if (EpochSpan < 29115.5) {
								if (CKWSRatio < 0.11) {ints[37] = 1;}
								if (CKWSRatio >= 0.11) {
									if (TKWSRatio < 0.71) {ints[38] = 1;}
									else {ints[39] = 1;}
								}
							} else {ints[40] = 1;}
						}
					} else {
						if (COrgLengthNE < 1.5) {ints[41] = 1;}
						else {ints[42] = 1;}
					}
				} else {
					if (CKWSRatio < 0.19) {
						if (CatRatio < 0.39) {ints[43] = 1;}
						if (CatRatio >= 0.39) {
							if (COrgLengthNE < 0.75) {ints[44] = 1;}
							if (COrgLengthNE >= 0.75) {
								if (TitleRatio < 0.23) {ints[45] = 1;}
								if (TitleRatio >= 0.23) {
									if (TitleLength < 11.25) {ints[46] = 1;}
									else {ints[47] = 1;}
								}
							}
						}
					} else {
						if (EpochSpan < 459212) {
							if (InsertSpan < 1953) {ints[48] = 1;}
							if (InsertSpan >= 1953) {
								if (COrgRatioSP < 0.09) {
									if (CLocLengthNE < 22.5) {ints[49] = 1;}
									else {ints[50] = 1;}
								} else {
									if (CTimLengthSP < 18.75) {ints[51] = 1;}
									else {ints[52] = 1;}
								}
							}
						} else {
							if (CTimLengthSP < 8.75) {ints[53] = 1;}
							if (CTimLengthSP >= 8.75) {
								if (CTimLengthSP < 10.25) {
									if (CNUMRatioSP < 0.23) {ints[54] = 1;}
									else {ints[55] = 1;}
								} else {ints[56] = 1;}
							}
						}
					}
				}
			}
		} else {
			if (ChannelRatio < 0.31) {
				if (COrgRatioNE < 0.18) {
					if (CLocRatioNE < 0.48) {
						if (TKWSRatio < 0.45) {
							if (EpochSpan < 10076.5) {
								if (TitleDist < 55.5) {
									if (CKWSLength < 18.75) {ints[57] = 1;}
									else {ints[58] = 1;}
								} else {
									if (CPerLengthSP < 2) {ints[59] = 1;}
									else {ints[60] = 1;}
								}
							} else {
								if (TitleDist < 58.5) {
									if (CPerLengthNE < 4.25) {ints[61] = 1;}
									else {ints[62] = 1;}
								} else {ints[63] = 1;}
							}
						} else {
							if (CNUMRatioSP < 0.19) {
								if (COrgLengthNE < 0.75) {
									if (TitleLength < 8) {ints[64] = 1;}
									else {ints[65] = 1;}
								} else {
									if (CTimRatioSP < 0.18) {ints[66] = 1;}
									else {ints[67] = 1;}
								}
							} else {
								if (CPerRatioNE < 0.2) {
									if (TKWSRatio < 0.62) {ints[68] = 1;}
									else {ints[69] = 1;}
								} else {
									if (SimhashDist < 80.5) {ints[70] = 1;}
									else {ints[71] = 1;}
								}
							}
						}
					} else {
						if (ChannelLength < 2.75) {
							if (TitleRatio < 0.27) {
								if (CPerRatioNE < 0.25) {ints[72] = 1;}
								if (CPerRatioNE >= 0.25) {
									if (SimhashDist < 62) {ints[73] = 1;}
									else {ints[74] = 1;}
								}
							} else {
								if (EpochSpan < 270) {
									if (COrgRatioSP < 0.5) {ints[75] = 1;}
									else {ints[76] = 1;}
								} else {
									if (HKWSLength < 1.75) {ints[77] = 1;}
									else {ints[78] = 1;}
								}
							}
						} else {
							if (CKWSRatio < 0.3) {
								if (CTimLengthSP < 10.75) {
									if (COrgRatioSP < 0.53) {ints[79] = 1;}
									else {ints[80] = 1;}
								} else {
									if (CLocRatioNE < 0.56) {ints[81] = 1;}
									else {ints[82] = 1;}
								}
							} else {
								if (CKWSRatio < 0.3) {ints[83] = 1;}
								if (CKWSRatio >= 0.3) {
									if (TKWSLength < 6.25) {ints[84] = 1;}
									else {ints[85] = 1;}
								}
							}
						}
					}
				} else {
					if (CNUMRatioSP < 0.39) {
						if (TOrgRatioSP < 0.61) {
							if (CatLength < 0.9) {
								if (TitleDist < 50.5) {
									if (EpochSpan < 78289.5) {ints[86] = 1;}
									else {ints[87] = 1;}
								} else {
									if (CTimRatioSP < 0.17) {ints[88] = 1;}
									else {ints[89] = 1;}
								}
							} else {
								if (SimhashDist < 75.5) {
									if (SameSRC < 0.5) {ints[90] = 1;}
									else {ints[91] = 1;}
								} else {
									if (InsertSpan < 124279) {ints[92] = 1;}
									else {ints[93] = 1;}
								}
							}
						} else {
							if (COrgRatioSP < 0.43) {
								if (InsertSpan < 1211556.5) {
									if (COrgLengthSP < 11.25) {ints[94] = 1;}
									else {ints[95] = 1;}
								} else {
									if (COrgRatioSP < 0.21) {ints[96] = 1;}
									else {ints[97] = 1;}
								}
							} else {
								if (ParagraphSpan < 23) {
									if (CTimLengthSP < 3.25) {ints[98] = 1;}
									else {ints[99] = 1;}
								} else {
									if (CLocLengthNE < 9.75) {ints[100] = 1;}
									else {ints[101] = 1;}
								}
							}
						}
					} else {
						if (CKWSRatio < 0.12) {ints[102] = 1;}
						if (CKWSRatio >= 0.12) {
							if (EpochSpan < 106004.5) {
								if (COrgRatioSP < 0.33) {
									if (TitleLength < 9.25) {ints[103] = 1;}
									else {ints[104] = 1;}
								} else {
									if (CPerLengthSP < 6.25) {ints[105] = 1;}
									else {ints[106] = 1;}
								}
							} else {
								if (CTimRatioSP < 0.31) {
									if (CNUMRatioSP < 0.71) {ints[107] = 1;}
									else {ints[108] = 1;}
								} else {
									if (CWordSpan < 23.5) {ints[109] = 1;}
									else {ints[110] = 1;}
								}
							}
						}
					}
				}
			} else {
				if (EpochSpan < 71695) {
					if (CKWSRatio < 0.31) {
						if (TitleRatio < 0.31) {
							if (CWordSpan < 120) {
								if (TitleDist < 66.5) {
									if (InsertSpan < 7760.5) {ints[111] = 1;}
									else {ints[112] = 1;}
								} else {
									if (CWordSpan < 26) {ints[113] = 1;}
									else {ints[114] = 1;}
								}
							} else {
								if (CPerLengthSP < 6.75) {
									if (EpochSpan < 44869.5) {ints[115] = 1;}
									else {ints[116] = 1;}
								} else {
									if (COrgLengthSP < 2.75) {ints[117] = 1;}
									else {ints[118] = 1;}
								}
							}
						} else {
							if (CLocRatioNE < 0.28) {
								if (CLocRatioSP < 0.56) {
									if (CKWSRatio < 0.11) {ints[119] = 1;}
									else {ints[120] = 1;}
								} else {
									if (COrgLengthSP < 8.75) {ints[121] = 1;}
									else {ints[122] = 1;}
								}
							} else {
								if (CNUMRatioSP < 0.15) {
									if (CPerRatioSP < 0.27) {ints[123] = 1;}
									else {ints[124] = 1;}
								} else {
									if (CKWSRatio < 0.26) {ints[125] = 1;}
									else {ints[126] = 1;}
								}
							}
						}
					} else {
						if (SimhashDist < 62.5) {
							if (TitleRatio < 0.2) {
								if (TKWSRatio < 0.37) {ints[127] = 1;}
								if (TKWSRatio >= 0.37) {
									if (TitleDist < 64.5) {ints[128] = 1;}
									else {ints[129] = 1;}
								}
							} else {
								if (CatLength < 1.47) {
									if (COrgRatioNE < 0.09) {ints[130] = 1;}
									else {ints[131] = 1;}
								} else {
									if (CNUMRatioSP < 0.5) {ints[132] = 1;}
									else {ints[133] = 1;}
								}
							}
						} else {
							if (CLocRatioSP < 0.64) {
								if (HKWSRatio < 0.52) {
									if (TKWSRatio < 0.81) {ints[134] = 1;}
									else {ints[135] = 1;}
								} else {
									if (CTimRatioSP < 0.36) {ints[136] = 1;}
									else {ints[137] = 1;}
								}
							} else {
								if (TitleRatio < 0.19) {
									if (COrgLengthSP < 9) {ints[138] = 1;}
									else {ints[139] = 1;}
								} else {
									if (COrgLengthNE < 41.5) {ints[140] = 1;}
									else {ints[141] = 1;}
								}
							}
						}
					}
				} else {
					if (TitleRatio < 0.21) {
						if (CTimLengthSP < 31.25) {
							if (SimhashDist < 82.5) {
								if (COrgLengthSP < 23.25) {
									if (COrgRatioSP < 0.4) {ints[142] = 1;}
									else {ints[143] = 1;}
								} else {
									if (CatLength < 0.86) {ints[144] = 1;}
									else {ints[145] = 1;}
								}
							} else {
								if (HKWSRatio < 0.62) {
									if (CatLength < 1.12) {ints[146] = 1;}
									else {ints[147] = 1;}
								} else {
									if (CLocRatioSP < 0.82) {ints[148] = 1;}
									else {ints[149] = 1;}
								}
							}
						} else {
							if (EpochSpan < 296108.5) {ints[150] = 1;}
							else {ints[151] = 1;}
						}
					} else {
						if (COrgLengthSP < 3.25) {
							if (GeoRatio < 0.56) {
								if (CatRatio < 0.71) {ints[152] = 1;}
								else {ints[153] = 1;}
							} else {
								if (CWordSpan < 59.5) {
									if (CKWSRatio < 0.86) {ints[154] = 1;}
									else {ints[155] = 1;}
								} else {
									if (CatRatio < 0.89) {ints[156] = 1;}
									else {ints[157] = 1;}
								}
							}
						} else {
							if (COrgLengthSP < 25.75) {
								if (EpochSpan < 230833) {
									if (CPerRatioNE < 0.19) {ints[158] = 1;}
									else {ints[159] = 1;}
								} else {
									if (CNUMLengthSP < 20.25) {ints[160] = 1;}
									else {ints[161] = 1;}
								}
							} else {
								if (TitleLength < 20.25) {
									if (TOrgLengthNE < 1.25) {ints[162] = 1;}
									else {ints[163] = 1;}
								} else {ints[164] = 1;}
							}
						}
					}
				}
			}
		}
	} else {
		if (TKWSRatio < 0.37) {
			if (TitleRatio < 0.22) {
				if (CKWSRatio < 0.24) {
					if (EpochSpan < 18814) {
						if (CPerLengthNE < 32.5) {
							if (COrgLengthSP < 6.25) {
								if (COrgRatioSP < 0.44) {
									if (TTimLengthSP < 0.75) {ints[165] = 1;}
									else {ints[166] = 1;}
								} else {ints[167] = 1;}
							} else {ints[168] = 1;}
						} else {
							if (COrgRatioNE < 0.21) {ints[169] = 1;}
							else {ints[170] = 1;}
						}
					} else {
						if (CWordSpan < 903.5) {ints[171] = 1;}
						if (CWordSpan >= 903.5) {
							if (InsertSpan < 212525) {ints[172] = 1;}
							if (InsertSpan >= 212525) {
								if (CNUMLengthSP < 10.75) {ints[173] = 1;}
								else {ints[174] = 1;}
							}
						}
					}
				} else {
					if (COrgLengthSP < 21.75) {
						if (EpochSpan < 26668.5) {
							if (CNUMLengthSP < 9.75) {
								if (ChannelRatio < 0.32) {
									if (InsertSpan < 47118) {ints[175] = 1;}
									else {ints[176] = 1;}
								} else {
									if (ChannelRatio < 0.64) {ints[177] = 1;}
									else {ints[178] = 1;}
								}
							} else {
								if (CPerLengthSP < 24.25) {
									if (CLocLengthNE < 45.5) {ints[179] = 1;}
									else {ints[180] = 1;}
								} else {ints[181] = 1;}
							}
						} else {
							if (TitleRatio < 0.19) {
								if (CPerLengthSP < 6.75) {
									if (SameSRC < 0.5) {ints[182] = 1;}
									else {ints[183] = 1;}
								} else {
									if (CLocLengthSP < 21.75) {ints[184] = 1;}
									else {ints[185] = 1;}
								}
							} else {
								if (COrgRatioNE < 0.62) {ints[186] = 1;}
								else {ints[187] = 1;}
							}
						}
					} else {ints[188] = 1;}
				}
			} else {
				if (InsertSpan < 84033) {
					if (COrgRatioNE < 0.3) {
						if (CNUMRatioSP < 0.31) {
							if (CatLength < 1.64) {
								if (TitleRatio < 0.72) {
									if (COrgLengthSP < 7.75) {ints[189] = 1;}
									else {ints[190] = 1;}
								} else {
									if (ParagraphSpan < 2) {ints[191] = 1;}
									else {ints[192] = 1;}
								}
							} else {
								if (TLocLengthSP < 1.25) {
									if (CTimLengthSP < 17.75) {ints[193] = 1;}
									else {ints[194] = 1;}
								} else {
									if (SimhashDist < 55.5) {ints[195] = 1;}
									else {ints[196] = 1;}
								}
							}
						} else {
							if (GeoRatio < 0.34) {
								if (CNUMRatioSP < 0.43) {
									if (CLocLengthSP < 8) {ints[197] = 1;}
									else {ints[198] = 1;}
								} else {
									if (CTimLengthSP < 5.5) {ints[199] = 1;}
									else {ints[200] = 1;}
								}
							} else {
								if (CLocRatioNE < 0.44) {
									if (CNUMLengthSP < 16.25) {ints[201] = 1;}
									else {ints[202] = 1;}
								} else {
									if (CKWSLength < 19.75) {ints[203] = 1;}
									else {ints[204] = 1;}
								}
							}
						}
					} else {
						if (CatLength < 1.25) {
							if (TitleRatio < 0.49) {
								if (CatLength < 0.68) {
									if (ParagraphSpan < 6) {ints[205] = 1;}
									else {ints[206] = 1;}
								} else {
									if (SimhashDist < 68.5) {ints[207] = 1;}
									else {ints[208] = 1;}
								}
							} else {
								if (TitleRatio < 0.59) {
									if (EpochSpan < 60281.5) {ints[209] = 1;}
									else {ints[210] = 1;}
								} else {
									if (SimhashDist < 72.5) {ints[211] = 1;}
									else {ints[212] = 1;}
								}
							}
						} else {
							if (COrgRatioNE < 0.39) {
								if (InsertSpan < 331) {ints[213] = 1;}
								else {ints[214] = 1;}
							} else {
								if (CWordSpan < 3.5) {ints[215] = 1;}
								if (CWordSpan >= 3.5) {
									if (GeoLength < 1.75) {ints[216] = 1;}
									else {ints[217] = 1;}
								}
							}
						}
					}
				} else {
					if (COrgLengthSP < 11.25) {
						if (InsertSpan < 105112) {ints[218] = 1;}
						if (InsertSpan >= 105112) {
							if (CTimRatioSP < 0.57) {
								if (CatLength < 1.43) {
									if (SimhashDist < 27) {ints[219] = 1;}
									else {ints[220] = 1;}
								} else {
									if (CatRatio < 0.63) {ints[221] = 1;}
									else {ints[222] = 1;}
								}
							} else {
								if (CLocLengthSP < 7.5) {
									if (CatLength < 0.97) {ints[223] = 1;}
									else {ints[224] = 1;}
								} else {
									if (CWordSpan < 104.5) {ints[225] = 1;}
									else {ints[226] = 1;}
								}
							}
						}
					} else {
						if (CNUMLengthSP < 1.5) {ints[227] = 1;}
						if (CNUMLengthSP >= 1.5) {
							if (CPerLengthSP < 17.25) {ints[228] = 1;}
							if (CPerLengthSP >= 17.25) {
								if (EpochSpan < 201565) {
									if (COrgRatioNE < 0.37) {ints[229] = 1;}
									else {ints[230] = 1;}
								} else {ints[231] = 1;}
							}
						}
					}
				}
			}
		} else {
			if (SimhashDist < 22.5) {
				if (SimhashDist < 4.5) {
					if (CatLength < 0.68) {
						if (TitleLength < 4) {
							if (InsertSpan < 1013855.5) {
								if (TitleLength < 2.5) {ints[232] = 1;}
								else {ints[233] = 1;}
							} else {ints[234] = 1;}
						} else {ints[235] = 1;}
					} else {ints[236] = 1;}
				} else {
					if (InsertSpan < 164224) {
						if (TitleLength < 5.5) {ints[237] = 1;}
						else {ints[238] = 1;}
					} else {
						if (TitleDist < 0.5) {
							if (EpochSpan < 259026) {ints[239] = 1;}
							if (EpochSpan >= 259026) {
								if (CKWSLength < 6.5) {
									if (SimhashDist < 21.5) {ints[240] = 1;}
									else {ints[241] = 1;}
								} else {ints[242] = 1;}
							}
						} else {ints[243] = 1;}
					}
				}
			} else {
				if (EpochSpan < 83993.5) {
					if (COrgRatioNE < 0.27) {
						if (TKWSRatio < 0.58) {
							if (CLocRatioSP < 0.35) {
								if (SimhashDist < 61.5) {
									if (TKWSRatio < 0.49) {ints[244] = 1;}
									else {ints[245] = 1;}
								} else {
									if (CKWSLength < 18.75) {ints[246] = 1;}
									else {ints[247] = 1;}
								}
							} else {
								if (CPerLengthNE < 3.25) {
									if (TitleLength < 8.25) {ints[248] = 1;}
									else {ints[249] = 1;}
								} else {
									if (CatRatio < 0.77) {ints[250] = 1;}
									else {ints[251] = 1;}
								}
							}
						} else {
							if (SameSRC < 0.5) {
								if (CPerRatioSP < 0.18) {
									if (CPerLengthNE < 2.75) {ints[252] = 1;}
									else {ints[253] = 1;}
								} else {
									if (TLocRatioSP < 0.3) {ints[254] = 1;}
									else {ints[255] = 1;}
								}
							} else {
								if (CLocLengthSP < 8.75) {
									if (TitleRatio < 0.64) {ints[256] = 1;}
									else {ints[257] = 1;}
								} else {ints[258] = 1;}
							}
						}
					} else {
						if (SameSRC < 0.5) {
							if (CKWSRatio < 0.22) {
								if (CPerLengthNE < 2.5) {
									if (TitleDist < 39) {ints[259] = 1;}
									else {ints[260] = 1;}
								} else {
									if (COrgLengthSP < 6.5) {ints[261] = 1;}
									else {ints[262] = 1;}
								}
							} else {
								if (TitleRatio < 0.38) {
									if (ChannelLength < 4.25) {ints[263] = 1;}
									else {ints[264] = 1;}
								} else {
									if (CLocRatioNE < 0.37) {ints[265] = 1;}
									else {ints[266] = 1;}
								}
							}
						} else {
							if (InsertSpan < 4.5) {ints[267] = 1;}
							if (InsertSpan >= 4.5) {
								if (CKWSRatio < 0.52) {
									if (GeoRatio < 0.61) {ints[268] = 1;}
									else {ints[269] = 1;}
								} else {
									if (CLocRatioNE < 0.23) {ints[270] = 1;}
									else {ints[271] = 1;}
								}
							}
						}
					}
				} else {
					if (CTimLengthSP < 28.5) {
						if (CLocRatioSP < 0.27) {
							if (EpochSpan < 245430) {
								if (CPerLengthNE < 23.5) {
									if (SimhashDist < 77.5) {ints[272] = 1;}
									else {ints[273] = 1;}
								} else {
									if (CatLength < 0.9) {ints[274] = 1;}
									else {ints[275] = 1;}
								}
							} else {
								if (TKWSRatio < 0.77) {
									if (CKWSRatio < 0.77) {ints[276] = 1;}
									else {ints[277] = 1;}
								} else {
									if (TitleDist < 33.5) {ints[278] = 1;}
									else {ints[279] = 1;}
								}
							}
						} else {
							if (EpochSpan < 270833.5) {
								if (TTimRatioSP < 0.17) {
									if (CNUMLengthSP < 25.25) {ints[280] = 1;}
									else {ints[281] = 1;}
								} else {
									if (EpochSpan < 86400.5) {ints[282] = 1;}
									else {ints[283] = 1;}
								}
							} else {
								if (CWordSpan < 76.5) {
									if (InsertSpan < 487985) {ints[284] = 1;}
									else {ints[285] = 1;}
								} else {
									if (CTimRatioSP < 0.5) {ints[286] = 1;}
									else {ints[287] = 1;}
								}
							}
						}
					} else {
						if (CKWSLength < 17.25) {
							if (COrgRatioSP < 0.7) {ints[288] = 1;}
							else {ints[289] = 1;}
						} else {ints[290] = 1;}
					}
				}
			}
		}
	}
} else {
	if (TitleRatio < 0.88) {
		if (InsertSpan < 296913) {
			if (HKWSRatio < 0.56) {
				if (CKWSRatio < 0.34) {
					if (CKWSRatio < 0.14) {
						if (CNUMLengthSP < 18) {
							if (CLocRatioSP < 0.8) {
								if (CNUMRatioSP < 0.25) {ints[291] = 1;}
								if (CNUMRatioSP >= 0.25) {
									if (TKWSLength < 2.25) {ints[292] = 1;}
									else {ints[293] = 1;}
								}
							} else {
								if (CLocLengthNE < 18) {
									if (SimhashDist < 79.5) {ints[294] = 1;}
									else {ints[295] = 1;}
								} else {
									if (TitleRatio < 0.27) {ints[296] = 1;}
									else {ints[297] = 1;}
								}
							}
						} else {
							if (TitleDist < 59.5) {
								if (EpochSpan < 65967) {ints[298] = 1;}
								else {ints[299] = 1;}
							} else {ints[300] = 1;}
						}
					} else {
						if (COrgRatioSP < 0.55) {
							if (InsertSpan < 118368) {
								if (TKWSRatio < 0.73) {
									if (CTimLengthSP < 31) {ints[301] = 1;}
									else {ints[302] = 1;}
								} else {
									if (ChannelRatio < 0.28) {ints[303] = 1;}
									else {ints[304] = 1;}
								}
							} else {
								if (ParagraphSpan < 46.5) {
									if (CLocRatioNE < 0.28) {ints[305] = 1;}
									else {ints[306] = 1;}
								} else {
									if (COrgLengthNE < 38) {ints[307] = 1;}
									else {ints[308] = 1;}
								}
							}
						} else {
							if (EpochSpan < 49672.5) {
								if (TKWSRatio < 0.37) {
									if (TKWSRatio < 0.33) {ints[309] = 1;}
									else {ints[310] = 1;}
								} else {
									if (ChannelRatio < 0.58) {ints[311] = 1;}
									else {ints[312] = 1;}
								}
							} else {
								if (CPerLengthSP < 8.75) {
									if (COrgLengthNE < 20.25) {ints[313] = 1;}
									else {ints[314] = 1;}
								} else {
									if (COrgRatioSP < 0.79) {ints[315] = 1;}
									else {ints[316] = 1;}
								}
							}
						}
					}
				} else {
					if (InsertSpan < 85921.5) {
						if (CPerLengthNE < 1.25) {
							if (COrgLengthSP < 2.75) {
								if (CatLength < 1.53) {
									if (CTimLengthSP < 9.25) {ints[317] = 1;}
									else {ints[318] = 1;}
								} else {ints[319] = 1;}
							} else {
								if (TitleLength < 5.25) {
									if (EpochSpan < 117.5) {ints[320] = 1;}
									else {ints[321] = 1;}
								} else {
									if (CKWSLength < 16.75) {ints[322] = 1;}
									else {ints[323] = 1;}
								}
							}
						} else {
							if (CatRatio < 0.85) {
								if (CPerRatioNE < 0.73) {
									if (EpochSpan < 79279) {ints[324] = 1;}
									else {ints[325] = 1;}
								} else {
									if (CatRatio < 0.36) {ints[326] = 1;}
									else {ints[327] = 1;}
								}
							} else {
								if (CatLength < 1.09) {
									if (TKWSRatio < 0.5) {ints[328] = 1;}
									else {ints[329] = 1;}
								} else {
									if (TitleRatio < 0.38) {ints[330] = 1;}
									else {ints[331] = 1;}
								}
							}
						}
					} else {
						if (SimhashDist < 78.5) {
							if (TitleRatio < 0.22) {
								if (EpochSpan < 64422) {
									if (TitleDist < 39) {ints[332] = 1;}
									else {ints[333] = 1;}
								} else {
									if (CPerLengthNE < 23.75) {ints[334] = 1;}
									else {ints[335] = 1;}
								}
							} else {
								if (CNUMRatioSP < 0.5) {
									if (EpochSpan < 80162) {ints[336] = 1;}
									else {ints[337] = 1;}
								} else {
									if (CWordSpan < 55) {ints[338] = 1;}
									else {ints[339] = 1;}
								}
							}
						} else {
							if (CKWSLength < 18.25) {
								if (CTimLengthSP < 6.75) {
									if (ChannelLength < 2.25) {ints[340] = 1;}
									else {ints[341] = 1;}
								} else {ints[342] = 1;}
							} else {
								if (TitleDist < 59.5) {
									if (CWordSpan < 207.5) {ints[343] = 1;}
									else {ints[344] = 1;}
								} else {ints[345] = 1;}
							}
						}
					}
				}
			} else {
				if (TitleRatio < 0.36) {
					if (SimhashDist < 69.5) {
						if (ChannelRatio < 0.26) {
							if (CNUMRatioSP < 0.39) {
								if (CNUMLengthSP < 2.75) {
									if (CLocRatioNE < 0.43) {ints[346] = 1;}
									else {ints[347] = 1;}
								} else {
									if (CKWSRatio < 0.45) {ints[348] = 1;}
									else {ints[349] = 1;}
								}
							} else {
								if (CTimRatioSP < 0.19) {
									if (CKWSRatio < 0.5) {ints[350] = 1;}
									else {ints[351] = 1;}
								} else {
									if (CWordSpan < 2589.5) {ints[352] = 1;}
									else {ints[353] = 1;}
								}
							}
						} else {
							if (CKWSRatio < 0.32) {
								if (CPerLengthSP < 29.5) {
									if (COrgRatioSP < 0.68) {ints[354] = 1;}
									else {ints[355] = 1;}
								} else {
									if (CTimLengthSP < 3.25) {ints[356] = 1;}
									else {ints[357] = 1;}
								}
							} else {
								if (InsertSpan < 474) {
									if (HKWSRatio < 0.73) {ints[358] = 1;}
									else {ints[359] = 1;}
								} else {
									if (EpochSpan < 951533.5) {ints[360] = 1;}
									else {ints[361] = 1;}
								}
							}
						}
					} else {
						if (EpochSpan < 102096.5) {
							if (CKWSRatio < 0.34) {
								if (CPerRatioNE < 0.39) {
									if (COrgLengthNE < 6) {ints[362] = 1;}
									else {ints[363] = 1;}
								} else {
									if (CKWSRatio < 0.25) {ints[364] = 1;}
									else {ints[365] = 1;}
								}
							} else {
								if (CPerRatioNE < 0.6) {
									if (TKWSLength < 7.25) {ints[366] = 1;}
									else {ints[367] = 1;}
								} else {
									if (CatRatio < 0.86) {ints[368] = 1;}
									else {ints[369] = 1;}
								}
							}
						} else {
							if (CPerLengthSP < 15.75) {
								if (TitleRatio < 0.2) {
									if (CKWSLength < 19.75) {ints[370] = 1;}
									else {ints[371] = 1;}
								} else {
									if (CNUMRatioSP < 0.31) {ints[372] = 1;}
									else {ints[373] = 1;}
								}
							} else {
								if (CLocLengthNE < 18.75) {
									if (CKWSRatio < 0.37) {ints[374] = 1;}
									else {ints[375] = 1;}
								} else {
									if (CNUMRatioSP < 0.2) {ints[376] = 1;}
									else {ints[377] = 1;}
								}
							}
						}
					}
				} else {
					if (SameSRC < 0.5) {
						if (CPerRatioNE < 1) {
							if (CKWSLength < 8.75) {
								if (GeoRatio < 0.58) {
									if (CWordSpan < 35.5) {ints[378] = 1;}
									else {ints[379] = 1;}
								} else {
									if (CWordSpan < 10.5) {ints[380] = 1;}
									else {ints[381] = 1;}
								}
							} else {
								if (CKWSRatio < 0.29) {
									if (CTimRatioSP < 0.21) {ints[382] = 1;}
									else {ints[383] = 1;}
								} else {
									if (COrgLengthNE < 0.75) {ints[384] = 1;}
									else {ints[385] = 1;}
								}
							}
						} else {
							if (TitleDist < 10.5) {
								if (CPerLengthNE < 2.5) {
									if (CLocRatioNE < 0.09) {ints[386] = 1;}
									else {ints[387] = 1;}
								} else {
									if (GeoRatio < 0.42) {ints[388] = 1;}
									else {ints[389] = 1;}
								}
							} else {
								if (EpochSpan < 135728.5) {
									if (CKWSLength < 6.75) {ints[390] = 1;}
									else {ints[391] = 1;}
								} else {
									if (TKWSLength < 2.75) {ints[392] = 1;}
									else {ints[393] = 1;}
								}
							}
						}
					} else {
						if (TitleDist < 22.5) {
							if (CNUMRatioSP < 0.16) {
								if (CatLength < 0.91) {
									if (COrgRatioNE < 0.92) {ints[394] = 1;}
									else {ints[395] = 1;}
								} else {ints[396] = 1;}
							} else {
								if (CPerLengthNE < 1.75) {
									if (TitleDist < 6) {ints[397] = 1;}
									else {ints[398] = 1;}
								} else {
									if (TitleLength < 12.75) {ints[399] = 1;}
									else {ints[400] = 1;}
								}
							}
						} else {
							if (CPerRatioNE < 0.79) {
								if (EpochSpan < 94683.5) {
									if (TitleRatio < 0.46) {ints[401] = 1;}
									else {ints[402] = 1;}
								} else {
									if (COrgLengthSP < 9.25) {ints[403] = 1;}
									else {ints[404] = 1;}
								}
							} else {
								if (COrgRatioSP < 0.48) {
									if (TKWSRatio < 0.76) {ints[405] = 1;}
									else {ints[406] = 1;}
								} else {
									if (TNUMLengthSP < 1.25) {ints[407] = 1;}
									else {ints[408] = 1;}
								}
							}
						}
					}
				}
			}
		} else {
			if (CPerRatioSP < 0.62) {
				if (CNUMRatioSP < 0.46) {
					if (InsertSpan < 362305.5) {
						if (TKWSRatio < 0.28) {ints[409] = 1;}
						if (TKWSRatio >= 0.28) {
							if (TitleDist < 19.5) {ints[410] = 1;}
							if (TitleDist >= 19.5) {
								if (ChannelRatio < 0.45) {
									if (CNUMLengthSP < 3) {ints[411] = 1;}
									else {ints[412] = 1;}
								} else {
									if (InsertSpan < 358691.5) {ints[413] = 1;}
									else {ints[414] = 1;}
								}
							}
						}
					} else {
						if (TitleDist < 66.5) {
							if (COrgLengthSP < 15.25) {
								if (CKWSRatio < 0.27) {
									if (TNUMRatioSP < 0.33) {ints[415] = 1;}
									else {ints[416] = 1;}
								} else {
									if (COrgLengthNE < 1.75) {ints[417] = 1;}
									else {ints[418] = 1;}
								}
							} else {
								if (InsertSpan < 541961) {
									if (ChannelRatio < 0.45) {ints[419] = 1;}
									else {ints[420] = 1;}
								} else {
									if (TTimRatioSP < 0.92) {ints[421] = 1;}
									else {ints[422] = 1;}
								}
							}
						} else {ints[423] = 1;}
					}
				} else {
					if (CTimRatioSP < 0.3) {
						if (CPerRatioNE < 0.75) {
							if (CLocLengthSP < 0.75) {
								if (TitleRatio < 0.49) {ints[424] = 1;}
								else {ints[425] = 1;}
							} else {
								if (CLocRatioSP < 0.74) {ints[426] = 1;}
								if (CLocRatioSP >= 0.74) {
									if (SimhashDist < 49.5) {ints[427] = 1;}
									else {ints[428] = 1;}
								}
							}
						} else {
							if (ParagraphSpan < 9.5) {ints[429] = 1;}
							if (ParagraphSpan >= 9.5) {
								if (CTimLengthSP < 2.5) {ints[430] = 1;}
								else {ints[431] = 1;}
							}
						}
					} else {
						if (SameSRC < 0.5) {
							if (CKWSRatio < 0.64) {
								if (CLocRatioSP < 0.78) {
									if (CPerLengthSP < 21.75) {ints[432] = 1;}
									else {ints[433] = 1;}
								} else {
									if (CLocLengthSP < 5.75) {ints[434] = 1;}
									else {ints[435] = 1;}
								}
							} else {ints[436] = 1;}
						} else {
							if (CPerRatioSP < 0.45) {
								if (CLocLengthNE < 9.25) {
									if (SimhashDist < 61) {ints[437] = 1;}
									else {ints[438] = 1;}
								} else {ints[439] = 1;}
							} else {
								if (CTimRatioSP < 0.31) {ints[440] = 1;}
								else {ints[441] = 1;}
							}
						}
					}
				}
			} else {
				if (InsertSpan < 596489) {
					if (CNUMLengthSP < 9.75) {
						if (CLocRatioSP < 0.67) {
							if (SimhashDist < 62.5) {
								if (HKWSLength < 0.75) {
									if (CKWSRatio < 0.41) {ints[442] = 1;}
									else {ints[443] = 1;}
								} else {
									if (EpochSpan < 341782.5) {ints[444] = 1;}
									else {ints[445] = 1;}
								}
							} else {
								if (TKWSRatio < 0.65) {
									if (CatLength < 1) {ints[446] = 1;}
									else {ints[447] = 1;}
								} else {
									if (CKWSRatio < 0.18) {ints[448] = 1;}
									else {ints[449] = 1;}
								}
							}
						} else {
							if (COrgRatioSP < 0.15) {
								if (CNUMRatioSP < 0.33) {
									if (TitleDist < 30) {ints[450] = 1;}
									else {ints[451] = 1;}
								} else {
									if (CPerLengthSP < 10.25) {ints[452] = 1;}
									else {ints[453] = 1;}
								}
							} else {
								if (EpochSpan < 328504.5) {
									if (CTimLengthSP < 21.5) {ints[454] = 1;}
									else {ints[455] = 1;}
								} else {
									if (TitleDist < 38.5) {ints[456] = 1;}
									else {ints[457] = 1;}
								}
							}
						}
					} else {
						if (COrgLengthNE < 8.25) {
							if (TitleLength < 6.25) {
								if (TitleDist < 21) {ints[458] = 1;}
								else {ints[459] = 1;}
							} else {
								if (CTimLengthSP < 4.75) {
									if (CLocLengthNE < 1.75) {ints[460] = 1;}
									else {ints[461] = 1;}
								} else {
									if (ChannelRatio < 0.92) {ints[462] = 1;}
									else {ints[463] = 1;}
								}
							}
						} else {
							if (ParagraphSpan < 4.5) {
								if (CTimRatioSP < 0.26) {
									if (CatLength < 1.12) {ints[464] = 1;}
									else {ints[465] = 1;}
								} else {
									if (TitleRatio < 0.69) {ints[466] = 1;}
									else {ints[467] = 1;}
								}
							} else {
								if (SimhashDist < 61.5) {
									if (CNUMLengthSP < 13.25) {ints[468] = 1;}
									else {ints[469] = 1;}
								} else {ints[470] = 1;}
							}
						}
					}
				} else {
					if (CNUMRatioSP < 0.96) {
						if (CNUMLengthSP < 12.75) {
							if (CLocRatioNE < 0.57) {
								if (TitleRatio < 0.44) {
									if (CPerRatioNE < 1) {ints[471] = 1;}
									else {ints[472] = 1;}
								} else {
									if (InsertSpan < 920554) {ints[473] = 1;}
									else {ints[474] = 1;}
								}
							} else {
								if (CTimRatioSP < 0.35) {
									if (SimhashDist < 63) {ints[475] = 1;}
									else {ints[476] = 1;}
								} else {
									if (SameSRC < 0.5) {ints[477] = 1;}
									else {ints[478] = 1;}
								}
							}
						} else {
							if (TitleLength < 10.75) {
								if (CatLength < 0.79) {
									if (TOrgRatioSP < 0.29) {ints[479] = 1;}
									else {ints[480] = 1;}
								} else {ints[481] = 1;}
							} else {
								if (InsertSpan < 951741) {ints[482] = 1;}
								if (InsertSpan >= 951741) {
									if (SimhashDist < 54.5) {ints[483] = 1;}
									else {ints[484] = 1;}
								}
							}
						}
					} else {
						if (CLocLengthNE < 5.75) {
							if (CatLength < 0.87) {ints[485] = 1;}
							else {ints[486] = 1;}
						} else {
							if (SimhashDist < 61.5) {ints[487] = 1;}
							else {ints[488] = 1;}
						}
					}
				}
			}
		}
	} else {
		if (EpochSpan < 85045) {
			if (CTimRatioSP < 0.95) {
				if (SameSRC < 0.5) {
					if (CatLength < 0.66) {
						if (ChannelLength < 3.75) {
							if (TitleLength < 7) {ints[489] = 1;}
							else {ints[490] = 1;}
						} else {ints[491] = 1;}
					} else {
						if (CPerRatioSP < 0.11) {
							if (TitleLength < 4.25) {ints[492] = 1;}
							if (TitleLength >= 4.25) {
								if (CTimRatioSP < 0.89) {ints[493] = 1;}
								else {ints[494] = 1;}
							}
						} else {
							if (TLocLengthSP < 2.5) {
								if (CatRatio < 0.77) {
									if (CatRatio < 0.77) {ints[495] = 1;}
									else {ints[496] = 1;}
								} else {ints[497] = 1;}
							} else {
								if (ParagraphSpan < 11.5) {
									if (CatRatio < 0.77) {ints[498] = 1;}
									else {ints[499] = 1;}
								} else {ints[500] = 1;}
							}
						}
					}
				} else {
					if (TLocLengthNE < 0.75) {
						if (CatLength < 1.57) {
							if (InsertSpan < 528) {ints[501] = 1;}
							if (InsertSpan >= 528) {
								if (CPerLengthSP < 38.5) {
									if (InsertSpan < 47489) {ints[502] = 1;}
									else {ints[503] = 1;}
								} else {ints[504] = 1;}
							}
						} else {
							if (TitleDist < 3.5) {ints[505] = 1;}
							else {ints[506] = 1;}
						}
					} else {
						if (TitleRatio < 0.89) {
							if (CTimLengthSP < 3.25) {ints[507] = 1;}
							else {ints[508] = 1;}
						} else {
							if (HKWSLength < 3.25) {
								if (CPerLengthNE < 47.5) {
									if (TitleLength < 4.5) {ints[509] = 1;}
									else {ints[510] = 1;}
								} else {ints[511] = 1;}
							} else {ints[512] = 1;}
						}
					}
				}
			} else {
				if (TitleLength < 17.75) {
					if (COrgRatioNE < 0.21) {
						if (CLocLengthSP < 10.75) {
							if (CKWSLength < 2) {ints[513] = 1;}
							if (CKWSLength >= 2) {
								if (SimhashDist < 1) {
									if (COrgLengthSP < 2.5) {ints[514] = 1;}
									else {ints[515] = 1;}
								} else {ints[516] = 1;}
							}
						} else {ints[517] = 1;}
					} else {
						if (InsertSpan < 1013855.5) {
							if (CLocLengthNE < 47.5) {
								if (TitleLength < 3.5) {
									if (CPerLengthSP < 8.5) {ints[518] = 1;}
									else {ints[519] = 1;}
								} else {
									if (TOrgLengthSP < 2.75) {ints[520] = 1;}
									else {ints[521] = 1;}
								}
							} else {
								if (TKWSLength < 2.5) {
									if (CatLength < 0.8) {ints[522] = 1;}
									else {ints[523] = 1;}
								} else {ints[524] = 1;}
							}
						} else {
							if (CKWSRatio < 1) {ints[525] = 1;}
							else {ints[526] = 1;}
						}
					}
				} else {
					if (CPerLengthNE < 3) {
						if (InsertSpan < 1022) {ints[527] = 1;}
						else {ints[528] = 1;}
					} else {ints[529] = 1;}
				}
			}
		} else {
			if (CNUMLengthSP < 12.25) {
				if (SameSRC < 0.5) {
					if (CLocLengthSP < 2.25) {
						if (CNUMRatioSP < 0.71) {
							if (SimhashDist < 28) {
								if (InsertSpan < 428677) {ints[530] = 1;}
								else {ints[531] = 1;}
							} else {
								if (CatLength < 0.85) {ints[532] = 1;}
								else {ints[533] = 1;}
							}
						} else {ints[534] = 1;}
					} else {
						if (TitleRatio < 0.92) {
							if (TitleDist < 5.5) {ints[535] = 1;}
							if (TitleDist >= 5.5) {
								if (ChannelRatio < 0.93) {ints[536] = 1;}
								if (ChannelRatio >= 0.93) {
									if (ParagraphSpan < 0.5) {ints[537] = 1;}
									else {ints[538] = 1;}
								}
							}
						} else {ints[539] = 1;}
					}
				} else {
					if (CatLength < 1.56) {
						if (CTimLengthSP < 4.25) {
							if (CNUMLengthSP < 3.75) {ints[540] = 1;}
							if (CNUMLengthSP >= 3.75) {
								if (CLocLengthNE < 2.5) {ints[541] = 1;}
								else {ints[542] = 1;}
							}
						} else {
							if (CTimLengthSP < 9.25) {
								if (CatLength < 1.47) {
									if (CLocLengthNE < 6.25) {ints[543] = 1;}
									else {ints[544] = 1;}
								} else {ints[545] = 1;}
							} else {
								if (TitleDist < 0.5) {ints[546] = 1;}
								else {ints[547] = 1;}
							}
						}
					} else {
						if (CWordSpan < 43) {ints[548] = 1;}
						else {ints[549] = 1;}
					}
				}
			} else {
				if (InsertSpan < 224169) {
					if (COrgRatioSP < 0.61) {ints[550] = 1;}
					else {ints[551] = 1;}
				} else {
					if (CatLength < 0.9) {ints[552] = 1;}
					if (CatLength >= 0.9) {
						if (COrgRatioNE < 0.79) {
							if (CLocRatioSP < 0.75) {ints[553] = 1;}
							if (CLocRatioSP >= 0.75) {
								if (TitleRatio < 0.95) {ints[554] = 1;}
								else {ints[555] = 1;}
							}
						} else {
							if (COrgRatioSP < 0.4) {ints[556] = 1;}
							else {ints[557] = 1;}
						}
					}
				}
			}
		}
	}
}
if (CPerRatioSP < 0.32) {
	if (ChannelRatio < 0.26) {
		if (CKWSRatio < 0.18) {
			if (CatRatio < 0.55) {
				if (CLocLengthNE < 22.25) {
					if (TKWSRatio < 0.35) {
						if (TPerRatioSP < 0.65) {
							if (SimhashDist < 74.5) {
								if (ChannelLength < 4.75) {ints[1024] = 1;}
								if (ChannelLength >= 4.75) {
									if (CTimRatioSP < 0.22) {ints[1025] = 1;}
									else {ints[1026] = 1;}
								}
							} else {
								if (CPerLengthSP < 33.5) {ints[1027] = 1;}
								if (CPerLengthSP >= 33.5) {
									if (CatLength < 1.18) {ints[1028] = 1;}
									else {ints[1029] = 1;}
								}
							}
						} else {
							if (ParagraphSpan < 0.5) {ints[1030] = 1;}
							if (ParagraphSpan >= 0.5) {
								if (TKWSLength < 4.75) {ints[1031] = 1;}
								else {ints[1032] = 1;}
							}
						}
					} else {
						if (CNUMRatioSP < 0.03) {ints[1033] = 1;}
						if (CNUMRatioSP >= 0.03) {
							if (CNUMRatioSP < 0.08) {
								if (CWordSpan < 415) {ints[1034] = 1;}
								else {ints[1035] = 1;}
							} else {
								if (SimhashDist < 70) {
									if (CLocRatioSP < 0.32) {ints[1036] = 1;}
									else {ints[1037] = 1;}
								} else {ints[1038] = 1;}
							}
						}
					}
				} else {
					if (SimhashDist < 66.5) {
						if (CKWSLength < 19.75) {ints[1039] = 1;}
						else {ints[1040] = 1;}
					} else {
						if (COrgRatioSP < 0.18) {
							if (TitleRatio < 0.14) {ints[1041] = 1;}
							if (TitleRatio >= 0.14) {
								if (TLocLengthSP < 0.75) {ints[1042] = 1;}
								else {ints[1043] = 1;}
							}
						} else {
							if (TitleDist < 41.5) {
								if (TitleDist < 38.5) {ints[1044] = 1;}
								else {ints[1045] = 1;}
							} else {ints[1046] = 1;}
						}
					}
				}
			} else {
				if (SimhashDist < 67.5) {
					if (ParagraphSpan < 2.5) {
						if (CPerLengthSP < 2.25) {
							if (CKWSLength < 9.75) {ints[1047] = 1;}
							else {ints[1048] = 1;}
						} else {
							if (CLocLengthNE < 8) {
								if (CNUMLengthSP < 4.25) {ints[1049] = 1;}
								if (CNUMLengthSP >= 4.25) {
									if (CNUMLengthSP < 20.25) {ints[1050] = 1;}
									else {ints[1051] = 1;}
								}
							} else {ints[1052] = 1;}
						}
					} else {
						if (TitleDist < 59.5) {
							if (CLocRatioSP < 0.41) {
								if (CatRatio < 0.72) {ints[1053] = 1;}
								if (CatRatio >= 0.72) {
									if (CNUMLengthSP < 9.75) {ints[1054] = 1;}
									else {ints[1055] = 1;}
								}
							} else {
								if (CNUMRatioSP < 0.19) {
									if (CWordSpan < 918) {ints[1056] = 1;}
									else {ints[1057] = 1;}
								} else {
									if (TitleRatio < 0.21) {ints[1058] = 1;}
									else {ints[1059] = 1;}
								}
							}
						} else {ints[1060] = 1;}
					}
				} else {
					if (TOrgRatioSP < 0.54) {
						if (TitleDist < 58.5) {
							if (CKWSRatio < 0.07) {
								if (CNUMRatioSP < 0.28) {ints[1061] = 1;}
								if (CNUMRatioSP >= 0.28) {
									if (TitleRatio < 0.25) {ints[1062] = 1;}
									else {ints[1063] = 1;}
								}
							} else {
								if (CKWSRatio < 0.14) {
									if (TitleRatio < 0.44) {ints[1064] = 1;}
									else {ints[1065] = 1;}
								} else {ints[1066] = 1;}
							}
						} else {
							if (CatLength < 1.52) {ints[1067] = 1;}
							if (CatLength >= 1.52) {
								if (CLocRatioSP < 0.6) {ints[1068] = 1;}
								if (CLocRatioSP >= 0.6) {
									if (InsertSpan < 390681) {ints[1069] = 1;}
									else {ints[1070] = 1;}
								}
							}
						}
					} else {
						if (InsertSpan < 3305.5) {
							if (COrgLengthSP < 12.25) {
								if (ChannelRatio < 0.17) {ints[1071] = 1;}
								if (ChannelRatio >= 0.17) {
									if (TitleLength < 12) {ints[1072] = 1;}
									else {ints[1073] = 1;}
								}
							} else {ints[1074] = 1;}
						} else {
							if (COrgLengthNE < 40.25) {
								if (COrgLengthSP < 31.75) {
									if (CatRatio < 0.95) {ints[1075] = 1;}
									else {ints[1076] = 1;}
								} else {ints[1077] = 1;}
							} else {
								if (COrgRatioSP < 0.39) {ints[1078] = 1;}
								else {ints[1079] = 1;}
							}
						}
					}
				}
			}
		} else {
			if (TKWSRatio < 0.51) {
				if (InsertSpan < 30033) {
					if (TKWSRatio < 0.18) {
						if (CKWSRatio < 0.3) {
							if (EpochSpan < 13391.5) {ints[1080] = 1;}
							if (EpochSpan >= 13391.5) {
								if (CPerRatioSP < 0.1) {
									if (CLocRatioNE < 0.7) {ints[1081] = 1;}
									else {ints[1082] = 1;}
								} else {ints[1083] = 1;}
							}
						} else {
							if (ParagraphSpan < 81) {
								if (SimhashDist < 66.5) {
									if (CPerLengthSP < 10.25) {ints[1084] = 1;}
									else {ints[1085] = 1;}
								} else {
									if (CatLength < 0.81) {ints[1086] = 1;}
									else {ints[1087] = 1;}
								}
							} else {
								if (CTimRatioSP < 0.2) {ints[1088] = 1;}
								else {ints[1089] = 1;}
							}
						}
					} else {
						if (SimhashDist < 80.5) {
							if (CNUMLengthSP < 4.25) {
								if (CatLength < 0.9) {
									if (CKWSLength < 11.75) {ints[1090] = 1;}
									else {ints[1091] = 1;}
								} else {
									if (COrgRatioSP < 0.23) {ints[1092] = 1;}
									else {ints[1093] = 1;}
								}
							} else {
								if (CKWSLength < 12.25) {ints[1094] = 1;}
								if (CKWSLength >= 12.25) {
									if (CatLength < 1.35) {ints[1095] = 1;}
									else {ints[1096] = 1;}
								}
							}
						} else {
							if (CatLength < 0.9) {
								if (SimhashDist < 88.5) {
									if (CatLength < 0.85) {ints[1097] = 1;}
									else {ints[1098] = 1;}
								} else {ints[1099] = 1;}
							} else {ints[1100] = 1;}
						}
					}
				} else {
					if (COrgRatioSP < 0.43) {
						if (InsertSpan < 101730.5) {
							if (SimhashDist < 56.5) {
								if (CLocLengthNE < 15.75) {
									if (CTimRatioSP < 0.07) {ints[1101] = 1;}
									else {ints[1102] = 1;}
								} else {ints[1103] = 1;}
							} else {
								if (CLocLengthNE < 15.25) {
									if (CTimLengthSP < 18.25) {ints[1104] = 1;}
									else {ints[1105] = 1;}
								} else {
									if (CPerLengthNE < 2.25) {ints[1106] = 1;}
									else {ints[1107] = 1;}
								}
							}
						} else {
							if (TitleDist < 58.5) {
								if (CTimLengthSP < 2.75) {
									if (EpochSpan < 290275) {ints[1108] = 1;}
									else {ints[1109] = 1;}
								} else {
									if (CLocLengthSP < 3.25) {ints[1110] = 1;}
									else {ints[1111] = 1;}
								}
							} else {
								if (COrgLengthNE < 17.25) {ints[1112] = 1;}
								if (COrgLengthNE >= 17.25) {
									if (InsertSpan < 554205.5) {ints[1113] = 1;}
									else {ints[1114] = 1;}
								}
							}
						}
					} else {
						if (TitleRatio < 0.11) {
							if (CNUMRatioSP < 0.27) {ints[1115] = 1;}
							if (CNUMRatioSP >= 0.27) {
								if (CPerLengthNE < 1) {
									if (InsertSpan < 144953) {ints[1116] = 1;}
									else {ints[1117] = 1;}
								} else {
									if (COrgRatioSP < 0.45) {ints[1118] = 1;}
									else {ints[1119] = 1;}
								}
							}
						} else {
							if (CWordSpan < 141) {
								if (CLocLengthSP < 0.75) {
									if (CTimRatioSP < 0.44) {ints[1120] = 1;}
									else {ints[1121] = 1;}
								} else {
									if (HKWSLength < 1.25) {ints[1122] = 1;}
									else {ints[1123] = 1;}
								}
							} else {
								if (CatLength < 0.62) {ints[1124] = 1;}
								if (CatLength >= 0.62) {
									if (CLocLengthSP < 25.25) {ints[1125] = 1;}
									else {ints[1126] = 1;}
								}
							}
						}
					}
				}
			} else {
				if (CLocRatioSP < 0.55) {
					if (SimhashDist < 81.5) {
						if (CPerLengthSP < 7.75) {
							if (InsertSpan < 71199) {
								if (TitleLength < 7.75) {
									if (COrgLengthNE < 2.75) {ints[1127] = 1;}
									else {ints[1128] = 1;}
								} else {
									if (EpochSpan < 22655) {ints[1129] = 1;}
									else {ints[1130] = 1;}
								}
							} else {
								if (COrgRatioNE < 0.47) {
									if (CPerLengthNE < 1.25) {ints[1131] = 1;}
									else {ints[1132] = 1;}
								} else {
									if (InsertSpan < 148844.5) {ints[1133] = 1;}
									else {ints[1134] = 1;}
								}
							}
						} else {
							if (EpochSpan < 94903.5) {
								if (CTimRatioSP < 0.49) {
									if (CWordSpan < 51) {ints[1135] = 1;}
									else {ints[1136] = 1;}
								} else {
									if (CWordSpan < 82) {ints[1137] = 1;}
									else {ints[1138] = 1;}
								}
							} else {
								if (CatLength < 0.79) {
									if (ChannelLength < 4.25) {ints[1139] = 1;}
									else {ints[1140] = 1;}
								} else {ints[1141] = 1;}
							}
						}
					} else {
						if (COrgLengthSP < 3.25) {
							if (ChannelRatio < 0.07) {ints[1142] = 1;}
							if (ChannelRatio >= 0.07) {
								if (TitleLength < 7.75) {ints[1143] = 1;}
								else {ints[1144] = 1;}
							}
						} else {
							if (SameSRC < 0.5) {ints[1145] = 1;}
							if (SameSRC >= 0.5) {
								if (ChannelRatio < 0.05) {ints[1146] = 1;}
								else {ints[1147] = 1;}
							}
						}
					}
				} else {
					if (EpochSpan < 85260) {
						if (CPerRatioSP < 0.19) {
							if (TitleDist < 36.5) {
								if (CKWSLength < 12.75) {
									if (TitleDist < 30.5) {ints[1148] = 1;}
									else {ints[1149] = 1;}
								} else {ints[1150] = 1;}
							} else {
								if (COrgLengthSP < 7.75) {
									if (COrgLengthNE < 3.25) {ints[1151] = 1;}
									else {ints[1152] = 1;}
								} else {
									if (CWordSpan < 788) {ints[1153] = 1;}
									else {ints[1154] = 1;}
								}
							}
						} else {
							if (CWordSpan < 24.5) {ints[1155] = 1;}
							if (CWordSpan >= 24.5) {
								if (COrgRatioNE < 0.64) {ints[1156] = 1;}
								else {ints[1157] = 1;}
							}
						}
					} else {
						if (COrgRatioSP < 0.47) {
							if (SimhashDist < 53) {
								if (TitleRatio < 0.4) {ints[1158] = 1;}
								else {ints[1159] = 1;}
							} else {
								if (CWordSpan < 753) {ints[1160] = 1;}
								if (CWordSpan >= 753) {
									if (CKWSLength < 16.5) {ints[1161] = 1;}
									else {ints[1162] = 1;}
								}
							}
						} else {
							if (ParagraphSpan < 1.5) {ints[1163] = 1;}
							if (ParagraphSpan >= 1.5) {
								if (CatRatio < 0.17) {ints[1164] = 1;}
								if (CatRatio >= 0.17) {
									if (CLocLengthNE < 3.75) {ints[1165] = 1;}
									else {ints[1166] = 1;}
								}
							}
						}
					}
				}
			}
		}
	} else {
		if (ChannelRatio < 0.45) {
			if (CKWSRatio < 0.31) {
				if (EpochSpan < 75104.5) {
					if (ChannelRatio < 0.31) {
						if (TitleRatio < 0.24) {
							if (SimhashDist < 64.5) {
								if (EpochSpan < 58621) {ints[1167] = 1;}
								if (EpochSpan >= 58621) {
									if (CWordSpan < 104) {ints[1168] = 1;}
									else {ints[1169] = 1;}
								}
							} else {
								if (CTimLengthSP < 21.25) {ints[1170] = 1;}
								if (CTimLengthSP >= 21.25) {
									if (TitleRatio < 0.05) {ints[1171] = 1;}
									else {ints[1172] = 1;}
								}
							}
						} else {
							if (SimhashDist < 68.5) {
								if (TitleLength < 7.25) {
									if (CTimLengthSP < 17.5) {ints[1173] = 1;}
									else {ints[1174] = 1;}
								} else {
									if (CatRatio < 0.66) {ints[1175] = 1;}
									else {ints[1176] = 1;}
								}
							} else {
								if (COrgRatioNE < 0.3) {
									if (CKWSRatio < 0.27) {ints[1177] = 1;}
									else {ints[1178] = 1;}
								} else {
									if (CWordSpan < 304) {ints[1179] = 1;}
									else {ints[1180] = 1;}
								}
							}
						}
					} else {
						if (TitleRatio < 0.56) {
							if (CNUMRatioSP < 0.2) {
								if (CatLength < 0.93) {
									if (CNUMRatioSP < 0.14) {ints[1181] = 1;}
									else {ints[1182] = 1;}
								} else {
									if (TitleLength < 11.25) {ints[1183] = 1;}
									else {ints[1184] = 1;}
								}
							} else {
								if (TitleRatio < 0.11) {ints[1185] = 1;}
								if (TitleRatio >= 0.11) {
									if (CPerLengthSP < 17.75) {ints[1186] = 1;}
									else {ints[1187] = 1;}
								}
							}
						} else {
							if (CTimRatioSP < 0.21) {ints[1188] = 1;}
							if (CTimRatioSP >= 0.21) {
								if (COrgLengthNE < 1.25) {ints[1189] = 1;}
								if (COrgLengthNE >= 1.25) {
									if (ChannelLength < 2.75) {ints[1190] = 1;}
									else {ints[1191] = 1;}
								}
							}
						}
					}
				} else {
					if (TOrgRatioSP < 0.71) {
						if (CKWSRatio < 0.21) {
							if (TKWSLength < 3.25) {
								if (CLocLengthSP < 15.75) {
									if (CTimRatioSP < 0.19) {ints[1192] = 1;}
									else {ints[1193] = 1;}
								} else {
									if (CLocLengthSP < 16.5) {ints[1194] = 1;}
									else {ints[1195] = 1;}
								}
							} else {
								if (TitleDist < 106) {ints[1196] = 1;}
								if (TitleDist >= 106) {
									if (TitleLength < 13.75) {ints[1197] = 1;}
									else {ints[1198] = 1;}
								}
							}
						} else {
							if (TKWSRatio < 0.11) {ints[1199] = 1;}
							if (TKWSRatio >= 0.11) {
								if (EpochSpan < 1499318.5) {
									if (TitleLength < 9.25) {ints[1200] = 1;}
									else {ints[1201] = 1;}
								} else {ints[1202] = 1;}
							}
						}
					} else {
						if (COrgLengthNE < 10.75) {
							if (TOrgLengthSP < 1.25) {
								if (CLocLengthSP < 2.75) {
									if (CatLength < 1.26) {ints[1203] = 1;}
									else {ints[1204] = 1;}
								} else {
									if (CTimRatioSP < 0.08) {ints[1205] = 1;}
									else {ints[1206] = 1;}
								}
							} else {
								if (InsertSpan < 190901.5) {
									if (CLocLengthSP < 1.25) {ints[1207] = 1;}
									else {ints[1208] = 1;}
								} else {
									if (CTimLengthSP < 6.25) {ints[1209] = 1;}
									else {ints[1210] = 1;}
								}
							}
						} else {
							if (CNUMLengthSP < 3.75) {
								if (TKWSLength < 3.25) {ints[1211] = 1;}
								else {ints[1212] = 1;}
							} else {
								if (CPerLengthSP < 2.25) {
									if (EpochSpan < 220877) {ints[1213] = 1;}
									else {ints[1214] = 1;}
								} else {
									if (CNUMLengthSP < 37.5) {ints[1215] = 1;}
									else {ints[1216] = 1;}
								}
							}
						}
					}
				}
			} else {
				if (SimhashDist < 60.5) {
					if (EpochSpan < 264613.5) {
						if (COrgLengthSP < 8.75) {
							if (TKWSRatio < 0.69) {
								if (CWordSpan < 19) {
									if (TitleDist < 2.5) {ints[1217] = 1;}
									else {ints[1218] = 1;}
								} else {
									if (CTimLengthSP < 4.25) {ints[1219] = 1;}
									else {ints[1220] = 1;}
								}
							} else {
								if (ChannelRatio < 0.39) {
									if (TKWSLength < 2.25) {ints[1221] = 1;}
									else {ints[1222] = 1;}
								} else {
									if (COrgLengthNE < 4.25) {ints[1223] = 1;}
									else {ints[1224] = 1;}
								}
							}
						} else {
							if (CTimRatioSP < 0.28) {
								if (CatRatio < 0.76) {ints[1225] = 1;}
								if (CatRatio >= 0.76) {
									if (CPerLengthSP < 3.75) {ints[1226] = 1;}
									else {ints[1227] = 1;}
								}
							} else {
								if (COrgLengthSP < 27.75) {
									if (COrgLengthNE < 6.25) {ints[1228] = 1;}
									else {ints[1229] = 1;}
								} else {
									if (TKWSRatio < 0.57) {ints[1230] = 1;}
									else {ints[1231] = 1;}
								}
							}
						}
					} else {
						if (CLocLengthNE < 0.75) {
							if (COrgRatioSP < 0.76) {
								if (CKWSLength < 10.5) {ints[1232] = 1;}
								else {ints[1233] = 1;}
							} else {ints[1234] = 1;}
						} else {
							if (TOrgRatioNE < 0.88) {ints[1235] = 1;}
							if (TOrgRatioNE >= 0.88) {
								if (TitleDist < 53) {ints[1236] = 1;}
								else {ints[1237] = 1;}
							}
						}
					}
				} else {
					if (CNUMRatioSP < 0.39) {
						if (TitleRatio < 0.12) {
							if (HKWSRatio < 0.76) {
								if (TitleLength < 6.75) {
									if (COrgRatioNE < 0.17) {ints[1238] = 1;}
									else {ints[1239] = 1;}
								} else {ints[1240] = 1;}
							} else {
								if (COrgRatioNE < 0.66) {ints[1241] = 1;}
								if (COrgRatioNE >= 0.66) {
									if (SimhashDist < 63.5) {ints[1242] = 1;}
									else {ints[1243] = 1;}
								}
							}
						} else {
							if (InsertSpan < 70592) {
								if (COrgRatioSP < 0.47) {
									if (CTimLengthSP < 19.25) {ints[1244] = 1;}
									else {ints[1245] = 1;}
								} else {
									if (EpochSpan < 9468) {ints[1246] = 1;}
									else {ints[1247] = 1;}
								}
							} else {
								if (CPerLengthSP < 18.25) {
									if (TitleLength < 12.25) {ints[1248] = 1;}
									else {ints[1249] = 1;}
								} else {
									if (CPerRatioSP < 0.29) {ints[1250] = 1;}
									else {ints[1251] = 1;}
								}
							}
						}
					} else {
						if (HKWSRatio < 0.62) {
							if (EpochSpan < 75630) {
								if (CNUMLengthSP < 24) {
									if (CTimRatioSP < 0.19) {ints[1252] = 1;}
									else {ints[1253] = 1;}
								} else {
									if (CWordSpan < 320) {ints[1254] = 1;}
									else {ints[1255] = 1;}
								}
							} else {
								if (CTimRatioSP < 0.38) {
									if (TitleDist < 63.5) {ints[1256] = 1;}
									else {ints[1257] = 1;}
								} else {
									if (CPerLengthSP < 18) {ints[1258] = 1;}
									else {ints[1259] = 1;}
								}
							}
						} else {
							if (EpochSpan < 215424) {
								if (ChannelRatio < 0.42) {
									if (COrgLengthNE < 22.75) {ints[1260] = 1;}
									else {ints[1261] = 1;}
								} else {
									if (TKWSLength < 6.25) {ints[1262] = 1;}
									else {ints[1263] = 1;}
								}
							} else {
								if (ParagraphSpan < 9) {
									if (ParagraphSpan < 6.5) {ints[1264] = 1;}
									else {ints[1265] = 1;}
								} else {ints[1266] = 1;}
							}
						}
					}
				}
			}
		} else {
			if (EpochSpan < 81039) {
				if (TitleRatio < 0.94) {
					if (CKWSRatio < 0.26) {
						if (CPerRatioNE < 0.3) {
							if (CKWSLength < 10.25) {
								if (TitleRatio < 0.72) {ints[1267] = 1;}
								else {ints[1268] = 1;}
							} else {
								if (TitleRatio < 0.31) {
									if (TTimLengthSP < 1.25) {ints[1269] = 1;}
									else {ints[1270] = 1;}
								} else {
									if (ChannelLength < 4.75) {ints[1271] = 1;}
									else {ints[1272] = 1;}
								}
							}
						} else {
							if (COrgRatioSP < 0.13) {
								if (TitleRatio < 0.19) {ints[1273] = 1;}
								else {ints[1274] = 1;}
							} else {
								if (CLocRatioSP < 0.11) {
									if (CWordSpan < 479) {ints[1275] = 1;}
									else {ints[1276] = 1;}
								} else {ints[1277] = 1;}
							}
						}
					} else {
						if (ChannelLength < 3.75) {
							if (CNUMLengthSP < 15.75) {
								if (SameSRC < 0.5) {
									if (TKWSLength < 1.25) {ints[1278] = 1;}
									else {ints[1279] = 1;}
								} else {
									if (GeoLength < 1.75) {ints[1280] = 1;}
									else {ints[1281] = 1;}
								}
							} else {
								if (CKWSRatio < 0.58) {
									if (InsertSpan < 5241) {ints[1282] = 1;}
									else {ints[1283] = 1;}
								} else {
									if (TitleRatio < 0.87) {ints[1284] = 1;}
									else {ints[1285] = 1;}
								}
							}
						} else {
							if (TKWSRatio < 0.54) {
								if (COrgRatioNE < 0.62) {
									if (CLocRatioSP < 0.29) {ints[1286] = 1;}
									else {ints[1287] = 1;}
								} else {
									if (EpochSpan < 69770) {ints[1288] = 1;}
									else {ints[1289] = 1;}
								}
							} else {
								if (CWordSpan < 1102) {
									if (CPerLengthSP < 19) {ints[1290] = 1;}
									else {ints[1291] = 1;}
								} else {
									if (TitleDist < 35.5) {ints[1292] = 1;}
									else {ints[1293] = 1;}
								}
							}
						}
					}
				} else {
					if (CatLength < 1.88) {
						if (COrgRatioSP < 1) {
							if (CLocLengthSP < 1.5) {
								if (CNUMRatioSP < 0.85) {ints[1294] = 1;}
								if (CNUMRatioSP >= 0.85) {
									if (SameSRC < 0.5) {ints[1295] = 1;}
									else {ints[1296] = 1;}
								}
							} else {
								if (COrgRatioNE < 1) {
									if (SimhashDist < 82) {ints[1297] = 1;}
									else {ints[1298] = 1;}
								} else {
									if (ChannelRatio < 0.69) {ints[1299] = 1;}
									else {ints[1300] = 1;}
								}
							}
						} else {
							if (TKWSLength < 1.5) {
								if (SimhashDist < 0.5) {
									if (InsertSpan < 60.5) {ints[1301] = 1;}
									else {ints[1302] = 1;}
								} else {ints[1303] = 1;}
							} else {ints[1304] = 1;}
						}
					} else {
						if (SimhashDist < 37.5) {ints[1305] = 1;}
						else {ints[1306] = 1;}
					}
				}
			} else {
				if (TKWSRatio < 0.55) {
					if (COrgRatioSP < 0.61) {
						if (CLocRatioSP < 0.35) {
							if (CPerLengthSP < 3.25) {
								if (CatLength < 0.8) {
									if (EpochSpan < 117093.5) {ints[1307] = 1;}
									else {ints[1308] = 1;}
								} else {
									if (CTimLengthSP < 1.75) {ints[1309] = 1;}
									else {ints[1310] = 1;}
								}
							} else {
								if (CTimRatioSP < 0.43) {ints[1311] = 1;}
								if (CTimRatioSP >= 0.43) {
									if (CTimRatioSP < 0.51) {ints[1312] = 1;}
									else {ints[1313] = 1;}
								}
							}
						} else {
							if (CKWSRatio < 0.31) {
								if (CLocLengthNE < 27.25) {
									if (SimhashDist < 66.5) {ints[1314] = 1;}
									else {ints[1315] = 1;}
								} else {
									if (SimhashDist < 72.5) {ints[1316] = 1;}
									else {ints[1317] = 1;}
								}
							} else {
								if (TKWSRatio < 0.31) {
									if (GeoLength < 0.75) {ints[1318] = 1;}
									else {ints[1319] = 1;}
								} else {
									if (TKWSLength < 3.75) {ints[1320] = 1;}
									else {ints[1321] = 1;}
								}
							}
						}
					} else {
						if (COrgLengthSP < 11.75) {
							if (CWordSpan < 31.5) {
								if (CNUMRatioSP < 0.87) {
									if (SimhashDist < 39) {ints[1322] = 1;}
									else {ints[1323] = 1;}
								} else {ints[1324] = 1;}
							} else {
								if (GeoLength < 0.75) {
									if (CTimLengthSP < 15.25) {ints[1325] = 1;}
									else {ints[1326] = 1;}
								} else {
									if (TKWSRatio < 0.39) {ints[1327] = 1;}
									else {ints[1328] = 1;}
								}
							}
						} else {
							if (TOrgLengthSP < 1.75) {
								if (COrgRatioSP < 0.77) {
									if (CKWSLength < 15.5) {ints[1329] = 1;}
									else {ints[1330] = 1;}
								} else {
									if (EpochSpan < 515550.5) {ints[1331] = 1;}
									else {ints[1332] = 1;}
								}
							} else {
								if (GeoRatio < 0.58) {
									if (TOrgRatioSP < 0.35) {ints[1333] = 1;}
									else {ints[1334] = 1;}
								} else {
									if (InsertSpan < 199988.5) {ints[1335] = 1;}
									else {ints[1336] = 1;}
								}
							}
						}
					}
				} else {
					if (CatRatio < 0.26) {
						if (EpochSpan < 5693971.5) {ints[1337] = 1;}
						if (EpochSpan >= 5693971.5) {
							if (CWordSpan < 404) {ints[1338] = 1;}
							else {ints[1339] = 1;}
						}
					} else {
						if (CKWSRatio < 0.49) {
							if (SameSRC < 0.5) {
								if (EpochSpan < 159855) {
									if (CLocRatioNE < 0.06) {ints[1340] = 1;}
									else {ints[1341] = 1;}
								} else {
									if (CNUMRatioSP < 0.2) {ints[1342] = 1;}
									else {ints[1343] = 1;}
								}
							} else {
								if (ChannelRatio < 0.54) {ints[1344] = 1;}
								if (ChannelRatio >= 0.54) {
									if (CKWSRatio < 0.43) {ints[1345] = 1;}
									else {ints[1346] = 1;}
								}
							}
						} else {
							if (CKWSLength < 15.25) {
								if (CKWSRatio < 0.56) {
									if (CatLength < 0.74) {ints[1347] = 1;}
									else {ints[1348] = 1;}
								} else {
									if (SimhashDist < 68.5) {ints[1349] = 1;}
									else {ints[1350] = 1;}
								}
							} else {
								if (COrgLengthSP < 25.75) {
									if (EpochSpan < 228210.5) {ints[1351] = 1;}
									else {ints[1352] = 1;}
								} else {ints[1353] = 1;}
							}
						}
					}
				}
			}
		}
	}
} else {
	if (CTimRatioSP < 0.88) {
		if (CKWSRatio < 0.37) {
			if (TKWSRatio < 0.5) {
				if (CTimRatioSP < 0.24) {
					if (ChannelRatio < 0.19) {
						if (CKWSRatio < 0.21) {
							if (EpochSpan < 94424) {
								if (CPerLengthNE < 38.75) {
									if (TitleRatio < 0.14) {ints[1354] = 1;}
									else {ints[1355] = 1;}
								} else {
									if (CLocLengthNE < 16.5) {ints[1356] = 1;}
									else {ints[1357] = 1;}
								}
							} else {ints[1358] = 1;}
						} else {
							if (TitleDist < 54.5) {
								if (EpochSpan < 61441) {
									if (TitleRatio < 0.49) {ints[1359] = 1;}
									else {ints[1360] = 1;}
								} else {
									if (CatRatio < 0.4) {ints[1361] = 1;}
									else {ints[1362] = 1;}
								}
							} else {
								if (CKWSRatio < 0.24) {
									if (TitleDist < 78) {ints[1363] = 1;}
									else {ints[1364] = 1;}
								} else {
									if (CWordSpan < 15) {ints[1365] = 1;}
									else {ints[1366] = 1;}
								}
							}
						}
					} else {
						if (CKWSRatio < 0.18) {
							if (CTimLengthSP < 10.75) {ints[1367] = 1;}
							if (CTimLengthSP >= 10.75) {
								if (CLocRatioNE < 0.18) {ints[1368] = 1;}
								else {ints[1369] = 1;}
							}
						} else {
							if (EpochSpan < 150895.5) {
								if (CWordSpan < 2040) {
									if (CTimLengthSP < 6.25) {ints[1370] = 1;}
									else {ints[1371] = 1;}
								} else {ints[1372] = 1;}
							} else {
								if (TitleRatio < 0.18) {ints[1373] = 1;}
								if (TitleRatio >= 0.18) {
									if (TitleRatio < 0.32) {ints[1374] = 1;}
									else {ints[1375] = 1;}
								}
							}
						}
					}
				} else {
					if (TitleRatio < 0.3) {
						if (EpochSpan < 226843.5) {
							if (CKWSRatio < 0.16) {
								if (HKWSLength < 0.75) {
									if (COrgLengthSP < 17.25) {ints[1376] = 1;}
									else {ints[1377] = 1;}
								} else {ints[1378] = 1;}
							} else {
								if (CPerRatioNE < 0.32) {
									if (TKWSRatio < 0.14) {ints[1379] = 1;}
									else {ints[1380] = 1;}
								} else {
									if (CLocRatioNE < 0.52) {ints[1381] = 1;}
									else {ints[1382] = 1;}
								}
							}
						} else {
							if (InsertSpan < 2992899) {
								if (CTimRatioSP < 0.29) {
									if (COrgLengthSP < 7.25) {ints[1383] = 1;}
									else {ints[1384] = 1;}
								} else {
									if (TitleDist < 53.5) {ints[1385] = 1;}
									else {ints[1386] = 1;}
								}
							} else {
								if (CTimRatioSP < 0.48) {ints[1387] = 1;}
								else {ints[1388] = 1;}
							}
						}
					} else {
						if (CTimRatioSP < 0.47) {
							if (CWordSpan < 522.5) {
								if (InsertSpan < 102086) {
									if (CatLength < 1.6) {ints[1389] = 1;}
									else {ints[1390] = 1;}
								} else {
									if (CatLength < 2.02) {ints[1391] = 1;}
									else {ints[1392] = 1;}
								}
							} else {
								if (CPerLengthSP < 9.75) {
									if (CNUMRatioSP < 0.29) {ints[1393] = 1;}
									else {ints[1394] = 1;}
								} else {
									if (CKWSRatio < 0.27) {ints[1395] = 1;}
									else {ints[1396] = 1;}
								}
							}
						} else {
							if (ParagraphSpan < 12.5) {
								if (InsertSpan < 257588) {
									if (CPerLengthNE < 17.5) {ints[1397] = 1;}
									else {ints[1398] = 1;}
								} else {
									if (InsertSpan < 991949) {ints[1399] = 1;}
									else {ints[1400] = 1;}
								}
							} else {
								if (COrgLengthNE < 20.75) {
									if (CNUMRatioSP < 0.68) {ints[1401] = 1;}
									else {ints[1402] = 1;}
								} else {
									if (SimhashDist < 52.5) {ints[1403] = 1;}
									else {ints[1404] = 1;}
								}
							}
						}
					}
				}
			} else {
				if (CNUMRatioSP < 0.42) {
					if (CPerRatioSP < 0.72) {
						if (CTimRatioSP < 0.34) {
							if (InsertSpan < 56413.5) {
								if (TitleDist < 48.5) {
									if (COrgRatioSP < 0.46) {ints[1405] = 1;}
									else {ints[1406] = 1;}
								} else {
									if (TitleRatio < 0.31) {ints[1407] = 1;}
									else {ints[1408] = 1;}
								}
							} else {
								if (EpochSpan < 530236.5) {
									if (CLocLengthSP < 3.25) {ints[1409] = 1;}
									else {ints[1410] = 1;}
								} else {
									if (SimhashDist < 50) {ints[1411] = 1;}
									else {ints[1412] = 1;}
								}
							}
						} else {
							if (InsertSpan < 319759) {
								if (SameSRC < 0.5) {
									if (CatRatio < 0.67) {ints[1413] = 1;}
									else {ints[1414] = 1;}
								} else {
									if (CPerRatioSP < 0.4) {ints[1415] = 1;}
									else {ints[1416] = 1;}
								}
							} else {
								if (CatRatio < 0.42) {
									if (ParagraphSpan < 13.5) {ints[1417] = 1;}
									else {ints[1418] = 1;}
								} else {ints[1419] = 1;}
							}
						}
					} else {
						if (InsertSpan < 274682.5) {
							if (CPerRatioNE < 0.92) {
								if (TitleRatio < 0.28) {
									if (COrgLengthNE < 8.5) {ints[1420] = 1;}
									else {ints[1421] = 1;}
								} else {
									if (CKWSRatio < 0.29) {ints[1422] = 1;}
									else {ints[1423] = 1;}
								}
							} else {
								if (CLocLengthNE < 2.75) {
									if (COrgRatioNE < 0.76) {ints[1424] = 1;}
									else {ints[1425] = 1;}
								} else {
									if (COrgLengthNE < 1.25) {ints[1426] = 1;}
									else {ints[1427] = 1;}
								}
							}
						} else {
							if (CNUMRatioSP < 0.22) {
								if (SimhashDist < 45.5) {ints[1428] = 1;}
								if (SimhashDist >= 45.5) {
									if (TitleLength < 6.75) {ints[1429] = 1;}
									else {ints[1430] = 1;}
								}
							} else {
								if (CKWSRatio < 0.33) {
									if (TitleLength < 10.25) {ints[1431] = 1;}
									else {ints[1432] = 1;}
								} else {ints[1433] = 1;}
							}
						}
					}
				} else {
					if (InsertSpan < 277557.5) {
						if (CPerLengthSP < 20.25) {
							if (TitleRatio < 0.39) {
								if (TKWSRatio < 0.7) {
									if (CNUMLengthSP < 2.75) {ints[1434] = 1;}
									else {ints[1435] = 1;}
								} else {
									if (TitleRatio < 0.17) {ints[1436] = 1;}
									else {ints[1437] = 1;}
								}
							} else {
								if (CTimLengthSP < 4.75) {
									if (CKWSRatio < 0.21) {ints[1438] = 1;}
									else {ints[1439] = 1;}
								} else {
									if (CTimLengthSP < 6.25) {ints[1440] = 1;}
									else {ints[1441] = 1;}
								}
							}
						} else {
							if (COrgLengthNE < 17.25) {
								if (TitleRatio < 0.29) {
									if (COrgLengthSP < 11.5) {ints[1442] = 1;}
									else {ints[1443] = 1;}
								} else {
									if (TPerLengthNE < 1.25) {ints[1444] = 1;}
									else {ints[1445] = 1;}
								}
							} else {
								if (CLocLengthNE < 3) {ints[1446] = 1;}
								if (CLocLengthNE >= 3) {
									if (COrgLengthNE < 26.75) {ints[1447] = 1;}
									else {ints[1448] = 1;}
								}
							}
						}
					} else {
						if (CPerRatioNE < 0.34) {
							if (TitleLength < 7.75) {ints[1449] = 1;}
							if (TitleLength >= 7.75) {
								if (COrgRatioNE < 0.74) {
									if (CTimRatioSP < 0.53) {ints[1450] = 1;}
									else {ints[1451] = 1;}
								} else {ints[1452] = 1;}
							}
						} else {
							if (CTimRatioSP < 0.33) {
								if (TitleRatio < 0.36) {
									if (CPerLengthNE < 22.75) {ints[1453] = 1;}
									else {ints[1454] = 1;}
								} else {ints[1455] = 1;}
							} else {
								if (ChannelRatio < 0.52) {
									if (InsertSpan < 1086264.5) {ints[1456] = 1;}
									else {ints[1457] = 1;}
								} else {
									if (EpochSpan < 785525.5) {ints[1458] = 1;}
									else {ints[1459] = 1;}
								}
							}
						}
					}
				}
			}
		} else {
			if (EpochSpan < 255750) {
				if (HKWSRatio < 0.68) {
					if (TitleRatio < 0.23) {
						if (CPerRatioNE < 0.58) {
							if (CatLength < 0.95) {
								if (CNUMLengthSP < 21) {
									if (CPerLengthSP < 18.25) {ints[1460] = 1;}
									else {ints[1461] = 1;}
								} else {
									if (CKWSLength < 19.75) {ints[1462] = 1;}
									else {ints[1463] = 1;}
								}
							} else {
								if (COrgLengthSP < 16.25) {
									if (CPerRatioNE < 0.27) {ints[1464] = 1;}
									else {ints[1465] = 1;}
								} else {
									if (CLocLengthNE < 10.75) {ints[1466] = 1;}
									else {ints[1467] = 1;}
								}
							}
						} else {
							if (ParagraphSpan < 37.5) {
								if (TitleDist < 75.5) {
									if (COrgRatioSP < 0.75) {ints[1468] = 1;}
									else {ints[1469] = 1;}
								} else {
									if (CWordSpan < 394.5) {ints[1470] = 1;}
									else {ints[1471] = 1;}
								}
							} else {
								if (COrgRatioNE < 0.92) {
									if (CatLength < 0.88) {ints[1472] = 1;}
									else {ints[1473] = 1;}
								} else {
									if (ParagraphSpan < 80.5) {ints[1474] = 1;}
									else {ints[1475] = 1;}
								}
							}
						}
					} else {
						if (TitleRatio < 0.42) {
							if (CPerLengthSP < 21.75) {
								if (COrgLengthSP < 34.75) {
									if (InsertSpan < 81456.5) {ints[1476] = 1;}
									else {ints[1477] = 1;}
								} else {ints[1478] = 1;}
							} else {
								if (ParagraphSpan < 29) {
									if (TKWSLength < 3.75) {ints[1479] = 1;}
									else {ints[1480] = 1;}
								} else {
									if (EpochSpan < 47002.5) {ints[1481] = 1;}
									else {ints[1482] = 1;}
								}
							}
						} else {
							if (SameSRC < 0.5) {
								if (SimhashDist < 41.5) {
									if (TitleLength < 13.75) {ints[1483] = 1;}
									else {ints[1484] = 1;}
								} else {
									if (CNUMLengthSP < 9.75) {ints[1485] = 1;}
									else {ints[1486] = 1;}
								}
							} else {
								if (EpochSpan < 72016) {
									if (GeoRatio < 0.83) {ints[1487] = 1;}
									else {ints[1488] = 1;}
								} else {
									if (CLocLengthNE < 8.75) {ints[1489] = 1;}
									else {ints[1490] = 1;}
								}
							}
						}
					}
				} else {
					if (EpochSpan < 73180.5) {
						if (TitleRatio < 0.38) {
							if (CPerRatioSP < 0.7) {
								if (ChannelRatio < 0.37) {
									if (CPerRatioNE < 0.66) {ints[1491] = 1;}
									else {ints[1492] = 1;}
								} else {
									if (CKWSLength < 12.25) {ints[1493] = 1;}
									else {ints[1494] = 1;}
								}
							} else {
								if (CLocRatioNE < 0.41) {
									if (HKWSLength < 4) {ints[1495] = 1;}
									else {ints[1496] = 1;}
								} else {
									if (CLocRatioNE < 0.47) {ints[1497] = 1;}
									else {ints[1498] = 1;}
								}
							}
						} else {
							if (CWordSpan < 37.5) {
								if (ChannelLength < 1.25) {
									if (EpochSpan < 119) {ints[1499] = 1;}
									else {ints[1500] = 1;}
								} else {
									if (TKWSRatio < 0.88) {ints[1501] = 1;}
									else {ints[1502] = 1;}
								}
							} else {
								if (SimhashDist < 51.5) {
									if (ChannelRatio < 0.59) {ints[1503] = 1;}
									else {ints[1504] = 1;}
								} else {
									if (CLocRatioNE < 0.63) {ints[1505] = 1;}
									else {ints[1506] = 1;}
								}
							}
						}
					} else {
						if (CLocRatioSP < 0.02) {
							if (CNUMLengthSP < 7.25) {
								if (HKWSLength < 3.25) {
									if (ParagraphSpan < 0.5) {ints[1507] = 1;}
									else {ints[1508] = 1;}
								} else {
									if (CatLength < 0.88) {ints[1509] = 1;}
									else {ints[1510] = 1;}
								}
							} else {
								if (EpochSpan < 136736.5) {
									if (COrgRatioNE < 0.32) {ints[1511] = 1;}
									else {ints[1512] = 1;}
								} else {
									if (CPerLengthSP < 9) {ints[1513] = 1;}
									else {ints[1514] = 1;}
								}
							}
						} else {
							if (CKWSRatio < 0.43) {
								if (TitleRatio < 0.33) {
									if (CWordSpan < 416) {ints[1515] = 1;}
									else {ints[1516] = 1;}
								} else {
									if (CKWSLength < 19.25) {ints[1517] = 1;}
									else {ints[1518] = 1;}
								}
							} else {
								if (CPerRatioNE < 0.97) {
									if (ChannelLength < 2.75) {ints[1519] = 1;}
									else {ints[1520] = 1;}
								} else {
									if (CatLength < 1.49) {ints[1521] = 1;}
									else {ints[1522] = 1;}
								}
							}
						}
					}
				}
			} else {
				if (CPerRatioNE < 0.59) {
					if (COrgRatioSP < 0.59) {
						if (CatRatio < 0.58) {ints[1523] = 1;}
						if (CatRatio >= 0.58) {
							if (TitleRatio < 0.38) {
								if (InsertSpan < 530440) {
									if (InsertSpan < 408621.5) {ints[1524] = 1;}
									else {ints[1525] = 1;}
								} else {
									if (CLocLengthNE < 3.75) {ints[1526] = 1;}
									else {ints[1527] = 1;}
								}
							} else {
								if (CPerRatioSP < 0.53) {
									if (CPerRatioNE < 0.28) {ints[1528] = 1;}
									else {ints[1529] = 1;}
								} else {
									if (CatRatio < 0.71) {ints[1530] = 1;}
									else {ints[1531] = 1;}
								}
							}
						}
					} else {
						if (InsertSpan < 219858.5) {
							if (SimhashDist < 69.5) {
								if (CKWSRatio < 0.47) {ints[1532] = 1;}
								if (CKWSRatio >= 0.47) {
									if (CWordSpan < 39) {ints[1533] = 1;}
									else {ints[1534] = 1;}
								}
							} else {
								if (CWordSpan < 15.5) {ints[1535] = 1;}
								else {ints[1536] = 1;}
							}
						} else {
							if (CNUMRatioSP < 0.62) {
								if (CLocLengthNE < 3.25) {
									if (CKWSRatio < 0.68) {ints[1537] = 1;}
									else {ints[1538] = 1;}
								} else {
									if (CatLength < 1.15) {ints[1539] = 1;}
									else {ints[1540] = 1;}
								}
							} else {
								if (TitleDist < 26) {
									if (CKWSLength < 5.5) {ints[1541] = 1;}
									else {ints[1542] = 1;}
								} else {
									if (TitleRatio < 0.34) {ints[1543] = 1;}
									else {ints[1544] = 1;}
								}
							}
						}
					}
				} else {
					if (TitleRatio < 0.31) {
						if (CNUMRatioSP < 0.31) {
							if (CPerLengthSP < 20.25) {
								if (ChannelRatio < 0.45) {
									if (CNUMRatioSP < 0.24) {ints[1545] = 1;}
									else {ints[1546] = 1;}
								} else {
									if (InsertSpan < 1253537.5) {ints[1547] = 1;}
									else {ints[1548] = 1;}
								}
							} else {
								if (ParagraphSpan < 4.5) {
									if (CatLength < 0.7) {ints[1549] = 1;}
									else {ints[1550] = 1;}
								} else {
									if (CKWSRatio < 0.46) {ints[1551] = 1;}
									else {ints[1552] = 1;}
								}
							}
						} else {
							if (CLocRatioSP < 0.58) {
								if (CPerRatioNE < 0.61) {
									if (CKWSRatio < 0.45) {ints[1553] = 1;}
									else {ints[1554] = 1;}
								} else {
									if (ParagraphSpan < 0.5) {ints[1555] = 1;}
									else {ints[1556] = 1;}
								}
							} else {
								if (COrgLengthNE < 12.75) {
									if (CatLength < 1.63) {ints[1557] = 1;}
									else {ints[1558] = 1;}
								} else {
									if (ChannelLength < 2.75) {ints[1559] = 1;}
									else {ints[1560] = 1;}
								}
							}
						}
					} else {
						if (TitleDist < 14.5) {
							if (InsertSpan < 107305.5) {
								if (InsertSpan < 10319) {ints[1561] = 1;}
								else {ints[1562] = 1;}
							} else {
								if (CTimRatioSP < 0.8) {
									if (TKWSRatio < 1) {ints[1563] = 1;}
									else {ints[1564] = 1;}
								} else {
									if (CTimLengthSP < 16.75) {ints[1565] = 1;}
									else {ints[1566] = 1;}
								}
							}
						} else {
							if (CPerRatioSP < 0.46) {
								if (CTimLengthSP < 2.75) {ints[1567] = 1;}
								if (CTimLengthSP >= 2.75) {
									if (COrgLengthSP < 2) {ints[1568] = 1;}
									else {ints[1569] = 1;}
								}
							} else {
								if (TitleLength < 15.25) {
									if (EpochSpan < 740838.5) {ints[1570] = 1;}
									else {ints[1571] = 1;}
								} else {ints[1572] = 1;}
							}
						}
					}
				}
			}
		}
	} else {
		if (TitleDist < 0.5) {
			if (EpochSpan < 604980) {
				if (CPerLengthNE < 8.25) {
					if (TitleLength < 17.5) {
						if (TOrgLengthNE < 0.75) {
							if (CLocRatioNE < 0.8) {
								if (TKWSLength < 6.75) {ints[1573] = 1;}
								if (TKWSLength >= 6.75) {
									if (SameSRC < 0.5) {ints[1574] = 1;}
									else {ints[1575] = 1;}
								}
							} else {
								if (GeoLength < 2.75) {
									if (SameSRC < 0.5) {ints[1576] = 1;}
									else {ints[1577] = 1;}
								} else {ints[1578] = 1;}
							}
						} else {
							if (InsertSpan < 18645) {
								if (TitleLength < 3.5) {
									if (CPerLengthSP < 7) {ints[1579] = 1;}
									else {ints[1580] = 1;}
								} else {
									if (CKWSLength < 7.5) {ints[1581] = 1;}
									else {ints[1582] = 1;}
								}
							} else {
								if (GeoLength < 2.75) {
									if (CTimLengthSP < 1.75) {ints[1583] = 1;}
									else {ints[1584] = 1;}
								} else {
									if (CPerLengthNE < 5.75) {ints[1585] = 1;}
									else {ints[1586] = 1;}
								}
							}
						}
					} else {
						if (CPerLengthSP < 2.5) {
							if (SameSRC < 0.5) {ints[1587] = 1;}
							else {ints[1588] = 1;}
						} else {ints[1589] = 1;}
					}
				} else {
					if (CKWSLength < 10.5) {
						if (SimhashDist < 33.5) {
							if (CTimLengthSP < 2.5) {
								if (COrgRatioSP < 1) {ints[1590] = 1;}
								if (COrgRatioSP >= 1) {
									if (CKWSLength < 2) {ints[1591] = 1;}
									else {ints[1592] = 1;}
								}
							} else {
								if (CatLength < 0.71) {ints[1593] = 1;}
								else {ints[1594] = 1;}
							}
						} else {ints[1595] = 1;}
					} else {
						if (CLocLengthNE < 47.5) {ints[1596] = 1;}
						if (CLocLengthNE >= 47.5) {
							if (CLocLengthNE < 48.25) {
								if (InsertSpan < 322.5) {
									if (TKWSLength < 2.5) {ints[1597] = 1;}
									else {ints[1598] = 1;}
								} else {ints[1599] = 1;}
							} else {ints[1600] = 1;}
						}
					}
				}
			} else {
				if (TKWSLength < 1.5) {
					if (CLocLengthNE < 2.5) {ints[1601] = 1;}
					else {ints[1602] = 1;}
				} else {
					if (CLocLengthNE < 4) {ints[1603] = 1;}
					else {ints[1604] = 1;}
				}
			}
		} else {
			if (CPerLengthNE < 2.25) {
				if (TitleLength < 7.25) {
					if (ParagraphSpan < 0.5) {
						if (CTimLengthSP < 5.5) {
							if (CKWSRatio < 0.84) {ints[1605] = 1;}
							if (CKWSRatio >= 0.84) {
								if (SimhashDist < 41.5) {
									if (InsertSpan < 520792.5) {ints[1606] = 1;}
									else {ints[1607] = 1;}
								} else {ints[1608] = 1;}
							}
						} else {
							if (TitleLength < 3.25) {ints[1609] = 1;}
							if (TitleLength >= 3.25) {
								if (COrgLengthNE < 1.25) {ints[1610] = 1;}
								if (COrgLengthNE >= 1.25) {
									if (CLocRatioSP < 0.94) {ints[1611] = 1;}
									else {ints[1612] = 1;}
								}
							}
						}
					} else {
						if (CPerRatioSP < 1) {
							if (TitleRatio < 0.76) {
								if (SimhashDist < 39) {ints[1613] = 1;}
								if (SimhashDist >= 39) {
									if (CWordSpan < 224) {ints[1614] = 1;}
									else {ints[1615] = 1;}
								}
							} else {ints[1616] = 1;}
						} else {
							if (SimhashDist < 62.5) {
								if (TitleDist < 8.5) {ints[1617] = 1;}
								if (TitleDist >= 8.5) {
									if (TitleRatio < 0.15) {ints[1618] = 1;}
									else {ints[1619] = 1;}
								}
							} else {
								if (SimhashDist < 79) {ints[1620] = 1;}
								else {ints[1621] = 1;}
							}
						}
					}
				} else {
					if (GeoLength < 0.75) {
						if (CLocLengthSP < 1.25) {
							if (COrgLengthSP < 5.5) {
								if (CKWSLength < 16.5) {ints[1622] = 1;}
								else {ints[1623] = 1;}
							} else {ints[1624] = 1;}
						} else {
							if (EpochSpan < 167887.5) {
								if (TitleRatio < 0.2) {ints[1625] = 1;}
								if (TitleRatio >= 0.2) {
									if (CLocLengthSP < 24.25) {ints[1626] = 1;}
									else {ints[1627] = 1;}
								}
							} else {ints[1628] = 1;}
						}
					} else {
						if (CLocRatioNE < 0.54) {
							if (CPerRatioSP < 0.74) {
								if (CKWSRatio < 0.63) {
									if (COrgRatioSP < 0.38) {ints[1629] = 1;}
									else {ints[1630] = 1;}
								} else {ints[1631] = 1;}
							} else {
								if (ParagraphSpan < 4.5) {
									if (HKWSRatio < 0.54) {ints[1632] = 1;}
									else {ints[1633] = 1;}
								} else {
									if (TKWSLength < 6.5) {ints[1634] = 1;}
									else {ints[1635] = 1;}
								}
							}
						} else {
							if (TKWSLength < 9) {
								if (CKWSRatio < 0.81) {
									if (TKWSLength < 2.75) {ints[1636] = 1;}
									else {ints[1637] = 1;}
								} else {
									if (SameSRC < 0.5) {ints[1638] = 1;}
									else {ints[1639] = 1;}
								}
							} else {ints[1640] = 1;}
						}
					}
				}
			} else {
				if (SameSRC < 0.5) {
					if (CLocRatioSP < 0.46) {
						if (TitleRatio < 0.85) {
							if (CNUMRatioSP < 0.11) {
								if (CPerLengthSP < 2.25) {ints[1641] = 1;}
								if (CPerLengthSP >= 2.25) {
									if (CKWSRatio < 0.38) {ints[1642] = 1;}
									else {ints[1643] = 1;}
								}
							} else {
								if (SimhashDist < 30.5) {
									if (CLocRatioNE < 0.19) {ints[1644] = 1;}
									else {ints[1645] = 1;}
								} else {
									if (CKWSRatio < 0.56) {ints[1646] = 1;}
									else {ints[1647] = 1;}
								}
							}
						} else {ints[1648] = 1;}
					} else {
						if (COrgLengthNE < 80) {
							if (CWordSpan < 6.5) {
								if (GeoRatio < 0.17) {
									if (COrgLengthNE < 3.25) {ints[1649] = 1;}
									else {ints[1650] = 1;}
								} else {
									if (TitleDist < 119) {ints[1651] = 1;}
									else {ints[1652] = 1;}
								}
							} else {
								if (TitleDist < 34.5) {
									if (CLocLengthNE < 6.75) {ints[1653] = 1;}
									else {ints[1654] = 1;}
								} else {
									if (CLocLengthNE < 10.75) {ints[1655] = 1;}
									else {ints[1656] = 1;}
								}
							}
						} else {
							if (CLocLengthNE < 66) {ints[1657] = 1;}
							if (CLocLengthNE >= 66) {
								if (CKWSRatio < 0.62) {ints[1658] = 1;}
								else {ints[1659] = 1;}
							}
						}
					}
				} else {
					if (HKWSRatio < 0.96) {
						if (CLocLengthSP < 11.25) {
							if (EpochSpan < 86539.5) {
								if (ChannelRatio < 0.77) {
									if (TitleRatio < 0.41) {ints[1660] = 1;}
									else {ints[1661] = 1;}
								} else {ints[1662] = 1;}
							} else {
								if (GeoLength < 1.75) {ints[1663] = 1;}
								else {ints[1664] = 1;}
							}
						} else {
							if (TitleDist < 50.5) {
								if (CLocLengthNE < 2.5) {ints[1665] = 1;}
								if (CLocLengthNE >= 2.5) {
									if (TLocRatioSP < 0.92) {ints[1666] = 1;}
									else {ints[1667] = 1;}
								}
							} else {
								if (COrgRatioNE < 1) {ints[1668] = 1;}
								else {ints[1669] = 1;}
							}
						}
					} else {
						if (TitleLength < 6.25) {
							if (EpochSpan < 21200.5) {ints[1670] = 1;}
							else {ints[1671] = 1;}
						} else {
							if (COrgLengthSP < 2.75) {
								if (ChannelRatio < 0.89) {ints[1672] = 1;}
								else {ints[1673] = 1;}
							} else {
								if (CLocRatioNE < 0.94) {
									if (CLocLengthNE < 6.75) {ints[1674] = 1;}
									else {ints[1675] = 1;}
								} else {
									if (CTimRatioSP < 0.9) {ints[1676] = 1;}
									else {ints[1677] = 1;}
								}
							}
						}
					}
				}
			}
		}
	}
}
if (CKWSRatio < 0.29) {
	if (TKWSRatio < 0.36) {
		if (CatRatio < 0.5) {
			if (CKWSRatio < 0.13) {
				if (COrgRatioNE < 0.12) {
					if (CPerLengthSP < 33.75) {
						if (CTimLengthSP < 4.25) {
							if (HKWSLength < 0.75) {
								if (CTimRatioSP < 0.27) {
									if (CLocLengthSP < 4.25) {ints[2048] = 1;}
									else {ints[2049] = 1;}
								} else {
									if (ParagraphSpan < 9) {ints[2050] = 1;}
									else {ints[2051] = 1;}
								}
							} else {ints[2052] = 1;}
						} else {
							if (CPerRatioNE < 0.23) {ints[2053] = 1;}
							if (CPerRatioNE >= 0.23) {
								if (SameSRC < 0.5) {ints[2054] = 1;}
								if (SameSRC >= 0.5) {
									if (CPerRatioSP < 0.28) {ints[2055] = 1;}
									else {ints[2056] = 1;}
								}
							}
						}
					} else {
						if (CatLength < 1.17) {ints[2057] = 1;}
						if (CatLength >= 1.17) {
							if (CatLength < 1.18) {ints[2058] = 1;}
							else {ints[2059] = 1;}
						}
					}
				} else {
					if (CTimLengthSP < 22.75) {
						if (COrgLengthNE < 26.25) {
							if (CLocLengthNE < 25) {ints[2060] = 1;}
							if (CLocLengthNE >= 25) {
								if (TitleLength < 6.75) {
									if (CKWSLength < 14.25) {ints[2061] = 1;}
									else {ints[2062] = 1;}
								} else {ints[2063] = 1;}
							}
						} else {
							if (TitleDist < 36.5) {
								if (COrgRatioSP < 0.05) {ints[2064] = 1;}
								else {ints[2065] = 1;}
							} else {ints[2066] = 1;}
						}
					} else {
						if (SimhashDist < 73) {ints[2067] = 1;}
						else {ints[2068] = 1;}
					}
				}
			} else {
				if (TitleRatio < 0.11) {
					if (CLocLengthSP < 17.75) {
						if (COrgRatioSP < 0.38) {
							if (CKWSRatio < 0.23) {ints[2069] = 1;}
							if (CKWSRatio >= 0.23) {
								if (COrgRatioNE < 0.16) {ints[2070] = 1;}
								if (COrgRatioNE >= 0.16) {
									if (CPerLengthSP < 6.25) {ints[2071] = 1;}
									else {ints[2072] = 1;}
								}
							}
						} else {
							if (COrgLengthSP < 23.25) {
								if (TKWSLength < 7) {ints[2073] = 1;}
								else {ints[2074] = 1;}
							} else {
								if (TOrgRatioSP < 0.19) {
									if (TKWSRatio < 0.32) {ints[2075] = 1;}
									else {ints[2076] = 1;}
								} else {ints[2077] = 1;}
							}
						}
					} else {
						if (CatLength < 1.58) {
							if (EpochSpan < 136407.5) {
								if (ChannelLength < 4.75) {
									if (COrgRatioNE < 0.13) {ints[2078] = 1;}
									else {ints[2079] = 1;}
								} else {
									if (COrgRatioNE < 0.62) {ints[2080] = 1;}
									else {ints[2081] = 1;}
								}
							} else {ints[2082] = 1;}
						} else {ints[2083] = 1;}
					}
				} else {
					if (CNUMLengthSP < 13.25) {
						if (CPerRatioSP < 0.36) {
							if (CTimRatioSP < 0.23) {
								if (TitleRatio < 0.11) {
									if (COrgLengthNE < 1.5) {ints[2084] = 1;}
									else {ints[2085] = 1;}
								} else {ints[2086] = 1;}
							} else {
								if (TKWSLength < 3.75) {ints[2087] = 1;}
								if (TKWSLength >= 3.75) {
									if (TitleRatio < 0.21) {ints[2088] = 1;}
									else {ints[2089] = 1;}
								}
							}
						} else {
							if (COrgLengthNE < 1) {
								if (ParagraphSpan < 4.5) {ints[2090] = 1;}
								else {ints[2091] = 1;}
							} else {
								if (InsertSpan < 92465) {
									if (CNUMLengthSP < 6.25) {ints[2092] = 1;}
									else {ints[2093] = 1;}
								} else {ints[2094] = 1;}
							}
						}
					} else {
						if (GeoLength < 0.75) {
							if (CPerLengthNE < 12.25) {
								if (COrgLengthNE < 33) {
									if (SimhashDist < 48.5) {ints[2095] = 1;}
									else {ints[2096] = 1;}
								} else {ints[2097] = 1;}
							} else {
								if (InsertSpan < 88121) {ints[2098] = 1;}
								else {ints[2099] = 1;}
							}
						} else {
							if (COrgLengthNE < 33) {
								if (TKWSRatio < 0.35) {
									if (CKWSRatio < 0.26) {ints[2100] = 1;}
									else {ints[2101] = 1;}
								} else {ints[2102] = 1;}
							} else {ints[2103] = 1;}
						}
					}
				}
			}
		} else {
			if (EpochSpan < 93517) {
				if (TitleRatio < 0.1) {
					if (CPerRatioNE < 0.35) {
						if (CLocLengthNE < 77.25) {
							if (COrgRatioSP < 0.22) {
								if (COrgLengthSP < 33) {
									if (CKWSLength < 10.25) {ints[2104] = 1;}
									else {ints[2105] = 1;}
								} else {
									if (CKWSRatio < 0.05) {ints[2106] = 1;}
									else {ints[2107] = 1;}
								}
							} else {
								if (CKWSRatio < 0.25) {
									if (CLocRatioSP < 0.77) {ints[2108] = 1;}
									else {ints[2109] = 1;}
								} else {
									if (CatRatio < 0.73) {ints[2110] = 1;}
									else {ints[2111] = 1;}
								}
							}
						} else {
							if (CWordSpan < 1504) {ints[2112] = 1;}
							else {ints[2113] = 1;}
						}
					} else {
						if (TitleDist < 38) {
							if (CatLength < 0.87) {ints[2114] = 1;}
							else {ints[2115] = 1;}
						} else {
							if (CLocLengthNE < 4.75) {
								if (CLocRatioNE < 0.59) {
									if (CPerLengthSP < 0.75) {ints[2116] = 1;}
									else {ints[2117] = 1;}
								} else {
									if (CNUMRatioSP < 0.04) {ints[2118] = 1;}
									else {ints[2119] = 1;}
								}
							} else {
								if (CatLength < 1.33) {
									if (CPerLengthSP < 9.25) {ints[2120] = 1;}
									else {ints[2121] = 1;}
								} else {
									if (TitleDist < 49) {ints[2122] = 1;}
									else {ints[2123] = 1;}
								}
							}
						}
					}
				} else {
					if (SimhashDist < 64.5) {
						if (HKWSRatio < 0.58) {
							if (COrgRatioNE < 0.66) {
								if (InsertSpan < 29040.5) {
									if (InsertSpan < 4774.5) {ints[2124] = 1;}
									else {ints[2125] = 1;}
								} else {
									if (COrgLengthNE < 1.75) {ints[2126] = 1;}
									else {ints[2127] = 1;}
								}
							} else {
								if (CTimRatioSP < 0.45) {
									if (TitleDist < 64.5) {ints[2128] = 1;}
									else {ints[2129] = 1;}
								} else {
									if (TitleLength < 14.5) {ints[2130] = 1;}
									else {ints[2131] = 1;}
								}
							}
						} else {
							if (COrgRatioSP < 0.45) {
								if (TitleRatio < 0.2) {
									if (CLocLengthSP < 20) {ints[2132] = 1;}
									else {ints[2133] = 1;}
								} else {
									if (CatLength < 0.78) {ints[2134] = 1;}
									else {ints[2135] = 1;}
								}
							} else {
								if (TPerLengthNE < 1.25) {
									if (COrgRatioNE < 0.5) {ints[2136] = 1;}
									else {ints[2137] = 1;}
								} else {
									if (COrgLengthSP < 8.25) {ints[2138] = 1;}
									else {ints[2139] = 1;}
								}
							}
						}
					} else {
						if (CTimRatioSP < 0.27) {
							if (CKWSRatio < 0.22) {
								if (CLocLengthNE < 1.25) {
									if (CatLength < 0.77) {ints[2140] = 1;}
									else {ints[2141] = 1;}
								} else {
									if (CWordSpan < 512) {ints[2142] = 1;}
									else {ints[2143] = 1;}
								}
							} else {
								if (CKWSRatio < 0.22) {ints[2144] = 1;}
								if (CKWSRatio >= 0.22) {
									if (CTimLengthSP < 3.75) {ints[2145] = 1;}
									else {ints[2146] = 1;}
								}
							}
						} else {
							if (COrgRatioNE < 0.39) {
								if (CKWSLength < 16.75) {
									if (COrgRatioSP < 0.16) {ints[2147] = 1;}
									else {ints[2148] = 1;}
								} else {
									if (CLocLengthSP < 3.25) {ints[2149] = 1;}
									else {ints[2150] = 1;}
								}
							} else {
								if (TitleLength < 9.25) {
									if (CLocRatioNE < 0.49) {ints[2151] = 1;}
									else {ints[2152] = 1;}
								} else {
									if (COrgRatioNE < 0.55) {ints[2153] = 1;}
									else {ints[2154] = 1;}
								}
							}
						}
					}
				}
			} else {
				if (CPerRatioSP < 0.62) {
					if (TitleRatio < 0.42) {
						if (SimhashDist < 85.5) {
							if (TitleLength < 5.25) {
								if (CKWSLength < 12.25) {ints[2155] = 1;}
								if (CKWSLength >= 12.25) {
									if (CatLength < 1.33) {ints[2156] = 1;}
									else {ints[2157] = 1;}
								}
							} else {
								if (HKWSRatio < 0.9) {
									if (CTimLengthSP < 33.25) {ints[2158] = 1;}
									else {ints[2159] = 1;}
								} else {
									if (GeoLength < 1.75) {ints[2160] = 1;}
									else {ints[2161] = 1;}
								}
							}
						} else {
							if (CKWSRatio < 0.2) {ints[2162] = 1;}
							if (CKWSRatio >= 0.2) {
								if (CPerRatioNE < 0.03) {ints[2163] = 1;}
								if (CPerRatioNE >= 0.03) {
									if (SimhashDist < 92.5) {ints[2164] = 1;}
									else {ints[2165] = 1;}
								}
							}
						}
					} else {
						if (CKWSLength < 10.25) {ints[2166] = 1;}
						if (CKWSLength >= 10.25) {
							if (InsertSpan < 157198.5) {
								if (CLocLengthSP < 7) {
									if (TitleRatio < 0.46) {ints[2167] = 1;}
									else {ints[2168] = 1;}
								} else {
									if (CLocRatioNE < 0.12) {ints[2169] = 1;}
									else {ints[2170] = 1;}
								}
							} else {
								if (CPerRatioSP < 0.35) {ints[2171] = 1;}
								if (CPerRatioSP >= 0.35) {
									if (CWordSpan < 303.5) {ints[2172] = 1;}
									else {ints[2173] = 1;}
								}
							}
						}
					}
				} else {
					if (CLocRatioSP < 0.65) {
						if (CWordSpan < 61) {ints[2174] = 1;}
						else {ints[2175] = 1;}
					} else {
						if (CWordSpan < 539.5) {
							if (CLocLengthSP < 23.5) {ints[2176] = 1;}
							else {ints[2177] = 1;}
						} else {
							if (TitleRatio < 0.34) {ints[2178] = 1;}
							else {ints[2179] = 1;}
						}
					}
				}
			}
		}
	} else {
		if (TitleRatio < 0.31) {
			if (CTimRatioSP < 0.32) {
				if (COrgRatioSP < 0.18) {
					if (InsertSpan < 7) {
						if (TitleDist < 65.5) {ints[2180] = 1;}
						else {ints[2181] = 1;}
					} else {
						if (SimhashDist < 80.5) {
							if (CLocLengthNE < 0.75) {ints[2182] = 1;}
							if (CLocLengthNE >= 0.75) {
								if (CatLength < 1.03) {
									if (TitleLength < 10.25) {ints[2183] = 1;}
									else {ints[2184] = 1;}
								} else {ints[2185] = 1;}
							}
						} else {ints[2186] = 1;}
					}
				} else {
					if (EpochSpan < 61451) {
						if (TitleRatio < 0.11) {ints[2187] = 1;}
						if (TitleRatio >= 0.11) {
							if (CLocLengthSP < 16.75) {
								if (TKWSLength < 2.75) {
									if (COrgLengthNE < 7.75) {ints[2188] = 1;}
									else {ints[2189] = 1;}
								} else {
									if (CLocLengthSP < 1.25) {ints[2190] = 1;}
									else {ints[2191] = 1;}
								}
							} else {
								if (CKWSRatio < 0.19) {ints[2192] = 1;}
								if (CKWSRatio >= 0.19) {
									if (CKWSLength < 13) {ints[2193] = 1;}
									else {ints[2194] = 1;}
								}
							}
						}
					} else {
						if (CatRatio < 0.47) {ints[2195] = 1;}
						if (CatRatio >= 0.47) {
							if (CPerLengthNE < 8.25) {
								if (TitleRatio < 0.13) {ints[2196] = 1;}
								if (TitleRatio >= 0.13) {
									if (TKWSLength < 1.25) {ints[2197] = 1;}
									else {ints[2198] = 1;}
								}
							} else {
								if (InsertSpan < 215176) {
									if (CTimLengthSP < 7) {ints[2199] = 1;}
									else {ints[2200] = 1;}
								} else {
									if (COrgRatioNE < 0.59) {ints[2201] = 1;}
									else {ints[2202] = 1;}
								}
							}
						}
					}
				}
			} else {
				if (COrgRatioSP < 0.54) {
					if (CLocLengthSP < 14.25) {
						if (TKWSRatio < 0.38) {
							if (CKWSRatio < 0.21) {ints[2203] = 1;}
							if (CKWSRatio >= 0.21) {
								if (TKWSRatio < 0.36) {ints[2204] = 1;}
								if (TKWSRatio >= 0.36) {
									if (TitleDist < 75.5) {ints[2205] = 1;}
									else {ints[2206] = 1;}
								}
							}
						} else {
							if (CLocRatioSP < 0.84) {
								if (CTimRatioSP < 0.66) {
									if (CTimRatioSP < 0.39) {ints[2207] = 1;}
									else {ints[2208] = 1;}
								} else {
									if (CTimRatioSP < 0.7) {ints[2209] = 1;}
									else {ints[2210] = 1;}
								}
							} else {
								if (TKWSLength < 2.25) {ints[2211] = 1;}
								if (TKWSLength >= 2.25) {
									if (COrgLengthSP < 7.75) {ints[2212] = 1;}
									else {ints[2213] = 1;}
								}
							}
						}
					} else {
						if (CLocLengthSP < 17.5) {
							if (CKWSLength < 17.75) {ints[2214] = 1;}
							if (CKWSLength >= 17.75) {
								if (ChannelRatio < 0.58) {
									if (COrgRatioSP < 0.33) {ints[2215] = 1;}
									else {ints[2216] = 1;}
								} else {ints[2217] = 1;}
							}
						} else {
							if (CPerRatioSP < 0.21) {ints[2218] = 1;}
							if (CPerRatioSP >= 0.21) {
								if (CNUMRatioSP < 0.26) {ints[2219] = 1;}
								if (CNUMRatioSP >= 0.26) {
									if (ParagraphSpan < 6.5) {ints[2220] = 1;}
									else {ints[2221] = 1;}
								}
							}
						}
					}
				} else {
					if (COrgLengthNE < 18.25) {
						if (CPerLengthNE < 31.5) {
							if (CLocRatioNE < 0.66) {
								if (CKWSRatio < 0.26) {
									if (ChannelRatio < 0.62) {ints[2222] = 1;}
									else {ints[2223] = 1;}
								} else {ints[2224] = 1;}
							} else {
								if (CPerRatioNE < 0.12) {
									if (CWordSpan < 79) {ints[2225] = 1;}
									else {ints[2226] = 1;}
								} else {ints[2227] = 1;}
							}
						} else {
							if (CNUMLengthSP < 8.25) {ints[2228] = 1;}
							else {ints[2229] = 1;}
						}
					} else {ints[2230] = 1;}
				}
			}
		} else {
			if (InsertSpan < 324777.5) {
				if (CPerRatioSP < 0.27) {
					if (InsertSpan < 21568) {
						if (CNUMLengthSP < 6.25) {
							if (CWordSpan < 254) {
								if (EpochSpan < 1459) {
									if (CKWSRatio < 0.17) {ints[2231] = 1;}
									else {ints[2232] = 1;}
								} else {
									if (COrgLengthNE < 11) {ints[2233] = 1;}
									else {ints[2234] = 1;}
								}
							} else {
								if (CNUMLengthSP < 2.25) {ints[2235] = 1;}
								if (CNUMLengthSP >= 2.25) {
									if (TOrgRatioSP < 0.73) {ints[2236] = 1;}
									else {ints[2237] = 1;}
								}
							}
						} else {
							if (EpochSpan < 9375.5) {
								if (ChannelRatio < 0.22) {
									if (TitleDist < 15) {ints[2238] = 1;}
									else {ints[2239] = 1;}
								} else {
									if (TKWSRatio < 0.85) {ints[2240] = 1;}
									else {ints[2241] = 1;}
								}
							} else {
								if (CKWSRatio < 0.26) {
									if (CNUMRatioSP < 0.6) {ints[2242] = 1;}
									else {ints[2243] = 1;}
								} else {
									if (CLocLengthNE < 2.75) {ints[2244] = 1;}
									else {ints[2245] = 1;}
								}
							}
						}
					} else {
						if (TOrgRatioSP < 0.74) {
							if (SimhashDist < 67.5) {
								if (CTimRatioSP < 0.18) {
									if (TKWSRatio < 0.72) {ints[2246] = 1;}
									else {ints[2247] = 1;}
								} else {
									if (CTimLengthSP < 10.75) {ints[2248] = 1;}
									else {ints[2249] = 1;}
								}
							} else {
								if (CLocRatioNE < 0.61) {
									if (InsertSpan < 320425) {ints[2250] = 1;}
									else {ints[2251] = 1;}
								} else {
									if (SimhashDist < 78.5) {ints[2252] = 1;}
									else {ints[2253] = 1;}
								}
							}
						} else {
							if (CLocLengthSP < 4.25) {
								if (COrgLengthSP < 9.75) {
									if (CKWSLength < 9.75) {ints[2254] = 1;}
									else {ints[2255] = 1;}
								} else {
									if (CatRatio < 0.78) {ints[2256] = 1;}
									else {ints[2257] = 1;}
								}
							} else {
								if (ChannelRatio < 0.74) {
									if (CPerRatioSP < 0.06) {ints[2258] = 1;}
									else {ints[2259] = 1;}
								} else {
									if (TitleLength < 6.75) {ints[2260] = 1;}
									else {ints[2261] = 1;}
								}
							}
						}
					}
				} else {
					if (CTimRatioSP < 0.11) {
						if (InsertSpan < 67984) {
							if (CTimRatioSP < 0.06) {
								if (ChannelLength < 4.25) {ints[2262] = 1;}
								if (ChannelLength >= 4.25) {
									if (SimhashDist < 70.5) {ints[2263] = 1;}
									else {ints[2264] = 1;}
								}
							} else {
								if (EpochSpan < 6390) {ints[2265] = 1;}
								if (EpochSpan >= 6390) {
									if (CTimLengthSP < 9.25) {ints[2266] = 1;}
									else {ints[2267] = 1;}
								}
							}
						} else {
							if (InsertSpan < 217374.5) {ints[2268] = 1;}
							if (InsertSpan >= 217374.5) {
								if (CNUMLengthSP < 3.25) {ints[2269] = 1;}
								if (CNUMLengthSP >= 3.25) {
									if (CPerRatioNE < 0.46) {ints[2270] = 1;}
									else {ints[2271] = 1;}
								}
							}
						}
					} else {
						if (ChannelRatio < 0.41) {
							if (CatLength < 0.88) {
								if (TKWSLength < 7) {
									if (TitleRatio < 0.36) {ints[2272] = 1;}
									else {ints[2273] = 1;}
								} else {ints[2274] = 1;}
							} else {
								if (CKWSRatio < 0.28) {
									if (EpochSpan < 25207.5) {ints[2275] = 1;}
									else {ints[2276] = 1;}
								} else {
									if (CatLength < 1) {ints[2277] = 1;}
									else {ints[2278] = 1;}
								}
							}
						} else {
							if (TitleDist < 24.5) {
								if (COrgLengthNE < 1.75) {
									if (SimhashDist < 56.5) {ints[2279] = 1;}
									else {ints[2280] = 1;}
								} else {
									if (CTimLengthSP < 4.25) {ints[2281] = 1;}
									else {ints[2282] = 1;}
								}
							} else {
								if (COrgLengthNE < 11.75) {
									if (ChannelRatio < 0.61) {ints[2283] = 1;}
									else {ints[2284] = 1;}
								} else {
									if (CLocLengthSP < 13.75) {ints[2285] = 1;}
									else {ints[2286] = 1;}
								}
							}
						}
					}
				}
			} else {
				if (TKWSLength < 2.75) {
					if (CNUMLengthSP < 7.75) {ints[2287] = 1;}
					if (CNUMLengthSP >= 7.75) {
						if (CTimRatioSP < 0.07) {
							if (CPerLengthSP < 1.5) {ints[2288] = 1;}
							if (CPerLengthSP >= 1.5) {
								if (SimhashDist < 67) {ints[2289] = 1;}
								else {ints[2290] = 1;}
							}
						} else {ints[2291] = 1;}
					}
				} else {
					if (EpochSpan < 526377.5) {
						if (SimhashDist < 66.5) {
							if (CWordSpan < 34) {ints[2292] = 1;}
							else {ints[2293] = 1;}
						} else {
							if (TitleRatio < 0.44) {
								if (TKWSRatio < 0.48) {ints[2294] = 1;}
								if (TKWSRatio >= 0.48) {
									if (CatLength < 0.73) {ints[2295] = 1;}
									else {ints[2296] = 1;}
								}
							} else {
								if (TitleLength < 5.5) {ints[2297] = 1;}
								else {ints[2298] = 1;}
							}
						}
					} else {
						if (COrgRatioNE < 0.37) {ints[2299] = 1;}
						if (COrgRatioNE >= 0.37) {
							if (COrgRatioNE < 0.59) {
								if (COrgLengthNE < 14) {ints[2300] = 1;}
								else {ints[2301] = 1;}
							} else {ints[2302] = 1;}
						}
					}
				}
			}
		}
	}
} else {
	if (InsertSpan < 83722) {
		if (TKWSRatio < 0.76) {
			if (SimhashDist < 60.5) {
				if (COrgLengthSP < 2.75) {
					if (CLocRatioNE < 0.43) {
						if (CNUMLengthSP < 8.25) {
							if (EpochSpan < 4061.5) {
								if (CTimRatioSP < 0.48) {ints[2303] = 1;}
								if (CTimRatioSP >= 0.48) {
									if (TKWSLength < 2) {ints[2304] = 1;}
									else {ints[2305] = 1;}
								}
							} else {
								if (CPerLengthSP < 8.5) {
									if (TitleDist < 42) {ints[2306] = 1;}
									else {ints[2307] = 1;}
								} else {ints[2308] = 1;}
							}
						} else {
							if (CTimRatioSP < 0.97) {
								if (CLocRatioSP < 0.89) {ints[2309] = 1;}
								else {ints[2310] = 1;}
							} else {
								if (CLocLengthSP < 2.25) {
									if (SimhashDist < 44) {ints[2311] = 1;}
									else {ints[2312] = 1;}
								} else {
									if (InsertSpan < 29.5) {ints[2313] = 1;}
									else {ints[2314] = 1;}
								}
							}
						}
					} else {
						if (SameSRC < 0.5) {
							if (TitleRatio < 0.32) {
								if (CTimLengthSP < 11.25) {
									if (CLocRatioSP < 0.96) {ints[2315] = 1;}
									else {ints[2316] = 1;}
								} else {ints[2317] = 1;}
							} else {
								if (CKWSRatio < 0.55) {
									if (EpochSpan < 4376.5) {ints[2318] = 1;}
									else {ints[2319] = 1;}
								} else {
									if (CKWSLength < 6.25) {ints[2320] = 1;}
									else {ints[2321] = 1;}
								}
							}
						} else {
							if (CKWSLength < 6.75) {ints[2322] = 1;}
							if (CKWSLength >= 6.75) {
								if (EpochSpan < 21810) {
									if (CLocRatioNE < 0.89) {ints[2323] = 1;}
									else {ints[2324] = 1;}
								} else {ints[2325] = 1;}
							}
						}
					}
				} else {
					if (TitleRatio < 0.26) {
						if (ChannelLength < 3.25) {
							if (CPerRatioNE < 0.49) {ints[2326] = 1;}
							if (CPerRatioNE >= 0.49) {
								if (SimhashDist < 56.5) {
									if (CTimRatioSP < 0.04) {ints[2327] = 1;}
									else {ints[2328] = 1;}
								} else {ints[2329] = 1;}
							}
						} else {
							if (CTimRatioSP < 0.14) {
								if (TKWSLength < 4.25) {
									if (CNUMRatioSP < 0.55) {ints[2330] = 1;}
									else {ints[2331] = 1;}
								} else {ints[2332] = 1;}
							} else {
								if (TKWSRatio < 0.6) {
									if (CKWSRatio < 0.36) {ints[2333] = 1;}
									else {ints[2334] = 1;}
								} else {
									if (COrgLengthSP < 10.75) {ints[2335] = 1;}
									else {ints[2336] = 1;}
								}
							}
						}
					} else {
						if (CPerLengthNE < 2.75) {
							if (CTimLengthSP < 10.25) {
								if (CNUMLengthSP < 14.25) {
									if (CKWSLength < 9.75) {ints[2337] = 1;}
									else {ints[2338] = 1;}
								} else {
									if (TitleLength < 12.75) {ints[2339] = 1;}
									else {ints[2340] = 1;}
								}
							} else {
								if (TitleDist < 30.5) {
									if (CKWSLength < 18.5) {ints[2341] = 1;}
									else {ints[2342] = 1;}
								} else {
									if (CLocRatioSP < 0.26) {ints[2343] = 1;}
									else {ints[2344] = 1;}
								}
							}
						} else {
							if (CTimRatioSP < 0.42) {
								if (CLocRatioNE < 0.85) {
									if (CNUMRatioSP < 0.41) {ints[2345] = 1;}
									else {ints[2346] = 1;}
								} else {
									if (CWordSpan < 22) {ints[2347] = 1;}
									else {ints[2348] = 1;}
								}
							} else {
								if (TitleLength < 5.75) {
									if (TitleDist < 28.5) {ints[2349] = 1;}
									else {ints[2350] = 1;}
								} else {
									if (TitleRatio < 0.38) {ints[2351] = 1;}
									else {ints[2352] = 1;}
								}
							}
						}
					}
				}
			} else {
				if (CPerRatioNE < 0.39) {
					if (TitleRatio < 0.35) {
						if (EpochSpan < 253412.5) {
							if (SimhashDist < 70.5) {
								if (ChannelRatio < 0.16) {
									if (CNUMRatioSP < 0.22) {ints[2353] = 1;}
									else {ints[2354] = 1;}
								} else {
									if (HKWSRatio < 0.56) {ints[2355] = 1;}
									else {ints[2356] = 1;}
								}
							} else {
								if (COrgRatioNE < 0.68) {
									if (InsertSpan < 5509) {ints[2357] = 1;}
									else {ints[2358] = 1;}
								} else {
									if (InsertSpan < 73904.5) {ints[2359] = 1;}
									else {ints[2360] = 1;}
								}
							}
						} else {ints[2361] = 1;}
					} else {
						if (CLocRatioSP < 0.46) {
							if (TKWSRatio < 0.63) {
								if (SameSRC < 0.5) {
									if (ChannelLength < 2.75) {ints[2362] = 1;}
									else {ints[2363] = 1;}
								} else {ints[2364] = 1;}
							} else {
								if (COrgLengthSP < 4.25) {
									if (COrgLengthNE < 2.5) {ints[2365] = 1;}
									else {ints[2366] = 1;}
								} else {
									if (TOrgRatioSP < 0.58) {ints[2367] = 1;}
									else {ints[2368] = 1;}
								}
							}
						} else {
							if (CKWSLength < 8.25) {ints[2369] = 1;}
							if (CKWSLength >= 8.25) {
								if (CatRatio < 0.37) {ints[2370] = 1;}
								if (CatRatio >= 0.37) {
									if (CNUMRatioSP < 0.55) {ints[2371] = 1;}
									else {ints[2372] = 1;}
								}
							}
						}
					}
				} else {
					if (COrgLengthSP < 1.25) {
						if (CLocRatioSP < 0.58) {
							if (CatRatio < 0.63) {ints[2373] = 1;}
							else {ints[2374] = 1;}
						} else {
							if (CatLength < 0.93) {
								if (GeoLength < 1.25) {ints[2375] = 1;}
								else {ints[2376] = 1;}
							} else {ints[2377] = 1;}
						}
					} else {
						if (TitleRatio < 0.23) {
							if (CatLength < 1.17) {
								if (SimhashDist < 74.5) {
									if (CLocLengthSP < 21.5) {ints[2378] = 1;}
									else {ints[2379] = 1;}
								} else {
									if (CKWSLength < 14.25) {ints[2380] = 1;}
									else {ints[2381] = 1;}
								}
							} else {
								if (CKWSRatio < 0.35) {
									if (HKWSLength < 0.75) {ints[2382] = 1;}
									else {ints[2383] = 1;}
								} else {
									if (COrgLengthNE < 15) {ints[2384] = 1;}
									else {ints[2385] = 1;}
								}
							}
						} else {
							if (CLocRatioNE < 0.58) {
								if (CLocLengthSP < 14.75) {
									if (CLocRatioSP < 0.45) {ints[2386] = 1;}
									else {ints[2387] = 1;}
								} else {
									if (CTimRatioSP < 0.56) {ints[2388] = 1;}
									else {ints[2389] = 1;}
								}
							} else {
								if (CPerLengthNE < 22.25) {
									if (SameSRC < 0.5) {ints[2390] = 1;}
									else {ints[2391] = 1;}
								} else {
									if (CPerRatioNE < 0.78) {ints[2392] = 1;}
									else {ints[2393] = 1;}
								}
							}
						}
					}
				}
			}
		} else {
			if (TitleDist < 0.5) {
				if (CKWSRatio < 0.96) {
					if (EpochSpan < 7516) {
						if (CNUMLengthSP < 1.75) {
							if (CKWSRatio < 0.93) {ints[2394] = 1;}
							if (CKWSRatio >= 0.93) {
								if (TitleLength < 9.5) {ints[2395] = 1;}
								else {ints[2396] = 1;}
							}
						} else {ints[2397] = 1;}
					} else {
						if (SimhashDist < 64.5) {
							if (GeoLength < 2.75) {
								if (COrgRatioSP < 1) {
									if (CatRatio < 0.77) {ints[2398] = 1;}
									else {ints[2399] = 1;}
								} else {
									if (InsertSpan < 1636.5) {ints[2400] = 1;}
									else {ints[2401] = 1;}
								}
							} else {
								if (COrgRatioSP < 0.77) {ints[2402] = 1;}
								if (COrgRatioSP >= 0.77) {
									if (ChannelLength < 4.5) {ints[2403] = 1;}
									else {ints[2404] = 1;}
								}
							}
						} else {
							if (CNUMRatioSP < 0.66) {ints[2405] = 1;}
							else {ints[2406] = 1;}
						}
					}
				} else {
					if (TitleLength < 17.5) {
						if (GeoLength < 2.75) {
							if (InsertSpan < 0.5) {
								if (CPerRatioNE < 1) {
									if (CPerLengthSP < 10.5) {ints[2407] = 1;}
									else {ints[2408] = 1;}
								} else {ints[2409] = 1;}
							} else {ints[2410] = 1;}
						} else {
							if (EpochSpan < 19574) {
								if (CPerLengthNE < 7.25) {
									if (CPerRatioNE < 1) {ints[2411] = 1;}
									else {ints[2412] = 1;}
								} else {ints[2413] = 1;}
							} else {
								if (EpochSpan < 20134.5) {ints[2414] = 1;}
								else {ints[2415] = 1;}
							}
						}
					} else {
						if (CPerLengthNE < 3) {
							if (SameSRC < 0.5) {ints[2416] = 1;}
							else {ints[2417] = 1;}
						} else {ints[2418] = 1;}
					}
				}
			} else {
				if (SameSRC < 0.5) {
					if (ChannelRatio < 0.39) {
						if (CatLength < 1.2) {
							if (CWordSpan < 86) {
								if (CPerLengthNE < 17) {
									if (SimhashDist < 69) {ints[2419] = 1;}
									else {ints[2420] = 1;}
								} else {
									if (ParagraphSpan < 1) {ints[2421] = 1;}
									else {ints[2422] = 1;}
								}
							} else {
								if (CNUMLengthSP < 17.25) {
									if (ChannelRatio < 0.19) {ints[2423] = 1;}
									else {ints[2424] = 1;}
								} else {
									if (TitleDist < 36.5) {ints[2425] = 1;}
									else {ints[2426] = 1;}
								}
							}
						} else {
							if (InsertSpan < 76743.5) {
								if (EpochSpan < 2839668) {
									if (TitleLength < 9.75) {ints[2427] = 1;}
									else {ints[2428] = 1;}
								} else {ints[2429] = 1;}
							} else {
								if (COrgLengthNE < 4) {ints[2430] = 1;}
								else {ints[2431] = 1;}
							}
						}
					} else {
						if (CWordSpan < 7.5) {
							if (TitleRatio < 0.88) {
								if (GeoRatio < 0.42) {
									if (CKWSRatio < 0.96) {ints[2432] = 1;}
									else {ints[2433] = 1;}
								} else {
									if (TLocLengthSP < 1.75) {ints[2434] = 1;}
									else {ints[2435] = 1;}
								}
							} else {ints[2436] = 1;}
						} else {
							if (CPerLengthNE < 0.75) {
								if (TitleDist < 24.5) {
									if (CTimRatioSP < 0.63) {ints[2437] = 1;}
									else {ints[2438] = 1;}
								} else {
									if (CTimLengthSP < 12.25) {ints[2439] = 1;}
									else {ints[2440] = 1;}
								}
							} else {
								if (InsertSpan < 67) {
									if (COrgLengthNE < 3.25) {ints[2441] = 1;}
									else {ints[2442] = 1;}
								} else {
									if (CNUMLengthSP < 9.25) {ints[2443] = 1;}
									else {ints[2444] = 1;}
								}
							}
						}
					}
				} else {
					if (TitleDist < 20.5) {
						if (CLocRatioNE < 0.97) {
							if (EpochSpan < 397.5) {
								if (CPerRatioSP < 0.94) {ints[2445] = 1;}
								if (CPerRatioSP >= 0.94) {
									if (CPerLengthNE < 8.5) {ints[2446] = 1;}
									else {ints[2447] = 1;}
								}
							} else {
								if (CLocLengthNE < 16.25) {
									if (TitleDist < 2.5) {ints[2448] = 1;}
									else {ints[2449] = 1;}
								} else {
									if (CLocRatioSP < 0.98) {ints[2450] = 1;}
									else {ints[2451] = 1;}
								}
							}
						} else {
							if (CatRatio < 0.64) {ints[2452] = 1;}
							if (CatRatio >= 0.64) {
								if (CLocRatioNE < 1) {
									if (CNUMLengthSP < 2) {ints[2453] = 1;}
									else {ints[2454] = 1;}
								} else {
									if (TitleRatio < 0.79) {ints[2455] = 1;}
									else {ints[2456] = 1;}
								}
							}
						}
					} else {
						if (TitleDist < 38.5) {ints[2457] = 1;}
						if (TitleDist >= 38.5) {
							if (CLocRatioSP < 0.73) {ints[2458] = 1;}
							if (CLocRatioSP >= 0.73) {
								if (TitleDist < 41.5) {ints[2459] = 1;}
								if (TitleDist >= 41.5) {
									if (CatRatio < 0.64) {ints[2460] = 1;}
									else {ints[2461] = 1;}
								}
							}
						}
					}
				}
			}
		}
	} else {
		if (CNUMRatioSP < 0.5) {
			if (InsertSpan < 268468) {
				if (SimhashDist < 68.5) {
					if (CNUMLengthSP < 13.25) {
						if (CPerRatioNE < 0.38) {
							if (TitleDist < 65.5) {
								if (TitleLength < 9.75) {
									if (CWordSpan < 47.5) {ints[2462] = 1;}
									else {ints[2463] = 1;}
								} else {
									if (COrgRatioSP < 0.65) {ints[2464] = 1;}
									else {ints[2465] = 1;}
								}
							} else {
								if (TitleDist < 83.5) {
									if (InsertSpan < 251358.5) {ints[2466] = 1;}
									else {ints[2467] = 1;}
								} else {ints[2468] = 1;}
							}
						} else {
							if (TPerRatioSP < 0.68) {
								if (TitleLength < 13.25) {
									if (CTimRatioSP < 0.26) {ints[2469] = 1;}
									else {ints[2470] = 1;}
								} else {
									if (CPerLengthSP < 57.5) {ints[2471] = 1;}
									else {ints[2472] = 1;}
								}
							} else {
								if (SameSRC < 0.5) {
									if (CPerRatioSP < 0.61) {ints[2473] = 1;}
									else {ints[2474] = 1;}
								} else {
									if (TitleDist < 2.5) {ints[2475] = 1;}
									else {ints[2476] = 1;}
								}
							}
						}
					} else {
						if (CLocRatioNE < 0.53) {
							if (CPerRatioSP < 0.68) {
								if (SimhashDist < 66.5) {
									if (EpochSpan < 56457.5) {ints[2477] = 1;}
									else {ints[2478] = 1;}
								} else {
									if (CLocRatioSP < 0.44) {ints[2479] = 1;}
									else {ints[2480] = 1;}
								}
							} else {
								if (COrgRatioSP < 0.45) {
									if (TitleDist < 26) {ints[2481] = 1;}
									else {ints[2482] = 1;}
								} else {
									if (TitleDist < 45) {ints[2483] = 1;}
									else {ints[2484] = 1;}
								}
							}
						} else {
							if (COrgLengthSP < 8.25) {
								if (COrgLengthNE < 3.25) {
									if (ChannelRatio < 0.37) {ints[2485] = 1;}
									else {ints[2486] = 1;}
								} else {
									if (CLocLengthSP < 6) {ints[2487] = 1;}
									else {ints[2488] = 1;}
								}
							} else {
								if (EpochSpan < 83284.5) {ints[2489] = 1;}
								if (EpochSpan >= 83284.5) {
									if (COrgRatioSP < 0.38) {ints[2490] = 1;}
									else {ints[2491] = 1;}
								}
							}
						}
					}
				} else {
					if (TitleRatio < 0.36) {
						if (CPerRatioNE < 0.78) {
							if (CLocLengthSP < 13.75) {
								if (COrgRatioSP < 0.09) {
									if (TitleLength < 15.5) {ints[2492] = 1;}
									else {ints[2493] = 1;}
								} else {
									if (COrgRatioNE < 0.69) {ints[2494] = 1;}
									else {ints[2495] = 1;}
								}
							} else {
								if (CKWSLength < 16.75) {
									if (ParagraphSpan < 5.5) {ints[2496] = 1;}
									else {ints[2497] = 1;}
								} else {
									if (CPerLengthNE < 1.75) {ints[2498] = 1;}
									else {ints[2499] = 1;}
								}
							}
						} else {
							if (CPerLengthSP < 4.75) {
								if (TKWSRatio < 0.42) {ints[2500] = 1;}
								else {ints[2501] = 1;}
							} else {
								if (CWordSpan < 376.5) {
									if (CPerLengthSP < 8.5) {ints[2502] = 1;}
									else {ints[2503] = 1;}
								} else {
									if (ChannelRatio < 0.22) {ints[2504] = 1;}
									else {ints[2505] = 1;}
								}
							}
						}
					} else {
						if (CPerLengthSP < 2.25) {
							if (COrgLengthNE < 4.75) {
								if (CKWSLength < 19.5) {
									if (CNUMLengthSP < 8.25) {ints[2506] = 1;}
									else {ints[2507] = 1;}
								} else {ints[2508] = 1;}
							} else {
								if (TKWSRatio < 0.87) {
									if (CNUMRatioSP < 0.43) {ints[2509] = 1;}
									else {ints[2510] = 1;}
								} else {ints[2511] = 1;}
							}
						} else {
							if (CKWSRatio < 0.47) {
								if (CPerRatioSP < 0.81) {
									if (TKWSRatio < 0.72) {ints[2512] = 1;}
									else {ints[2513] = 1;}
								} else {
									if (CatLength < 1.5) {ints[2514] = 1;}
									else {ints[2515] = 1;}
								}
							} else {
								if (CatLength < 0.76) {ints[2516] = 1;}
								if (CatLength >= 0.76) {
									if (ChannelRatio < 0.93) {ints[2517] = 1;}
									else {ints[2518] = 1;}
								}
							}
						}
					}
				}
			} else {
				if (EpochSpan < 49849) {
					if (CKWSRatio < 0.44) {
						if (COrgLengthNE < 8.25) {
							if (ParagraphSpan < 7) {
								if (EpochSpan < 32933.5) {ints[2519] = 1;}
								else {ints[2520] = 1;}
							} else {
								if (TitleDist < 34.5) {ints[2521] = 1;}
								else {ints[2522] = 1;}
							}
						} else {ints[2523] = 1;}
					} else {ints[2524] = 1;}
				} else {
					if (TitleRatio < 0.17) {
						if (COrgLengthNE < 4.25) {
							if (HKWSLength < 1.25) {
								if (TitleDist < 31.5) {
									if (CLocRatioNE < 0.75) {ints[2525] = 1;}
									else {ints[2526] = 1;}
								} else {
									if (CKWSLength < 15.75) {ints[2527] = 1;}
									else {ints[2528] = 1;}
								}
							} else {
								if (ParagraphSpan < 5.5) {ints[2529] = 1;}
								if (ParagraphSpan >= 5.5) {
									if (GeoLength < 1.25) {ints[2530] = 1;}
									else {ints[2531] = 1;}
								}
							}
						} else {ints[2532] = 1;}
					} else {
						if (CPerRatioNE < 0.68) {
							if (CLocLengthNE < 28.25) {
								if (TitleDist < 71.5) {
									if (GeoLength < 1.75) {ints[2533] = 1;}
									else {ints[2534] = 1;}
								} else {
									if (CPerLengthSP < 3.25) {ints[2535] = 1;}
									else {ints[2536] = 1;}
								}
							} else {
								if (COrgLengthSP < 4.75) {ints[2537] = 1;}
								if (COrgLengthSP >= 4.75) {
									if (CPerLengthNE < 0.75) {ints[2538] = 1;}
									else {ints[2539] = 1;}
								}
							}
						} else {
							if (CTimLengthSP < 1.25) {
								if (InsertSpan < 569471) {
									if (CWordSpan < 25.5) {ints[2540] = 1;}
									else {ints[2541] = 1;}
								} else {ints[2542] = 1;}
							} else {
								if (InsertSpan < 848911) {
									if (TitleLength < 15.25) {ints[2543] = 1;}
									else {ints[2544] = 1;}
								} else {
									if (CatLength < 0.87) {ints[2545] = 1;}
									else {ints[2546] = 1;}
								}
							}
						}
					}
				}
			}
		} else {
			if (TKWSRatio < 0.68) {
				if (SimhashDist < 74.5) {
					if (CKWSLength < 14.25) {
						if (InsertSpan < 518628.5) {
							if (HKWSRatio < 0.34) {
								if (COrgRatioSP < 0.81) {
									if (CLocLengthNE < 1.25) {ints[2547] = 1;}
									else {ints[2548] = 1;}
								} else {
									if (ParagraphSpan < 0.5) {ints[2549] = 1;}
									else {ints[2550] = 1;}
								}
							} else {
								if (SimhashDist < 65.5) {
									if (COrgLengthNE < 4) {ints[2551] = 1;}
									else {ints[2552] = 1;}
								} else {
									if (ParagraphSpan < 6) {ints[2553] = 1;}
									else {ints[2554] = 1;}
								}
							}
						} else {
							if (SimhashDist < 7.5) {ints[2555] = 1;}
							if (SimhashDist >= 7.5) {
								if (CLocLengthNE < 3.75) {ints[2556] = 1;}
								if (CLocLengthNE >= 3.75) {
									if (TKWSRatio < 0.47) {ints[2557] = 1;}
									else {ints[2558] = 1;}
								}
							}
						}
					} else {
						if (COrgLengthSP < 25.25) {
							if (SimhashDist < 43.5) {
								if (ChannelRatio < 0.81) {
									if (EpochSpan < 303112.5) {ints[2559] = 1;}
									else {ints[2560] = 1;}
								} else {ints[2561] = 1;}
							} else {
								if (ChannelLength < 4.25) {
									if (CatLength < 1.38) {ints[2562] = 1;}
									else {ints[2563] = 1;}
								} else {
									if (CPerRatioNE < 0.5) {ints[2564] = 1;}
									else {ints[2565] = 1;}
								}
							}
						} else {
							if (ParagraphSpan < 53) {
								if (EpochSpan < 235968.5) {
									if (CPerRatioNE < 0.48) {ints[2566] = 1;}
									else {ints[2567] = 1;}
								} else {ints[2568] = 1;}
							} else {ints[2569] = 1;}
						}
					}
				} else {
					if (CPerRatioSP < 0.68) {
						if (TitleDist < 37.5) {
							if (HKWSRatio < 0.11) {
								if (CTimRatioSP < 0.42) {
									if (CNUMLengthSP < 5.75) {ints[2570] = 1;}
									else {ints[2571] = 1;}
								} else {ints[2572] = 1;}
							} else {
								if (CWordSpan < 657) {ints[2573] = 1;}
								else {ints[2574] = 1;}
							}
						} else {
							if (CTimLengthSP < 3.25) {ints[2575] = 1;}
							if (CTimLengthSP >= 3.25) {
								if (CTimLengthSP < 5.25) {
									if (CatLength < 0.85) {ints[2576] = 1;}
									else {ints[2577] = 1;}
								} else {
									if (CKWSRatio < 0.29) {ints[2578] = 1;}
									else {ints[2579] = 1;}
								}
							}
						}
					} else {
						if (SimhashDist < 87.5) {
							if (CPerRatioNE < 0.57) {
								if (TKWSLength < 2.25) {ints[2580] = 1;}
								else {ints[2581] = 1;}
							} else {
								if (CatRatio < 0.65) {
									if (CNUMLengthSP < 6.75) {ints[2582] = 1;}
									else {ints[2583] = 1;}
								} else {
									if (EpochSpan < 316200) {ints[2584] = 1;}
									else {ints[2585] = 1;}
								}
							}
						} else {ints[2586] = 1;}
					}
				}
			} else {
				if (SameSRC < 0.5) {
					if (CPerRatioSP < 0.59) {
						if (CTimRatioSP < 0.63) {
							if (COrgLengthSP < 25.5) {
								if (TKWSRatio < 0.94) {
									if (InsertSpan < 582056.5) {ints[2587] = 1;}
									else {ints[2588] = 1;}
								} else {
									if (SimhashDist < 85) {ints[2589] = 1;}
									else {ints[2590] = 1;}
								}
							} else {
								if (CTimLengthSP < 3) {ints[2591] = 1;}
								else {ints[2592] = 1;}
							}
						} else {
							if (TKWSLength < 1.75) {
								if (TKWSRatio < 0.88) {ints[2593] = 1;}
								if (TKWSRatio >= 0.88) {
									if (CatRatio < 1) {ints[2594] = 1;}
									else {ints[2595] = 1;}
								}
							} else {
								if (CNUMRatioSP < 0.53) {
									if (TitleLength < 8.25) {ints[2596] = 1;}
									else {ints[2597] = 1;}
								} else {
									if (CTimRatioSP < 0.74) {ints[2598] = 1;}
									else {ints[2599] = 1;}
								}
							}
						}
					} else {
						if (CatLength < 0.88) {
							if (CatLength < 0.87) {
								if (CTimLengthSP < 8.75) {
									if (COrgRatioSP < 0.67) {ints[2600] = 1;}
									else {ints[2601] = 1;}
								} else {ints[2602] = 1;}
							} else {
								if (TitleLength < 8.25) {
									if (COrgRatioSP < 0.92) {ints[2603] = 1;}
									else {ints[2604] = 1;}
								} else {ints[2605] = 1;}
							}
						} else {
							if (CKWSLength < 14.25) {
								if (EpochSpan < 388201.5) {
									if (CNUMRatioSP < 0.78) {ints[2606] = 1;}
									else {ints[2607] = 1;}
								} else {ints[2608] = 1;}
							} else {
								if (EpochSpan < 85782) {
									if (ParagraphSpan < 11.5) {ints[2609] = 1;}
									else {ints[2610] = 1;}
								} else {
									if (COrgRatioNE < 0.82) {ints[2611] = 1;}
									else {ints[2612] = 1;}
								}
							}
						}
					}
				} else {
					if (EpochSpan < 82879) {
						if (CTimRatioSP < 0.72) {
							if (CWordSpan < 1) {ints[2613] = 1;}
							if (CWordSpan >= 1) {
								if (TKWSRatio < 0.88) {ints[2614] = 1;}
								else {ints[2615] = 1;}
							}
						} else {ints[2616] = 1;}
					} else {
						if (TitleDist < 55.5) {
							if (InsertSpan < 259199.5) {
								if (COrgRatioSP < 0.26) {ints[2617] = 1;}
								if (COrgRatioSP >= 0.26) {
									if (CLocRatioNE < 0.68) {ints[2618] = 1;}
									else {ints[2619] = 1;}
								}
							} else {
								if (EpochSpan < 496607.5) {ints[2620] = 1;}
								if (EpochSpan >= 496607.5) {
									if (COrgLengthSP < 2.25) {ints[2621] = 1;}
									else {ints[2622] = 1;}
								}
							}
						} else {
							if (InsertSpan < 448587.5) {
								if (CPerLengthNE < 2.5) {ints[2623] = 1;}
								if (CPerLengthNE >= 2.5) {
									if (COrgLengthNE < 1.75) {ints[2624] = 1;}
									else {ints[2625] = 1;}
								}
							} else {ints[2626] = 1;}
						}
					}
				}
			}
		}
	}
}
if (CPerRatioSP < 0.57) {
	if (CatRatio < 0.5) {
		if (CatRatio < 0.24) {
			if (TitleRatio < 0.21) {
				if (CatLength < 0.66) {
					if (ChannelRatio < 0.43) {
						if (CNUMRatioSP < 0.75) {ints[3072] = 1;}
						else {ints[3073] = 1;}
					} else {
						if (EpochSpan < 23997.5) {ints[3074] = 1;}
						if (EpochSpan >= 23997.5) {
							if (CKWSRatio < 0.36) {ints[3075] = 1;}
							else {ints[3076] = 1;}
						}
					}
				} else {
					if (SimhashDist < 75.5) {
						if (COrgRatioSP < 0.18) {
							if (CKWSRatio < 0.04) {
								if (CTimLengthSP < 12.25) {ints[3077] = 1;}
								if (CTimLengthSP >= 12.25) {
									if (TitleDist < 74.5) {ints[3078] = 1;}
									else {ints[3079] = 1;}
								}
							} else {ints[3080] = 1;}
						} else {
							if (CatLength < 1.05) {
								if (CWordSpan < 256) {ints[3081] = 1;}
								if (CWordSpan >= 256) {
									if (CLocLengthSP < 7.75) {ints[3082] = 1;}
									else {ints[3083] = 1;}
								}
							} else {ints[3084] = 1;}
						}
					} else {
						if (CKWSLength < 15.25) {
							if (CKWSRatio < 0.02) {
								if (CPerLengthSP < 0.75) {
									if (TitleDist < 65.5) {ints[3085] = 1;}
									else {ints[3086] = 1;}
								} else {ints[3087] = 1;}
							} else {ints[3088] = 1;}
						} else {ints[3089] = 1;}
					}
				}
			} else {
				if (SimhashDist < 63.5) {
					if (CatLength < 0.87) {
						if (EpochSpan < 251424) {
							if (COrgRatioSP < 0.54) {
								if (TKWSLength < 3.75) {
									if (SimhashDist < 55.5) {ints[3090] = 1;}
									else {ints[3091] = 1;}
								} else {
									if (CTimRatioSP < 0.66) {ints[3092] = 1;}
									else {ints[3093] = 1;}
								}
							} else {
								if (InsertSpan < 182853) {ints[3094] = 1;}
								else {ints[3095] = 1;}
							}
						} else {
							if (CPerLengthSP < 5.5) {
								if (CWordSpan < 118) {
									if (GeoRatio < 0.7) {ints[3096] = 1;}
									else {ints[3097] = 1;}
								} else {ints[3098] = 1;}
							} else {ints[3099] = 1;}
						}
					} else {
						if (SimhashDist < 60.5) {
							if (CPerLengthNE < 11.25) {
								if (TitleRatio < 0.85) {ints[3100] = 1;}
								else {ints[3101] = 1;}
							} else {ints[3102] = 1;}
						} else {ints[3103] = 1;}
					}
				} else {
					if (CNUMRatioSP < 0.48) {
						if (CKWSRatio < 0.16) {ints[3104] = 1;}
						if (CKWSRatio >= 0.16) {
							if (EpochSpan < 64140) {
								if (TKWSRatio < 0.43) {ints[3105] = 1;}
								if (TKWSRatio >= 0.43) {
									if (CatLength < 0.45) {ints[3106] = 1;}
									else {ints[3107] = 1;}
								}
							} else {
								if (CLocRatioSP < 0.25) {ints[3108] = 1;}
								if (CLocRatioSP >= 0.25) {
									if (SimhashDist < 65.5) {ints[3109] = 1;}
									else {ints[3110] = 1;}
								}
							}
						}
					} else {
						if (CLocRatioSP < 0.38) {ints[3111] = 1;}
						if (CLocRatioSP >= 0.38) {
							if (CNUMLengthSP < 5.5) {
								if (TKWSRatio < 0.23) {ints[3112] = 1;}
								if (TKWSRatio >= 0.23) {
									if (CKWSLength < 12.75) {ints[3113] = 1;}
									else {ints[3114] = 1;}
								}
							} else {
								if (TitleLength < 8.25) {ints[3115] = 1;}
								else {ints[3116] = 1;}
							}
						}
					}
				}
			}
		} else {
			if (COrgRatioNE < 0.08) {
				if (TKWSRatio < 0.28) {
					if (CKWSRatio < 0.23) {
						if (CPerRatioNE < 0.06) {ints[3117] = 1;}
						if (CPerRatioNE >= 0.06) {
							if (TKWSLength < 2.75) {
								if (CPerRatioSP < 0.32) {ints[3118] = 1;}
								if (CPerRatioSP >= 0.32) {
									if (InsertSpan < 60598) {ints[3119] = 1;}
									else {ints[3120] = 1;}
								}
							} else {ints[3121] = 1;}
						}
					} else {
						if (TOrgRatioSP < 0.25) {
							if (InsertSpan < 4565597.5) {
								if (CKWSRatio < 0.47) {
									if (COrgLengthNE < 29.75) {ints[3122] = 1;}
									else {ints[3123] = 1;}
								} else {
									if (CatLength < 0.68) {ints[3124] = 1;}
									else {ints[3125] = 1;}
								}
							} else {
								if (TitleDist < 45) {ints[3126] = 1;}
								else {ints[3127] = 1;}
							}
						} else {
							if (CLocRatioSP < 0.56) {ints[3128] = 1;}
							if (CLocRatioSP >= 0.56) {
								if (CTimRatioSP < 0.44) {ints[3129] = 1;}
								if (CTimRatioSP >= 0.44) {
									if (CKWSLength < 17.75) {ints[3130] = 1;}
									else {ints[3131] = 1;}
								}
							}
						}
					}
				} else {
					if (ChannelRatio < 0.28) {
						if (CTimLengthSP < 26.25) {
							if (CWordSpan < 150.5) {
								if (InsertSpan < 0.5) {ints[3132] = 1;}
								else {ints[3133] = 1;}
							} else {
								if (CLocRatioSP < 0.91) {
									if (COrgRatioSP < 0.31) {ints[3134] = 1;}
									else {ints[3135] = 1;}
								} else {
									if (ParagraphSpan < 33.5) {ints[3136] = 1;}
									else {ints[3137] = 1;}
								}
							}
						} else {ints[3138] = 1;}
					} else {
						if (CWordSpan < 105.5) {
							if (CLocLengthNE < 1.25) {
								if (EpochSpan < 59613.5) {ints[3139] = 1;}
								if (EpochSpan >= 59613.5) {
									if (TitleLength < 7.75) {ints[3140] = 1;}
									else {ints[3141] = 1;}
								}
							} else {
								if (SimhashDist < 65) {
									if (InsertSpan < 83201.5) {ints[3142] = 1;}
									else {ints[3143] = 1;}
								} else {ints[3144] = 1;}
							}
						} else {
							if (InsertSpan < 32425) {
								if (CPerLengthNE < 18.5) {ints[3145] = 1;}
								if (CPerLengthNE >= 18.5) {
									if (CKWSRatio < 0.31) {ints[3146] = 1;}
									else {ints[3147] = 1;}
								}
							} else {
								if (CLocRatioNE < 0.68) {
									if (TitleRatio < 0.23) {ints[3148] = 1;}
									else {ints[3149] = 1;}
								} else {
									if (CKWSLength < 18) {ints[3150] = 1;}
									else {ints[3151] = 1;}
								}
							}
						}
					}
				}
			} else {
				if (COrgRatioSP < 0.51) {
					if (CPerRatioNE < 0.06) {
						if (CPerLengthNE < 9.25) {
							if (CKWSRatio < 0.17) {
								if (CLocLengthSP < 8.25) {ints[3152] = 1;}
								if (CLocLengthSP >= 8.25) {
									if (CatLength < 1.41) {ints[3153] = 1;}
									else {ints[3154] = 1;}
								}
							} else {
								if (TitleLength < 6.25) {
									if (CTimLengthSP < 8) {ints[3155] = 1;}
									else {ints[3156] = 1;}
								} else {
									if (SimhashDist < 73.5) {ints[3157] = 1;}
									else {ints[3158] = 1;}
								}
							}
						} else {
							if (InsertSpan < 46829) {
								if (TitleDist < 48) {
									if (CWordSpan < 761.5) {ints[3159] = 1;}
									else {ints[3160] = 1;}
								} else {ints[3161] = 1;}
							} else {
								if (SimhashDist < 63) {ints[3162] = 1;}
								else {ints[3163] = 1;}
							}
						}
					} else {
						if (EpochSpan < 60340) {
							if (CatLength < 1.27) {
								if (TitleRatio < 0.12) {ints[3164] = 1;}
								if (TitleRatio >= 0.12) {
									if (CPerLengthNE < 21.5) {ints[3165] = 1;}
									else {ints[3166] = 1;}
								}
							} else {
								if (HKWSLength < 1.25) {ints[3167] = 1;}
								if (HKWSLength >= 1.25) {
									if (CPerRatioSP < 0.14) {ints[3168] = 1;}
									else {ints[3169] = 1;}
								}
							}
						} else {
							if (CTimRatioSP < 0.37) {
								if (TitleLength < 10.75) {
									if (CLocLengthSP < 31.75) {ints[3170] = 1;}
									else {ints[3171] = 1;}
								} else {ints[3172] = 1;}
							} else {
								if (COrgRatioNE < 0.35) {
									if (CPerLengthNE < 16.75) {ints[3173] = 1;}
									else {ints[3174] = 1;}
								} else {
									if (CKWSRatio < 0.82) {ints[3175] = 1;}
									else {ints[3176] = 1;}
								}
							}
						}
					}
				} else {
					if (SimhashDist < 81.5) {
						if (TKWSRatio < 0.26) {
							if (TitleRatio < 0.11) {
								if (CPerRatioSP < 0.28) {ints[3177] = 1;}
								if (CPerRatioSP >= 0.28) {
									if (COrgLengthSP < 18.5) {ints[3178] = 1;}
									else {ints[3179] = 1;}
								}
							} else {
								if (TitleDist < 33) {
									if (TKWSLength < 1.75) {ints[3180] = 1;}
									else {ints[3181] = 1;}
								} else {
									if (CatRatio < 0.3) {ints[3182] = 1;}
									else {ints[3183] = 1;}
								}
							}
						} else {
							if (EpochSpan < 61326) {
								if (TitleRatio < 0.29) {
									if (COrgRatioSP < 0.63) {ints[3184] = 1;}
									else {ints[3185] = 1;}
								} else {
									if (EpochSpan < 284) {ints[3186] = 1;}
									else {ints[3187] = 1;}
								}
							} else {
								if (ParagraphSpan < 0.5) {ints[3188] = 1;}
								if (ParagraphSpan >= 0.5) {
									if (CatRatio < 0.38) {ints[3189] = 1;}
									else {ints[3190] = 1;}
								}
							}
						}
					} else {
						if (CPerRatioSP < 0.23) {ints[3191] = 1;}
						if (CPerRatioSP >= 0.23) {
							if (TitleLength < 9) {ints[3192] = 1;}
							if (TitleLength >= 9) {
								if (CKWSLength < 19.75) {ints[3193] = 1;}
								else {ints[3194] = 1;}
							}
						}
					}
				}
			}
		}
	} else {
		if (CLocRatioNE < 0.34) {
			if (TKWSRatio < 0.45) {
				if (COrgRatioNE < 0.42) {
					if (CPerRatioNE < 0.19) {
						if (TitleRatio < 0.2) {
							if (CLocLengthNE < 28.5) {
								if (TitleLength < 4.25) {
									if (CatRatio < 0.91) {ints[3195] = 1;}
									else {ints[3196] = 1;}
								} else {
									if (CTimLengthSP < 32.25) {ints[3197] = 1;}
									else {ints[3198] = 1;}
								}
							} else {
								if (TitleLength < 9.75) {
									if (CKWSRatio < 0.13) {ints[3199] = 1;}
									else {ints[3200] = 1;}
								} else {ints[3201] = 1;}
							}
						} else {
							if (EpochSpan < 40890) {
								if (CNUMRatioSP < 0.3) {
									if (CWordSpan < 20) {ints[3202] = 1;}
									else {ints[3203] = 1;}
								} else {
									if (ParagraphSpan < 7) {ints[3204] = 1;}
									else {ints[3205] = 1;}
								}
							} else {
								if (CPerLengthSP < 1.75) {
									if (CPerLengthNE < 0.75) {ints[3206] = 1;}
									else {ints[3207] = 1;}
								} else {
									if (TitleDist < 29.5) {ints[3208] = 1;}
									else {ints[3209] = 1;}
								}
							}
						}
					} else {
						if (CPerRatioNE < 0.19) {
							if (COrgLengthNE < 8.25) {ints[3210] = 1;}
							if (COrgLengthNE >= 8.25) {
								if (TitleDist < 66.5) {ints[3211] = 1;}
								else {ints[3212] = 1;}
							}
						} else {
							if (CTimLengthSP < 3.75) {
								if (SimhashDist < 61.5) {
									if (InsertSpan < 2277025.5) {ints[3213] = 1;}
									else {ints[3214] = 1;}
								} else {
									if (TKWSLength < 2.25) {ints[3215] = 1;}
									else {ints[3216] = 1;}
								}
							} else {
								if (TitleRatio < 0.18) {
									if (ChannelRatio < 0.8) {ints[3217] = 1;}
									else {ints[3218] = 1;}
								} else {
									if (SimhashDist < 71.5) {ints[3219] = 1;}
									else {ints[3220] = 1;}
								}
							}
						}
					}
				} else {
					if (EpochSpan < 61801) {
						if (SimhashDist < 71.5) {
							if (CPerLengthNE < 16.25) {
								if (CPerRatioSP < 0.05) {
									if (TitleDist < 73.5) {ints[3221] = 1;}
									else {ints[3222] = 1;}
								} else {
									if (InsertSpan < 394) {ints[3223] = 1;}
									else {ints[3224] = 1;}
								}
							} else {
								if (TOrgRatioNE < 0.33) {
									if (CLocLengthNE < 2.75) {ints[3225] = 1;}
									else {ints[3226] = 1;}
								} else {
									if (ChannelRatio < 0.37) {ints[3227] = 1;}
									else {ints[3228] = 1;}
								}
							}
						} else {
							if (COrgLengthSP < 12.75) {
								if (COrgRatioNE < 0.96) {
									if (CTimLengthSP < 28.5) {ints[3229] = 1;}
									else {ints[3230] = 1;}
								} else {
									if (CKWSLength < 19.25) {ints[3231] = 1;}
									else {ints[3232] = 1;}
								}
							} else {
								if (CLocRatioNE < 0.31) {
									if (CPerRatioNE < 0.18) {ints[3233] = 1;}
									else {ints[3234] = 1;}
								} else {
									if (CNUMRatioSP < 0.24) {ints[3235] = 1;}
									else {ints[3236] = 1;}
								}
							}
						}
					} else {
						if (CKWSRatio < 0.29) {
							if (CLocRatioSP < 0.77) {
								if (TitleDist < 82.5) {
									if (COrgRatioSP < 0.58) {ints[3237] = 1;}
									else {ints[3238] = 1;}
								} else {
									if (EpochSpan < 458760) {ints[3239] = 1;}
									else {ints[3240] = 1;}
								}
							} else {
								if (ChannelRatio < 0.16) {ints[3241] = 1;}
								if (ChannelRatio >= 0.16) {
									if (InsertSpan < 191304.5) {ints[3242] = 1;}
									else {ints[3243] = 1;}
								}
							}
						} else {
							if (ParagraphSpan < 10.5) {
								if (SimhashDist < 83) {
									if (TitleDist < 31) {ints[3244] = 1;}
									else {ints[3245] = 1;}
								} else {
									if (COrgRatioNE < 0.53) {ints[3246] = 1;}
									else {ints[3247] = 1;}
								}
							} else {
								if (TitleRatio < 0.09) {ints[3248] = 1;}
								if (TitleRatio >= 0.09) {
									if (CTimRatioSP < 0.49) {ints[3249] = 1;}
									else {ints[3250] = 1;}
								}
							}
						}
					}
				}
			} else {
				if (COrgRatioSP < 0.45) {
					if (COrgRatioNE < 0.29) {
						if (TitleRatio < 0.45) {
							if (InsertSpan < 4008.5) {
								if (COrgLengthNE < 11.75) {
									if (TitleDist < 33.5) {ints[3251] = 1;}
									else {ints[3252] = 1;}
								} else {ints[3253] = 1;}
							} else {
								if (HKWSRatio < 0.78) {
									if (CLocLengthSP < 6.25) {ints[3254] = 1;}
									else {ints[3255] = 1;}
								} else {
									if (TitleLength < 7.25) {ints[3256] = 1;}
									else {ints[3257] = 1;}
								}
							}
						} else {
							if (TKWSRatio < 0.62) {
								if (CPerRatioSP < 0.44) {
									if (CTimRatioSP < 0.68) {ints[3258] = 1;}
									else {ints[3259] = 1;}
								} else {
									if (CKWSLength < 18) {ints[3260] = 1;}
									else {ints[3261] = 1;}
								}
							} else {
								if (CTimLengthSP < 6.75) {
									if (EpochSpan < 151214) {ints[3262] = 1;}
									else {ints[3263] = 1;}
								} else {
									if (CPerRatioSP < 0.52) {ints[3264] = 1;}
									else {ints[3265] = 1;}
								}
							}
						}
					} else {
						if (TitleDist < 35.5) {
							if (TitleRatio < 0.42) {
								if (ParagraphSpan < 2.5) {
									if (TitleLength < 6.25) {ints[3266] = 1;}
									else {ints[3267] = 1;}
								} else {ints[3268] = 1;}
							} else {
								if (CKWSLength < 7.75) {
									if (CTimLengthSP < 1.25) {ints[3269] = 1;}
									else {ints[3270] = 1;}
								} else {
									if (EpochSpan < 167222) {ints[3271] = 1;}
									else {ints[3272] = 1;}
								}
							}
						} else {
							if (TitleRatio < 0.38) {
								if (EpochSpan < 28525.5) {
									if (CLocLengthSP < 10.25) {ints[3273] = 1;}
									else {ints[3274] = 1;}
								} else {
									if (COrgRatioNE < 0.42) {ints[3275] = 1;}
									else {ints[3276] = 1;}
								}
							} else {
								if (CNUMLengthSP < 30.75) {
									if (SimhashDist < 58) {ints[3277] = 1;}
									else {ints[3278] = 1;}
								} else {
									if (COrgLengthSP < 13.5) {ints[3279] = 1;}
									else {ints[3280] = 1;}
								}
							}
						}
					}
				} else {
					if (CNUMRatioSP < 0.57) {
						if (CKWSLength < 8.25) {
							if (GeoLength < 0.75) {ints[3281] = 1;}
							if (GeoLength >= 0.75) {
								if (TitleRatio < 0.97) {
									if (ChannelRatio < 0.13) {ints[3282] = 1;}
									else {ints[3283] = 1;}
								} else {
									if (EpochSpan < 37328.5) {ints[3284] = 1;}
									else {ints[3285] = 1;}
								}
							}
						} else {
							if (EpochSpan < 83593.5) {
								if (COrgLengthNE < 38.5) {
									if (COrgLengthSP < 2.5) {ints[3286] = 1;}
									else {ints[3287] = 1;}
								} else {
									if (TKWSRatio < 0.61) {ints[3288] = 1;}
									else {ints[3289] = 1;}
								}
							} else {
								if (EpochSpan < 314831.5) {
									if (ChannelRatio < 0.28) {ints[3290] = 1;}
									else {ints[3291] = 1;}
								} else {
									if (HKWSRatio < 0.45) {ints[3292] = 1;}
									else {ints[3293] = 1;}
								}
							}
						}
					} else {
						if (CNUMLengthSP < 11.75) {
							if (CKWSRatio < 0.36) {
								if (TKWSLength < 4.75) {
									if (CPerRatioSP < 0.49) {ints[3294] = 1;}
									else {ints[3295] = 1;}
								} else {
									if (CLocLengthSP < 9.5) {ints[3296] = 1;}
									else {ints[3297] = 1;}
								}
							} else {
								if (TitleDist < 46.5) {
									if (EpochSpan < 611188) {ints[3298] = 1;}
									else {ints[3299] = 1;}
								} else {
									if (SimhashDist < 73.5) {ints[3300] = 1;}
									else {ints[3301] = 1;}
								}
							}
						} else {
							if (COrgLengthNE < 4.25) {
								if (SimhashDist < 15) {ints[3302] = 1;}
								if (SimhashDist >= 15) {
									if (TitleDist < 35.5) {ints[3303] = 1;}
									else {ints[3304] = 1;}
								}
							} else {
								if (CPerLengthNE < 6) {
									if (CKWSRatio < 0.43) {ints[3305] = 1;}
									else {ints[3306] = 1;}
								} else {
									if (CLocLengthSP < 5.75) {ints[3307] = 1;}
									else {ints[3308] = 1;}
								}
							}
						}
					}
				}
			}
		} else {
			if (TKWSRatio < 0.44) {
				if (EpochSpan < 101816.5) {
					if (CPerRatioNE < 0.32) {
						if (COrgRatioNE < 0.54) {
							if (CLocRatioSP < 0.62) {
								if (EpochSpan < 6942) {
									if (CPerRatioNE < 0.25) {ints[3309] = 1;}
									else {ints[3310] = 1;}
								} else {
									if (TLocRatioSP < 0.71) {ints[3311] = 1;}
									else {ints[3312] = 1;}
								}
							} else {
								if (TitleRatio < 0.28) {
									if (CatLength < 1.37) {ints[3313] = 1;}
									else {ints[3314] = 1;}
								} else {
									if (SimhashDist < 84) {ints[3315] = 1;}
									else {ints[3316] = 1;}
								}
							}
						} else {
							if (CNUMLengthSP < 3.75) {
								if (TitleDist < 41.5) {
									if (CKWSLength < 5.5) {ints[3317] = 1;}
									else {ints[3318] = 1;}
								} else {
									if (CKWSLength < 15.25) {ints[3319] = 1;}
									else {ints[3320] = 1;}
								}
							} else {
								if (CatLength < 1.27) {
									if (SimhashDist < 48.5) {ints[3321] = 1;}
									else {ints[3322] = 1;}
								} else {
									if (CTimLengthSP < 18.25) {ints[3323] = 1;}
									else {ints[3324] = 1;}
								}
							}
						}
					} else {
						if (CNUMRatioSP < 0.42) {
							if (CKWSRatio < 0.27) {
								if (CLocRatioSP < 0.74) {
									if (CLocRatioNE < 0.35) {ints[3325] = 1;}
									else {ints[3326] = 1;}
								} else {
									if (COrgLengthSP < 13) {ints[3327] = 1;}
									else {ints[3328] = 1;}
								}
							} else {
								if (COrgLengthNE < 23.75) {
									if (CNUMLengthSP < 15.75) {ints[3329] = 1;}
									else {ints[3330] = 1;}
								} else {
									if (CNUMRatioSP < 0.42) {ints[3331] = 1;}
									else {ints[3332] = 1;}
								}
							}
						} else {
							if (TitleLength < 11.25) {
								if (CNUMLengthSP < 30.75) {
									if (CTimLengthSP < 16.75) {ints[3333] = 1;}
									else {ints[3334] = 1;}
								} else {
									if (InsertSpan < 34839.5) {ints[3335] = 1;}
									else {ints[3336] = 1;}
								}
							} else {
								if (CPerLengthNE < 36.5) {
									if (CNUMRatioSP < 1) {ints[3337] = 1;}
									else {ints[3338] = 1;}
								} else {
									if (TitleDist < 20.5) {ints[3339] = 1;}
									else {ints[3340] = 1;}
								}
							}
						}
					}
				} else {
					if (CKWSRatio < 0.29) {
						if (CLocRatioNE < 0.54) {
							if (CNUMRatioSP < 0.65) {
								if (CPerLengthSP < 1.25) {
									if (InsertSpan < 55268.5) {ints[3341] = 1;}
									else {ints[3342] = 1;}
								} else {ints[3343] = 1;}
							} else {
								if (HKWSLength < 5.25) {ints[3344] = 1;}
								else {ints[3345] = 1;}
							}
						} else {
							if (CKWSRatio < 0.11) {ints[3346] = 1;}
							if (CKWSRatio >= 0.11) {
								if (COrgRatioSP < 0.15) {
									if (CatLength < 1.52) {ints[3347] = 1;}
									else {ints[3348] = 1;}
								} else {
									if (CWordSpan < 418) {ints[3349] = 1;}
									else {ints[3350] = 1;}
								}
							}
						}
					} else {
						if (SimhashDist < 78.5) {
							if (TKWSRatio < 0.42) {
								if (CLocLengthSP < 12.75) {
									if (TitleDist < 69.5) {ints[3351] = 1;}
									else {ints[3352] = 1;}
								} else {
									if (InsertSpan < 261990.5) {ints[3353] = 1;}
									else {ints[3354] = 1;}
								}
							} else {
								if (COrgRatioNE < 0.46) {
									if (ChannelLength < 4.75) {ints[3355] = 1;}
									else {ints[3356] = 1;}
								} else {
									if (CLocRatioNE < 0.71) {ints[3357] = 1;}
									else {ints[3358] = 1;}
								}
							}
						} else {
							if (CLocLengthNE < 13.25) {
								if (CTimLengthSP < 1.75) {
									if (COrgRatioSP < 0.37) {ints[3359] = 1;}
									else {ints[3360] = 1;}
								} else {
									if (HKWSRatio < 0.86) {ints[3361] = 1;}
									else {ints[3362] = 1;}
								}
							} else {
								if (CNUMLengthSP < 5.75) {
									if (CKWSLength < 13) {ints[3363] = 1;}
									else {ints[3364] = 1;}
								} else {
									if (EpochSpan < 290323) {ints[3365] = 1;}
									else {ints[3366] = 1;}
								}
							}
						}
					}
				}
			} else {
				if (SameSRC < 0.5) {
					if (EpochSpan < 100324) {
						if (TKWSRatio < 0.74) {
							if (TitleRatio < 0.18) {
								if (CatRatio < 0.91) {
									if (InsertSpan < 33108) {ints[3367] = 1;}
									else {ints[3368] = 1;}
								} else {
									if (COrgLengthSP < 17.5) {ints[3369] = 1;}
									else {ints[3370] = 1;}
								}
							} else {
								if (CPerLengthSP < 17.25) {
									if (CKWSLength < 9.25) {ints[3371] = 1;}
									else {ints[3372] = 1;}
								} else {
									if (InsertSpan < 84656) {ints[3373] = 1;}
									else {ints[3374] = 1;}
								}
							}
						} else {
							if (CLocRatioSP < 0.59) {
								if (CNUMLengthSP < 12.25) {
									if (ChannelRatio < 0.34) {ints[3375] = 1;}
									else {ints[3376] = 1;}
								} else {
									if (CNUMLengthSP < 13.5) {ints[3377] = 1;}
									else {ints[3378] = 1;}
								}
							} else {
								if (COrgRatioSP < 0.44) {
									if (TitleRatio < 0.29) {ints[3379] = 1;}
									else {ints[3380] = 1;}
								} else {
									if (EpochSpan < 57077.5) {ints[3381] = 1;}
									else {ints[3382] = 1;}
								}
							}
						}
					} else {
						if (InsertSpan < 251425.5) {
							if (TitleRatio < 0.22) {
								if (COrgRatioNE < 0.57) {
									if (CNUMRatioSP < 0.43) {ints[3383] = 1;}
									else {ints[3384] = 1;}
								} else {
									if (COrgLengthSP < 8.5) {ints[3385] = 1;}
									else {ints[3386] = 1;}
								}
							} else {
								if (COrgLengthNE < 27.75) {
									if (CTimLengthSP < 14.25) {ints[3387] = 1;}
									else {ints[3388] = 1;}
								} else {
									if (TitleDist < 8) {ints[3389] = 1;}
									else {ints[3390] = 1;}
								}
							}
						} else {
							if (HKWSRatio < 0.78) {
								if (ChannelRatio < 0.74) {
									if (CatLength < 0.69) {ints[3391] = 1;}
									else {ints[3392] = 1;}
								} else {
									if (SimhashDist < 50) {ints[3393] = 1;}
									else {ints[3394] = 1;}
								}
							} else {
								if (TitleRatio < 0.27) {
									if (TKWSRatio < 0.52) {ints[3395] = 1;}
									else {ints[3396] = 1;}
								} else {
									if (CTimLengthSP < 6.25) {ints[3397] = 1;}
									else {ints[3398] = 1;}
								}
							}
						}
					}
				} else {
					if (EpochSpan < 86391.5) {
						if (TitleDist < 0.5) {
							if (SimhashDist < 15.5) {ints[3399] = 1;}
							if (SimhashDist >= 15.5) {
								if (CWordSpan < 3) {ints[3400] = 1;}
								else {ints[3401] = 1;}
							}
						} else {
							if (HKWSLength < 1.75) {
								if (GeoLength < 1.25) {
									if (CatLength < 0.8) {ints[3402] = 1;}
									else {ints[3403] = 1;}
								} else {
									if (EpochSpan < 54800.5) {ints[3404] = 1;}
									else {ints[3405] = 1;}
								}
							} else {
								if (CatLength < 0.82) {
									if (TitleRatio < 0.47) {ints[3406] = 1;}
									else {ints[3407] = 1;}
								} else {
									if (CLocRatioNE < 0.91) {ints[3408] = 1;}
									else {ints[3409] = 1;}
								}
							}
						}
					} else {
						if (TitleLength < 11.75) {
							if (CatLength < 1.6) {
								if (CTimLengthSP < 20.25) {
									if (ParagraphSpan < 0.5) {ints[3410] = 1;}
									else {ints[3411] = 1;}
								} else {
									if (CKWSRatio < 0.2) {ints[3412] = 1;}
									else {ints[3413] = 1;}
								}
							} else {
								if (TKWSRatio < 1) {ints[3414] = 1;}
								if (TKWSRatio >= 1) {
									if (CWordSpan < 54.5) {ints[3415] = 1;}
									else {ints[3416] = 1;}
								}
							}
						} else {
							if (CPerRatioNE < 0.26) {
								if (CLocLengthSP < 5.25) {
									if (SimhashDist < 56.5) {ints[3417] = 1;}
									else {ints[3418] = 1;}
								} else {ints[3419] = 1;}
							} else {ints[3420] = 1;}
						}
					}
				}
			}
		}
	}
} else {
	if (InsertSpan < 252504) {
		if (CLocRatioSP < 0.99) {
			if (TKWSRatio < 0.62) {
				if (CKWSRatio < 0.27) {
					if (CKWSLength < 18.75) {
						if (TitleRatio < 0.11) {ints[3421] = 1;}
						if (TitleRatio >= 0.11) {
							if (TitleRatio < 0.61) {
								if (COrgRatioSP < 0.72) {
									if (COrgRatioSP < 0.47) {ints[3422] = 1;}
									else {ints[3423] = 1;}
								} else {
									if (CNUMLengthSP < 1.75) {ints[3424] = 1;}
									else {ints[3425] = 1;}
								}
							} else {ints[3426] = 1;}
						}
					} else {
						if (CatRatio < 0.77) {
							if (CTimRatioSP < 0.21) {ints[3427] = 1;}
							if (CTimRatioSP >= 0.21) {
								if (CKWSRatio < 0.19) {
									if (COrgRatioSP < 0.66) {ints[3428] = 1;}
									else {ints[3429] = 1;}
								} else {
									if (COrgLengthNE < 2.25) {ints[3430] = 1;}
									else {ints[3431] = 1;}
								}
							}
						} else {
							if (COrgRatioNE < 0.3) {
								if (CPerLengthNE < 33.25) {
									if (TitleRatio < 0.45) {ints[3432] = 1;}
									else {ints[3433] = 1;}
								} else {
									if (CNUMRatioSP < 0.29) {ints[3434] = 1;}
									else {ints[3435] = 1;}
								}
							} else {
								if (CNUMLengthSP < 2.25) {ints[3436] = 1;}
								if (CNUMLengthSP >= 2.25) {
									if (CatLength < 0.88) {ints[3437] = 1;}
									else {ints[3438] = 1;}
								}
							}
						}
					}
				} else {
					if (EpochSpan < 77289) {
						if (CLocRatioSP < 0.36) {
							if (ParagraphSpan < 0.5) {
								if (CNUMLengthSP < 11.5) {
									if (CKWSLength < 9.75) {ints[3439] = 1;}
									else {ints[3440] = 1;}
								} else {
									if (InsertSpan < 51248) {ints[3441] = 1;}
									else {ints[3442] = 1;}
								}
							} else {
								if (SimhashDist < 76.5) {
									if (TitleRatio < 0.25) {ints[3443] = 1;}
									else {ints[3444] = 1;}
								} else {
									if (EpochSpan < 3349.5) {ints[3445] = 1;}
									else {ints[3446] = 1;}
								}
							}
						} else {
							if (TitleRatio < 0.3) {
								if (TKWSRatio < 0.1) {
									if (CLocLengthNE < 20.5) {ints[3447] = 1;}
									else {ints[3448] = 1;}
								} else {
									if (CLocRatioSP < 0.91) {ints[3449] = 1;}
									else {ints[3450] = 1;}
								}
							} else {
								if (CLocRatioNE < 0.58) {
									if (CKWSRatio < 0.5) {ints[3451] = 1;}
									else {ints[3452] = 1;}
								} else {
									if (CWordSpan < 2.5) {ints[3453] = 1;}
									else {ints[3454] = 1;}
								}
							}
						}
					} else {
						if (CPerRatioNE < 0.39) {
							if (CLocLengthSP < 22.5) {
								if (COrgLengthNE < 5.25) {
									if (CKWSLength < 12.25) {ints[3455] = 1;}
									else {ints[3456] = 1;}
								} else {
									if (ChannelRatio < 0.05) {ints[3457] = 1;}
									else {ints[3458] = 1;}
								}
							} else {
								if (CTimRatioSP < 0.2) {ints[3459] = 1;}
								if (CTimRatioSP >= 0.2) {
									if (TKWSRatio < 0.08) {ints[3460] = 1;}
									else {ints[3461] = 1;}
								}
							}
						} else {
							if (HKWSLength < 1.75) {
								if (TitleRatio < 0.47) {
									if (CNUMRatioSP < 0.31) {ints[3462] = 1;}
									else {ints[3463] = 1;}
								} else {
									if (CNUMLengthSP < 8.25) {ints[3464] = 1;}
									else {ints[3465] = 1;}
								}
							} else {
								if (TitleDist < 41) {
									if (CKWSRatio < 0.45) {ints[3466] = 1;}
									else {ints[3467] = 1;}
								} else {
									if (CWordSpan < 608.5) {ints[3468] = 1;}
									else {ints[3469] = 1;}
								}
							}
						}
					}
				}
			} else {
				if (TitleDist < 1.5) {
					if (CNUMLengthSP < 0.75) {
						if (EpochSpan < 78099) {ints[3470] = 1;}
						if (EpochSpan >= 78099) {
							if (InsertSpan < 140755) {ints[3471] = 1;}
							else {ints[3472] = 1;}
						}
					} else {
						if (TLocLengthSP < 2.5) {
							if (ChannelLength < 4.75) {
								if (CKWSLength < 10.25) {
									if (TitleRatio < 0.96) {ints[3473] = 1;}
									else {ints[3474] = 1;}
								} else {
									if (ParagraphSpan < 27.5) {ints[3475] = 1;}
									else {ints[3476] = 1;}
								}
							} else {ints[3477] = 1;}
						} else {
							if (COrgRatioNE < 0.7) {ints[3478] = 1;}
							if (COrgRatioNE >= 0.7) {
								if (CTimLengthSP < 2.5) {ints[3479] = 1;}
								else {ints[3480] = 1;}
							}
						}
					}
				} else {
					if (SameSRC < 0.5) {
						if (TitleRatio < 0.38) {
							if (CKWSRatio < 0.33) {
								if (CPerRatioSP < 0.96) {
									if (ChannelRatio < 0.31) {ints[3481] = 1;}
									else {ints[3482] = 1;}
								} else {
									if (TKWSLength < 2.25) {ints[3483] = 1;}
									else {ints[3484] = 1;}
								}
							} else {
								if (COrgRatioSP < 0.83) {
									if (CNUMLengthSP < 27.25) {ints[3485] = 1;}
									else {ints[3486] = 1;}
								} else {
									if (CTimRatioSP < 0.7) {ints[3487] = 1;}
									else {ints[3488] = 1;}
								}
							}
						} else {
							if (CWordSpan < 5.5) {
								if (CKWSLength < 13) {
									if (GeoRatio < 0.4) {ints[3489] = 1;}
									else {ints[3490] = 1;}
								} else {
									if (CTimLengthSP < 21.5) {ints[3491] = 1;}
									else {ints[3492] = 1;}
								}
							} else {
								if (HKWSRatio < 0.96) {
									if (InsertSpan < 188864) {ints[3493] = 1;}
									else {ints[3494] = 1;}
								} else {
									if (CLocLengthSP < 2.75) {ints[3495] = 1;}
									else {ints[3496] = 1;}
								}
							}
						}
					} else {
						if (EpochSpan < 86394.5) {
							if (TitleRatio < 0.7) {
								if (CKWSRatio < 0.52) {
									if (COrgRatioNE < 0.66) {ints[3497] = 1;}
									else {ints[3498] = 1;}
								} else {
									if (CKWSLength < 14.5) {ints[3499] = 1;}
									else {ints[3500] = 1;}
								}
							} else {
								if (CatLength < 1.5) {
									if (TKWSLength < 2.25) {ints[3501] = 1;}
									else {ints[3502] = 1;}
								} else {
									if (GeoRatio < 0.83) {ints[3503] = 1;}
									else {ints[3504] = 1;}
								}
							}
						} else {
							if (CPerRatioSP < 0.82) {
								if (TitleRatio < 0.18) {ints[3505] = 1;}
								if (TitleRatio >= 0.18) {
									if (ChannelLength < 4.75) {ints[3506] = 1;}
									else {ints[3507] = 1;}
								}
							} else {
								if (TitleLength < 7.75) {
									if (SimhashDist < 61) {ints[3508] = 1;}
									else {ints[3509] = 1;}
								} else {
									if (ChannelLength < 4.25) {ints[3510] = 1;}
									else {ints[3511] = 1;}
								}
							}
						}
					}
				}
			}
		} else {
			if (SimhashDist < 30.5) {
				if (CKWSRatio < 0.98) {
					if (EpochSpan < 78330) {
						if (TitleRatio < 0.74) {
							if (ChannelLength < 1.25) {ints[3512] = 1;}
							if (ChannelLength >= 1.25) {
								if (CatLength < 0.72) {
									if (COrgRatioSP < 0.99) {ints[3513] = 1;}
									else {ints[3514] = 1;}
								} else {
									if (TPerRatioNE < 0.38) {ints[3515] = 1;}
									else {ints[3516] = 1;}
								}
							}
						} else {
							if (TKWSLength < 6.75) {
								if (COrgLengthSP < 0.75) {
									if (ParagraphSpan < 0.5) {ints[3517] = 1;}
									else {ints[3518] = 1;}
								} else {ints[3519] = 1;}
							} else {
								if (COrgLengthSP < 6.25) {
									if (ParagraphSpan < 2) {ints[3520] = 1;}
									else {ints[3521] = 1;}
								} else {ints[3522] = 1;}
							}
						}
					} else {
						if (TitleRatio < 0.93) {
							if (CLocLengthSP < 3.5) {
								if (COrgLengthNE < 2.75) {ints[3523] = 1;}
								if (COrgLengthNE >= 2.75) {
									if (CWordSpan < 50) {ints[3524] = 1;}
									else {ints[3525] = 1;}
								}
							} else {
								if (CPerRatioNE < 0.96) {ints[3526] = 1;}
								if (CPerRatioNE >= 0.96) {
									if (CWordSpan < 54) {ints[3527] = 1;}
									else {ints[3528] = 1;}
								}
							}
						} else {
							if (COrgLengthSP < 5) {ints[3529] = 1;}
							else {ints[3530] = 1;}
						}
					}
				} else {
					if (TitleLength < 2.5) {
						if (CNUMLengthSP < 9.5) {ints[3531] = 1;}
						if (CNUMLengthSP >= 9.5) {
							if (CKWSLength < 11.5) {ints[3532] = 1;}
							else {ints[3533] = 1;}
						}
					} else {
						if (CTimLengthSP < 2.5) {
							if (InsertSpan < 18164.5) {
								if (SimhashDist < 13) {ints[3534] = 1;}
								else {ints[3535] = 1;}
							} else {
								if (CLocLengthSP < 6.5) {
									if (TTimRatioSP < 0.75) {ints[3536] = 1;}
									else {ints[3537] = 1;}
								} else {
									if (InsertSpan < 21158) {ints[3538] = 1;}
									else {ints[3539] = 1;}
								}
							}
						} else {
							if (COrgLengthSP < 2.25) {
								if (InsertSpan < 31379) {ints[3540] = 1;}
								if (InsertSpan >= 31379) {
									if (GeoLength < 1.25) {ints[3541] = 1;}
									else {ints[3542] = 1;}
								}
							} else {ints[3543] = 1;}
						}
					}
				}
			} else {
				if (ChannelRatio < 0.51) {
					if (TitleLength < 6.25) {
						if (CTimLengthSP < 5.5) {
							if (TKWSRatio < 0.65) {
								if (CKWSRatio < 0.3) {ints[3544] = 1;}
								else {ints[3545] = 1;}
							} else {ints[3546] = 1;}
						} else {
							if (InsertSpan < 20131) {ints[3547] = 1;}
							if (InsertSpan >= 20131) {
								if (TitleDist < 37) {
									if (CWordSpan < 265.5) {ints[3548] = 1;}
									else {ints[3549] = 1;}
								} else {ints[3550] = 1;}
							}
						}
					} else {
						if (TitleRatio < 0.35) {
							if (InsertSpan < 4349.5) {
								if (TitleLength < 11.75) {
									if (CatRatio < 0.38) {ints[3551] = 1;}
									else {ints[3552] = 1;}
								} else {ints[3553] = 1;}
							} else {
								if (CatLength < 1.19) {
									if (CNUMLengthSP < 2.25) {ints[3554] = 1;}
									else {ints[3555] = 1;}
								} else {
									if (COrgLengthNE < 2.25) {ints[3556] = 1;}
									else {ints[3557] = 1;}
								}
							}
						} else {
							if (InsertSpan < 79086) {
								if (CTimRatioSP < 0.77) {
									if (TitleDist < 34.5) {ints[3558] = 1;}
									else {ints[3559] = 1;}
								} else {
									if (SimhashDist < 66) {ints[3560] = 1;}
									else {ints[3561] = 1;}
								}
							} else {
								if (CPerLengthNE < 32.25) {
									if (CPerRatioSP < 0.7) {ints[3562] = 1;}
									else {ints[3563] = 1;}
								} else {
									if (TKWSLength < 6.75) {ints[3564] = 1;}
									else {ints[3565] = 1;}
								}
							}
						}
					}
				} else {
					if (CWordSpan < 4.5) {
						if (CKWSLength < 8.25) {
							if (TitleLength < 5.25) {ints[3566] = 1;}
							else {ints[3567] = 1;}
						} else {
							if (TitleRatio < 0.65) {
								if (CatLength < 0.76) {ints[3568] = 1;}
								if (CatLength >= 0.76) {
									if (COrgLengthSP < 12.5) {ints[3569] = 1;}
									else {ints[3570] = 1;}
								}
							} else {
								if (CTimRatioSP < 0.66) {ints[3571] = 1;}
								if (CTimRatioSP >= 0.66) {
									if (COrgRatioSP < 0.93) {ints[3572] = 1;}
									else {ints[3573] = 1;}
								}
							}
						}
					} else {
						if (SimhashDist < 61.5) {
							if (InsertSpan < 13413) {ints[3574] = 1;}
							if (InsertSpan >= 13413) {
								if (TitleRatio < 0.88) {
									if (CatLength < 1.46) {ints[3575] = 1;}
									else {ints[3576] = 1;}
								} else {
									if (CatLength < 0.89) {ints[3577] = 1;}
									else {ints[3578] = 1;}
								}
							}
						} else {
							if (TKWSRatio < 0.62) {
								if (TitleRatio < 0.41) {
									if (CatLength < 1.3) {ints[3579] = 1;}
									else {ints[3580] = 1;}
								} else {ints[3581] = 1;}
							} else {
								if (CPerLengthNE < 1.5) {
									if (CKWSRatio < 0.67) {ints[3582] = 1;}
									else {ints[3583] = 1;}
								} else {
									if (HKWSLength < 0.75) {ints[3584] = 1;}
									else {ints[3585] = 1;}
								}
							}
						}
					}
				}
			}
		}
	} else {
		if (TitleRatio < 0.42) {
			if (EpochSpan < 681086.5) {
				if (CKWSLength < 17.75) {
					if (CNUMLengthSP < 3.25) {
						if (InsertSpan < 650282) {
							if (CLocLengthSP < 1.25) {
								if (ParagraphSpan < 1.5) {ints[3586] = 1;}
								if (ParagraphSpan >= 1.5) {
									if (CatRatio < 0.84) {ints[3587] = 1;}
									else {ints[3588] = 1;}
								}
							} else {
								if (CPerRatioNE < 0.5) {
									if (CTimRatioSP < 0.46) {ints[3589] = 1;}
									else {ints[3590] = 1;}
								} else {
									if (EpochSpan < 603507.5) {ints[3591] = 1;}
									else {ints[3592] = 1;}
								}
							}
						} else {
							if (TKWSLength < 3.25) {ints[3593] = 1;}
							else {ints[3594] = 1;}
						}
					} else {
						if (TOrgRatioSP < 0.88) {
							if (TitleRatio < 0.28) {ints[3595] = 1;}
							if (TitleRatio >= 0.28) {
								if (TitleRatio < 0.31) {
									if (TPerRatioSP < 0.88) {ints[3596] = 1;}
									else {ints[3597] = 1;}
								} else {ints[3598] = 1;}
							}
						} else {
							if (EpochSpan < 291387) {
								if (TitleLength < 10.25) {
									if (TitleDist < 25) {ints[3599] = 1;}
									else {ints[3600] = 1;}
								} else {ints[3601] = 1;}
							} else {ints[3602] = 1;}
						}
					}
				} else {
					if (ChannelRatio < 0.73) {
						if (CatLength < 1.47) {
							if (COrgLengthSP < 26) {
								if (EpochSpan < 421798.5) {
									if (CPerLengthNE < 11.75) {ints[3603] = 1;}
									else {ints[3604] = 1;}
								} else {
									if (CPerRatioNE < 0.44) {ints[3605] = 1;}
									else {ints[3606] = 1;}
								}
							} else {
								if (CPerRatioNE < 0.13) {ints[3607] = 1;}
								else {ints[3608] = 1;}
							}
						} else {
							if (CLocRatioSP < 0.43) {
								if (COrgLengthSP < 5.75) {ints[3609] = 1;}
								else {ints[3610] = 1;}
							} else {
								if (TLocLengthSP < 2.25) {ints[3611] = 1;}
								else {ints[3612] = 1;}
							}
						}
					} else {
						if (CLocLengthNE < 2.25) {ints[3613] = 1;}
						if (CLocLengthNE >= 2.25) {
							if (COrgLengthNE < 16.75) {ints[3614] = 1;}
							if (COrgLengthNE >= 16.75) {
								if (CWordSpan < 191.5) {ints[3615] = 1;}
								else {ints[3616] = 1;}
							}
						}
					}
				}
			} else {
				if (TitleDist < 99.5) {
					if (CPerRatioNE < 0.91) {
						if (CNUMLengthSP < 5.75) {
							if (COrgRatioSP < 0.91) {
								if (EpochSpan < 870322) {
									if (COrgLengthNE < 0.75) {ints[3617] = 1;}
									else {ints[3618] = 1;}
								} else {ints[3619] = 1;}
							} else {
								if (InsertSpan < 1066559.5) {
									if (TitleRatio < 0.15) {ints[3620] = 1;}
									else {ints[3621] = 1;}
								} else {ints[3622] = 1;}
							}
						} else {
							if (InsertSpan < 1256753) {
								if (ChannelRatio < 0.42) {
									if (CTimLengthSP < 5.25) {ints[3623] = 1;}
									else {ints[3624] = 1;}
								} else {
									if (CNUMLengthSP < 14.25) {ints[3625] = 1;}
									else {ints[3626] = 1;}
								}
							} else {
								if (CNUMRatioSP < 0.19) {ints[3627] = 1;}
								if (CNUMRatioSP >= 0.19) {
									if (CWordSpan < 244.5) {ints[3628] = 1;}
									else {ints[3629] = 1;}
								}
							}
						}
					} else {
						if (EpochSpan < 25928482.5) {
							if (TKWSRatio < 0.89) {
								if (CLocRatioNE < 0.56) {
									if (CKWSRatio < 0.38) {ints[3630] = 1;}
									else {ints[3631] = 1;}
								} else {
									if (CKWSLength < 7.5) {ints[3632] = 1;}
									else {ints[3633] = 1;}
								}
							} else {
								if (ChannelRatio < 0.58) {ints[3634] = 1;}
								else {ints[3635] = 1;}
							}
						} else {ints[3636] = 1;}
					}
				} else {
					if (TitleLength < 14.5) {ints[3637] = 1;}
					else {ints[3638] = 1;}
				}
			}
		} else {
			if (EpochSpan < 254719) {
				if (CLocLengthSP < 20.75) {
					if (CNUMRatioSP < 0.57) {
						if (CNUMLengthSP < 9.25) {
							if (CatLength < 0.7) {
								if (ChannelRatio < 0.29) {ints[3639] = 1;}
								else {ints[3640] = 1;}
							} else {ints[3641] = 1;}
						} else {
							if (CWordSpan < 9.5) {ints[3642] = 1;}
							if (CWordSpan >= 9.5) {
								if (SameSRC < 0.5) {
									if (TitleRatio < 0.54) {ints[3643] = 1;}
									else {ints[3644] = 1;}
								} else {ints[3645] = 1;}
							}
						}
					} else {ints[3646] = 1;}
				} else {
					if (ParagraphSpan < 13.5) {
						if (ChannelRatio < 0.62) {ints[3647] = 1;}
						if (ChannelRatio >= 0.62) {
							if (CWordSpan < 137) {ints[3648] = 1;}
							if (CWordSpan >= 137) {
								if (CatLength < 0.87) {ints[3649] = 1;}
								else {ints[3650] = 1;}
							}
						}
					} else {ints[3651] = 1;}
				}
			} else {
				if (CPerRatioNE < 0.65) {
					if (CTimLengthSP < 4.75) {
						if (CLocLengthSP < 2.25) {
							if (CPerLengthNE < 5.25) {
								if (ChannelRatio < 0.78) {
									if (EpochSpan < 551606.5) {ints[3652] = 1;}
									else {ints[3653] = 1;}
								} else {
									if (COrgLengthSP < 3.5) {ints[3654] = 1;}
									else {ints[3655] = 1;}
								}
							} else {
								if (CatLength < 0.88) {ints[3656] = 1;}
								if (CatLength >= 0.88) {
									if (TKWSLength < 3.75) {ints[3657] = 1;}
									else {ints[3658] = 1;}
								}
							}
						} else {
							if (ChannelLength < 3.75) {
								if (SameSRC < 0.5) {ints[3659] = 1;}
								if (SameSRC >= 0.5) {
									if (CatLength < 0.91) {ints[3660] = 1;}
									else {ints[3661] = 1;}
								}
							} else {ints[3662] = 1;}
						}
					} else {
						if (CKWSRatio < 0.6) {
							if (EpochSpan < 751096) {
								if (ChannelLength < 3.25) {
									if (TitleRatio < 0.45) {ints[3663] = 1;}
									else {ints[3664] = 1;}
								} else {
									if (COrgRatioSP < 0.77) {ints[3665] = 1;}
									else {ints[3666] = 1;}
								}
							} else {
								if (CNUMRatioSP < 0.42) {ints[3667] = 1;}
								if (CNUMRatioSP >= 0.42) {
									if (CKWSRatio < 0.48) {ints[3668] = 1;}
									else {ints[3669] = 1;}
								}
							}
						} else {
							if (TitleDist < 6) {
								if (CNUMLengthSP < 3.25) {ints[3670] = 1;}
								if (CNUMLengthSP >= 3.25) {
									if (TKWSLength < 1.5) {ints[3671] = 1;}
									else {ints[3672] = 1;}
								}
							} else {
								if (CLocLengthSP < 3.25) {
									if (TitleLength < 15.25) {ints[3673] = 1;}
									else {ints[3674] = 1;}
								} else {ints[3675] = 1;}
							}
						}
					}
				} else {
					if (CPerLengthNE < 2.25) {
						if (SimhashDist < 18.5) {
							if (CKWSLength < 7.5) {ints[3676] = 1;}
							else {ints[3677] = 1;}
						} else {
							if (COrgRatioNE < 0.35) {
								if (EpochSpan < 518130) {
									if (HKWSRatio < 0.83) {ints[3678] = 1;}
									else {ints[3679] = 1;}
								} else {
									if (HKWSLength < 1.25) {ints[3680] = 1;}
									else {ints[3681] = 1;}
								}
							} else {
								if (TKWSRatio < 1) {
									if (ChannelLength < 2.25) {ints[3682] = 1;}
									else {ints[3683] = 1;}
								} else {
									if (CWordSpan < 3.5) {ints[3684] = 1;}
									else {ints[3685] = 1;}
								}
							}
						}
					} else {
						if (CKWSLength < 17.25) {
							if (ParagraphSpan < 0.5) {
								if (CLocLengthNE < 1.5) {
									if (TKWSLength < 2.25) {ints[3686] = 1;}
									else {ints[3687] = 1;}
								} else {
									if (CKWSLength < 8.25) {ints[3688] = 1;}
									else {ints[3689] = 1;}
								}
							} else {
								if (CatRatio < 0.78) {
									if (COrgLengthSP < 5.75) {ints[3690] = 1;}
									else {ints[3691] = 1;}
								} else {
									if (CPerRatioSP < 0.76) {ints[3692] = 1;}
									else {ints[3693] = 1;}
								}
							}
						} else {
							if (SimhashDist < 63.5) {
								if (SameSRC < 0.5) {
									if (ParagraphSpan < 35) {ints[3694] = 1;}
									else {ints[3695] = 1;}
								} else {
									if (TLocRatioSP < 0.38) {ints[3696] = 1;}
									else {ints[3697] = 1;}
								}
							} else {
								if (CNUMLengthSP < 13.75) {
									if (TitleDist < 53.5) {ints[3698] = 1;}
									else {ints[3699] = 1;}
								} else {ints[3700] = 1;}
							}
						}
					}
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