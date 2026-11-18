package PRELIM1;
import java.util.ArrayList;
public class aRRAYLIST {
    

    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList <> ();
        
        numbers.add(45);
        numbers.add(88);
        numbers.add(69);
        numbers.add(86);   
        
        //modify element
        numbers.set(3, 75);
        
        //check size
       //System.out.println(numbers.size());
        
        //remove element
        
        numbers.remove(1);
      //  System.out.println(numbers);
        
       // System.out.println(numbers.get(0) + " ");//specific
        numbers.clear();
        System.out.println(numbers.isEmpty());
        System.out.println(numbers); // print all
        
        //for (int i = 0; i < numbers.size(); i++) {  //for loop print
        //    System.out.println(numbers.get(0) + " ");
            
        }
    }
    
}
