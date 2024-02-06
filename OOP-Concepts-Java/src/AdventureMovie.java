public class AdventureMovie extends Movie{

    // Overloading the Helper Function
    @Override
    public void watchMovie() {

        // Displaying the Output of the Parent Class Function
        super.watchMovie();

        // Displaying new code
        System.out.println("\nHere is the New Code from the Child Class");
        String instanceChild = this.getClass().getSimpleName();
        System.out.println("Instance of (Child Class): " + instanceChild);
    }

    // Constructor of the Class
    public AdventureMovie(String title, String type, int rating) {
        super(title, type, rating);
    }
}
