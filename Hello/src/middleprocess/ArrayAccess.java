package middleprocess;

import java.util.Scanner;

public class ArrayAccess {
	
	private int number[];
	private int maxnum;
	
	public void process() {
		
		maxnum = number[0];
		
		for (int i = 1; i < number.length; i++) {
			if (maxnum < number[i]) {
				maxnum = number[i];
			}
		}
	}
	
	public int[] getNumber() {
		return number;
	}

	public void setNumber(int[] number) {
		this.number = number;
	}

	public int getMaxnum() {
		return maxnum;
	}

	public void setMaxnum(int maxnum) {
		this.maxnum = maxnum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayAccess arrayAccess = new ArrayAccess();
		int number[] = new int[5];
		System.out.println("양수를 입력하세요.");
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		arrayAccess.setNumber(number);
		arrayAccess.process();
		System.out.println("가장 큰 수는 "+arrayAccess.getMaxnum()+"입니다.");
		
		sc.close();
	}
}
