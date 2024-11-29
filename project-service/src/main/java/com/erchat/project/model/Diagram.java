package com.erchat.project.model;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableName;

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
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
