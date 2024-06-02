package heighhome;

import java.util.Scanner;

public class RandomArray2 {
	public static boolean randnumber(int[]a, int to, int b) {
		for (int i = 0; i < to; i++) {
			if (a[i]==b) {
				return true;
			}
		}
				return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int num = sc.nextInt();
		int rnumber[] = new int[num];
		int count = 0;
		
		for (int i = 0; i < num; i++) {
			int rnum = (int)(Math.random()*100+1);
			if (randnumber(rnumber,i,rnum)) {
				i--; //중복된 숫자가 있으면 다시 시도
				continue;
			}rnumber[i] = rnum;
			System.out.print(rnumber[i]+" ");
			count++;
			if (count%10==0) {
				System.out.println();
			}
		}
		sc.close();
	}
}
