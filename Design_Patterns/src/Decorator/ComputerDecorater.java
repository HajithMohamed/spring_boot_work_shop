package Decorator;

public abstract class ComputerDecorater implements Computer{
    protected Computer computer;

    public ComputerDecorater(Computer computer){
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
