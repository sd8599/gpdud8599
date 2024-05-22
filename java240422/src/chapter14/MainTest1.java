package chapter14;

import java.util.Arrays;

public class MainTest1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int sumValue = Arrays.stream(arr).sum(); //stream 배열생성.배열요소의 합(sum():최종연산)
		long count = Arrays.stream(arr).count(); //배열요소 몇개가 있는지(count():최종연산)
		
		System.out.println(sumValue);
		System.out.println(count);
	}
}
