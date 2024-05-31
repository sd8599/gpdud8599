package heigh;

public class MyPoint {
	private int p;
	private int q;
	

	public MyPoint(int p, int q) {
//		super();
		this.p = p;
		this.q = q;
	}

	@Override
	public String toString() {
		return "point (" + p + "," + q + ")";
	}


	public static void main(String[] args) {
		MyPoint p = new MyPoint(3,50);
		MyPoint q = new MyPoint(4,50);
		System.out.println(p);
		if (p.equals(q)) {System.out.println("같은 점");}
		else {System.out.println("다른 점");}
	}
}
