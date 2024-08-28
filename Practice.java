public class Practice {

    // head node
    Node head = null;

    // structure of LL
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // creating linked list
    public void insertion(int data, int pos) {

        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;    
        }

        Node traverser = head;

        // Traversing LL according to position given
        for(int i = 1; i < pos - 1; i++) {
            traverser = traverser.next;
        }

        // Insertion at front
        // if(pos == 1) {
        //     newNode.next = head;
        //     head = newNode;
        //     return;
        // }

        // Insertion at any position
        // else {
            Node temp = traverser.next;
            traverser.next = newNode;
            newNode.prev = traverser;
            newNode.next = temp;
            temp.prev = newNode;
            return;
        // }
    }

    // Printing LL 
    public void printLL() {

        Node traverser = head;

        if(traverser == null) {
            System.out.println("Empty LL");
        }

        System.out.println("Linked List:-");
        while(traverser != null) {
            System.out.print(traverser.data + " ");
            traverser = traverser.next;
        }
        System.out.println();
    }

    public static Node uniqueSortedList(Node head) {
        // Write your code here.
        if(head == null || head.next == null) {
            return head;
        }

        Node temp = head.next;
        int element = head.data;

        while(temp != null) {
            if(temp.data == element) {
                Node before = temp.prev;
                temp = temp.next;
                before.next = temp;
            }
            else {
                element = temp.data;
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Practice obj = new Practice();

        obj.insertion(1,1);
        obj.insertion(2,2);
        obj.insertion(3,2);
        obj.insertion(4,3);
        obj.insertion(5,3);

        obj.printLL();

        uniqueSortedList(obj.head);

        obj.printLL();
    }
}