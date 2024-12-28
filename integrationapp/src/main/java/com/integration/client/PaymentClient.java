package com.integration.client;

import com.integration.dto.PaymentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "payment-client", url = "${feign.payment.url}")
public interface PaymentClient {

    @PostMapping(value = "/payments", consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> createPayment(@RequestBody PaymentDTO paymentDTO);

    @GetMapping(value = "/payments", consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> getPayment(@RequestParam String paymentId);
}
