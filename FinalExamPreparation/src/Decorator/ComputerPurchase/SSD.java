package Decorator.ComputerPurchase;

public class SSD extends ComputerDecorator {
    public SSD(Computer computer) {
        super(computer);
    }

    @Override
    public String getDescription() {
        return computer.getDescription()+" SSD added";
    }

    @Override
    public Double getCost() {
        return computer.getCost()+8.0;
    }
}
