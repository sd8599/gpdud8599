package homeworkhome;

import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 5개 입력하세요.");
		int sum = 0;
		int num = 0;
		
		for (int i = 0; i < 5; i++) {
			num = sc.nextInt();
			if (num<=0) {
				continue;
			} else {
				sum+=num;
			}
		}
		System.out.println("양수의 합은 "+sum);
	}
}
