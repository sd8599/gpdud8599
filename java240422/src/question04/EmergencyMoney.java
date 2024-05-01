package question04;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가구수를 입력하시오>>");
		
		int person = sc.nextInt();
		int money = 0;
		int rate = 1200;
		
		if (person==1) {
			money = 400000;
		}else if (person==2) {
			money = 600000;
		}else if (person==3) {
			money = 800000;
		}else if(person>=4) {
			money = 1000000;
		}
		System.out.println("100달러짜리"+money/rate/100+"매");
		if (money/rate%100/10>0) {
		System.out.println("10달러짜리"+money/rate%100/10+"매");}
	}
}
