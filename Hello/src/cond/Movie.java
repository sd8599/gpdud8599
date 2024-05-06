package cond;
/*"평점에 따른 영화 추천하기"
 * 요청한 평점 이상의 영화를 찾아서 추천하는 프로그램을 작성하자.
 * 어바웃타임 - 평점9점
 * 토이 스토리 - 평점8점
 * 고질라 - 평점7점
 * 평점 변수는 double rating 을 사용하세요.
 */
public class Movie {
		public static void main(String[] args) {
			
			double rating = 7.1;
			String a = "어바웃타임";
			String b = "토이스토리";
			String c = "고질라";
			
			if (rating<=9) {
				System.out.println("'"+a+"'"+"을 추천합니다.");
			}
			if (rating<=8) {
				System.out.println("'"+b+"'"+"을 추천합니다.");
			}
			if (rating<=7) {
				System.out.println("'"+c+"'"+"을 추천합니다.");
			}
		}
}
