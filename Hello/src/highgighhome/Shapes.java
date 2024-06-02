package highgighhome;

//interface : 코드의 유연성과 재사용성을 높일 수 있다.
interface Shape{
	final double PI = 3.14;
	void draw(); //도형을 그리는 추상 메소드
	double getArea(); //도형의 면적을 리턴하는 추상메소드
	default public void redraw() { //디폴트 메소드
		System.out.println(" --- 다시 그립니다. ");
		draw();
	}
}
//implements : 인터페이스 구현을 도와줌
class Circle2 implements Shape{
	int r;
	public Circle2(int r) {
//		super();
		this.r = r;
	}
	@Override
	public void draw() {
		System.out.println("반지름이 "+r+"인 원 입니다.");
	}@Override
	public double getArea() {
		return r*r*PI;
	}
}

public class Shapes {
	public static void main(String[] args) {
		Shape donut = new Circle2(10); //반지름이 10인 원 객체
		donut.redraw();
		System.out.println("면적은 "+donut.getArea());
	}
}
