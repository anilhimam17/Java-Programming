// Inheriting the Attributes of the Parent Class Vehicle
public class Car extends Vehicles{

    // Instance variables that are specific to cars
    float mileage;
    int noOfSeats;
    float bootSpace;
    float topSpeed;

    // Helper Function of the Car Class
    public void carSpec() {
        System.out.println("\nThe Specs of this car are:");
        System.out.println("Make: " + this.getMake());
        System.out.println("Model: " + this.getModel());
        System.out.println("Type: " + this.getType());
        System.out.println("Power: " + this.getPower());
        System.out.println("Mileage: " + this.getMileage());
        System.out.println("No of Seats: " + this.getNoOfSeats());
        System.out.println("bootSpace: " + this.getBootSpace());
        System.out.println("Top Speed: " + this.getTopSpeed());

    }

    // Getter and Setter Functions
    public float getMileage() {
        return this.mileage;
    }

    public int getNoOfSeats() {
        return this.noOfSeats;
    }

    public float getBootSpace() {
        return this.bootSpace;
    }

    public float getTopSpeed() {
        return this.topSpeed;
    }

    // Constructor of the Class
    public Car() {

        // Chaining the Constructor to initialise objects without arguments
        this("Road Car", "Not Defined", "Not Defined", 0, 4, 0, 0, 0, 0);
    }

    public Car(String type, String make, String model, int power, int wheels, float mileage, int noOfSeats, float bootSpace, float topSpeed) {

        // Initialising Parent Class attributes using the parent class constructor
        super(type, make, model, power, wheels);

        // Initialising Child Class variables
        this.mileage = mileage;
        this.noOfSeats = noOfSeats;
        this.bootSpace = bootSpace;
        this.topSpeed = topSpeed;
    }
}
