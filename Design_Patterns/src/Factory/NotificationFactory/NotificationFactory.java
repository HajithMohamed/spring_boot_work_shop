package Factory.NotificationFactory;

public class NotificationFactory {
    public static Notification getNotification(String type){
        if(type.equalsIgnoreCase("email")) return new EmailNotification();
        else if (type.equalsIgnoreCase("sms")) return new SMSNotification();
        else if(type.equalsIgnoreCase("push")) return new PushNotification();

        throw new IllegalArgumentException("Invalid notification type");
    }
}
