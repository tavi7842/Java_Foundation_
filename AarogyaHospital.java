//package aarogya_hospital;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


// the main class
public class AarogyaHospital{

	     int count=0;
        // class for storing the patient information
	class AarogyaMember{
          // declare all the details for the patient including name, age, gender, Aadhar Card number, contact number, city, address, date of admission, guardian name, guardian address, guardian contact number
           String patient_name,gender,city,address,date_of_admission,g_name,g_address;
           int age;
           long aadhar_number,phone_number,g_contact_number;
           int uid;
           boolean recoverd;
         
	     // make constructor for the class and assign it a unique Id
	    public AarogyaMember(){
         uid=count;
	    	 count++;
       recoverd=false;
	    }
    
    	    // for taking patient information
	    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Patient name");
        patient_name = s.nextLine();
        System.out.println("Enter the Patient gender");
        gender = s.nextLine();
        System.out.println("Enter the Patient city");
        city = s.nextLine();
        System.out.println("Enter the Patient address");
        address = s.nextLine();
        System.out.println("Enter the Patient Date of Admission");
        date_of_admission = s.nextLine();
        System.out.println("Enter the Guardian name");
        g_name = s.nextLine();
        System.out.println("Enter the Guardian address");
        g_address = s.nextLine();
        System.out.println("Enter the Patient age");
        age = s.nextInt();
	    	System.out.println("Enter the Patient aadhar_number");
        aadhar_number = s.nextLong();
        System.out.println("Enter the Patient contact_number");
        phone_number = s.nextLong();
        System.out.println("Enter the Guardian contact_number");
        g_contact_number = s.nextLong();
        System.out.println("Patient Registered"+" "+uid);
	    }
    public void display(AarogyaMember ak){
      System.out.println(ak.uid+" "+ak.patient_name+" "+ak.gender+" "+ak.city+" "+ak.address+" "+ak.city+" "+ak.address+" "+ak.date_of_admission+" "+ak.g_name+" "+ak.g_address+" "+ak.age+" "+ak.aadhar_number+" "+ak.phone_number+" "+ak.g_contact_number);
    }
	}

	// pick the choice of task to be performed
	static long choices(){
		System.out.println("Press 1 for adding new member");
		System.out.println("Press 2 to view list of all available members");
		System.out.println("Press 3 to search member by ID");
		System.out.println("Press 4 to search member from a particular city");
		System.out.println("Press 5 to search member from a particular age group");
		System.out.println("Press 6 to mark recovery of a member");
		System.out.println("Press 7 to delete data of a member");
		System.out.println("Press 0 to exit");
		
            // create scanner class to take input
      
      System.out.println("Enter the option");
    Scanner ip = new Scanner(System.in);
	    long option=ip.nextLong();
	    return option;
	}

	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     boolean flag=false;
    AarogyaHospital al = new AarogyaHospital();
    AarogyaHospital.AarogyaMember aa = al.new AarogyaMember();
		
		// initialise array list to store list of patients information
       ArrayList<AarogyaHospital.AarogyaMember> list = new ArrayList<AarogyaHospital.AarogyaMember>();

		//for adding aarogya member information
		while(true){

			//take choice
			long option=choices();
			
			//invalid choice
			if(option<0||option>7){
			System.out.println("Invalid Option");
			}
			// take the input and add in the arrayList
			else if(option==1){
        AarogyaHospital.AarogyaMember ab = al.new AarogyaMember();
                  ab.input();
	                list.add(ab);
        	        }
			//iterate and print all the patients information
	       		 else if(option==2){
               for(AarogyaHospital.AarogyaMember am:list){
                 System.out.println(am.patient_name+" "+am.uid);
               }
	       		 }
			
			// print details of the patient with a particular id (take id as input)
	                else if(option==3){
                   System.out.println("Enter the id to be searched");
                    int id = sc.nextInt();
                    for(AarogyaMember am:list){
                      if(am.uid==id){
                        aa.display(am);
                        flag=true;
                      }
                    }
                    if(flag=false){
                      System.out.println("patient not found based on id");
                    }
	                }
			
			// to print all the patients from a particular city (take city as input)
	                else if(option==4){
                    System.out.println("Enter the city to be searched");
                    String scity = sc.next();
                    for(AarogyaMember am:list){
                      if(am.city.equals(scity)){
                        aa.display(am);
                        flag=true;
                      }
                    }
	        	       if(flag=false){
                      System.out.println("patient not found based on city");
                    }
	               }
			// to print details of all the patients in a particular age group (take age limits as input)
	               else if(option==5){
	                 System.out.println("Enter the age to be searched");
                    int age1 = sc.nextInt();
                    for(AarogyaMember am:list){
                      if(am.age==age1){
                        aa.display(am);
                        flag=true;
                      }
                    }
                   if(flag=false){
                      System.out.println("patient not found based on age");
                    }
	              }
	              // take member id as input to maintain recovered information of patient
	               else if(option==6){
                   int id;
                   System.out.println("Enter the id");
                   id=sc.nextInt();
                   for(AarogyaMember am:list){
                     if(am.uid==id){
                       am.recoverd=true;
                       aa.display(am);
                     }
                   }
	            
	              }
	              //take member id as input to delete patient information
	              else if(option==7){
			             int id;
                  System.out.println("Enter the id");
                  id=sc.nextInt();
                  AarogyaHospital.AarogyaMember abr=null;
                  for(AarogyaHospital.AarogyaMember am:list){
                    if(am.uid==id){
                     abr=am;
                    }
                  }
                  list.remove(abr);
                  System.out.println("delete sucessfully");
	              }
			
	              else{
	             break;
	             }
		}
	}
}
