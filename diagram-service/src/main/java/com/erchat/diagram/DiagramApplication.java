package com.erchat.diagram;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author oYang
 * @Description ER图服务启动类
 * @createTime 2024年11月06日 16:14:00
 */
@MapperScan(value = "com.erchat.diagram.mapper")
@EnableFeignClients
@SpringBootApplication
public class DiagramApplication {
	public static void main(String[] args) {
		SpringApplication.run(DiagramApplication.class, args);
	}
}
