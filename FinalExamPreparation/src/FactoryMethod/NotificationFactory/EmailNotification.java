package FactoryMethod.NotificationFactory;

public class EmailNotification implements Notification{
    @Override
    public void sent(String msg) {
        System.out.println("Email : "+msg);
    }
}
