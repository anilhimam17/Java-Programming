import java.util.concurrent.TimeUnit;

public class ThreeSec {
    public static void main(String[] args) {

        // Creating a New User Thread
        Thread thread = new Thread(() -> {

            String uThreadName = Thread.currentThread().getName();
            System.out.println("\nUser Thread: " + uThreadName);

            for (int i = 0; i < 10; i++) {
                System.out.print(". ");

                try {

                    // Making the User Thread Sleep
                    TimeUnit.MILLISECONDS.sleep(500);

                    // Acquiring the state of the User thread after each sleep statement
                    System.out.println("User Thread: " + Thread.currentThread().getState());

                } catch (InterruptedException e) {
                    System.out.println();
                    System.out.println("The Thread was executed for more than 3 Seconds ....");
                    System.out.println("The Thread was hence terminated.");
                    System.out.println(Thread.currentThread().getState());
                    return;
                }
            }

            System.out.println("\nCompleted the Execution of the Thread");
        });

        // Using the above thread
        System.out.println("Starting the execution of the User Thread");
        thread.start();

        // Keeping track of the time being elapsed under the User Thread
        long time = System.currentTimeMillis();
        while (thread.isAlive()) {
            System.out.println("\nThe User Thread is still being executed");

            try {

                // Sleeping the Main Thread since the User Thread still has time to live
                Thread.sleep(1000);

                // Acquiring the state of the Main Thread after sleep
                System.out.println("Main Thread: " + Thread.currentThread().getState());

                // If thread elapsed time then returning control to the main thread
                if (System.currentTimeMillis() - time > 2000) {
                    thread.interrupt();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Viewing the State of the User Thread once terminated
        System.out.println("User: " + thread.getState());

        /*
        System.out.println("Returning Execution to the Main Thread");
        // Thread.currentThread().interrupt();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("The Main Thread was Interrupted");
        }

        // Interrupting the User Thread
        thread.interrupt();
        */
    }
}
