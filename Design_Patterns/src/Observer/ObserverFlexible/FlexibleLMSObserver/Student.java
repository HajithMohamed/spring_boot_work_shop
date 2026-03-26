package Observer.ObserverFlexible.FlexibleLMSObserver;

public class Student implements MyObaserver{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String Data) {
        System.out.println(name+" I have got a message :"+ Data);
    }
}
