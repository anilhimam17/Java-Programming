public class ThreadChallenge {
    public static void main(String[] args) {

        System.out.print("The Program is to complete the Thread Challenge from the Course ");
        Thread dotThread = new Thread(() -> {
           for (int i = 0; i < 5; i++) {
               System.out.print(" .");

               try {
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   System.out.println("The Dot Thread was Interrupted");
               }
           }

           // Completing execution of the Thread with an End of the Line
           System.out.println();
        });

        // Starting the Printing of Dots
        dotThread.start();

        try {
            dotThread.join();
        } catch (InterruptedException e) {
            System.out.println("The Main Thread was Interrupted");
        }

        // -------------------------------------------------------------------------------------------------------------

        Thread evenThread = new Thread(() -> {
           for (int i = 0; i < 10; i++) {
               if ((i + 1) % 2 == 0) {
                   System.out.println("Even Thread: " + (i + 1));
               }

               try {
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   System.out.println("\nThe Even Thread was Interrupted before completion");
                   return;
               }
           }
            System.out.println("The Even Thread has completed execution successfully");
        });

        // -------------------------------------------------------------------------------------------------------------

        // Creating an Object of the Odd Thread class
        CustomChallengeThread oddThread = new CustomChallengeThread();

//        // Calling both the Threads
//        oddThread.start();
//        evenThread.start();

        // Calling Both Threads with Interrupts from the Main Thread
        oddThread.start();
        evenThread.start();

        // Keeping Track of the Start time for Thread Execution
        long startTime = System.currentTimeMillis();
        while (oddThread.isAlive() || evenThread.isAlive()) {
            try {

                // Interrupting the Threads when the combined burst time has exhausted the allocated burst time
                if (System.currentTimeMillis() - startTime > 5000) {
                    oddThread.interrupt();
                    evenThread.interrupt();
                }

                // Sleeping the Main Thread to continue execution
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The Main Thread was Interrupted");
            }
        }

        System.out.println("\nThe Control of the Program has returned to the Main Thread");

    }
}

