package question02;

import java.util.Scanner;

public class ComputeBalance {
	public static void main(String[] args) {
		
		int purchaseAmount;
		int balance;
		Scanner sc = new Scanner(System.in);
		System.out.print("구매 금액을 입력하세요 : ");
		
		purchaseAmount = sc.nextInt();
		
		if (purchaseAmount>=300000) {
			balance=purchaseAmount-30000;
		} else if(purchaseAmount>=100000) {
			balance=purchaseAmount-5000;
		} else {
			balance=purchaseAmount;
		} 
		System.out.println("구매금액 = "+purchaseAmount);
		System.out.println("청구금액 = "+balance);
		sc.close();
	}
}
//
//(1)
//
//
//변수들
//purchaseAmount: 구매금액
//balance: 청구금액
// (2)
//알고리즘
// 1.
// 2.
// 3.
// 4.
// 5.
//구매금액을입력받는다.
//구매금액이300000원 이상이면 청구금액 = 구매금액–30000
//구매금액이300000원 미만이고 100000원 이상이면 청구금액 = 구매금액–5000
//구매금액이100000원 미만이면 청구금액 = 구매금액
//구매금액과청구금액을출력한다.
// 구매금액을입력하세요: 300000
// 구매금액= 300000
// 청구금액= 270000
// 구매금액을입력하세요: 100000
// 구매금액= 100000
// 청구금액= 95000
// 구매금액을입력하세요: 90000
// 구매금액= 90000
// 청구금액= 90000