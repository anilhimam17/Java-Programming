/*
* This program focusses on highlighting one of the major problems for concurrent threading
* -> Memory Inconsistency Issues
*/

import java.util.concurrent.TimeUnit;

public class Main {

    // Instance field to keep track of the state flag
    private volatile boolean flag = false;

    public static void main(String[] args) {
        System.out.println("Working with Memory Inconsistency Issues: ");

        // Creating an object of the Main Class
        Main synchro = new Main();

        // Writer Thread
        Thread writerThread = new Thread(() -> {
           try {
               TimeUnit.SECONDS.sleep(1);
           } catch (InterruptedException e) {
               System.out.println("The Writer Thread was interrupted before completion");
               e.printStackTrace();
           }
           System.out.println("\nThe Writer Thread has successfully completed execution, toggling the flag");
           synchro.toggleFlag();
//           System.out.println(synchro.flag);
        });

        // Reader Thread
        Thread readerThread = new Thread(() -> {
           while (writerThread.isAlive()) {
               // Waiting for the writer thread to complete its execution
           }
           System.out.println("\nThe Flag is set to " + synchro.readyFlag() + " beginning the reader thread");
        });

        // Starting the Threads
        writerThread.start();
        readerThread.start();

    }

    // Helper functions for the synchronisation problems
    public void toggleFlag() {
        flag = !flag;
    }

    public boolean readyFlag() {
        return flag;
    }
}