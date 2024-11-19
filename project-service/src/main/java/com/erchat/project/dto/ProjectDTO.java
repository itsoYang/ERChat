package com.erchat.project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDTO {

    private String id;
    private String name;
    private String desc;
    private String createTime;
    private String updateTime;
    private String status;
}
