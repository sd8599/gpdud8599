package question0503;
/*
 * 배열 리턴2(메소드 이용)
 * 일차원 배열 생성(정수1~10)
 * 배열리턴->배열원소+100->출력
 */
public class ReturnArray2 {
	public static int[] makeArray() {
		int temp[] = new int[10];
	
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i+1;
		}
		return temp;
	}
	public static void main(String[] args) {
		int intAray[];
		intAray = makeArray();
		
		for (int i = 0; i < intAray.length; i++) {
			System.out.print(intAray[i]+100+" ");
		}
	}
	}