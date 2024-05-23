package question02;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료합니다.");
		
		//무한 반복 : 반복 횟수는 알 수 없음(exit가 나오면 break)
		while (true) {
			System.out.print(">>");
			String i = sc.next();
			//문자열 .equals 사용
			if(i.equals("exit")) {
				break;
			} 
		}	System.out.println("종료합니다...");
		sc.close();
	}
}

//중급B 6 : break 문을 이용하여 while 문 벗어나기(BreakExample)
//1
//"exit"이 입력되면 while 문을 벗어나도록 break 문을 활용하는
//프로그램을작성하라.
//exit을 입력하면 종료합니다.
//>>edit
//>>exit
//종료합니다...