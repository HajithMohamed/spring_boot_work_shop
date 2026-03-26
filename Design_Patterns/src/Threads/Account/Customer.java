package Threads.Account;

public class Customer {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    public synchronized  void withdrawMoney(double amount){
        balance = Acccount.getBalance();
        withdrawAmount = amount;

        if(withdrawAmount>balance){
            System.out.println(Thread.currentThread().getName()+ "|"+"Insufficient balance");
            try {
                System.out.println(Thread.currentThread().getName()+" | "+ "Waiting for deposit amount");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void depositAmount(double amount){
        balance = Acccount.getBalance();
        depositAmount = amount;

        balance = balance+depositAmount;
        Acccount.setBalance(depositAmount);
        System.out.println(Thread.currentThread().getName() + " | "+"Deposited successfully");

        if(withdrawAmount<balance){
            System.out.println(Thread.currentThread().getName()+ " | "+ "Balance is now sufficient, notifying withdraw thread");
            notify();
        }
    }
}
