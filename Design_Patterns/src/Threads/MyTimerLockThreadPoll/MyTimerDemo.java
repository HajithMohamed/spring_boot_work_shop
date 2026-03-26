package Threads.MyTimerLockThreadPoll;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class MyTimerDemo {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(2);
        MyTimer timer = new MyTimer();

        executor.execute(timer);
        executor.execute(timer);
        executor.shutdown();
        //timer.start();
    }
}
