package scanner;

import java.util.Scanner;

/*첫번째 숫자와 두번째 숫자를 더해서 출력하는 프로그램을 개발하자.
 * 첫번째 숫자와 두번째 숫자 모두 0을 입력하면 프로그램을 종료한다.
 *프로그램은 반복해서 실행된다.
 */
public class ScannerWhile2 {

			public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				
				while (true) {
					System.out.print("두개의 숫자를 입력하세요. >>");
					int a = sc.nextInt();
					int b = sc.nextInt();
					
					if (a==0&&b==0) {
						System.out.println("프로그램을 종료합니다.");
						break;
					}	System.out.println("두 수의 합은 : "+(a+b));
				}
				
			}
}
