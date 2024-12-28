package com.shippiment.controller;

import com.shippiment.entity.Shippiment;
import com.shippiment.service.ShippmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shippiments")
public class ShippimentController {

    private final ShippmentService shippmentService;

    public ShippimentController(ShippmentService shippmentService) {
        this.shippmentService = shippmentService;
    }

    @PostMapping
    public ResponseEntity<?> createShippiment(@RequestBody Shippiment shippiment) {
        return ResponseEntity.ok(shippmentService.createShippiment(shippiment));
    }

    @GetMapping("/{shippimentId}")
    public ResponseEntity<?> getShippiment(@PathVariable("shippimentId") String shippimentId) {
        return ResponseEntity.ok(shippmentService.getShippiment(shippimentId));
    }
}
