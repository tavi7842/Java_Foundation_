/*6.Create a class 'Degree' having a method 'getDegree' that prints "I got a degree".
 It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a method with
 the same name that prints "I am an Undergraduate" and "I am a Postgraduate" respectively. 
Call the method by creating an object of each of the three classes.*/
class Degree{
  void getDegree(){
    System.out.println("I got a degree");
  }
}
class Undergraduate{
  void Undergraduate(){
    System.out.println("I am an Undergraduate");
  }
}
class Postgraduate{
  void Postgraduate(){
    System.out.println("I am an Postgraduate");
  }
}

class MethodOverloading5{
  public static void main(String args[]){
    Degree d = new Degree();
    Undergraduate u = new Undergraduate();
     Postgraduate p = new Postgraduate();
    d.getDegree();
    u.Undergraduate();
    p.Postgraduate();
  }
} 