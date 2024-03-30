import java.util.concurrent.TimeUnit;

public class ThreeSec {
    public static void main(String[] args) {

        // Creating a Thread using the Runnable Interface
        Thread myThread = new Thread(() -> {
           System.out.println("Executing the User Thread: " + Thread.currentThread().getName());
           for (int i = 0; i < 10; i++) {
               System.out.printf(String.format("%d . %n", i + 1));
               try {
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   System.out.println("The User Thread was terminated before completion of execution");
                   return;
               }
           }
           System.out.println("The User Thread has completed execution successfully");
        });

        System.out.println("Starting execution of the User Thread");
        myThread.start();
        System.out.println("Access of execution is still with the Main Thread while the User Thread is being setup");

        long timeStart = System.currentTimeMillis();
        while (myThread.isAlive()) {
            try {

                // Checking if the Burst Time allocated has elapsed
                if (System.currentTimeMillis() - timeStart > 3000) {
                    System.out.println("The User Thread is taking tooo long, terminating its execution");
                    myThread.interrupt();
                    break;
                }

                // If not elapsed continue execution of the User Thread and Pause the Main Thread
                System.out.println("\nWaiting for Execution of the User Thread");
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println("The Main thread was terminated before completion");
            }
        }
    }
}
