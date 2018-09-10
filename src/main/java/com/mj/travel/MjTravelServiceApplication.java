package com.mj.travel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@MapperScan(basePackages = "com.mj.travel.dao")
@ComponentScan(basePackages = {"com.mj.travel"})
public class MjTravelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MjTravelServiceApplication.class, args);
	}
}
