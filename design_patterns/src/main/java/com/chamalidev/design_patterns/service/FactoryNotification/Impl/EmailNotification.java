package com.chamalidev.design_patterns.service.FactoryNotification.Impl;

import com.chamalidev.design_patterns.service.FactoryNotification.Notification;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Email "+message);
    }
}
