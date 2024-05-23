package chapter08_0517;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class AA{}
public class HashSetExample {
	public static void main(String[] args) {
		//Set 인터페이스 컬렉션 타입으로 HashSet 클래스 객체 생성
		Set<String> set = new HashSet<>(); //upcasting
//		Set<Object> set = new HashSet<>(); //upcasting
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
//		set.add("Java"); //set 컬렉션 중복 객체 추가 불가, 갯수 포함X
		AA a = new AA();
//		set.add(a); //<Object> 타입으로 사용가능
		set.add("iBatis");
		
		int size = set.size();
		System.out.println("총 객체수 : "+size);
		
		//set컬렉션은 iterator 메소드 호출해서 Iterator 인터페이스 타입으로 값을 받음
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) { //iterator 객체값이 있으면
			String element = (String) iterator.next();
			System.out.println("\t"+element);
		}
		set.remove("JDBC"); //객체 삭제
		System.out.println("총 객체수 : "+set.size());
		
		for (String elenemt : set) {
			System.out.println("\t"+elenemt);
		}
		if (set.isEmpty()) {//객체가 하나라도 있는지 확인
			System.out.println("비어 있음");
		} else {
			System.out.println("객체 있음");

		}
		set.clear(); //객체 모두 삭제
		if (set.isEmpty()) {//객체가 하나라도 있는지 확인
			System.out.println("비어 있음");
		} else {
			System.out.println("객체 있음");
			
		}
	}
}











