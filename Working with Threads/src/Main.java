import java.sql.SQLSyntaxErrorException;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Working with Threads .... ");

        // -------------------------------------------------------------------------------------------------------------

        System.out.println("\nAccessing the Main Thread ..... ");

        var currentThread = Thread.currentThread();
        System.out.println("Displaying the Class of the Thread");
        System.out.println("Name of the Class: " + currentThread.getClass().getName());
        System.out.println("Simple Name of the Class: " + currentThread.getClass().getSimpleName());

        // -------------------------------------------------------------------------------------------------------------

        System.out.println("\nAccessing Properties of the Thread class for the Main Thread: ");
        getThreadProperties(currentThread);

        // -------------------------------------------------------------------------------------------------------------
        System.out.println("\n// -------------------------------------------------------------------------------------------------------------");

        // Running Threads in Parallel
        System.out.println("\nRunning Threads in Parallel:");

        // Starting a Custom Thread to run in Parallel with the Main Thread
        CustomThread newThread = new CustomThread();
        newThread.start();

        // Running the Main Thread in Parallel with the Custom Thread
        for (int i = 0; i < 5; i++) {
            System.out.println("\nMain Thread: " + 0);

            // Sleeping the Main thread to view parallel execution
            try {
                System.out.println("Main Thread sleeping for 1 second");
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // -------------------------------------------------------------------------------------------------------------

        System.out.println("\n// -------------------------------------------------------------------------------------------------------------");
        System.out.println("\nReturning Access to the Main Thread");

        // Pausing the Main Thread
        try {
            System.out.println("Pausing the Main Thread for 2 second");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("The Main Thread was Interrupted Before Completion");
        }

        /*
         * Creating a Custom Thread using the Runnable Interface
         * - The Custom Thread will execute to create 10 dots
         */
        Thread thread = new Thread(() -> {
            System.out.println("\nExecuting Thread: " + Thread.currentThread().getName());
            for (int i = 0; i < 10; i++) {
                System.out.printf("%d . %n", i + 1);
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    System.out.println("The User Thread was interrupted before completion of execution");
                }
            }
            System.out.println("The User Thread has completed execution successfully");
        });

        System.out.println("\nExecuting the User Thread");
        thread.start();

        System.out.println("Access has returned to the Main Thread: " + Thread.currentThread().getName());

        // Concurrent Loop Execution
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread: " + (i + 1));
            try {
                System.out.println("Going to sleep for 500 millis");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("The Main Thread was Interrupted during execution");
            }
        }

        System.out.println("\nBoth threads have concurrently executed successfully");

        // -------------------------------------------------------------------------------------------------------------

        System.out.println("\n// -------------------------------------------------------------------------------------------------------------");
        System.out.println("\nInterrupting the User Thread from the Main Thread");

        Thread threeSec = new Thread(() -> {
            System.out.println("\nExecuting the Three Seconds Thread: " + Thread.currentThread().getName());
            for (int i = 0; i < 10; i++) {
                System.out.printf("%d . %n", (i + 1));

                // Pausing the User Thread
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("The User Thread was Interrupted before completion");
                    return;
                }
            }
            System.out.println("The User completed execution successfully");
        });

        // Starting the Execution of the 3 Seconds user thread
        System.out.println("\nStarting execution of the User Thread");
        threeSec.start();

        System.out.println("Returning Access to the main Thread");
        try {
            System.out.println("Sleeping the Main Thread for 3 Seconds");
            Thread.sleep(3000);
            System.out.println("Main Thread regains control after three seconds during the sleep of User Thread");
        } catch (InterruptedException e) {
            System.out.println("The Main Thread was Interrupted");
        }

        System.out.println("\nInterrupting the User Thread after 3 Second");
        threeSec.interrupt();

        // -------------------------------------------------------------------------------------------------------------

        System.out.println("\n// -------------------------------------------------------------------------------------------------------------");
        System.out.println("\nInterrupting the User Thread after a duration");

        Thread threeSecTerm = new Thread(() -> {
            System.out.println("\nExecuting the Three Second Terminate Thread: " + Thread.currentThread().getName());
            for (int i = 0; i < 10; i++) {
                System.out.printf("%d . %n", (i + 1));

                // Pausing the User Thread
                try {
                    Thread.sleep(500);
                    System.out.println("A: " + Thread.currentThread().getState());

                } catch (InterruptedException e) {
                    System.out.println("The User Thread was Interrupted before completion");
                    System.out.println("A1: " + Thread.currentThread().getState());
                    return;
                }
            }
            System.out.println("The User completed execution successfully");
        });

        System.out.println("\nStarting execution of the User Thread");
        threeSecTerm.start();

        // Keeping Track of Time
        long now = System.currentTimeMillis();
        while (threeSecTerm.isAlive()) {
            System.out.println("\nWaiting for the User Thread to complete execution");

            try {
                Thread.sleep(1000);
                System.out.println("B: " + threeSecTerm.getState());
                if (System.currentTimeMillis() - now > 3000) {
                    threeSecTerm.interrupt();
                }
            } catch (InterruptedException e) {
                System.out.println("The Main Thread was Interrupted");
            }
        }

        System.out.println("C: " + threeSecTerm.getState());

        // -------------------------------------------------------------------------------------------------------------

    }

    // A Methods used to describe the different properties of the thread
    public static void getThreadProperties(Thread thread) {
        System.out.println("String representation of the Thread Class: " + thread);
        System.out.println("ID of the Thread: " + thread.getId());
        System.out.println("Name of the Thread: " + thread.getName());
        System.out.println("Priority of the Thread: " + thread.getPriority());
        System.out.println("Group of the Thread: " + thread.getThreadGroup());
        System.out.println("Status of the Thread: " + thread.getState());
        System.out.println("Current State of the Thread: " + thread.isAlive());
    }
}
