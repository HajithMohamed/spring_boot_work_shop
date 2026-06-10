package FactoryMethod.AbstractFactory.ButtonFactories;

public class DarkFactory extends Factory{
    @Override
    public Button createButton(){
        return new DarkButton();
    }

    @Override
    public TextBox createTextBox(){
        return new DarkTextBox();
    }
}
