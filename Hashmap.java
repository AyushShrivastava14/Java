import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements
        map.put(1,"India");
        map.put(2,"Japan");
        map.put(3,"China");
        map.put(4,"Canada");

        // Updating
        map.put(4,"Greenland");

        // Printing
        System.out.println(map);

        // Size()
        System.out.println("Size of HashMap: " + map.size());

        // Searching key
        if(map.containsKey(2)) {
            System.out.println("Present");
        } else {
            System.out.println("Absent");
        }

        // Searching value
        if(map.containsValue("USA")) {
            System.out.println("Present");
        } else {
            System.out.println("Absent");
        }

        // get(key) function gets the value of the given key if present else null
        System.out.println(map.get(1));
        System.out.println(map.get(10));

        // Delete/Remove
        map.remove(3);
        System.out.println(map);

        // Iteration method 1 i.e. using for-each loop
        System.out.println();
        System.out.println("Method-1 Iteration:-");
        for(Map.Entry<Integer, String> pair : map.entrySet()) {
            System.out.print(pair.getKey() + " ");
            System.out.println(pair.getValue());
        }

        // Iteration Method 2 
        System.out.println();
        System.out.println("Method-2 Iteration:-");
        Set<Integer> keys = map.keySet();
        for(int key : keys) {
            System.out.println(key + " " + map.get(key));
        }



        // map.getOrDefault(keys, null);
        // another map function
    }
}
