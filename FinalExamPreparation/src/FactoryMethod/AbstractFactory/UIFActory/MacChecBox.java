package FactoryMethod.AbstractFactory.UIFActory;

public class MacChecBox implements CheckBox{

    @Override
    public void check() {
        System.out.println("Mac check box checked");
    }
}
