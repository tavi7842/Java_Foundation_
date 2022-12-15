/*student class rollno,name,grade,branch and mobilenumber and print some method.*/
class Student1{
  int rollno;
  String name;
  char grade;
  String branch;
  long mobileno;
void read(){
  System.out.println(name+" reading");
}
void write(){
  System.out.println(name+" Writing"); 
}
  void listen(){
    System.out.println(name+" Listening");
  }
}
class MethodOverloading16{
  public static void main(String args[]){
    Student1 std1=new Student1();
    std1.rollno=897;
    std1.name="Vinay";
    std1.grade='B';
    std1.branch="CSE";
    std1.mobileno=9393384784l;
    std1.read();
    std1.write();
    std1.listen();
    System.out.println(std1.rollno+" "+std1.name+" "+std1.grade+" "+std1.branch+" "+std1.mobileno);

    Student1 std2=new Student1();
    std2.rollno=234;
    std2.name="Manasa";
    std2.grade='B';
    std2.branch="IT";
    std2.mobileno=4569871235l;
    std2.read();
    std2.write();
    std2.listen();
    System.out.println(std2.rollno+" "+std2.name+" "+std2.grade+" "+std2.branch+" "+std2.mobileno);
    Student1 std3=new Student1();
    std3.rollno=456;
    std3.name="abhi";
    std3.grade='B';
    std3.branch="MECH";
    std3.mobileno=6598741230l;
    std3.read();
    std3.write();
    std3.listen();
    System.out.println(std3.rollno+" "+std3.name+" "+std3.grade+" "+std3.branch+" "+std3.mobileno);
  }   
  }