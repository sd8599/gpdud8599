package middlehome;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("매수 수량을 입력하시오>>");
		int  quantity = sc.nextInt();
		int tesla = 520;
		int dollar1 = (tesla*quantity)/100;
		int dollar2 = (tesla*quantity)%100/10;
		
		System.out.println("100달러짜리 "+dollar1+"매");
		if (dollar2!=0) {
			System.out.println("10달러짜리 "+dollar2+"매");
		}
		sc.close();
	}
}
