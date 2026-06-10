package FactoryMethod.NotificationFactory;

public class NotificationDemo {

    public static void main(String[] args) {
        Notification email = NotificationFactory.getNotification("email");
        Notification push = NotificationFactory.getNotification("push");
        Notification SMS = NotificationFactory.getNotification("sms");

        email.sent("OTP sent Successfully");
        push.sent("OTP sent Successfully");
        SMS.sent("OTP sent Successfully");
    }


}
