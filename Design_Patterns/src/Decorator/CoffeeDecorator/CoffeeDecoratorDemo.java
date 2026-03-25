package Decorator.CoffeeDecorator;

public class CoffeeDecoratorDemo {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        coffee = new Milk(coffee);
        coffee = new Sugar(coffee);

        System.out.println(coffee.getDescription());
        System.out.println("Total cost : "+ coffee.getCost());
    }
}
