/* JFM1T6_Assignment3:

   Write a method that takes any numbers as arguments/parameters and return the mean value back to main method.
   Prompt the user for the  values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
   num3 = 4

   Expected Output:
   result = 3
   
*/

import java.util.Scanner;

public class Mean {

  public int meanValue(int arr[]) {
    int sum=0,m;
     for(int i=0;i<arr.length;i++) {
         
         sum=sum+arr[i];
     }
     m=sum/arr.length;
    return m;
  }

  // main method
  public static void main(String[] args) {
    // declare variables and initialize sum=0
    
    // create scanner object
    // take input from user
   
     Scanner s=new Scanner(System.in);
    System.out.println("Enter n value");
    int n=s.nextInt();
     int arr[]=new int[n];
    for(int i=0;i<arr.length;i++) {
         
         arr[i]=s.nextInt();
     }
//check the for loop for number of values entered in input
    // calculate mean
    Mean m = new Mean();
    System.out.println("result = "+m.meanValue(arr));

    // print result
  }
}