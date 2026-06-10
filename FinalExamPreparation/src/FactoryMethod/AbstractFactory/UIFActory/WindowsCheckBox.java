package FactoryMethod.AbstractFactory.UIFActory;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void check() {
        System.out.println("windows Check box checked...");
    }
}
