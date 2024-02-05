public class UnderstandingInheritance {
    public static void main(String[] args) {

        // Creating Car Objects
        Car mcLarenSenna = new Car(
                "Road Car",
                "McLaren",
                "Senna",
                788,
                4,
                9.69F,
                2,
                0,
                334
        );

        // Viewing the Specs of the Car
        mcLarenSenna.carSpec();

        // -----------------------------------------------------

        // Creating a Vehicle Object
        Vehicles car = new Vehicles();

        // Viewing the Default Specs of the Car
        car.vehicle_spec();

        // Providing Car Specs
        car.setMake("Mazda");
        car.setModel("RX - 7");
        car.setPower(450);
        car.setType("Road Car");
        car.setWheels(4);

        // Viewing the specs of the car after modification
        car.vehicle_spec();

        // -----------------------------------------------------

        // Creating an AirPlane
        AirPlane a380 = new AirPlane(
                "Long Haul", "Airbus", "A380", 2500 * 110, 22, 15200, 525, 853, true
        );

        // Viewing the Spec of the AirPlane
        a380.vehicle_spec();
    }
}
