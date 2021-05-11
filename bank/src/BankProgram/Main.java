package BankProgram;

import java.util.Scanner;

public class Main {
	
	 static String firstName=null;
	 static String lastName=null;
     static int age;
	 static char gender;
	 static String email=null;
	 static int accNum;
	 static int phoneNum;
	 static String accType;
	 static int index;
	 static int size=100;
	 static char choice;
	 static int num=0;
	 static Person [] myList = new Person[999];
	
	 
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 do {
			 System.out.println("-------------------------------------WELCOME TO YYDS BANK-------------------------------------\n");
			 System.out.println("1-ADDFIRST,2-ADDBTW,3-ADDLAST,4-REMOVEFIRST,5-REMOVEBTW,6-REMOVELAST,7-EDIT,8-SEARCH,9-DISPLAY");
			 System.out.print("\nSelect option : ");
			 int option = scan.nextInt();
			 if(option==1) {
				    setInfo();
			 		addFirst(); 
			 }
			 else if(option==2) {
				 	setIndex();
				    setInfo();
		 			addBtw();
			 }
			 else if(option==3) {
				 	setInfo();
			 		addLast();
			 }
			 else if(option==4) {
				 	removeFirst();
			 }
			 else if(option==5) {
				 	setIndex();
				 	removeBtw();
			 }
			 else if(option==6) {
				 	removeLast();
			 }
			 else if(option==7) {
				 	setIndex();
			 		setInfo();
			 		edit();
			 }
			 else if(option==8) {
				 	setIndex();
			 		search();
			 }
			 else if(option==9) {
				 	displayRecord();
			 }
			 System.out.println("DO U WAN CONTINUE (y-yes n-no)");
			 choice = scan.next().charAt(0);
		 }while(choice=='y');	
		 
	}	// end main
	
	public static void setInfo() {
		Scanner scan = new Scanner(System.in);	
		System.out.print("Enter first name = ");
 		firstName = scan.next();
 		System.out.print("Enter last name = ");
 		lastName = scan.next();
 		System.out.print("Enter age = ");
 		age = scan.nextInt();
 		System.out.print("Enter gender = ");
 		gender = scan.next().charAt(0);
 		System.out.print("Enter email = ");
 		email = scan.next();
 		System.out.print("Enter account number = ");
 		accNum = scan.nextInt();
 		System.out.print("Enter phone number = ");
 		phoneNum = scan.nextInt();
 		System.out.print("Enter account type = ");
 		accType = scan.next();	
 		
	}	//end setInfo() method
	
	public static void setIndex() {
		Scanner scan = new Scanner(System.in);	
		System.out.print("Enter index :");
 		index=scan.nextInt();
 		
	}	//end serIndex() method
	
	public static boolean isEmpty( ) {
    	if(num== 0)
        	return true;
       else
       		return false;
    	
	}	//end inEmpty() method
	
	public static boolean isFull( ) {
	   if(num== myList.length)
	        return true;
	   else
	        return false;
	   
	}	//end inFull() method
	
	public static void addFirst() {
		if (isEmpty( )) {
	       	 myList[0]=new Person(firstName,lastName,age,gender,email,accNum,phoneNum,accType);                                                                    
	       	 num++;
		 }
		else if(isFull( )) {                                    
	    	  System.out.println("List is full");
	     }
	     else {	
	    	 for(int i=num;i>0;i--) {
	    		 myList[i]=myList[i-1];
	    	 }
	    	 myList[0]=new Person(firstName,lastName,age,gender,email,accNum,phoneNum,accType);                                  
	  	     num++;
	     }     
		
	}	//end addFirst() method
	
	public static void addBtw() {
		if (isEmpty( )) {
	       	 myList[0]=new Person(firstName,lastName,age,gender,email,accNum,phoneNum,accType);                                                                                
	       	 num++;
		 } 
		 else if(isFull( )) {                                    
	    	  System.out.println("List is full");
	     }
	     else {	 
	    	 for(int i=num;i>index;i--) {
	    		 myList[i]=myList[i-1];
	    	 }
	    	 myList[index]=new Person(firstName,lastName,age,gender,email,accNum,phoneNum,accType);                                         
	  	     num++;
	     } 
		
	}	//end addBetween() method
	
	public static void addLast() {
		 if (isEmpty( )) {
	       	 myList[0]=new Person(firstName,lastName,age,gender,email,accNum,phoneNum,accType);                                                                              
	       	 num++;
		 }  	 
	     else if(isFull( )) {                                    
	    	  System.out.println("List is full");
	     }
	     else {	
	    	  myList[num]=new Person(firstName,lastName,age,gender,email,accNum,phoneNum,accType);                                  
	  	      num++;
	     }     
		 
	}	//end addLast() method

	public static void removeFirst(){           
		if (isEmpty( ))                                                             	
			System.out.println("List is empty");         	
		else
			for(int i=1;i<num;i++) {
				myList[i-1]=myList[i];
			}
		num--;  
		
	}	//end removeFirst() method
	
	public static void removeBtw() {
		if (isEmpty( ))                                                             	
			System.out.println("List is empty");         	
		else
			for(int i=index;i<num;i++) {
				myList[i]=myList[i+1];
			}
		num--;     
		
	}	//end remove between() method
	
	public static void removeLast(){           
		if (isEmpty( ))                                                             	
			System.out.println("List is empty");         	
		else
			num--;	 
		
	}	//end remove last() method
	
	public static void search(){
		  System.out.println("\nFirst Name\t = "+myList[index].getFirstName());
		  System.out.println("Last Name\t = "+myList[index].getLastName());
		  System.out.println("Age\t\t = "+myList[index].getAge());
		  System.out.println("Gender\t\t = "+myList[index].getGender());
		  System.out.println("Email\t\t = "+myList[index].getEmail());
		  System.out.println("Account Number\t = "+myList[index].getAccNum());
		  System.out.println("Phone Number\t = "+myList[index].getPhoneNum());
		  System.out.println("Account Type\t = "+myList[index].getAccType());
		  
	}	//end search customer() method
	
	public static void edit() {
		if (isEmpty( ))                                                             	
			System.out.println("List is empty");      
		else
			myList[index]=new Person(firstName,lastName,age,gender,email,accNum,phoneNum,accType);  
		
	}	//end edit customer() method

    public static void displayRecord(){
    if(num!=0) {	
    	for (int i= 0; i< num; i++){
    		System.out.println("\nNO : "+i);
    		System.out.println("First Name\t = "+myList[i].getFirstName());
    		System.out.println("Last Name\t = "+myList[i].getLastName());
    		System.out.println("Age\t\t = "+myList[i].getAge());
    		System.out.println("Gender\t\t = "+myList[i].getGender());
    		System.out.println("Email\t\t = "+myList[i].getEmail());
    		System.out.println("Account Number\t = "+myList[i].getAccNum());
    		System.out.println("Phone Number\t = "+myList[i].getPhoneNum());
    		System.out.println("Account Type\t = "+myList[i].getAccType());
    	}
    }
    else {
    	System.out.println("Empty list");
    	}
    
	}	//end display customer Record() method

}	//end class