/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/


import java.util.Scanner;

public class Temperature{

//Define the main method
public static void main(String args[]){
//Declare the variables and initialize
float min=0f;
  int n =0;
//Take temperature of 7 days as a input from user
Scanner s = new Scanner(System.in);
  System.out.println("Enter number of days");
  n = s.nextInt();
  Float []a=new Float[n];
  System.out.println("Enter the temperature of Day 1" );
  a[0]=s.nextFloat();
  for(int i=1;i<n;i++){
    System.out.println("Enter the temperature of Day"+ " "+(i+1));
    a[i]=s.nextFloat();
  }
//Calculate the lowest temperature
  int i;
  for( i=0;i<n;i++){
    min = a[0];
    if(min>a[i]){
      min = a[i];
    }
    //Print the result
  }
      System.out.println("The lowest temperature of the week "+i+"is " +min+ " celsius");
}
}