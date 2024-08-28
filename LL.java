public class LL {

    // Global Variales

    Node head = null;
    int Size = 0;   // Size of LinkedList


    // Node Structure

    class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }


    // Add First

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            Size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        Size++;
    }


    // Add at position

    public void addAtPosition(int data, int pos) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            Size++;
            return;
        }

        Node before = head;

        for(int i = 1; i < pos - 1; i++) {
            before = before.next;
        }

        Node after = before.next;

        before.next = newNode;
        newNode.next = after;
        Size++;
    }


    // Add Last

    public void addLast(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            Size++;
            return;
        }

        Node traverse = head;

        while(traverse.next != null) {
            traverse = traverse.next;
        }

        traverse.next = newNode;
        Size++;
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


    // Delete at Front

    public void deleteFront() {

        if(head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }

        if(head.next == null) {
            head = null;
            Size--;
            return;
        }

        head = head.next;
        Size--;
    }


    // Deletion at any position

    public void deletePosition(int pos) {

        if(head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }

        Node before = head;

        for(int i = 1; i < pos - 1; i++) {
            before = before.next;
        }

        before.next = before.next.next;;
        Size--;
    }


    // Deletion at Last

    public void deleteLast() {

        if(head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }

        if(head.next == null) {
            head = null;
            Size--;
            return;
        }

        Node traverse = head;

        while(traverse.next.next != null) {
            traverse = traverse.next;
        }

        traverse.next = null;
        Size--;
    }


    public static void main(String[] args) {
        // Since the methods made are not static(i.e. free to access from anywhere inside a class without object) i.e. why we need to make an object of the class to access them
        LL list = new LL();

        list.addFirst(2);
        list.addFirst(1);
        list.print();
        list.addLast(69);
        list.print();
        list.addLast(100);
        list.print();
        list.addAtPosition(3, 3);
        list.print();
        list.addAtPosition(50, 5);
        list.print();
        System.out.println("\nSize of LinkedList: " + list.Size);

        list.deleteFront();
        list.print();
        list.deletePosition(4);
        list.print();
        list.deleteLast();
        list.print();
        System.out.println("\nSize of LinkedList: " + list.Size);
    }
}
