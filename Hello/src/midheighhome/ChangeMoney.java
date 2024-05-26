package midheighhome;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money = sc.nextInt();
		int res = 0;
		
		for (int i = 0; i < unit.length; i++) {
			if (money>=unit[i]) {
				res = money/unit[i];
				if (money % unit[i] != 0) {					
					money %= unit[i];
				}
			}
			System.out.println(unit[i]+"원 짜리 : "+res+"개");
		}
		sc.close();
	}
}

//금액을 입력하시오>>65123
//50000원 짜리 : 1개
//10000원 짜리 : 1개
//1000원 짜리 : 5개
//500원 짜리 : 5개
//100원 짜리 : 1개
//50원 짜리 : 1개
//10원 짜리 : 2개
//1원 짜리 : 3개
