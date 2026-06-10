package Observer.YouTubeChannel;

import java.util.ArrayList;

public class TechChannel implements Subject{
    private ArrayList<Observer> subscribers = new ArrayList<>();
    private String latestVideo;

    public void uploadVideo(String videoTitle){
        latestVideo = videoTitle;
        System.out.println("New video uploaded "+ videoTitle);

        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : subscribers) {
            observer.update(latestVideo);
        }
    }

}
