package scanner;

import java.util.Scanner;

/*사이 숫자
 * 사용자로부터 두 개의 정수를 입력받고, 이 두 정수 사이의 모든 정수를 출력하는 프로그램을 작성하세요.
 * 사용자에게 첫 번째 숫자를 입력받으세요. 변수의 이름은 num1이어야 합니다.
 * 사용자에게 두번째 숫자를 입력받으세요. 변수의 이름은 num2이어야 합니다.
 * 만약 첫 번째 숫자 num1이 두 번째 숫자 num2보다 크다면, 두 숫자를 교환하세요
 * 참고 : 교환을 위해 임시 변수 사용을 고려하세요.
 * num1부터 num2까지의 각 숫자를 출력하세요.
 * 출력 결과에 유의하세요. 다음 예시와 같이 2,3,4,5처럼 ,로 구분해서 출력해야합니다.
 */
public class NumberEx1 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("두 수의 사이 값을 출력합니다!");
			
			System.out.print("첫번째 숫자를 입력하세요 : ");
			int num1 = sc.nextInt();

			System.out.print("두번째 숫자를 입력하세요 : ");
			int num2 = sc.nextInt();
			
			if (num1>num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			System.out.print("두 숫자 사이의 모든 정수 : ");
			for (int i = num1; i <= num2; i++) {
				System.out.print(i);
				if (i !=num2) {
					System.out.print(", ");					
				}
			}
		}
}


