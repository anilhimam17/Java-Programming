public class AirPlane extends Vehicles {

    // Variables of the Class
    private int range;
    private int avgPassengerSeating;
    private int maxPassengerSeating;
    private boolean APU;

    // Helper Function of the Class overriding the Parent Class Function
    @Override
    public void vehicle_spec() {
        System.out.println("\nThe Specs of the AirPlane are as follows:");
        System.out.println("Type: " + this.getType());
        System.out.println("Make: " + this.getMake());
        System.out.println("Model: " + this.getModel());
        System.out.println("Power: " + this.getPower());
        System.out.println("Wheels: " + this.getWheels());
        System.out.println("Range: " + this.getRange());
        System.out.println("Average Passenger Seating: " + this.getAvgPassengerSeating());
        System.out.println("Maximum Passenger Seating: " + this.getMaxPassengerSeating());
        System.out.println("Auto Pilot Unit (Enabled): " + this.isAPU());

        System.out.println("\n\nViewing the Parent Class output of the method for fun");
        super.vehicle_spec();
    }

    // Getter Functions
    public int getRange() {
        return range;
    }

    public int getAvgPassengerSeating() {
        return avgPassengerSeating;
    }

    public int getMaxPassengerSeating() {
        return maxPassengerSeating;
    }

    public boolean isAPU() {
        return APU;
    }

    // Setter Functions
    public void setRange(int range) {
        this.range = range;
    }

    public void setAvgPassengerSeating(int avgPassengerSeating) {
        this.avgPassengerSeating = avgPassengerSeating;
    }

    public void setMaxPassengerSeating(int maxPassengerSeating) {
        this.maxPassengerSeating = maxPassengerSeating;
    }

    public void setAPU(boolean APU) {
        this.APU = APU;
    }

    // Constructor of the Class

    // Chaining the Default Constructor of the Class
    public AirPlane() {
        this("Air Craft", "Not Defined", "Not Defined", 0, 0, 0, 0, 0, false);
    }

    public AirPlane(String type, String make, String model, int power, int wheels, int range, int avgPassengerSeating, int maxPassengerSeating, boolean APU) {

        // Initialising the Parent Class Variables using the Parent Class Constructor
        super(type, make, model, power, wheels);

        // Initialising the Child Class Variables
        this.range = range;
        this.avgPassengerSeating = avgPassengerSeating;
        this.maxPassengerSeating = maxPassengerSeating;
        this.APU = APU;
    }
}
