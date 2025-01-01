package com.erchat.diagram.model;

import java.util.List;

import cn.hutool.json.JSONObject;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.Data;

/**
 * @author oYang
 * @Description ER节点
 * @createTime 2024年11月11日 10:13:00
 */
@Document(collection = "ERDiagram")
@Data
public class ERDiagram {
	@MongoId
	private String id;
	private String diagramName;
	private List<JSONObject> elements;
}