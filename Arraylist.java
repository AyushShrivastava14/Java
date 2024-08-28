import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();   
        // ArrayList<Integer> list = new ArrayList<>();    // We can write like this too.
        
        // We access/manipulate elements in arraylist using index.

        // Adding elements
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(69);

        // For checking if the element is present or not (gives answer in true or false)
        list.contains(69);

        // check all the methods [VVV imp]

        // Printing
        System.out.println(list);

        // Deleting/removing
        list.remove(1);
        System.out.println(list);

        // Getting element with index
        System.out.println("Element at index 2: " + list.get(2));

        // Adding element at a specific index
        list.add(1, 20);
        System.out.println(list);

        // Setting/updating element at a specific index
        list.set(0, 10);
        System.out.println(list);
        
        // Size
        System.out.println("Size: " + list.size());

        // Iteration 
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Sorting using Collection class (This class is not used for sorting in arrays for array Arrays.sort(array) is used)
        Collections.sort(list);
        System.out.println(list);
    }
}
