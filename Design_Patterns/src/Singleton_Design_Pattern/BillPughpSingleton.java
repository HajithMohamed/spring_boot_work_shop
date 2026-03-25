package Singleton_Design_Pattern;

public class BillPughpSingleton {
    private BillPughpSingleton(){
        System.out.println("Bill pugh singleton created");
    }

    private static class BillPughHelper{
        private static final BillPughpSingleton instance = new BillPughpSingleton();
    }

    public static BillPughpSingleton getInstance(){
        return BillPughHelper.instance;
    }
}
