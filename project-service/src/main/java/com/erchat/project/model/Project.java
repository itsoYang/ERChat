package com.erchat.project.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("project")
public class Project {
    @TableId
    private String id;
    private String projectName;
    private String projectDesc;
    private String createUser;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
