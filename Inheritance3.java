/*Football player

name
football

Football
type
size
weight*/
class Football{
  String type;
  int size;
  int weight;
  
  Football(String type,int size,int weight){
    this.type=type;
    this.size=size;
    this.weight=weight;
  }
}

class Football_Player{
  String name;
  Football football;
  Football_Player(String name,Football football){
    this.name=name;
    this.football=football;
}
}
class Inheritance3{
  public static void main(String args[]){
    Football football1=new Football("cosco",15,20);
  
    Football_Player player1=new Football_Player("Ronalado",football1);
     
    System.out.println(player1.name);
    System.out.println("========player Information==========");
    System.out.println(football1.type+" "+football1.size+" "+football1.weight);
    
     }
}