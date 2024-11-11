package com.erchat.designer.service.impl;

import java.util.List;

import com.erchat.designer.dto.SaveDTO;
import com.erchat.designer.model.ERNode;
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
    public void save(List<ERNode> erNodes) {
		mongoTemplate.insertAll(erNodes);
    }
}
