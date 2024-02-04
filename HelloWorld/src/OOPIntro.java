import javax.swing.*;

public class OOPIntro {
    public static void main(String[] args) {

        // Declaring and Instance of the Class and Invoking a Method of the Class
        Car bugatti = new Car();
        System.out.println("Viewing the Default Specs of the Car:");
        bugatti.displayCarSpec();

        // Accessing the Different Private Variables of the Class
        String make = bugatti.getMake();
        String model = bugatti.getModel();
        int power = bugatti.getPower();
        int doors = bugatti.getDoors();

        // Setting new values to the Private Variables of the Class
        bugatti.setCompany("McLaren");
        bugatti.setModel("Senna");
        bugatti.setPower(730);
        bugatti.setDoors(2);

        // Now viewing the Bugatti transformed McLaren
        System.out.println("\nViewing the Changes after Setter: ");
        bugatti.displayCarSpec();

        // -------------------------------------------------------------

        // Working with a Class containing Static Members
        AirPlane newPlane = new AirPlane();
        AirPlane secondPlane = new AirPlane();

        // Viewing the Specs of the Airplane
        System.out.println("\nSpecs of the First Airplane:");
        newPlane.planeSpec();

        System.out.println("\nSpecs of the Second Airplane:");
        secondPlane.planeSpec();

        // Making Changes to a Static Field
        AirPlane.setMake("Boeing");
        AirPlane.setModel("777 - Widebody");
        AirPlane.setMinSeating(303);
        AirPlane.setMaxSeating(342);

        // Viewing the Changed Specs
        System.out.println("\nChanged Specs: ");
        System.out.println("\nSpecs of the First Airplane:");
        newPlane.planeSpec();

        System.out.println("\nSpecs of the Second Airplane:");
        secondPlane.planeSpec();

        // -------------------------------------------------------------

        // Utilising the Argument Constructor of the Class
        Car custom_car1 = new Car(make="Mazda", model="RX-7", power=450, doors=2);
        Car custom_car2 = new Car(make="Toyota", model="AE86 Corolla", power=200, doors=2);

        System.out.println("\nViewing the Specs of the Custom Car:");
        custom_car1.displayCarSpec();
        custom_car2.displayCarSpec();

        // -------------------------------------------------------------

        // Utilising Constructor Chaining for Default Initialisation
        AirPlane defAirPlane = new AirPlane();
        System.out.println("\nViewing the Specs of the Default Airplane:");
        defAirPlane.planeSpec();

        System.out.println("\nSince we used default Initialisation in Static Feild all other planes are also initialised to default values");
        secondPlane.planeSpec();
    }
}

