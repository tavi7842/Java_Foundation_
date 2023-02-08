/* JFM1T11_Assignment3:

   Have you ever arranged the deck of cards, or maybe shirts in your cupboard? What is common between those two things? 
   Well, you put the next card or shirt into their proper position, or we can say you insert the next element in its 
   proper position. Write a program to sort an unsorted array of numbers in the same manner.
   Prompt the user input from the terminal.

   SampleInput: 6,5,4,3,2,1
   
   Expected Output: 1,2,3,4,5,6

*/
import java.util.*;
public class InsertionSort{
    public static void main (String[] args){
        Scanner sn=new Scanner(System.in);
        System.out.println("enter n value");
        int n =sn.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values");
        for(int i=0;i<n;i++)
        {
            arr[i]=sn.nextInt();
        }
        for(int i=1;i<arr.length;i++)
        {
            int key;
            key=arr[i];
            
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        System.out.println("sorting values are:");
        for(int i=0;i<arr.length;i++)
        {
             System.out.println(arr[i]);
        }

    
    }
}