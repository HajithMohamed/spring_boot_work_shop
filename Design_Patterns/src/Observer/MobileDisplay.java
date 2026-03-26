package Observer;

import java.util.Observable;
import java.util.Observer;

public class MobileDisplay implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        WeatherStation ws = (WeatherStation) o;
        System.out.println("Mobile Display Temperature update to "+ ws.getTemperature());
    }
}
