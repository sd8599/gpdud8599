package chapter03;
/*
 * 문자열에서 r알파벳 갯수 구하기
 * 알파벳 대/소문자 상관없음
 * toCharArray()메소드 이용
 */
public class Ex_8 {
	public static void main(String[] args) {
		int count = 0;
		String str = "Programming is fun! Right?";
//		toCharArray() : 문자열에서 문자 하나씩 가지고 옴(P에서 ?까지)
		//charArr : 래퍼런스 , 참조변수
		char[] charArr = str.toCharArray();
		
		//"Programming is fun! Right?" : 문자열 크기 만큼 반복
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i]=='R'||charArr[i]=='r') {
				count++;				
			}
		}
		System.out.println("=> R(r)의 갯수 : "+count);
	}
}
