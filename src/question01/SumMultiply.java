package question01;

import java.util.Scanner;

public class SumMultiply {
	public static void main(String[] args) {
			
			System.out.print("2개의 정수 입력 >>");
			
			Scanner sc  = new Scanner(System.in);
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("두 수의 합은 "+ (a+b));
			System.out.println("두 수의 곱은 "+ (a*b));
			
			sc.close(); //닫아주기
	}
}
