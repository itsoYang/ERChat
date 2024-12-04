package com.erchat.diagram.vo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author oYang
 * @Description 图形列表VO
 * @createTime 2024年11月29日 14:15:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiagramCardVO {

	private String id;
	private String projectId;
	private String name;
	private String visibility;
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
	private String thumbnail; // 图形缩略图
}
