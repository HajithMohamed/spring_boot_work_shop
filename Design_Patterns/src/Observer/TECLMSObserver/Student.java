package Observer.TECLMSObserver;

import java.util.Observable;
import java.util.Observer;

public class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        TecLms tecLms = (TecLms) o;
        System.out.println("Dear student"+name+" You have recieve an message : "+ tecLms.getMsg());
    }
}
