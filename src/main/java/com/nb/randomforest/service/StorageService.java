package com.nb.randomforest.service;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import lombok.extern.slf4j.Slf4j;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.in;

/**
 * @author yuxi
 * @date 2020/8/24
 */
@Slf4j
@Service
public class StorageService {
	
	@Autowired
	MongoCollection<Document> collection;
	
	public List<String> findDocInfos(List<String> idList) {
		List<String> ids = new ArrayList<>();
		MongoCursor<Document> cursor = collection.find(in("_id", idList.toArray())).projection(new BasicDBObject()
			.append("_id", 1).append("stitle", 1).append("src", 1)
			.append("c_word", 1).append("epoch", 1).append("paragraph_count", 1)
			.append("simhash", 1).append("kws", 1)
			.append("ne_content_organization", 1).append("ne_title_organization", 1)
			.append("ne_content_person", 1).append("ne_title_person", 1)
			.append("ne_content_location", 1).append("ne_title_location", 1)
			.append("channels", 1).append("channels_v2", 1)
			.append("text_category", 1).append("text_category_v2", 1)
			.append("geotag", 1).append("geotag_v2", 1)).cursor();
		while (cursor.hasNext()) {
			Document d = cursor.next();
			ids.add(d.getString("_id"));
		}
		return ids;
	}
}
