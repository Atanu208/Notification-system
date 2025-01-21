package com.simulate.notification;

public class SMSService implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notification Sent: " + message);
    }
}
