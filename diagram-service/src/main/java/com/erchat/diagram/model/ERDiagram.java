package com.erchat.diagram.model;

import java.util.List;

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
	private List<Element> elements;
}

@Data
class Element {
	private String id;
	private String shape;
	private Position position;
	private Size size;
	private int zIndex;
	private NodeData data;
}

@Data
class Position {
	private int x;
	private int y;
}

@Data
class Size {
	private int width;
	private int height;
}

@Data
class NodeData {
	private String tableName;
	private String tableComment;
	private List<Field> fields;
}

@Data
class Field {
	private String name;
	private String type;
	private String comment;
}