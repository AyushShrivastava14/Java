import java.util.LinkedList;

public class ClassOfLL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        // Addition at Front
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        // Addition at Last
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        // list.add(value) adds nodes at the end of the linkedlist by default by we can insert a node at any index by writing
        // list.add(index,value)
        list.add(7);
        list.add(2, 69);

        // Printing
        System.out.println("LinkedList: " + list);

        // Size
        System.out.println("Size: " + list.size());

        // Iteration of LinkedList with INDEX
        System.out.println("LinkedList:-");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        // Deletion at front
        list.removeFirst();
        System.out.println(list);

        // Deletion at last
        list.removeLast();
        System.out.println(list);

        // Deletion by using INDEX
        list.remove(0);
        System.out.println(list);

        // There are more methods but above methods are used mostly
    }
}
