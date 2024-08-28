import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Add
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);

        // Size
        System.out.println("Size of HashSet: " + set.size());

        // Search
        if(set.contains(3)) {
            System.out.println("It contains 3");
        }
        
        if(!set.contains(10)) {
            System.out.println("No, it doesn't contain 10");
        }

        // Delete/Remove
        set.remove(2);
        if(!set.contains(2)) {
            System.out.println("No, it doesn't contain 2");
        }

        // Printing HashSet
        System.out.println(set);

        // Iterating the HashSet
        // HashSet is unordered
        set.add(10);
        // iterator initially points at null
        Iterator<Integer> it = set.iterator();        // Now it will not show warning because we mentioned the datatype
        
        System.out.println("Elements:-");
        while(it.hasNext()) {      // hasNext() returns true if there is another element after current element else false
            System.out.println(it.next());     // next() returns next value
        }

        // isEmpty function (returns true if the set is empty else false)
        if(!set.isEmpty()) {
            System.out.println("Set is not Empty");
        }
    }
}