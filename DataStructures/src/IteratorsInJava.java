import java.util.Arrays;

public class IteratorsInJava {
    public static void main(String[] args) {
        System.out.println("Working with Iterators in Java");

        /*
        * Iterators:
        * Iterators are cursor like objects used to traverse through collections in Java
        * .next(): To access the next element
        * .hasNext(): To check if any elements remains that needs to be accessed
        */

        int[] integerArray = {1, 2, 3, 4, 5};

        // An iterator must be initialised uniquely for each collection being parsed
        var arrayIterator = Arrays.stream(integerArray).iterator();

        while (arrayIterator.hasNext()) {
            System.out.println("Current Element: " + arrayIterator.next());
        }

        // ---------------------------------------------------------------------------

        /*
         * Working with Boxing and Unboxing
         *
         * Boxing: The process of Wrapping a Primitive type into a Wrapper Object
         * Unboxing: The process of Unwrapping a Wrapper Object back to its Primitive type
         */
        System.out.println("Working with Boxing and Unboxing");

        // Boxing
        int primitiveInt = 10;
        Integer boxedInt = Integer.valueOf(primitiveInt);
        System.out.println("\nPrimitive Int converted to Integer Class: " + boxedInt);

        // Unboxing
        int unBoxedValue = boxedInt.intValue();
        System.out.println("Wrapper object converted to Primitive Class: " + unBoxedValue);
    }
}
