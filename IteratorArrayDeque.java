/* JFM1T13_Assignment2:

     Write a program to iterate through all elements in an ArrayDeque.Using iterator method
     Prompt the user input from the terminal.
     
     Sample Input: 12,31,6,23,90

     Expected Output:  
     ArrayDeque: [12, 31, 6, 23, 90]
     The iterator values are: 
     12
     31
     6
     23
     90
*/
import java.util.Scanner;
import java.util.*;
public class IteratorArrayDeque {
    //main method
    public static void main (String[] args) {
        //create Scanner object
        Scanner sc = new Scanner(System.in);
        //create an empty ArrayDeque
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        //take input from user
        System.out.print("Enter how many numbers you want : ");
        int n=sc.nextInt();
        System.out.print("Enter elements : ");
        for(int i=0;i<n;i++)
        {
            //sc.useDelimiter("\\D");
            dq.add(sc.nextInt());
        }
        System.out.println("ArrayDeque: "+dq);
        //create an iterator
        Iterator itr=dq.iterator();
        //Display the values after iterating through the Deque 
        System.out.println("The iterator values are:");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}

 
