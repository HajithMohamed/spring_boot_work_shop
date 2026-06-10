package Observer.StockMarketSystem;

import Facade.HomeTheature.SoundSystem;

public class MobileApp implements Observer{
    @Override
    public void update(double price) {
        System.out.println("Mobile : New price updated : "+price);
    }
}
