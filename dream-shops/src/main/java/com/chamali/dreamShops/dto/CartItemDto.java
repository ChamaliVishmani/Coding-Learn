package com.chamali.dreamShops.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartItemDto {
    private Long itemId;
    private Integer quantity;
    private BigDecimal unitDecimal;
    private ProductDto product;
}
