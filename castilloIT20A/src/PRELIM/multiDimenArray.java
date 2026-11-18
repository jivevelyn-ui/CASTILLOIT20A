package PRELIM;


public class multiDimenArray {
    public static void main (String [] args){
        int marks [][]={
            {89, 68, 64, 53, 32},
            {59, 88, 33, 31, 11},
            {90, 23, 12, 84, 55}
        };
        
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
            
        }
    }
}
