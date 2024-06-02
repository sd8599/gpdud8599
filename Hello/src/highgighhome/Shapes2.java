package highgighhome;

interface Shape1{
	final double PI = 3.14;
	void draw(); //도형을 그리는 추상 메소드
	double getArea(); //도형의 면적을 리턴하는 추상메소드
	default public void redraw() { //디폴트 메소드
		System.out.print(" --- 다시 그립니다. ");
		draw();
	}
}
//implements : 인터페이스 구현을 도와줌
class Circle3 implements Shape1{
	int r;
	public Circle3(int r) {
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
class Oval implements Shape1{
	int r,n;
	public Oval(int r, int n) {
		super();
		this.r = r;
		this.n = n;
	}
	@Override
	public void draw() {
	System.out.println(r+"x"+n+"에 내접하는 타원 입니다.");	
	}
	@Override
	public double getArea() {
		return PI*0.5*r*0.5*n;
	}
}
class Rect implements Shape1{
	int r,n;
	public Rect(int r, int n) {
		super();
		this.r = r;
		this.n = n;
	}
	@Override
	public void draw() {
		System.out.println(r+"x"+n+" 크기의 사각형 입니다.");	
	}
	@Override
	public double getArea() {
		return r*n;
	}
}

public class Shapes2 {
	public static void main(String[] args) {
		//Shape 인터페이스 타입인 레퍼런스 배열
		Shape1[] list = new Shape1[3];
		list[0] = new Circle3(10);//반지름이 10인 원 객체
		list[1] = new Oval(20,30);// 20x30 사각형에 내접하는 타원
		list[2] = new Rect(10,40);//10x40 크기의 사각형
		
		for (int i = 0; i < list.length; i++) {
			list[i].redraw();;
		}
		for (int i = 0; i < list.length; i++) {
			System.out.println("면적은 "+list[i].getArea());
		}
	}
}
