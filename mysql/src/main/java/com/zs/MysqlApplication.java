package com.zs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.zs.mapper*")
public class MysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlApplication.class, args);
	}
}
