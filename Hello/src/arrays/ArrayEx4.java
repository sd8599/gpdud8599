package arrays;

import java.util.Scanner;

/*합계와 평균
 * 사용자에게 5개의 정수를 입력받아서 이들 정수의
 * 합계와 평균을 계산하는 프로그램을 작성하자
 */
public class ArrayEx4 {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] number = new int[5];
		
		System.out.print("5개의 정수를 입력하세요 >> ");
		
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
			sum += number[i];
	}
		double average = (double) sum/5.0;
		System.out.println("입력한 정수의 합계 : "+sum);
		System.out.println("입력한 정수의 평균 : "+average);
		
	}
	}

