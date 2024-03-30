public class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Working with Thread Joins and Other Properties");

        // Download Thread
        Thread newThread = new Thread(() -> {
            System.out.println("Executing Thread: " + Thread.currentThread().getName());
            for (int i = 0; i < 10; i++) {
                System.out.printf(String.format("%d . %n", i + 1));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("The Download Thread was interrupted before completion of execution");
                    Thread.currentThread().interrupt();
                    /*
                    * Important:
                    * - In Java if and once a thread is interrupted but not dealt with immediately we need to reassert the interrupt
                    * - This means we need to Interrupt the thread within itself in the Catch clause
                    * - This is so that once the program return execution to the Interrupted Thread is continues to stop executing it
                    */
                    return;
                }
            }
            System.out.println("Completed the Download process");
        }, "DownloadThread");

        // Install Thread
        Thread installThread = new Thread(() -> {
            System.out.println("Beginning the Installation Process: " + Thread.currentThread().getName());
            for (int i = 0; i < 3; i++) {
                System.out.printf(String.format("Completed Installation step: %d%n", i + 1));
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    System.out.println("The Installation Thread was interrupted before completion");
                }
            }
            System.out.println("Completed the Installation Process");
        }, "InstallThread");

        /*
        * Since the below while loop interrupts the user thread we need to comment the loop
        * to complete the installation process
        */

//        // Keeping Track of time to interrupt the thread when necessary
//        long startTime = System.currentTimeMillis();
//        while (newThread.isAlive()) {
//            System.out.println("\nWaiting for the completion of User Thread execution");
//
//            try {
//                Thread.sleep(1000);
//                if (System.currentTimeMillis() - startTime > 3000) {
//                    newThread.interrupt();
//                }
//            } catch (InterruptedException e) {
//                System.out.println("The Main Thread was Interrupted");
//            }
//        }

        /*
        * Monitor Thread
        * - It performs the tasks similar to the while loop above
        * - It checks if the Download process is taking too long and terminates the execution of the download process if necessary
        */
        Thread monitorThread = new Thread(() -> {
            long startTime = System.currentTimeMillis();
            while (newThread.isAlive()) {
                try {
                    Thread.sleep(1000);
                    if (System.currentTimeMillis() - startTime > 6000) {
                        newThread.interrupt();
                    }
                } catch (InterruptedException e) {
                    System.out.println("The Monitor Thread was Interrupted");
                }
            }
        }, "MonitorThread");

        // -------------------------------------------------------------------------------------------------------------

        System.out.println("Starting the Execution of the Download Thread");
        newThread.start();

        // Monitor Thread must be started along with the Download Thread to monitor the duration taken by the Download Thread
        monitorThread.start();

        /*
        * Joining Threads:
        * - It allows to control the execution of threads by creating dependencies in threads while executing
        * - In this example once the above thread completes execution concurrently with the main
        * thread we pass the control of the execution to the installation thread.
        * - Thus only if the newThread - Download Thread completes installation successfully the Installation thread runs
        * meanwhile being binded to the Main Thread with Thread.join() it waits for execution to being.
        */

        try {
            newThread.join();
        } catch (InterruptedException e) {
            System.out.println("The Main thread was Interrupted");
        }

        if (!newThread.isInterrupted()) {
            System.out.println("\nThe Download Thread has completed execution successfully, starting the installation process");
            installThread.start();
        } else {
            System.out.println("\nThe Download Thread was Interrupted, cant start the " + installThread.getName());
        }
    }
}
