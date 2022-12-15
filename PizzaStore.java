/*Create a class named Pizza that stores information about a single pizza. It should containthe following:  

1.Private  instance  variables  to  store  the  size  of  the  pizza  (either  small,  medium,or large), the  number of  cheese toppings, the number of pepperoni toppings, andthe number of ham toppings. 

2.Constructor(s) that set all of the instance variables.
3.Public methods to get and set the instance variables.
4.A public method named calcCost( ) that returns a double that is the cost of the pizza.
Pizza cost is determined by:
Small: $10 + $2 per topping
Medium: $12 + $2 per topping
Large: $14 + $2 per topping  

 6.public method named getDescription( ) that returns a String containing the pizzasize, quantity of each topping.*/
import java.util.*;
class Pizza{
  private String sizeOfPizza;
  private int numOfCheTopp;
  private int numOfPepTopp;
  private int numOfHamTopp;
  Pizza( String sizeOfPizza,int numOfCheTopp,int numOfPepTopp, int numOfHamTopp){
    this.sizeOfPizza=sizeOfPizza;
    this.numOfCheTopp=numOfCheTopp;
    this.numOfPepTopp=numOfPepTopp;
    this.numOfHamTopp=numOfHamTopp;
  }
  
  void setSizeOfPizza(String sizeOfPizza){
     this.sizeOfPizza=sizeOfPizza;
  }
  void setNumOfCheTopp(int numOfCheTopp){
    this.numOfCheTopp=numOfCheTopp;
  }
  void setNumOfPepTopp(int numOfPepTopp){
    this.numOfPepTopp=numOfPepTopp;
  }
  void setNumOfHamTopp(int numOfHamTopp){
    this.numOfHamTopp=numOfHamTopp;
  }
  String getSizeOfPizza(){
     return sizeOfPizza;
  }
  int getNumOfCheTopp(){
    return numOfCheTopp;
  }
  int getNumOfPepTopp(){
    return numOfPepTopp;
  }
  int getNumOfHamTopp(){
    return numOfHamTopp;
  }
 /* Small: $10 + $2 per topping
Medium: $12 + $2 per topping
Large: $14 + $2 per topping */ 

  double calcCost(){
    double cost=0;
    if(sizeOfPizza.equals("small")){
      cost=10+(numOfCheTopp*2)+(numOfPepTopp*2)+(numOfHamTopp*2);
      }
     if(sizeOfPizza.equals("medium")){
      cost=12+(numOfCheTopp*2)+(numOfPepTopp*2)+(numOfHamTopp*2);
      }
     if(sizeOfPizza.equals("large")){
      cost=14+(numOfCheTopp*2)+(numOfPepTopp*2)+(numOfHamTopp*2);
       
      }
    return cost;
  }
    String getDescription(){
      return "size of pizza:"+sizeOfPizza+"cheese quality:"+numOfCheTopp+"pepper quality:"+numOfPepTopp+"ham quality:"+numOfHamTopp;
    }
class PizzaStore{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter pizze size(small/medium/large):");
    String sizeOfPizza=sc.next();
    System.out.println("number of cheese toppings:");
    int numOfCheTopp=sc.nextInt();
    System.out.println("number of pepper toppings:");
    int numOfPepTopp=sc.nextInt();
    System.out.println("number of ham toppings:");
    int numOfHamTopp=sc.nextInt();
    Pizza pz=new Pizza(sizeOfPizza,numOfCheTopp,numOfPepTopp,numOfHamTopp);
    System.out.println(pz.getDescription());
    return;
  }
}
}