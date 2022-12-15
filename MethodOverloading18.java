/*write a java program to print
  product details with:product id,product brand and product quantity and methods are ordereligiblity.
  order with:order id, order current day, order current date and order city*/
import java.util.*;
class Product {
  String pname;
  int pid;
  String pbrand;
  int pquantity; 
  void orderEligiblity(){
    if(pquantity<10){
      System.out.println("order cannot be taken");
    }
    else{
      System.out.println("order taken");
    }
  }
  }
class Order{
  int oid;
  String city;
  void print(){
  java.util.Date date = new java.util.Date(); 
  System.out.println(date);
  }
}
class MethodOverloading18{
  public static void main(String args[]){
    Product pro=new Product();
    pro.pname="mobile";
    pro.pid=2567;
    pro.pbrand="redmi note 10Pro";
    pro.pquantity=15;
    Order ord=new Order();
    ord.oid=1236588;
    ord.city="Guntur";
    ord.print();
    System.out.println(pro.pname+" "+pro.pid+" "+pro.pbrand+" "+pro.pquantity);
    
    System.out.println(ord.oid+" "+ord.city);
  }
}