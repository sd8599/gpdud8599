package homeworkhome;

import java.util.Scanner;

public class SumMultiply {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2개의 정수 입력>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("두 수의 합은 "+(x+y));
		System.out.println("두 수의 곱은 "+(x*y));
		
		sc.close();
	}
}
