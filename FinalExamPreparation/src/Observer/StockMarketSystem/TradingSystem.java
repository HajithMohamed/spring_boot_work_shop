package Observer.StockMarketSystem;

public class TradingSystem implements Observer{
    @Override
    public void update(double price) {
        System.out.println("Trading System : New price updated : "+price);
    }
}
