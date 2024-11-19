package com.erchat.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("designer-service")
public interface IDesignerClient {

    @GetMapping("/list")
    void getDiagramList();
}
