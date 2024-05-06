package scanner;

import java.util.Scanner;

/*사용자로부터 두 개의 정수를 입력 받고, 더 큰 수를 출력하는 
 * 프로그램을 작성해보자. 두 숫자가 같은 경우 두 숫자는 
 * 같다고 출력하면 된다. 조건문을 사용해서 처리할 수 있다.
 */
public class Scanner3 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("첫번째 숫자를 입력하세요");
			int a = sc.nextInt();

			System.out.println("두번째 숫자를 입력하세요");
			int b = sc.nextInt();
			
			if (a>b) {
				System.out.println("더 큰 수는 "+a+"입니다.");
			}else if(a<b){
				System.out.println("더 큰 수는 "+b+"입니다.");
			}else {
					System.out.println("두 수는 같다.");
				}
			sc.close();
		}
}
