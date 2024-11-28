package com.erchat.project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiagramSaveDTO {

    private String id;
    private String projectId;
    private String name;
    private String visibility;
}
