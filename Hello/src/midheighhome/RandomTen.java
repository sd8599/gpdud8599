package midheighhome;

import java.util.Random;

public class RandomTen {
	public static void main(String[] args) {
		int[] number = new int[10];
		double sum = 0;
		
//		Random random = new Random();
		System.out.print("랜덤한 정수들 : ");
		
		for (int i = 0; i < number.length; i++) {
			number[i] = (int)(Math.random()*10)+1;
			System.out.print(number[i]+" ");
			sum+=number[i];
		}System.out.println();
		System.out.println("평균은 "+sum/10);
	}
}
