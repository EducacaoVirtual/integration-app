package com.integration.service;

import com.integration.dto.ShippimentDTO;
import org.springframework.http.ResponseEntity;

public interface ShippimentService {
    ResponseEntity<String> createShippiment(ShippimentDTO shippimentId);
    ResponseEntity<String> getShipping(String shippingId);
}
