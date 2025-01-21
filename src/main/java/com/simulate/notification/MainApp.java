package com.simulate.notification;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // Get the EmailService bean
        NotificationService emailService = (NotificationService) context.getBean("emailService");
        emailService.sendNotification("Hello via Email!");

        // Get the SMSService bean
        NotificationService smsService = (NotificationService) context.getBean("smsService");
        smsService.sendNotification("Hello via SMS!");
    }
}
