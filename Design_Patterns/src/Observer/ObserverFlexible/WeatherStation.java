package Observer.ObserverFlexible;

import java.util.ArrayList;

public class WeatherStation implements Observable{
    private ArrayList<Observer> display = new ArrayList<>();
    private Double temperature;

    public Double getTemperature() {
        return temperature;
    }



    @Override
    public void registerObserver(Observer observer) {
        display.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        display.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : display){
            observer.update(temperature);
        }
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;

        notifyObserver();
    }
}
