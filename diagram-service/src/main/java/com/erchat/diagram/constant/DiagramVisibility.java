package com.erchat.diagram.constant;

/**
 * @author oYang
 * @Description 图表可见性
 * @createTime 2024年11月29日 14:44:00
 */
public enum DiagramVisibility {

	PUBLIC(0, "public"),
	PRIVATE(1, "private");

	private final Integer code;
	private final String name;

	DiagramVisibility(Integer code, String name) {
		this.code = code;
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static String getNameByCode(Integer code) {
		for (DiagramVisibility diagramVisibility : DiagramVisibility.values()) {
			if (diagramVisibility.getCode().equals(code)) {
				return diagramVisibility.getName();
			}
		}
		return null;
	}

	public static Integer getCodeByName(String name) {
		for (DiagramVisibility diagramVisibility : DiagramVisibility.values()) {
			if (diagramVisibility.getName().equals(name)) {
				return diagramVisibility.getCode();
			}
		}
		return null;
	}
}
