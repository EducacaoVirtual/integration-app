package com.shippiment.repository;

import com.shippiment.entity.Shippiment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippimentRepository extends JpaRepository<Shippiment, String> {
}
