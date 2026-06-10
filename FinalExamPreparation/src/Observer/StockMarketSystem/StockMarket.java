package Observer.StockMarketSystem;


import java.util.ArrayList;

public class StockMarket implements Subject {

    private ArrayList<Observer> dashboards = new ArrayList<>();
    private double price;

    public void changePrice(double price){
        this.price =price;

        System.out.println("Stock Price updated now value is : "+ price);

        notifyObserver();
    }
    @Override
    public void registerObserver(Observer observer) {
        dashboards.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        dashboards.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : dashboards){
            observer.update(price);
        }
    }
}
