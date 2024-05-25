package middlehome;

import java.util.Arrays;

public class ReturnArray2 {	
	public static void main(String[] args) {
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
			System.out.print(i+1+" ");
			}System.out.println();
			//makeArray 메소드를 호출하여 배열반환
			int[] newArray = makeArray(array);
		System.out.println(Arrays.toString(newArray));
		}
	private static int[] makeArray(int[] inputArray) {
		//입력 배열의 각 요소에 10을 더한 새로운 배열을 생성하여 반환
		int[] resultArray = new int[inputArray.length];
		for (int i = 0; i < inputArray.length; i++) {
			resultArray[i] = inputArray[i]+101;
		}
		return resultArray;
		}
	}

//main 메소드:
//int[] array = new int[10];:
//길이가 10인 정수 배열을 생성합니다.
//for (int i = 0; i < array.length; i++):
//배열을 초기화하고, 각 요소를 출력합니다. 
//여기서 array[i] + 1을 출력하여 1부터 10까지의 숫자를 출력합니다.
//System.out.println();:
//배열 출력 후 줄 바꿈을 위해 사용합니다.
//int[] newArray = makeArray(array);:
//makeArray 메소드를 호출하여 새 배열을 반환받습니다.
//System.out.println(Arrays.toString(newArray));:
//새 배열을 문자열로 변환하여 출력합니다.
//makeArray 메소드:
//
//int[] resultArray = new int[inputArray.length];:
//입력 배열과 같은 길이의 새로운 배열을 생성합니다.
//for (int i = 0; i < inputArray.length; i++):
//입력 배열의 각 요소에 101을 더한 값을 새로운 배열의 해당 위치에 저장합니다.
//return resultArray;:
//새로운 배열을 반환합니다.
//이 코드는 입력 배열의 각 요소에 101을 더한 새로운 배열을 반환하고, 이를 출력하는 작업을 수행합니다. 
//이 방식은 다양한 배열 변환 작업을 쉽게 수행할 수 있는 유용한 방법입니다.
