abstract class Animal {

    private String name;

    // All the Abstract Methods implemented by the Parent Class
    public abstract void move();
    public abstract void stand();
    public abstract void sit();
    public abstract void callSign();

    // Getter and Setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Constructor of the Class using Constructor Chaining for the No Args Constructor
    public Animal() {
        this("Not Named Yet");
    }

    public Animal(String name) {
        this.name = name;
    }
}
