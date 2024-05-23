package middlehome;

import java.util.Scanner;

public class ArithmeticExIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산>>");
		int a = sc.nextInt();
		String b = sc.next();
		int c = sc.nextInt();
		
		if (b.equals("+")) {
			System.out.println(a+b+c+"의 계산 결과는 "+(a+c));
		}else if (b.equals("-")) {
			System.out.println(a+b+c+"의 계산 결과는 "+(a-c));			
		}else if (b.equals("*")) {
			System.out.println(a+b+c+"의 계산 결과는 "+(a*c));			
		}else if (b.equals("/")) {
			if (c==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
			System.out.println(a+b+c+"의 계산 결과는 "+(a/c));			
		}
	}
}
