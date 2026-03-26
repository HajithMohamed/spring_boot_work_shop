package Threads.Deadlock;

public class Paper {
    public synchronized void writingWithPaperNeedPen(Pen pen){
        System.out.println(Thread.currentThread().getName() + "writing with pen trying to get paper");
        pen.finishWriting();
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " is finished writing with paper.");
    }
}
