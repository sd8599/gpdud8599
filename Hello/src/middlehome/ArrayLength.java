package middlehome;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 정수의 갯수를 입력하세요>>");
		int count = sc.nextInt();
		int sum = 0;
		int arrays[] = new int[count];
		
		System.out.print(count+"개의 정수를 입력하세요>>");
		for (int i = 0; i < count; i++) {
			arrays[i] = sc.nextInt();
			sum+=arrays[i];
		}
		System.out.println("입력된 정수의 값은 "+sum+"입니다.");
		sc.close();
	}
}
