package middleheight;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx1_2 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			String name = sc.next();
			list.add(name);
		}
		for (String name : list) {
			System.out.print(name+" ");
		}System.out.println();
		
		String longestName = list.get(0);
		
		for (String name : list) {
			if (name.length()>longestName.length()) {
				longestName = name;
			}
		}
		
		System.out.println("가장 긴 이름은 : "+longestName);
		sc.close();
	}
}
