package chapter08_0517;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[] args) {
	// ArrayList 클래스 타입으로 ArrayList 클래스로 객체 생성(제네릭 타입파라미터를 String)
		ArrayList<String> array = new ArrayList<>();
		boolean aaa = array.add("oracle");
		System.out.println(aaa);
		boolean bbb = array.add("mysql");
		System.out.println(bbb);
		boolean ccc = array.add("mysql"); //중복된 객체를 추가해도 문제 없음
		System.out.println(ccc);
		
		for (int i = 0; i < array.size(); i++) {
			String str = array.get(i);
			System.out.println(i+": "+str);
		}
	}
}
