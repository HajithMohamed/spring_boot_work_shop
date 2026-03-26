package Template;

public class Tea extends Beverage{
    @Override
    public void addExtras() {
        System.out.println("Adding lemon");
    }

    @Override
    public void brew() {
        System.out.println("steaming the tea leaves");
    }
}
