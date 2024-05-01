package question02;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		
		boolean multiple;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수를 입력하세요 : ");
		int number = sc.nextInt();
		multiple = false;
		
		 if (number%3==0) {
			System.out.println("3의 배수이다.");
			multiple=true;
		}if(number%5==0){
			System.out.println("5의 배수이다.");
			multiple=true;
		}if(number%8==0){
			System.out.println("8의 배수이다.");
			multiple=true;
		}if(multiple==false) {
			System.out.println("어느 배수도 아니다.");
		}
		  sc.close();
	}
}
