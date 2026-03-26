package Threads.Numbers;

public class Number {
    public static void main(String[] args) {
        Clock c1 = new Clock();
        Clock c2 = new Clock();
        Clock c3 = new Clock();

        c1.start();
        c2.start();
        c3.start();
    }
}
