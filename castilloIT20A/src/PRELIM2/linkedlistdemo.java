package PRELIM2;
//import java.util.LinkedList;

public class linkedlistdemo {
    
    class Node {
        int data;
        Node next;
        
        Node(int data){
        this.data = data;
        this.next = null;
    }
    }
    Node head;
    
    
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
        current = current.next;
    }
        current.next = newNode;
    }
    
    void display (){
        Node current = head;
        while (current != null){
            System.out.println(current.data + " -> ");
            current = current.next;
            
        }
        System.out.println("null");
    }
    
    void displayNodes () {
        Node current = head;                                                  
        while (current != null){
            System.out.print("Data: " + current.data);
            System.out.print(" | Current Pointers: " + current);
            System.out.print(" | Next: ");
            
            if (current.next != null) {
                System.out.println(current.next);
            } else {
                System.out.println("null");
            }
             System.out.println("------------------");
            current = current.next;
        }
    }
 
            
            //kani ang last
    public static void main(String [] args){
        linkedlistdemo list = new linkedlistdemo();
        
        list.add(3);
        list.add(6);
        list.add(9);
        
        list.display();
        System.out.println(list.head.next.data);
        list.displayNodes();
    }
}
          