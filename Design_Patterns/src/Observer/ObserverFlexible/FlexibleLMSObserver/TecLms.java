package Observer.ObserverFlexible.FlexibleLMSObserver;

import java.util.ArrayList;
import java.util.Scanner;

public class TecLms implements MySubject{
    public String msg;
    private ArrayList<MyObaserver> student = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    @Override
    public void registerObserver(MyObaserver myObaserver) {
        student.add(myObaserver);
    }

    @Override
    public void removeObserver(MyObaserver myObaserver) {
        student.remove(myObaserver);
    }

    @Override
    public void notifyObserver() {
        for (MyObaserver Observer: student){
            Observer.update(msg);
        }
    }

    public void sendMsg(){
        System.out.println("Enter Your message :");
        msg = sc.nextLine();

        notifyObserver();
    }
}
