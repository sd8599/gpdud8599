package question01;

import java.util.Scanner;

public class ExExchange {
	public static void main(String[] args) {
		
		final double RATE = 1200.0;
		final double EUT = 1500.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>> ");
		
		int won = sc.nextInt();
		
		double dollar = won/RATE;
		System.out.println(won+"원 $"+dollar+"입니다.");
		
		double eut = won/EUT;
				System.out.println(won+"원 E"+eut+"입니다.");
		
		sc.close();
	}
}
