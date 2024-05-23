package arrays;

public class ArrayAverage {
	public static void main(String[] args) {
		
		int sum = 0;
		double average = 0;
		
		int[] score = {100,88,100,100,90};

		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
		}System.out.println("총점 : "+sum);
		
		average = sum/(double)score.length;
		System.out.println("평균 : "+average);
	}
	
}
//총점 : 478
//평균 : 95.6
