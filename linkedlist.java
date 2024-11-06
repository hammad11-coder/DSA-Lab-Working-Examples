class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head, tail;
    int size;

    public LinkedList() {
        head = tail = null;
        size = 0;
    }

    public void add(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n; 
            tail = n;
        }
        size++;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " "); 
            current = current.next; 
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList(); 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.printList(); 
        System.out.println("Size of the list: " + list.size); 
    }
}