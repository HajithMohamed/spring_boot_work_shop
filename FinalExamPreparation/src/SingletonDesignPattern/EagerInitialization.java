package SingletonDesignPattern;

public class EagerInitialization {
    private static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization(){
        System.out.println("Eager initialized instance created");
    }

    public static EagerInitialization getInstance(){
        return instance;
    }
}
