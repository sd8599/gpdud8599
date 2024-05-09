package arrays;

public class Array1_2 {
	public static void main(String[] args) {
		
		int[] student; //배열 변수 선언
		student = new int[5];
		
		System.out.println(student); //[I@1ee0005출력 : 메모리 주소, 참조값
		
		//변수 값 대입
		student[0] = 90;
		student[1] = 80;
		student[2] = 70;
		student[3] = 60;
		student[4] = 50;
		
		System.out.println("학생1 점수 : "+student[0]);
		System.out.println("학생2 점수 : "+student[1]);
		System.out.println("학생3 점수 : "+student[2]);
		System.out.println("학생4 점수 : "+student[3]);
		System.out.println("학생5 점수 : "+student[4]);
	}
}
