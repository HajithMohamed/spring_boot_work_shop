package FactoryMethod.NotificationFactory;

public class SMSNotification implements Notification{
    @Override
    public void sent(String msg) {
        System.out.println("SMS : "+msg);
    }
}
