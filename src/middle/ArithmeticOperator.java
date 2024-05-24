package middle;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int operator = sc.nextInt();
		
		int hour = operator/3600;
		int min = operator%3600/60;
		int sec = operator%3600%60;
		
		System.out.println(operator+"초는 "+hour+"시간, "+min+"분, "+sec+"초입니다.");
	}
}
