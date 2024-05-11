package arrays;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

/*가장 작은 수, 큰 수 찾기
 * 사용자로 부터 n개의 정수를 입력받아 배열에 저장한 후,
 * 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로그램을 작성하세요
 */
public class ArrayEx6 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("입력 받을 숫자의 갯수를 입력하세요 >>");
			int count = sc.nextInt();
			int[] numbers = new int[count];
			
			System.out.print(count+"개의 정수를 입력하세요>>");
			for (int i = 0; i < count; i++) {				
				numbers[i] = sc.nextInt();
			}
				int max = numbers[0];
				int min = numbers[0];
				
			for (int i = 1; i < count; i++) {
				if (numbers[i]<min) {
					min = numbers[i];
				}
				if (numbers[i]>max) {
					max = numbers[i];
				}
			}
			System.out.println("가장 작은 정수 : "+min);
			System.out.println("가장 큰 정수 : "+max);
		}
}
