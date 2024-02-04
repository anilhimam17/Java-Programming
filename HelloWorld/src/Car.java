public class Car {

    // All the Variables of the Class, by default private
    private String make = "Bugatti";
    private String model = "Chiron";
    private int power = 1600;
    private  int doors = 2;
    
    public void displayCarSpec() {
        System.out.println("Company: " + make + "\nModel: " + model + "\nPower: " + power + " HP\n" + "Doors: " + doors);
    }

    // Getter Methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public int getDoors() {
        return doors;
    }

    // Setter Methods
    /*
    * The "this" key word is used to refer to the particular instance of the class
    * Thus changing the values of the variables / members effects only the current instance of the class
    */
    public void setCompany(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    /*
    * Building Constructors of the Class
    * - Constructors of the Class are similar to methods of the class but don't return any values
    * - They can be overloaded like functions to assist creation of different types of instances of the class
    * - They have the name and access modifier of the class
    * - Most importantly a constructor allow custom initialization of the class
    */

    public Car() {
        System.out.println("The Default Constructor of the Class was used");
    }

    /*
    * Once a constructor is declared the default constructor from Java isn't provided anymore
    * We need to overload the constructors to include the default constructor
    */

    public Car(String make, String model, int power, int doors) {
        System.out.println("\nThe Argument Constructor of the Class was used");
        this.make = make;
        this.model = model;
        this.power = power;
        this.doors = doors;
    }
}
