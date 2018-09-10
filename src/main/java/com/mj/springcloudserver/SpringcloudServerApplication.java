package com.mj.springcloudserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@MapperScan(basePackages = "com.mj.springcloudserver.dao")
@ComponentScan(basePackages = {"com.mj.springcloudserver"})
public class SpringcloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudServerApplication.class, args);
	}
}
