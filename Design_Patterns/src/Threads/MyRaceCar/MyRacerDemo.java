package Threads.MyRaceCar;

public class MyRacerDemo {
    public static void main(String[] args) {

        Racer r1 = new Racer(16,"Fuel Fill");
        Racer r2 = new Racer(10,"Start Car");
        Racer r3 = new Racer(1,"Stop Car");

        new Thread(r1).start();
        new Thread(r2).start();
        new Thread(r3).start();
    }
}