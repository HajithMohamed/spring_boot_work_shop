package Observer.ObserverFlexible;

public class WebDisplay implements Observer{
    @Override
    public void update(Double Data) {
        System.out.println("Web Display : Temperature update to "+ Data);
    }
}
