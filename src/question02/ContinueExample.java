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
//중급B 5 : continue 문을 이용하여 양수 합 구하기(ContinueExample)
//1
//5개의 정수를입력받고그중양수들만합하여출력하는프로그램을작성하라.
//정수를5개입력하세요.
//5-2
//6
//10-4
//양수의합은21