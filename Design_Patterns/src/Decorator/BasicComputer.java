package Decorator;

public class BasicComputer implements Computer{
    @Override
    public String getDescription() {
        return "Basic computer";
    }

    @Override
    public Double getCost() {
        return 99.99;
    }
}
