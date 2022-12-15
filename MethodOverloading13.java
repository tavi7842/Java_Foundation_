/*write a program to print how many players and name of the game we can take game as one class and 
read that data two different game class using super keyword. */
class Game{
  int players;
  String name;
  Game(int pla,String na){
    players=pla;
    name=na;
  }
     void display(){
    System.out.println("number of players"+players);
    System.out.println("name of the game"+name);
  }
  }
class Kabaddi extends Game{
  Kabaddi(int pla1,String na1){
    super(pla1,na1);
  }
 }
  class Cricket extends Game{
    Cricket(int pla2,String na2){
      super(pla2,na2);
    }
}
class MethodOverloading13{
  public static void main(String args[]){
    Kabaddi ka=new Kabaddi(7,"Kabaddi");
    ka.display();
    Cricket ci=new Cricket(11,"Cricket");
    ci.display();
  }
}