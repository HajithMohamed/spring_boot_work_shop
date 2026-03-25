package Decorator;

public class Ram extends ComputerDecorater{
    public Ram(Computer computer) {
        super(computer);
    }
    public String getDescription(){
        return computer.getDescription() + "+ RAM";
    }
    public Double getCost(){
        return computer.getCost() + 50.25;
    }
}
