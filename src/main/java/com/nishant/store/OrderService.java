package com.nishant.store;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

public class OrderService {
    private final PaymentService paymentService;

    @PostConstruct
    public void init() {
        System.out.println("Init DB connection...");
    }

    @PreDestroy
    public void close() {
        System.out.println("Close DB connection...");
    }

    public OrderService(@Qualifier("paypal") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }
}
