package question0524;

class PointThree{
	private int x,y;

	public PointThree(int x, int y) {this.x = x; this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x = x; this.y = y;}}

public class Point3D extends PointThree{
		private int z;
		
	public int getZ() {return z;}
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	public void moveUp() {z++;} 
	public void moveDown() {z--;} 
	public void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	} 
	
	@Override
	public String toString() {
	return "("+getX()+","+getY()+","+getZ()+")의 점";
	}
	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString()+"입니다.");
		
		p.moveUp();
		System.out.println(p.toString()+"입니다.");
		
		p.moveDown();
		p.move(10,10);
		System.out.println(p.toString()+"입니다.");
	
		p.move(100, 200, 300);
		System.out.println(p.toString()+"입니다.");
		
	}
}
//(1,2,3)의 점입니다.
//(1,2,4)의 점입니다.
//(10,10,3)의 점입니다.
//(100,200,300)의 점입니다.
