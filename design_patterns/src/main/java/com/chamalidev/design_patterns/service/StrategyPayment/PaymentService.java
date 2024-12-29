package com.chamalidev.design_patterns.service.StrategyPayment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final PaymentStrategy paymentStrategy;

    @Autowired
    public PaymentService(@Qualifier("payPalPayment") PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount){
        paymentStrategy.pay(amount);
    }
}
