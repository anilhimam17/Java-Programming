public class MainInterface {
    public static void main(String[] args) {
        // Creating objects of the Car Class
        Car mclarenSenna = new Car("McLaren", "Senna", 730);

        // Referencing all the functionality of the class
        System.out.println("Describing the Car: ");
        mclarenSenna.describeCar();

        System.out.println("\nDescribing the Cornering");
        mclarenSenna.describeEntryStability();
        mclarenSenna.describeExitStability();
        mclarenSenna.describeEntrySpeed();
        mclarenSenna.describeExitSpeed();

        System.out.println("\nDescribing the Handling");
        mclarenSenna.describeWeightDistribution();
        mclarenSenna.describeUndersteer();
        mclarenSenna.describeOversteer();
        mclarenSenna.describeStability();

        System.out.println("\nDescribing the Utility");
        mclarenSenna.describeDriving();
    }
}