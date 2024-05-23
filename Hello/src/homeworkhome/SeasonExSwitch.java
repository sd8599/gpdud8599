package homeworkhome;

import java.util.Scanner;

public class SeasonExSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		int month = sc.nextInt();
		
		switch (month) {
		case 3,4,5:
			System.out.println("입력하신 계절은 봄 입니다.");
			break;
		case 6,7,8:
			System.out.println("입력하신 계절은 여름 입니다.");
		break;
		case 9,10,11:
			System.out.println("입력하신 계절은 가을 입니다.");
		break;
		case 12,1,2:
			System.out.println("입력하신 계절은 겨울 입니다.");
		break;
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		}
	}
}
