package com.erchat.designer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.erchat.designer.model.ERDiagram;
import com.erchat.designer.service.IDesignerService;

/**
 * @author oYang
 * @Description 设计器控制层
 * @createTime 2024年11月11日 11:18:00
 */
@Controller
@RequestMapping("/designer")
public class DesignerController {

	@Autowired
	private IDesignerService designerService;

	@PostMapping("/save")
	public ResponseEntity save(@RequestBody ERDiagram erDiagram){
		designerService.save(erDiagram);

		return ResponseEntity.ok().build();
	}
}
