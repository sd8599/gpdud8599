package chapter13;

public class MyPoint {
	private int i,j;
	public MyPoint(int i, int j) {
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "Point("+i+","+j+")";
	}

	public static void main(String[] args) {
		
		MyPoint p = new MyPoint(3,50);
		MyPoint q = new MyPoint(4,50);
		
		System.out.println(p);
		
		if (p.equals(q)) {
			System.out.println("같은 점");
		} else {
			System.out.println("다른점");
		}
	}
}
