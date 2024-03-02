import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListsInJava {
    public static void main(String[] args) {
        System.out.println("Working on additional Data Structures\n");

        /*
        * Additional Datastructures in Java
        * - Java provides additional datastructures to promote list - like behaviour
        * - These datastructures as provide immutable behaviour
        */

        // ------------------------------------------------------------

        /*
        * Working with ArrayLists
        * - It provides dynamic and resizable lists
        * - It is a part of the Java collections framework
        * - ArrayLists do not allow primitive datatypes in declaration
        */

        ArrayList <Integer> firstArrayList = new ArrayList<>();

        /*
        * ArrayLists are objects of a special class
        * They can also take declarations of the parent class and convert them to the ArrayList Class
        */

        // ------------------------------------------------------------

        // Operations with ArrayLists

        // Appending values into the array list
        for (int i = 0; i < 10; i++) {
            firstArrayList.add(i);
        }

        // Accessing Values by their index
        System.out.println("\nDisplaying the Elements of the ArrayList:");
        for (int i = 5; i < 10; i++) {
            System.out.println("Element (" + (i + 1) + "): " + firstArrayList.get(i));
        }

        // Checking the membership and index of an element in the ArrayList
        System.out.println("\nChecking the presence of an element in the ArrayList:");
        if (firstArrayList.contains(2)) {
            System.out.println("The ArrayList contains 2");
            System.out.println("The Index of 2 in the ArrayList: " + firstArrayList.indexOf(2));
        }

        /*
         * Difference in the Index Methods:
         * - indexOf(): Returns the index of the first occurrence of the element in the ArrayList
         * - lastIndexOf(): Returns the index of the last occurrence of the element in the ArrayList
         */

        if (firstArrayList.contains(10)) {
            System.out.println("Something's wrong cos I remember entering only 9 elements into the ArrayList");
        } else {
            System.out.println("Chill Everything's working fine 10 isn't in the ArrayList");
        }

        // Viewing the ArrayList
        System.out.println("\nThe ArrayList is:\n" + firstArrayList);

        /*
        * Removing elements from the ArrayList
        * - remove(index or element): Removes the first occurrence of the element or element at the given index
        * - removeAll(collection): Removes all the elements in the collection which are also present in the ArrayList
        */

        firstArrayList.remove(9);
        System.out.println("\nThe List after removing 9:\n" + firstArrayList);

        Integer[] subsection = {1, 2, 3};
        firstArrayList.removeAll(Arrays.asList(subsection));
        System.out.println("\nThe List after removing {1, 2, 3}:\n" + firstArrayList);

        // Clearing all the elements in the List
        firstArrayList.clear();
        System.out.println("\nClearing the List:\n" + firstArrayList);

        // Checking if the ArrayList is empty
        if (firstArrayList.isEmpty()) {
            System.out.println("Yes, the ArrayList is empty. Everything looks good");
        } else {
            System.out.println("There seems to be serious problem check for hacking ... Joking ... Just debug now!!!");
        }

        // Sorting the elements of the ArrayList
        for (int i = 10; i > 0; i--) {
            firstArrayList.add(i);
        }

        System.out.println("\nArrayList before Sorting:\n" + firstArrayList);
        firstArrayList.sort(Comparator.naturalOrder());
        System.out.println("\nArrayList after Sorting:\n" + firstArrayList);

        // Adding a new element at any given index
        firstArrayList.set(5, 1730);
        System.out.println("\nArrayList after adding 1730:\n" + firstArrayList);

        // Adding a collection to an existing ArrayList
        Integer[] newSub = {11, 12, 13, 14, 15};
        firstArrayList.addAll(Arrays.asList(newSub));
        System.out.println("\nThe ArrayList after addition:\n" + firstArrayList);

        /*
        * Important:
        * - There is no direct way to initialise an ArrayList to a set of values
        * - The only way is to use an Array and Convert the Array to an ArrayList using the Arrays.asList()
        */

        // Initialising the new ArrayList using an Array
        String[] people = {"Sandeep", "Khushi", "Kusum", "Nitya", "Pratik"};

        // The Declaration of dtype isn't necessary on the RHS
        ArrayList <String> stringArrayList = new ArrayList<>(Arrays.asList(people));
        System.out.println("\nThe Newly Initialised ArrayList:\n" + stringArrayList);
    }
}
