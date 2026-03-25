package Singleton_Design_Pattern;

public class StaticBlockSingletonPattern {
    private static StaticBlockSingletonPattern instance;

    static {
        try{
            instance = new StaticBlockSingletonPattern();
        }catch (Exception e){
            throw new RuntimeException("Exception occured");
        }
    }

    private StaticBlockSingletonPattern(){
        System.out.println("Static block singleton pattern created");
    }

    public static StaticBlockSingletonPattern getInstance(){
        return instance;
    }
}
