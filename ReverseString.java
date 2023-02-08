/*  JFM1T8_Assignment5:

    Write a program to reverse a string using StringBuffer. Reverse entire sentence in string and also reverse each word in the string. 
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    
    Expected output:
    reversing entire string: sbaLtib ta ysae edam gninraeL
    reversing each word at its place: gninraeL edam ysae ta sbaLtib  
*/

import java.util.Scanner;

public class ReverseString {
    public static void main(String args[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        str=sc.nextLine();
        StringBuffer sb=new StringBuffer(str);
        System.out.println("Reversed string= "+sb.reverse());
        String[] words=str.split(" ");
        String reversedString="";
        for(int i=0;i<words.length;i++)
        {
            String word=words[i];
            String reversedWord=" ";
            for(int j=word.length()-1;j>=0;j--)
            {
                reversedWord=reversedWord+word.charAt(j);
            }
            reversedString=reversedString+reversedWord+" ";
        }
        System.out.println("reversing each word at its place: "+reversedString);
    }

//main method

//declare variables and take input from user

//creat stringbuffer object for string reversing

//reverse input string

//print entire string result

//call reverWordInMyString method

/* 
   Use split() method of String class splits
   a string in several strings based on the
   delimiter passed as an argument to it
*/


/* 
   Use charAt() function returns the character
   at the given position in a string
*/

//print reverse each word string result

}