package question04;

import java.util.Scanner;

public class EmergencyMoney02 {
	public static void main(String[] args) {
		
	
	//상수로 100달러 원화 계산
	final int hundred = 120000;
	final int ten = 12000;
	int res, money, num;
	
	Scanner sc = new Scanner(System.in);
	System.out.print("가구수를 입력하세요.");
	num = sc.nextInt();
	
	if (num==1) {
		money = 400000;
	} else if(num==2) {
		money = 600000;
	}
	 else if(num==3) {
		money = 800000;
	}else {		
		money = 1000000;
		}
	res = money/hundred;
	if (res>0) {
		money = money%hundred;
		System.out.println("100달러짜리"+res+"매");}
		if (res>0) {
			res = money/ten;
			System.out.println("10달러짜리"+res+"매");
	}
	}
}
