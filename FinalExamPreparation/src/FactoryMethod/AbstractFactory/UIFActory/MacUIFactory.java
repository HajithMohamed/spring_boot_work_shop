package FactoryMethod.AbstractFactory.UIFActory;

public class MacUIFactory extends UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacChecBox();
    }
}
