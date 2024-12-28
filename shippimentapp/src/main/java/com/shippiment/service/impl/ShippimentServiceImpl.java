package com.shippiment.service.impl;

import com.shippiment.entity.Shippiment;
import com.shippiment.repository.ShippimentRepository;
import com.shippiment.service.ShippmentService;
import org.springframework.stereotype.Service;

@Service
public class ShippimentServiceImpl implements ShippmentService {
    private final ShippimentRepository shippimentRepository;

    public ShippimentServiceImpl(ShippimentRepository shippimentRepository) {
        this.shippimentRepository = shippimentRepository;
    }

    @Override
    public Shippiment createShippiment(Shippiment shippiment) {
        return shippimentRepository.save(shippiment);
    }

    @Override
    public Shippiment getShippiment(String shippimentId) {
        return shippimentRepository.findById(shippimentId).orElse(null);
    }
}
