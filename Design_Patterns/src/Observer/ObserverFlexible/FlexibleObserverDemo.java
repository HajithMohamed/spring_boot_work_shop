package Observer.ObserverFlexible;

public class FlexibleObserverDemo {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        MobileDisplay md = new MobileDisplay();
        WebDisplay wd = new WebDisplay();

        ws.registerObserver(md);
        ws.registerObserver(wd);

        ws.setTemperature(32.6);
        ws.setTemperature(35.3);
    }
}
