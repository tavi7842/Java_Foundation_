/* JFM1T9_Assignment4:
     Extend and enhance the previous inheritance program where collegeName, designation and 
     work() method are common to all the teachers and declared in the base class in the way
     that all child classes like MathTeacher, EnglishTeacher and MusicTeacher do not need to 
     write this code and can use directly from base class. 

     Sample Output:
     Math Teacher         IIT
     English Teacher      IIT
     Music Teacher        IIT
*/

//Add Teacher class
class Teacher
{
String Designation;
String CollegeName;
    void work(String Designation,String CollegeName)
    {
        System.out.println(Designation+" "+CollegeName);
    }
}
//Add MathTeacher class
class MathTeacher extends Teacher
{  
}
//Add EnglishTeacher class
class EnglishTeacher extends Teacher
{
}
//Add MusicTeacher class
class MusicTeacher extends Teacher
{
}
class CollegePrincipal {
//Add the main method here and create all different types of Teacher objects and print there college name designation.
public static void main(String args[])
{
     MusicTeacher m=new MusicTeacher();
     m.work("Music Teacher","IIT");
     m.work("Maths Teacher","IIT");
     m.work("English Teacher","IIT");   
}
}