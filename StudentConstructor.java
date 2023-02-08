/* JFM1T7_Assignment1:

   Write a program to initialize data members of Student class using constructor.
   Prompt the user for the  values to be input from the terminal

   Sample Input:
   Enter student name: Shree Balaji
   Enter student Roll no: 01

   Expected Output:
   Name: Shree Balaji    Roll no: 01

*/

import java.util.Scanner;

public class StudentConstructor {

//main method
  public static void main(String args[]){
    StudentConstructor obj = new StudentConstructor();
    
  

//initialize Student class using constructor
  Student s1 = new Student();

//Get student name and rollno from user and set it to the Student object 
  Scanner s = new Scanner(System.in);
  System.out.println("Enter the Student name");
  String name = s.nextLine();
  s1.setName(name);
  System.out.println("Enter the Student Roll no :");
  int rollNo = s.nextInt();
  s1.setRollNo(rollNo);
//print result
    System.out.println("Enter the Student name:"+" "+s1.getName());
     System.out.println("Enter the Student Roll no :"+" "+s1.getRollNo());
}
}

//Create Student class in that declare variables name and roll number 
  class Student{
    private String name;
    private int rollNo;
  

//add  setter method for rollno
public void setRollNo(int rollNo){ 
         this.rollNo = rollNo; 
} 

//add getter method for rollno
public int getRollNo(){ 
      return this.rollNo; 
} 

//add setters and getters for name fields also
   public void setName(String name){
     this.name=name;
   }
    public String getName(){
     return this.name;
   }
}
