package com.erchat.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.erchat.project.dto.ProjectDTO;
import com.erchat.project.mapper.IProjectMapper;
import com.erchat.project.model.Project;
import com.erchat.project.service.IProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl extends ServiceImpl<IProjectMapper, Project> {
}