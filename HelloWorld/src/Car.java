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
}
