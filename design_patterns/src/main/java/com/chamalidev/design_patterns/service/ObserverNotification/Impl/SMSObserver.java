package com.chamalidev.design_patterns.service.ObserverNotification.Impl;

import com.chamalidev.design_patterns.service.ObserverNotification.Observer;

public class SMSObserver implements Observer {
    @Override
    public void update(String event) {
        System.out.println("SMS sent for event: " + event);
    }
}
