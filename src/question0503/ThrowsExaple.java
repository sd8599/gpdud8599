package question0503;

public class ThrowsExaple {

	public static void main(String[] args) {
		try {
			findClass();
			System.out.println("클래스를 찾음");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 못찾음");
//			e.printStackTrace();
		}
	}
	//throws : 메소드 호출한 곳으로 예외처리를 넘김
		public static void findClass() throws ClassNotFoundException {
//				Class.forName("java.lang.String");
				Class.forName("java.lang.String2");
				/*try {
//				forName : 패키지에 클래스를 찾음
//				Class.forName("java.lang.String");
//				Class.forName("java.lang.String2"); : 못찾음 오류남
				Class.forName("A");
				System.out.println("클래스를 찾음");
			} catch (ClassNotFoundException e) {
				//예외 발생시 출력되는 기본 메시지
				e.printStackTrace();
			}
			*/
		}
}
