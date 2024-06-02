package heighhome;

class ArrayUtil {
	public static int[] concat(int[] a,int[] b) {
		
		int[] number = new int[a.length+b.length];
		
		//첫번째 배열의 요소를 복사
		for (int i = 0; i < a.length; i++) {
				number[i] = a[i];	
		}
		//두번째 배열의 요소를 복사
		for (int i = 0; i < b.length; i++) {
			number[a.length+i] = b[i];
		}
		return number;
	}
	public static void print(int[] a) {
		//배열을 지정된 형식으로 출력
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]);
		if (i<a.length -1) {
			System.out.print(", ");
			}
		}
		System.out.print("]");
	}
}	
public class StaticEx1_2 {	
	public static void main(String[] args) {
		int[] array1 = {1,5,7,9};
		int[] array2 = {3,6,-1,100,77};
		int[] array3 = ArrayUtil.concat(array1,array2);
		ArrayUtil.print(array3); //array3으로 출력
	}
}
