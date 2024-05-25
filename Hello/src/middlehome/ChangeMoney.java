package middlehome;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money = sc.nextInt();
		int res = 0;
		
		if (money!=0) {
			res =	money/50000;
			System.out.println("오만원권 "+res+" 매");
		}if (money%50000!=0) {
			res = money%50000/10000;
			System.out.println("만원권 "+res+" 매");
		}if (money%50000%10000/1000!=0) {
			res = money%50000%10000/1000;
			System.out.println("천원권 "+res+" 매");
		}sc.close();
	}
}
