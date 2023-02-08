/*  JFM1T8_Assignment3:

    Write a program to find a substring in a string without using an inbuilt method of String class.
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    Enter search string: bitLabs
    
    Expected output: bitLabs is found
    
    Enter search string: bitlab
    Expected output: bitlab is not found

*/

import java.util.Scanner;
import java.lang.*;
public class SubStringWithoutInbuilt {
   public  boolean issubstring(String s,String ss){
    boolean result=false;
    for(int i=0;i<s.length();i++)
    {
        for(int j=0;j<ss.length();j++)
        {
            if(ss.charAt(j)==s.charAt(i))
            {
                if(j!=ss.length()-1 &&i!=s.length()-1)
                {
                    if(ss.charAt(j+1)==s.charAt(i+1))
                    {
                        result=true;
                    }
                }
            }
        }
  }
    return result;
}
public static void main(String args[])
{
    String s;
    String ss;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string:");
     s=sc.nextLine();
    System.out.print("Enter the word to be searched:");
     ss=sc.next();

SubStringWithoutInbuilt st=new SubStringWithoutInbuilt();
  boolean result =st.issubstring(s,ss);
 
    if(result)
    {
        System.out.println("Excepted output:"+ss+" is found");
    }
    else
    {
        System.out.println("Excepted output:"+ss+" is not found");
    }
}
}
//main method

//declare variables

//take input from user

//compare two strings if the search string found or not without using inbuilt method isSubString()

//creat isSubString method in that declare variable 

//check two strings if the search string is present then return true else return false