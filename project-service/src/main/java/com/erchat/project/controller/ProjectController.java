package com.erchat.project.controller;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erchat.common.domain.APIResponse;
import com.erchat.project.dto.ProjectDTO;
import com.erchat.project.model.Project;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/project")
public class ProjectController {

    private final IService<Project> projectService;

    @PostMapping("/save")
    public APIResponse<Object> createProject(@RequestBody ProjectDTO projectDTO){

        Project project = new Project();
        BeanUtils.copyProperties(projectDTO, project);
        // TODO 获取当前用户
        project.setCreateUser("admin");
        LocalDateTime now = LocalDateTime.now();
        project.setCreateTime(now);
        project.setUpdateTime(now);
        projectService.save(project);

        return APIResponse.success("保存成功");
    }

    @GetMapping("/list")
    public APIResponse<List<Project>> getProjectList(){
        List<Project> listOfProject = projectService.list();
        return APIResponse.success(listOfProject);
    }
}
