package question0524;

interface Shape{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() { //디폴트 메소드
		System.out.println("--- 다시 그립니다.");
		draw();
	}
}
class Circle1 implements Shape{
		private int radius; //반지름 radius 필드
		
		public Circle1(int radius) {
			this.radius = radius;
		}
		@Override
		public void draw() {
		System.out.println("반지름이 "+radius+"인 원입니다."); //오버라이딩(동적바인딩)
		}
		@Override
		public double getArea() { //면적 구하기
		return PI*radius*radius;
		}
}
public class Shapes {
	public static void main(String[] args) {
		Shape donut = new Circle1(10); //객체생성, upcasting
		donut.redraw();
		System.out.println("면적은 "+ donut.getArea());
	}
}
