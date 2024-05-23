package middlehome;

import java.util.Scanner;

public class ComputeBalance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < 10; i++) {

		System.out.print("구매금액을 입력하세요(0을 누르면 종료) : ");
		int purchaseAmount = sc.nextInt(); //구매금액
		int balance = 0; //청구금액
			
			if (purchaseAmount==0) {
				System.out.println("시스템을 종료합니다.");
				break;
			}else if (purchaseAmount>=300000) {
				balance = purchaseAmount-30000;
			}else if(100000<=purchaseAmount&&purchaseAmount<300000){
				balance = purchaseAmount-5000;				
			}else if (purchaseAmount<100000) {
				balance = purchaseAmount;
			}
			System.out.println("구매금액 = "+purchaseAmount);
			System.out.println("청구금액 = "+balance);			
		}
	}
}
