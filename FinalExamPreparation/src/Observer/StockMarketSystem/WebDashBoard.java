package Observer.StockMarketSystem;

public class WebDashBoard implements Observer{
    @Override
    public void update(double price) {
        System.out.println("Web Dashboard : New price updated : "+price);
    }
}
