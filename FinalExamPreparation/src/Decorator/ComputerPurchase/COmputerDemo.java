package Decorator.ComputerPurchase;

public class COmputerDemo {
    public static void main(String[] args) {
        Computer pc = new BasicComputer();

        pc = new Ram(pc);
        pc = new SSD(pc);

        System.out.println(pc.getDescription());
        System.out.println("Total amount : "+pc.getCost());
    }
}
