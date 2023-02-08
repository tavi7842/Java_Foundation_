/*  JFM1T8_Assignment4:

    Write a program to check whether a string is a Palindrome.
    Prompt the user input from the terminal.
    
    Sample input: Malayalam
    
    Expected output: Malayalam is a Palindrome
*/

import java.util.Scanner;

public class Palindrome {

//main method
public static void main(String args[]){
//declare varible
  int i,j,count=0;
//take input from user
  Scanner s = new Scanner(System.in);
  System.out.println("Enter the String");
  String n = s.nextLine();

/* 
   divide the whole string into two halves and compare each character in the 
   first half with each character in the second half in reverse.  
   If both are equal then it is a palindrome else print it is not a palindrome */
    i = 0;
    j=n.length()-1;
  while(i < j){
    if(n.charAt(i)==n.charAt(j)){
       count++;
       i++;
       j--;   
  } else {
     break;
  }  
   }
  if(count==n.length()/2){
    System.out.println("The Given String is a Palindrome");
  } else {
    System.out.println("The Given String is not a Palindrome");
  }  
}
}

