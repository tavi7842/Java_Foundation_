/*write a program student class we take 3 subject mark .using parameterized constructor print average in display method.*/
class Student{
  int eng;
  int mat;
  int sci;
  Student(int eng,int mat,int sci){
    this.eng=eng;
    this.mat=mat;
    this.sci=sci;
  }
  void display(){
    System.out.println((eng+mat+sci)/3);
  }
}
class MethodOverloading14{
  public static void main(String args[]){
    Student stu1=new Student(85,87,90);
    stu1.display();
    Student stu2=new Student(80,95,98);
    stu2.display();
    Student stu3=new Student(91,88,75);
    stu3.display();
  }
}