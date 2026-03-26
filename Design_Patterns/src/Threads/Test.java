package Threads;

public class Test extends Thread{
    public void run() {
        System.out.println("Thread is running" + Thread.currentThread().getName());
    }

    public void start(){
        System.out.println("Thread is starting" + Thread.currentThread().getName());
        super.start();
    }
}
