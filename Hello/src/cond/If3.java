package cond;
//연령에 따라 다른 메세지를 출력하는 프로그램을 작성해야 한다.
//int age 라는 변수를 사용해야 하며, 연령에 따라 다음을 출력해야 한다.
//7세이하일경우 : "미취학"
//8세이상 13세이하일경우 : "초등학생"
//14세이상16세이하일 경우 : "중학생"
//17세이상 19세이하일 경우 : "고등학생"
//20세 이상일 경우 : "성인"
public class If3 {
	public static void main(String[] args) {
		int age = 14;
		
		if (age<=7) {
			System.out.println("미취학");
		}
		if (age>=8&&age<=13) {
			System.out.println("초등학생");
		}
		if (age<=16&&age>=14) {
			System.out.println("중학생");
		}
		if (age<=19&&age>=17) {
			System.out.println("고등학생");
		}
		if(age>=20){
			System.out.println("성인");
		}
	}
}
