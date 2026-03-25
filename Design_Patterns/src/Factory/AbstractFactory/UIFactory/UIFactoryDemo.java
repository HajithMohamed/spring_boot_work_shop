package Factory.AbstractFactory.UIFactory;

public class UIFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory macFactory = new MacUIFactory();
        AbstractFactory windowsFactory = new WindowsFactory();

        Button macBut = macFactory.createButton();
        Button WinBut = windowsFactory.createButton();

        CheckBox macChec = macFactory.createCheckBox();
        CheckBox winChec = windowsFactory.createCheckBox();

        macBut.click();
        WinBut.click();

        macChec.checked();
        winChec.checked();
    }
}
