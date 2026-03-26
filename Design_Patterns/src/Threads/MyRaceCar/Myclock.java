package Threads.MyRaceCar;

public class Myclock extends Thread{
    public String msg;

    public void run(){
        for (int i = 1; i <=20; i++) {
            System.out.println("T- "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
