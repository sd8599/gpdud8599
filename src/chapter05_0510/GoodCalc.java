package chapter05_0510;

abstract class Calculator{ //추상 클래스 선언 (추상 메소드는 없어도 됨)
//	public int add(int a, int b) { return 1; } //메소드
//	public abstract int add(int a, int b) {return 1;} //추상메소드는 구현시 오류
	public abstract int add(int a, int b);//추상 메소드 선언
	public abstract int subtract(int a, int b);//추상 메소드 선언
	public abstract double average(int[] a);//추상 메소드 선언
}

//public abstract class GoodCalc extends Calculator{ //추상클래스는 구현 불필요
	public class GoodCalc extends Calculator{ //추상메소드 오버라이딩해서 구현 안하면 오류
		public static void main(String[] args) {
			GoodCalc c = new GoodCalc(); //추상클래스인 경우에는 객체 생성못함
			System.out.println(c.add(2, 3)); //5
			System.out.println(c.subtract(2, 3));//-1
			System.out.println(c.average(new int[] {2,3,4}));//3.0
			}
	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		double sum =0;
		for (int i = 0; i < a.length; i++) {
			sum+= a[i];
		}
		return sum/a.length;
	}
	
}
