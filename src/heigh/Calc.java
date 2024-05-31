package heigh;

import java.util.Scanner;

class Add{
	private int a;
	private int b;
	 void setValuse(int a, int b){	 
		this.a = a;
		this.b = b;
	 }
	public int calculate(){
		return a+b;
	}
	}
	class Sub{
		private int a;
		private int b;
		 void setValuse(int a, int b){	 
				this.a = a;
				this.b = b;
			 }
		 public	int calculate(){
			return a-b;
		}
		
	}
	class Mul{
		private int a;
		private int b;
		 void setValuse(int a, int b){	 
				this.a = a;
				this.b = b;
			 }

		 public	int calculate(){
			return a*b;
		}
		
	}
	class Div{
		private int a;
		private int b;
		 void setValuse(int a, int b){	 
				this.a = a;
				this.b = b;
			 }
		 public int calculate() {
		int res = 0;
		try {
			res = a/b;
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;		
			}
		return res;
		}	
	}

public class Calc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int num1 = sc.nextInt();
		String calc = sc.next();
		int num2 = sc.nextInt();
		
		
		switch (calc) {
		case "+":
			Add add = new Add();
			add.setValuse(num1, num2);
			System.out.println(add.calculate());
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValuse(num1, num2);
			System.out.println(sub.calculate());
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValuse(num1, num2);
			System.out.println(mul.calculate());
			break;
		case "/":
			Div div = new Div();
			div.setValuse(num1, num2);
			System.out.println(div.calculate());
			break;		

		default:
			System.out.println("사칙연산이 아닙니다.");
			break;
		}
		sc.close();
	}
}

