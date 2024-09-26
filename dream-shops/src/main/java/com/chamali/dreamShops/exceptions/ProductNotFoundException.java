package com.chamali.dreamShops.exceptions;

public class ProductNotFoundException extends  RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}
