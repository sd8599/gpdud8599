package middleheight;

public class ArrayParmeterEx {
	static void printStringArray(String[] a) {
		
		for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]);
		}System.out.println();
	}
	static void replaceBe(String[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("be")) {
				array[i] = "eat";
			}
		}
	}
	public static void main(String[] args) {
		String[] array = {"to", " ", "be", " ", "or", " ", "not", " ", "to", " ", "be"};
		
		printStringArray(array);
		replaceBe(array);
		printStringArray(array);
	}
}
