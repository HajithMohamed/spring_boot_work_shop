package Observer.YouTubeChannel;

public class EmailSubscriber implements Observer{
    @Override
    public void update(String videoTitle) {
        System.out.println(
                "Email Notification: New video available -> "
                        + videoTitle
        );
    }
}
