package com.erchat.designer.dto;

import java.io.Serializable;
import java.util.List;

import com.erchat.designer.model.ERNode;

/**
 * @author oYang
 * @Description 保存时的参数
 * @createTime 2024年11月11日 11:28:00
 */
public class SaveDTO implements Serializable {

	private static final long serialVersionUID = -7174391187367969984L;

	private List<ERNode> nodes;

	public List<ERNode> getNodes() {
		return nodes;
	}

	public void setNodes(List<ERNode> nodes) {
		this.nodes = nodes;
	}
}
