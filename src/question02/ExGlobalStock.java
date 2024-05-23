package question02;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		
		int a; //매수
		int b; //매도
		double c; //양도세
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("매수금액을 입력하세요 : ");
		a = sc.nextInt();
		System.out.print("매도금액을 입력하세요 : ");
		b = sc.nextInt();
		c = (b-a)*0.22; 
		
		if (a<b) {
			System.out.println("양도세 = "+c);
		}else if(a>b) {
			System.out.println("양도세 = "+0.0);
			sc.close();
		} 
	}
}

//1. 매수금액, 매도금액을입력받는다.
// 2. 매도금액이매수금액보다크면
//양도세=(매도금액-매수금액)*22%
// 3. 매도금액이매수금액보다같거나작으면
//양도세=0
// 4. 양도세를출력한다.
// *.출력
// 매수금액을입력하세요: 100000
// 매도금액을입력하세요: 150000
// 양도세= 11000.0
// 매수금액을입력하세요: 90000
// 매도금액을입력하세요: 80000
// 양도세= 0.0

