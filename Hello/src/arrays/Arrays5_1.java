package arrays;

import java.util.Iterator;

public class Arrays5_1 {
	public static void main(String[] args) {
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = {100,95,80,70,60};
		int[] chArr = {'a','b','c','d'};
		
		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i+1; //1~10의 숫자를 순서대로 배열
		System.out.print(iArr1[i]+" ");
		}System.out.println();
		
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10)+1;	
			System.out.print(iArr2[i]+" ");
		}System.out.println();
		
		//배열에 저장된 값들을 출력한다.
		for (int i = 0; i < iArr1.length; i++) {
			if (i<iArr1.length-1) {
				System.out.print(iArr1[i]+",");				
			}else {
				System.out.print(iArr1[i]);				
			}
		}
	}
}
