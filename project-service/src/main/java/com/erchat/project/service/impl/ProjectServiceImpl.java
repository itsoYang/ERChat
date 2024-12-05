package com.erchat.project.service.impl;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.erchat.api.client.IDiagramClient;
import com.erchat.project.dto.ProjectDTO;
import com.erchat.project.mapper.IProjectMapper;
import com.erchat.project.model.Project;
import com.erchat.project.service.IProjectService;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProjectServiceImpl extends ServiceImpl<IProjectMapper, Project> implements IProjectService {

	private final IDiagramClient diagramClient;

	@Override
	public void createProject(ProjectDTO projectDTO) {
		Project project = new Project();
		BeanUtils.copyProperties(projectDTO, project);
		// TODO 获取当前用户
		project.setCreateUser("admin");
		LocalDateTime now = LocalDateTime.now();
		project.setCreateTime(now);
		project.setUpdateTime(now);
		save(project);
	}

	@Override
	public void updateProject(ProjectDTO projectDTO) {
		Project project = new Project();
		BeanUtils.copyProperties(projectDTO, project);
		project.setUpdateTime(LocalDateTime.now());
		updateById(project);
	}

	@Override
	public void deleteProjectById(String projectId) {

		// 1、删除项目下所有图表
		diagramClient.deleteDiagramByProjectId(projectId);
		// 2、删除项目
		removeById(projectId);
	}
}
