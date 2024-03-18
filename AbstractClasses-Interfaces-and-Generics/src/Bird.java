public class Bird extends Animals implements FlightEnabled, Trackable {

    // Abstract Method from the Animal Class
    @Override
    public void move() {
        System.out.println("The bird now moves using the function from the Animal Class");
    }

    // Abstract methods from the FlightEnabled interface
    @Override
    public void takeOff() {
        System.out.println("The bird has takenOff the Ground");
    }

    @Override
    public void landing() {
        System.out.println("The bird has landed");
    }

    @Override
    public void fly() {
        System.out.println("The bird is flying");
    }

    // Abstract methods from the Trackable interface
    @Override
    public void tracking() {
        System.out.println("The bird is now being tracked");
    }

    @Override
    public void coordinates() {
        System.out.println("Here are the Coordinates of the Bird: (37.548789, -122.514065)");
    }

    @Override
    public void speedInKMH(double speedInMPH) {
        System.out.println("The Speed of the " + getClass().getSimpleName() + " in KMH is: " + Jet.MPH_TO_KMH * speedInMPH);
    }
}
