package com.firstgroup.erpgo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.firstgroup.erpgo.mapper")
public class ERPGOApplication {

	public static void main(String[] args) {
		SpringApplication.run(ERPGOApplication.class, args);
	}

}
