package com.erchat.diagram.dto;

import java.io.Serializable;
import java.util.List;

import com.erchat.diagram.model.ERDiagram;

/**
 * @author oYang
 * @Description 保存时的参数
 * @createTime 2024年11月11日 11:28:00
 */
public class SaveDTO implements Serializable {

	private static final long serialVersionUID = -7174391187367969984L;

	private List<ERDiagram> nodes;

	public List<ERDiagram> getNodes() {
		return nodes;
	}

	public void setNodes(List<ERDiagram> nodes) {
		this.nodes = nodes;
	}
}
