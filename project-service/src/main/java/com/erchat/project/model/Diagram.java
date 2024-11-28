package com.erchat.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Diagram {
    private String id;
    private String projectId;
    private String name;
    private Integer visibility;
    private String createUser;
    private String createTime;
    private String updateTime;
}
