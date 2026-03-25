package Factory.AbstractFactory.UIFactory;

public class WindowsButton implements Button{

    @Override
    public void click() {
        System.out.println("Button clicked from Windows");
    }
}
