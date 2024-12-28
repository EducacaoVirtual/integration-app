package com.integration.dto;

public record PaymentDTO(
        String item,
        Integer quantity,
        Double amount
) {
}
