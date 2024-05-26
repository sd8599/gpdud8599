package midheighhome;

import java.util.Scanner;

public class PrintAlphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String alphabet = sc.next();
		
		//String을 char로 바꾸는 방법, 메서드 사용
		char c = alphabet.charAt(0); 
		
//		사용자가 입력한 알파벳부터 'a'까지 내림차순으로 반복
		for (char i = c; i >= 'a'; i--) {
//			System.out.print(i); => 'e'입력시 e-d-c-b-a 내림차순으로 반복
			
//			'a'부터 현재 외부 반복문의 변수 i까지 오름차순으로 반복
//			각 반복문 내에서 현재 문자j를 출력
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}System.out.println();
		}
	}
}
//소문자 알파벳 하나를 입력하시오>>e
//abcde
//abcd
//abc
//ab
//a


//String => char 변경 문자배열로 얻을 때(변환)
//char[] charArray = str.toCharArray();

//char ch = str.substring(0,0).charAt(0);
//substring 메서드를 사용해서 x번째 문자를 출력