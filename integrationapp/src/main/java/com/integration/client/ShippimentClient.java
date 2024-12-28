package com.integration.client;

import com.integration.dto.ShippimentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "shipping-client", url = "${feign.shipping.url}")
public interface ShippimentClient {

    @PostMapping(value = "/shippings", consumes = "application/json")
    ResponseEntity<String> createShippiment(@RequestParam ShippimentDTO shippimentDTO);

    @GetMapping(value = "/shippings", consumes = "application/json")
    ResponseEntity<String> getShipping(@RequestParam String shippingId);

}
