package loop;

import java.util.Scanner;

//최소한 1번이상 반복, 1번은 꼭 받음
public class Do_While {
	public static void main(String[] args) {
		
		int input = 0, anwser = 0;
		Scanner sc = new Scanner(System.in);
		anwser = (int) (Math.random()*100)+1;
		
		do {
			System.out.print("1과 100 사이의 정수를 입력하세요>> ");
			input = sc.nextInt();
			if (anwser<input) {
				System.out.println(input+"보다 작은 수 입니다.");
			} else if(anwser>input){
				System.out.println(input+"보다 큰 수 입니다.");
			}
		} while (input!=anwser);//!= 반복가능,==일땐 반복X
		System.out.println("정답입니다.");
	}
}
