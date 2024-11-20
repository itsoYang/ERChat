package com.erchat.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erchat.project.dto.ProjectDTO;
import com.erchat.project.model.Project;

import java.util.List;

public interface IProjectService extends IService<Project> {

    /**
     * 创建项目
     * @param projectDTO 项目信息
     */
    void createProject(ProjectDTO projectDTO);

    /**
     * 获取项目列表（全部）
     * @return 项目列表
     */
    List<ProjectDTO> getProjectList();
}