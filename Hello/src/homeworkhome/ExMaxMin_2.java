package homeworkhome;

import java.util.Scanner;

public class ExMaxMin_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int max = num1;
		int min = num1;
		
		if (num2<min) {
			min = num2;
		}
		if (num3<min) {
			min = num3;
		}
		if (num2>max) {
			max = num2;
		}
		if (num3>max) {
			max = num3;
		}
		
		
		System.out.println("최대값은 "+max);
		System.out.println("최소값은 "+min);
	}
}
