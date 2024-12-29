package com.chamalidev.design_patterns.service.StrategyPayment.impl;

import com.chamalidev.design_patterns.service.StrategyPayment.PaymentStrategy;
import org.springframework.stereotype.Component;

@Component("creditCardPayment")
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount){
        System.out.println("Paid $" + amount + " with Credit Card");
    }
}
