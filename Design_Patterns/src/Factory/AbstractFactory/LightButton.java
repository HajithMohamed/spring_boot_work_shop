package Factory.AbstractFactory;

public class LightButton implements Button{
    @Override
    public void click() {
        System.out.println("Light Button clicked");
    }
}
