package com.erchat.diagram.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erchat.diagram.dto.DiagramCardDTO;
import com.erchat.diagram.model.Diagram;
import com.erchat.diagram.model.ERDiagram;
import com.erchat.diagram.vo.DiagramCardVO;

/**
 * @author oYang
 * @Description 设计器服务
 * @createTime 2024年11月06日 17:04:00
 */
public interface IDiagramService extends IService<Diagram> {

	void save(ERDiagram erDiagram);

	ERDiagram queryDiagramById(String diagramId);

	String createDiagramCard(DiagramCardDTO diagramCardDTO);

	List<DiagramCardVO> queryDiagramListByProjectId(String projectId);

	void deleteDiagramByProjectId(String projectId);
}
