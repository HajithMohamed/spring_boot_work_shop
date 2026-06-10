package FactoryMethod.AbstractFactory.ButtonFactories;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        Factory factory = new DarkFactory();

        Button b = factory.createButton();
        TextBox t = factory.createTextBox();

        b.click();
        t.type();

    }
}
