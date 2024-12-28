package com.payment.service;

import com.payment.entity.Payment;

public interface PaymentService {
    Payment createPayment(Payment payment);
    Payment getPayment(String paymentId);
}
