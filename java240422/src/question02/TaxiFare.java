package question02;

import java.util.Scanner;

public class TaxiFare {
	public static void main(String[] args) {
		
		int fare;
		int income=0;
		
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < 10; i++) {
			System.out.print("요금을 입력하세요 : ");
			fare = sc.nextInt();
			income += fare;
		}
		
		System.out.println("총 수입 : "+income);
		sc.close();
	}
}

//		int fare = sc.nextInt();
//		int income = 0;
//		
////		for (int i = 1; i <=10; i++) {
////			income+=fare*i;
////		System.out.println("요금을 입력하세요 : "+fare*i);	
////		
////		}

//*.main 메소드 설계
// 변수들
// fare: 요금
// income: 총 수입
// 알고리즘
// (1) income = 0
// (2) 다음을 10번 반복한다:
//
//
//
//2.1 "요금을 입력하세요: "를 출력한다
//2.2 fare = 읽어 들인 요금
//2.3 income = income + fare
// (3) 총 수입을 출력한다.
//요금을입력하세요: 1000
//요금을입력하세요: 2000
//요금을입력하세요: 3000
//요금을입력하세요: 4000
//요금을입력하세요: 5000
//요금을입력하세요: 6000
//요금을입력하세요: 7000
//요금을입력하세요: 8000
//요금을입력하세요: 9000
//요금을입력하세요: 10000
//총수입: 55000
//




