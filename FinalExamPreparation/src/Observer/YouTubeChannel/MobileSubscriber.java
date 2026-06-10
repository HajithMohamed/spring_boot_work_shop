package Observer.YouTubeChannel;

public class MobileSubscriber implements Observer{

    @Override
    public void update(String videoTitle) {
        System.out.println(
                "Mobile Notification: New video available -> "
                        + videoTitle
        );
    }
}
