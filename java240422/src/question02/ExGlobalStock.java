package question02;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		
		int a; //매수
		int b; //매도
		double c; //양도세
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("매수금액을 입력하세요 : ");
		a = sc.nextInt();
		System.out.print("매도금액을 입력하세요 : ");
		b = sc.nextInt();
		c = (b-a)*0.22; 
		
		if (a<b) {
			System.out.println("양도세 = "+c);
		}else if(a>b) {
			System.out.println("양도세 = "+0.0);
			sc.close();
		} 
	}
}
