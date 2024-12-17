package com.erchat.user.model;

import com.baomidou.mybatisplus.annotation.TableField;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author oYang
 * @Description 用户信息表
 * @createTime 2024年12月11日 17:40:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private String id;
	private String username;
	private String password;
	@TableField(exist = false)
	private String nickname;
	private String avatar;
	@TableField(exist = false)
	private String email;
	private String phone;
	@TableField(exist = false)
	private String status;
	private String createTime;
	private String updateTime;
}
