package Decorator;

public class SSD extends ComputerDecorater{
    public SSD(Computer computer) {
        super(computer);
    }

    public String getDescription(){
        return computer.getDescription() + "+ SSD";
    }

    public Double getCost(){
        return computer.getCost() + 25.5;
    }
}
