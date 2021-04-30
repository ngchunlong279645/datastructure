package program;

public class Person {
	private String name;
	private int age;
	private char gender;
	
	public Person(String newName, int newAge, char newGender){
		name = newName;
		age = newAge;
		gender = newGender;
	}
	public String getName(){
		return name;
	} 
	
	public int getAge()
	{
		return age;
	}
	
	public char getGender()
	{
		return gender;
	}


}
