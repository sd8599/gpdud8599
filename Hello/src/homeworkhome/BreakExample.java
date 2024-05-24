package homeworkhome;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료합니다.");
		String n = "exit";
		
		while (true) {
			System.out.print(">>");
			String m = sc.next();
			if (m.equals(n)) {
				System.out.println("입력을 종료합니다.");
				break;
			}
		}sc.close();
	}
}
