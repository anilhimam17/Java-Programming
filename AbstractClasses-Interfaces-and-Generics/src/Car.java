public class Car extends Specs implements Driving, Handling, Cornering{

    // Implementing the Abstract Methods of Specs
    @Override
    public void describeCar() {
        System.out.println("Company: " + this.getCompany());
        System.out.println("Model: " + this.getModel());
        System.out.println("Power: " + this.getPower());
    }

    // Implementing the Abstract Methods of the Interface Cornering ----------------------------------------------------
    @Override
    public void describeEntryStability() {
        System.out.println("\nThe Entry Stability of the Car seems to be good");
    }

    @Override
    public void describeExitStability() {
        System.out.println("\nThe Exit Stability of the Car seems to be good");
    }

    @Override
    public void describeEntrySpeed() {
        System.out.println("\nThe Entry Speed of the Car seems to be good");
    }

    @Override
    public void describeExitSpeed() {
        System.out.println("\nThe Exit Speed of the Car seems to be good");
    }

    // Implementing the Abstract Methods of the Interface Driving ----------------------------------------------------

    @Override
    public void describeDriving() {
        System.out.println("\nDescribing the Driving Capability of the car:");
        System.out.println("Comfort: " + Driving.comfort);
        System.out.println("Utility: " + Driving.utility);
    }

    @Override
    public void describeUtility() {
        System.out.println("Already Described in Driving");
    }

    // Implementing the Abstract Methods of the Interface Handling ----------------------------------------------------

    @Override
    public void describeWeightDistribution() {
        System.out.println("The Weight Distribution is Epic!!!!");
    }

    @Override
    public void describeUndersteer() {
        System.out.println("The Understeer is Just about Right. Cant wait to corner at full throttle");
    }

    @Override
    public void describeOversteer() {
        System.out.println("Need to keep the snap of oversteer in check while having throttle control");
    }

    @Override
    public void describeStability() {
        System.out.println("The Stability is good");
    }

    // Constructor of the Class ----------------------------------------------------------------------------------------
    public Car(String company, String model, int power) {
        super(company, model, power);
    }
}