package Factory.AbstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        Factory factory = new DarkFactory();

        Button b = factory.createButton();
        TextBox t = factory.createText();

        b.click();
        t.type();

    }
}
