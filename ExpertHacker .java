/*JFM1T9_Assignment2:
    Write a BankAccount class with members account_number and account_balance  and prevent other class objects 
    (assuming them as hackers who can steal your confidential information) to access BankAccount details.
    Steps to Follow:
    Step1: Create account_number and account_balance as member variables for BankAccount class
    Step 2: Add setter and getter methods for the above member variables 
    Prompt the user for the  values to be input from the terminal.

    Sample Input:
    Enter BankAccount Number : 6789023
    Enter Current Balance    : 67,000.89

    Expected Output:
    BankAccount Number : 6789023
    Current Balance    : 67000.89
    
*/
import java.util.*;
class BankAccount { 
//declare account_number , account_balance
  private long account_number;
  private double account_balance;

//create getters and setters
   void setAccount_number(long account_number){
     this.account_number=account_number;
   }
   void setAccount_number(double account_balance){
     this.account_balance=account_balance;
   }
  long getAccount_number(){
    return account_number;
  }
  double getAccount_balance(){
    return account_balance;
  }
}  

class ExpertHacker { 

public static void main(String args[]) { 
   BankAccount b = new BankAccount();
//main method
//create Scanner object
  Scanner s = new Scanner(System.in);
//Take input from user
  System.out.println("Enter the Account_number");
  b.setAccount_number(s.nextLong());
  System.out.println("Enter the Account_Balance");
  b.setAccount_number(s.nextDouble());

//Create an object of BankAccount class and set account_number and the account_balance

// Try accessing fields of BankAcccount class and check whether it's accessible 

// or not. If not then try accessing it with it’s setter and getter methods. 

// Print account_number and account_balance 
  System.out.println("BankAccount Number :"+b.getAccount_number());
  System.out.println("Current Balance    :"+b.getAccount_balance());
}   
} 