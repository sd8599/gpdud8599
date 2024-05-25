package middlehome;

import java.util.Scanner;

public class ChangeMoney1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money = sc.nextInt();
		
		int[] units = {50000,10000,1000,500,100,10,1};
		String[] unitsName = {"오만원권","만원권","천원권","오백원권","백원권","십원권","일원권"};
		
		for (int i = 0; i < unitsName.length; i++) {
			if (money > units[i]) {
				int count = money/units[i];
				money = money%units[i];
				System.out.println(unitsName[i]+" "+count+"매 입니다.");
			}
		}
		sc.close();
	}
}
