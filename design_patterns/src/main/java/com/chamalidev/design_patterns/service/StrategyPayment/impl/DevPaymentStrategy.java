package com.chamalidev.design_patterns.service.StrategyPayment.impl;

import com.chamalidev.design_patterns.service.StrategyPayment.PaymentStrategy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via DevPaymentStrategy");
    }
}
