package javarlch;

public class TypeConversion {
	public static void main(String[] args) {
		
		//값을 대입시, 타입 불일치의 문제를 해결하는 방법은 타입을 변환하는 방법이 있다.
//		이러한 타입변환은 자동변환 되기도 하고, 캐스팅을 통해 변환되기도 한다.
		
		int a = 2;
		System.out.println("a = "+a);
		
		double b = 2/3; //0=>0.0으로 변환, int/int=int가 된다
		System.out.println("b = "+b);
		
		int c = (int)1.5; //(int)캐스팅을 이용해서 int 타입으로 출력
		System.out.println("c = "+c); //모든걸 캐스팅할 수 없고 가능한 것만 캐스팅가능
		
		double d = 2.0/3.0;
		System.out.println("d = "+d);
		
		double e = (double)2/3; //연산자 우선순위 캐스팅을 먼저인식, 2.0/3이 된다
		System.out.println("e = "+e);
	}
}
//a = 2
//b = 0.0
//c = 1
//d = 0.6666666666666666
//e = 0.6666666666666666
