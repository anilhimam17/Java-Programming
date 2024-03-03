public class Dog extends Animal{
    // All the Methods of the Parent Class are Overridden for implementation in the Child Class
    @Override
    public void move() {
        System.out.println("The Dog is Moving");
    }

    @Override
    public void stand() {
        System.out.println("The Dog is Standing");
    }

    @Override
    public void sit() {
        System.out.println("The Dog is Siting");
    }

    @Override
    public void callSign() {
        System.out.println("The Dog is called: " + this.getName());
    }

    // Constructor of the Class
    // Constructor Chaining for Default Constructor Modifications
    public Dog() {
        this("Not yet named");
    }

    public Dog(String name) {
        super(name);
    }
}
