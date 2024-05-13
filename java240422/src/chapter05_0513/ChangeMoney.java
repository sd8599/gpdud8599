package chapter05_0513;

import java.util.Scanner;

//배열과 반복문
public class ChangeMoney {
	public static void main(String[] args) {
		
		int[] unit = {50000,10000,1000,500,100,50,10,1};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money = sc.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			int res = money/unit[i]; //몫
			
			if (res > 0) {
				System.out.println(unit[i]+"원 짜리 : "+res+"개");
				money = money%unit[i];
			}
		}
		sc.close();
	}
}
