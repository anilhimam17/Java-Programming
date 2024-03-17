public interface Driving {

    /*
    * Important
    * - Always keep every field declared to be Static and Final
    * - Always keep methods as abstract (without a body)
    */

    /*
    * Static and Final can also be avoided as it is assumed that they are applied by default
    */
    static final String comfort = null;
    String utility = null;

    /*
    * Abstract Methods of the Interface
    * Abstract modified is assumed by default again
    */
    abstract void describeDriving();
    void describeUtility();
}
