package middlehome;

import java.util.Scanner;

public class ExStock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("코스피 지수를 입력하세요(1800~2500) : ");
		int stock = sc.nextInt();
		System.out.print("환율을 입력하세요(1100~1200) : ");
		int rate = sc.nextInt();
		
		if (rate>=1150) {
			if (stock>=2200) {
				System.out.println("상승장");
			} else if (2000<=stock&&stock<=2199){
				System.out.println("횡보장");
			}else{System.out.println("하락장");}
		} 
		else if(rate<1150){
			if (stock>=2300) {
				System.out.println("상승장");
			} else if(2000<=stock&&stock<=2299){
				System.out.println("횡보장");
			}else{System.out.println("하락장");}
		}
	}
}
