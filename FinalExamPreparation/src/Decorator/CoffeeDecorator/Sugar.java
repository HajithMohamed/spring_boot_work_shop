package Decorator.CoffeeDecorator;

public class Sugar extends CoffeeDecorator{
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription(){
        return coffee.getDescription() + " + sugar";
    }

    @Override
    public double getCost(){
        return coffee.getCost() + 0.5;
    }
}
