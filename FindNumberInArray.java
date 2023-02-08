/* JFM1T11_Assignment1:

   Write a program to find a number in an integer array. If found print the number and the array index at which it is found. 
   Prompt the user input from the terminal.
   
   Sample Input: 2,4,6,1,7,8,9
   Enter number to search x= 9

   Expected Output: 9 found at index 6
   
   Enter number to search x= 12
   Expected Output: Sorry! 12 is not found in array.
   
*/
import java.util.Scanner;

public class FindNumberInArray
{

	//main method
	public static void main(String[]args)
	{
   Scanner sc = new Scanner(System.in);
                 
        System.out.print("Enter array size ");
        int integers = sc.nextInt();
        int arr[]=new int[integers];
        System.out.println("enter the values");
        for(int i=0;i<integers;i++)
        {
            sc.useDelimiter("\\D");
           arr[i]=sc.nextInt();
        }
            System.out.print("\nEnter Number to be search :");
         int j=0;
         boolean a=false;
         	int key=sc.nextInt();
        for(int i=0;i<integers;i++)
        {
        	if(arr[i]==key){
        		a=true;
        			System.out.print(key+" found at index : " +i); 
        	}
        	
        }
        if(a==false)
        {
        	  	 System.out.println("Sorry! "+key+" is not found in array."); 
        }
		   
        	
	}
}
