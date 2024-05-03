package question0503;

import java.util.Scanner;

public class ArrayTen {
	public static void main(String[] args) {
		
		int val = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("10개의 정수를 입력하세요>>");
		
		int[] number = new int[10];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
			val+=number[i];
		}System.out.println("합계는 "+val);
		sc.close();
	} 
}
//
//중급C9 : 배열 원소의 합계 구하기(ArrayTen)
//1
//배열의length 필드를 이용하여 배열이 10개 크기만큼정수를입력받고
//합계를구하는프로그램을작성하라.
//10개의 정수를입력하세요>>1 2 3 4 5 6 7 8 9 10
//합계는55