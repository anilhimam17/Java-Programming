interface FlightEnabled {

    double MPH_TO_KMH = 1.6093;

    abstract void takeOff();
    void landing();
    void fly();
    void speedInKMH(double speedInMPH);
}

interface Trackable {
    abstract void tracking();
    void coordinates();
}

public abstract class Animals {
    abstract void move();
}
