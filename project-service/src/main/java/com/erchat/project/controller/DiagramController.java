package com.erchat.project.controller;

import com.erchat.project.dto.DiagramSaveDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diagram")
public class DiagramController {

    @PostMapping("/save")
    public void diagramCreate(@RequestBody DiagramSaveDTO diagramSaveDTO){

    }
}
