package com.integration.service.impl;

import com.integration.client.ShippimentClient;
import com.integration.dto.ShippimentDTO;
import com.integration.service.ShippimentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ShippimentServiceImpl implements ShippimentService {
    private final ShippimentClient shippimentClient;

    public ShippimentServiceImpl(ShippimentClient shippimentClient) {
        this.shippimentClient = shippimentClient;
    }

    public ResponseEntity<String> createShippiment(ShippimentDTO shippimentDTO) {
        return shippimentClient.createShippiment(shippimentDTO);
    }

    @Override
    public ResponseEntity<String> getShipping(String shippingId) {
        return shippimentClient.getShipping(shippingId);
    }
}
