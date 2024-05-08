package loop;
//중첩 반복문 for,while 모두 가능
public class Nested1 {
		
		public static void main(String[] args) {
			
				for (int i = 0; i < 2; i++) {
					System.out.println("외부 for 시작 i : "+i);
					
					for (int j = 0; j < 3; j++) {
						System.out.println("--> 내부 for "+i+"-"+j);
					}
					
					System.out.println("외부 for 종료 i : "+i);
					System.out.println(); //라인구분을 위해 실행
				}
		}
}
//외부 for 시작 i : 0
//--> 내부 for 0-0
//--> 내부 for 0-1
//--> 내부 for 0-2
//외부 for 종료 i : 0
//
//외부 for 시작 i : 1
//--> 내부 for 1-0
//--> 내부 for 1-1
//--> 내부 for 1-2
//외부 for 종료 i : 1
//
