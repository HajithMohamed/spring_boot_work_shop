package Factory.AbstractFactory.UIFactory;

public class MacUIFactory extends AbstractFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacChackBox();
    }
}
