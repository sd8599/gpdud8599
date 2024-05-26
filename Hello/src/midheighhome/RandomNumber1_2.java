package midheighhome;

import java.util.HashSet;
import java.util.Set;

public class RandomNumber1_2 {
	public static void main(String[] args) {
		int rNumber;
																	//<> : 안에 써도 되고 안 써도 됨
		Set<Integer> uniqueNumbers = new HashSet<Integer>();
		while (uniqueNumbers.size()<10) {
			rNumber = (int)(Math.random()*10)+1;
			uniqueNumbers.add(rNumber);
			System.out.println(rNumber+" ");
			if (rNumber==7) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}				
		}
	}
}
//중복을 없앰, HashSet사용
//HashSet은 Set인터페이스를 구현한 클래스
//Set 인터페이스는 중복을 허용하지 않는 데이터 구조를 정의
//HashSet은 내부적으로 HashMap인스턴스를 사용하여 데이터를 저장
//HashSet의 특징
//중복허용X 순서보장X null허용(하나만) 
//해시테이블기반(HashMap데이터저장) 빠른접근속도
//HashSet 사용예시
//중복제거(고유값만 저장하고 싶을 때)
//집합 연산 : 교집합, 합집합, 차집합 등의 연산을 수행할 때
//데이터 중복확인 : 데이터의 고유성을 확인해야 할 때
