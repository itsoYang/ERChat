package com.erchat.diagram.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erchat.common.domain.APIResponse;
import com.erchat.diagram.dto.DiagramCardDTO;
import com.erchat.diagram.model.ERDiagram;
import com.erchat.diagram.service.IDiagramService;
import com.erchat.diagram.vo.DiagramCardVO;

import lombok.RequiredArgsConstructor;

/**
 * @author oYang
 * @Description 设计器控制层
 * @createTime 2024年11月11日 11:18:00
 */
@RestController
@RequestMapping("/diagram")
@RequiredArgsConstructor
public class DiagramController {

	private final IDiagramService diagramService;

	@PostMapping("/save")
	public APIResponse<Object> save(String projectId, String name, String visibility, @RequestBody ERDiagram erDiagram){
		diagramService.save(erDiagram);

		return APIResponse.success("保存成功");
	}

	/**
	 * 创建ER图描述卡片
	 * @param diagramCardDTO ER图描述卡片信息
	 * @return diagramId
	 */
	@PostMapping("/card")
	public APIResponse<Object> diagramCreate(@RequestBody DiagramCardDTO diagramCardDTO){
		String diagramId = diagramService.createDiagramCard(diagramCardDTO);

		return APIResponse.success("创建成功", diagramId);
	}

	/**
	 * 查询项目下所有ER图描述卡片
	 * @param projectId 项目id
	 * @return DiagramListVO
	 */
	@GetMapping("/card/{projectId}")
	public APIResponse<Object> diagramsQuery(@PathVariable String projectId){
		List<DiagramCardVO> listOfDiagramCard = diagramService.queryDiagramListByProjectId(projectId);

		return APIResponse.success(listOfDiagramCard);
	}

	@DeleteMapping("/{projectId}")
	public APIResponse<Object> deleteDiagramByProjectId(@PathVariable("projectId") String projectId){
		try {
			diagramService.deleteDiagramByProjectId(projectId);
		} catch (Exception e) {
			return APIResponse.error("删除失败");
		}

		return APIResponse.success("删除成功");
	}
}
