package Threads.MyTimerLockThreadPoll;

import java.util.concurrent.locks.ReentrantLock;

public class MyTimer extends Thread{
    ReentrantLock lock = new ReentrantLock();

    public void run(){
        lock.lock();
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        lock.unlock();
    }
}
