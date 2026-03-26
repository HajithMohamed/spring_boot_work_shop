package Threads.Deadlock;

public class Pen {
    public synchronized void writingWithPenNeedPaper(Paper paper){
        System.out.println(Thread.currentThread().getName() + "writing with pen trying to get paper");
        paper.finishWriting();
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " is finished writing with pen.");
    }
}
