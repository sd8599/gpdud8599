package question0503;

import java.util.Scanner;

public class PrintAlphabet {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("소문자 알파벳 하나를 입력하시오>> ");
	char c = sc.next().charAt(0);
	/*String s = sc.next();
	 * char c = s.charAt(0);
	 * 이렇게도 가능, 바로 캐릭터로 받는 scanner가 없음
	 */
	
	for (char i = c; i >='a'; i--) {
		for (char j ='a'; j <= i; j++) {
			//입력받은 알파벳부터 하나씩 이전 알파벳으로 반복 출력
			System.out.print(j);
		}
			System.out.println();
		}sc.close();
	}
}


//
//중상급2 2중 중첩반복문2 (PrintAlphabet)
//1
// Scanner 를 이용하여 소문자 알파벳 하나 입력받고다음
//과같이출력하는프로그램을작성하라.
// 다음은e를입력받았을경우이다.
// *.출력
// 소문자알파벳하나를입력하시오>>e
// abcde
// abcd
// abc
// ab
// a

//char c = s.charAt(0);