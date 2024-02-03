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

    // Getter Methods
    public static String getMake() {
        return make;
    }

    public static String getModel() {
        return model;
    }

    public static int getMinSeating() {
        return minSeating;
    }

    public static int getMaxSeating() {
        return maxSeating;
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
}
