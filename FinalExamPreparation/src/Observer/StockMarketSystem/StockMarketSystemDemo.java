package Observer.StockMarketSystem;

public class StockMarketSystemDemo {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        MobileApp mobileApp = new MobileApp();
        WebDashBoard webDashBoard = new WebDashBoard();
        TradingSystem tradingSystem = new TradingSystem();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webDashBoard);
        stockMarket.registerObserver(tradingSystem);

        stockMarket.changePrice(200);
    }
}
