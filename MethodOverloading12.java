/*mulitplication class print different parameter pass in the same method name.*/
class Multi{
  void sum(int c,int d){
    System.out.println("sum is:"+(c*d));
  }
  void sum(int c,int d,int e){
    System.out.println("sum is:"+(c*d*e));
  }
  void sum(int c,float d){
    System.out.println("sum is:"+(c*d));
  }
  void sum(float c,float d){
    System.out.println("sum is:"+(c*d));
  }
  void sum(float c,int d){
    System.out.println("sum is:"+(c*d));
  }
  void sum(float c,int d,int e){
    System.out.println("sum is:"+(c*d*e));
  }
}
class MethodOverloading12{
  public static void main(String args[]){
    Multi mu=new Multi();
    mu.sum(10,5);
    mu.sum(10,7,8);
    mu.sum(15,18.2f);
    mu.sum(13.2f,15.8f);
    mu.sum(10.5f,8);
    mu.sum(16.5f,8,5);
  }
}