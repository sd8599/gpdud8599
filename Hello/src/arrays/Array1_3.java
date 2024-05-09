package arrays;

public class Array1_3 {
	public static void main(String[] args) {
		
		int[] student; //배열 변수 선언
		student = new int[5];
		
//		System.out.println(student.length); : 배열의 길이
//		System.out.println(student); //[I@1ee0005출력 : 메모리 주소, 참조값
		
		//변수 값 대입
		student[0] = 90;
		student[1] = 80;
		student[2] = 70;
		student[3] = 60;
		student[4] = 50;
								
									//배열의 길이		
		for (int i = 0; i < student.length; i++) {
			System.out.println("학생"+ (i+1) + "점수 : "+student[i]);			
		}
	}
}
