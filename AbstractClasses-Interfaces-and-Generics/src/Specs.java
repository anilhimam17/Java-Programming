abstract class Specs {

    // Instance fields of the class
    private String company;
    private String model;
    private int power;

    /*
    * Abstract Methods
    * In abstract classes we need to specify the abstract keyword for each method unlike interfaces
    */

    abstract void describeCar();

    // Constructor of the Class
    public Specs(String company, String model, int power) {
        this.company = company;
        this.model = model;
        this.power = power;
    }

    // Getter and Setter Methods
    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(int power) {
        this.power = power;
    }
}