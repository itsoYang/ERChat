package com.erchat.project.controller;

import java.util.List;

import com.erchat.common.domain.APIResponse;
import com.erchat.project.dto.DiagramSaveDTO;
import com.erchat.project.service.IDiagramService;
import com.erchat.project.vo.DiagramListVO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/diagram")
@RequiredArgsConstructor
public class DiagramController {

	private final IDiagramService diagramService;

    @PostMapping("/save")
    public APIResponse<Object> diagramCreate(@RequestBody DiagramSaveDTO diagramSaveDTO){
		String diagramId = diagramService.diagramCreate(diagramSaveDTO);

		return APIResponse.success("创建成功", diagramId);
    }

	@GetMapping("/list/{projectId}")
	public APIResponse<Object> diagramsQuery(@PathVariable String projectId){
		List<DiagramListVO> listOfDiagrams = diagramService.queryDiagramListByProjectId(projectId);

		return APIResponse.success(listOfDiagrams);
	}
}
