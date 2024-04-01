public class Locks {
    private double balance;
    private String name;

    /*
    * Applying Locks in Java
    * - Since the Synchronisation Methods and blocks require objects as an instance they dont work with Primitive Types.
    * - Thus to overcome this problem we utilise Lock Object Variables.
    * - The lock object variable serve the sole purpose of providing locks for synchronisation to different instance fields
    * of the object which would otherwise be primitive types.
    * */

    // Lock Object Variables for the Instance fields of the class
    private final Object lockName = new Object();
    private final Object lockBalance = new Object();

    public static void main(String[] args) {

        System.out.println("Understanding Locks and Synchronisation");

        // Creating a bank account
        Locks threadAccount = new Locks("Anil Himam", 10000);

        // Creating threads of multiple transactions
        Thread thread1 = new Thread(() -> threadAccount.deposit(2500));
        Thread thread2 = new Thread(() -> threadAccount.withdraw(2500));
        Thread thread3 = new Thread(() -> threadAccount.deposit(2500));
        Thread thread4 = new Thread(() -> threadAccount.setName("Sai Kusum"));
        Thread thread5 = new Thread(() -> threadAccount.withdraw(2500));

        // Starting the Threads
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            System.out.println("Giving the first 3 threads a head start");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("The main thread was interrupted before completion");
        }
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
//    public void deposit (double amount) {
//        try {
//            // Emulating the latency in the deposit process
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        // Applying Synchronisation only to the Critical Section
//        synchronized (this) {
//            double originalBalance = balance;
//            balance += amount;
//
//            System.out.printf("Current Balance: %f \t Depositing: %f \t Final Balance: %f\n", originalBalance, amount, balance);
//        }
//    }

    public void deposit (double amount) {
        try {
            // Emulating the latency in the deposit process
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Applying Synchronisation only to the Critical Section
        synchronized (lockBalance) {
            double originalBalance = balance;
            balance += amount;

            System.out.printf("Current Balance: %f \t Depositing: %f \t Final Balance: %f\n", originalBalance, amount, balance);
            addBalanceBonus(amount);
        }
    }

    private void addBalanceBonus(double amount) {
        if (amount > 1000) {
            synchronized (lockBalance) {
                System.out.println("Thanks for maintaining the balance, you have received a bonus!!!");
                balance += 25;
            }
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
//        synchronized (this) {
            double originalBalance = balance;
            if (originalBalance > amount) {
                balance -= amount;
                System.out.printf("Current Balance: %f \t Withdrawing: %f \t Final Balance: %f\n", originalBalance, amount, balance);
//            }
        }
    }

    // -----------------------------------------------------------------------------------------------------------------

    // Constructor of the class
    public Locks(String name, double balance) {
        this.balance = balance;
        this.name = name;
    }

    // Setter and Getter Methods
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /*
     * - Applying Synchronised to the Balance setter
     * - This is done so that two instances of the bank cannot modify the same field at the same time
     */
//    public void setName(String name) {
//
//        // Synchronising only the critical section
//        synchronized (this.name) {
//            this.name = name;
//            System.out.println("The name was updated to: " + name);
//        }
//    }

    public void setName(String name) {

        // Synchronising only the critical section
        synchronized (lockName) {
            this.name = name;
            System.out.println("The name was updated to: " + name);
        }
    }
}
