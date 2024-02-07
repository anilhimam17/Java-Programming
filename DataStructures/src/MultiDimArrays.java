import java.util.Arrays;

public class MultiDimArrays {
    public static void main(String[] args) {

        // Declaring a 2D Array
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        /*
        * Values of a 2D Array can be accessed in a similar manner to matrix indexes
        */

        System.out.println("Working with 2D Arrays");
        System.out.println("Element 1st Row and 2nd Col: " + arr[0][1]);
        System.out.println("Element 2nd Row and 3rd Col: " + arr[1][2]);

        /*
        * Declaration Methods
        * A 2D array can be declared in multiple ways
        *
        * - <dtype>[][] <name> = {{val}}
        * - <dtype>[][] <name> = new <dtype>[rows][cols]
        * - <dtype>[][] <name> = new <dtype>[rows][]
        *
        * In the last method the no of cols can be left
        * undefined as Java automatically finds the size of the array.
        */

        int[][] secDec = new int[3][3];

        secDec[0] = new int[] {1, 2, 3};
        secDec[1] = new int[] {1, 2};

        System.out.println("\nViewing the Contents of the 2D Array: ");
        for (int[] i : secDec) {
            System.out.println("Row: ");
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println("\nEnd of Row");
        }

        int[][] thirdDec = new int[3][];

        thirdDec[0] = new int[] {1};
        thirdDec[1] = new int[] {1, 2, 3, 4, 5, 6, 7};
        thirdDec[2] = new int[] {1, 2, 3, 4};

        System.out.println("\nViewing the Contents of the 2D Array: ");

        /*
        * When traversing a 2D array with an Enhanced For loop we can use
        * "var" keyword to automatically replicate the dtype necessary for the loop variable
        */
        for (var i : thirdDec) {
            System.out.println("Row: ");
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println("\nEnd of Row");
        }

        // Displaying the Arrays as Strings
        System.out.println("\nDisplaying the 2D Array as Strings");
        for (var i : thirdDec) {
            System.out.println("Row: " + Arrays.toString(i));
        }

        /*
        * Retrieving a String Representation of a 2D Array
        * When working with 2D arrays due to the level of indexing in which elements
        * are present we use a different function to create a string representation of the 2D Array
        */
        System.out.println("\nViewing the 2D array directly as a string: \n" + Arrays.deepToString(thirdDec));

        // ---------------------------------------------------------

        // Creating a Multidimensional Array
        Object[] multidimArray = new Object[3];

        multidimArray[1] = new String[][] {
                {"Anil Himam", "Godugu"},
                {"Sai Kusum", "Malla"}
        };

        multidimArray[0] = new int[] {1, 2};

        multidimArray[2] = new int[] {17, 30};

        // Viewing the Multidimensional Array
        System.out.println("\nViewing the Contents of a MultiDimensional Array:\n" + Arrays.deepToString(multidimArray));
    }
}
