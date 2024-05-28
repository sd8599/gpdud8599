package heigh;

import java.util.Scanner;

public class RandomArray2 {
	
	public static boolean exists(int a[], int b, int c) {
		for (int i = 0; i < a.length; i++) {
			if (a[i]== c) {
				return true;
			}
		}
		return false;
	} 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n = sc.nextInt();
		int num[] = new int[n];
		
		for (int i = 0; i < num.length; i++) {
			
			int number = (int)(Math.random()*100)+1;
			if (exists(num, i, number)) {
				i--;
				continue;
			}
			num[i] = number;
			if (i==0) {
				System.out.print(num[i]+" ");
			}else {
				if (i%10==0) {
					System.out.println();
				}
				System.out.print(num[i]+" ");
			}
		}
		sc.close();
	}
}
