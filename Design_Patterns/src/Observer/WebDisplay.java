package Observer;

import java.util.Observable;
import java.util.Observer;

public class WebDisplay implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        WeatherStation ws = (WeatherStation) o;
        System.out.println("Web display: Temperature updated to "+ws.getTemperature());
    }
}
