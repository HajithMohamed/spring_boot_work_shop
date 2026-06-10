package SingletonDesignPattern;

public class BillBughInitializedSingleton {

    private BillBughInitializedSingleton(){
        System.out.println("Bill bugh initialized singleton created");
    }
    private class billbupghHelper{
        private static final BillBughInitializedSingleton instance = new BillBughInitializedSingleton();
    }

    public static BillBughInitializedSingleton getInstance(){
        return billbupghHelper.instance;
    }
}
