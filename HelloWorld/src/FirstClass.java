// Each Java Program runs under the namespace of the main class of the program
public class FirstClass {
    public static void main(String[] args) {

        // Displaying text
        System.out.println("Hello, World");

        // Declaring Variables
        int bDate = 17;
        int bMonth = 4;
        int bYear = 2002;
        System.out.println("Date: " + bDate + "\nMonth: " + bMonth + "\nbYear: " + bYear);

        // Declaring Multiple Variables of the Same Type
        Integer b_date = 17, b_month = 4, b_year = 2002;
        System.out.println("\nDate: " + b_date + "\nMonth: " + b_month + "\nbYear: " + b_year);

        // Declaring Multiple Variables of Different Types
        Integer saiBdate = 30; String saiBmonth = "September"; Integer saiByear = 2002;
        System.out.println("\nDate: " + saiBdate + "\nMonth: " + saiBmonth + "\nbYear: " + saiByear);

        /*
        * Java Support two type of Variable Types:
        * Primitive Types: int byte short float long double
        * Wrapper Types: Integer Byte Short Float Long Double
        *
        * Primitive Types do not contain any properties of functions with respect to the corresponding datatype
        * Wrapper Types contain additional properties and features corresponding to each datatype
        */

        /*
        * Java allows Type Casting only for Numeric Types:
        *
        * Type Casting
        * Byte
        * Short
        * Char
        * Int
        * Long
        * Float
        * Double
        */

        byte number = 10;
        System.out.println("\nType Casting Representations of 10:");
        System.out.println("Byte: " + number);
        System.out.println("Short: " + (short) number);
        System.out.println("Char: " + (char) number);
        System.out.println("Integer: " + (int) number);
        System.out.println("Long: " + (long) number);
        System.out.println("Float: " + (float) number);
        System.out.println("Double: " + (double) number);

        // Arithmetic Operations
        int a = 17, b = 30;
        System.out.println("\nCommon Arithmetic Operations:");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((double) a / b);
        System.out.println(a % b);

        // Compound Assignment Operations
        System.out.println("\nCompound Assignment Operations:");
        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a *= b);
        System.out.println(a /= b);
        System.out.println(a %= b);

        // Conditionals
        boolean anilLikesSai = true, saiLikesAnil = true;

        System.out.println("\nHere's a Conditional:");
        if (saiLikesAnil && anilLikesSai){
            System.out.println("Damn, this reminds me of the old time. Hope it gets back to this ...");
        } else if (anilLikesSai) {
            System.out.println("Duuh, I wasted my opportunity and I regret it. I hope I can make up for my drawbacks in the past four years");
        } else if (saiLikesAnil) {
            System.out.println("Sorry, I really couldnt comprehend the foolishness I had back then to not acknowledge this");
        } else {
            System.out.println("End of Thinking Capacity");
        }

        /*
        * Logical Operators
        * == -> Equality
        * && -> Logical And
        * || -> Logical Or
        * ! -> Logical Not
        */

        /*
        * Ternary Operator
        *
        * Operand1 ? Operand2 : Operand3
        * Where Operand1 is a Conditional or Logical Expression
        * If True: Operand2
        * Else: Operand3
        */

        saiLikesAnil = false;
        String situation = (saiLikesAnil && anilLikesSai) ? "Old times" : "Seems like a problem somewhere";
        System.out.println("\nTernary Operation:");
        System.out.println(situation);
    }
}
