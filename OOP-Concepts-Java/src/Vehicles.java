public class Vehicles {

    // Instance Variables of the Class
    private String type;
    private String make;
    private String model;
    private int power;
    private int wheels;

    // Helper Functions
    public void vehicle_spec() {

        // Displaying the Specs wrt each Instance of the Vehicle Class
        System.out.println("\nThe Specs of the the vehicle are as follows");
        System.out.println("Type: " + this.type);
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Power: " + this.power);
        System.out.println("Wheels: " + this.wheels);
    }

    // Getter Methods
    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getType() {
        return this.type;
    }

    public int getPower() {
        return this.power;
    }

    public int getWheels() {
        return this.wheels;
    }

    // Setter Methods

    public void setType(String type) {
        this.type = type;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    // Constructors of the Class

    // Default Constructor with Chaining
    public Vehicles() {
        this("Not Defined", "Not Defined", "Not Defined", 0, 0);
    }

    // Arguments Constructor
    public Vehicles(String type, String make, String model, int power, int wheels) {

        // Initialising in accordance to the Arguments passed
        this.type = type;
        this.make = make;
        this.model = model;
        this.power = power;
        this.wheels = wheels;
    }
}
