package scanner;

import java.util.Scanner;

//a*a*a*a*a*a*
//a*a*a*a*a*
//a*a*a*a*
//a*a*a*
//a*a*
//a*
public class ScannerExaaa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int rows = sc.nextInt();
		
		for (int i = rows; i >=1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print("a*");
			}System.out.println();
		}
	}
}
