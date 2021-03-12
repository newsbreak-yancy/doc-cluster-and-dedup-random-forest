package com.nb.randomforest.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import lombok.extern.slf4j.Slf4j;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;

import static com.mongodb.client.model.Filters.in;

/**
 * @author yuxi
 * @date 2020/8/24
 */
@Slf4j
@Service
public class StorageService {
	
	@Autowired
	ObjectMapper mapper;
	
	@Autowired
	MongoCollection<Document> collection;
	
	public Map<String, JsonNode> findDocInfos(String mID, List<String> cIDs) {
		Map<String, JsonNode> docNodes = new HashMap<>();
		Set<String> ids = new HashSet<>();
		ids.add(mID);
		ids.addAll(cIDs);
		MongoCursor<Document> cursor = collection.find(in("_id", ids)).projection(new BasicDBObject()
			.append("_id", 1)
			.append("stitle", 1).append("seg_title", 1)
			.append("src", 1)
			.append("c_word", 1)
			.append("paragraph_count", 1)
			.append("epoch", 1).append("insert_time", 1)
			.append("simhash", 1).append("images_phash", 1).append("faces_phash", 1)
			.append("kws", 1).append("kw_title", 1).append("highlightkeyword_list", 1)
			.append("channels", 1).append("channels_v2", 1)
			// Content : ORG, LOC, PER, NUM, TIM
			.append("ne_content_organization", 1).append("spacy_content_org", 1)
			.append("ne_content_location", 1).append("spacy_content_loc", 1)
			.append("ne_content_person", 1).append("spacy_content_per", 1)
			.append("spacy_content_num", 1)
			.append("spacy_content_tim", 1)
			// Title   : ORG, LOC, PER, NUM, TIM
			.append("ne_title_organization", 1).append("spacy_title_org", 1)
			.append("ne_title_location", 1).append("spacy_title_loc", 1)
			.append("ne_title_person", 1).append("spacy_title_per", 1)
			.append("spacy_title_num", 1)
			.append("spacy_title_tim", 1)
			.append("text_category", 1).append("text_category_v2", 1)
			.append("geotag", 1).append("geotag_v2", 1)
			.append("url", 1)).cursor();
		while (cursor.hasNext()) {
			Document doc = cursor.next();
			try {
				docNodes.put(doc.getString("_id"), mapper.readTree(doc.toJson()));
			} catch (IOException e) {
				log.info("EXCEPTION : findDocInfos : " + doc.getString("_id"));
			}
		}
		return docNodes;
	}
}
