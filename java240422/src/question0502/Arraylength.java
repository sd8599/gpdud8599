package question0502;

import java.util.Scanner;

public class Arraylength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5개의 정수를 입력하세요>>");
		
		int[] number = new int[5];
		int avel = 0;
		
		for (int i = 0; i < number.length; i++) {
			 number[i] = sc.nextInt();
			avel += number[i];
		}
		System.out.println("평균은 "+(double)avel/5);
	}
}
