package com.yf.serviceimpl;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class ServiceImplApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceImplApplication.class, args);
	}
}
