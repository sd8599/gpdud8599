package middle;

import java.util.Scanner;

public class ExStock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("코스피 지수를 입력하세요(1800~2500) : ");
		int stock = sc.nextInt();		
		System.out.print("환율을 입력하세요(1100~1200) : ");
		int rate = sc.nextInt();
		String res = ""; 
		
		
		if (rate>=1150) {
			if (stock>=2200) {
				res = "상승장";
			}else if(2000<=stock&&stock<=2199){
				res = "횡보장";
			}else {
				res = "하락장";
			}
		} 
		else {
			if(stock>=2300) {
			res = "상승장";
			}else if (2000<=stock&&stock<=2299) {
			res = "횡보장";
			}else {
			res = "하락장";
			}
		}
		System.out.println(res);
	}
}
