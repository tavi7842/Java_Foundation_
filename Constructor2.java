/*take a student class on that we have some attributes id,name,age and average of student usind default constructor 
and parameterized constructor and we can use seeter and getters method.*/
class StudentData
{
   private int stuID;
   private String stuName;
   private int stuAge;
  private float stuavg;
   StudentData()
   {
       //Default constructor
       stuID = 5;
       stuName = "New Student";
       stuAge = 18;
       stuavg=82;
   }
   StudentData(int num1, String str, int num2, float avg)
   {
       //Parameterized constructor
       stuID = num1;
       stuName = str;
       stuAge = num2;
       stuavg=avg;
   }
   //Getter and setter methods
   public int getStuID() {
       return stuID;
   }
   public void setStuID(int stuID) {
       this.stuID = stuID;
   }
   public String getStuName() {
       return stuName;
   }
   public void setStuName(String stuName) {
       this.stuName = stuName;
   }
   public int getStuAge() {
       return stuAge;
   }
   public void setStuAge(int stuAge) {
       this.stuAge = stuAge;
   }
  public float getStuavg()
  {
    return stuavg;
  }
  public void setStuavg(float stuavg)
  {
    this.stuavg=stuavg;
}
}
public class Constructor2
{
public static void main(String args[])
{
//This object creation would call the default constructor
StudentData myobj = new StudentData();
System.out.println("Student Name is: "+myobj.getStuName());
System.out.println("Student Age is: "+myobj.getStuAge());
System.out.println("Student ID is: "+myobj.getStuID());
System.out.println("Student average is: "+myobj.getStuavg());
/*This object creation would call the parameterized
* constructor StudentData(int, String, int)*/
StudentData myobj2 = new StudentData(555, "Chaitanya", 25,85);
System.out.println("Student Name is: "+myobj2.getStuName());
System.out.println("Student Age is: "+myobj2.getStuAge());
System.out.println("Student ID is: "+myobj2.getStuID());
System.out.println("Student average is:"+myobj2.getStuavg());
  }
}