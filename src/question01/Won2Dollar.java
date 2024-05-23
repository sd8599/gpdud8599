package question01;

import java.util.Scanner;

public class Won2Dollar {
	public static void main(String[] args) {
		
//		int rate = 1100;
//		final int RATE = 1100; //상수(전체대문자)/환율고정할때 상수사용
		final double RATE = 1100; //상수(전체대문자)/환율고정할때 상수사용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>> ");
		
		int won = sc.nextInt();
//		int dollar = won/RATE;
		double dollar = won/RATE;
		System.out.println(won+"원은 $"+dollar+"입니다.");
		sc.close();
	}
}

