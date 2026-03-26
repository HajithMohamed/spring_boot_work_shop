package Threads.MySyncTimer;

public class MyTimer implements Runnable{
    @Override
    public void run() {
        printNumbers();
        printDeNumbers();
    }

    public synchronized void printNumbers(){
        for (int i = 1; i < 10; i++) {
            System.out.println("Sync"+Thread.currentThread().getName()+ ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void printDeNumbers(){
        for (int i = 10; i >= 1; i--) {
            System.out.println("not Sync"+Thread.currentThread().getName()+ ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
