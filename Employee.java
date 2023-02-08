/* JFM1T6_Assignment1:

   Write an Employee class with any 3 properties and create 2 employee objects to store and display the data.
   Prompt the user for the 2 employees to be input from the terminal.

   Sample Input:
   Enter the Empid: 01
   Enter the Name: Sree
   Enter Salary: 1000
   Enter the Empid: 02
   Enter the Name: Balaji
   Enter Salary: 2000

   Expected Output:
   **** Stored data displayed below ****
   Employee id = 01
   Employee name = Sree
   Employee salary = 1000
   Employee id = 02
   Employee name = Balaji
   Employee salary = 2000

*/

import java.util.Scanner;
class Employee{
  Scanner sc=new Scanner(System.in);
//Declare the variables
int Id;
String name; 
double salary;

//create Scanner object
void getInput()//Create a method getInput() 
{
//take input from user
System.out.println(" Employee id"); 
Id=sc.nextInt();
System.out.println("Enter the name"); 
name=sc.next();
System.out.println("Enter the salary"); 
salary=sc.nextDouble();
}
void display() //create display method
{

System.out.println("Employee id="+Id);
System.out.println("Enter the name="+name);
System.out.println("Enter the salary="+salary);
   //Print Employee details
 } 
 



//main method
public static void main(String args[])
{
   
  Employee e1=new Employee();
  Employee e2=new Employee();
   Employee [] arr={e1,e2};
  for(int i=0;i<2;i++){
  arr[i].getInput();
  }
  System.out.println("**** Stored data displayed below **** ");
  for(int i=0;i<2;i++){
  arr[i].display();
  }
}
}