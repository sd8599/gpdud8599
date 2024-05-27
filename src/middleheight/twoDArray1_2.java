package middleheight;

import java.util.HashSet;
import java.util.Set;

public class twoDArray1_2 {
	public static void main(String[] args) {
		int[][] array = new int[4][4];
		
		Set<Integer> number = new HashSet<>();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				int randomNumber;
			do {
				randomNumber = (int)(Math.random()*45)+1;
				 
			}while(number.contains(randomNumber));
			
			array[i][j] = randomNumber;
				number.add(array[i][j]);
				
			System.out.print(array[i][j]+" ");
			}System.out.println();
		}
	}
}
