package midheighhome;

import java.util.Scanner;

public class MutipleOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 10개를 입력하시오>>");
		
		int[] number = new int[10];
		int res = 0;
		
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
			res = number[i];
		}
		System.out.print("3의 배수는 ");
		for (int i = 0; i < number.length; i++) {
			if (number[i]%3==0) {
				res = number[i];
				System.out.print(res+" ");
			}
		}sc.close();
	}
}
//System.out.println("3의 배수는 "+res);
//1 5 99 22 345 154 2346 55 32 85