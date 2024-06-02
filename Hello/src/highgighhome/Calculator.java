package highgighhome;

import java.util.Scanner;

abstract class Calc{
	protected int a;
	protected int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}	
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public abstract int Calculate(); 
}
class Add extends Calc{
	@Override
	public int Calculate() {
		return a+b;
	}
}
class Sub extends Calc{
	@Override
	public int Calculate() {
		return a-b;
	}
}
class Mul extends Calc{
	@Override
	public int Calculate() {
		return a*b;
	}
}
class Div extends Calc{
	@Override
	public int Calculate() {
		return a/b;
	}
}

public class Calculator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = sc.nextInt();
		String op = sc.next();
		//char op = sc.next().charAt(0); => 이렇게 형변환도 가능
		int b = sc.nextInt();
		
		Calc exp = null;
		
		switch (op) {
		case "+":
			exp = new Add();
			break;
		case "-":
			exp = new Sub();
			break;
		case "*":
			exp = new Mul();
			break;
		case "/":
			exp = new Div();
			break;

		default:
			System.out.println("잘못된 연산자입니다.");
			sc.close();
			return;
		}
		//instanceof : 동적 바인딩과 함께 'instanceof' 연산자를 사용하여
		//객체 타입을 확인하고, 적절한 로직을 수행할 수 있습니다.
		//구체적인 처리를 할 때 유용함.
//		exp.setValue(a, b);
//		if (exp instanceof Div && b==0) {
//			System.out.println("계산할 수 없습니다.");
//		}else {
//			System.out.println(exp.Calculate());
//		}
		try {
			System.out.println(exp.Calculate());			
		} catch (Exception e) {
			System.out.println("계산할 수 없습니다."+e.getMessage());
		}//위의 식보다 오류 안 뜨고 나옴//by zero 메세지도 같이 나옴
		sc.close();
	}
}

/* 동적바인딩 -> 다형성을 구현하기 위해 사용
 * 부모 클래스의 참조변수가 자식클래스의 인스턴스를 가리킬때
 * 호출된 메서드가 자식클래스에서 재정의(Override) 된 메서드라면
 * 자식 클래스의 메서드가 호출되는 것을 의미합니다.
 */