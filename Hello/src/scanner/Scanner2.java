package scanner;

import java.util.Scanner;

/*Scanner를 활용하는 간단한 예제를 만들어보자.
 * 두 수를 입력받고 그합을 출력하는 예제이다.
 */
public class Scanner2 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			 System.out.println("첫 번째 숫자를 입력하세요 : ");
			 int a = sc.nextInt();
			 
			 System.out.println("두번째 숫자를 입력하세요 : ");
			 int b = sc.nextInt();
			 
			System.out.println("두 수의 합은 => "+(a+b));
			
			sc.close();
		}
}
