package question0502;

import java.util.Scanner;

public class Arraylength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5개의 정수를 입력하세요>>");
		
		int[] number = new int[5];
		int avel = 0;
		
		for (int i = 0; i < number.length; i++) {
			 number[i] = sc.nextInt();
			avel += number[i];
		}
		System.out.println("평균은 "+(double)avel/5);
	}
}
//중급C 4 : 배열원소의평균구하기(ArrayLength)
//1
//배열의length 필드를 이용하여배열크기만큼정
//수를입력받고평균을구하는프로그램을작성
//하라.
//5개의 정수를입력하세요>> 2 3 4 5 9
//평균은4.6