package Facade;

public class ComputerFacade {
    private final CPU cpu;
    private final HardDrive hd;
    private final Memory mem;

    public ComputerFacade(){
        cpu = new CPU();
        hd = new HardDrive();
        mem = new Memory();
    }

    public void startComputer(){
        cpu.start();
        hd.Read();
        mem.load();
        System.out.println("Computer started successfully!");
    }
}
