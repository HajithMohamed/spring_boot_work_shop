package SingletonDesignPattern;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton(){
        System.out.println("Lazy Initialization Singleton created");
    }

    public static LazyInitializationSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializationSingleton();
        }

        return instance;
    }
}
