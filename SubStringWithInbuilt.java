/*  JFM1T8_Assignment2:

    Write a program to find a substring in a string using an inbuilt method of String class.
    Prompt the user input from the terminal.
  
    Sample input: Learning made easy at bitLabs
    Enter search string : bitLabs
  
    Expected output: bitLabs is found
  
    Enter search string: bitlab
    Expected output: bitlab is not found
*/

import java.util.Scanner;

public class SubStringWithInbuilt {

//main method
public static void main(String args[]){
  
//declare variables

//take input from user
  Scanner s = new Scanner(System.in);
  System.out.println("Enter the String");
  String s1 = s.nextLine();
  System.out.println("Enter the word to be searched");
   String s2 = s.nextLine();

//check if the string contains substring or not if contains print found else print not found
  if(s1.contains(s2)){
    System.out.println(s2+" "+" is found");
  }
  else {
     System.out.println(s2+" "+" is not found");
  }
}
}