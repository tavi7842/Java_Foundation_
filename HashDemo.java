/*    JFM1T13_Assignment5:  

      Create an application having a Generic HashMap with Empcode  as key and EmpName as value. Display only EmpNames as output. 
       Prompt the user input from the terminal.

      Sample Input: 
      Enter Emp code:101
      Enter Emp Name: Ram
      Enter another student (y/n)?y
      Enter Emp code:102
      Enter Emp Name: Vaibhav
      Enter another student (y/n)?y
      Enter Emp code:103
      Enter Emp Name: Priyanka
      Enter another student (y/n)?n

      Expected Output: 
        Ram
        Vaibhav
        Priyanka
       
*/

import java.util.Scanner;
import java.util.HashMap;

public class HashDemo {

    //main method
    public static void main (String[] args){
        //declare the HashMap 
        HashMap<Integer,String> hm= new HashMap<Integer,String>();
        boolean val = true;
        //created scanner class 
        Scanner sc = new Scanner(System.in);
        //create a while loop for user not enter no
        do{
            //ask for user input for value and key
            //asking user to enter emp code(key)
            System.out.print("Enter Emp code :");
            Integer Empcode =Integer.parseInt(sc.nextLine());
            //asking user to enter emp name(value)
            System.out.print("Enter Emp name :");
            String EmpName=sc.nextLine();
            //add the user inputs to the HashMap
            String EmpData = hm.put(Empcode,EmpName);
            //if condition checks with old emp data if data has been overwritten or not
            if(EmpData!=null){
            //prints if the data is over written 
            System.out.println("Emp Code "+Empcode+" is "+EmpData+" and has been overwitten by "+EmpName);
            }
           //ask user if they want to enter another student details
            System.out.print("Enter another student (y/n)? : ");
            String choice =sc.nextLine();
            //condition to satisfy in order to loop again
            if(choice.equals("y")){
                continue;
            }
            else{
                break;
            }
        }
            //looping again
            while(val);
            //use for each loop to grab Emp code and Emp Name
            System.out.println("Employee Names");
            for(int Emp:hm.keySet()){
                //print Emp Name
                System.out.println(hm.get(Emp));
            }  
    }
}

 
