package Factory.NotificationFactory;

public class EmailNotification implements Notification{

    @Override
    public void send(String message) {
        System.out.println("Sending Email Notification: " + message);
    }
}
