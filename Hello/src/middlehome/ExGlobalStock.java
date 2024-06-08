package middlehome;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("매수 금액을 입력하세요 : ");
		int buy = sc.nextInt();
		System.out.print("매도 금액을 입력하세요 : ");
		int sell = sc.nextInt();
		double tax = 0;
		
		if (sell<=buy) {
			tax = 0;
		}else {
			tax = (sell-buy)*0.22;
		}
		System.out.println("양도세 = "+tax);
		sc.close();
	}
}
