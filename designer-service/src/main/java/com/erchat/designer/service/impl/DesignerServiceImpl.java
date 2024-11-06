package com.erchat.designer.service.impl;

import com.erchat.designer.service.IDesignerService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class DesignerServiceImpl implements IDesignerService {

    private final MongoTemplate mongoTemplate;

    public DesignerServiceImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void save() {

    }
}
