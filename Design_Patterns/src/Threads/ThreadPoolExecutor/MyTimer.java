package Threads.ThreadPoolExecutor;

public class MyTimer implements Runnable {
    private int currentTime;

    public MyTimer(int currentTime) {
        this.currentTime = currentTime;
    }

    @Override
    public void run() {
        System.out.println("Time Elapsed: " + currentTime);
    }
}
