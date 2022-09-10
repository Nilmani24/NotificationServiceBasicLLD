package com.notify;

public class SMSNotificationChannel extends NotificationChannel{

    public SMSNotificationChannel(Notification notification) {
        super(notification);
    }

    @Override
    public void notifyThroughChannel() {
        System.out.println("SMS Notification");
        notification.notification();
    }
}
