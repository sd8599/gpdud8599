package homeworkhome;

import java.util.Scanner;

public class SeasonExIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		int month = sc.nextInt();
		
		if (3<=month&&month<=5) {
			System.out.println("입력하신 계절은 봄 입니다.");
		} else if(6<=month&&month<=8) {
			System.out.println("입력하신 계절은 여름 입니다.");
		}else if(9<=month&&month<=11) {
			System.out.println("입력하신 계절은 가을 입니다.");
		}else if(12==month||month==1||month==2) {
			System.out.println("입력하신 계절은 겨울 입니다.");
		}else {
			System.out.println("숫자를 잘못 입력하셨습니다.");			
		}
	}
}
