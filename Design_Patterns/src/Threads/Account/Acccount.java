package Threads.Account;

public class Acccount {
    private static double balance =0.0;

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        Acccount.balance = balance;
    }
}
