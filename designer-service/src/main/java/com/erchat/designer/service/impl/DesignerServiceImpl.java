package com.erchat.designer.service.impl;

import com.erchat.designer.model.ERDiagram;
import com.erchat.designer.service.IDesignerService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Transactional
@RequiredArgsConstructor
@Service
public class DesignerServiceImpl implements IDesignerService {

    private final MongoTemplate mongoTemplate;

    @Override
    public void save(ERDiagram erDiagram) {
		// TODO 1.插入表 diagrams

		// 2. 图元素信息插入 MongoDB
		mongoTemplate.insert(erDiagram);
    }
}
