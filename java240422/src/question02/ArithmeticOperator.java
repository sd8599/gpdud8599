package question02;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int d;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		a = sc.nextInt();
		b = a/3600;
		c = a%3600/60;
		d = a%3600%60;
		
		System.out.println(a+" 초는 "+b+"시간, "+c+"분, "+d+"초 입니다.");
		sc.close();
	}
}
