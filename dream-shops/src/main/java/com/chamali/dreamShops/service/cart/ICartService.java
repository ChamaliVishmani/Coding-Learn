package com.chamali.dreamShops.service.cart;

import com.chamali.dreamShops.model.Cart;
import com.chamali.dreamShops.model.User;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);

    void clearCart(Long id);

    BigDecimal getTotalPrice(Long id);

    Cart initializeNewCart(User user);

    Cart getCartByUserId(Long userId);
}
