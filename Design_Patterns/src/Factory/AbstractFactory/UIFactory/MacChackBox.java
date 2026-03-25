package Factory.AbstractFactory.UIFactory;

public class MacChackBox implements CheckBox{
    @Override
    public void checked() {
        System.out.println("Checked from Mac Os");
    }
}
