package middlehome;

import java.util.Scanner;

public class ComputeBalance_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			
		System.out.print("구매 금액을 입력하세요>>");
		int purchaseAmount = sc.nextInt(); //구매금액
		int balance = 0; //청구금액
		
		if (purchaseAmount>=300000) {
			balance = purchaseAmount - 30000;
		}else if (100000<=purchaseAmount&&purchaseAmount<300000) {
			balance = purchaseAmount - 5000;			
		}else {
			balance = purchaseAmount;
		}
		System.out.println("구매 금액 = "+ purchaseAmount);
		System.out.println("청구 금액 = "+ balance);
			}
		sc.close();
		}
	}
