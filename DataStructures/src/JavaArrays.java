import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {
        System.out.println("Working with Java Arrays");

        /*
        * Declaring Arrays in Java
        * - Arrays in Java are fixed in size
        * - Once declared an initialised their size is fixed
        */
        int[] firstArray = new int[10];

        // Populating the Array
        firstArray[0] = 1;
        firstArray[1] = 2;

        System.out.println("Viewing the Contents of the Manually Initialised Array: ");
        System.out.printf("0th Index: %d\n", firstArray[0]);
        System.out.printf("1st Index: %d\n", firstArray[1]);

        // ------------------------------------------------------------------------------

        /*
        * One-Shot Initialised Array:
        * A one-shot initialised array should be declared and initialised within a single line
        */


        System.out.println("\nViewing the Contents of the One-Shot Initialised Array: ");
        int[] initialisedArray = {1, 2, 3, 4, 5};
        for (int i = 0; i < initialisedArray.length; i++) {
            System.out.println(initialisedArray[i]);
        }

        /*
        * Array inherits from Java.util.Object
        * Any array which is declared by not initialised takes up some default values
        * - Primitive Type: 0
        * - Boolean: False
        * - Classes: Null
        */

        // Utilising Enhanced For Loops for Iterating over Collections
        System.out.println("\nDisplaying the Contents of the Array using the Enhanced For Loop:");
        for (int i : initialisedArray) {
            System.out.println(i);
        }

        // ------------------------------------------------------------------------------

        /*
        * Checking the dtype of an array
        * The dtype of an array is seen by storing the elements of the array in an object variable
        * The instanceof() is then used to find the dtype
        */

        if (initialisedArray instanceof int[]) {
            System.out.println("\nType of Initialised Array: Integer");
        }

        // ------------------------------------------------------------------------------

        // Working with Arrays

        // .toString() returns a string representation of the array
        String initialisedToString = Arrays.toString(initialisedArray);
        System.out.println("\nConverting the Initialised Array to a String:\n" + initialisedToString);

        // Arrays.sort() make modifications to the pointed variable and doesnt return any value
        Arrays.sort(initialisedArray);
        String sortedInitialisedString = Arrays.toString(initialisedArray);
        System.out.println("\nConverting the Initialised Array to a String after Sorting:\n" + sortedInitialisedString);

        // Filling the array with any value
        System.out.println("\nViewing the elements of the Default Array: ");
        int[] fillArray = new int[5];
        for (int i: fillArray) {
            System.out.println(i);
        }

        // Filling up the default array with the value of 5
        Arrays.fill(fillArray, 5);
        System.out.println("\nViewing the Default Array after filling: ");
        for (int i: fillArray) {
            System.out.println(i);
        }

        // Making a copy of the array upto any given length
        int[] subsection = Arrays.copyOf(fillArray, 3);
        System.out.println("\nViewing the newly created subsection of Fill Array:");
        for (int i : subsection) {
            System.out.println(i);
        }

        // Checking if two arrays are equal
        System.out.println("\nChecking for the Equality of Arrays:");
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The given arrays are equal");
        }

        Arrays.fill(arr1, 17);
        Arrays.fill(arr2, 30);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The given arrays are equal");
        } else {
            System.out.println("The given arrays arent equal");
        }

        // ------------------------------------------------------------------------------

        // Viewing an Array but passing it as a variable length arg
        displayArrays(initialisedArray);
        displayVariableArrays(1, 2, 3, 4, 5);
    }

    public static void displayArrays(int[] array) {
        System.out.println("\nThe contents of the array are:");
        for (int i : array) {
            System.out.println(i);
        }
    }

    /*
    * Rules of Variable Length Args:
    * - There can only be one variable length argument in a function signature
    * - The Variable Length Argument should be the last argument in the function signature
    */
    public static void displayVariableArrays(int... array) {
        System.out.println("\nThe contents of the variable length args array are:");
        for (int i : array) {
            System.out.println(i);
        }
    }
}
