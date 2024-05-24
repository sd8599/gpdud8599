package question0524;

public class IPTV extends ColorTV{
	
	private String iptv;
	
	public IPTV(String iptv, int size, int color) {
		super(size, color);
		this.iptv = iptv;
	}
	protected void printproperty() {
		System.out.println("나의 IPTV는 "+iptv+" 주소의 ");
		super.printproperty();
	}
	
	public static void main(String[] args) {
		 IPTV iptv = new IPTV("192.1.1.2",32,2048);
		 iptv.printproperty();
	}
}
