package com.chamalidev.design_patterns.service.FactoryNotification.Impl;

import com.chamalidev.design_patterns.service.FactoryNotification.Notification;

public class SMSNotification implements Notification {
    @Override
    public void send(String message){
        System.out.println("Sending SMS "+message);
    }
}
