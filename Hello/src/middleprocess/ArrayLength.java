package middleprocess;

import java.util.Scanner;

public class ArrayLength {
	
	private int number[];
	private double sum;
	
	public void process() {
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
		}
			sum = sum/5;
	}
	
	public int[] getNumber() {
		return number;
	}
	public void setNumber(int number[]) {
		this.number = number;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}

	public static void main(String[] args) {
		
		ArrayLength arrayLength = new ArrayLength();
		Scanner sc =  new Scanner(System.in);
		int number[] = new int[5];
		System.out.print("5개의 정수를 입력하세요>>");
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		arrayLength.setNumber(number);
		arrayLength.process();
		
		System.out.println("평균은 "+arrayLength.getSum());
		
		sc.close();
	}
}
