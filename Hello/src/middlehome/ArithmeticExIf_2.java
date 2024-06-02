package middlehome;

import java.util.Scanner;

public class ArithmeticExIf_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산>>");
		int num1 = sc.nextInt();
		String arith = sc.next();
		char op = arith.charAt(0);
		int num2 = sc.nextInt();
		int res = 0;
		boolean valid = true;
		
		if (op=='+') {
			res = num1+num2;
		}
		if (op=='-') {
			res = num1-num2;
		}
		if (op=='*') {
			res = num1*num2;
		}
		if (op=='/') {
			if (num1==0||num2==0) {
				System.out.println("0으로 나눌수 없습니다.");
				valid = false;
			}else {				
				res = num1/num2;
			}
		}else {
			System.out.println("유효하지 않은 연산자입니다.");
			valid = false;
		}if (valid) {
			System.out.println(num1+arith+num2+"의 계산 결과는 "+res);			
		}
		sc.close();
	}
}
