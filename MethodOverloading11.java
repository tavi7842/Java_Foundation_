/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class Print the area and perimeter of a rectangle and a square.*/
class Rectangle{
  int length;
  int breadth;
  Rectangle(int l,int b){
    length=l;
    breadth=b;
  }
  void area(){
    int area=length*breadth;
    System.out.println("area of rectangle:"+area);
    
  }
  void perimeter(){
    int peri=(2*length)+(2*breadth);
    System.out.println("perimeter of rectangle:"+peri);
  }
}
class Square extends Rectangle{
  Square(int s){
    super(s,s);
  }
}
class MethodOverloading11{
  public static void main(String args[]){
    Rectangle r=new Rectangle(10,20);
    Square s=new Square(10);
    r.area();
    r.perimeter();
    s.area();
    s.perimeter();
  }
}