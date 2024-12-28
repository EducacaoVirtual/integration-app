package com.integration.controller;

import com.integration.dto.PaymentDTO;
import com.integration.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
@CrossOrigin(origins = "*", originPatterns = "*")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public ResponseEntity<String> createPayment(@RequestBody PaymentDTO paymentDTO) {
        return paymentService.createPayment(paymentDTO);
    }

    @GetMapping("/{paymentId}")
    public ResponseEntity<String> getPayment(@PathVariable("paymentId") String paymentId) {
        return paymentService.getPayment(paymentId);
    }
}
