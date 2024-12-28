package com.integration.controller;

import com.integration.dto.ShippimentDTO;
import com.integration.service.ShippimentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/shippings")
public class ShippimentController {

    private final ShippimentService shippimentService;

    public ShippimentController(ShippimentService shippimentService) {
        this.shippimentService = shippimentService;
    }

    @PostMapping
    public ResponseEntity<?> createShippiment(@RequestBody ShippimentDTO shippiment) {
        return ResponseEntity.ok(shippimentService.createShippiment(shippiment));
    }

    @GetMapping
    public ResponseEntity<?> getShipping(@RequestParam("shippingId") String shippingId) {
        return ResponseEntity.ok(shippimentService.getShipping(shippingId));
    }
}
