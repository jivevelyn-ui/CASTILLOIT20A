package PRELIM2;

public class doublylinklest {

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

    Node head;

    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }

    void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    void displayNodes() {
        Node current = head;

        while (current != null) {

            System.out.print("Data: " + current.data);
            System.out.print(" | Previous: " + current.prev);
            System.out.println(" | Next: " + current.next);

            System.out.println("------------------");

            current = current.next;
        }
    }

    public static void main(String[] args) {

        doublylinklest list = new doublylinklest();

        list.add(3);
        list.add(6);
        list.add(9);
        list.add(333);
        list.add(89);

        list.display();

        System.out.println(list.head.next.data);

        list.displayNodes();
    }
}
