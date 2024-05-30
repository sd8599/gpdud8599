package heigh;

import java.util.Scanner;

class Add{
	 int a;
	 int b;
	 void setValuse(int a, int b){}	 
	 public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	int calculate();
	}
	class Sub{
		int a;
		int b;
		void setValuse(int a, int b){}
		public void setA(int a) {
			this.a = a;
		}
		public void setB(int b) {
			this.b = b;
		}
		int calculate();
		
	}
	class Mul{
		int a;
		int b;
		void setValuse(int a, int b){}
		
		public void setA(int a) {
			this.a = a;
		}

		public void setB(int b) {
			this.b = b;
		}

		int calculate();
		
	}
	class Div{
		int a;
		int b;
		void setValuse(int a, int b){}
		public void setA(int a) {
			this.a = a;
		}
		public void setB(int b) {
			this.b = b;
		}
		int calculate();
		
	}

public class Calc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String calc = sc.next();
		
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		
		
	}
}











