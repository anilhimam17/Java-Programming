public class MethodAndFlow {
    public static void main(String[] args) {
        System.out.println("Hello, World");

        int a = 17, b = 30;
        float af = 17, bf = 30;
        System.out.println("A + B: " + add(a, b));

        System.out.println("\nOutput of Method Overloading:");
        System.out.println(subtract(a));
        System.out.println(subtract(a, b));
        System.out.println(subtract(af));
        System.out.println(subtract(af, bf));
        System.out.println(subtract(af, b));
        System.out.println(subtract(a, bf));
    }

    /*
    * Important:
    * - Methods can be defined within a class inside the main function or outside the main function
    * - Methods cannot be defined outside a class as standalone functions
    */
    // Creating a new method
    public static int add(int a, int b){

        /*
         * Parameters: Passed into the function during declaration
         * Arguments: Passed into the function during function call
         */

        return a + b;
    }

    /*
    * Method Overloading:
    *
    * When multiple declarations of the same method exist only differing
    * by the types and number of parameters required by each variant of the method.
    *
    * Method Overloading Variations:
    * - Type of Parameters
    * - No of Parameters
    * - Order of Parameters
    */

    // Integer Only Method
    public static int subtract(int a) {
        System.out.println("Integer Only Method");
        return a;
    }

    // Float Only Method
    public static float subtract(float a) {
        System.out.println("Float Only Method");
        return a;
    }

    // Difference of two integers
    public static int subtract(int a, int b) {
        System.out.println("Difference of two integers");
        return a - b;
    }

    // Difference of two floats
    public static float subtract(float a, float b) {
        System.out.println("Difference of two floats");
        return a - b;
    }

    // Difference of a float and an integer type casted to int
    public static int subtract(int a, float b) {
        System.out.println("Difference of a float and an integer type casted to int");
        return (int) (a - b);
    }

    // Difference of a float and an integer type casted to float
    public static float subtract(float a, int b) {
        System.out.println("Difference of a float and an integer type casted to float");
        return (float) (a - b);
    }
}
