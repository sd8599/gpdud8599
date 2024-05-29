package heighhome;

import java.util.Scanner;

public class PersonDriver1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Person person;
		String lname = "";
		String fname = "";
		
		while (true) {
			System.out.print("성을 입력하세요.(0을 누르면 종료)");
			 lname = sc.next();
			 if (lname.equals("0")) {
				 System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("이름을 입력하세요.");
			 fname = sc.next();
			 
			 person = new Person();
			 person.lastName = lname;
			 person.firstName = fname;
			 
			 System.out.println("성 : "+person.lastName
	 				  +" 이름 : "+person.firstName
	 				  +" 성명의 길이 : "+person.getLength());
		}
	}
}
