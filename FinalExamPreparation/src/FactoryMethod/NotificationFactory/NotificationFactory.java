package FactoryMethod.NotificationFactory;

public class NotificationFactory {
    public static Notification getNotification(String type){
        if(type.equalsIgnoreCase("email")) return new EmailNotification();
        if (type.equalsIgnoreCase("sms")) return new SMSNotification();
        if(type.equalsIgnoreCase("push")) return new PushNotification();

        throw new IllegalArgumentException("Invalid notification type");
    }
}
