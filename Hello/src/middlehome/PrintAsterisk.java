package middlehome;

import java.util.Scanner;

public class PrintAsterisk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int star = sc.nextInt();
		
		for (int i = 0; i < star; i++) {
			for (int j = star; j > i; j--) {				
				System.out.print("*");
			}System.out.println();
		}
	}//잘기억하기**
}
