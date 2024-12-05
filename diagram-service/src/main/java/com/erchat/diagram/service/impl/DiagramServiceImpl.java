package com.erchat.diagram.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.erchat.diagram.constant.DiagramVisibility;
import com.erchat.diagram.dto.DiagramCardDTO;
import com.erchat.diagram.mapper.IDiagramMapper;
import com.erchat.diagram.model.Diagram;
import com.erchat.diagram.model.ERDiagram;
import com.erchat.diagram.service.IDiagramService;
import com.erchat.diagram.vo.DiagramCardVO;

import org.springframework.beans.BeanUtils;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Transactional
@RequiredArgsConstructor
@Service
public class DiagramServiceImpl extends ServiceImpl<IDiagramMapper, Diagram> implements IDiagramService {

    private final MongoTemplate mongoTemplate;

    @Override
    public void save(ERDiagram erDiagram) {
		// TODO 1.插入表 diagrams

		// 2. 图元素信息插入 MongoDB
		mongoTemplate.insert(erDiagram);
    }

	@Override
	public String createDiagramCard(DiagramCardDTO diagramCardDTO) {
		Diagram diagram = new Diagram();
		BeanUtils.copyProperties(diagramCardDTO, diagram);

		// TODO 获取当前用户
		diagram.setCreateUser("admin");
		LocalDateTime now = LocalDateTime.now();
		diagram.setCreateTime(now);
		diagram.setUpdateTime(now);

		Integer code = DiagramVisibility.getCodeByName(diagramCardDTO.getVisibility());
		diagram.setVisibility(code);

		save(diagram);

		return diagram.getId();
	}

	@Override
	public List<DiagramCardVO> queryDiagramListByProjectId(String projectId) {
		QueryWrapper<Diagram> queryWrapper = new QueryWrapper<Diagram>().eq("project_id", projectId);
		List<Diagram> listOfDiagram = list(queryWrapper);
		return listOfDiagram.stream().map(diagram -> {
			DiagramCardVO diagramListVO = new DiagramCardVO();
			BeanUtils.copyProperties(diagram, diagramListVO);
			diagramListVO.setThumbnail("");
			String label = DiagramVisibility.getNameByCode(diagram.getVisibility());
			diagramListVO.setVisibility(label);
			return diagramListVO;
		}).collect(Collectors.toList());
	}

	@Override
	public void deleteDiagramByProjectId(String projectId) {
		// TODO 查询出所有 diagramId 根据diagramId 删除MongoDB中的数据
		remove(new QueryWrapper<Diagram>().eq("project_id", projectId));
	}

}
