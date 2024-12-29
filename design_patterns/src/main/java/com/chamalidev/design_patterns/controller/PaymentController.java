package com.chamalidev.design_patterns.controller;

import com.chamalidev.design_patterns.service.StrategyPayment.PaymentService;
import com.chamalidev.design_patterns.service.StrategyPayment.PaymentStrategy;
import com.chamalidev.design_patterns.service.StrategyPayment.impl.CreditCardPayment;
import com.chamalidev.design_patterns.service.StrategyPayment.impl.PayPalPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PaymentController {
    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService){
        this.paymentService=paymentService;
    }

    @GetMapping("/pay")
    public ResponseEntity<String> processPayment(@RequestParam double amount ){
        paymentService.processPayment((amount));
        return ResponseEntity.ok("Payment processed successfully!");
    }
}
