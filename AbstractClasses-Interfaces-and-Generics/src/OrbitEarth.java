/*
* This new interface depends on all the interfaces we have defined before to work alongside Main.java
*/

class SpaceCraft implements OrbitEarth {

    // -----------------------------------------------------------------------------------------------------------------

    // Implementing the Functions of the OrbitEarth Interface
    @Override
    public void reachOrbit() {
        System.out.println("The " + getClass().getSimpleName() + " has reached orbit");
    }

    @Override
    public void orbitSpeed() {
        System.out.println("The " + getClass().getSimpleName() + " has reached orbit speed");
    }

    // -----------------------------------------------------------------------------------------------------------------

    // Implementing the Functions of the Trackable Interface since OrbitEarth also implements Trackable
    @Override
    public void tracking() {
        System.out.println("The " + getClass().getSimpleName() + " is being tracked");
    }

    @Override
    public void coordinates() {
        System.out.println("The " + getClass().getSimpleName() + " has reached the coordinates");
    }
}

public interface OrbitEarth extends Trackable {

    // Abstract methods of the Particular Interface
    void reachOrbit();
    void orbitSpeed();

    /*
    * Imp:
    * - All the methods implemented by other interfaces when extended to another interface do not need to be implemented
    * in the child interface either.
    * - Thus the inheriting Subclasses need to implement all the methods keeping everything in mind.
    */
}
