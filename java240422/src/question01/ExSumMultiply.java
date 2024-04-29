package question01;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		System.out.println("3자리수 정수 입력(100~999)>>");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
//		100자리수, 나누기 100의 몫
		int hun = n/100;
//		int hun=n%100;
//		int ten=hun/10; 10자리수
//		int one=hun%10; 1자리수
		int ten = n%100/10;
		int one = n%100%10;
		
		int x = (hun+ten);
		int y = (ten*one);
		
		System.out.println("100의 자리와 10의 자리의 합은"+x);
		System.out.println("10의 자리와 1의 자리의 곱은"+y);
		sc.close();
	}
}
