package middleheight;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		//ArrayList생성
		ArrayList<String> list = new ArrayList<>();
		
		//요소 추가
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		
		//요소에 접근
		System.out.println("첫 번째 요소 : "+list.get(0));
		
		//요소 순회
		for (String fruit : list) {
			System.out.println(fruit);
		}
	}
}
