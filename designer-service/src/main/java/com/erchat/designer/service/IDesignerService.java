package com.erchat.designer.service;

import java.util.List;

import com.erchat.designer.dto.SaveDTO;
import com.erchat.designer.model.ERNode;

/**
 * @author oYang
 * @Description 设计器服务
 * @createTime 2024年11月06日 17:04:00
 */
public interface IDesignerService {

	void save(List<ERNode> erNodes);

}
