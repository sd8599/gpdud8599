package chapter02;

public class AssignmentIncDecOperator {
	public static void main(String[] args) {
		int a=3, b=3, c=3;
		
//		a=a+3;
		a+=3;
//		b=b*3;
		b*=3;
//		나머지(몫:1,나머지:1)
		c%=2;
		
		System.out.println("a="+a+",b="+b+",c="+c);
		
		int d=3; 
//		a=6, d=3
//		a=3,d=4 d를 먼저 a에 넘기고, 1을 증가
//		뒤에 붙은 ++/--는 휘위 연산자임
		a=d++;
		System.out.println("a="+a+",d="+d);
		
//		전위 연산자 : 먼저 1을 증가하고 a에 저장
//		a=5,d=5
		a=++d;
		System.out.println("a="+a+",d="+d);

//		a=5,d=4
		a=d--;
		System.out.println("a="+a+",d="+d);

//		a=3,d=3
		a=--d;
		System.out.println("a="+a+",d="+d);
	}
}










