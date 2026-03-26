package Observer.ObserverFlexible;

public class MobileDisplay implements Observer{
    @Override
    public void update(Double Data) {
        System.out.println("Mobile Display : Temperature update to "+ Data);
    }
}
