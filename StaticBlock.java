/* JFM1T7_Assignment5:

   Write a program to create a static method named dispCollegeName to print the value of a static variable  college_name initialized using static block.
   Access this method from another class and display college_name for 3 students who study in same college.
   Prompt the user for the  values to be input from the terminal

   Sample Input:
   Enter the student name: Sri
   Enter the student Roll no: 1
   Enter the student name: Balaji
   Enter the student Roll no: 2
   Enter the student name: Ram
   Enter the student Roll no: 3
   
   Expected Output:
   Student name: Sri
   Student Roll no: 1
   College Name : IIT
   Student name: Balaji
   Student Roll no: 2
   College Name : IIT
   Student name: Ram
   Student Roll no: 3
   College Name : IIT

*/
import java.util.Scanner;
public class StaticBlock {

//main method
public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
//initialize Student class constructor for three times
  Student s1=new Student();
   Student s2=new Student();
   Student s3=new Student();

//Create an array and add the 3 student to it
  Student [] arr={s1,s2,s3};
//take input from user 3 times using for loop 
  for(int i=0;i<3;i++){
    System.out.print("Enter the student name: ");
    String name=sc.next();
    arr[i].setName(name);
    System.out.print("Enter the student Roll no: ");
    int rollno=sc.nextInt();
    arr[i].setRollNo(rollno);
  }
   for(int i=0;i<3;i++){
    System.out.println("Student name: "+arr[i].getName());
    
    System.out.println("Student Roll no: "+arr[i].getRollNo());
    
    Student.dispCollegename();
  }


} 
}

//creating Student class and declaring variables
class Student{
  private int rollno;
  private String name;
  static String collegeName;
//creating staticBlock in that give collegename
  static{
    collegeName="IIT";
  }

//add getters and setters
  public void setRollNo(int rollno){
    this.rollno=rollno;
  }
  public int getRollNo(){
    return rollno;
  }
  public void setName(String name){
    this.name=name;
  }
  public String getName(){
    return name;
  }

//creating dispCollegename static method 
  public static void dispCollegename(){
    System.out.println("College Name : "+collegeName);
  }
}