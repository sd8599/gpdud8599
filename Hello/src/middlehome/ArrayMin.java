package middlehome;

import java.util.Scanner;

public class ArrayMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("양수 7개를 입력하세요.");
		int number[] = new int[7];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		
		int min = number[0];

		for (int i = 1; i < number.length; i++) {
			if(min > number[i]){
				min = number[i];
			}
		}
		System.out.println("가장 작은 수는 "+min+"입니다.");
		sc.close();
	}
}

//양수 7개를 입력하세요.5 4 2 7 8 9 10
//가장 작은 수는 2입니다.

