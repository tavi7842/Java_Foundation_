/* JFM1T5_Assignment 2:

   Write a program to store your 10 different expenses done in this month and print the highest price you incurred.
   Prompt the user for the 10 numbers to be input from the terminal.
   Sample Input:
   45.90
   23.56
   123
   23
   90.00
   344
   44
   60.01
   267
   100
   
   Expected Output:

   The highest price you incurred is 344.0

*/

import java.util.Scanner;

public class GroceryItems {

//Define the main method
public static void main(String args[]){
//Declare and initialize variables
float max=0f;
  int n =0;
//Take the 10 different expenses price
  Scanner s = new Scanner(System.in);
  System.out.println("Enter the n value");
  n = s.nextInt();
  Float []a=new Float[n];
  System.out.println("Enter the "+n+" values");
  for(int i=0;i<n;i++){
    a[i]=s.nextFloat();
  }

//Check the 10 different expenses price using for loop

//Calculate the highest price in all expenses and check if the expenses is more than new item. If true then return max.
  max=a[0];
for(int i=1;i<n;i++){
   if(max<a[i]){
     max=a[i];
   }
  
  }
 //Print the result
  
System.out.println("The highest price you incurred is :" +max);

}
}
