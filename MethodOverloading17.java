/*vehicle class derive from bus class we written millage,gare and speed using display method.*/
class Bus{
  int millage;
  int gare;
  int speed;
  Bus(int millage,int gare,int speed){
    this.millage=millage;
    this.gare=gare;
    this.speed=speed;
  }
   void display(){
    System.out.println(millage+" "+gare+" "+speed);
  }
}
  
  class MethodOverloading17{
  public static void main(String args[]){
     
      Bus bu=new Bus(15,6,100);
      bu.display();
     Bus bu1=new Bus(20,5,70);
      bu1.display();
    Bus bu2=new Bus(25,7,60);
      bu2.display();
    
    }
  }
