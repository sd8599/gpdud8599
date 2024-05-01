package chapter03;

import java.util.Scanner;

/*
 * 정수를 입력 받음
 * 입력받은 갯수와 평균 출력
 * 마지막에-1을 입력중단
 */
public class WhileExample {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//n이 -1이 아닐 때까지 반복
		while (n != -1) {
//			sum = sum+n; 둘다 가능
			sum += n;
			
			//입력 받은 갯수를 증가
			count++;
			n = sc.nextInt();
		}
		//시작하자말자 -1입력
		if (count == 0) {
			System.out.println("입력된 수가 없습니다.");
		} else {
			System.out.println("정수의 갯수는 "+count+"개 이며 ");
			System.out.println("평균은 "+(double)sum/count+" 입니다.");
		}
		sc.close();
	}
}
