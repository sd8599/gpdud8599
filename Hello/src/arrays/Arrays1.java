package arrays;

import java.util.Arrays;
//외부클래스를 가져오기 때문에 import를 써야한다.
public class Arrays1 {
		public static void main(String[] args) {
			
			int[] score = {90,88,95,82,75,100,85};
//										(클래스.메소드(배열이름))
			System.out.println(Arrays.toString(score));
		}
}
//[90, 88, 95, 82, 75, 100, 85]
//대괄호까지 해서 배열을 출력