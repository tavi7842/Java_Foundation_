/*write a program using super keyword in student class variable are id,name using paramterized constrcutor
and one more class employee class have extra variable salary using super and paramterized constructor.*/
class Student{
  int id;
  String name;
  Student(int id,String name){
    this.id=id;
    this.name=name;
  }
  
}
class Emp extends Student{
  int salary;
  Emp(int id,String name,int salary){
    super(id,name);
    this.salary=salary;
  }
  void display(){
    System.out.println(id+" "+name+" "+salary);
  }
}
class MethodOverloading9{
  public static void main(String args[]){
    
  Emp e=new Emp(15,"lokesh",50000);
    e.display();
    
  }
}