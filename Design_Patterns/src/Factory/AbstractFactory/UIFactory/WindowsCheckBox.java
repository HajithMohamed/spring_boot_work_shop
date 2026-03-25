package Factory.AbstractFactory.UIFactory;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void checked() {
        System.out.println("Checked from Windows");
    }
}
