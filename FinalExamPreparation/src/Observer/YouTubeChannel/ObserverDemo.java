package Observer.YouTubeChannel;

public class ObserverDemo {
    public static void main(String[] args) {
        TechChannel techChannel = new TechChannel();

        EmailSubscriber emailSubscriber = new EmailSubscriber();
        MobileSubscriber mobileSubscriber = new MobileSubscriber();

        techChannel.registerObserver(emailSubscriber);
        techChannel.registerObserver(mobileSubscriber);

        techChannel.uploadVideo("Wild life podcast");
    }
}
