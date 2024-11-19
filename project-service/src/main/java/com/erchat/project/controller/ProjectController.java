package com.erchat.project.controller;

import com.erchat.project.dto.ProjectDTO;
import com.erchat.project.service.IProjectService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/project")
@AllArgsConstructor
public class ProjectController {

    private final IProjectService projectService;

    public String createProject(@RequestParam ProjectDTO projectDTO){
        projectService.createProject(projectDTO);
        return null;
    }

    @RequestMapping("/list")
    public String getProjectList(){
        return null;
    }
}
