/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class HighestNumber {
     
//Add main method
public static void main(String args[]){
  

//Declare the three variables
int a=0,b=0,c=0;
//Use the scanner class to provide input at execution time
 Scanner s= new Scanner(System.in);
 System.out.println("Enter the first number");
 a =s.nextInt();
 System.out.println("Enter the Second number");
 b =s.nextInt();
 System.out.println("Enter the Third number");
 c =s.nextInt();
 


//check which number is highest using if else condition
//Print the highest of three numbers
  if (a > b && a > c){
    System.out.println(a+" "+"is highest number");
  } else if(b>c){
    System.out.println(b+" "+"is highest number");
  } else {
     System.out.println(c+" "+"is highest number");
  }

 }
}