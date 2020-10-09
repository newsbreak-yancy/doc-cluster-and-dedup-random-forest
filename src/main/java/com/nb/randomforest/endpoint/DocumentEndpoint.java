package com.nb.randomforest.endpoint;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.nb.randomforest.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author yuxi
 * @date 2020/10/9
 */
@RestController
@RequestMapping(name = "document", path = "/document")
public class DocumentEndpoint {
	
	@Autowired
	ObjectMapper objectMapper;
	
	@Autowired
	DocumentService documentService;
	
	
	/**
	 *
	 */
	@RequestMapping(method = POST)
	List<Integer> calCandidatesClusterInfo(
		@RequestBody Map<String, Object> postBody
	) {
		JsonNode masterNode = objectMapper.valueToTree(postBody.get("master"));
		JsonNode canditNode = objectMapper.valueToTree(postBody.get("candit"));
		return documentService.calCandidatesClusterInfo(masterNode, canditNode);
	}
}
