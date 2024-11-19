package com.erchat.project.service;

import com.erchat.project.dto.ProjectDTO;

import java.util.List;

public interface IProjectService {

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
