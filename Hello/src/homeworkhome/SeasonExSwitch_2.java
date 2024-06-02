package homeworkhome;

import java.util.Scanner;

public class SeasonExSwitch_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		int month = sc.nextInt();
		String season = "";
		
		switch (month) {
		case 3,4,5:
			season = "입력하신 계절은 봄입니다.";
			break;
		case 6,7,8:
			season = "입력하신 계절은 여름입니다.";
		break;
		case 9,10,11:
			season = "입력하신 계절은 가을입니다.";
		break;
		case 12,1,2:
			season = "입력하신 계절은 겨울입니다.";
		break;

		default:
			season = "잘못입력하셨습니다.";
			break;
		}
		System.out.println(season);
	}
}
