package Java0508;

import java.util.Scanner;

/*배열에 입력받은 수 중 최소값+최대값 구하기
 * 양수 10개를 입력 받아 배열에 저장하고, 제일 작은 수와
 * 제일 큰 수를 더한 값을 출력하는 프로그램을 작성하라.
 */
public class ArrayMinMax {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("양수 10개를 입력하세요.");
		
		int number[] = new int[10];

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		//바꿔서 적용
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		
		if (i==0) {
			min = number[i];
		}	
		if (number[i]<min) {
			min = number[i];
			}
		if (number[i]>max) {
			max = number[i];
			}
		}
		System.out.println("가장 작은 수는 "+min+"이고, "
				+ "가장 큰 수는 "+max+"이고, 최소값 + 최대값은 "+(min+max)+"입니다.");
	}
}





