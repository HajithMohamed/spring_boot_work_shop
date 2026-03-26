package Threads.RunnableInterface;

public class TestDemo {
    public static void main(String[] args) {
        Test t = new Test();
        Thread newThread = new Thread(t);

        newThread.start();
    }
}
