package homeworkhome;

import java.util.Scanner;

public class Won2Dollar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		int money = sc.nextInt();
		double kor = 1100;
		
		System.out.println(money+"원은 "+"$"+(money/kor)+"입니다.");
		
	}
}
