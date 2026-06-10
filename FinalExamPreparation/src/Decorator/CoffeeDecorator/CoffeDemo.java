package Decorator.CoffeeDecorator;

import Decorator.ComputerPurchase.BasicComputer;

public class CoffeDemo {
    public static void main(String[] args) {
        Coffee coffee = new BsicCoffe();
        coffee = new Milk(coffee);
        coffee = new Sugar(coffee);

        System.out.println(coffee.getDescription());
        System.out.println("Total cost : "+ coffee.getCost());
    }
}
