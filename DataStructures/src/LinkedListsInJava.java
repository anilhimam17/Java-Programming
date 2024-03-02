import java.util.LinkedList;

public class LinkedListsInJava {
    public static void main(String[] args) {

        System.out.println("Working with Linked Lists in Java");

        /*
         * Declaring a Linked List is Similar to an ArrayList
         * Where ArrayLists provide speed in accessing elements of the List
         * LinkedLists provide consistency for the elements in the list on Removing and Adding new elements
         */

        LinkedList<String> firstLL = new LinkedList<>();

        /*
         * Adding elements into the Linked List is similar to adding elements into an Array List
         * -.add()
         */

        for (int i = 0; i < 10; i++) {
            firstLL.add(String.valueOf(i));
        }

        System.out.println("Viewing the Initialised LinkedList: ");
        System.out.println(firstLL);

        // ------------------------------------------------------------------------------------------------

        /*
         * Linked Support multiple behaviours during implementation, they can provide Stack like behaviour and Queue like behaviour
         * Stack Operations:
         * -.addFirst()
         * -.addLast()
         * -.push()
         *
         * Queue Operations:
         * -.offer()
         * -.offerFirst()
         * -.offerLast()
         */

        // Linked List Stack Implementation
        LinkedList<Integer> llStack = new LinkedList<>();

        for (int i = 1; i < 11; i++) {
            // llStack.addFirst(i);
            // llStack.push(i);
            llStack.addLast(i);
        }

        /*
         * Using .addFirst(): 10 being the Final Element is still present in the start of the list due to the Stack Implementation
         * Using .push(): Again 10 being the Final Element is pushed to the top of the Stack
         * Using .addLast(): This provides queue like behaviour adding each element to the end of the List
         */
        System.out.println("\nLinked List as a Stack:");
        System.out.println(llStack);

        System.out.println("The top most element of the LinkedList is: " + llStack.peek());
        System.out.println("The top most element of the LinkedList is: " + llStack.peekFirst());
        System.out.println("Accessing the top most element of the LinkedList is: " + llStack.getFirst());
        System.out.println("Accessing the bottom most element of the LinkedList is: " + llStack.getLast());

        // ------------------------------------------------------------------------------------------------

        // Linked List Queue Implementation
        LinkedList <Integer> llQueue = new LinkedList<>();

        for (int i = 1; i < 11; i++) {
//            llQueue.offer(i);
//            llQueue.offerFirst(i);
            llQueue.offerLast(i);
        }

        /*
         * Using .offer(): Offers each element as a part of the Queue in the FIFO Order
         * Using .offerFirst(): Offers each element to the head of the Queue implementing Stack like behaviour
         * Using .offerLast(): Offers each element to the tail of the Queue promoting FIFO Order
         */
        System.out.println("\nLinked List as a Queue:");
        System.out.println(llQueue);

        // Element access methods in the LinkedList in Queue implementation and Stack implementation are the same.
        System.out.println("The top most element of the Queue: " + llQueue.getFirst());
        System.out.println("The bottom most element of the Queue: " + llQueue.getLast());

        // ------------------------------------------------------------------------------------------------

        /*
        * Removing elements from a LinkedList is same for both Stack and Queue Implementations
        * -.remove(index): Removes Element at a given index
        * -.remove(value): Removes the First occurrence of a given value
        * -.remove(): Removes the top most element and returns it
        */

        System.out.println("\nRemoving elements from the LinkedList:");
        System.out.println("LinkedList: " + llStack);
        System.out.println("\nLinkedList after removing the value at 5th Index: " + llStack.remove(5));
        System.out.println("LinkedList: " + llStack);
        System.out.println("\nLinkedList after removing elements with no args: " + llStack.remove());
        System.out.println("LinkedList: " + llStack);
        System.out.println("\nLinkedList after removing the FirstElement: " + llStack.removeFirst());
        System.out.println("LinkedList: " + llStack);
        System.out.println("\nLinkedList after removing the LastElement: " + llStack.removeLast());
        System.out.println("LinkedList: " + llStack);

        // ------------------------------------------------------------------------------------------------

        /*
        * Accessing elements from the LinkedList
        * -.get(index): Returns element at the given index
        * -.getFirst(): Returns the top most element of the LinkedList
        * -.getLast(): Returns the bottom most element of the LinkedList]
        */

        System.out.println("\nAccessing elements from the LinkedList:");
        System.out.println("LinkedList: " + llQueue);
        System.out.println("\nTop most element of the Queue: " + llQueue.getFirst());
        System.out.println("Bottom most element of the Queue: " + llQueue.getLast());
        System.out.println("The element of the Queue at index given: " + llQueue.get(7));
        System.out.println("Retrieving the Index of any value given: " + llQueue.indexOf(11));

        // ------------------------------------------------------------------------------------------------
    }
}
