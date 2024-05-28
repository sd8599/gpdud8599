package heigh;

import java.util.Scanner;

public class RandomArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int num = sc.nextInt();
		
		int number[] = new int[num];

		for (int i = 0; i < number.length; i++) {
			number[i] = (int)(Math.random()*100)+1;
			
				if (i==0) {//처음 출력때는 엔터X 출력
					System.out.print(number[i]+" ");
				}else {
					if (i%10==0) { //10번째 마다 엔터
						System.out.println();
					}
					System.out.print(number[i]+" ");
					}
				}
		sc.close();
			}
		}
//if ((i+1)%10==0) { //10개의 숫자마다 새 줄로 출력
//	System.out.println();
//}
