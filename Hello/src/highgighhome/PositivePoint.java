package highgighhome;

class PointFour{
	private int x,y;

	public PointFour(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class PositivePoint extends PointFour{
	
	
	public PositivePoint() {
		super(0,0); //기본생성자는 (0,0)으로 초기화
	}
	public PositivePoint(int x, int y) {
		super(0, 0);
		move(x, y);
	}
	@Override
	protected void move(int x, int y) {
	if (x>=0&&y>=0) {
		super.move(x, y);		
	}
	}
	@Override
	public String toString() {
		return "("+getX()+","+getY()+")의 점";
	}
	

	public static void main(String[] args) {
	
		PositivePoint p = new PositivePoint();
		p.move(10,10);
		System.out.println(p.toString()+"입니다.");

		p.move(-5,5); //객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p.toString()+"입니다.");
		
		 PositivePoint p2 = new PositivePoint(-10,-10);
		System.out.println(p2.toString()+"입니다.");
	}
}
//출력
//(10,10)의 점입니다.
//(10,10)의 점입니다.
//(0,0)의 점입니다.
