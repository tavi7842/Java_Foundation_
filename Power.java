/* JFM1T6_Assignment2:
   Write a method that takes 2 numbers as arguments/parameters and returns the value of num2 to the power of num1 back to the main method.
   Prompt the user for the base and power values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
    
   Expected Output:
   result = 9
   
*/

import java.util.Scanner;
public class Power {
  
public int pow(int base,int exp){
if(base>=0&&exp==0){
  return 1;
}
  else if(base==0&&exp>=1){
    return 0;
  }
  else{
  int r=1;
  for(int i=1;i<=exp;i++){
    r=base*r;
  }
  return r;
  }
  
}
//main method
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int base, exp;
      System.out.println("enter base value:");
  base=s.nextInt();
  System.out.println("enter exponent value:");
  exp=s.nextInt();
    Power p=new Power();
  int r= p.pow(base,exp);
    System.out.println(r);
    
    
  }
}
//declare variables n,p,r and initialize r as one.

//create scanner class object

//take input from user

//check if (n>=0&&p==0) if true then it prints 1 else if check (n==0&&p>=1) if true then print zero else multiply r*n

//print result