package arrays;

import java.util.Arrays;

//배열 섞기, 로또숫자
public class Array5_4 {
	public static void main(String[] args) {
		
		int[] numArr = new int[7];
		System.out.println(Arrays.toString(numArr));
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random()*45)+1;
				System.out.print(numArr[i]+" ");	
				
				int tmp = numArr[0];
				numArr[0] = numArr[i];
				numArr[i] = tmp;
				
		}System.out.println();
		System.out.println(Arrays.toString(numArr));
	}
}