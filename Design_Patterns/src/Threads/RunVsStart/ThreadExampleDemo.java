package Threads.RunVsStart;

public class ThreadExampleDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExample(), "Thread 1");
        Thread t2 = new Thread(new ThreadExample(),"Thread 2");

        System.out.println("Starting "+ t1.getName());
        t1.run();
        System.out.println("Starting "+ t2.getName());
        t2.run();

        System.out.println("Starting "+ t1.getName());
        t1.start();
        System.out.println("Starting "+ t2.getName());
        t2.start();
    }
}
