/*  JFM1T8_Assignment1:

    Write a program to convert an int variable to String using an inbuilt function of String class and print the char at index position 2.
    Prompt the user input from the terminal.
    
    Sample input: 54321
    
    Expected output: char at index position 2 = 3
*/

import java.util.Scanner;

public class IntToString {

//main method
public static void main(String args[]){
  

//declare int type variable
int i;

//take input from user
Scanner s = new Scanner(System.in);
  System.out.println("Enter the Input");
  int n = s.nextInt();
  
  
//converting integer to string using toString method
  String a = String.valueOf(n);

//use inbuilt function to print index position
  //print result
  for(i=0;i<=2;i++){
  }
   System.out.println("char at index position 2 = "+" "+a.charAt(2));
}
}