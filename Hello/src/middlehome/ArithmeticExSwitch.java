package middlehome;

import java.util.Scanner;

import loop.ScannerWhile;

public class ArithmeticExSwitch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연산>>");
		int num1 = sc.nextInt();
		String metic = sc.next();
		int num2 = sc.nextInt();
		int res = 0;
		
		switch (metic) {
		case "+":
			res = num1+num2;
			break;
		case "-":
			res = num1-num2;
			break;
		case "*":
			res = num1*num2;
			break;
		case "/":
			if (num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}else {
				res = num1/num2;
			}	break;				
		default:
			System.out.println("사칙연산이 아닙니다.");
			break;
		}
		System.out.println(num1+metic+num2+"의 계산 결과는"+res);
	}
}
