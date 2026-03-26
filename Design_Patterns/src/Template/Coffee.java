package Template;

public class Coffee extends Beverage{
    @Override
    public void addExtras() {
        System.out.println("Adding extra milk and sugar");
    }

    @Override
    public void brew() {
        System.out.println("Brewing coffee");
    }
}
