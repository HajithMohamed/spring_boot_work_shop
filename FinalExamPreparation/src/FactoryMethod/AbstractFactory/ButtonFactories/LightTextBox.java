package FactoryMethod.AbstractFactory.ButtonFactories;

public class LightTextBox implements TextBox{
    @Override
    public void type() {
        System.out.println("This text typed from light text box");
    }
}
