package com.nishant.store;

import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService implements NotificationService {
    public void send(String message) {
        System.out.println(message + " via email.");
    }
}
