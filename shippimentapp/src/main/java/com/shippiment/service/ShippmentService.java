package com.shippiment.service;

import com.shippiment.entity.Shippiment;

public interface ShippmentService {
    Shippiment createShippiment(Shippiment shippiment);
    Shippiment getShippiment(String shippimentId);
}
