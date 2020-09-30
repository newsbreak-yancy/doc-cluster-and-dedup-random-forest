package com.nb.randomforest.utils;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;

/**
 * @author yuxi
 * @date 2020/9/28
 */
public class MongoUtils {
	
	public static MongoCollection<Document> collectionStatic;
	
	public static MongoCollection<Document> collectionCenter;
	
	public static BasicDBObject fields = new BasicDBObject();
	
	private static String rootDir = "/Users/yuxi/NB/RandomForest/_local";
	
	private static List<String> filePaths = new ArrayList<>();
	
	static {
		String uriStatic = "mongodb://172.24.25.74/staticFeature";
		MongoClient clientStatic = MongoClients.create(uriStatic);
		MongoDatabase dbStatic = clientStatic.getDatabase("staticFeature");
		collectionStatic = dbStatic.getCollection("document");
		
		String uriCenter = "mongodb://172.31.16.143/docenter";
		MongoClient clientCenter = MongoClients.create(uriCenter);
		MongoDatabase dbCenter = clientCenter.getDatabase("docenter");
		collectionCenter = dbCenter.getCollection("document");
		
		fields.append("_id", 1).append("stitle",1).append("src",1)
			.append("c_word", 1).append("epoch", 1).append("paragraph_count",1)
			.append("simhash", 1).append("kws", 1).append("channels_v2",1)
			.append("ne_content_organization",1).append("ne_content_person",1).append("ne_content_location",1)
			.append("ne_title_location",1).append("ne_title_organization",1).append("ne_title_person",1)
			.append("text_category_v2",1).append("geotag_v2",1);
		
		filePaths.add(Paths.get(rootDir, "estimate/doc_pair_0903").toAbsolutePath().toString());
		filePaths.add(Paths.get(rootDir, "estimate/doc_pair_0911").toAbsolutePath().toString());
		filePaths.add(Paths.get(rootDir, "estimate/doc_pair_0914").toAbsolutePath().toString());
		filePaths.add(Paths.get(rootDir, "estimate/doc_pair_0928").toAbsolutePath().toString());
		filePaths.add(Paths.get(rootDir, "append/doc_pair_0928").toAbsolutePath().toString());
	}
	
	
	public static void extractDocFields(File docPair) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(docPair));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(docPair.getAbsolutePath() + "_fields")));
		String line = null;
		while ((line = br.readLine()) != null) {
			String[] datas = line.split("\t");
			String docIDm = datas[0];
			String docIDc = datas[1];
			
			Document docMaster = collectionStatic.find(eq("_id", docIDm)).projection(fields).first();
			Document docCandit = collectionStatic.find(eq("_id", docIDc)).projection(fields).first();
			bw.write(line);
			System.out.println(line);
			if (docMaster != null && docCandit != null) {
				bw.write("\t");
				bw.write("SUCCESS");
				bw.write("\t");
				bw.write(docMaster.toJson());
				bw.write("\t");
				bw.write(docCandit.toJson());
				bw.write("\n");
			} else {
				bw.write("\t");
				bw.write("FAILED");
				bw.write("\n");
			}
		}
		bw.close();
	}
	
	
	public static void main(String[] args) throws Exception {
		for (String filePath : filePaths) {
			extractDocFields(new File(filePath));
		}
	}
}
