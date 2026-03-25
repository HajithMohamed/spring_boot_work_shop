package Decorator.CoffeeDecorator;

public class BasicCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Basic coffee";
    }

    @Override
    public Double getCost() {
        return 12.5;
    }
}
