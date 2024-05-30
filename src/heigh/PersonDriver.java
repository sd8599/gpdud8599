package heigh;

import java.util.Scanner;

public class PersonDriver {
	String fname;
	String lname;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성을 입력하세요.");
		String lname = sc.next();
		System.out.println("이름을 입력하세요.");
		String fname = sc.next();
	
		
		Person person1 = new Person(lname, fname);
		lname = person1.getLastName();
		fname = person1.getFirstName();
		
		System.out.println("성 : "+lname+" 이름 : "+fname
											  +" 이름의 길이 : "+person1.getLength());
		
		sc.close();
	}
}
