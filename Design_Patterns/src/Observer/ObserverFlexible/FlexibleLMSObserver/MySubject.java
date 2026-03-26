package Observer.ObserverFlexible.FlexibleLMSObserver;

public interface MySubject {
    public void registerObserver(MyObaserver myObaserver);
    public void removeObserver(MyObaserver myObaserver);
    public void notifyObserver();
}
