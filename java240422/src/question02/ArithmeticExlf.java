package question02;

import java.util.Scanner;

public class ArithmeticExlf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산>>>");
		
		int op1 = sc.nextInt();
		String op = sc.next();
		int op2 = sc.nextInt();
		int res=0;
		
		if (op.equals("+")) {
			res = op1+op2;
			}else if (op.equals("-")) {
			res = op1-op2;
			}else if (op.equals("*")) {
			res = op1*op2;
			}else if (op.equals("/")) {
			if (op2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				sc.close();
				return;
			}else {
					res= op1/op2;
				}
			}else {
				System.out.println("사칙연산이 아닙니다.");
				sc.close();
				return;
			}
			System.out.println(op1+op+op2+"의 계산 결과는 "+res);
			sc.close();
	}
}


//		if (op.equals("+")) {
//			res = op1+op2;