package Singleton_Design_Pattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        SingletonDesignPattern s1 = SingletonDesignPattern.getInstance();
        SingletonDesignPattern s2 = SingletonDesignPattern.getInstance();

        EagerInitialization e1 = EagerInitialization.getInstance();
        EagerInitialization e2 = EagerInitialization.getInstance();

        ThreadSafeSingleton t1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton t2 = ThreadSafeSingleton.getInstance();

        DoubleCheckedLockingSingleton d1 = DoubleCheckedLockingSingleton.getInstance();
        DoubleCheckedLockingSingleton d2 = DoubleCheckedLockingSingleton.getInstance();

        StaticBlockSingletonPattern st1 = StaticBlockSingletonPattern.getInstance();
        StaticBlockSingletonPattern st2 = StaticBlockSingletonPattern.getInstance();


        System.out.println(s1 == s2); // true

        System.out.println(e1 == e2); // true

        System.out.println(t1 == t2); // true

        System.out.println(d1 == d2); // true

        System.out.println(st1 == st2); // true
    }
}