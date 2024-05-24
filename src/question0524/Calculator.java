package question0524;

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
	public abstract int calculate ();
}
class Add extends Calc{
	@Override
	public int calculate() {
		return a+b;
	}}
	class Sub extends Calc{
		@Override
		public int calculate() {
			return a-b;
		}}
		class Mu extends Calc{
			@Override
			public int calculate() {
				return a*b;
			}}
			class Di extends Calc{
				@Override
				public int calculate() {
					return a/b;
				}
		}

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char c= sc.next().charAt(0);
		
		Calc exp = null;
		
		switch (c) {
		case '+':
			exp = new Add();
			break;
		case '-':
			exp = new Sub();
			break;
		case '*':
			exp = new Mu();
			break;
		case '/':
			exp = new Di();
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
			sc.close();
			return;
		}
		exp.setValue(a,b);
		if (exp instanceof Di&& b==0) {
			System.out.println("계산할 수 없습니다.");
		} else {
			System.out.println(exp.calculate());
		}
		System.out.println(exp.calculate());
		sc.close();
	}
}

