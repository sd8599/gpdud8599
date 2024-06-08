package middleprocess;

import java.util.Scanner;

public class PrintAsterisk {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int number = sc.nextInt();
		
		for (int i = number; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}System.out.println();
		
			sc.close();
		}
	}
}
