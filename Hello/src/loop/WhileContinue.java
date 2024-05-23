package loop;

import java.util.Scanner;

public class WhileContinue {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("(1) square");
		System.out.println("(2) square root");
		System.out.println("(3) square log");
		
		while (true) {
			System.out.print("원하는 메뉴를 선택하세요(0을 누르면 종료)>>");
			int a = sc.nextInt();
			
			if (a==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if (!(1<=a&&a<=3)) {
				System.out.println("숫자를 잘못 입력하셨습니다.");
				continue;
			}
			System.out.println("선택하신 메뉴는 "+a+"번입니다.");
		}
	}
}
/*(1) square
(2) square root
(3) square log
원하는 메뉴를 선택하세요(0을 누르면 종료)>>1
선택하신 메뉴는 1번입니다.
원하는 메뉴를 선택하세요(0을 누르면 종료)>>0
프로그램을 종료합니다.
*/