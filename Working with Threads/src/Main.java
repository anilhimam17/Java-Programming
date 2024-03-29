import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Working with Threads .... ");

        // -------------------------------------------------------------------------------------------------------------

        System.out.println("\nAccessing the Main Thread ..... ");

        var currentThread = Thread.currentThread();
        System.out.println("Displaying the Class of the Thread: ");
        System.out.println("Name of the Class: " + currentThread.getClass().getName());
        System.out.println("Simple Name of the Class: " + currentThread.getClass().getSimpleName());

        // -------------------------------------------------------------------------------------------------------------

        System.out.println("\nAccessing Properties of the Thread class for the Main Thread: ");
        getThreadProperties(currentThread);

        // -------------------------------------------------------------------------------------------------------------

        // Running Threads in Parallel
        System.out.println("\nRunning Threads in Parallel:");

        // Starting a Custom Thread to run in Parallel with the Main Thread
        CustomThread newThread = new CustomThread();
        newThread.start();

        // Running the Main Thread in Parallel with the Custom Thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + 0);

            // Sleeping the Main thread to view parallel execution
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // -------------------------------------------------------------------------------------------------------------

        System.out.println("\nWorking with Threads from the Runnable Interface alongwith Threads from the Custom Thread and the Main Thread");

        // Creating threads using the Runnable Interface
        Runnable myRun = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Runnable Thread: " + 2);
                try {
                    TimeUnit.MILLISECONDS.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Accessing the Thread by creating an instance of the Thread class
        Thread newRunnableThread = new Thread(myRun);

        // Starting the Runnable Thread
        newRunnableThread.start();

        // Starting the Custom Thread
        CustomThread newThread2 = new CustomThread();
        newThread2.start();

        // Starting the Main Thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + 0);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // -------------------------------------------------------------------------------------------------------------

        /*
        Working the Threads:

        System.out.println("\nInteracting with Threads .... ");
        Thread interThread = new Thread(() -> {
            String tName = Thread.currentThread().getName();
            System.out.println("Current Thread: " + tName + " should take 10 dots to complete");
            for (int i = 0; i < 10; i++) {
                System.out.print(". ");
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println();
            System.out.println("The Thread has completed Execution");
        });

        System.out.println("Starting working with the Interactive Thread: " + interThread.getName());
        interThread.start();

        System.out.println("The main thread is still being executed"); */

        // -------------------------------------------------------------------------------------------------------------

        /* Interrupting Threads: */
        System.out.println("\nWorking on Interrupting Threads");

        Thread thread = new Thread(() -> {

            // Accessing the Name of the Current Thread
            String threadName = Thread.currentThread().getName();
            System.out.println("The Current Thread is: " + threadName);

            // Printing the 10 dots of the Thread
            for (int i = 0; i < 10; i++) {
                System.out.print(". ");

                try {
                    // Sleeping the Thread after every execution for 500 millis
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {

                    System.out.println("\nThread: " + threadName + " was interrupted after the execution of the main thread");
                    return;
                }
            }
        });

        System.out.println("Starting execution of Thread: " + thread.getName());
        thread.start();

        System.out.println("Returning Execution to the Main Thread: " + Thread.currentThread().getName());

        // Interrupting Case for the Main Thread
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupting the User Thread
        thread.interrupt();
    }

    // -------------------------------------------------------------------------------------------------------------

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
