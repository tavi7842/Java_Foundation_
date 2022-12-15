/*write a java program to print employee id,name,department,salary and phone number main class as employee
derived from another class.*/

import java.util.Scanner;
class Employee{
  private String ename;
  private int esalary;
  private int eid;
  private long phnno;
  
  void setEname(String ename){
    this.ename = ename;
  }
   void setEsalary(int esalary){
    this.esalary = esalary;
  }
  void setEid(int eid){
    this.eid = eid;
  }
  void setPhnno(long phnno){
    this.phnno = phnno;
  }
  
  String getEname(){
    return ename;
  }
  int getEsalary(){
    return esalary;
  }
   int getEid(){
    return eid;
  }
  long getPhnno(){
    return phnno;
  }
}
 class Demo3{
   public static void main(String args[]){
     
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the size of array");
     int n = s.nextInt();
    Employee e[]= new Employee[n];
     for(int i=0;i<e.length;i++){
       e[i]=new Employee();
       System.out.println("Enter the name of Employee");
       e[i].setEname(s.next());
       System.out.println("Enter the id of Employee");
       e[i].setEid(s.nextInt());
       System.out.println("Enter the salary of Employee");
       e[i].setEsalary(s.nextInt());
       System.out.println("Enter the Phone no of Employee");
       e[i].setPhnno(s.nextLong());
    System.out.println("\nName:"+" "+e[i].getEname()+"\nId"+" "+e[i].getEid()+"\nSalary"+" "+e[i].getEsalary()+" "+"\n Phnno:"+" "+e[i].getPhnno());
     } 
   }
 }