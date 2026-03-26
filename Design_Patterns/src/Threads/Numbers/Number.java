package Threads.Numbers;

public class Number {
    public static void main(String[] args) {
        Clock c1 = new Clock("clock 1");
        Clock c2 = new Clock("clock 2");
        Clock c3 = new Clock("clock 3");

        c1.start();
        c2.start();
        c3.start();
    }
}
