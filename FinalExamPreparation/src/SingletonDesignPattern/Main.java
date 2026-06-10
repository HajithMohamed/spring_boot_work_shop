package SingletonDesignPattern;

public class Main {
    public static void main(String[] args) {
        EagerInitialization eagerSingleton = EagerInitialization.getInstance();
        LazyInitializationSingleton lazyInitializationSingleton = LazyInitializationSingleton.getInstance();
        StaticBlockInitializationSingleton staticBlockInitializationSingleton = StaticBlockInitializationSingleton.getInstance();
        BillBughInitializedSingleton billBughInitializedSingleton = BillBughInitializedSingleton.getInstance();
    }
}
