package heigh;

import java.util.Scanner;

public class RandomArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			int number[] = new int[num];
			number[i] = (int)(Math.random()*100)+1;

			System.out.print(number[i]+" ");
			if (i==0) {				
			}
			else if (i%10==0) {
				System.out.println();
			}
			
		}
	}
}
