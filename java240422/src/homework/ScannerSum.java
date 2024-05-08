package homework;

import java.util.Scanner;

public class ScannerSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		while(true) {
			System.out.print("숫자 입력 : ");
			num1 = sc.nextInt();
			System.out.print("숫자 입력 : ");
			num2 = sc.nextInt();
				
			if (num2>num1) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
				for (int i = num1; i < num2; i++) {
					int sum;
				}
			}
			
			break;
		}
		System.out.println("결과 : ");
		System.out.println("합계 : ");
	}
	
	
}
/*2개의 정숫값을 읽어서 두 정수 사이에 있는 모든 정숫값을 작은 것부터 큰 순으로 표시하고
 * 두 숫자를 포함한 숫자들의 총합을 구하는 프로그램을 작성하시오.
 * Scanner클래스를 이용하여 숫자 두 개를 입력받아 처리한다.
 * 예를 들어, "5" "16"을 입력하면 5부터 16까지 출력되고, "20" "2"를 입력하면
 * 2부터 20까지 순으로 출력되도록 한다. 입력하는 두 숫자의 범위에 대한 합계를 출력한다.
 */
