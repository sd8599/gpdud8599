package Java0508;

//default접근지정자
class Calc{
//	static(클래스)멤버는 객체 생성없이 클래스 이름으로 사용가능
//	public static int abs(int a) {
	//non static(인스턴스)멤버는 객체 생성해야 사용됨
//		public int abs(int a) {
//	private 접근 지정자는 같은 클래스 안에서만 접근가능
//			private int abs(int a) {
//	protected접근지정자는 같은 패키지(chapter04)안 + 다른 패키지(상속)에서만 접근가능
//		protected int abs(int a) {
			protected static int abs(int a) {
		return a>0?a:-a; //삼항연산자&조건연산자, 절대값 반환
	}
			static int max(int a, int b) {
				return a>b?a:b;//둘중에 큰수 반환
			}
			public static int min(int a, int b) {
				return a>b?b:a; //둘중에 작은수 반환
			}
}

//public 접근 지정자(제한자)
public class CalcEx {
		public static void main(String[] args) {
//			static멤버로서 객체 생성없이 접근 가능
			System.out.println(Calc.abs(-5));
			System.out.println(Calc.max(10,8));
			System.out.println(Calc.min(-3,-8));
		}
}






