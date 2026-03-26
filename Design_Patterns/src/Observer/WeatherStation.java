package Observer;

import java.util.Observable;

public class WeatherStation extends Observable {
    private Double Temperature;

    public Double getTemperature() {
        return Temperature;
    }
    public void setTemperature(Double temperature) {
        this.Temperature = temperature;

        setChanged();
        notifyObservers();
    }
}
