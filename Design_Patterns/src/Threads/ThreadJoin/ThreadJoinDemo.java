package Threads.ThreadJoin;

public class ThreadJoinDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread("Worker 1"){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName()+ "Started");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Finished");
            }
        };

        Thread t2 = new Thread("Worker 2"){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName()+ "Started");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Finished");
            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread: All workers finished, exiting program.");

    }
}
