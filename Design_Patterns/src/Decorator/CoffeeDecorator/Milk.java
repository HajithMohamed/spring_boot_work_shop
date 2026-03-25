package Decorator.CoffeeDecorator;

public class Milk extends CoffeeDecorator{
    public Milk(Coffee coffee) {
        super(coffee);
    }

    public String getDescription(){
        return coffee.getDescription() + "+ Milk";
    }

    public Double getCost(){
        return coffee.getCost() + 2.5;
    }
}
