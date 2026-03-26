package Template;

public abstract class Beverage {
    public final void prepare(){
        boilWater();
        addExtras();
        brew();
        pourInToCup();
    }

    public void boilWater(){
        System.out.println("water is boiling");
    }

    public void pourInToCup(){
        System.out.println("pour in to cup");
    }

    public abstract void addExtras();

    public abstract void brew();
}
