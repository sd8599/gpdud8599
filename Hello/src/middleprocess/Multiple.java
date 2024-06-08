package middleprocess;

import java.util.Scanner;

public class Multiple {
	
	private int number;
	private boolean multiple;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean getMultiple() {
		return multiple;
	}
	public void setMultiple(boolean multiple) {
		this.multiple = multiple;
	}
	
	public void process() {
		multiple = false;
		
		 if (number%3==0) {
			multiple = true;
			System.out.println("3의 배수이다.");
		}if (number%5==0) {
			multiple = true;
			System.out.println("5의 배수이다.");
		}if (number%8==0) {
			multiple = true;
			System.out.println("8의 배수이다.");
		}if (!multiple) {
			System.out.println("어느것의 배수도 아니다.");
		}
	}

	public static void main(String[] args) {
		
		Multiple multiple = new Multiple();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 : ");
		multiple.setNumber(sc.nextInt());
		multiple.process();
		
		sc.close();
	}
}






