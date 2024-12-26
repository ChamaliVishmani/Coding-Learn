package com.chamali.dreamShops.service.order;

import com.chamali.dreamShops.dto.OrderDto;
import com.chamali.dreamShops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);

    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}
