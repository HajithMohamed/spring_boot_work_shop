package Decorator.ComputerPurchase;

public class ComputerDecorator implements Computer{
    protected Computer computer;

    public ComputerDecorator(Computer computer){
        this.computer = computer;
    }
    @Override
    public String getDescription() {
        return computer.getDescription();
    }

    @Override
    public Double getCost() {
        return computer.getCost();
    }

}
