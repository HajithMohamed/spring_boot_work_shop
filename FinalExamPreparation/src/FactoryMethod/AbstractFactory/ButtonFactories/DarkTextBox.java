package FactoryMethod.AbstractFactory.ButtonFactories;

public class DarkTextBox implements TextBox{
    @Override
    public void type() {
        System.out.println("This text typed from dark Text Box");
    }
}
