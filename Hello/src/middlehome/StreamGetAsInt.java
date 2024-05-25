package middlehome;

import java.util.Arrays;

public class StreamGetAsInt {
	public static void main(String[] args) {
		
		int[] arr = {3, 2, 1, 5, 6, 4};
		//가장 작은 값 찾기
		int secondMinValue = Arrays.stream(arr).sorted().toArray()[1];
		System.out.println(secondMinValue);
		
		//두번째로 작은 값 찾기
        int secondMin = Arrays.stream(arr).min().getAsInt();
        int second = Arrays.stream(arr).max().getAsInt(); // 가장 큰 max값으로 설정 후 판단

        for (int i = 0; i <= arr.length - 1; i++)
        {
            if (arr[i] > secondMin && arr[i] <= second)
            {
                second = arr[i];
            }
        }
        System.out.println("두번째 작은 수 : " + second);
	}
}


//최소값 찾기
//int min = Arrays.stream(arr).min().getAsInt();
//스트림을 사용하여 배열의 최솟값을 찾습니다.
//두 번째 최소값 찾기:
//int secondMin = Arrays.stream(arr).filter(x -> x != min).min().getAsInt();
//최솟값을 제외한 요소들 중에서 다시 최솟값을 찾습니다. 
//이를 통해 두 번째로 작은 값을 찾을 수 있습니다.
//이 방법은 스트림을 사용하여 간결하게 두 번째로 작은 값을 찾는 예제입니다.
//배열을 정렬하거나 별도의 루프를 사용하지 않기 때문에 코드가 더 간결하고 읽기 쉬워집니다.
