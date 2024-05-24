package question0524;


interface Shape1{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() { //디폴트 메소드
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}
class Circle4 implements Shape1{
		private int radius; //반지름 radius 필드
		
		public Circle4(int radius) {
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
class Oval implements Shape1{
	private int width, height;

	public Oval(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public void draw() {
		System.out.println(width+" x " +height+" 에 내접하는 타원입니다.");
	}
	@Override
	public double getArea() {
		return PI*0.5*width*0.5*height;
	}}
class Rect implements Shape1{
	private int width, height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public void draw() {
		System.out.println(width+" x "+height+" 크기의 사각형입니다.");
	}
	@Override
	public double getArea() {
		return width*height;
	}
}
public class Shapes2 {
	public static void main(String[] args) {
		Shape1[] list = new Shape1[3];
		
		list[0] = new Circle4(10); //반지름이 10인 원 객체
		list[1] = new Oval(20,30);
		list[2] = new Rect(10,40);
		
		for (int i = 0; i < list.length; i++) {
			list[i].redraw();}
			for (int i = 0; i < list.length; i++) {
				System.out.println("면적은 "+list[i].getArea());
		}
	}
}
