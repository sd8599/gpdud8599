package chapter03;
/*
 * 배열 리턴 (메소드 이용)
 */
public class ReturnArray {
	//makeArray() : 메소드
	//int[] : 반환(리턴) 타입 (리턴을 안하면 오류)
	//int[4]=>리턴타입에 배열크기를 표시하면 오류
//	static int[4] makeArray() {
		static int[] makeArray() {
		//배열생성시 타입이 불일치시 오류
//		int temp[] = new String[4];
		int temp[] = new int[4];
		
		//temp.length : 4
		for (int i = 0; i < temp.length; i++) {
			temp[i]=i; //0 1 2 3 
		}
		//리턴 타입과 반환되는 값을 타입이 일치해야됨
//		return 0;
		//리턴할때[]을 추가하면 오류
//		return temp[];
		return temp; //리턴타입
	}
	
	
	public static void main(String[] args) {
		int intArray[];
		//메소드 호출
		intArray = makeArray();//temp배열받음 0 1 2 3
	
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
	}
}
















