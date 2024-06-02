package homeworkhome;

import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("정수를 입력하시오>>");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			System.out.println("삼각형의 넓이는 "+(a*b)/2);
			System.out.print("정수를 입력하시오>>");
			 a = sc.nextDouble();
			 b = sc.nextDouble();
			 c = sc.nextDouble();
			System.out.println("사다리꼴의 넓이는 "+(a+b)*c/2);
			}
}
