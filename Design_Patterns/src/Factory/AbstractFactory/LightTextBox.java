package Factory.AbstractFactory;

public class LightTextBox implements TextBox{
    @Override
    public void type() {
        System.out.println("light text typed");
    }
}
