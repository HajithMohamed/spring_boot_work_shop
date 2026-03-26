package Observer.ObserverFlexible.FlexibleLMSObserver;

public class FlexibleLMSObserverDemo {
    public static void main(String[] args) {
        TecLms lms = new TecLms();
        Student st = new Student("Hajith");

        lms.registerObserver(st);

        lms.sendMsg();
    }
}
