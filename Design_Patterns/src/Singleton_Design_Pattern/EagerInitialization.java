package Singleton_Design_Pattern;

public class EagerInitialization {
    private static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization(){
        System.out.println("Eager initialization singleton pattern created");
    }

    public static EagerInitialization getInstance(){
        return instance;
    }

}
