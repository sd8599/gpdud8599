package midheighhome;

import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("양수 10개를 입력하세요.");
		
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
		num[i] = sc.nextInt();
//		System.out.println(num); 배열저장한 주소값만 나옴
		}
		
		int max = num[0];
		int min = num[0];
		
		for (int i = 1; i < num.length; i++) {
			if (max<num[i]) {
				max = num[i];
			} else if(min>num[i]){
				min = num[i];
			}
		}System.out.println("가장 큰 수는 "+max+"이고 가장 작은 수는 "+min+"입니다.");
		System.out.println("최대값 + 최소값은 "+(max+min)+"입니다.");
			}
}
