package chapter10_0520;

import java.util.Scanner;

public class PersonDriver2 {
	public static void main(String[] args) {
		String lname;
		String fname;
		Person person;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			
			System.out.print("성을 입력하세요 : ");
			lname = sc.next();
			System.out.print("이름을 입력하세요 : ");
			fname = sc.next();
			
			person = new Person();
			person.lastName = lname;
			person.firstName = fname;
			
			System.out.println("성 : "+person.getLastName()+" 이름 : "+person.getFirstName()
			+" 성명의 길이 : "+person.getLength());
		}
	}
}
