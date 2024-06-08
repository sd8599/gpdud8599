package middlehome;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int op = sc.nextInt();
		int hour = 0;
		int mintue = 0;
		int sec = 0;
		
		if (op>0) {
			hour = op/3600;
		}
		if (op>0) {
			mintue = op%3600/60;
		}
		if (op>0) {
			sec = op%3600%60%60;
		}
		System.out.println(op+"초는 "+hour+"시간, "+mintue+"분, "+sec+"초 입니다.");
		sc.close();
	}
}
