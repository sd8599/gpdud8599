package question02;

import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		
		int n, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("정수를 5개 입력하세요.");
		 
		 for (int i = 0; i <5 ; i++) {
			 n = sc.nextInt();
		 if (n<=0) {
			 //증감쪽으로 이동
//			sum += n;
			continue;
		} else {
			sum += n;
			}
		 }
		 System.out.println("양수의 합은 "+sum);
		 sc.close(); 
	}
}
