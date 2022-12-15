/*7.A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively. 
We have to print the money deposited by him in a particular bank.
Create a class 'Bank' with a method 'getBalance' which returns 0. Make its three subclasses named 'BankA', 
'BankB' and 'BankC' with a method with the same name 'getBalance' which returns the amount deposited in that 
particular bank. Call the method 'getBalance' by the object of each of the three banks.*/
class Bank{
int getBalance(){
    return 0;
  }
}
class BankA extends Bank{
  int getBalance(int balance){
   return balance;
  }
}
class BankB extends Bank{
  int getBalance(int balance){
    return balance;
  }
}
class BankC extends Bank{
  int getBalance(int balance){
    return balance;
  }
}
class MethodOverloading6{
  public static void main(String args[]){
    BankA ba1=new BankA();
    BankB ba2=new BankB();
    BankC ba3=new BankC();
    System.out.println("$"+ba1.getBalance(1000));
    System.out.println("$"+ba2.getBalance(1500));
    System.out.println("$"+ba3.getBalance(2000));
  }
}