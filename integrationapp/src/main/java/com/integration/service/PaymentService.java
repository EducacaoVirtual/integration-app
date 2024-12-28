package com.integration.service;

import com.integration.dto.PaymentDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
    ResponseEntity<String> createPayment(PaymentDTO paymentDTO);
    ResponseEntity<String> getPayment(String paymentId);
}
