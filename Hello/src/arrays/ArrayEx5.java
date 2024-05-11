package arrays;

import java.util.Scanner;

/*합계와 평균2
 * 정수를 입력하고 합계와 평균을 구하세요
 * 예시) 입력받을 숫자의 갯수를 입력하세요 : 3
 * 3개의 정수를 입력하세요
 * 입력한 정수의 합계 : 
 * 입력한 정수의 평균 : 
 */
public class ArrayEx5 {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("입력받을 숫자의 갯수를 입력하세요 : ");
			int count = sc.nextInt();
			int[] numbers = new int[count];
			int sum = 0;
			
			System.out.print(count+"개의 정수를 입력하세요 : ");
			
			for (int i = 0; i < count; i++) {
				numbers[i] = sc.nextInt();
				sum +=numbers[i];
			}
			double average = (double) sum/count;
			System.out.println("입력한 정수의 합계 : " +sum);
			System.out.println("입력한 정수의 평균 : " +average);
	}	
}




