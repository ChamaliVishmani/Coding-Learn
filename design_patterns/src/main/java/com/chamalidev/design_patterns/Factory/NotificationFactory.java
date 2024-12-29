package com.chamalidev.design_patterns.Factory;

import com.chamalidev.design_patterns.service.FactoryNotification.Impl.EmailNotification;
import com.chamalidev.design_patterns.service.FactoryNotification.Notification;
import com.chamalidev.design_patterns.service.FactoryNotification.Impl.SMSNotification;

public class NotificationFactory {
    public static Notification createNotification(String type){
        // create instance of Notification based on specified type
        return switch (type.toUpperCase()) {
            case "EMAIL" -> new EmailNotification();
            case "SMS" -> new SMSNotification();
            default -> throw new IllegalArgumentException("Unknown notification type: " + type);
        };
    }
}
