public class Jet implements FlightEnabled, Trackable {

    // Implementing all the abstract methods of the FlightEnabled Interface
    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " has taken off");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying and hs reached cruising altitude");
    }

    @Override
    public void landing() {
        System.out.println(getClass().getSimpleName() + " has completed its flight and landed");
    }

    // Implementing all the abstract methods of the Trackable Interface

    @Override
    public void coordinates() {
        System.out.println(getClass().getSimpleName() + " is currently enroute to (37.548789, -122.514065)");
    }

    @Override
    public void tracking() {
        System.out.println(getClass().getSimpleName() + " is currently being tracked");
    }

    @Override
    public void speedInKMH(double speedInMPH) {
        System.out.println("The Speed of the " + getClass().getSimpleName() + " in KMH is: " + Jet.MPH_TO_KMH * speedInMPH);
    }
}
