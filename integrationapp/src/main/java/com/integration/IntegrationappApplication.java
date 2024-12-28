package com.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class IntegrationappApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationappApplication.class, args);
	}

}
