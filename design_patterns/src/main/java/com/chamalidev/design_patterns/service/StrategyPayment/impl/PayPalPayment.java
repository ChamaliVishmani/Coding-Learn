package com.chamalidev.design_patterns.service.StrategyPayment.impl;

import com.chamalidev.design_patterns.service.StrategyPayment.PaymentStrategy;
import org.springframework.stereotype.Component;

@Component("payPalPayment")
public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via PayPal");
    }
}
