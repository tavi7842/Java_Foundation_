/*Create  a    class    Account    class     with     balance     as   data   member.    Create     twoconstructors  (no argument, and two arguments) and methods to withdraw and depositbalance*/

class Account{
  int balance;
 int pin;
Account(){
System.out.println("default");
}
Account(int balance,int pin){
  this.balance=balance;
  this.pin=pin;
}
int Withdraw(int withd){
  System.out.println("withdraw amount is divisible by 100");
  return balance-withd;
}
int deposit(int balan){
  System.out.println("deposit only 100,200,500 notes");
  return balance+balan;
}
}

class Inheritance5{
  public static void main(String args[]){
    Account ac=new Account(10000,3690);
    System.out.println(ac.balance);
    System.out.println(ac.pin);
    System.out.println(ac.Withdraw(100));
    System.out.println(ac.deposit(200));
  }
}