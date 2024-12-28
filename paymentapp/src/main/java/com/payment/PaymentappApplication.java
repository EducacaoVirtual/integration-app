package com.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = { "http://localhost:8085" })
public class PaymentappApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentappApplication.class, args);
	}

}
