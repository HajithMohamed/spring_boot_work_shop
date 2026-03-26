package Threads.ThreadPoolExecutor;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(10);
        MyCofeeEvent coffee = new MyCofeeEvent("Addin coffee...");
        MyCofeeEvent sugar = new MyCofeeEvent("Adding Sugar....");
        MyCofeeEvent water = new MyCofeeEvent("Adding Water.....");
        MyCofeeEvent serve = new MyCofeeEvent("Serving Coffee......");

        executor.schedule(coffee,4, TimeUnit.SECONDS);
        executor.schedule(sugar,7, TimeUnit.SECONDS);
        executor.schedule(water,11, TimeUnit.SECONDS);
        executor.schedule(serve,20, TimeUnit.SECONDS);

    }
}
