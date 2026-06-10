package FactoryMethod.AbstractFactory.UIFActory;

import FactoryMethod.AbstractFactory.ButtonFactories.Factory;

public class UIFactoryDemo {
    public static void main(String[] args) {
        UIFactory mac = new MacUIFactory();
        UIFactory windows = new WindowsUIFactory();

        Button macBut = mac.createButton();
        CheckBox macChec = mac.createCheckBox();

        Button winBut = windows.createButton();
        CheckBox winChec = windows.createCheckBox();

        macBut.click();
        macChec.check();

        winBut.click();
        winChec.check();
    }
}
