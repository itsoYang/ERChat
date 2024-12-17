package com.erchat.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author oYang
 * @Description 登录参数
 * @createTime 2024年12月17日 14:30:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDTO {

	private String username;
	private String password;
}
