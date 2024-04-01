import java.util.Random;

// Class to Manage the Message and provide the producer and consumer operations
class MessageRepo {

    // Stores the message that is read by the producer and the consumer
    private String message;

    // A boolean flag to keep track of the message variable
    private boolean hasMessage;

    // Reading the Message
    public synchronized String read() {
        while (!hasMessage) {
            // Idle looping as long as there is no message in the Message Variable
        }

        // If there is a message we read it and set the flag again to false
        hasMessage = false;
        return message;
    }

    // Writing the Message
    public synchronized void write(String message) {
        while (hasMessage) {
            // Idle looping until the message is read by the consumer and written
        }

        // If the message has been read we repopulate the message variable
        hasMessage = true;
        this.message = message;
    }
}

// ---------------------------------------------------------------------------------------------------------------------

// Producer Class
class Writer implements Runnable {

    // Instance fields of the Class
    private MessageRepo producedMessage;
    private String text = """
            Pratik liked Nitya\nSandeep liked Reshmi\nBoth the couples brokeup\nPratik liked reshmi\nAll friendships broke\nI liked Pooja\nI was ratted out and humiliated\nI became a loner\nNext year started\nI loved Kusum\nShe loved me back\nWe both grew close only to be apart after school
            """;

    // Thread execution instructions
    @Override
    public void run() {

        // Splitting the Lines
        String[] lines = text.split("\n");

        // Generating Random sleep durations for the threads
        Random random = new Random();

        // Looping the lines of text for producing messages
        for (int i = 0; i < lines.length; i++) {

            // Producing the Message into the Message placeholder of the MessageRepo Class
            producedMessage.write(lines[i]);

            // Sleeping the Thread for concurrent Consumer Operation
            try {
                Thread.sleep(random.nextInt(1000, 2000));
            } catch (InterruptedException e) {
                System.out.println("The Producer Thread was Interrupted before completion");
                e.printStackTrace();
            }
        }
        producedMessage.write("The Producer Thread completed execution successfully");
    }

    // Constructor of the Class
    public Writer(MessageRepo producedMessage) {
        this.producedMessage = producedMessage;
    }
}

// ---------------------------------------------------------------------------------------------------------------------

// Consumer Class
class Reader implements Runnable {

    // Instance Fields of the Class
    private MessageRepo consumedMessage;

    // Thread execution instructions
    @Override
    public void run() {

        // Generating Random sleep times for concurrent execution of threads
        Random random = new Random();

        // Keeping track of the latest message that was produced
        String latestMessage = "";

        // Looping until all the produced messages are consumed
        do {

            // Sleeping the Thread for Concurrent Operation
            try {
                Thread.sleep(random.nextInt(1000, 2000));
            } catch (InterruptedException e) {
                System.out.println("The Consumer Thread was interrupted before completion");
                e.printStackTrace();
            }

            // Assigning the newly produced message
            latestMessage = consumedMessage.read();
            System.out.println(latestMessage);
        } while(!consumedMessage.equals("The Producer Thread completed execution successfully"));
    }

    // Constructor of the Class
    public Reader(MessageRepo consumedMessage) {
        this.consumedMessage = consumedMessage;
    }
}

// ---------------------------------------------------------------------------------------------------------------------

// Driver Class
public class ProducerConsumer {
    public static void main(String[] args) {

        // Creating the Message Repository
        MessageRepo myMessages = new MessageRepo();

        // Creating the Producer and Consumer Threads
        Thread producerThread = new Thread(new Writer(myMessages));
        Thread consumerThread = new Thread(new Reader(myMessages));

        // Starting the Threads
        producerThread.start();
        consumerThread.start();
    }
}
