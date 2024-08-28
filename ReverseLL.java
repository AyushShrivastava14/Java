public class ReverseLL {

    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add Front

    public void addFront(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add at any position

    public void addAtPosition(int data, int pos) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node before = head;

        for(int i = 0; i < pos - 2; i++) {
            before = before.next;
        }

        Node after = before.next;

        before.next = newNode;
        newNode.next = after;
    }

    // Add in Last

    public void addLast(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node traverse = head;

        while(traverse.next != null) {
            traverse = traverse.next;
        }

        traverse.next = newNode;
    }

    // Printing

    public void print() {

        if(head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }

        Node traverse = head;
        
        System.out.println("\nLinkedList:-");

        while(traverse != null) {
            System.out.print(traverse.data + " ");
            traverse = traverse.next;
        }
    }

    // Reversing LinkedList

    public void Reverse() {

        if(head == null || head.next == null) {
            return;
        }
        
        Node p = null;
        Node q = head;     // or we can directly use head pointer to save space
        Node r = head.next;

        while(q != null) {
            q.next = p;
            p = q;
            q = r;

            if(r != null) {
                r = r.next;
            }
        }

        head = p;
    }


    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();

        list.addFront(2);
        list.addFront(1);
        list.addLast(69);
        list.addLast(100);
        list.addAtPosition(3, 3);
        list.print();

        list.Reverse();
        list.print();
    }
}
