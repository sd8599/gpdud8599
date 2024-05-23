package Java0508;

import java.util.Scanner;

public class MutipleOfThree {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시오 >> ");
		
		int number[] = new int[10];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		
		System.out.print("3의 배수는 ");
		
			for (int i = 0; i < number.length; i++) {
			if (number[i]%3==0) {
				System.out.print(number[i]+" ");
			}
		}
	}
}
//