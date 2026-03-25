package Factory.AbstractFactory;

public class DarkButton implements Button {
    @Override
    public void click() {
        System.out.println("Dark Button clicked");
    }
}
