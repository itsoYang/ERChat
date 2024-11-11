package com.erchat.designer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.erchat.designer.dto.SaveDTO;
import com.erchat.designer.service.IDesignerService;

/**
 * @author oYang
 * @Description 设计器控制层
 * @createTime 2024年11月11日 11:18:00
 */
@Controller
public class DesignerController {

	@Autowired
	private IDesignerService designerService;

	@PostMapping("api/designer/save")
	public void save(@RequestBody SaveDTO saveDTO){
		designerService.save(saveDTO);
	}
}