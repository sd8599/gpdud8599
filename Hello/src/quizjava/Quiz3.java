package quizjava;
/* 개인 정보 중 일부를 비공개로 전환하는 프로그램을 작성하시오.
 * 조건
 * 개인정보를 비공개로 전환하는 메소드 작성
 * 하나의 메소드에서 모든 동작 처리
 * 각 정보는 아래 위치부터 비공개 적용
 * 이름 : 2번째 글자(나/코딩)
 * 주민등록번호 : 9번째 글자 (990130-1/234567)
 * 전화번호 : 10번째 글자(010-1234-/5678)
 * 힌트
 * substring() 을 이용하면 문자열의 일부를 자를 수 있음
 * length() 를 이용하면 문자열의 길이를 알 수 있음
 */
public class Quiz3 {
	
	public static String getHiddenData(String data, int index) {
		String hiddenData = data.substring(0,index);
		
		for (int i = 0; i < data.length() - index; i++) {
			hiddenData += "*";
			}
				return hiddenData;
		}
	
	
		public static void main(String[] args) {
				String name = "나코딩"; //이름
				String id = "990130-1234567";
				String phone = "010-1234-5678";
				
				System.out.println("이름 : "+getHiddenData(name,1)); // 개인정보, 비공개 시작 위치
				System.out.println("주민등록번호 : "+getHiddenData(id,8)); // 개인정보, 비공개 시작 위치
				System.out.println("전화번호 : "+getHiddenData(phone,9)); // 개인정보, 비공개 시작 위치
		}
}
