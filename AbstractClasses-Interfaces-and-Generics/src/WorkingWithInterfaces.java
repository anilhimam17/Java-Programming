public class WorkingWithInterfaces implements firstInterface {
    public static void main(String[] args) {

        // Creating an Object of the Class
        WorkingWithInterfaces newInt = new WorkingWithInterfaces();
        System.out.println("New object: " + newInt);
        
        System.out.println("\nDescribing the Interface using the overriden Abstract Method:");
        newInt.describeInterface();

        System.out.println("\nAccessing the Parent Inteface field which the Objects of the class implement: " + newInt.nameParent());
    }

    // Implementing the Inherited Abstract Methods
    @Override
    public void describeInterface() {
        System.out.println("Hey this is me accessing the abstraction function of the interface from the child class");
    }

    @Override
    public String nameParent() {
        return firstInterface.parent;
    }
}