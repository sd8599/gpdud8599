package heigh;

public class Person {
	private String lastName;
	private String firstName;
	
	public Person(String lastName, String firstName) {
//		super();
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getLength() {
		return lastName.length()+firstName.length();
	}
}
