/*3.Create a class named 'PrintNumber' to print various numbers of different datatypes by creating different methods with
 the same name 'printn' having a parameter for each datatype.*/

class PrintNumber{
  void printn(int a){
    System.out.println(a);
  }
  void printn(float a){
    System.out.println(a);
  }
  void printn(double a){
    System.out.println(a);
  }
  void printn(long a){
    System.out.println(a);
  }
  void printn(short a){
    System.out.println(a);
  }
}

class MethodOverloading2 {
  public static void main(String args[]){
    PrintNumber p = new PrintNumber();
    p.printn(6);
    p.printn(6f);
    p.printn(6d);
    p.printn(123456);
    p.printn(6);
  }
}