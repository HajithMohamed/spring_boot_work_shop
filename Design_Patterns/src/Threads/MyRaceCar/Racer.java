package Threads.MyRaceCar;

public class Racer implements Runnable{
    private int time;
    private String msg;

    public Racer(int time, String msg) {
        this.time = time;
        this.msg = msg;
    }

    @Override
    public void run() {
        try {
            int totalTime = 20;
            int delay = (totalTime-time)*1000;
            Thread.sleep(delay);

            System.out.println(msg + " at T=" + time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
