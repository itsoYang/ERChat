package com.erchat.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author oYang
 * @Description 用户服务启动类
 * @createTime 2024年12月11日 17:38:00
 */
@MapperScan(basePackages = "com.erchat.user.mapper")
@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
}
