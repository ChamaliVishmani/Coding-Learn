package com.chamalidev.design_patterns.service.ObserverNotification.Impl;

import com.chamalidev.design_patterns.service.ObserverNotification.Observer;

public class EmailObserver implements Observer {
    @Override
    public void update(String event) {
        System.out.println("Email sent for event: " + event);
    }
}
