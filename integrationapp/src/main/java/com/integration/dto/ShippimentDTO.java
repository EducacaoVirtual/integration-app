package com.integration.dto;

public record ShippimentDTO(
        String item,
        String shippimentAddress,
        String recipient
) {
}
