package MIDTERM;

public class StackArray {
    private int [] stack;
    private int top;
    private int capacity;
    
    public StackArray(int capacity){
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }
    
    public static void main(String [] args){
        StackArray stack = new StackArray(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        System.out.println();
        
        stack.display();
        
        System.out.println();
        
        System.out.println("Top element: " + stack.peek());
        
        System.out.println();
        
        System.out.println("Removed: " + stack.pop());
        
        System.out.println();
        
         System.out.println("Top element: " + stack.peek());
         
         System.out.println();
          
         stack.display();
                
    }

    public void push(int i) {
        if (top == -1){
            System.out.println("Stack Overfloww! Stack is full.");
            return;
        }
        stack[top++]= i;
    }

    public int pop() {
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack [top];
       
   }
    
 public int peek(){
     if(top == -1){
         System.out.println("Stack empty");
         return -1;
     }
     return stack[top];
 }
 public void display(){
     if(top==-1){
         System.out.println("Stack empty");
         return;
         
     }
            System.out.println("Stack elements: ");
            for (int i = top; i > 0; i--) {
                System.out.println(stack[i]);
                
            }
 }
     
  
}
