package homework;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("정수 3개 입력>>");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if (a==b||b==c||c==a) {
				System.out.println("중복되지 않는 숫자를 입력해주세요.");	
				} 
			else if (a>b&&a>c&&b>c) { //a>b>c
				System.out.println("중간 값은 "+b);
			} else if (a>b&&a<c&&b<c){//c>a>b
				System.out.println("중간 값은 "+a);
			}else {
				System.out.println("중간 값은 "+c);
			}
		}
	}
}
