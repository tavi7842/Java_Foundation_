/*take employee class attributes are id,name and salary using setter and getter method.*/
class Employee{
  private int id;
  private String name;
  private int salary;
//setters are used to assign the value
  void setId(int id){
    this.id=id;
  }
  void setName(String name){
    this.name=name;
  }
  void setSalary(int salary){
    this.salary=salary;
  }
  
//getters are used to print the data
  int getId(){
    return id;
  }
  String getName(){
    return name;
  }
  int getSalary(){
    return salary;
  }
}
class Inheritance4{
  public static void main(String args[]){
    Employee emp=new Employee();
    emp.setId(536);
    emp.setName("Vinay");
    emp.setSalary(35000);
    System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
  }
}