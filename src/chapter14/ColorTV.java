package chapter14;

class TV{
	private static int size;

	public TV(int size) {
		this.size = size;
	}
	protected static int getSize() {
		return size;
	}
}

public class ColorTV extends TV{
	
	private int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	private void printproperty() {
	System.out.println(getSize()+"인치"+color+"컬러");	
		
	}
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printproperty();
		
	}
}
//32인치1024컬러