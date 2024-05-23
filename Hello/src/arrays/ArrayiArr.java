package arrays;

import java.util.Arrays;//ctrl shfit o 자동으로 import문 추가

public class ArrayiArr {
	public static void main(String[] args) {
		int[] iArr = {100,95,80,70,60};
		
		for (int i = 0; i < iArr.length; i++) {
			
			System.out.print(iArr[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr));
	}
}
//100 95 80 70 60 
//[100, 95, 80, 70, 60]
