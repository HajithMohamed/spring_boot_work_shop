package Observer.TECLMSObserver;

public class TecLmsDemo {
    public static void main(String[] args) {
        TecLms lms = new TecLms();
        Student st = new Student("Hajith");

        lms.addObserver(st);
        lms.setMsg();
    }
}
