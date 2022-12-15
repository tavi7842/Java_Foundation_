/*animal class take some attaributes and extends one dog  we can print that.(single inheritance)*/
class Animal{
  String color;
  int no_legs;
  String bread;
  void eat(){
    System.out.println("eating");
  }  
  void run(){
    System.out.println("running");
  }
}
class Dog extends Animal{
  void bark(){
    System.out.println("Bow Bow......");
  }
  void display(){
    System.out.println(color +" "+no_legs+" "+bread);  
  }
}

class Inheritance1{
  public static void main(String args[]){
    Dog puppy=new Dog();
    puppy.color="black";
    puppy.no_legs=4;
    puppy.bread="jarman shepherd";
    puppy.display();
    puppy.eat();
    puppy.run();
    puppy.bark();
  }
}