package com.notify;

public abstract class NotificationChannel {
    Notification notification ;
    public NotificationChannel(Notification notification){
        this.notification = notification;
    }
    public abstract void notifyThroughChannel();

}
