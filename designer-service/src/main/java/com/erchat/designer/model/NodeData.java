package com.erchat.designer.model;

import java.util.List;

/**
 * @author oYang
 * @Description 节点数据
 * @createTime 2024年11月11日 11:11:00
 */
public class NodeData {
	private String tableName;
	private String tableDesc;
	private List<Field> fields;
}

class Field{
	private String name;
	private String type;
	private String comment;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
