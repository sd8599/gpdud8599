package middlehome;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가구수를 입력하시오>>");
		int person = sc.nextInt();
		int money = 0;
		
		if (person==1) {
			money = 400000;
		} else if(person == 2){
			money = 600000;
		}else if(person == 3){
			money = 800000;
		}else if(person >= 4){
			money = 1000000;
		}
		
		int dollar1 = money/1200/100;
		int dollar2 = money/1200%100/10;
		
		System.out.println("100달러짜리 "+dollar1+"매");
		if (dollar2!=0) {
			System.out.println("10달러짜리 "+dollar2+"매");			
		}
	}
}

