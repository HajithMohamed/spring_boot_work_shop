package Decorator.ComputerPurchase;

public class Ram extends ComputerDecorator {
    public Ram(Computer computer) {
        super(computer);
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + " ram added";
    }

    @Override
    public Double getCost() {
        return computer.getCost()+5.5;
    }
}
