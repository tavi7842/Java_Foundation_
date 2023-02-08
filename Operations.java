/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations {

//main method
  public static void main(String args[]){
  
//Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
//

//Take input from user
  System.out.println("Enter first number for Differrence:");
  int a=sc.nextInt();
  System.out.println("Enter Second number for Differrence:");
  int b=sc.nextInt();
  System.out.println("Enter first number for Product:");
  int c=sc.nextInt();
  System.out.println("Enter Second number for Product:");
  int d=sc.nextInt();
  System.out.println("Enter first number for Division:");
  int e=sc.nextInt();
  System.out.println("Enter Second number for Division:");
  int f=sc.nextInt();
  System.out.println("Enter  number for Increment ");
  int g=sc.nextInt();
  System.out.println("Enter  number for Decrement ");
  int v=sc.nextInt();
  System.out.println("Enter first number for Remainder:");
  int h=sc.nextInt();
  System.out.println("Enter Second number for Remainder:");
  int i =sc.nextInt();
//

//calculate difference,product,division,increment and remainder 
    int j = a-b;
    int k = c*d;
    int l = e/f;
    int m = ++g;
    int n = --v;
    int o = h%i;
  

//print appropriate result for all operations
     System.out.println("Difference of 2 numbers "+j);
     System.out.println("Product of 2 numbers "+k);
     System.out.println("Division of 2 numbers "+l);
     System.out.println("Increment of value is :"+m+"\n Decrement of value is :"+n);
     System.out.println("Remainder of 2 numbers is : "+o);
  }
}