package program;

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
	

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 PersonList people = new PersonList(size);
		 
		 do {
			 System.out.println("-------------------------------------WELCOME TO YYDS BANK-------------------------------------\n");
			 System.out.println("1-ADDFIRST,2-ADDBTW,3-ADDLAST,4-REMOVEFIRST,5-REMOVEBTW,6-REMOVELAST,7-EDIT,8-SEARCH,9-DISPLAY");
			 System.out.print("\nSelect option : ");
			 int option = scan.nextInt();
			 if(option==1) {
				    setInfo();
			 		people.addFirst(firstName,lastName,age,gender,email,accNum,phoneNum,accType); 
			 }
			 else if(option==2) {
				 	setIndex();
				    setInfo();
		 			people.addBtw(index,firstName,lastName,age,gender,email,accNum,phoneNum,accType);
			 }
			 else if(option==3) {
				 	setInfo();
			 		people.addLast(firstName,lastName,age,gender,email,accNum,phoneNum,accType);
			 }
			 else if(option==4) {
				 	people.removeFirst();
			 }
			 else if(option==5) {
				 	setIndex();
				 	people.removeBtw(index);
			 }
			 else if(option==6) {
				 	people.removeLast();
			 }
			 else if(option==7) {
				 	setIndex();
			 		setInfo();
			 		people.edit(index,firstName,lastName,age,gender,email,accNum,phoneNum,accType);
			 }
			 else if(option==8) {
				 	setIndex();
			 		people.search(index);
			 }
			 else if(option==9) {
				 	people.displayRecord();
			 }
			 System.out.println("DO U WAN CONTINUE (y-yes n-no)");
			 choice = scan.next().charAt(0);
		 }while(choice=='y');
	}
	
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
	}
	
	public static void setIndex() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter index :");
 		index=scan.nextInt();
	}
	
}
