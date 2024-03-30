public class CustomChallengeThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            // Checking if the number is an odd number
            if ((i + 1) % 2 != 0) {
                System.out.println("Odd Thread: " + (i + 1));
            }

            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                System.out.println("\nThe Odd Thread was interrupted before completion");
                return;
            }
        }

        System.out.println("\nThe Odd Thread has completed execution successfully");
    }
}
