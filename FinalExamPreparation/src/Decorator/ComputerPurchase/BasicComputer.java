package Decorator.ComputerPurchase;

public class BasicComputer implements Computer{


    @Override
    public String getDescription() {
        return "Basic Computer";
    }

    @Override
    public Double getCost() {
        return 150.0;
    }
}
