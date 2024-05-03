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

//초단위의정수를입력받고, 몇시간, 몇분, 몇초인지출력하는프로그
//램을작성하라.
//정수를입력하세요:5000
// 5000초는 1시간, 23분, 20초입니다