package com.firstgroup.grouperp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.firstgroup.grouperp.mapper")
public class GroupErpApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroupErpApplication.class, args);
	}

}
