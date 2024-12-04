package com.erchat.project.controller;

import com.erchat.common.domain.APIResponse;
import com.erchat.project.dto.ProjectDTO;
import com.erchat.project.model.Project;
import com.erchat.project.service.IProjectService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/project")
public class ProjectController {

    private final IProjectService projectService;

    @PostMapping()
    public APIResponse<Object> createProject(@RequestBody ProjectDTO projectDTO){

		try {
			projectService.createProject(projectDTO);
		} catch (Exception e) {
			return APIResponse.error("创建失败");
		}

		return APIResponse.success("创建成功");
    }

    @GetMapping()
    public APIResponse<List<Project>> getProjectList(){
		List<Project> listOfProject = null;
		try {
			listOfProject = projectService.list();
		} catch (Exception e) {
			return APIResponse.error("查询失败");
		}
		return APIResponse.success(listOfProject);
    }

	@DeleteMapping("/{projectId}")
	public APIResponse<Object> deleteProjectById(@PathVariable("projectId") String projectId){
		try {
			projectService.removeById(projectId);
		} catch (Exception e) {
			return APIResponse.error("删除失败");
		}
		return APIResponse.success("删除成功");
	}

	@PutMapping()
	public APIResponse<Object> updateProject(@RequestBody ProjectDTO projectDTO){
		try {
			projectService.updateProject(projectDTO);
		} catch (Exception e) {
			return APIResponse.error("更新失败");
		}
		return APIResponse.success("更新成功");
	}
}
