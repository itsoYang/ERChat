package com.erchat.designer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erchat.common.domain.APIResponse;
import com.erchat.designer.model.ERDiagram;
import com.erchat.designer.service.IDesignerService;

import lombok.RequiredArgsConstructor;

/**
 * @author oYang
 * @Description 设计器控制层
 * @createTime 2024年11月11日 11:18:00
 */
@RestController
@RequestMapping("/designer")
@RequiredArgsConstructor
public class DesignerController {

	private final IDesignerService designerService;

	@PostMapping("/save")
	public APIResponse<Object> save(@RequestBody ERDiagram erDiagram){
		designerService.save(erDiagram);

		return APIResponse.success("保存成功");
	}
}
