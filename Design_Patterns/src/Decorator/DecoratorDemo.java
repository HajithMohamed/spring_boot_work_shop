package Decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Computer pc = new BasicComputer();

        pc = new Ram(pc);
        pc = new SSD(pc);

        System.out.println(pc.getDescription());
        System.out.println("Total cost : "+ pc.getCost());
    }
}
