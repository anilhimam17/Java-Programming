public class PolyMorph {
    /*
    * Polymorphism:
    * It is the process of writing code
    * that can perform the same
    * action in different ways
    * for different objects.
    */

    public static void main(String[] args) {

        // Creating an Instance of the Parent Class
        Movie avatarLastAirbender = new Movie("Avatar The Last Airbender", "Live Action", 0);
        avatarLastAirbender.displayMovieInformation();
        avatarLastAirbender.watchMovie();

        // Creating an Instance of the Child Class
        AdventureMovie jumanji = new AdventureMovie("Jumanji", "Adventure", 8);
        jumanji.displayMovieInformation();
        jumanji.watchMovie();

        /*
        * Output:
        * Due to polymorphism the program is able to provide
        * two different outputs in accordance to the object
        * being used as reference.
        *
        * On being called from the Child Class
        * Instance of: AdventureMovie
        * Here is the New Code from the Child Class
        * Instance of (Child Class): AdventureMovie
        */

        // ---------------------------------------------------------------------------------------

        /*
        * Polymorphism also allows for parent class type to be
        * used as reference while creating a new object of the child class
        */

        Movie ironMan = new AdventureMovie("Iron Man", "Action", 10);
        ironMan.displayMovieInformation();
        ironMan.watchMovie();

        /*
        * Here too polymorphism allows for the parent class reference but initialises
        * the behaviour of the object in accordance to the child class methods
        *
        * The Information about the Movie are as follows:
        * Title: Iron Man
        * Type: Action
        * Rating: 10
        * Instance of: AdventureMovie
        *
        * Here is the New Code from the Child Class
        * Instance of (Child Class): AdventureMovie
        */
    }
}
