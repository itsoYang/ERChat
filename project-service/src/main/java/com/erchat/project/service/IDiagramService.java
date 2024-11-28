package com.erchat.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erchat.project.model.Diagram;

public interface IDiagramService extends IService<Diagram> {

    void diagramCreate(Diagram diagram);
}
