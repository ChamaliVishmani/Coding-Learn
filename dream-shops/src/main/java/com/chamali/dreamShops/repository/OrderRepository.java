package com.chamali.dreamShops.repository;

import com.chamali.dreamShops.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
