package FactoryMethod.NotificationFactory;

public class PushNotification implements Notification{
    @Override
    public void sent(String msg) {
        System.out.println("Push Notification : "+ msg);
    }
}
