package scope;
//지역변수, 스코프(범위)
public class Scope1 {
	public static void main(String[] args) {
		 		
			int m = 10; // m 생존시작
			
			if (true) {
				int x = 20; // x 생존시작
				System.out.println("if m = "+m);
				System.out.println("if x = "+x);				
			} //x 생존종료
//			System.out.println("main x = "+x);
			System.out.println("main m = "+m);
	}//m 생존종료
}
//if m = 10
//if x = 20
//main m = 10
