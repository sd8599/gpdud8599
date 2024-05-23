package stringEx0517;

import java.util.StringTokenizer;

// “홍길동/장화/홍련/콩쥐/팥쥐”문자열을‘/’를 구분 문자로 하여 토큰을분리하여각토큰을출력하라.
public class StringTokenizerEx {
	public static void main(String[] args) {
		//st객체는 홍길동/장화/홍련/콩쥐/팥쥐 5개의 토큰을 가진다.
		StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/");
		
		while (st.hasMoreTokens()) { //hasMoreTokens() : 토큰이 있으면 참
			System.out.println(st.nextToken());
		}
	}
}
