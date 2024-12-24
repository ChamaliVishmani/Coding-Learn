package com.chamali.dreamShops.service.order;

import com.chamali.dreamShops.model.Order;

public interface IOrderService {
    Order placeOrder(Long userId);

    Order getOrder(Long orderId);
}
