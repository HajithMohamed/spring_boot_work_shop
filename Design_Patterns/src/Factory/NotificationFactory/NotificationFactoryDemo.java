package Factory.NotificationFactory;

public class NotificationFactoryDemo {
    public static void main(String[] args) {
        Notification email = NotificationFactory.getNotification("email");
        Notification sms = NotificationFactory.getNotification("sms");
        Notification push = NotificationFactory.getNotification("push");

        email.send("Your order has been placed");
        sms.send("OTP is 123456");
        push.send("New message received");
    }
}
