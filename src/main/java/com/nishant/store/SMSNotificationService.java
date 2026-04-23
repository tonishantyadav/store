package com.nishant.store;

public class SMSNotificationService implements  NotificationService {
    public void send(String message) {
        System.out.println(message + " via SMS.");
    }
}
