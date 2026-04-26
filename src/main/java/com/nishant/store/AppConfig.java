package com.nishant.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {
    @Value("${payment.service}")
    private String paymentService;

    @Bean
    public PaymentService stripe() {
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal() {
        return new PaypalPaymentService();
    }

    @Bean
    public OrderService orderService() {
        return paymentService.equals("stripe") ? new OrderService(stripe()) : new OrderService(paypal());
    }

    @Bean
    @Lazy
    public HeavyResource executeHeavyResource() {
        return new HeavyResource();
    }
}
