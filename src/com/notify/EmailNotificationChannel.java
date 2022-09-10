package com.notify;

public class EmailNotificationChannel extends NotificationChannel{
    public EmailNotificationChannel(Notification notification) {
        super(notification);
    }

    @Override
    public void notifyThroughChannel() {
        System.out.println("SMS Notification");
        notification.notification();
    }
}
