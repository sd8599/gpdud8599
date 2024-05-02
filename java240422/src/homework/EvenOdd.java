package homework;
/*
 * 입력받은 정수가 홀수인지 짝수인지 
 * 정수를 입력하시오 : 2
 * 입력된 정수는 짝수입니다.
 */
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		number = sc.nextInt();
		
		if (number%2==0) {
			System.out.println("입력된 정수는 짝수입니다.");
		} else {
			System.out.println("입력된 정수는 홀수입니다.");
		}sc.close();
	}
}
