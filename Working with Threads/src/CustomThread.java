public class CustomThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            System.out.println("\nCustom Thread: " + 1);

            try {
                // Making the Thread Sleep as long as the Thread is Active for each iteration of the loop
                System.out.println("Making the Custom Thread sleep for 500 millis");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Displaying the Stack trace of the Thread
                e.printStackTrace();
            }

        }
    }
}
