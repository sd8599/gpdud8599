package homework;

import java.util.Scanner;

/* Scanner 클래스를 이용하여 2개의 실수를 입력받고, 덧
셈,뺄셈,곱셈,나눗셈을 출력하는 프로그램을작성하라
 * 출력
 * 2개의실수입력>>5 2
 * 두수의덧셈은7.0
 * 두수의뺄셈은3.0
 * 두수의곱셈은10.0
 * 두수의나눗셈은2.5
 */
public class ExCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2개의 실수 입력>>");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double sum = a+b;
		double mi = a-b;
		double ab = a*b;
		double nanu = a/b;
		
		System.out.println("두수의 덧셈은 "+sum);
		System.out.println("두수의 뺄셈은 "+mi);
		System.out.println("두수의 곱셈은 "+ab);
		System.out.println("두수의 나눗셈은 "+nanu);
	}
}
