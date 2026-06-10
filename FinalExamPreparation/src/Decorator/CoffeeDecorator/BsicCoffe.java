package Decorator.CoffeeDecorator;

public class BsicCoffe implements Coffee{
    @Override
    public String getDescription() {
        return "Basic cofee";
    }

    @Override
    public double getCost() {
        return 5;
    }
}
