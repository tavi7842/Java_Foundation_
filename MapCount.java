/*  JFM1T13_Assignment3:

      Write a Java program to count the number of key-value (size) mappings in a map. 
      Prompt the user input from the terminal.

      Sample Input: 
      Enter value:20
      Enter key:bitLabs
      Enter another student (y/n)?y
      Enter value:25
      Enter key:welcomes
      Enter another student (y/n)?y
      Enter value:30 
      Enter key:you
      Enter another student (y/n)?n

      Expected Output: The size of the map is 3
*/
import java.util.*;
public class MapCount {
      //main method
      public static void main(String args[])
      {
            //declare HashMap object
            HashMap<Integer,String> hm = new HashMap<Integer,String>();
            //create a while loop for user not enter no
            boolean val =true;
            //ask for user input for value and key
            Scanner sc = new Scanner(System.in);
            //add the user inputs to the HashMap
            do{
                  //asking user to enter value
                  System.out.print("Enter value :");
                  Integer value =Integer.parseInt(sc.nextLine());
                  //asking user to enter key
                  System.out.print("Enter key :");
                  String key =sc.nextLine();
                  //adding user inputs  in hashmap
                  String Data = hm.put(value,key);
                  //ask user if they want to enter another
                  System.out.print("Enter another student (y/n)? : ");
                  //user to select choice
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
                  //print total size as result
                  System.out.print("The size of the map is "+hm.size());
      }
}

 
