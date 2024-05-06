package github;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("양수 5개를 입력하세요.");
			
			int[] number = new int[5];
			int max = 0;
			
			for (int i = 0; i < number.length; i++) {
				number[i] = sc.nextInt();
			}for (int i= 0; i < number.length; i++) {
					if (number[i]>max) {
						max = number[i];
					}
				}
				System.out.println("가장 큰 수는 "+max+"입니다.");
				sc.close();	
	}   	
}
