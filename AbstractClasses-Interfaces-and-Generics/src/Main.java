/*
 * - This code runs using the Animals.java (Contains the Interfaces)
 * - This code also runs using Bird.java (Contains the Complete object which implements the
 * abstract class and the interfaces being used
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Working with Interfaces Part - 1");

        // Creating objects of the Bird Class
        Bird bird = new Bird();

        /*
         * - Since the Bird Object extends abstract class animal and implements
         * interfaces FlightEnabled and Trackable, they can also be used to create
         * objects of the bird class
         */

        // New objects using the Parent Object namespace
        Animals birds = new Bird();
        FlightEnabled flyingBird = new Bird();
        Trackable trackedBird = new Bird();

        System.out.println("Checking the Instances of the Objects: ");
        if (birds instanceof Animals)
            System.out.println("Instance of Animals");

        if (flyingBird instanceof FlightEnabled)
            System.out.println("Instance of FlightEnabled");

        if (flyingBird instanceof Trackable)
            System.out.println("Instance of Trackable");

        // ------------------------------------------------------------------------------------------------------------------------

        // Checking for Function Spaces for Different namespaces while creating instances
        // Calling the Move Method
        System.out.println("\nUsing the Animal Namespace to reference the Abstract Method");
        birds.move();

        /*
        * flyingBird.move();
        * trackedBird.move();
        * The above calls don't work as the particular function call isn't implemented in the interfaces
        * Thus each parent object namespace can plugin to the functionality only brought by them
        */

        // ------------------------------------------------------------------------------------------------------------------------

        // Calling methods created in each class / interface from their namespace

        System.out.println("\nThe methods from the Animals Abstract Class");
        birds.move();

        System.out.println("\nThe methods from the FlightEnabled Interface");
        flyingBird.takeOff();
        flyingBird.landing();

        System.out.println("\nThe methods from the Trackable Interface");
        trackedBird.tracking();
        trackedBird.coordinates();

        // ------------------------------------------------------------------------------------------------------------------------

        // Working with the Helper Function
        System.out.println("\nWorking with the helper functions for FlightEnabled Interface");
        inFlight(flyingBird);

        // Using the Jet class empowered by interfaces for a different object with similar methods
        System.out.println("\nWorking with helper functions for the Jet Class");
        inFlight(new Jet());

        // ------------------------------------------------------------------------------------------------------------------------

        /*
        * - By default, all the variables (properties) defined inside an interface are Public, Static and Final
        * - They can be referenced from the Interface namespace or the Child Class namespace
        * - This is unlike static variables of a class which are only referenced from the class namespace
        */

        System.out.println("\nSpeeds in KMH from two seperate objects utilising similar methods provided by interfaces");
        flyingBird.speedInKMH(60);
        new Jet().speedInKMH(500);

    }

    // Helper Methods
    private static void inFlight(FlightEnabled flier) {

        // Methods of the FlightEnabled Instance
        flier.takeOff();
        flier.fly();

        // Checking the object to utilise Tracking methods
        if (flier instanceof Trackable track) {
            track.tracking();
            track.coordinates();
        }

        flier.landing();

    }
}
