public class Movie {
    private String type;
    private String name;
    private int rating;

    // Helper Function of the Class
    public void displayMovieInformation() {
        System.out.println("\nThe Information about the Movie are as follows:");
        System.out.println("Title: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Rating: " + this.rating);
    }

    public void watchMovie() {
        String instance = this.getClass().getSimpleName();
        System.out.println("Instance of: " + instance);
    }

    // Constructor of the Class
    public Movie(String title, String type, int rating) {
        this.name = title;
        this.type = type;
        this.rating = rating;
    }
}
