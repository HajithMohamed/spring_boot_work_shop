package Threads.MyRaceCar;

import Threads.Numbers.Clock;

public class MyRacerDemo {
    public static void main(String[] args) {
        Clock c = new Clock();

        Racer r1 = new Racer(16," fuel Fill");
        Racer r2 = new Racer(10,"Start car");
        Racer r3 = new Racer(1,"Stop car");

        c.start();


    }
}
