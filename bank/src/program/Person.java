package program;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private char gender;
	private String email;
	private int accNum;
	private int phoneNum;
	private String accType;
	
	public Person(String newFirstName, String newLastName, int newAge, char newGender, String newEmail, int newAccNum, int newPhoneNum, String newAccType){
		firstName = newFirstName;
		lastName = newLastName;
		age = newAge;
		gender = newGender;
		email = newEmail;
		accNum = newAccNum;
		phoneNum = newPhoneNum;
		accType = newAccType;
	}
	
	public String getFirstName(){
		return firstName;
	} 
	
	public String getLastName() {
		return lastName;
	}

	public int getAge(){
		return age;
	}
	
	public char getGender(){
		return gender;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getAccNum() {
		return accNum;
	}
	
	public int getPhoneNum() {
		return phoneNum;
	}
	
	public String getAccType() {
		return accType;
	}

}
