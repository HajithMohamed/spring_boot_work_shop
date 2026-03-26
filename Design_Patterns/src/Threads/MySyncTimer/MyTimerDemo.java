package Threads.MySyncTimer;

public class MyTimerDemo {
    public static void main(String[] args) {
        MyTimer timer = new MyTimer();

        Thread t1 = new Thread(timer,"timer1");
        Thread t2 = new Thread(timer, "timer2");

        t1.start();
        t2.start();
    }
}
