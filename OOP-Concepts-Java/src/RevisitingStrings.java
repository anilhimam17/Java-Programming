public class RevisitingStrings {
    public static void main(String[] args) {

        // Displaying Multi-Line strings using a Text block
        String multiline = """
                Hello, World
                This is a Multi-Line Text Block
                
                --------------------------------
                
                Today, I might have been ghosted by Sai but I dont think I will cry over it.
                I tried my best to contact and catchup with her even when I knew that there was less chance than 1e-84
                for everything to workout the way I wanted.
                
                I guess I know my responsibilities very well and am working on them since the start year
                I have path to the top and I am pursuing it
                1 day at a time.
                
                To the Top, Just like in Initial D Final-Stage. 
                --------------------------------
                """;

        System.out.println("Viewing the String Textblock: ");
        System.out.println(multiline);

        // Using Formatted Strings
        boolean mood = true;
        String formatString = String.format("Do I like Java: %b\n", mood);
        System.out.println("\nThis is a formatted String");
        System.out.println(formatString);

        // Alternate way to format strings
        boolean fact = true;
        String altFormat = "Do I love Python: %b\n".formatted(fact);
        System.out.println("This fact is always true");
        System.out.println(altFormat);

        // --------------------------------------------------------------------

        /*
        * Working with the String Class
        * - String Inspection Methods
        * - String Comparison Methods
        * - String Manipulation Methods
        */

        // String Inspection Methods
        System.out.println("Utilising the String Class methods:");
        System.out.println("Length of Text block: " + multiline.length());
        System.out.println("CharAt: " + multiline.charAt(20));
        System.out.println("Emptyness: " + multiline.isEmpty());
        System.out.println("Index of SubString (to the top): " + multiline.indexOf("to the top"));

        // String Comparison Methods
        System.out.println("\nUtilising the String Comparison Methods:");

        String a = "Hello, World";
        String b = "HELLO, WORLD";

        System.out.println("String Equals: %b".formatted(a.equals(b)));
        System.out.println("String Equals (Ignore Case): %b".formatted(a.equalsIgnoreCase(b)));
        System.out.println("String starts with (hello): %b".formatted(a.startsWith("hello")));
        System.out.println("String starts with (Hello): %b".formatted(a.startsWith("Hello")));
        System.out.println("String ends with (world): %b".formatted(a.endsWith("world")));
        System.out.println("String starts with (World): %b\n".formatted(a.endsWith("World")));

        // String Manipulation Methods
        System.out.println("Working with String Manipulation Methods: ");

        String strip = "      Hello, World        ";
        System.out.println("String before Stripping Space: " + strip);
        System.out.println("String after Stripping Space: " + strip.strip());
        System.out.println("Lower Case: " + b.toLowerCase());
        System.out.println("Upper Case: " + b.toUpperCase());
        System.out.println("Joining String: " + String.join(" - ", a, b));
        System.out.println("Concatenating Strings: " + a.concat(b));
        System.out.println("Repeating a String: " + a.repeat(5));

        // --------------------------------------------------------------------

        /*
        * Working with the String Builder Class
        *
        * - StringBuilder Class was provided by Java to get around Immutable strings
        *   and provide flexibility similar to other programming languages.
        * - A StringBuilder can take Strings, Ints, Charecters, Sequences or any other args to create a String
        */

        // Empty String Builder
        StringBuilder sb = new StringBuilder();

        // String as StringBuilder
        StringBuilder string = new StringBuilder("This is a String of StringBuilder Class");

        // StringBuilder as Empty Space
        StringBuilder empty = new StringBuilder(10);

        System.out.println("\nUtilising the StringBuilder Class for Strings: ");
        System.out.println("Empty String: " + sb);
        System.out.println("Initialised String: " + string);
        System.out.println("Empty String with Space Allocation: " + empty + " Length: " + empty.length());

        // Utilising the StringBuilder Functions to Make Modifications
        System.out.println("Length of No Args StringBuilder: " + sb.length());
        sb.append("Hello, World");
        System.out.println("Length of No Args StringBuilder after Appending: " + sb.length() + " String: " + sb);

        System.out.println("Length of Capacity StringBuilder: " + empty.length());
        empty.append("Hello, World");
        System.out.println("Length of Capacity StringBuilder after Appending: " + empty.length() + " String: " + empty);

        System.out.println("Inserting New Text Inbetween the String:");
        System.out.println("Before: " + empty + " After: " + empty.insert(6, "{{ Anil Himam }}"));
        System.out.println("Retained Output: " + empty);
        System.out.println("Reversing the String: " + empty.reverse());

        System.out.println("\nViewing all the Strings:");
        StringBuilder[] strings = {sb, string, empty};
        for (StringBuilder str : strings) {
            System.out.println(str);
        }

        /*
        * Important:
        * StringBuilder Class also supports all the String Class methods aside from Special StringBuilder Class methods
        */
    }
}
