/*4.Create a class to print an integer and a character with two methods having the same name but different sequence of 
the integer and the character parameters.
For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).*/

class Character{
  void show(int n ,char c){
    System.out.println(n+" "+c);
  }
  void show(char c ,int n){
    System.out.println(n+" "+c);
  }
}

class MethodOverloading3{
  public static void main (String args[]){
  Character c = new Character();
  c.show(4,'5');
  c.show('6',7);
  }
}