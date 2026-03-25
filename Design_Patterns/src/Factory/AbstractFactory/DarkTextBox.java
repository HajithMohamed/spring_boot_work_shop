package Factory.AbstractFactory;

public class DarkTextBox implements TextBox{
    @Override
    public void type() {
        System.out.println("Dark letter typed");
    }
}
