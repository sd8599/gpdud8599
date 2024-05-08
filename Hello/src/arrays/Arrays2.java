package arrays;

import java.util.Arrays;

//배열 복사하기
public class Arrays2 {
		public static void main(String[] args) {
			
			int[] original = {4,2,9,7,10,3};
			int[] destination = {0,1,2,3,4,5,6,7,8,9};
		
//										배열명 , 2부터시작해서 3까지 복사
			System.arraycopy(original, 2, destination, 4, 3);
			System.out.println(Arrays.toString(original)); //original 배열 출력
			System.out.println(Arrays.toString(destination)); //destination 배열 출력
		}
}
//출력
//[4, 2, 9, 7, 10, 3]
//[0, 1, 2, 3, 9, 7, 10, 7, 8, 9]
