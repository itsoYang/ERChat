package com.erchat.project.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.erchat.project.constant.DiagramVisibility;
import com.erchat.project.dto.DiagramSaveDTO;
import com.erchat.project.mapper.IDiagramMapper;
import com.erchat.project.model.Diagram;
import com.erchat.project.service.IDiagramService;
import com.erchat.project.vo.DiagramListVO;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DiagramServiceImpl extends ServiceImpl<IDiagramMapper, Diagram> implements IDiagramService {

	@Override
	public String diagramCreate(DiagramSaveDTO diagramSaveDTO) {
		Diagram diagram = new Diagram();
		BeanUtils.copyProperties(diagramSaveDTO, diagram);

		// TODO 获取当前用户
		diagram.setCreateUser("admin");
		LocalDateTime now = LocalDateTime.now();
		diagram.setCreateTime(now);
		diagram.setUpdateTime(now);

		Integer code = DiagramVisibility.getCodeByName(diagramSaveDTO.getVisibility());
		diagram.setVisibility(code);

		save(diagram);

		return diagram.getId();
	}

	@Override
	public List<DiagramListVO> queryDiagramListByProjectId(String projectId) {
		QueryWrapper<Diagram> queryWrapper = new QueryWrapper<Diagram>().eq("project_id", projectId);
		List<Diagram> listOfDiagram = list(queryWrapper);
		return listOfDiagram.stream().map(diagram -> {
			DiagramListVO diagramListVO = new DiagramListVO();
			BeanUtils.copyProperties(diagram, diagramListVO);
			diagramListVO.setThumbnail("");
			String label = DiagramVisibility.getNameByCode(diagram.getVisibility());
			diagramListVO.setVisibility(label);
			return diagramListVO;
		}).collect(Collectors.toList());
	}
}
