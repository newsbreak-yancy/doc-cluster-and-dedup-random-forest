package com.nb.randomforest.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yuxi
 * @date 2020/12/25
 * depth 3
 * a<1
 * |   b<1
 * |   |   c<1
 * |   |   c>=1
 * |   b>=1
 * |   |   e<1
 * |   |   e>=1
 * a>=1
 * |   d<1
 *
 *
 * int[] ints = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
 * if (a < 1) {
 *    if (b < 1) {
 *        if (c < 1) {ints[0] = 1;}
 *        else {ints[1] = 1;}
 *    } else {
 *        if (e < 1) {ints[2] = 1;
 *        } else {ints[3] = 1;}
 *    }
 * } else {
 *    if (d < 1) {
 *        ints[4] = 1;
 *    }
 * }
 * @note :
 * last_depth < curt_depth : 判断
 * last_depth = curt_depth :
 * last_depth < curt_depth : 收尾
 */
public class LocalTest {
	
	
	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		//已知深度 + 几颗树
		List<String> lines = new ArrayList<>();
		lines.add("RandomTree");
		lines.add("==========");
		lines.add("          ");
		lines.add("a<1");
		lines.add("|   b<1");
		lines.add("|   |   c<1 : EVENT (19.77/7.77)");
		lines.add("|   |   c>=1 : EVENT (19.77/7.77)");
		lines.add("|   b>=1");
		lines.add("|   |   e<1 : EVENT (19.77/7.77)");
		lines.add("|   |   e>=1 : EVENT (19.77/7.77)");
		lines.add("a>=1");
		//FIXED : (curtDepth > lastDepth && isOut)
//		lines.add("|   d<1");
//		lines.add("|   |   f<1 : EVENT (19.77/7.77)");
		//FIXED : (curtDepth > lastDepth && isOut)
//		lines.add("|   d<1 : EVENT (19.77/7.77)");
//		//FIXED : (curtDepth < lastDepth && isOut)
		lines.add("|   d<1");
		lines.add("|   |   f<1 : EVENT (19.77/7.77)");
		lines.add("|   |   f>=1 : EVENT (19.77/7.77)");
		lines.add("|   d>1 : EVENT (19.77/7.77)");
		
		lines.add("RandomTree");
		lines.add("==========");
		lines.add("          ");
		lines.add("a<1");
		lines.add("|   b<1");
		lines.add("|   |   c<1 : EVENT (19.77/7.77)");
		lines.add("|   |   c>=1 : EVENT (19.77/7.77)");
		lines.add("|   b>=1");
		lines.add("|   |   e<1 : EVENT (19.77/7.77)");
		lines.add("|   |   e>=1 : EVENT (19.77/7.77)");
		lines.add("a>=1");
		lines.add("|   d<1");
		lines.add("|   |   f<1 : EVENT (19.77/7.77)");
		lines.add("|   |   f>=1 : EVENT (19.77/7.77)");
		lines.add("|   d>1 : EVENT (19.77/7.77)");
		StringBuilder sb = new StringBuilder();
		
		int lastDepth = 0;
		int curtDepth = 0;
		int lastTree = 1;//第一颗树初始化
		int curtTree = 0;
		int index = 0;
		for (String line : lines) {
			if (line.contains("<") || line.contains(">")) {
				lastDepth = curtDepth;
				String[] strs = line.split("\\|   ");
				curtDepth = strs.length;
				line = strs[curtDepth - 1];
				boolean isOut = false;
				if (line.contains(" : ")) {
					isOut = true;
					line = line.split(" : ")[0];
				}
				//
				if (curtDepth > lastDepth && !isOut) {//判断逻辑
					for (int i = 1; i < curtDepth; i++) {
						sb.append("\t");
					}
					sb.append("if (");
					sb.append(line);
					sb.append(") {\n");
				} else if (curtDepth > lastDepth && isOut) {
					for (int i = 1; i < curtDepth; i++) {
						sb.append("\t");
					}
					sb.append("if (");
					sb.append(line);
					sb.append(") {");
					sb.append("ints[" + 1 + "] = 1;}\n");
				} else if (curtDepth == lastDepth && isOut) {
					for (int i = 1; i < curtDepth; i++) {
						sb.append("\t");
					}
					sb.append("else {");
					sb.append("ints[" + 1 + "] = 1;}\n");
				} else if (curtDepth == lastDepth && !isOut) {
					for (int i = 1; i < curtDepth; i++) {
						sb.append("\t");
					}
					sb.append("if (");
					sb.append(line);
					sb.append(") {\n");
				} else if (curtDepth < lastDepth && !isOut) {//curtDepth < lastDepth 收尾 + 是否为新树?
					if (curtTree != lastTree) {
						lastTree = curtTree;
						for (int j = 0; j < (lastDepth - curtDepth); j++) {
							for (int i = 0; i < (lastDepth - 2 - j); i++) {
								sb.append("\t");
							}
							sb.append("}\n");
						}
						sb.append("if (");
						sb.append(line);
						sb.append(") {\n");
					} else {
						for (int j = 0; j < (lastDepth - curtDepth); j++) {
							for (int i = 0; i < (lastDepth - j - 2); i++) {
								sb.append("\t");
							}
							if (lastDepth - j - curtDepth == 1) {
								sb.append("} else {\n");
							} else {
								sb.append("}\n");
							}
						}
					}
				} else if (curtDepth < lastDepth && isOut) {
					if (curtTree != lastTree) {
						lastTree = curtTree;
						for (int j = 0; j < (lastDepth - curtDepth); j++) {
							for (int i = 0; i < (lastDepth - 2 - j); i++) {
								sb.append("\t");
							}
							sb.append("}\n");
						}
						sb.append("if (");
						sb.append(line);
						sb.append(") {\n");
					} else {
						for (int j = 0; j < (lastDepth - curtDepth); j++) {
							for (int i = 0; i < (lastDepth - j - 2); i++) {
								sb.append("\t");
							}
							if (lastDepth - j - curtDepth == 1) {
								sb.append("} else {ints[" + 1 + "] = 1;}\n");
							} else {
								sb.append("}\n");
							}
						}
					}
				}
			} else if ("RandomTree".equals(line)) {
				//决策树索引及位置索引初始化
				curtTree += 1;
				index = 0;
			}
		}
		lastDepth = curtDepth;
		curtDepth = 1;
		for (int j = 0; j < (lastDepth - curtDepth); j++) {
			for (int i = 0; i < (lastDepth - 2 - j); i++) {
				sb.append("\t");
			}
			sb.append("}\n");
		}
		System.out.println(sb.toString());
	}
	
}
	
