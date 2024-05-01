package question02;

import java.util.Scanner;

public class ExStock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("코스피 지수를 입력하세요(1800~2500) : ");
		int Ex = sc.nextInt();
		System.out.print("환율을 입력하세요(1100~1200) : ");
		int stock = sc.nextInt();
//		kospi, rate
		
		if (stock>=1150) {
			if (Ex>=2200) {
				System.out.println("상승장");
			}else if(Ex<=2199 && Ex>=2000) {
				System.out.println("횡보장");
			}else  {
				System.out.println("하락장");
			}
			}
		
		else if(stock<1150) {
			if (Ex>=2300) {
				System.out.println("상승장");
			}else if(Ex<=2299 && Ex>=2000) {
				System.out.println("횡보장");
			}else {
				System.out.println("하락장");
			} 
			}
			sc.close();
	}
}
