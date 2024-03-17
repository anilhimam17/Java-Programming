public interface firstInterface {
    
    /*
    * Interfaces
    * - Interfaces are similar to abstract classes but arent technically a class to begin with
    * - Interfaces follow class like declaration with only change in the name
    * - Interfaces can be inherited by a class using the implements keyword
    * - Multiple Interfaces can be inherited by a class simultaneously unlike multiple class inheritance
    * - By default all the feilds declared in an interface must be static and final
    * - Interfaces are never instantiated by objects, they are only instantiated by objects of classes which implement the interfaces
    */

    static final String parent = "First Interface";

    abstract void describeInterface();
    abstract String nameParent();

}