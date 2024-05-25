package middlehome;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMin1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("양수 7개를 입력하세요.");
		int number[] = new int[7];
		
		for (int i = 0; i < 7; i++) {
			number[i] = sc.nextInt();
		}
		//배열의 최솟값 찾기
		//Arrays.stream() 을 사용하여 배열을 스트림으로 변환
		//min() 메소드를 호출하여 최솟값을 찾음
		//getAsInt() 를 통해 OptionallInt 실제 int값을 추출
		int min = Arrays.stream(number).min().getAsInt();
		
		System.out.println("가장 작은 수는 "+min+"입니다.");
		sc.close();
			}
		}

//양수 7개를 입력하세요.5 4 2 7 8 9 10
//가장 작은 수는 2입니다.

