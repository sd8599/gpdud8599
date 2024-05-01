package question02;

import java.util.Scanner;

public class ArithmeticExSwitch {
	public static void main(String[] args) {
		
		System.out.print("연산>>");
		Scanner sc = new Scanner(System.in);
		
		int op1 = sc.nextInt();
		String op = sc.next();
		int op2 = sc.nextInt();
		int res = 0;
		
			switch (op) {
		case "+": res=op1+op2; break;
		case "-": res=op1-op2; break;
		case "*": res=op1*op2; break;
		case "/": 
			if(op2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}else{
				res=op1/op2; 	
				}break;
		default:	
			System.out.println("사칙연산이 아닙니다.");
//			break;
		}
			System.out.println(op1+op+op2+"의 계산 결과는 "+res);
			sc.close();
		
	}
}
