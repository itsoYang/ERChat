package com.erchat.designer.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

/**
 * @author oYang
 * @Description ER节点
 * @createTime 2024年11月11日 10:13:00
 */
@Document(collection = "er_node")
public class ERNode {
	@MongoId
	private String id;
	private Position position;
	private NodeSize nodeSize;
	private Long zIndex;
	private NodeData nodeData;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public NodeSize getNodeSize() {
		return nodeSize;
	}

	public void setNodeSize(NodeSize nodeSize) {
		this.nodeSize = nodeSize;
	}

	public Long getzIndex() {
		return zIndex;
	}

	public void setzIndex(Long zIndex) {
		this.zIndex = zIndex;
	}

	public NodeData getNodeData() {
		return nodeData;
	}

	public void setNodeData(NodeData nodeData) {
		this.nodeData = nodeData;
	}
}
