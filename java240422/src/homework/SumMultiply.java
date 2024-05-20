package homework;

import java.util.Scanner;
/* Scanner 클래스를 이용하여 2개의 정수를 입력받고, 합
계와곱셈을출력하는프로그램을작성하라.
 * 출력
 * 2개의정수입력>>5 8
 * 두수의합은13
 * 두수의곱은40
 */
public class SumMultiply {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2개의 정수 입력>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a+b;
		int average = a*b;
		
		System.out.println("두수의 합은 "+sum);
		System.out.println("두수의 곱은 "+average);
	}
}
