import java.util.concurrent.TimeUnit;

public class Multithreading {
    public static void main(String[] args) {
        System.out.println("Beginning Multithreading in Java");

        // Creating a Stopwatch that counts in seconds
        StopWatch newWatch = new StopWatch(TimeUnit.SECONDS);

        // Providing the countdown method and a color
        Thread blue = new Thread(newWatch::countDown, Colors.ANSI_BLUE.name());

        // Running multiple threads
        Thread green = new Thread(newWatch::countDown, Colors.ANSI_GREEN.name());
        Thread yellow = new Thread(() -> newWatch.countDown(10), Colors.ANSI_YELLOW.name());

        // Starting the Thread
        blue.start();
        green.start();
        yellow.start();
    }
}

class StopWatch {

    // Instance field of the class
    private TimeUnit timeUnit;

    // Overloading the Method for no args call
    public void countDown() {
        countDown(5);
    }

    // Countdown Timer
    public void countDown(int unitCount) {

        // Accessing the name of the current thread
        String threadName = Thread.currentThread().getName();

        // Resetting the thread color value to default before assigning it different colors
        Colors threadColor = Colors.ANSI_RESET;

        try {
            // Accessing the color value of the thread and assigning it to the thread color
            threadColor = Colors.valueOf(threadName);
        } catch (IllegalArgumentException ignore) {
            // Ignorning any invalid color passed by the user
        }

        // Storing the color of the thread as a string once its a valid color from the Enum
        String color = threadColor.color();
        for (int i = unitCount; i > 0; i--) {
            try {
                timeUnit.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("The Countdown Timer was interrupted");
                e.printStackTrace();
            }
            System.out.printf("%s %s Thread: i = %d%n", color, threadName, i);
        }
        System.out.println("Completed the Timer .............. ");
    }

    // Constructor of the Class
    public StopWatch(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }
}
