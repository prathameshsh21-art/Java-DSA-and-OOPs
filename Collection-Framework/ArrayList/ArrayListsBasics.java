import java.util.ArrayList;
import java.util.Collections;

public class Day01_ArrayList_Basics {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println("After adding elements: " + list);

        // Accessing an element
        System.out.println("Element at index 0: " + list.get(0));

        // Inserting an element at a specific index
        list.add(1, 1);
        System.out.println("After inserting 1 at index 1: " + list);

        // Updating an element
        list.set(0, 5);
        System.out.println("After updating index 0: " + list);

        // Removing an element
        list.remove(3);
        System.out.println("After removing index 3: " + list);

        // Finding the size
        System.out.println("Size of ArrayList: " + list.size());

        // Traversing the ArrayList
        System.out.print("Elements: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Sorting the ArrayList
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);
    }
}
