import com.notify.*;

public class Main {

    public static void main(String[] args) {
        NotificationChannel notificationChannel = new SMSNotificationChannel(new TextNotification());
        notificationChannel.notifyThroughChannel();

        NotificationChannel notificationChannel1 = new EmailNotificationChannel(new QRNotification());
        notificationChannel1.notifyThroughChannel();
    }

}
