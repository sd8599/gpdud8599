package question01;

import java.util.Scanner;

public class SeasonExlf {
	public static void main(String[] args) {
		
		System.out.print("달을 입력하세요(1월~12월)>> ");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (3<=a && a<=5) {
			System.out.println("봄");
		}else if(6<=a && a<=8) {
			System.out.println("여름");
		}else if(9<=a && a<=11) {
			System.out.println("가을");
		}else if(12==a || a==2 || a==1) {
			System.out.println("겨울");
		}else {
			System.out.println("잘못입력");
		}
		sc.close();
	}
}
