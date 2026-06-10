package FactoryMethod.AbstractFactory.ButtonFactories;

public class DarkButton implements Button{
    @Override
    public void click() {
        System.out.println("Dark button Clicked");
    }
}
