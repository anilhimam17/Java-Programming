public class AbsClasses {
    public static void main(String[] args) {
        System.out.println("Working with Abstract Classes in Java");

        /*
        * Abstract Methods:
        *
        * - Abstract Methods always carry the function signature but have the body unimplemented.
        * - Their purpose is to apply the Properties any object of the Class should have.
        */

        /*
         * Concrete Methods:
         *
         * - Concrete Methods always carry the function signature of an abstract method while having atleast
         * one executable line of code in the body.
         * - Their purpose is to apply the Properties any object of the Class should have by overriding the abstract method
         * and implementing the function.
         */

        /*
        * Abstract Classes and Interfaces use a combination of Abstract Methods and Concrete Methods
        * - The components of Abstract Classes are Public as they are implemented in the child classes
        * - The only purpose of Abstract Classes is to provide a constructor to the child class and participate in inheritance
        */

        Dog goldie = new Dog("Goldie");
        goldie.callSign();

        Dog noName = new Dog();

        System.out.print("The Name of the Dog before setting a Name: ");
        noName.callSign();

        noName.setName("Snoopy");

        System.out.print("The Name of the Dog after setting a Name: ");
        noName.callSign();
    }
}
