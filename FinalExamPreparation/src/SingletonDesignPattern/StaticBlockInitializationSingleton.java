package SingletonDesignPattern;

public class StaticBlockInitializationSingleton {
    private static StaticBlockInitializationSingleton instance;

    static {
        try {
            instance = new StaticBlockInitializationSingleton();
        } catch (RuntimeException e) {
            throw new RuntimeException("Exception occured");
        }
    }

    private StaticBlockInitializationSingleton(){
        System.out.println("Static block initialized singleton created");
    }

    public static StaticBlockInitializationSingleton getInstance(){
        return instance;
    }
}
