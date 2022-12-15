/*10.Suppose we want to store the information about students and teachers in a school. The information to be stored includes the name, age and marks of students and the name, age and salary of the teachers.
Here, name and age have to be stored for both students and teachers and we also know that both students and teachers are persons.
Therefore, we can make Person as a class with name and age as attributes, and can make Student and Teacher as the subclasses of Person. In the Student class, we can define an additional marks attribute and in the Teacher class an additional salary attribute*/

class Person{
  String name;
  int age;
  Person(String name,int age){
    this.name=name;
    this.age=age;
  }
}
class Students extends Person{
  int mark;
  Students(String name,int age,int mark){
    super(name, age);
    this.mark = mark;
  }
}
class Teacher extends Person{
  double salary;
  Teacher(String name,int age,double salary){
    super(name, age);
    this.salary = salary;
  }
}
class MethodOverloading8{
  public static void main(String args[]){
    Students s = new Students("Vinay",25,345);
    Teacher t = new Teacher("Rajesh",45,10000);
    System.out.println("\nName:"+" "+s.name+"\nAge"+" "+s.age+"\nMarks"+" "+s.mark);
    System.out.println("\nName:"+" "+t.name+"\nAge"+" "+t.age+"\nSalary"+" "+t.salary);
  }
}