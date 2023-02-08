/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/
import java.util.Scanner;
public class ArraySum {

//Define the main method
public static void main(String args[]){

  

//Declare the variables and initialize
int sum=0,n;
//Take input from user
Scanner s = new Scanner(System.in);
  System.out.println("Enter the n value");
  n = s.nextInt();
  int [] a=new int[n];
  System.out.println("Enter the "+n+" values");
  for(int i=0;i<n;i++){
    a[i]=s.nextInt();
  }
//Check user input values using for loop and add all values
 for(int i=0;i<n;i++){
    sum=sum+a[i];
  }
//Print the result
  System.out.println("Sum of array elements is :" +sum);
}
}
