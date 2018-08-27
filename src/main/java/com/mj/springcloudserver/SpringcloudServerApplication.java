package com.mj.springcloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.mj")
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class SpringcloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudServerApplication.class, args);
	}
}
