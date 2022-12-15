/*2.Create a class to print the area of a square and a rectangle. The class has two methods with the same name but 
different number of parameters. The method for printing area of rectangle has two parameters which are length and 
breadth respetively while the other method for printing area of square has one parameter which is side of square.*/
class Area{
  void print(int l,int b){
    System.out.println("area of rectangle is:"+(l*b));
  }
  void print(int s){
    System.out.println("area of square is:"+(s*s));
  }
}
class Demo4{
  public static void main(String args[]){
    Area ar=new Area();
    ar.print(10,50);
    ar.print(8);
  }
}