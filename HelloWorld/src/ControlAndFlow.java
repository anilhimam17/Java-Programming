import java.util.Scanner;

public class ControlAndFlow {
    public static void main(String[] args) {
        System.out.println("Utilising Switch Statements: ");

        // Variable being used for different cases
        int a = 4;

        // Utilising the Regular Switch Case syntax
        // regularSwitchCase(a);

        // Utilising Switch Cases with Additional Features
        addFeatureSwitchCase(a);

        // For Loops
        System.out.println("\nUtilising For Loops:");
        for (int i = 0; i < 10; i++){
            System.out.println(i + 1);
        }

        // While Loops
        System.out.println("\nUtilising While Loops:");
        int i = 1;
        while (i < 10){
            System.out.println(i);
            i += 1;
        }

        /*
        * Wrapper Methods to Parse String:
        * Wrapper Classes provide class methods to parse any string and convert it to the corresponding data type
        */

        System.out.println("\nUtilising the Wrapper Classes to Convert to Strings");
        Integer valInt = Integer.parseInt("10");
        System.out.println("Parsing Strings to an Integer: " + valInt);

        Float valFloat = Float.parseFloat("6.64");
        System.out.println("Parsing Strings to a Float: " + valFloat);

        /*
        * Taking Input from the Console:
        * - System.in
        * - System.console
        * - Scanner
        * - Command Line Args
        */

        /*
        * Using the Scanner Class
        * Declaring the Scanner to read input from the System.in aka Console
        * It can be used to parse Primitive Types and Strings
        */
        Scanner sc = new Scanner(System.in);

        // Reading an Integer
        System.out.println("Enter an Int: ");
        int readInt = sc.nextInt();
        System.out.println("The Integer entered was: " + readInt);

        // Reading a Float
        System.out.println("\nEnter a Float: ");
        float readFloat = sc.nextFloat();
        System.out.println("The Float entered was: " + readFloat);

        // Reading a String
        System.out.println("\nEnter a String: ");
        String readString = sc.nextLine();
        System.out.println("The String entered was: " + readString);
    }


    public static void addFeatureSwitchCase(int a){
        switch (a) {
            // In case of one line code
            case 1 -> {
                break;
            }

            // In case of Multiple lines of code parenthesis
            case 2 -> {
                System.out.println("Value of A is 2");
                break;
            }

            case 3, 4, 5 -> {
                System.out.println("Covering Multiple values between 3 - 5");
                break;
            }

            default -> {
                System.out.println("The Value of A is: " + a);
            }
        }
    }


    public static void regularSwitchCase(int a) {
        /*
         * The case variable in the switch statement can support limited dtypes
         * where all the dtypes being used should be literals which are immutable
         */
        switch (a) {

            // Different Cases used by the Switch Statement
            case 1:
                System.out.println("The value of A was 1");
                break;
            case 2:
                System.out.println("The value of A was 2");
                break;
            case 3:
                System.out.println("The value of A was 3");
                break;
            case 4:
                System.out.println("The value of A was 4");
                break;
            case 5:
                System.out.println("The value of A was 5");
                break;

            // The Default Case
            default:
                System.out.println("This is the default case\nThe value of A is: " + a);
        }
    }
}
