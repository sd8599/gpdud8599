package arrays;

import java.util.Scanner;

/*배열의 입력과 출력
 * 사용자에게 5개의 정수를 입력받아서 배열에 저장하고
 * 입력 순서대로 출력하자. 출력시 출력 포맷은 1,2,3,4,5와
 * 같이 , 쉼표를 구분하고, 마지막에는 쉼표를 넣지 않아야 한다.
 */
public class ArrayEx2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];
		
		System.out.print("5개의 정수를 입력하세요 : ");
		
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
			System.out.print("출력 : ");
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]);
			if (i<number.length-1) {
				System.out.print(", ");
			}
		}
	}
}
