package chapter02;

public class ByteExample {
	public static void main(String[] args) {
//		int var1=-129;
//		나타낼수있는 범위 벗어나서 오류
//		byte var1=-129;
		byte var1=-128;
		byte var2=-30;
		byte var3=0;
		byte var4=30;
//		나타낼수있는 범위 벗어나서 오류
//		byte var5=128;
		byte var5=127;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
}
}





