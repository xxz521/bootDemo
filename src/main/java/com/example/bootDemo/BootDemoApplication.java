package com.example.bootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication//(exclude = {PrimaryConfig.class,SecondaryConfig.class})
@ComponentScan(basePackages = {"com.example.bootDemo","com.example.customerCenter","com.example.goodsCenter"})
//@EnableJpaRepositories(basePackages = {"com.example.customerCenter.dao","com.example.goodsCenter.dao"})//查询数据的repository包路径
@EntityScan(basePackages={"com.example.customerCenter.entity","com.example.customerCenter.model","com.example.goodsCenter.model"})//映射类的包路径
public class BootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication.class, args);
	}
	
}
