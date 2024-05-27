package middleheight;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String str = "홍길동/장화/홍련/콩쥐/팥쥐";
			String[] tokens = str.split("/");
			
			for (String string : tokens) {
				System.out.println(string);
			}
	}
}
