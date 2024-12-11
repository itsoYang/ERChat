package com.erchat.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author oYang
 * @Description TODO
 * @createTime 2024年12月11日 17:40:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

	private String id;
	private String userName;
	private String password;
	private String nickName;
	private String avatar;
	private String email;
	private String phone;
	private String sex;
	private String status;
	private String createTime;
	private String updateTime;
}
