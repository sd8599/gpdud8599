package homeworkhome;

import java.util.Scanner;

public class SeasonExIf_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		int month = sc.nextInt();
		String season = ""; 
		
		if (3<=month&&month<=5) {
			season = "봄";
			System.out.println("입력하신 계절은 "+season+"입니다.");
		} else if(6<=month&&month<=8){
			season = "여름";
			System.out.println("입력하신 계절은 "+season+"입니다.");
		} else if(9<=month&&month<=11){
			season = "가을";
			System.out.println("입력하신 계절은 "+season+"입니다.");
		} else if(month==1||month==2||month==12){
			season = "겨울";
			System.out.println("입력하신 계절은 "+season+"입니다.");
		}
		else {
			System.out.println("잘못입력하셨습니다.");
		}
		sc.close();
	}
}
