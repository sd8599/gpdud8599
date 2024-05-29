package heighhome;

import java.util.Scanner;

public class PersonDriver {
	public static void main(String[] args) {
		Person person1, person2 ;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성을 입력하세요.");
		String lname = sc.next();
		System.out.print("이름을 입력하세요.");
		String fname = sc.next();
		
		 person1 = new Person();
		 person1.lastName = lname;
		 person1.firstName = fname;
		 
		 System.out.println("성 : "+person1.lastName
				 				  +" 이름 : "+person1.firstName
				 				  +" 성명의 길이 : "+person1.getLength());
	
		System.out.print("성을 입력하세요.");
		 lname = sc.next();
		System.out.print("이름을 입력하세요.");
		 fname = sc.next();
		
		person2 = new Person();
		person2.lastName = lname;
		person2.firstName = fname;
		
		System.out.println("성 : "+person2.lastName
				+" 이름 : "+person2.firstName
				+" 성명의 길이 : "+person2.getLength());
	}
}
