import java.util.Enumeration;
import java.util.Random;

public class EnumerationsInJava {
    public static void main(String[] args) {
        System.out.println("Working with Enumerations in Java");

        /*
        * Enumerations:
        * - In Java Enumerations are a list of all the predefined constants pertaining to a given context / identifier
        * - The elements of an Enum can be referred to using Constant names rather than indexes
        */

        EnumerationFriends anyFriend = EnumerationFriends.ANJALI;
        System.out.printf("Name of my friend: %s\n", anyFriend);
        System.out.printf("Index value of %s: %d\n", anyFriend, anyFriend.ordinal());

        System.out.println("\nAccording to the Computer who am I most close to ......\n");
        for (int i = 0; i < 10; i++) {
            var chosen = getFriend();
            System.out.println("My Close Friend: " + chosen.name());
            switch_friends(chosen);
        }

        // -----------------------------------------------------------------------------

        System.out.println("\nViewing the Custom List of Constants in a Enum with assigned values:");
        for (var product: Apple.values()) {
            System.out.println(product.name() + " starts at: " + product.get_price());
        }
    }

    public static EnumerationFriends getFriend() {

        // Generates a Random Number between 0 and 7
        int anyFriendIdx = new Random().nextInt(7);

        // Creates an Array of the Enumeration
        var anyFriend = EnumerationFriends.values();

        // Returns the Random Value based on Index
        return anyFriend[anyFriendIdx];
    }

    public static void switch_friends(EnumerationFriends friend) {
        switch (friend) {
            case ANJALI -> System.out.println("Anjali is a Close Friend\n");
            case DRUSHYA -> System.out.println("Drushya is a Close Friend\n");
            case NIKHIL -> System.out.println("Nikhil is a Close Friend\n");
            default -> System.out.println(friend.name().charAt(0) +
                    friend.name().substring(1).toLowerCase() + " is a good friend\n");
        }
    }
}
