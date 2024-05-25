package middlehome;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요.");
		int[] number = new int[5];
		
		for (int i = 0; i < 5; i++) {
			int input = sc.nextInt();
			if (input>0) {
				 number[i] = input;
			}else {
				System.out.println("양수를 입력해야 합니다.");
				i--;
			}
			System.out.print(input+"\t");
		}
		//최대값 초기화를 첫 번쨰 양수로 설정
		int max = number[0];
		for (int i = 1; i < number.length; i++) {
			if (number[i]>max) {
				max = number[i];
			}
		}
		System.out.println("\n최대값은 "+max+"입니다.");
		sc.close();
	}
}










