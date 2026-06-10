package FactoryMethod.AbstractFactory.ButtonFactories;

public class LightFactory extends Factory{

    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextBox createTextBox() {
        return new LightTextBox();
    }
}
