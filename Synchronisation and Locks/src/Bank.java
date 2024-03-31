import java.util.concurrent.TimeUnit;

public class Bank {

    // Instance Field of the Class
    private double balance;
    public static void main(String[] args) {

        System.out.println("Working with Process and Thread Synchronisation");

        // Creating a bank account
        Bank threadAccount = new Bank(10000);

        // Creating threads of multiple transactions
        Thread thread1 = new Thread(() -> threadAccount.deposit(2500));
        Thread thread2 = new Thread(() -> threadAccount.withdraw(2500));
        Thread thread3 = new Thread(() -> threadAccount.deposit(2500));
        Thread thread4 = new Thread(() -> threadAccount.withdraw(2500));
        Thread thread5 = new Thread(() -> threadAccount.withdraw(2500));

        // Starting the Threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        System.out.println();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nFinal Balance: " + threadAccount.balance);
    }

    // -----------------------------------------------------------------------------------------------------------------

    // Function to make deposits to the bank account
    public synchronized void deposit(double amount) {
        try {
            // Sleeping the Thread as Transaction Latency
            System.out.println("Taking to the the Deposit Cashier to get all the bank credentials correct ....");
            TimeUnit.MILLISECONDS.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Updating the Balance
        double originalBalance = balance;
        balance += amount;

        System.out.printf("Current Balance: %f \t Depositing: %f \t Final Balance: %f%n", originalBalance, amount, balance);
    }

    // Function to make withdraws from the bank account
    public synchronized void withdraw(double amount) {
        try {
            // Sleeping the Thread as Transaction Latency
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Updating the balance
        double originalBalance = balance;
        if (originalBalance > amount) {
            balance -= amount;
        }
        System.out.printf("Current Balance: %f \t Withdrawing: %f \t Final Balance: %f%n", originalBalance, amount, balance);
    }

    // -----------------------------------------------------------------------------------------------------------------

    // Helper Function of the Class
    public double getBalance() {
        return balance;
    }

    // Constructor of the Class
    public Bank(double balance) {
        this.balance = balance;

        System.out.println("A bank account was created with opening balance: " + balance);
    }
}
