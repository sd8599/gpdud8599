package homeworkhome;

import java.util.Scanner;

public class ExExchange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		int money = sc.nextInt();
		double dollar = 1200;
		double eue = 1500;
		
		System.out.println(money+"원은 $"+(money/dollar)+"입니다.");
		System.out.println(money+"원은 E"+(money/eue)+"입니다.");
		
		sc.close();
	}
}
