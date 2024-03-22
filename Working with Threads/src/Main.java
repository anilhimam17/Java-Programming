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
