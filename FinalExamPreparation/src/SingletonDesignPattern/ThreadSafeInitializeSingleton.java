package SingletonDesignPattern;

public class ThreadSafeInitializeSingleton {
    private static ThreadSafeInitializeSingleton instance;

    private ThreadSafeInitializeSingleton(){
        System.out.println("Thread safe initialized singleton");
    }

    public static synchronized ThreadSafeInitializeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeInitializeSingleton();
        }

        return instance;
    }
}
