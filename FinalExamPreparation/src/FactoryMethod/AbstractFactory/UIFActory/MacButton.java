package FactoryMethod.AbstractFactory.UIFActory;

public class MacButton implements Button{
    @Override
    public void click() {
        System.out.println("Mac OS button clicked...");
    }
}
