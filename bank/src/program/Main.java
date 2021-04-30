package program;

import java.util.Scanner;

public class Main {
	
	 static String name=null;
     static int age;
	 static char gender;
	 static int index;
	 static int size=100;
	 static char choice;
	

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 PersonList people = new PersonList(size);
		 
		 do {
			 System.out.println("1-ADDFIRST,2-ADDBTW,3-ADDLAST,4-REMOVEFIRST,5-REMOVEBTW,6-REMOVELAST,7-EDIT,8-SEARCH,9-DISPLAY");
			 System.out.println("Select option : ");
			 int option = scan.nextInt();
			 if(option==1) {
				    setInfo();
			 		people.addFirst(name, age, gender); 
			 }
			 else if(option==2) {
				 	setIndex();
				    setInfo();
		 			people.addBtw(index, name, age, gender);
			 }
			 else if(option==3) {
				 	setInfo();
			 		people.addLast(name, age, gender);
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
			 		people.edit(index, name, age, gender);
			 }
			 else if(option==8) {
				 	setIndex();
			 		people.search(index);
			 }
			 else if(option==9) {
				 	people.displayRecord();
			 }
			 System.out.println("DO U WAN CONTINUE y-yes n-no");
			 choice = scan.next().charAt(0);
		 }while(choice=='y');
	}
	
	public static void setInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter name = ");
 		name = scan.next();
 		System.out.print("Enter age = ");
 		age = scan.nextInt();
 		System.out.print("Enter gender = ");
 		gender = scan.next().charAt(0);
	}
	
	public static void setIndex() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter index :");
 		index=scan.nextInt();
	}
}