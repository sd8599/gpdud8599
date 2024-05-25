package middlehome;

import java.util.Scanner;

public class ArrayTen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[10];
		int sum = 0;
		
		System.out.print("10개의 정수를 입력하세요.");
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
			System.out.print("["+number[i]+"] ");		
		}
		
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
		}System.out.println("의합계는 \""+sum+"\"");
	}
}
//10개의 정수를 입력하세요.1 2 3 4 5 6 7 8 9 10
//[1] [2] [3] [4] [5] [6] [7] [8] [9] [10] 의합계는 "55"
