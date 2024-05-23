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

//
//사칙연산을입력받아계산하는프로그램을작성하고자한다. 
//연산자는+,-,*,/ 의 네가지로 하고 피연산자는 모두정수로
//한다.
// 피연산자와연산자는실행사례와같이빈칸으로분리하여
//입력한다.
// 0으로나누기시“0으로나눌수없습니다.” 를출력하고종료
//한다.
// *.출력
// 연산>>2 + 4
// 2+4의 계산결과는6
// if-else 문을 이용하여 프로그램을 작성하라






