/*  JFM1T13_Assignment4: 

      Write a program to create a class HDTV with the properties: 
         â€¢	Brandname 
         â€¢	Size 
      Create another class having an ArrayList and add 3 objects of HDTV into it. Display HDTV objects in sorted order of size.(Use Comparator) 

     Sample Output:
     4000 Sony 20
     2000 LG 26
     3000 MI 27
     1000 Samsung 28
*/
import java.util.*; 
import java.lang.*; 
import java.io.*;

public class HdTvStock {
//main method
 public static void main(String args[])
 {
    //create HdTv class object in arraylist
    ArrayList properties = new ArrayList();
    //add elements to that arraylist
    properties.add(new HdTv(3000,"MI",27));
    properties.add(new HdTv(4000,"Sony",20));
    properties.add(new HdTv(1000,"Samsung",28));
    properties.add(new HdTv(2000,"LG",26));
    //print values on sorted order based on size value
    //use collection.sort and pass Brandname Comparator as parameters
    Collections.sort(properties,new BrandnameComparator());
    Iterator itr = properties.iterator();
    System.out.println("\n\tHDTV Stocks\n==============================\nAmount\tBrand Names\tSizes");
    while(itr.hasNext())
    {
        HdTv p =(HdTv)itr.next();
        //print result
        System.out.println(p.amount+"\t"+p.Brandname+"\t\t"+p.size);
    }
   
  } 
}
    //create HdTv class in that declare variables and pass variables as parameters
    class HdTv
    {
        int amount;
        String Brandname;
        int size;
        //constructor
        HdTv(int amount,String Brandname,int size)
        {
            this.amount=amount;
            this.Brandname=Brandname;
            this.size=size;
        }
    }
    //create BrandnameComparator it implements Comparator in that create a compare method pass two parameters for comparing sizes
    class BrandnameComparator implements Comparator
    {
        //access HdTv class objects
        public int compare(Object o1,Object o2)
        {
            HdTv p1 =(HdTv)o1;
            HdTv p2 =(HdTv)o2;
            //compare sizes and return size
            if(p1.size==p2.size){
                return 0;
            }
            else if(p1.size>p2.size){
                return 1;
            }
            else{
                return -1;
            }
        }
    
    }