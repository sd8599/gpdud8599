package highgighhome;

class TV{
	private int size;

	public TV(int size) {
//		super();
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
}
public class ColorTV extends TV{
	private int color;

public ColorTV(int size, int color) {
	super(size);
	this.color = color;
}

private void printProperty() {
	System.out.println(getSize()+"인치"+color+"컬러");
}

public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}
}
/*클래스 생성 => get,set생성 => 출력 
 * 상속도 똑같이 클래스 선언해주고 생성자 생성하기 */