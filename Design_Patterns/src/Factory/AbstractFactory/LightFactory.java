package Factory.AbstractFactory;

public class LightFactory extends Factory {


    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextBox createText() {
        return new LightTextBox();
    }
}
