package middlehome;

import java.util.Scanner;

public class ExStock_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kospi = 0;
		int rate = 0;
		
		for (int i = 0; i < 10; i++) {
			
		System.out.print("코스피 지수를 입력하세요(1800~2500) : ");
		kospi = sc.nextInt();
		System.out.print("환율을 입력하세요(1100~1200) : ");
		rate = sc.nextInt();
		
		if (rate>=1150) {
			if (kospi>=2200) {
				System.out.println("상승장");
			}else if (2000<=kospi&&kospi<=2199) {
				System.out.println("횡보장");
			}else {
				System.out.println("하락장");
			}
		} else{
			if (kospi>=2300) {
				System.out.println("상승장");
			}else if (2000<=kospi&&kospi<=2299) {
				System.out.println("횡보장");
			}else {
				System.out.println("하락장");
				}
			}
		}
		sc.close();
	}
}
