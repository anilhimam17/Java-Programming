public class AirPlane {

    // Static Fields
    private static String make = "Airbus";
    private static String model = "A380";
    private static int minSeating = 525;
    private static int maxSeating = 853;

    // Helper Functions
    public void planeSpec() {
        System.out.println("The Specs of the Airplane are as follows: ");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Average Seating: " + minSeating);
        System.out.println("Maximum Seating: " + maxSeating);
    }

    // Setter Methods
    public static void setMake(String make) {
        AirPlane.make = make;
    }

    public static void setModel(String model) {
        AirPlane.model = model;
    }

    public static void setMinSeating(int minSeating) {
        AirPlane.minSeating = minSeating;
    }

    public static void setMaxSeating(int maxSeating) {
        AirPlane.maxSeating = maxSeating;
    }

    /*
    * Constructors and Chaining
    * - Chaining of Constructors can only be done when overloaded constructors are called from one - another
    * - The "this()" should be the first line of the constructor to Chain them together
    * - Constructor chaining exists to ensure Correct Initialisation of Objects when no argument is passed into the new Instance
    */

    public AirPlane() {

        // Utilising Constructor Chaining to Declare and Airbus Aircraft by default
        this("Airbus", "Not Selected", 0, 0);
        System.out.println("The Default Constructor of the Class was used");
    }

    // Argument Constructor to Chain the Default Constructor
    public AirPlane(String make, String model, int minSeating, int maxSeating) {

        System.out.println("The Arguments Constructor was used");

        // Initialising all the values
        AirPlane.make = make;
        AirPlane.model = model;
        AirPlane.minSeating = minSeating;
        AirPlane.maxSeating = maxSeating;
    }


}
