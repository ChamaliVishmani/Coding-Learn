package com.chamalidev.design_patterns.service.FactoryNotification;

public interface Notification {
    //Interface can be extended to other notification types ensuring scalability

    //ensure each type of notification have a consistent send() method
    void send(String message);
}
