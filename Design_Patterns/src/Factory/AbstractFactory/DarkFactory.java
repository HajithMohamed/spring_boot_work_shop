package Factory.AbstractFactory;

public class DarkFactory extends Factory{

    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextBox createText() {
        return new DarkTextBox();
    }
}
