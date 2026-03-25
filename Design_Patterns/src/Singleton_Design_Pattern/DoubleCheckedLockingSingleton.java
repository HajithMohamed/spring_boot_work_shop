package Singleton_Design_Pattern;

public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton(){
        System.out.println("Double checked singleton pattern created");
    }

    public static DoubleCheckedLockingSingleton getInstance(){
        if(instance==null){
            synchronized (DoubleCheckedLockingSingleton.class){
                if (instance==null){
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
