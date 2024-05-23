package chapter10_0520;

public class Person {
	public String lastName;
	public String firstName;//alt shfit s getters
	
	public int getLength() {
		return lastName.length()+firstName.length();
	} 
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	
}
