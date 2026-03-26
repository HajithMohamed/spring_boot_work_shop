package Threads.RunnableInterface;

public class Test implements Runnable {

    @Override
    public void run() {
        System.out.println("My thread is running");
    }
}
