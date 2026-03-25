package Singleton_Design_Pattern;

public class SingletonDesignPattern {

    // Step 1: private static instance
    private static SingletonDesignPattern instance;

    // Step 2: private constructor
    private SingletonDesignPattern() {
        System.out.println("Singleton instance created");
    }

    // Step 3: public static method
    public static SingletonDesignPattern getInstance() {
        if (instance == null) {
            instance = new SingletonDesignPattern();
        }
        return instance;
    }
}
