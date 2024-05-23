package homework;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("3자리수 정수 입력(100~999)>>");
		int number = sc.nextInt();
		
		int hun = number/100;
		int ten = number%100/10;
		int one = number%100%10;
		
		System.out.println("100의 자리와 10의 자리의 합은 "+(hun+ten));
		System.out.println("10의 자리와 1의 자리의 곱은 "+(ten*one));
	}
}
