package Template;

public class BeverageDemo {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        Beverage coffee = new Coffee();

        tea.prepare();
        coffee.prepare();
    }
}
