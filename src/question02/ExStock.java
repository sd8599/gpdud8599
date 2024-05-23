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

//코스피지수와환율을입력받아환율이1150이상인경우는
//코스피가2200 이상이면상승장, 2199~2000이면 횡보장을 출력한다.
//환율이1150미만인 경우는
//코스피가2300 이상이면상승장, 2299~2000이면 횡보장을 출력한다. 
//단코스피지수가2000 미만이면하락장을출력한다.
// *.출력
//코스피지수를입력하세요(1800~2500): 2300
//환율을입력하세요(1100~1200): 1149
//상승장
//코스피지수를입력하세요(1800~2500): 2299
//환율을입력하세요(1100~1200): 1149
//횡보장
//코스피지수를입력하세요(1800~2500): 2299
//환율을입력하세요(1100~1200): 1150
//상승장
//코스피지수를입력하세요(1800~2500): 1999
//환율을입력하세요(1100~1200): 1100
//하락장







