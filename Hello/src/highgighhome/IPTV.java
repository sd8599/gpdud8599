package highgighhome;

class TV2{
	private int size;

	public TV2(int size) {
//		super();
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
}
 class ColorTV2 extends TV2{
	protected int color;

public ColorTV2(int size, int color) {
	super(size);
	this.color = color;
	}
 }
public class IPTV extends ColorTV2{
	private String iptv;

	public IPTV( String iptv,int size, int color) {
		super(size, color);
		this.iptv = iptv;
	}
	protected void printProperty() {
		System.out.println("나의 IPTV는 "+iptv+" 주소의 "+getSize()+"인치 "+color+"컬러");
	}

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2",32,2048);
		iptv.printProperty();
	}
}









