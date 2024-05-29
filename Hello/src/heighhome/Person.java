package heighhome;

public class Person {
	public String lastName;
	public String firstName;
	
//	public Person(String lastName, String firstName) {
////		super();
//		this.lastName = lastName;
//		this.firstName = firstName;
//	}
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public int getLength() {
		return getLastName().length()+getFirstName().length();
	}
}
