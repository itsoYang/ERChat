package com.erchat.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.erchat.common.domain.APIResponse;

/**
 * @author oYang
 * @Description diagram-service相关的接口
 * @createTime 2024年12月05日 15:08:00
 */
@FeignClient("diagram-service")
public interface IDiagramClient {

	@DeleteMapping("/diagram/{projectId}")
	APIResponse<Object> deleteDiagramByProjectId(@PathVariable("projectId") String projectId);
}
