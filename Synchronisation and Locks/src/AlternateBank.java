public class AlternateBank {
    private double balance;
    public static void main(String[] args) {

        System.out.println("Working with Process and Thread Synchronisation");

        // Creating a bank account
        AlternateBank threadAccount = new AlternateBank(10000);

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

    // Bank functionality functions
    public void deposit (double amount) {
        try {
            // Emulating the latency in the deposit process
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Applying Synchronisation only to the Critical Section
        synchronized (this) {
            double originalBalance = balance;
            balance += amount;

            System.out.printf("Current Balance: %f \t Depositing: %f \t Final Balance: %f\n", originalBalance, amount, balance);
        }
    }

    public void withdraw(double amount) {
        try {
            // Emulating the Automatic Latency in withdrawing
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Applying Synchronisation to the critical section
        synchronized (this) {
            double originalBalance = balance;
            if (originalBalance > amount) {
                balance -= amount;
                System.out.printf("Current Balance: %f \t Withdrawing: %f \t Final Balance: %f\n", originalBalance, amount, balance);
            }
        }
    }

    // -----------------------------------------------------------------------------------------------------------------

    // Constructor of the class
    public AlternateBank(double balance) {
        this.balance = balance;
    }
}
