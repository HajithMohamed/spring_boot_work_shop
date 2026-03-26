package Threads.ThreadPoolExecutor;

public class MyCofeeEvent implements Runnable{
    private String msg;

    public MyCofeeEvent(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " | " + msg);
    }
}
