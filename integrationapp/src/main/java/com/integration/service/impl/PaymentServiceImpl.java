package com.integration.service.impl;

import com.integration.client.PaymentClient;
import com.integration.dto.PaymentDTO;
import com.integration.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    private final PaymentClient paymentClient;

    public PaymentServiceImpl(PaymentClient paymentClient) {
        this.paymentClient = paymentClient;
    }

    @Override
    public ResponseEntity<String> createPayment(PaymentDTO paymentDTO) {
        return paymentClient.createPayment(paymentDTO);
    }

    @Override
    public ResponseEntity<String> getPayment(String paymentId) {
        return paymentClient.getPayment(paymentId);
    }
}
