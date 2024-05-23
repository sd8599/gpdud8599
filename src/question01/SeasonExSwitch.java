package question01;

import java.util.Scanner;

public class SeasonExSwitch {
	public static void main(String[] args) {
		
		System.out.println("달을 입력하세요(1월~12월) ");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String month;
		
		switch (a) {
		case 3,4,5 : {
			month = "봄";
			break;
		}
		case 6,7,8 : {
			month = "여름";
			break;
		}
		case 9,10,11 : {
			month = "가을";
			break;
		}
		case 1,2,12 : {
			month = "겨울";
			break;
		}
		default:
			month = "잘못입력했습니다.";
			break;
		}
		System.out.println(month);
		sc.close();
	}
}
