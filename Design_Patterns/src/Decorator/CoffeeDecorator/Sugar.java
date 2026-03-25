package Decorator.CoffeeDecorator;

public class Sugar extends CoffeeDecorator{
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    public String getDescription(){
        return coffee.getDescription() + "+ Sugar";

    }

    public Double getCost(){
        return coffee.getCost()+ 1.5;
    }
}
