package question0503;

import java.util.Scanner;

public class Arraymin {
	public static void main(String[] args) {

//		int min = 0;
		//2.두번째방법
		int min = Integer.MAX_VALUE; //int 타입의 가장 큰 숫자
				
		Scanner sc = new Scanner(System.in);
		System.out.println("양수 7개를 입력하세요.");
		
		int[] number = new int[7];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
			//1.첫번째 방법
//			첫번째 반복할때 무조건 배열원소를 min에 저장
//			if (i==0) {
//				min = number[i];
//			}
			if (number[i]<min) {
				min = number[i];
			}
		}
		System.out.println("가장 작은수는 "+min+"입니다.");
	}	
}
//
//중급C8 : 배열에 입력받은 수중제일작은수찾기(ArrayMin)
//1
//양수7개를입력받아배열에저장하고,제일작은수를출력하는프로그램을작성하라. 
//양수7개를입력하세요.
//5
//4
//2
//7
//8
//9
//10
//가장작은수는2입니다.

