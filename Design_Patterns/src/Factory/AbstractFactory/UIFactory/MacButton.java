package Factory.AbstractFactory.UIFactory;

public class MacButton implements Button{
    @Override
    public void click() {
        System.out.println("Button clicked from Mac Os");
    }
}
