package Threads.Account;

public class AccountDemo {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Thread withrawThread = new Thread("Withraw thread"){
            @Override
            public void run(){
                customer.withdrawMoney(200);
                System.out.println("The remaining balance is: " + Acccount.getBalance());
            }
        };

        Thread depositThread = new Thread("Deposit thread"){
            @Override
            public void run(){
                customer.depositAmount(200);
            }
        };

        withrawThread.start();
        depositThread.start();
    }
}
