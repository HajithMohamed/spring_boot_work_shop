package Observer.TECLMSObserver;

import java.util.Observable;
import java.util.Scanner;

public class TecLms extends Observable {
    Scanner sc = new Scanner(System.in);
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg() {
        System.out.println("Enter your message : ");
        msg = sc.nextLine();

        setChanged();
        notifyObservers();
    }
}
