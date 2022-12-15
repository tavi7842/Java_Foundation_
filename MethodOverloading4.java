/*5.Create a class 'Student' with three data members which are name, age and address. The constructor of the class 
assigns default values name as "unknown", age as '0' and address as "not available". It has two members with the same 
name 'setInfo'. First method has two parameters for name and age and assigns the same whereas the second method takes
 has three parameters which are assigned to name, age and address respectively. Print the name, age and address of 
10 students.
Hint - Use array of objects*/
import java.util.*;
class Student{
  String name;
  int age;
  String address;
  Student(){
    name = "unknown";
    age = 0;
    address = "not available";
  }
  void setInfo(String name,int age){
    System.out.println("Name:"+" "+name+" "+"Age:"+" "+age);
  }
  void setInfo(String name,int age,String address){
    System.out.println("Name:"+" "+name+" "+"Age:"+" "+age+" "+"address"+" "+address);
  }
}

class MethodOverloading4{
  public static void main(String args[]){
    Student s[] = new Student[10];
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<2;i++){
      s[i]=new Student();
      System.out.println("Enter the Student name");
      String name = sc.next();
      System.out.println("Enter the Student age");
      int age = sc.nextInt();
      System.out.println("Enter the Student address");
      String address = sc.next();
      s[i].setInfo(name,age);
      s[i].setInfo(name,age,address);
    }
  }
}