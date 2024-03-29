import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    // Records to define a quick datatype
    record Students (String name, String nationality, int age) {
        @Override
        public String toString() {
            return "Students{" +
                    "name='" + name + '\'' +
                    ", nationality='" + nationality + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        System.out.println("Working with Lambda Expressions and Functional Interfaces");

        /*
         * Creating an Arraylist of Students
         * - Since Students are present in the Main function we dont need to specify the name of the class
         * while calling the record constructor
         * - All the records created are thus using the static reference of the record declaration when defined
         * inside the main function
         */

        List<Students> students = new ArrayList<>(Arrays.asList(
                new Students("Anil Himam", "India", 21),
                new Students("Sai Kusum", "India", 21),
                new Students("Phoenix May", "Australia", 21)
        ));

        System.out.println("\nDisplaying the records of Students (before sorting):");
        for (var student : students) {
            System.out.println(student);
        }

        // Creating Custom Comparator to compare the elements of the datatype defined by the record
        var comparatorStudents = new Comparator<Students>() {
            @Override
            public int compare(Students s1, Students s2) {
                return s1.name.compareTo(s2.name);
            }
        };

        System.out.println("\nDisplaying the records of Students (after sorting):");
        students.sort(comparatorStudents);
        for (var student : students) {
            System.out.println(student);
        }

        // Using lambda expressions to reduce the boilerplate of the comparator
        System.out.println("\nSorting the Students by Nationality using a Lambda Expression: ");
        students.sort(((o1, o2) -> o1.nationality.compareTo(o2.nationality)));
        for (var student : students) {
            System.out.println(student);
        }

        // -------------------------------------------------------------------------------------------------------------

        // Creating a Functional Interface
        interface NewComparator<T> extends Comparator<T> {
            /*
             * - When providing the functional interface a custom method of its own it fails as it already needs to
             * implement the Compare function from the functional interface Comparator that it extends
             */

            @Override
            default int compare(T o1, T o2) {
                return 0;
            }
        }
    }
}

