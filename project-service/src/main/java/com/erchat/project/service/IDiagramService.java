package com.erchat.project.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erchat.project.dto.DiagramSaveDTO;
import com.erchat.project.model.Diagram;
import com.erchat.project.vo.DiagramListVO;

public interface IDiagramService extends IService<Diagram> {

    String diagramCreate(DiagramSaveDTO diagramSaveDTO);

	List<DiagramListVO> queryDiagramListByProjectId(String projectId);
}
