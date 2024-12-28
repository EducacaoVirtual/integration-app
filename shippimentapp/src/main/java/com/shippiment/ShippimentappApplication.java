package com.shippiment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = { "http://localhost:8085" })
public class ShippimentappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShippimentappApplication.class, args);
	}

}
